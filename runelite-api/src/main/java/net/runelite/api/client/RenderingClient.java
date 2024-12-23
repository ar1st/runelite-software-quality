package net.runelite.api.client;

import net.runelite.api.*;
import net.runelite.api.Point;
import net.runelite.api.annotations.VisibleForDevtools;
import net.runelite.api.worldmap.WorldMap;

import javax.annotation.Nullable;
import java.awt.*;
import java.util.List;

public interface RenderingClient extends GameEngine {
    @Override
    Canvas getCanvas();

    /**
     * Gets the current FPS (frames per second).
     *
     * @return the FPS
     */
    int getFPS();

    /**
     * Gets the x-axis coordinate of the camera.
     * <p>
     * This value is a local coordinate value similar to
     * {@link #getLocalDestinationLocation()}.
     *
     * @return the camera x coordinate
     */
    int getCameraX();

    /**
     * Floating point camera position, x-axis
     * @see #getCameraX()
     * @return
     */
    double getCameraFpX();

    /**
     * Gets the y-axis coordinate of the camera.
     * <p>
     * This value is a local coordinate value similar to
     * {@link #getLocalDestinationLocation()}.
     *
     * @return the camera y coordinate
     */
    int getCameraY();

    /**
     * Floating point camera position, y-axis
     * @see #getCameraY()
     * @return
     */
    double getCameraFpY();

    /**
     * Gets the z-axis coordinate of the camera.
     * <p>
     * This value is a local coordinate value similar to
     * {@link #getLocalDestinationLocation()}.
     *
     * @return the camera z coordinate
     */
    int getCameraZ();

    /**
     * Floating point camera position, z-axis
     * @see #getCameraZ()
     * @return
     */
    double getCameraFpZ();

    /**
     * Gets the pitch of the camera.
     * <p>
     * The value returned by this method is measured in JAU, or Jagex
     * Angle Unit, which is 1/1024 of a revolution.
     *
     * @return the camera pitch
     */
    int getCameraPitch();

    /**
     * Floating point camera pitch.
     * @see #getCameraPitch()
     * @return
     */
    double getCameraFpPitch();

    /**
     * Gets the yaw of the camera.
     *
     * @return the camera yaw
     */
    int getCameraYaw();

    /**
     * Floating point camera yaw
     * @see #getCameraYaw()
     * @return
     */
    double getCameraFpYaw();

    /**
     * Gets the canvas height
     * @return
     */
    int getCanvasHeight();

    /**
     * Gets the canvas width
     * @return
     */
    int getCanvasWidth();

    /**
     * Gets the height of the viewport.
     *
     * @return the viewport height
     */
    int getViewportHeight();

    /**
     * Gets the width of the viewport.
     *
     * @return the viewport width
     */
    int getViewportWidth();

    /**
     * Gets the x-axis offset of the viewport.
     *
     * @return the x-axis offset
     */
    int getViewportXOffset();

    /**
     * Gets the y-axis offset of the viewport.
     *
     * @return the y-axis offset
     */
    int getViewportYOffset();

    /**
     * Get the target camera yaw.
     * The target yaw is the yaw the camera should use based on player input.
     * The actual camera yaw, from {@link #getCameraYaw()}, is what the camera
     * is actually using, which can be overridden by eg. cutscenes.
     *
     * @return the target camera yaw
     */
    int getCameraYawTarget();

    /**
     * Get the target camera pitch
     * The target pitch is the pitch the camera should use based on player input.
     * The actual camera pitch, from {@link #getCameraPitch()} ()}, is what the camera
     * is actually using, which can be overridden by eg. cutscenes.
     *
     * @return the target camera pitch
     */
    int getCameraPitchTarget();

    /**
     * Set the target camera yaw
     *
     * @param cameraYawTarget target camera yaw
     */
    void setCameraYawTarget(int cameraYawTarget);

    /**
     * Set the target camera pitch
     *
     * @param cameraPitchTarget target camera pitch
     */
    void setCameraPitchTarget(int cameraPitchTarget);

    /**
     * Sets the camera speed
     * @param speed
     */
    void setCameraSpeed(float speed);

    /**
     * Sets the mask for which mouse buttons control the camera.
     * Use 0 for the default behavior of mouse button 4 if "middle mouse moves camera" is on.
     * @param mask
     */
    void setCameraMouseButtonMask(int mask);

    /**
     * Sets whether the camera pitch can exceed the normal limits set
     * by the RuneScape client.
     *
     * @param enabled new camera pitch relaxer value
     */
    void setCameraPitchRelaxerEnabled(boolean enabled);

    /**
     * Sets the RGB color of the skybox
     */
    void setSkyboxColor(int skyboxColor);

    /**
     * Gets the RGB color of the skybox
     */
    int getSkyboxColor();

    /**
     * Gets the current position of the mouse on the canvas.
     *
     * @return the mouse canvas position
     */
    Point getMouseCanvasPosition();

    /**
     * Get the camera mode
     * @return 0 for normal, 1 for free camera
     */
    int getCameraMode();

    /**
     * Set the camera mode
     * @param mode 0 for normal, 1 for free camera
     */
    void setCameraMode(int mode);

    /**
     * Get the camera focus point x
     * Typically this is the player position, but can be other points in cutscenes or in free camera mode.
     * @return
     */
    double getCameraFocalPointX();

    /**
     * Sets the camera focus point x. Requires the {@link #getCameraMode()} to be free camera.
     * @param x
     */
    void setCameraFocalPointX(double x);

    /**
     * Get the camera focus point y
     * Typically this is the player position, but can be other points in cutscenes or in free camera mode.
     * @return
     */
    double getCameraFocalPointY();

    /**
     * Sets the camera focus point y. Requires the {@link #getCameraMode()} to be free camera.
     * @param y
     */
    void setCameraFocalPointY(double y);

    /**
     * Get the camera focus point z
     * Typically this is the player position, but can be other points in cutscenes or in free camera mode.
     * @return
     */
    double getCameraFocalPointZ();

    /**
     * Sets the camera focus point z. Requires the {@link #getCameraMode()} to be free camera.
     * @param z
     */
    void setCameraFocalPointZ(double z);

    /**
     * Sets the normal moving speed when using oculus orb (default value is 12)
     */
    void setFreeCameraSpeed(int speed);

    /**
     * Whether camera shaking effects are disabled at e.g. Barrows, ToA
     * @return
     */
    boolean isCameraShakeDisabled();

    /**
     * Set whether to disable camera shaking effects at e.g. Barrows, ToA
     * @param disabled
     */
    void setCameraShakeDisabled(boolean disabled);

    boolean isGpu();

    void setGpuFlags(int gpuflags);

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

    @Deprecated
    Scene getScene();

    @Deprecated
    List<Player> getPlayers();

    @Deprecated
    List<NPC> getNpcs();

    @Deprecated
    NPC[] getCachedNPCs();

    @Deprecated
    Player[] getCachedPlayers();

    @Nullable
	@Deprecated
    CollisionData[] getCollisionMaps();

    @Deprecated
    Deque<Projectile> getProjectiles();
}
