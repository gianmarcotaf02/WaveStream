package io.sentry.instrumentation.file;

/* JADX INFO: loaded from: classes4.dex */
final class FileIOSpanManager {
    private long byteCount;
    private final io.sentry.ISpan currentSpan;
    private final java.io.File file;
    private final io.sentry.SentryOptions options;
    private io.sentry.SpanStatus spanStatus = io.sentry.SpanStatus.OK;
    private final io.sentry.SentryStackTraceFactory stackTraceFactory;

    @java.lang.FunctionalInterface
    public interface FileIOCallable<T> {
        T call();
    }

    public FileIOSpanManager(io.sentry.ISpan iSpan, java.io.File file, io.sentry.SentryOptions sentryOptions) {
        this.currentSpan = iSpan;
        this.file = file;
        this.options = sentryOptions;
        this.stackTraceFactory = new io.sentry.SentryStackTraceFactory(sentryOptions);
        io.sentry.SentryIntegrationPackageStorage.getInstance().addIntegration("FileIO");
    }

    private void finishSpan() {
        if (this.currentSpan != null) {
            java.lang.String strByteCountToString = io.sentry.util.StringUtils.byteCountToString(this.byteCount);
            java.io.File file = this.file;
            if (file != null) {
                this.currentSpan.setDescription(getDescription(file));
                if (this.options.isSendDefaultPii()) {
                    this.currentSpan.setData("file.path", this.file.getAbsolutePath());
                }
            } else {
                this.currentSpan.setDescription(strByteCountToString);
            }
            this.currentSpan.setData("file.size", java.lang.Long.valueOf(this.byteCount));
            boolean zIsMainThread = this.options.getThreadChecker().isMainThread();
            this.currentSpan.setData(io.sentry.SpanDataConvention.BLOCKED_MAIN_THREAD_KEY, java.lang.Boolean.valueOf(zIsMainThread));
            if (zIsMainThread) {
                this.currentSpan.setData(io.sentry.SpanDataConvention.CALL_STACK_KEY, this.stackTraceFactory.getInAppCallStack());
            }
            this.currentSpan.finish(this.spanStatus);
        }
    }

    private java.lang.String getDescription(java.io.File file) {
        java.lang.String strByteCountToString = io.sentry.util.StringUtils.byteCountToString(this.byteCount);
        if (!this.options.isSendDefaultPii()) {
            int iLastIndexOf = file.getName().lastIndexOf(46);
            return (iLastIndexOf <= 0 || iLastIndexOf >= file.getName().length() + (-1)) ? Y6.f.h("*** (", strByteCountToString, ")") : Y6.f.i("***", file.getName().substring(iLastIndexOf), " (", strByteCountToString, ")");
        }
        return file.getName() + " (" + strByteCountToString + ")";
    }

    public static io.sentry.ISpan startSpan(io.sentry.IScopes iScopes, java.lang.String str) {
        io.sentry.ISpan transaction = io.sentry.util.Platform.isAndroid() ? iScopes.getTransaction() : iScopes.getSpan();
        if (transaction != null) {
            return transaction.startChild(str);
        }
        return null;
    }

    public void finish(java.io.Closeable closeable) {
        try {
            try {
                closeable.close();
                finishSpan();
            } catch (java.io.IOException e6) {
                this.spanStatus = io.sentry.SpanStatus.INTERNAL_ERROR;
                if (this.currentSpan != null) {
                    this.currentSpan.setThrowable(e6);
                }
                throw e6;
            }
        } catch (java.lang.Throwable th) {
            finishSpan();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T performIO(io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable<T> fileIOCallable) throws java.io.IOException {
        try {
            T tCall = fileIOCallable.call();
            if (tCall instanceof java.lang.Integer) {
                int iIntValue = ((java.lang.Integer) tCall).intValue();
                if (iIntValue != -1) {
                    this.byteCount += (long) iIntValue;
                    return tCall;
                }
            } else if (tCall instanceof java.lang.Long) {
                long jLongValue = ((java.lang.Long) tCall).longValue();
                if (jLongValue != -1) {
                    this.byteCount += jLongValue;
                }
            }
            return tCall;
        } catch (java.io.IOException e6) {
            this.spanStatus = io.sentry.SpanStatus.INTERNAL_ERROR;
            io.sentry.ISpan iSpan = this.currentSpan;
            if (iSpan != null) {
                iSpan.setThrowable(e6);
            }
            throw e6;
        }
    }
}
