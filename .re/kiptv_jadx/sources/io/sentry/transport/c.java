package io.sentry.transport;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements io.sentry.util.HintUtils.SentryConsumer, io.sentry.util.HintUtils.SentryHintFallback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ io.sentry.transport.AsyncHttpTransport.EnvelopeSender f23551h;

    public /* synthetic */ c(io.sentry.transport.AsyncHttpTransport.EnvelopeSender envelopeSender) {
        this.f23551h = envelopeSender;
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(java.lang.Object obj) {
        this.f23551h.lambda$flush$1((io.sentry.hints.DiskFlushNotification) obj);
    }

    @Override // io.sentry.util.HintUtils.SentryHintFallback
    public void accept(java.lang.Object obj, java.lang.Class cls) {
        this.f23551h.lambda$flush$6(obj, cls);
    }
}
