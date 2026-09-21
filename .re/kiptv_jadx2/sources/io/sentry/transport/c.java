package io.sentry.transport;

import io.sentry.hints.DiskFlushNotification;
import io.sentry.util.HintUtils;

public final class c implements HintUtils.SentryConsumer, HintUtils.SentryHintFallback {

    public final AsyncHttpTransport.EnvelopeSender f23551h;

    public c(AsyncHttpTransport.EnvelopeSender envelopeSender) {
        this.f23551h = envelopeSender;
    }

    @Override
    public void accept(Object obj) {
        this.f23551h.lambda$flush$1((DiskFlushNotification) obj);
    }

    @Override
    public void accept(Object obj, Class cls) {
        this.f23551h.lambda$flush$6(obj, cls);
    }
}
