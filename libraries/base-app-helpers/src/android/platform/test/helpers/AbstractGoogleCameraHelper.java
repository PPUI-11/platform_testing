/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.platform.test.helpers;

import android.app.Instrumentation;

public abstract class AbstractGoogleCameraHelper extends AbstractStandardAppHelper {

    public AbstractGoogleCameraHelper(Instrumentation instr) {
        super(instr);
    }

    /**
     * Setup expectations: GoogleCamera is open and idle in video mode.
     *
     * This method will change to camera mode and block until the transition is complete.
     */
    public abstract void goToCameraMode();

    /**
     * Setup expectations: GoogleCamera is open and idle in camera mode.
     *
     * This method will change to video mode and block until the transition is complete.
     */
    public abstract void goToVideoMode();

    /**
     * Setup expectations: GoogleCamera is open and idle in either camera/video mode.
     *
     * This method will change to back camera and block until the transition is complete.
     */
    public abstract void goToBackCamera();

    /**
     * Setup expectations: GoogleCamera is open and idle in either camera/video mode.
     *
     * This method will change to front camera and block until the transition is complete.
     */
    public abstract void goToFrontCamera();

    /**
     * Setup expectation: in Camera mode with the capture button present.
     *
     * This method will capture a photo and block until the transaction is complete.
     */
    public abstract void capturePhoto();

    /**
     * Setup expectation: in Video mode with the capture button present.
     *
     * This method will capture a video of length timeInMs and block until the transaction is
     * complete.
     * @param time duration of video in milliseconds
     */
    public abstract void captureVideo(long time);

    /**
     * Setup expectation: GoogleCamera is open and idle in camera mode.
     *
     * This method will set HDR to on(1), auto(-1), or off(0).
     * @param mode the integer value of the mode denoted above.
     */
    public abstract void setHdrMode(int mode);

    /**
     * Setup expectation: in Camera mode with the capture button present.
     *
     * This method will block until the capture button is enabled for pressing.
     */
    public abstract void waitForCameraShutterEnabled();

    /**
     * Setup expectation: in Video mode with the capture button present.
     *
     * This method will block until the capture button is enabled for pressing.
     */
    public abstract void waitForVideoShutterEnabled();

    /**
     * Temporary function.
     */
    public abstract String openWithShutterTimeString();
}
