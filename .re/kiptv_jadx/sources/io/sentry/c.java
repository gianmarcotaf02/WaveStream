package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements io.sentry.util.HintUtils.SentryConsumer, io.sentry.ScopeCallback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23481i;

    public /* synthetic */ c(int i3, java.lang.Object obj) {
        this.f23480h = i3;
        this.f23481i = obj;
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(java.lang.Object obj) {
        ((io.sentry.EnvelopeSender) this.f23481i).lambda$processFile$0((io.sentry.hints.Flushable) obj);
    }

    @Override // io.sentry.ScopeCallback
    public void run(io.sentry.IScope iScope) {
        switch (this.f23480h) {
            case 1:
                io.sentry.Scopes.lambda$continueTrace$7((io.sentry.PropagationContext) this.f23481i, iScope);
                break;
            default:
                io.sentry.SentryTracer.lambda$updateBaggageValues$4((java.util.concurrent.atomic.AtomicReference) this.f23481i, iScope);
                break;
        }
    }
}
