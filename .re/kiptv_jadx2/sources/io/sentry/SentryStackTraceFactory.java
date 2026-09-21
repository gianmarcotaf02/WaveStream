package io.sentry;

import io.sentry.protocol.SentryStackFrame;
import io.sentry.util.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class SentryStackTraceFactory {
    private static final int STACKTRACE_FRAME_LIMIT = 100;
    private final SentryOptions options;

    public SentryStackTraceFactory(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    public static boolean lambda$getInAppCallStack$0(SentryStackFrame sentryStackFrame) {
        return Boolean.TRUE.equals(sentryStackFrame.isInApp());
    }

    public static boolean lambda$getInAppCallStack$1(SentryStackFrame sentryStackFrame) {
        String module = sentryStackFrame.getModule();
        boolean z6 = false;
        if (module != null && (module.startsWith("sun.") || module.startsWith("java.") || module.startsWith("android.") || module.startsWith("com.android."))) {
            z6 = true;
        }
        return !z6;
    }

    public List<SentryStackFrame> getInAppCallStack(Throwable th) {
        List<SentryStackFrame> stackFrames = getStackFrames(th.getStackTrace(), false);
        if (stackFrames == null) {
            return Collections.EMPTY_LIST;
        }
        List<SentryStackFrame> listFilterListEntries = CollectionUtils.filterListEntries(stackFrames, new g(7));
        return !listFilterListEntries.isEmpty() ? listFilterListEntries : CollectionUtils.filterListEntries(stackFrames, new g(8));
    }

    public List<SentryStackFrame> getStackFrames(StackTraceElement[] stackTraceElementArr, boolean z6) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z6 || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    SentryStackFrame sentryStackFrame = new SentryStackFrame();
                    sentryStackFrame.setInApp(isInApp(className));
                    sentryStackFrame.setModule(className);
                    sentryStackFrame.setFunction(stackTraceElement.getMethodName());
                    sentryStackFrame.setFilename(stackTraceElement.getFileName());
                    if (stackTraceElement.getLineNumber() >= 0) {
                        sentryStackFrame.setLineno(Integer.valueOf(stackTraceElement.getLineNumber()));
                    }
                    sentryStackFrame.setNative(Boolean.valueOf(stackTraceElement.isNativeMethod()));
                    arrayList.add(sentryStackFrame);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public Boolean isInApp(String str) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator<String> it = this.options.getInAppIncludes().iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it2 = this.options.getInAppExcludes().iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public List<SentryStackFrame> getInAppCallStack() {
        return getInAppCallStack(new Exception());
    }
}
