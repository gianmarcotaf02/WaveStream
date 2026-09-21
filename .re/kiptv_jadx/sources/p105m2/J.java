package p105m2;

/* JADX INFO: loaded from: classes.dex */
public final class J extends android.media.MediaRouter.VolumeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p105m2.I f25222a;

    public J(p105m2.I i3) {
        this.f25222a = i3;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(android.media.MediaRouter.RouteInfo routeInfo, int i3) {
        this.f25222a.a(routeInfo, i3);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(android.media.MediaRouter.RouteInfo routeInfo, int i3) {
        this.f25222a.b(routeInfo, i3);
    }
}
