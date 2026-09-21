package p105m2;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

public final class C2610h extends MediaRouter2$ControllerCallback {

    public final C2615m f25322a;

    public C2610h(C2615m c2615m) {
        this.f25322a = c2615m;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.f25322a.j(routingController);
    }
}
