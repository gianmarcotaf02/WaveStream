package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23516i;

    public /* synthetic */ l(int i3, java.lang.Object obj) {
        this.f23515h = i3;
        this.f23516i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23515h) {
            case 0:
                io.sentry.Sentry.lambda$initConfigurations$5((java.io.File) this.f23516i);
                break;
            default:
                ((io.sentry.ShutdownHookIntegration) this.f23516i).lambda$close$2();
                break;
        }
    }
}
