package io.sentry;

import io.sentry.hints.Retryable;
import io.sentry.util.HintUtils;

public final class h implements ScopeCallback, HintUtils.SentryConsumer {

    public final int f23493h;

    public final boolean f23494i;

    public h(boolean z6, int i3) {
        this.f23493h = i3;
        this.f23494i = z6;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f23493h) {
            case 3:
                ((Retryable) obj).setRetry(this.f23494i);
                break;
            default:
                ((Retryable) obj).setRetry(this.f23494i);
                break;
        }
    }

    @Override
    public void run(IScope iScope) {
        switch (this.f23493h) {
            case 0:
                Scopes.lambda$close$3(this.f23494i, iScope);
                break;
            case 1:
                Scopes.lambda$close$4(this.f23494i, iScope);
                break;
            default:
                Scopes.lambda$close$5(this.f23494i, iScope);
                break;
        }
    }
}
