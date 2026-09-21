package Y2;

/* JADX INFO: loaded from: classes.dex */
public final class J extends X3.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f11384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Y2.G f11385e;

    public J(java.lang.ref.WeakReference weakReference, Y2.G g) {
        super("com.android.vending.billing.IInAppBillingServiceCallback", 4);
        this.f11384d = weakReference;
        this.f11385e = g;
    }

    @Override // X3.g
    public final boolean X(int i3, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        android.os.Parcelable.Creator creator = android.os.Bundle.CREATOR;
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.play_billing.AbstractC1831d.a(parcel);
        X3.g.a0(parcel);
        Y2.G g = this.f11385e;
        if (g == null) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Unable to send result for in-app messaging");
        } else if (bundle == null) {
            g.send(0, null);
        } else {
            android.app.Activity activity = (android.app.Activity) this.f11384d.get();
            android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
            if (activity == null || pendingIntent == null) {
                g.send(0, null);
                com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Unable to launch intent for in-app messaging");
            } else {
                try {
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.android.billingclient.api.ProxyBillingActivity.class);
                    intent.putExtra("in_app_message_result_receiver", g);
                    intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
                    activity.startActivity(intent);
                } catch (java.util.concurrent.CancellationException e6) {
                    g.send(0, null);
                    com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Exception caught while launching intent for in-app messaging.", e6);
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
