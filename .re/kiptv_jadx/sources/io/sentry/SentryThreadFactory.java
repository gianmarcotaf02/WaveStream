package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryThreadFactory {
    private final io.sentry.SentryOptions options;
    private final io.sentry.SentryStackTraceFactory sentryStackTraceFactory;

    public SentryThreadFactory(io.sentry.SentryStackTraceFactory sentryStackTraceFactory, io.sentry.SentryOptions sentryOptions) {
        this.sentryStackTraceFactory = (io.sentry.SentryStackTraceFactory) io.sentry.util.Objects.requireNonNull(sentryStackTraceFactory, "The SentryStackTraceFactory is required.");
        this.options = (io.sentry.SentryOptions) io.sentry.util.Objects.requireNonNull(sentryOptions, "The SentryOptions is required");
    }

    private io.sentry.protocol.SentryThread getSentryThread(boolean z6, java.lang.StackTraceElement[] stackTraceElementArr, java.lang.Thread thread) {
        io.sentry.protocol.SentryThread sentryThread = new io.sentry.protocol.SentryThread();
        sentryThread.setName(thread.getName());
        sentryThread.setPriority(java.lang.Integer.valueOf(thread.getPriority()));
        sentryThread.setId(java.lang.Long.valueOf(thread.getId()));
        sentryThread.setDaemon(java.lang.Boolean.valueOf(thread.isDaemon()));
        sentryThread.setState(thread.getState().name());
        sentryThread.setCrashed(java.lang.Boolean.valueOf(z6));
        java.util.List<io.sentry.protocol.SentryStackFrame> stackFrames = this.sentryStackTraceFactory.getStackFrames(stackTraceElementArr, false);
        if (this.options.isAttachStacktrace() && stackFrames != null && !stackFrames.isEmpty()) {
            io.sentry.protocol.SentryStackTrace sentryStackTrace = new io.sentry.protocol.SentryStackTrace(stackFrames);
            sentryStackTrace.setSnapshot(java.lang.Boolean.TRUE);
            sentryThread.setStacktrace(sentryStackTrace);
        }
        return sentryThread;
    }

    public java.util.List<io.sentry.protocol.SentryThread> getCurrentThread() {
        java.util.HashMap map = new java.util.HashMap();
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        return getCurrentThreads(map, null, false);
    }

    public java.util.List<io.sentry.protocol.SentryThread> getCurrentThreads(java.util.List<java.lang.Long> list, boolean z6) {
        return getCurrentThreads(java.lang.Thread.getAllStackTraces(), list, z6);
    }

    public java.util.List<io.sentry.protocol.SentryThread> getCurrentThreads(java.util.List<java.lang.Long> list) {
        return getCurrentThreads(java.lang.Thread.getAllStackTraces(), list, false);
    }

    public java.util.List<io.sentry.protocol.SentryThread> getCurrentThreads(java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> map, java.util.List<java.lang.Long> list, boolean z6) {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]> entry : map.entrySet()) {
            java.lang.Thread key = entry.getKey();
            arrayList.add(getSentryThread((key == threadCurrentThread && !z6) || !(list == null || !list.contains(java.lang.Long.valueOf(key.getId())) || z6), entry.getValue(), entry.getKey()));
        }
        return arrayList;
    }
}
