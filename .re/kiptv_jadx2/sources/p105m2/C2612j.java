package p105m2;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

public final class C2612j extends AbstractC2621t {

    public final String f25331a;

    public final C2611i f25332b;

    public C2612j(String str, C2611i c2611i) {
        this.f25331a = str;
        this.f25332b = c2611i;
    }

    @Override
    public final void f(int i3) {
        C2611i c2611i;
        MediaRouter2.RoutingController routingController;
        Messenger messenger;
        String str = this.f25331a;
        if (str == null || (c2611i = this.f25332b) == null || (routingController = c2611i.g) == null || routingController.isReleased() || (messenger = c2611i.f25324h) == null) {
            return;
        }
        int andIncrement = c2611i.f25327l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 7;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i3);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = c2611i.f25325i;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e6) {
            Log.e("MR2Provider", "Could not send control request to service.", e6);
        }
    }

    @Override
    public final void i(int i3) {
        C2611i c2611i;
        MediaRouter2.RoutingController routingController;
        Messenger messenger;
        String str = this.f25331a;
        if (str == null || (c2611i = this.f25332b) == null || (routingController = c2611i.g) == null || routingController.isReleased() || (messenger = c2611i.f25324h) == null) {
            return;
        }
        int andIncrement = c2611i.f25327l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 8;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i3);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = c2611i.f25325i;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e6) {
            Log.e("MR2Provider", "Could not send control request to service.", e6);
        }
    }
}
