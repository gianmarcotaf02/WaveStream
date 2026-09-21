package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryStackTraceFactory {
    private static final int STACKTRACE_FRAME_LIMIT = 100;
    private final io.sentry.SentryOptions options;

    public SentryStackTraceFactory(io.sentry.SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getInAppCallStack$0(io.sentry.protocol.SentryStackFrame sentryStackFrame) {
        return java.lang.Boolean.TRUE.equals(sentryStackFrame.isInApp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getInAppCallStack$1(io.sentry.protocol.SentryStackFrame sentryStackFrame) {
        java.lang.String module = sentryStackFrame.getModule();
        boolean z6 = false;
        if (module != null && (module.startsWith("sun.") || module.startsWith("java.") || module.startsWith("android.") || module.startsWith("com.android."))) {
            z6 = true;
        }
        return !z6;
    }

    public java.util.List<io.sentry.protocol.SentryStackFrame> getInAppCallStack(java.lang.Throwable th) {
        java.util.List<io.sentry.protocol.SentryStackFrame> stackFrames = getStackFrames(th.getStackTrace(), false);
        if (stackFrames == null) {
            return java.util.Collections.EMPTY_LIST;
        }
        java.util.List<io.sentry.protocol.SentryStackFrame> listFilterListEntries = io.sentry.util.CollectionUtils.filterListEntries(stackFrames, new io.sentry.g(7));
        return !listFilterListEntries.isEmpty() ? listFilterListEntries : io.sentry.util.CollectionUtils.filterListEntries(stackFrames, new io.sentry.g(8));
    }

    public java.util.List<io.sentry.protocol.SentryStackFrame> getStackFrames(java.lang.StackTraceElement[] stackTraceElementArr, boolean z6) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                java.lang.String className = stackTraceElement.getClassName();
                if (z6 || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.SentryStackFrame sentryStackFrame = new io.sentry.protocol.SentryStackFrame();
                    sentryStackFrame.setInApp(isInApp(className));
                    sentryStackFrame.setModule(className);
                    sentryStackFrame.setFunction(stackTraceElement.getMethodName());
                    sentryStackFrame.setFilename(stackTraceElement.getFileName());
                    if (stackTraceElement.getLineNumber() >= 0) {
                        sentryStackFrame.setLineno(java.lang.Integer.valueOf(stackTraceElement.getLineNumber()));
                    }
                    sentryStackFrame.setNative(java.lang.Boolean.valueOf(stackTraceElement.isNativeMethod()));
                    arrayList.add(sentryStackFrame);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        java.util.Collections.reverse(arrayList);
        return arrayList;
    }

    public java.lang.Boolean isInApp(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return java.lang.Boolean.TRUE;
        }
        java.util.Iterator<java.lang.String> it = this.options.getInAppIncludes().iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return java.lang.Boolean.TRUE;
            }
        }
        java.util.Iterator<java.lang.String> it2 = this.options.getInAppExcludes().iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return java.lang.Boolean.FALSE;
            }
        }
        return null;
    }

    public java.util.List<io.sentry.protocol.SentryStackFrame> getInAppCallStack() {
        return getInAppCallStack(new java.lang.Exception());
    }
}
