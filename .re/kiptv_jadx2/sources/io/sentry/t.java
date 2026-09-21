package io.sentry;

public final class t implements ScopeCallback, SpanFinishedCallback {

    public final int f23545h;

    public final SentryTracer f23546i;

    public t(SentryTracer sentryTracer, int i3) {
        this.f23545h = i3;
        this.f23546i = sentryTracer;
    }

    @Override
    public void execute(Span span) {
        this.f23546i.lambda$createChild$3(span);
    }

    @Override
    public void run(IScope iScope) {
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
