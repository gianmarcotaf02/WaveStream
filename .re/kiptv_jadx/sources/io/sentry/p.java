package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23527b;

    public /* synthetic */ p(int i3, java.lang.Object obj) {
        this.f23526a = i3;
        this.f23527b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        switch (this.f23526a) {
            case 0:
                return io.sentry.SentryEnvelopeItem.lambda$fromSession$1((io.sentry.SentryEnvelopeItem.CachedItem) this.f23527b);
            case 1:
                return ((io.sentry.SentryEnvelopeItem.CachedItem) this.f23527b).getBytes();
            case 2:
                return io.sentry.SentryEnvelopeItem.lambda$fromEvent$4((io.sentry.SentryEnvelopeItem.CachedItem) this.f23527b);
            case 3:
                return ((io.sentry.SentryEnvelopeItem.CachedItem) this.f23527b).getBytes();
            case 4:
                return io.sentry.SentryEnvelopeItem.lambda$fromUserFeedback$7((io.sentry.SentryEnvelopeItem.CachedItem) this.f23527b);
            case 5:
                return ((io.sentry.SentryEnvelopeItem.CachedItem) this.f23527b).getBytes();
            case 6:
                return io.sentry.SentryEnvelopeItem.lambda$fromClientReport$19((io.sentry.SentryEnvelopeItem.CachedItem) this.f23527b);
            case 7:
                return io.sentry.SentryEnvelopeItem.lambda$fromReplay$22((io.sentry.SentryEnvelopeItem.CachedItem) this.f23527b);
            case 8:
                return ((io.sentry.SentryEnvelopeItem.CachedItem) this.f23527b).getBytes();
            case 9:
                return io.sentry.SentryEnvelopeItem.lambda$fromCheckIn$10((io.sentry.SentryEnvelopeItem.CachedItem) this.f23527b);
            case 10:
                return ((io.sentry.SentryEnvelopeItem.CachedItem) this.f23527b).getBytes();
            case 11:
                return ((io.sentry.SentryEnvelopeItem.CachedItem) this.f23527b).getBytes();
            case 12:
                return io.sentry.SentryEnvelopeItem.lambda$fromAttachment$13((io.sentry.SentryEnvelopeItem.CachedItem) this.f23527b);
            case 13:
                return ((io.sentry.SentryEnvelopeItem.CachedItem) this.f23527b).getBytes();
            case 14:
                return io.sentry.SentryEnvelopeItem.lambda$fromProfilingTrace$16((io.sentry.SentryEnvelopeItem.CachedItem) this.f23527b);
            case 15:
                return ((io.sentry.SentryEnvelopeItem.CachedItem) this.f23527b).getBytes();
            default:
                return ((io.sentry.HostnameCache) this.f23527b).lambda$updateCache$1();
        }
    }
}
