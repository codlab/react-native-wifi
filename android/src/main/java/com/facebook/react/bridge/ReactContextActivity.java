package com.facebook.react.bridge;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by kevinleperf on 01/04/2018.
 */

public class ReactContextActivity {
    private ReactContextActivity() {

    }

    /**
     * Expose the current react-native registered activity
     *
     * Warning : do not hold the reference
     * 
     * @param fromContext a non null instance
     * @return a nullable instance of the activity
     */
    @Nullable
    public static Activity getCurrentActivity(@NonNull ReactContext fromContext) {
        return fromContext.getCurrentActivity();
    }
}
