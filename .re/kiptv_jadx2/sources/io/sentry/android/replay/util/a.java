package io.sentry.android.replay.util;

import io.sentry.SentryOptions;

public final class a implements Runnable {

    public final int f23475h;

    public final Runnable f23476i;
    public final SentryOptions j;

    public final String f23477k;

    public a(Runnable runnable, SentryOptions sentryOptions, String str, int i3) {
        this.f23475h = i3;
        this.f23476i = runnable;
        this.j = sentryOptions;
        this.f23477k = str;
    }

    @Override
    public final void run() {
        switch (this.f23475h) {
            case 0:
                ExecutorsKt.scheduleAtFixedRateSafely$lambda$3(this.f23476i, this.j, this.f23477k);
                break;
            case 1:
                ExecutorsKt.submitSafely$lambda$2(this.f23476i, this.j, this.f23477k);
                break;
            default:
                ExecutorsKt.submitSafely$lambda$1(this.f23476i, this.j, this.f23477k);
                break;
        }
    }
}
