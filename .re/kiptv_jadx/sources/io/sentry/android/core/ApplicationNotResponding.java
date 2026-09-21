package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
final class ApplicationNotResponding extends java.lang.RuntimeException {
    private static final long serialVersionUID = 252541144579117016L;
    private final java.lang.Thread thread;

    public ApplicationNotResponding(java.lang.String str, java.lang.Thread thread) {
        super(str);
        java.lang.Thread thread2 = (java.lang.Thread) io.sentry.util.Objects.requireNonNull(thread, "Thread must be provided.");
        this.thread = thread2;
        setStackTrace(thread2.getStackTrace());
    }

    public java.lang.Thread getThread() {
        return this.thread;
    }
}
