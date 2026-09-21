package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23487a;

    public /* synthetic */ d(int i3) {
        this.f23487a = i3;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        switch (this.f23487a) {
            case 0:
                return java.net.InetAddress.getLocalHost();
            case 1:
                return io.sentry.NoOpSentryExecutorService.lambda$schedule$2();
            case 2:
                return io.sentry.NoOpSentryExecutorService.lambda$submit$1();
            case 3:
                return io.sentry.NoOpSentryExecutorService.lambda$submit$0();
            default:
                return io.sentry.ProfilingTraceData.lambda$new$0();
        }
    }
}
