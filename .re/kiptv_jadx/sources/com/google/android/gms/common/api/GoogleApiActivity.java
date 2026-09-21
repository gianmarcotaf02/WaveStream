package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public class GoogleApiActivity extends android.app.Activity implements android.content.DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f18681i = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18682h = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i9, android.content.Intent intent) {
        super.onActivityResult(i3, i9, intent);
        if (i3 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f18682h = 0;
            setResult(i9, intent);
            if (booleanExtra) {
                F3.C0366f c0366fG = F3.C0366f.g(this);
                if (i9 == -1) {
                    Z3.d dVar = c0366fG.f3596u;
                    dVar.sendMessage(dVar.obtainMessage(3));
                } else if (i9 == 0) {
                    c0366fG.h(new D3.b(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i3 == 2) {
            this.f18682h = 0;
            setResult(i9, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f18682h = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        com.google.android.gms.common.api.GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f18682h = bundle.getInt("resolution");
        }
        if (this.f18682h == 1) {
            return;
        }
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null) {
            android.util.Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) extras.get("pending_intent");
        java.lang.Integer num = (java.lang.Integer) extras.get(com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.ERROR_CODE_KEY);
        if (pendingIntent == null && num == null) {
            android.util.Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            H3.q.g(num);
            D3.e.f2106d.c(this, num.intValue(), this);
            this.f18682h = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f18682h = 1;
            } catch (android.content.ActivityNotFoundException e6) {
                e = e6;
                if (extras.getBoolean("notify_manager", true)) {
                    F3.C0366f.g(this).h(new D3.b(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    java.lang.String strH = Y6.f.h("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (android.os.Build.FINGERPRINT.contains("generic")) {
                        strH = strH.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    android.util.Log.e("GoogleApiActivity", strH, e);
                }
                googleApiActivity.f18682h = 1;
                finish();
            } catch (android.content.IntentSender.SendIntentException e9) {
                e = e9;
                android.util.Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (android.content.ActivityNotFoundException e10) {
            e = e10;
            googleApiActivity = this;
        } catch (android.content.IntentSender.SendIntentException e11) {
            e = e11;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.putInt("resolution", this.f18682h);
        super.onSaveInstanceState(bundle);
    }
}
