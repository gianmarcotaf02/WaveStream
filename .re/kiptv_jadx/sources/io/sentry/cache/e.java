package io.sentry.cache;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.sentry.cache.PersistingScopeObserver f23486i;
    public final /* synthetic */ java.util.Map j;

    public /* synthetic */ e(io.sentry.cache.PersistingScopeObserver persistingScopeObserver, java.util.Map map, int i3) {
        this.f23485h = i3;
        this.f23486i = persistingScopeObserver;
        this.j = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23485h) {
            case 0:
                this.f23486i.lambda$setTags$2(this.j);
                break;
            default:
                this.f23486i.lambda$setExtras$3(this.j);
                break;
        }
    }
}
