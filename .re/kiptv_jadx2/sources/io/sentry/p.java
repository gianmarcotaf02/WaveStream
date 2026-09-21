package io.sentry;

import java.util.concurrent.Callable;

public final class p implements Callable {

    public final int f23526a;

    public final Object f23527b;

    public p(int i3, Object obj) {
        this.f23526a = i3;
        this.f23527b = obj;
    }

    @Override
    public final Object call() {
        switch (this.f23526a) {
            case 0:
                return SentryEnvelopeItem.lambda$fromSession$1((SentryEnvelopeItem.CachedItem) this.f23527b);
            case 1:
                return ((SentryEnvelopeItem.CachedItem) this.f23527b).getBytes();
            case 2:
                return SentryEnvelopeItem.lambda$fromEvent$4((SentryEnvelopeItem.CachedItem) this.f23527b);
            case 3:
                return ((SentryEnvelopeItem.CachedItem) this.f23527b).getBytes();
            case 4:
                return SentryEnvelopeItem.lambda$fromUserFeedback$7((SentryEnvelopeItem.CachedItem) this.f23527b);
            case 5:
                return ((SentryEnvelopeItem.CachedItem) this.f23527b).getBytes();
            case 6:
                return SentryEnvelopeItem.lambda$fromClientReport$19((SentryEnvelopeItem.CachedItem) this.f23527b);
            case 7:
                return SentryEnvelopeItem.lambda$fromReplay$22((SentryEnvelopeItem.CachedItem) this.f23527b);
            case 8:
                return ((SentryEnvelopeItem.CachedItem) this.f23527b).getBytes();
            case 9:
                return SentryEnvelopeItem.lambda$fromCheckIn$10((SentryEnvelopeItem.CachedItem) this.f23527b);
            case 10:
                return ((SentryEnvelopeItem.CachedItem) this.f23527b).getBytes();
            case 11:
                return ((SentryEnvelopeItem.CachedItem) this.f23527b).getBytes();
            case 12:
                return SentryEnvelopeItem.lambda$fromAttachment$13((SentryEnvelopeItem.CachedItem) this.f23527b);
            case 13:
                return ((SentryEnvelopeItem.CachedItem) this.f23527b).getBytes();
            case 14:
                return SentryEnvelopeItem.lambda$fromProfilingTrace$16((SentryEnvelopeItem.CachedItem) this.f23527b);
            case 15:
                return ((SentryEnvelopeItem.CachedItem) this.f23527b).getBytes();
            default:
                return ((HostnameCache) this.f23527b).lambda$updateCache$1();
        }
    }
}
