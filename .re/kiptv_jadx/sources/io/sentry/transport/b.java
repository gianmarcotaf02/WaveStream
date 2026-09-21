package io.sentry.transport;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements io.sentry.util.HintUtils.SentryConsumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.io.Closeable f23550i;

    public /* synthetic */ b(java.io.Closeable closeable, int i3) {
        this.f23549h = i3;
        this.f23550i = closeable;
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public final void accept(java.lang.Object obj) {
        switch (this.f23549h) {
            case 0:
                ((io.sentry.transport.AsyncHttpTransport) this.f23550i).lambda$send$0((io.sentry.hints.Enqueable) obj);
                break;
            default:
                ((io.sentry.transport.RateLimiter) this.f23550i).lambda$markHintWhenSendingFailed$2((io.sentry.hints.DiskFlushNotification) obj);
                break;
        }
    }
}
