package com.google.android.gms.common.api;

import D3.b;
import D3.e;
import F3.C0366f;
import H3.q;
import Y6.f;
import Z3.d;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;

public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    public static final int f18681i = 0;

    public int f18682h = 0;

    @Override
    public final void onActivityResult(int i3, int i9, Intent intent) {
        super.onActivityResult(i3, i9, intent);
        if (i3 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f18682h = 0;
            setResult(i9, intent);
            if (booleanExtra) {
                C0366f c0366fG = C0366f.g(this);
                if (i9 == -1) {
                    d dVar = c0366fG.f3596u;
                    dVar.sendMessage(dVar.obtainMessage(3));
                } else if (i9 == 0) {
                    c0366fG.h(new b(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i3 == 2) {
            this.f18682h = 0;
            setResult(i9, intent);
        }
        finish();
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        this.f18682h = 0;
        setResult(0);
        finish();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f18682h = bundle.getInt("resolution");
        }
        if (this.f18682h == 1) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get(DiagnosticsTracker.ERROR_CODE_KEY);
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            q.g(num);
            e.f2106d.c(this, num.intValue(), this);
            this.f18682h = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f18682h = 1;
            } catch (ActivityNotFoundException e6) {
                e = e6;
                if (extras.getBoolean("notify_manager", true)) {
                    C0366f.g(this).h(new b(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strH = f.h("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strH = strH.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", strH, e);
                }
                googleApiActivity.f18682h = 1;
                finish();
            } catch (IntentSender.SendIntentException e9) {
                e = e9;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (ActivityNotFoundException e10) {
            e = e10;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
        }
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f18682h);
        super.onSaveInstanceState(bundle);
    }
}
