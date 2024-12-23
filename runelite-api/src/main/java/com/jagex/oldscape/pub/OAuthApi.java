/*
 * Copyright (c) 2022, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.jagex.oldscape.pub;

import net.runelite.api.Point;

import java.awt.*;

public interface OAuthApi
{
	/**
	 * Gets a unique per-RuneScape-Account identifier or {@code -1} if the client has not logged in yet
	 */
	long getAccountHash();

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
     * Gets the current position of the mouse on the canvas.
     *
     * @return the mouse canvas position
     */
    Point getMouseCanvasPosition();
}
