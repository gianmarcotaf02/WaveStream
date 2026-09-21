package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23415i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ a(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f23414h = i3;
        this.f23415i = obj;
        this.j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23414h) {
            case 0:
                ((io.sentry.DefaultTransactionPerformanceCollector) this.f23415i).lambda$start$0((io.sentry.ITransaction) this.j);
                break;
            case 1:
                ((io.sentry.Scopes) this.f23415i).lambda$close$2((io.sentry.ISentryExecutorService) this.j);
                break;
            case 2:
                io.sentry.ShutdownHookIntegration.lambda$register$0((io.sentry.IScopes) this.f23415i, (io.sentry.SentryOptions) this.j);
                break;
            case 3:
                ((io.sentry.ShutdownHookIntegration) this.f23415i).lambda$register$1((io.sentry.SentryOptions) this.j);
                break;
            default:
                ((io.sentry.SpotlightIntegration) this.f23415i).lambda$execute$0((io.sentry.SentryEnvelope) this.j);
                break;
        }
    }
}
