package R0;

/* JADX INFO: loaded from: classes.dex */
public final class P implements android.content.ComponentCallbacks2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ W0.d f8839h;

    public P(W0.d dVar) {
        this.f8839h = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        W0.d dVar = this.f8839h;
        synchronized (dVar) {
            dVar.f10540a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        W0.d dVar = this.f8839h;
        synchronized (dVar) {
            dVar.f10540a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        W0.d dVar = this.f8839h;
        synchronized (dVar) {
            dVar.f10540a.c();
        }
    }
}
