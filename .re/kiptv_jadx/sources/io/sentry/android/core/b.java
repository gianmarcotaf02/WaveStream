package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23418i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ b(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f23417h = i3;
        this.f23418i = obj;
        this.j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23417h) {
            case 0:
                ((io.sentry.android.core.ANRWatchDog) this.f23418i).lambda$new$1((io.sentry.transport.ICurrentDateProvider) this.j);
                break;
            default:
                ((io.sentry.android.core.AppLifecycleIntegration) this.f23418i).lambda$register$0((io.sentry.IScopes) this.j);
                break;
        }
    }
}
