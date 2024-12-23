package net.runelite.api.client;

import net.runelite.api.*;
import net.runelite.api.annotations.VisibleForDevtools;
import net.runelite.api.worldmap.WorldMap;

import javax.annotation.Nullable;
import java.awt.*;

public interface GameStateClient {
    /**
     * Gets the current game state.
     *
     * @return the game state
     */
    GameState getGameState();

    /**
     * Sets the current game state
     *
     * @param gameState
     */
    void setGameState(GameState gameState);

    /**
     * Causes the client to shutdown. It is faster than
     * {@link java.applet.Applet#stop()} because it doesn't wait for 4000ms.
     * This will call {@link System#exit} when it is done
     */
    void stopNow();

    /**
     * Gets the current world number of the logged in player.
     *
     * @return the logged in world number
     */
    int getWorld();

    /**
     * Gets the scale of the world (zoom value).
     *
     * @return the world scale
     */
    int getScale();

    /**
     * Gets the logged in player instance.
     *
     * @return the logged in player
     */
    Player getLocalPlayer();

    /**
     * Get the local player's follower, such as a pet
     * @return
     */
    @Nullable
    NPC getFollower();

    /**
     * Gets the current run energy of the logged in player.
     *
     * @return the run energy in units of 1/100th of an percentage
     */
    int getEnergy();

    /**
     * Gets an array of options that can currently be used on other players.
     * <p>
     * For example, if the player is in a PVP area the "Attack" option
     * will become available in the array. Otherwise, it won't be there.
     *
     * @return an array of options
     */
    String[] getPlayerOptions();

    /**
     * Gets an array of whether an option is enabled or not.
     *
     * @return the option priorities
     */
    boolean[] getPlayerOptionsPriorities();

    /**
     * Gets an array of player menu types.
     *
     * @return the player menu types
     */
    int[] getPlayerMenuTypes();

    /**
     * Gets a sprite of the map scene
     *
     * @return the sprite
     */
    IndexedSprite[] getMapScene();

    /**
     * Gets an array of currently drawn mini-map dots.
     *
     * @return all mini-map dots
     */
    SpritePixels[] getMapDots();

    /**
     * Gets the local clients game cycle.
     * <p>
     * Note: This value is incremented every 20ms.
     *
     * @return the game cycle
     */
    int getGameCycle();

    /**
     * Gets an array of current map icon sprites.
     *
     * @return the map icons
     */
    SpritePixels[] getMapIcons();

    /**
     * Gets an array of mod icon sprites.
     *
     * @return the mod icons
     */
    IndexedSprite[] getModIcons();

    /**
     * Replaces the current mod icons with a new array.
     *
     * @param modIcons the new mod icons
     */
    void setModIcons(IndexedSprite[] modIcons);

    /**
     * Gets the music volume
     * @return volume 0-255 inclusive
     */
    int getMusicVolume();

    /**
     * Sets the music volume
     * @param volume 0-255 inclusive
     */
    void setMusicVolume(int volume);

    /**
     * Play a sound effect at the player's current location. This is how UI,
     * and player-generated (e.g. mining, woodcutting) sound effects are
     * normally played.
     *
     * @param id the ID of the sound to play. Any int is allowed, but see
     * {@link SoundEffectID} for some common ones
     */
    void playSoundEffect(int id);

    /**
     * Play a sound effect from some point in the world.
     *
     * @param id the ID of the sound to play. Any int is allowed, but see
     * {@link SoundEffectID} for some common ones
     * @param x the ground coordinate on the x axis
     * @param y the ground coordinate on the y axis
     * @param range the number of tiles away that the sound can be heard
     * from
     */
    void playSoundEffect(int id, int x, int y, int range);

    /**
     * Play a sound effect from some point in the world.
     *
     * @param id the ID of the sound to play. Any int is allowed, but see
     * {@link SoundEffectID} for some common ones
     * @param x the ground coordinate on the x axis
     * @param y the ground coordinate on the y axis
     * @param range the number of tiles away that the sound can be heard
     * from
     * @param delay the amount of frames before the sound starts playing
     */
    void playSoundEffect(int id, int x, int y, int range, int delay);

    /**
     * Plays a sound effect, even if the player's sound effect volume is muted.
     *
     * @param id     the ID of the sound effect - {@link SoundEffectID}
     * @param volume the volume to play the sound effect at, see {@link SoundEffectVolume} for values used
     *               in the settings interface. if the sound effect volume is not muted, uses the set volume
     */
    void playSoundEffect(int id, int volume);

    /**
     * Get the world map
     */
    WorldMap getWorldMap();

    /**
     * Gets the current stretched dimensions of the client.
     *
     * @return the stretched dimensions
     */
    Dimension getStretchedDimensions();

    /**
     * Gets the real dimensions of the client before being stretched.
     *
     * @return the real dimensions
     */
    Dimension getRealDimensions();

    /**
     * Changes the selected world to log in to.
     * <p>
     * Note: this method will have no effect unless {@link GameState}
     * is {@link GameState#LOGIN_SCREEN}.
     *
     * @param world the world to switch to
     */
    void changeWorld(World world);

    /**
     * Creates a new instance of a world.
     */
    World createWorld();

    @VisibleForDevtools
    int[] getBoostedSkillLevels();

    @VisibleForDevtools
    int[] getRealSkillLevels();

    @VisibleForDevtools
    int[] getSkillExperiences();

    /**
     * Gets an array of map region IDs that are currently loaded.
     *
     * @return the map regions
     */
    @Deprecated
    int[] getMapRegions();
}
