package io.sentry.instrumentation.file;

/* JADX INFO: loaded from: classes4.dex */
final class FileOutputStreamInitData {
    final boolean append;
    final java.io.FileOutputStream delegate;
    final java.io.File file;
    final io.sentry.SentryOptions options;
    final io.sentry.ISpan span;

    public FileOutputStreamInitData(java.io.File file, boolean z6, io.sentry.ISpan iSpan, java.io.FileOutputStream fileOutputStream, io.sentry.SentryOptions sentryOptions) {
        this.file = file;
        this.append = z6;
        this.span = iSpan;
        this.delegate = fileOutputStream;
        this.options = sentryOptions;
    }
}
