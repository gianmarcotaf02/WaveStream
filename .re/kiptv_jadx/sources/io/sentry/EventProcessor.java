package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface EventProcessor {
    default java.lang.Long getOrder() {
        return null;
    }

    default io.sentry.SentryEvent process(io.sentry.SentryEvent sentryEvent, io.sentry.Hint hint) {
        return sentryEvent;
    }

    default io.sentry.SentryReplayEvent process(io.sentry.SentryReplayEvent sentryReplayEvent, io.sentry.Hint hint) {
        return sentryReplayEvent;
    }

    default io.sentry.protocol.SentryTransaction process(io.sentry.protocol.SentryTransaction sentryTransaction, io.sentry.Hint hint) {
        return sentryTransaction;
    }
}
