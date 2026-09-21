package p105m2;

import D1.RunnableC0239y;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.support.v4.media.session.i;
import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;

public final class C2611i extends AbstractC2620s {

    public final String f25323f;
    public final MediaRouter2.RoutingController g;

    public final Messenger f25324h;

    public final Messenger f25325i;

    public final Handler f25326k;

    public C2617o f25330o;
    public final SparseArray j = new SparseArray();

    public final AtomicInteger f25327l = new AtomicInteger(1);

    public final RunnableC0239y f25328m = new RunnableC0239y(27, this);

    public int f25329n = -1;

    public C2611i(MediaRouter2.RoutingController routingController, String str) {
        this.g = routingController;
        this.f25323f = str;
        int i3 = C2615m.y;
        Bundle controlHints = routingController.getControlHints();
        Messenger messenger = controlHints == null ? null : (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
        this.f25324h = messenger;
        this.f25325i = messenger != null ? new Messenger(new i(this)) : null;
        this.f25326k = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void d() {
        this.g.release();
    }

    @Override
    public final void f(int i3) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i3);
        this.f25329n = i3;
        Handler handler = this.f25326k;
        RunnableC0239y runnableC0239y = this.f25328m;
        handler.removeCallbacks(runnableC0239y);
        handler.postDelayed(runnableC0239y, 1000L);
    }

    @Override
    public final void i(int i3) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        int volume = this.f25329n;
        if (volume < 0) {
            volume = routingController.getVolume();
        }
        int iMax = Math.max(0, Math.min(volume + i3, this.g.getVolumeMax()));
        this.f25329n = iMax;
        this.g.setVolume(iMax);
        Handler handler = this.f25326k;
        RunnableC0239y runnableC0239y = this.f25328m;
        handler.removeCallbacks(runnableC0239y);
        handler.postDelayed(runnableC0239y, 1000L);
    }
}
