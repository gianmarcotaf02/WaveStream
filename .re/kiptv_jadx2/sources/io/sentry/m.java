package io.sentry;

import io.sentry.util.LazyEvaluator;

public final class m implements Sentry.OptionsConfiguration, LazyEvaluator.Evaluator {

    public final String f23517h;

    public m(String str) {
        this.f23517h = str;
    }

    @Override
    public void configure(SentryOptions sentryOptions) {
        sentryOptions.setDsn(this.f23517h);
    }

    @Override
    public Object evaluate() {
        return SpanId.lambda$new$0(this.f23517h);
    }
}
