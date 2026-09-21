package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
final class SentryRuntimeEventProcessor implements io.sentry.EventProcessor {
    private final java.lang.String javaVendor;
    private final java.lang.String javaVersion;

    public SentryRuntimeEventProcessor(java.lang.String str, java.lang.String str2) {
        this.javaVersion = str;
        this.javaVendor = str2;
    }

    @Override // io.sentry.EventProcessor
    public java.lang.Long getOrder() {
        return 2000L;
    }

    @Override // io.sentry.EventProcessor
    public io.sentry.SentryEvent process(io.sentry.SentryEvent sentryEvent, io.sentry.Hint hint) {
        return (io.sentry.SentryEvent) process(sentryEvent);
    }

    @Override // io.sentry.EventProcessor
    public io.sentry.protocol.SentryTransaction process(io.sentry.protocol.SentryTransaction sentryTransaction, io.sentry.Hint hint) {
        return (io.sentry.protocol.SentryTransaction) process(sentryTransaction);
    }

    private <T extends io.sentry.SentryBaseEvent> T process(T t9) {
        if (t9.getContexts().getRuntime() == null) {
            t9.getContexts().setRuntime(new io.sentry.protocol.SentryRuntime());
        }
        io.sentry.protocol.SentryRuntime runtime = t9.getContexts().getRuntime();
        if (runtime != null && runtime.getName() == null && runtime.getVersion() == null) {
            runtime.setName(this.javaVendor);
            runtime.setVersion(this.javaVersion);
        }
        return t9;
    }

    public SentryRuntimeEventProcessor() {
        this(java.lang.System.getProperty("java.version"), java.lang.System.getProperty("java.vendor"));
    }
}
