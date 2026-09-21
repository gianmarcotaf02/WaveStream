package Y2;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.ProxyBillingActivity;
import com.google.android.gms.internal.play_billing.AbstractC1831d;
import com.google.android.gms.internal.play_billing.AbstractC1872t;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

public final class J extends X3.g {

    public final WeakReference f11384d;

    public final G f11385e;

    public J(WeakReference weakReference, G g) {
        super("com.android.vending.billing.IInAppBillingServiceCallback", 4);
        this.f11384d = weakReference;
        this.f11385e = g;
    }

    @Override
    public final boolean X(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) AbstractC1831d.a(parcel);
        X3.g.a0(parcel);
        G g = this.f11385e;
        if (g == null) {
            AbstractC1872t.h("BillingClient", "Unable to send result for in-app messaging");
        } else if (bundle == null) {
            g.send(0, null);
        } else {
            Activity activity = (Activity) this.f11384d.get();
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
            if (activity == null || pendingIntent == null) {
                g.send(0, null);
                AbstractC1872t.h("BillingClient", "Unable to launch intent for in-app messaging");
            } else {
                try {
                    Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                    intent.putExtra("in_app_message_result_receiver", g);
                    intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
                    activity.startActivity(intent);
                } catch (CancellationException e6) {
                    g.send(0, null);
                    AbstractC1872t.i("BillingClient", "Exception caught while launching intent for in-app messaging.", e6);
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
