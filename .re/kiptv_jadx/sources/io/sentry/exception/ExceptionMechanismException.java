package io.sentry.exception;

/* JADX INFO: loaded from: classes4.dex */
public final class ExceptionMechanismException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 142345454265713915L;
    private final io.sentry.protocol.Mechanism exceptionMechanism;
    private final boolean snapshot;
    private final java.lang.Thread thread;
    private final java.lang.Throwable throwable;

    public ExceptionMechanismException(io.sentry.protocol.Mechanism mechanism, java.lang.Throwable th, java.lang.Thread thread, boolean z6) {
        this.exceptionMechanism = (io.sentry.protocol.Mechanism) io.sentry.util.Objects.requireNonNull(mechanism, "Mechanism is required.");
        this.throwable = (java.lang.Throwable) io.sentry.util.Objects.requireNonNull(th, "Throwable is required.");
        this.thread = (java.lang.Thread) io.sentry.util.Objects.requireNonNull(thread, "Thread is required.");
        this.snapshot = z6;
    }

    public io.sentry.protocol.Mechanism getExceptionMechanism() {
        return this.exceptionMechanism;
    }

    public java.lang.Thread getThread() {
        return this.thread;
    }

    public java.lang.Throwable getThrowable() {
        return this.throwable;
    }

    public boolean isSnapshot() {
        return this.snapshot;
    }

    public ExceptionMechanismException(io.sentry.protocol.Mechanism mechanism, java.lang.Throwable th, java.lang.Thread thread) {
        this(mechanism, th, thread, false);
    }
}
