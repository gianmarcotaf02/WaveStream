package io.sentry.transport;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements io.sentry.util.HintUtils.SentryNullableConsumer, io.sentry.util.HintUtils.SentryHintFallback, io.sentry.util.HintUtils.SentryConsumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.sentry.transport.AsyncHttpTransport.EnvelopeSender f23553i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ d(io.sentry.transport.AsyncHttpTransport.EnvelopeSender envelopeSender, java.lang.Object obj, int i3) {
        this.f23552h = i3;
        this.f23553i = envelopeSender;
        this.j = obj;
    }

    @Override // io.sentry.util.HintUtils.SentryNullableConsumer, io.sentry.util.HintUtils.SentryConsumer
    public void accept(java.lang.Object obj) {
        switch (this.f23552h) {
            case 0:
                this.f23553i.lambda$flush$2((io.sentry.SentryEnvelope) this.j, obj);
                break;
            default:
                this.f23553i.lambda$run$0((io.sentry.transport.TransportResult) this.j, (io.sentry.hints.SubmissionResult) obj);
                break;
        }
    }

    @Override // io.sentry.util.HintUtils.SentryHintFallback
    public void accept(java.lang.Object obj, java.lang.Class cls) {
        this.f23553i.lambda$flush$4((io.sentry.SentryEnvelope) this.j, obj, cls);
    }
}
