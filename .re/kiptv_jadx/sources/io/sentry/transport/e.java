package io.sentry.transport;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements io.sentry.util.HintUtils.SentryConsumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23554h;

    public /* synthetic */ e(int i3) {
        this.f23554h = i3;
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public final void accept(java.lang.Object obj) {
        switch (this.f23554h) {
            case 0:
                ((io.sentry.hints.Retryable) obj).setRetry(true);
                break;
            case 1:
                ((io.sentry.hints.Retryable) obj).setRetry(true);
                break;
            case 2:
                ((io.sentry.hints.SubmissionResult) obj).setResult(false);
                break;
            default:
                ((io.sentry.hints.SubmissionResult) obj).setResult(false);
                break;
        }
    }
}
