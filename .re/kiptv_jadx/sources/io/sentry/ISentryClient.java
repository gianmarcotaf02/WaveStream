package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface ISentryClient {
    io.sentry.protocol.SentryId captureCheckIn(io.sentry.CheckIn checkIn, io.sentry.IScope iScope, io.sentry.Hint hint);

    default io.sentry.protocol.SentryId captureEnvelope(io.sentry.SentryEnvelope sentryEnvelope) {
        return captureEnvelope(sentryEnvelope, null);
    }

    io.sentry.protocol.SentryId captureEnvelope(io.sentry.SentryEnvelope sentryEnvelope, io.sentry.Hint hint);

    default io.sentry.protocol.SentryId captureEvent(io.sentry.SentryEvent sentryEvent) {
        return captureEvent(sentryEvent, null, null);
    }

    io.sentry.protocol.SentryId captureEvent(io.sentry.SentryEvent sentryEvent, io.sentry.IScope iScope, io.sentry.Hint hint);

    default io.sentry.protocol.SentryId captureException(java.lang.Throwable th) {
        return captureException(th, null, null);
    }

    default io.sentry.protocol.SentryId captureMessage(java.lang.String str, io.sentry.SentryLevel sentryLevel, io.sentry.IScope iScope) {
        io.sentry.SentryEvent sentryEvent = new io.sentry.SentryEvent();
        io.sentry.protocol.Message message = new io.sentry.protocol.Message();
        message.setFormatted(str);
        sentryEvent.setMessage(message);
        sentryEvent.setLevel(sentryLevel);
        return captureEvent(sentryEvent, iScope);
    }

    io.sentry.protocol.SentryId captureReplayEvent(io.sentry.SentryReplayEvent sentryReplayEvent, io.sentry.IScope iScope, io.sentry.Hint hint);

    default void captureSession(io.sentry.Session session) {
        captureSession(session, null);
    }

    void captureSession(io.sentry.Session session, io.sentry.Hint hint);

    default io.sentry.protocol.SentryId captureTransaction(io.sentry.protocol.SentryTransaction sentryTransaction, io.sentry.IScope iScope, io.sentry.Hint hint) {
        return captureTransaction(sentryTransaction, null, iScope, hint);
    }

    io.sentry.protocol.SentryId captureTransaction(io.sentry.protocol.SentryTransaction sentryTransaction, io.sentry.TraceContext traceContext, io.sentry.IScope iScope, io.sentry.Hint hint, io.sentry.ProfilingTraceData profilingTraceData);

    void captureUserFeedback(io.sentry.UserFeedback userFeedback);

    void close();

    void close(boolean z6);

    void flush(long j);

    io.sentry.transport.RateLimiter getRateLimiter();

    boolean isEnabled();

    default boolean isHealthy() {
        return true;
    }

    default io.sentry.protocol.SentryId captureEvent(io.sentry.SentryEvent sentryEvent, io.sentry.IScope iScope) {
        return captureEvent(sentryEvent, iScope, null);
    }

    default io.sentry.protocol.SentryId captureException(java.lang.Throwable th, io.sentry.IScope iScope, io.sentry.Hint hint) {
        return captureEvent(new io.sentry.SentryEvent(th), iScope, hint);
    }

    default io.sentry.protocol.SentryId captureTransaction(io.sentry.protocol.SentryTransaction sentryTransaction, io.sentry.TraceContext traceContext, io.sentry.IScope iScope, io.sentry.Hint hint) {
        return captureTransaction(sentryTransaction, traceContext, iScope, hint, null);
    }

    default io.sentry.protocol.SentryId captureEvent(io.sentry.SentryEvent sentryEvent, io.sentry.Hint hint) {
        return captureEvent(sentryEvent, null, hint);
    }

    default io.sentry.protocol.SentryId captureTransaction(io.sentry.protocol.SentryTransaction sentryTransaction, io.sentry.TraceContext traceContext) {
        return captureTransaction(sentryTransaction, traceContext, null, null);
    }

    default io.sentry.protocol.SentryId captureException(java.lang.Throwable th, io.sentry.Hint hint) {
        return captureException(th, null, hint);
    }

    default io.sentry.protocol.SentryId captureTransaction(io.sentry.protocol.SentryTransaction sentryTransaction) {
        return captureTransaction(sentryTransaction, null, null, null);
    }

    default io.sentry.protocol.SentryId captureException(java.lang.Throwable th, io.sentry.IScope iScope) {
        return captureException(th, iScope, null);
    }

    default io.sentry.protocol.SentryId captureMessage(java.lang.String str, io.sentry.SentryLevel sentryLevel) {
        return captureMessage(str, sentryLevel, null);
    }
}
