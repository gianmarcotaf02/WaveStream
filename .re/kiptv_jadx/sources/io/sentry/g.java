package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements io.sentry.JsonObjectDeserializer.NextValue, io.sentry.Scope.IWithSession, io.sentry.util.HintUtils.SentryConsumer, io.sentry.ScopeCallback, io.sentry.Sentry.OptionsConfiguration, io.sentry.util.LazyEvaluator.Evaluator, io.sentry.util.CollectionUtils.Predicate {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23492h;

    public /* synthetic */ g(int i3) {
        this.f23492h = i3;
    }

    @Override // io.sentry.Scope.IWithSession
    public void accept(io.sentry.Session session) {
        io.sentry.SentryClient.lambda$captureEvent$0(session);
    }

    @Override // io.sentry.Sentry.OptionsConfiguration
    public void configure(io.sentry.SentryOptions sentryOptions) {
        sentryOptions.setEnableExternalConfiguration(true);
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public java.lang.Object evaluate() {
        switch (this.f23492h) {
            case 6:
                return io.sentry.SentryOptions.lambda$new$3();
            default:
                return io.sentry.SentryUUID.generateSpanId();
        }
    }

    @Override // io.sentry.JsonObjectDeserializer.NextValue
    public java.lang.Object nextValue() {
        return io.sentry.JsonObjectDeserializer.lambda$parse$3();
    }

    @Override // io.sentry.ScopeCallback
    public void run(io.sentry.IScope iScope) {
        switch (this.f23492h) {
            case 3:
                iScope.clear();
                break;
            default:
                iScope.clear();
                break;
        }
    }

    @Override // io.sentry.util.CollectionUtils.Predicate
    public boolean test(java.lang.Object obj) {
        io.sentry.protocol.SentryStackFrame sentryStackFrame = (io.sentry.protocol.SentryStackFrame) obj;
        switch (this.f23492h) {
            case 7:
                return io.sentry.SentryStackTraceFactory.lambda$getInAppCallStack$0(sentryStackFrame);
            default:
                return io.sentry.SentryStackTraceFactory.lambda$getInAppCallStack$1(sentryStackFrame);
        }
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(java.lang.Object obj) {
        ((io.sentry.hints.Resettable) obj).reset();
    }
}
