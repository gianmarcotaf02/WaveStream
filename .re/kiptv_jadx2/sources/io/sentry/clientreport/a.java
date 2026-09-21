package io.sentry.clientreport;

import io.sentry.util.LazyEvaluator;

public final class a implements LazyEvaluator.Evaluator {
    @Override
    public final Object evaluate() {
        return AtomicClientReportStorage.lambda$new$0();
    }
}
