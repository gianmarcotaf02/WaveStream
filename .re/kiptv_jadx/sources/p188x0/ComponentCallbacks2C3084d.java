package p188x0;

/* JADX INFO: renamed from: x0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C3084d implements android.content.ComponentCallbacks2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p188x0.C3085e f31101h;

    public ComponentCallbacks2C3084d(p188x0.C3085e c3085e) {
        this.f31101h = c3085e;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        if (i3 >= 40) {
            this.f31101h.getClass();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }
}
