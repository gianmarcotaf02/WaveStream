package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements io.sentry.JsonObjectDeserializer.NextValue, io.sentry.util.HintUtils.SentryConsumer, io.sentry.Scope.IWithPropagationContext, io.sentry.Scope.IWithTransaction {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23491i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ f(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f23490h = i3;
        this.f23491i = obj;
        this.j = obj2;
    }

    @Override // io.sentry.Scope.IWithTransaction
    public void accept(io.sentry.ITransaction iTransaction) {
        ((io.sentry.SentryTracer) this.f23491i).lambda$finish$1((io.sentry.IScope) this.j, iTransaction);
    }

    @Override // io.sentry.JsonObjectDeserializer.NextValue
    public java.lang.Object nextValue() {
        return ((io.sentry.JsonObjectDeserializer) this.f23491i).lambda$parse$1((io.sentry.JsonObjectReader) this.j);
    }

    @Override // io.sentry.Scope.IWithPropagationContext
    public void accept(io.sentry.PropagationContext propagationContext) {
        ((io.sentry.IScope) this.f23491i).setPropagationContext((io.sentry.PropagationContext) this.j);
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(java.lang.Object obj) {
        switch (this.f23490h) {
            case 1:
                ((io.sentry.EnvelopeSender) this.f23491i).lambda$processFile$2((java.io.File) this.j, (io.sentry.hints.Retryable) obj);
                break;
            default:
                ((io.sentry.OutboxSender) this.f23491i).lambda$processFile$0((java.io.File) this.j, (io.sentry.hints.Retryable) obj);
                break;
        }
    }
}
