package io.sentry.transport;

import io.sentry.hints.DiskFlushNotification;
import io.sentry.hints.Enqueable;
import io.sentry.util.HintUtils;
import java.io.Closeable;

public final class b implements HintUtils.SentryConsumer {

    public final int f23549h;

    public final Closeable f23550i;

    public b(Closeable closeable, int i3) {
        this.f23549h = i3;
        this.f23550i = closeable;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f23549h) {
            case 0:
                ((AsyncHttpTransport) this.f23550i).lambda$send$0((Enqueable) obj);
                break;
            default:
                ((RateLimiter) this.f23550i).lambda$markHintWhenSendingFailed$2((DiskFlushNotification) obj);
                break;
        }
    }
}
