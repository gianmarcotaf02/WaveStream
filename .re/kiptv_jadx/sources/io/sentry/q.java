package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23533c;

    public /* synthetic */ q(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f23531a = i3;
        this.f23532b = obj;
        this.f23533c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        switch (this.f23531a) {
            case 0:
                return io.sentry.SentryEnvelopeItem.lambda$fromEvent$3((io.sentry.ISerializer) this.f23532b, (io.sentry.SentryBaseEvent) this.f23533c);
            case 1:
                return io.sentry.SentryEnvelopeItem.lambda$fromUserFeedback$6((io.sentry.ISerializer) this.f23532b, (io.sentry.UserFeedback) this.f23533c);
            case 2:
                return io.sentry.SentryEnvelopeItem.lambda$fromClientReport$18((io.sentry.ISerializer) this.f23532b, (io.sentry.clientreport.ClientReport) this.f23533c);
            case 3:
                return io.sentry.SentryEnvelopeItem.lambda$fromCheckIn$9((io.sentry.ISerializer) this.f23532b, (io.sentry.CheckIn) this.f23533c);
            case 4:
                return io.sentry.SentryEnvelopeItem.lambda$fromSession$0((io.sentry.ISerializer) this.f23532b, (io.sentry.Session) this.f23533c);
            default:
                return io.sentry.SentryWrapper.lambda$wrapCallable$0((io.sentry.IScopes) this.f23532b, (java.util.concurrent.Callable) this.f23533c);
        }
    }
}
