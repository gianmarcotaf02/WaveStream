package io.sentry.cache;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.sentry.cache.PersistingScopeObserver f23484i;
    public final /* synthetic */ java.util.Collection j;

    public /* synthetic */ d(io.sentry.cache.PersistingScopeObserver persistingScopeObserver, java.util.Collection collection, int i3) {
        this.f23483h = i3;
        this.f23484i = persistingScopeObserver;
        this.j = collection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23483h) {
            case 0:
                this.f23484i.lambda$setBreadcrumbs$1(this.j);
                break;
            default:
                this.f23484i.lambda$setFingerprint$5(this.j);
                break;
        }
    }
}
