package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivity extends android.app.Activity {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public android.os.ResultReceiver f18556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18557i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18558k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f18559l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f18560m;

    public static int a(android.content.Intent intent, int i3) {
        if (intent != null) {
            if (intent.getExtras() == null) {
                return 22;
            }
            if (i3 == 5) {
                return androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD;
            }
            return 1;
        }
        if (i3 == -1) {
            return 113;
        }
        if (i3 == 0) {
            return 114;
        }
        if (i3 == 3) {
            return 115;
        }
        if (i3 != 4) {
            return 117;
        }
        return androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
    }

    public final android.content.Intent b(int i3, long j) {
        android.content.Intent intentC = c();
        intentC.putExtra("RESPONSE_CODE", 6);
        intentC.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        D8.x xVarA = Y2.C1040j.a();
        xVarA.f2609i = 6;
        xVarA.f2610k = "An internal error occurred.";
        Y2.C1040j c1040jP = xVarA.p();
        int i9 = Y2.P.f11396a;
        intentC.putExtra("FAILURE_LOGGING_PAYLOAD", Y2.P.b(i3, 2, c1040jP, null, com.google.android.gms.internal.play_billing.o1.BROADCAST_ACTION_UNSPECIFIED).b());
        intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentC.putExtra("billingClientTransactionId", j);
        intentC.putExtra("wasServiceAutoReconnected", this.f18560m);
        return intentC;
    }

    public final android.content.Intent c() {
        android.content.Intent intent = new android.content.Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e A[PHI: r10
  0x006e: PHI (r10v1 int) = (r10v0 int), (r10v16 int) binds: [B:27:0x0069, B:29:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x0109  */
    /* JADX WARN: Code duplicated, block: B:6:0x0011  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x006e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x008a, please report this as an issue */
    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i9, android.content.Intent intent) {
        boolean z6;
        int i10;
        int i11;
        java.lang.String string;
        android.content.Intent intentC;
        int i12;
        android.os.ResultReceiver resultReceiver;
        android.os.Bundle extras;
        super.onActivityResult(i3, i9, intent);
        if (i3 == 100) {
            if (intent == null) {
                z6 = false;
            } else {
                z6 = true;
            }
            i10 = com.google.android.gms.internal.play_billing.AbstractC1872t.e("ProxyBillingActivity", intent).f11477a;
            i11 = -1;
            if (i9 != -1) {
                com.google.android.gms.internal.play_billing.AbstractC1872t.h("ProxyBillingActivity", "Activity finished with resultCode " + i9 + " and billing's responseCode: " + i10);
                i11 = i9;
            } else if (i10 != 0) {
                i9 = -1;
                com.google.android.gms.internal.play_billing.AbstractC1872t.h("ProxyBillingActivity", "Activity finished with resultCode " + i9 + " and billing's responseCode: " + i10);
                i11 = i9;
            }
            if (true != z6) {
                com.google.android.gms.internal.play_billing.AbstractC1872t.h("ProxyBillingActivity", "Got null data with resultCode " + i11 + "!");
            } else if (intent.getExtras() == null) {
                com.google.android.gms.internal.play_billing.AbstractC1872t.h("ProxyBillingActivity", "Got null bundle!");
            }
            if (Z.AbstractC1149h0.a(a(intent, i11), 1)) {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    android.content.Intent intent2 = new android.content.Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent2.setPackage(getApplicationContext().getPackageName());
                    intent2.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentC = intent2;
                } else {
                    intentC = c();
                    intentC.putExtras(intent.getExtras());
                    intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentC.putExtra("billingClientTransactionId", this.f18559l);
                intentC.putExtra("wasServiceAutoReconnected", this.f18560m);
            } else {
                intentC = b(a(intent, i11), this.f18559l);
            }
            if (i3 == 110) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentC);
        } else if (i3 == 110) {
            if (intent == null) {
                z6 = false;
            } else {
                z6 = true;
            }
            i10 = com.google.android.gms.internal.play_billing.AbstractC1872t.e("ProxyBillingActivity", intent).f11477a;
            i11 = -1;
            if (i9 != -1) {
                com.google.android.gms.internal.play_billing.AbstractC1872t.h("ProxyBillingActivity", "Activity finished with resultCode " + i9 + " and billing's responseCode: " + i10);
                i11 = i9;
            } else if (i10 != 0) {
                i9 = -1;
                com.google.android.gms.internal.play_billing.AbstractC1872t.h("ProxyBillingActivity", "Activity finished with resultCode " + i9 + " and billing's responseCode: " + i10);
                i11 = i9;
            }
            if (true != z6) {
                com.google.android.gms.internal.play_billing.AbstractC1872t.h("ProxyBillingActivity", "Got null data with resultCode " + i11 + "!");
            } else if (intent.getExtras() == null) {
                com.google.android.gms.internal.play_billing.AbstractC1872t.h("ProxyBillingActivity", "Got null bundle!");
            }
            if (Z.AbstractC1149h0.a(a(intent, i11), 1)) {
                intentC = b(a(intent, i11), this.f18559l);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    android.content.Intent intent3 = new android.content.Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent3.setPackage(getApplicationContext().getPackageName());
                    intent3.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent3.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentC = intent3;
                } else {
                    intentC = c();
                    intentC.putExtras(intent.getExtras());
                    intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentC.putExtra("billingClientTransactionId", this.f18559l);
                intentC.putExtra("wasServiceAutoReconnected", this.f18560m);
            }
            if (i3 == 110) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentC);
        } else if (i3 == 101) {
            if (intent == null) {
                com.google.android.gms.internal.play_billing.AbstractC1872t.h("ProxyBillingActivity", "Got null intent!");
            } else {
                int i13 = com.google.android.gms.internal.play_billing.AbstractC1872t.f19388a;
                android.os.Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    com.google.android.gms.internal.play_billing.AbstractC1872t.h("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i12 = extras2.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                }
                resultReceiver = this.f18556h;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i12, extras);
                }
            }
            i12 = 0;
            resultReceiver = this.f18556h;
            if (resultReceiver != null) {
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                resultReceiver.send(i12, extras);
            }
        } else {
            com.google.android.gms.internal.play_billing.AbstractC1872t.h("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i3 + "; skipping...");
        }
        this.f18557i = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        android.app.PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.g("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f18557i = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f18556h = (android.os.ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.j = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f18558k = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f18559l = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f18560m = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.AbstractC1872t.g("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f18558k = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (android.app.PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.j = true;
                this.f18558k = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (android.app.PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f18556h = (android.os.ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f18558k = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f18559l = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f18560m = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.f18557i = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f18558k, new android.content.Intent(), 0, 0, 0);
        } catch (android.content.IntentSender.SendIntentException e6) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e6);
            android.os.ResultReceiver resultReceiver = this.f18556h;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                android.content.Intent intentB = b(137, this.f18559l);
                if (this.j) {
                    intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentB);
            }
            this.f18557i = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f18557i) {
            android.content.Intent intentC = c();
            intentC.putExtra("RESPONSE_CODE", 1);
            intentC.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.j) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i3 = this.f18558k;
            if (i3 == 110 || i3 == 100) {
                intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentC.putExtra("billingClientTransactionId", this.f18559l);
            }
            sendBroadcast(intentC);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        android.os.ResultReceiver resultReceiver = this.f18556h;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f18557i);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.j);
        bundle.putInt("activity_code", this.f18558k);
        bundle.putLong("billingClientTransactionId", this.f18559l);
        bundle.putBoolean("wasServiceAutoReconnected", this.f18560m);
    }
}
