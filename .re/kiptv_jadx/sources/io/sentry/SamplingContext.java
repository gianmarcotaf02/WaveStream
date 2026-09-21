package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SamplingContext {
    private final java.util.Map<java.lang.String, java.lang.Object> attributes;
    private final io.sentry.CustomSamplingContext customSamplingContext;
    private final java.lang.Double sampleRand;
    private final io.sentry.TransactionContext transactionContext;

    @java.lang.Deprecated
    public SamplingContext(io.sentry.TransactionContext transactionContext, io.sentry.CustomSamplingContext customSamplingContext) {
        this(transactionContext, customSamplingContext, java.lang.Double.valueOf(io.sentry.util.SentryRandom.current().nextDouble()), null);
    }

    public java.lang.Object getAttribute(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return this.attributes.get(str);
    }

    public io.sentry.CustomSamplingContext getCustomSamplingContext() {
        return this.customSamplingContext;
    }

    public java.lang.Double getSampleRand() {
        return this.sampleRand;
    }

    public io.sentry.TransactionContext getTransactionContext() {
        return this.transactionContext;
    }

    public SamplingContext(io.sentry.TransactionContext transactionContext, io.sentry.CustomSamplingContext customSamplingContext, java.lang.Double d4, java.util.Map<java.lang.String, java.lang.Object> map) {
        this.transactionContext = (io.sentry.TransactionContext) io.sentry.util.Objects.requireNonNull(transactionContext, "transactionContexts is required");
        this.customSamplingContext = customSamplingContext;
        this.sampleRand = d4;
        this.attributes = map == null ? java.util.Collections.EMPTY_MAP : map;
    }
}
