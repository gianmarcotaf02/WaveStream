package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements io.sentry.Scope.IWithSession, io.sentry.util.HintUtils.SentryConsumer, io.sentry.SpanFinishedCallback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23519i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ n(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.f23518h = obj;
        this.f23519i = obj2;
        this.j = obj3;
    }

    @Override // io.sentry.Scope.IWithSession
    public void accept(io.sentry.Session session) {
        ((io.sentry.SentryClient) this.f23518h).lambda$updateSessionData$1((io.sentry.SentryEvent) this.f23519i, (io.sentry.Hint) this.j, session);
    }

    @Override // io.sentry.SpanFinishedCallback
    public void execute(io.sentry.Span span) {
        ((io.sentry.SentryTracer) this.f23518h).lambda$finish$0((io.sentry.SpanFinishedCallback) this.f23519i, (java.util.concurrent.atomic.AtomicReference) this.j, span);
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(java.lang.Object obj) {
        ((io.sentry.EnvelopeSender) this.f23518h).lambda$processFile$1((java.lang.Throwable) this.f23519i, (java.io.File) this.j, (io.sentry.hints.Retryable) obj);
    }
}
