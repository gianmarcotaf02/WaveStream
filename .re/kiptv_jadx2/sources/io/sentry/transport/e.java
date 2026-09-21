package io.sentry.transport;

import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.util.HintUtils;

public final class e implements HintUtils.SentryConsumer {

    public final int f23554h;

    public e(int i3) {
        this.f23554h = i3;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f23554h) {
            case 0:
                ((Retryable) obj).setRetry(true);
                break;
            case 1:
                ((Retryable) obj).setRetry(true);
                break;
            case 2:
                ((SubmissionResult) obj).setResult(false);
                break;
            default:
                ((SubmissionResult) obj).setResult(false);
                break;
        }
    }
}
