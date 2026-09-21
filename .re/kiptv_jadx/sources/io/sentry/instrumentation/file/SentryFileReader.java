package io.sentry.instrumentation.file;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryFileReader extends java.io.InputStreamReader {
    public SentryFileReader(java.lang.String str) {
        super(new io.sentry.instrumentation.file.SentryFileInputStream(str));
    }

    public SentryFileReader(java.io.File file) {
        super(new io.sentry.instrumentation.file.SentryFileInputStream(file));
    }

    public SentryFileReader(java.io.FileDescriptor fileDescriptor) {
        super(new io.sentry.instrumentation.file.SentryFileInputStream(fileDescriptor));
    }

    public SentryFileReader(java.io.File file, io.sentry.IScopes iScopes) {
        super(new io.sentry.instrumentation.file.SentryFileInputStream(file, iScopes));
    }
}
