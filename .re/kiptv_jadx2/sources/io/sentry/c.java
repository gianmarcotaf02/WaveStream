package io.sentry;

import io.sentry.hints.Flushable;
import io.sentry.util.HintUtils;
import java.util.concurrent.atomic.AtomicReference;

public final class c implements HintUtils.SentryConsumer, ScopeCallback {

    public final int f23480h;

    public final Object f23481i;

    public c(int i3, Object obj) {
        this.f23480h = i3;
        this.f23481i = obj;
    }

    @Override
    public void accept(Object obj) {
        ((EnvelopeSender) this.f23481i).lambda$processFile$0((Flushable) obj);
    }

    @Override
    public void run(IScope iScope) {
        switch (this.f23480h) {
            case 1:
                Scopes.lambda$continueTrace$7((PropagationContext) this.f23481i, iScope);
                break;
            default:
                SentryTracer.lambda$updateBaggageValues$4((AtomicReference) this.f23481i, iScope);
                break;
        }
    }
}
