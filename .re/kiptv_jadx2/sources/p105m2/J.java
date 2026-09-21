package p105m2;

import android.media.MediaRouter;

public final class J extends MediaRouter.VolumeCallback {

    public final I f25222a;

    public J(I i3) {
        this.f25222a = i3;
    }

    @Override
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i3) {
        this.f25222a.a(routeInfo, i3);
    }

    @Override
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i3) {
        this.f25222a.b(routeInfo, i3);
    }
}
