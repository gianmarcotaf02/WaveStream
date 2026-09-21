package io.sentry;

import io.sentry.util.Objects;
import io.sentry.util.SentryRandom;
import java.util.Collections;
import java.util.Map;

public final class SamplingContext {
    private final Map<String, Object> attributes;
    private final CustomSamplingContext customSamplingContext;
    private final Double sampleRand;
    private final TransactionContext transactionContext;

    @Deprecated
    public SamplingContext(TransactionContext transactionContext, CustomSamplingContext customSamplingContext) {
        this(transactionContext, customSamplingContext, Double.valueOf(SentryRandom.current().nextDouble()), null);
    }

    public Object getAttribute(String str) {
        if (str == null) {
            return null;
        }
        return this.attributes.get(str);
    }

    public CustomSamplingContext getCustomSamplingContext() {
        return this.customSamplingContext;
    }

    public Double getSampleRand() {
        return this.sampleRand;
    }

    public TransactionContext getTransactionContext() {
        return this.transactionContext;
    }

    public SamplingContext(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, Double d4, Map<String, Object> map) {
        this.transactionContext = (TransactionContext) Objects.requireNonNull(transactionContext, "transactionContexts is required");
        this.customSamplingContext = customSamplingContext;
        this.sampleRand = d4;
        this.attributes = map == null ? Collections.EMPTY_MAP : map;
    }
}
