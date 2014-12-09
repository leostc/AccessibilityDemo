/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.lihao.accessibilitydemo;


import java.util.Locale;

import android.accessibilityservice.AccessibilityService;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.util.Log;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/**
 * This class demonstrates how an accessibility service can query
 * window content to improve the feedback given to the user.
 */
public class MyAccessibilityService extends AccessibilityService implements OnInitListener {

    /**
     * Tag for logging.
     */
    private static final String LOG_TAG = "onAccessibilityEvent";

    /**
     * {@inheritDoc}
     */
    @Override
    public void onServiceConnected() {
    }

    /**
     * Processes an AccessibilityEvent, by traversing the View's tree and
     * putting together a message to speak to the user.
     */
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        AccessibilityNodeInfo source = event.getSource();
        if (source != null && source.getText() != null) {
            Log.i(LOG_TAG, source.toString());
            Log.i(LOG_TAG, source.getText().toString());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onInterrupt() {
        /* do nothing */
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onInit(int status) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected boolean onKeyEvent(KeyEvent event) {
        return false;
    }
}
