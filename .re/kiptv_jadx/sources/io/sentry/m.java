package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements io.sentry.Sentry.OptionsConfiguration, io.sentry.util.LazyEvaluator.Evaluator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f23517h;

    public /* synthetic */ m(java.lang.String str) {
        this.f23517h = str;
    }

    @Override // io.sentry.Sentry.OptionsConfiguration
    public void configure(io.sentry.SentryOptions sentryOptions) {
        sentryOptions.setDsn(this.f23517h);
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public java.lang.Object evaluate() {
        return io.sentry.SpanId.lambda$new$0(this.f23517h);
    }
}
