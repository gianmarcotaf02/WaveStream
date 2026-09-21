package io.sentry.android.core;

import io.sentry.ISpan;
import java.util.Comparator;

public final class o implements Comparator {
    @Override
    public final int compare(Object obj, Object obj2) {
        return SpanFrameMetricsCollector.lambda$new$0((ISpan) obj, (ISpan) obj2);
    }
}
