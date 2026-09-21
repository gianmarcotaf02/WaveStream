package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements io.sentry.ScopeCallback, io.sentry.util.HintUtils.SentryConsumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f23494i;

    public /* synthetic */ h(boolean z6, int i3) {
        this.f23493h = i3;
        this.f23494i = z6;
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(java.lang.Object obj) {
        switch (this.f23493h) {
            case 3:
                ((io.sentry.hints.Retryable) obj).setRetry(this.f23494i);
                break;
            default:
                ((io.sentry.hints.Retryable) obj).setRetry(this.f23494i);
                break;
        }
    }

    @Override // io.sentry.ScopeCallback
    public void run(io.sentry.IScope iScope) {
        switch (this.f23493h) {
            case 0:
                io.sentry.Scopes.lambda$close$3(this.f23494i, iScope);
                break;
            case 1:
                io.sentry.Scopes.lambda$close$4(this.f23494i, iScope);
                break;
            default:
                io.sentry.Scopes.lambda$close$5(this.f23494i, iScope);
                break;
        }
    }
}
