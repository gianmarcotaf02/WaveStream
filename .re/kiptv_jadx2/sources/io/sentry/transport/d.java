package io.sentry.transport;

import io.sentry.SentryEnvelope;
import io.sentry.hints.SubmissionResult;
import io.sentry.util.HintUtils;

public final class d implements HintUtils.SentryNullableConsumer, HintUtils.SentryHintFallback, HintUtils.SentryConsumer {

    public final int f23552h;

    public final AsyncHttpTransport.EnvelopeSender f23553i;
    public final Object j;

    public d(AsyncHttpTransport.EnvelopeSender envelopeSender, Object obj, int i3) {
        this.f23552h = i3;
        this.f23553i = envelopeSender;
        this.j = obj;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f23552h) {
            case 0:
                this.f23553i.lambda$flush$2((SentryEnvelope) this.j, obj);
                break;
            default:
                this.f23553i.lambda$run$0((TransportResult) this.j, (SubmissionResult) obj);
                break;
        }
    }

    @Override
    public void accept(Object obj, Class cls) {
        this.f23553i.lambda$flush$4((SentryEnvelope) this.j, obj, cls);
    }
}
