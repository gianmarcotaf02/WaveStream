package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements io.sentry.ScopeCallback, io.sentry.SpanFinishedCallback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.sentry.SentryTracer f23546i;

    public /* synthetic */ t(io.sentry.SentryTracer sentryTracer, int i3) {
        this.f23545h = i3;
        this.f23546i = sentryTracer;
    }

    @Override // io.sentry.SpanFinishedCallback
    public void execute(io.sentry.Span span) {
        this.f23546i.lambda$createChild$3(span);
    }

    @Override // io.sentry.ScopeCallback
    public void run(io.sentry.IScope iScope) {
        switch (this.f23545h) {
            case 0:
                this.f23546i.lambda$finish$2(iScope);
                break;
            default:
                this.f23546i.lambda$makeCurrent$5(iScope);
                break;
        }
    }
}
