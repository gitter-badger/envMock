package com.pecpwee.lib.envMock.utils;

import android.util.Log;

import com.pecpwee.lib.envMock.PlayConfig;
import com.pecpwee.lib.envMock.RecordConfig;

/**
 * Created by pw on 14-12-19.
 */
public class LogUtils {
    private static final String TAG = "envMock";

    public static void d(String message) {
        if (!isLogEnable()) {
            return;
        }
        Log.d(TAG, message);
    }

    public static void log(Throwable t) {
        if (!isLogEnable()) {
            return;
        }

        if (t == null) {
            return;
        }
        Log.d(TAG, "exception", t);
    }

    private static boolean isLogEnable() {
        PlayConfig playConfig = PlayConfig.getInstance();
        if (playConfig != null && playConfig.isDebug) {
            return true;
        }

        RecordConfig recordConfig = RecordConfig.getInstance();
        if (recordConfig != null && recordConfig.isDebug) {
            return true;
        }
        return false;
    }

}
