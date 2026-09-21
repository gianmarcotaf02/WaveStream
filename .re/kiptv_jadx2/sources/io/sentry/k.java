package io.sentry;

public final class k implements Runnable {

    public final int f23513h;

    public final SentryOptions f23514i;

    public k(SentryOptions sentryOptions, int i3) {
        this.f23513h = i3;
        this.f23514i = sentryOptions;
    }

    @Override
    public final void run() {
        switch (this.f23513h) {
            case 0:
                Sentry.lambda$handleAppStartProfilingConfig$3(this.f23514i);
                break;
            case 1:
                Sentry.lambda$notifyOptionsObservers$4(this.f23514i);
                break;
            default:
                this.f23514i.loadLazyFields();
                break;
        }
    }
}
