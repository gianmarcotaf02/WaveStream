package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class TransactionOptions extends io.sentry.SpanOptions {
    public static final long DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION = 30000;
    private io.sentry.CustomSamplingContext customSamplingContext = null;
    private boolean isAppStartTransaction = false;
    private boolean waitForChildren = false;
    private java.lang.Long idleTimeout = null;
    private java.lang.Long deadlineTimeout = null;
    private io.sentry.TransactionFinishedCallback transactionFinishedCallback = null;
    private io.sentry.ISpanFactory spanFactory = null;

    public io.sentry.CustomSamplingContext getCustomSamplingContext() {
        return this.customSamplingContext;
    }

    public java.lang.Long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    public java.lang.Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public io.sentry.ISpanFactory getSpanFactory() {
        return this.spanFactory;
    }

    public io.sentry.TransactionFinishedCallback getTransactionFinishedCallback() {
        return this.transactionFinishedCallback;
    }

    public boolean isAppStartTransaction() {
        return this.isAppStartTransaction;
    }

    public boolean isBindToScope() {
        return io.sentry.ScopeBindingMode.ON == getScopeBindingMode();
    }

    public boolean isWaitForChildren() {
        return this.waitForChildren;
    }

    public void setAppStartTransaction(boolean z6) {
        this.isAppStartTransaction = z6;
    }

    public void setBindToScope(boolean z6) {
        setScopeBindingMode(z6 ? io.sentry.ScopeBindingMode.ON : io.sentry.ScopeBindingMode.OFF);
    }

    public void setCustomSamplingContext(io.sentry.CustomSamplingContext customSamplingContext) {
        this.customSamplingContext = customSamplingContext;
    }

    public void setDeadlineTimeout(java.lang.Long l2) {
        this.deadlineTimeout = l2;
    }

    public void setIdleTimeout(java.lang.Long l2) {
        this.idleTimeout = l2;
    }

    public void setSpanFactory(io.sentry.ISpanFactory iSpanFactory) {
        this.spanFactory = iSpanFactory;
    }

    public void setTransactionFinishedCallback(io.sentry.TransactionFinishedCallback transactionFinishedCallback) {
        this.transactionFinishedCallback = transactionFinishedCallback;
    }

    public void setWaitForChildren(boolean z6) {
        this.waitForChildren = z6;
    }
}
