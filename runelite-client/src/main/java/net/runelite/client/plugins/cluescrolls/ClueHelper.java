package net.runelite.client.plugins.cluescrolls;

import net.runelite.api.*;
import net.runelite.client.plugins.cluescrolls.clues.ClueScroll;
import net.runelite.client.plugins.cluescrolls.clues.NamedObjectClueScroll;
import net.runelite.client.plugins.cluescrolls.clues.NpcClueScroll;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ClueHelper {

    void checkClueNPCs(Client client, ClueScrollConfig config, ClueScrollPlugin clueScrollPlugin,
                       ClueScroll clue, List<NPC> npcsToMark) {
        if (!(clue instanceof NpcClueScroll)) {
            return;
        }

        final NpcClueScroll npcClueScroll = (NpcClueScroll) clue;
        final String[] clueNpcs = npcClueScroll.getNpcs(clueScrollPlugin);
        final Collection<Integer> clueNpcRegions = npcClueScroll.getNpcRegions();

        if (clueNpcs == null || clueNpcs.length == 0) {
            return;
        }

        for (NPC npc : client.getCachedNPCs()) {
            if (npc == null || npc.getName() == null) {
                continue;
            }

            if (!clueNpcRegions.isEmpty() && !clueNpcRegions.contains(npc.getWorldLocation().getRegionID())) {
                continue;
            }

            for (String npcName : clueNpcs) {
                if (!Objects.equals(npc.getName(), npcName)) {
                    continue;
                }

                npcsToMark.add(npc);
            }
        }

        if (!npcsToMark.isEmpty() && config.displayHintArrows()) {
            // Always set hint arrow to first seen NPC
            client.setHintArrow(npcsToMark.get(0));
        }
    }

    /**
     * Scans all of the current plane's loaded tiles for {@link TileObject}s and passes any found objects to
     * {@link ClueScrollPlugin#checkClueNamedObject(ClueScroll, TileObject)} for storing in the cache of discovered
     * named objects.
     *
     * @param clue The active clue scroll
     */
    void checkClueNamedObjects(@Nullable ClueScroll clue, Client client, Set<TileObject> namedObjectsToMark) {
        if (!(clue instanceof NamedObjectClueScroll)) {
            return;
        }

        // Search loaded tiles for objects
        for (final Tile[] tiles : client.getScene().getTiles()[client.getPlane()]) {
            for (final Tile tile : tiles) {
                if (tile == null) {
                    continue;
                }

                for (final GameObject object : tile.getGameObjects()) {
                    if (object == null) {
                        continue;
                    }

                    checkClueNamedObject(clue, object, client, namedObjectsToMark);
                }
            }
        }
    }

    /**
     * Checks passed objects against the active clue's object names and regions. If the clue is a
     * {@link NamedObjectClueScroll} and the object matches its allowable object names and is within its regions, the
     * object will be stored in the cache of discovered named objects.
     *
     * @param clue   The active clue scroll
     * @param object The spawned or scanned object
     */
    void checkClueNamedObject(@Nullable final ClueScroll clue, @Nonnull final TileObject object,
                              Client client, Set<TileObject> namedObjectsToMark) {
        if (!(clue instanceof NamedObjectClueScroll)) {
            return;
        }

        final NamedObjectClueScroll namedObjectClue = (NamedObjectClueScroll) clue;

        final String[] objectNames = namedObjectClue.getObjectNames();
        final int[] regionIds = namedObjectClue.getObjectRegions();

        if (objectNames == null || objectNames.length == 0
            || regionIds != null && !ArrayUtils.contains(regionIds, object.getWorldLocation().getRegionID())) {
            return;
        }

        final ObjectComposition comp = client.getObjectDefinition(object.getId());
        final ObjectComposition impostor = comp.getImpostorIds() != null ? comp.getImpostor() : comp;

        for (final String name : objectNames) {
            if (comp.getName().equals(name) || impostor.getName().equals(name)) {
                namedObjectsToMark.add(object);
            }
        }
    }


}
