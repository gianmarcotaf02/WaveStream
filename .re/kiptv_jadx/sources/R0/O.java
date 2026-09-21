package R0;

/* JADX INFO: loaded from: classes.dex */
public final class O implements android.content.ComponentCallbacks2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Configuration f8835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ W0.c f8836i;

    public O(android.content.res.Configuration configuration, W0.c cVar) {
        this.f8835h = configuration;
        this.f8836i = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        android.content.res.Configuration configuration2 = this.f8835h;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        java.util.Iterator it = this.f8836i.f10539a.entrySet().iterator();
        while (it.hasNext()) {
            W0.a aVar = (W0.a) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it.next()).getValue()).get();
            if (aVar == null || android.content.res.Configuration.needNewResources(iUpdateFrom, aVar.f10536b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f8836i.f10539a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        this.f8836i.f10539a.clear();
    }
}
