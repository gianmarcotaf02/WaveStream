package com.android.billingclient.api;

import D8.x;
import Y2.C1040j;
import Y2.P;
import Z.AbstractC1149h0;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.android.gms.internal.play_billing.AbstractC1872t;
import com.google.android.gms.internal.play_billing.o1;

public class ProxyBillingActivity extends Activity {

    public ResultReceiver f18556h;

    public boolean f18557i;
    public boolean j;

    public int f18558k;

    public long f18559l;

    public boolean f18560m;

    public static int a(Intent intent, int i3) {
        if (intent != null) {
            if (intent.getExtras() == null) {
                return 22;
            }
            if (i3 == 5) {
                return TsExtractor.TS_STREAM_TYPE_DTS_UHD;
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
        return AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
    }

    public final Intent b(int i3, long j) {
        Intent intentC = c();
        intentC.putExtra("RESPONSE_CODE", 6);
        intentC.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        x xVarA = C1040j.a();
        xVarA.f2609i = 6;
        xVarA.f2610k = "An internal error occurred.";
        C1040j c1040jP = xVarA.p();
        int i9 = P.f11396a;
        intentC.putExtra("FAILURE_LOGGING_PAYLOAD", P.b(i3, 2, c1040jP, null, o1.BROADCAST_ACTION_UNSPECIFIED).b());
        intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentC.putExtra("billingClientTransactionId", j);
        intentC.putExtra("wasServiceAutoReconnected", this.f18560m);
        return intentC;
    }

    public final Intent c() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override
    public final void onActivityResult(int i3, int i9, Intent intent) {
        boolean z6;
        int i10;
        int i11;
        String string;
        Intent intentC;
        int i12;
        ResultReceiver resultReceiver;
        Bundle extras;
        super.onActivityResult(i3, i9, intent);
        if (i3 == 100) {
            if (intent == null) {
                z6 = false;
            } else {
                z6 = true;
            }
            i10 = AbstractC1872t.e("ProxyBillingActivity", intent).f11477a;
            i11 = -1;
            if (i9 != -1) {
                AbstractC1872t.h("ProxyBillingActivity", "Activity finished with resultCode " + i9 + " and billing's responseCode: " + i10);
                i11 = i9;
            } else if (i10 != 0) {
                i9 = -1;
                AbstractC1872t.h("ProxyBillingActivity", "Activity finished with resultCode " + i9 + " and billing's responseCode: " + i10);
                i11 = i9;
            }
            if (true != z6) {
                AbstractC1872t.h("ProxyBillingActivity", "Got null data with resultCode " + i11 + "!");
            } else if (intent.getExtras() == null) {
                AbstractC1872t.h("ProxyBillingActivity", "Got null bundle!");
            }
            if (AbstractC1149h0.a(a(intent, i11), 1)) {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent2 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
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
            i10 = AbstractC1872t.e("ProxyBillingActivity", intent).f11477a;
            i11 = -1;
            if (i9 != -1) {
                AbstractC1872t.h("ProxyBillingActivity", "Activity finished with resultCode " + i9 + " and billing's responseCode: " + i10);
                i11 = i9;
            } else if (i10 != 0) {
                i9 = -1;
                AbstractC1872t.h("ProxyBillingActivity", "Activity finished with resultCode " + i9 + " and billing's responseCode: " + i10);
                i11 = i9;
            }
            if (true != z6) {
                AbstractC1872t.h("ProxyBillingActivity", "Got null data with resultCode " + i11 + "!");
            } else if (intent.getExtras() == null) {
                AbstractC1872t.h("ProxyBillingActivity", "Got null bundle!");
            }
            if (AbstractC1149h0.a(a(intent, i11), 1)) {
                intentC = b(a(intent, i11), this.f18559l);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent3 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
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
                AbstractC1872t.h("ProxyBillingActivity", "Got null intent!");
            } else {
                int i13 = AbstractC1872t.f19388a;
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    AbstractC1872t.h("ProxyBillingActivity", "Unexpected null bundle received!");
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
            AbstractC1872t.h("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i3 + "; skipping...");
        }
        this.f18557i = false;
        finish();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            AbstractC1872t.g("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f18557i = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f18556h = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
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
        AbstractC1872t.g("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f18558k = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.j = true;
                this.f18558k = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f18556h = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
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
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f18558k, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e6) {
            AbstractC1872t.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e6);
            ResultReceiver resultReceiver = this.f18556h;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentB = b(137, this.f18559l);
                if (this.j) {
                    intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentB);
            }
            this.f18557i = false;
            finish();
        }
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f18557i) {
            Intent intentC = c();
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

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f18556h;
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
