package com.pairip.licensecheck;

import android.content.Context;

public final class TrialClient {
    public static void stopTrial(Context context) {
        LicenseClient.stopTrial(context);
    }

    private TrialClient() {
    }
}
