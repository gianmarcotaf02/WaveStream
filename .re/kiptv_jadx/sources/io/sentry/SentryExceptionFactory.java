package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryExceptionFactory {
    private final io.sentry.SentryStackTraceFactory sentryStackTraceFactory;

    public SentryExceptionFactory(io.sentry.SentryStackTraceFactory sentryStackTraceFactory) {
        this.sentryStackTraceFactory = (io.sentry.SentryStackTraceFactory) io.sentry.util.Objects.requireNonNull(sentryStackTraceFactory, "The SentryStackTraceFactory is required.");
    }

    private io.sentry.protocol.SentryException getSentryException(java.lang.Throwable th, io.sentry.protocol.Mechanism mechanism, java.lang.Long l2, java.util.List<io.sentry.protocol.SentryStackFrame> list, boolean z6) {
        java.lang.Package r9 = th.getClass().getPackage();
        java.lang.String name = th.getClass().getName();
        io.sentry.protocol.SentryException sentryException = new io.sentry.protocol.SentryException();
        java.lang.String message = th.getMessage();
        if (r9 != null) {
            name = name.replace(r9.getName() + ".", "");
        }
        java.lang.String name2 = r9 != null ? r9.getName() : null;
        if (list != null && !list.isEmpty()) {
            io.sentry.protocol.SentryStackTrace sentryStackTrace = new io.sentry.protocol.SentryStackTrace(list);
            if (z6) {
                sentryStackTrace.setSnapshot(java.lang.Boolean.TRUE);
            }
            sentryException.setStacktrace(sentryStackTrace);
        }
        sentryException.setThreadId(l2);
        sentryException.setType(name);
        sentryException.setMechanism(mechanism);
        sentryException.setModule(name2);
        sentryException.setValue(message);
        return sentryException;
    }

    public java.util.Deque<io.sentry.protocol.SentryException> extractExceptionQueue(java.lang.Throwable th) {
        return extractExceptionQueueInternal(th, new java.util.concurrent.atomic.AtomicInteger(-1), new java.util.HashSet<>(), new java.util.ArrayDeque(), null);
    }

    public java.util.Deque<io.sentry.protocol.SentryException> extractExceptionQueueInternal(java.lang.Throwable th, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.HashSet<java.lang.Throwable> hashSet, java.util.Deque<io.sentry.protocol.SentryException> deque, java.lang.String str) {
        io.sentry.protocol.Mechanism mechanism;
        java.lang.Thread threadCurrentThread;
        java.lang.Throwable th2;
        boolean zIsSnapshot;
        java.lang.String str2 = str;
        int i3 = atomicInteger.get();
        java.lang.Throwable cause = th;
        while (cause != null) {
            java.util.HashSet<java.lang.Throwable> hashSet2 = hashSet;
            if (!hashSet2.add(cause)) {
                break;
            }
            if (str2 == null) {
                str2 = "chained";
            }
            int i9 = 0;
            if (cause instanceof io.sentry.exception.ExceptionMechanismException) {
                io.sentry.exception.ExceptionMechanismException exceptionMechanismException = (io.sentry.exception.ExceptionMechanismException) cause;
                mechanism = exceptionMechanismException.getExceptionMechanism();
                java.lang.Throwable throwable = exceptionMechanismException.getThrowable();
                threadCurrentThread = exceptionMechanismException.getThread();
                zIsSnapshot = exceptionMechanismException.isSnapshot();
                th2 = throwable;
            } else {
                mechanism = new io.sentry.protocol.Mechanism();
                threadCurrentThread = java.lang.Thread.currentThread();
                th2 = cause;
                zIsSnapshot = false;
            }
            io.sentry.protocol.Mechanism mechanism2 = mechanism;
            deque.addFirst(getSentryException(th2, mechanism2, java.lang.Long.valueOf(threadCurrentThread.getId()), this.sentryStackTraceFactory.getStackFrames(th2.getStackTrace(), java.lang.Boolean.FALSE.equals(mechanism2.isHandled())), zIsSnapshot));
            if (mechanism2.getType() == null) {
                mechanism2.setType(str2);
            }
            if (atomicInteger.get() >= 0) {
                mechanism2.setParentId(java.lang.Integer.valueOf(i3));
            }
            int iIncrementAndGet = atomicInteger.incrementAndGet();
            mechanism2.setExceptionId(java.lang.Integer.valueOf(iIncrementAndGet));
            java.lang.Throwable[] suppressed = th2.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                int length = suppressed.length;
                while (i9 < length) {
                    extractExceptionQueueInternal(suppressed[i9], atomicInteger, hashSet2, deque, "suppressed");
                    i9++;
                    hashSet2 = hashSet;
                    deque = deque;
                }
            }
            cause = th2.getCause();
            str2 = null;
            i3 = iIncrementAndGet;
        }
        return deque;
    }

    public java.util.List<io.sentry.protocol.SentryException> getSentryExceptions(java.lang.Throwable th) {
        return getSentryExceptions(extractExceptionQueue(th));
    }

    public java.util.List<io.sentry.protocol.SentryException> getSentryExceptionsFromThread(io.sentry.protocol.SentryThread sentryThread, io.sentry.protocol.Mechanism mechanism, java.lang.Throwable th) {
        io.sentry.protocol.SentryStackTrace stacktrace = sentryThread.getStacktrace();
        if (stacktrace == null) {
            return new java.util.ArrayList(0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(getSentryException(th, mechanism, sentryThread.getId(), stacktrace.getFrames(), true));
        return arrayList;
    }

    private java.util.List<io.sentry.protocol.SentryException> getSentryExceptions(java.util.Deque<io.sentry.protocol.SentryException> deque) {
        return new java.util.ArrayList(deque);
    }
}
