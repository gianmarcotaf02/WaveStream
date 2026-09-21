package io.sentry.instrumentation.file;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryFileWriter extends java.io.OutputStreamWriter {
    public SentryFileWriter(java.lang.String str) {
        super(new io.sentry.instrumentation.file.SentryFileOutputStream(str));
    }

    public SentryFileWriter(java.lang.String str, boolean z6) {
        super(new io.sentry.instrumentation.file.SentryFileOutputStream(str, z6));
    }

    public SentryFileWriter(java.io.File file) {
        super(new io.sentry.instrumentation.file.SentryFileOutputStream(file));
    }

    public SentryFileWriter(java.io.File file, boolean z6) {
        super(new io.sentry.instrumentation.file.SentryFileOutputStream(file, z6));
    }

    public SentryFileWriter(java.io.FileDescriptor fileDescriptor) {
        super(new io.sentry.instrumentation.file.SentryFileOutputStream(fileDescriptor));
    }

    public SentryFileWriter(java.io.File file, boolean z6, io.sentry.IScopes iScopes) {
        super(new io.sentry.instrumentation.file.SentryFileOutputStream(file, z6, iScopes));
    }
}
