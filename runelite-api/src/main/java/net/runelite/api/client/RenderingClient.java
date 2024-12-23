package net.runelite.api.client;

import net.runelite.api.*;
import net.runelite.api.Point;

import java.awt.*;

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

}
