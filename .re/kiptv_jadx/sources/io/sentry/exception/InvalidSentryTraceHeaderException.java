package io.sentry.exception;

/* JADX INFO: loaded from: classes4.dex */
public final class InvalidSentryTraceHeaderException extends java.lang.Exception {
    private static final long serialVersionUID = -8353316997083420940L;
    private final java.lang.String sentryTraceHeader;

    public InvalidSentryTraceHeaderException(java.lang.String str) {
        this(str, null);
    }

    public java.lang.String getSentryTraceHeader() {
        return this.sentryTraceHeader;
    }

    public InvalidSentryTraceHeaderException(java.lang.String str, java.lang.Throwable th) {
        super(p121o0.p.C("sentry-trace header does not conform to expected format: ", str), th);
        this.sentryTraceHeader = str;
    }
}
