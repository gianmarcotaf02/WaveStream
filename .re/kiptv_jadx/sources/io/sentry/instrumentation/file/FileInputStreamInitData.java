package io.sentry.instrumentation.file;

/* JADX INFO: loaded from: classes4.dex */
final class FileInputStreamInitData {
    final java.io.FileInputStream delegate;
    final java.io.File file;
    final io.sentry.SentryOptions options;
    final io.sentry.ISpan span;

    public FileInputStreamInitData(java.io.File file, io.sentry.ISpan iSpan, java.io.FileInputStream fileInputStream, io.sentry.SentryOptions sentryOptions) {
        this.file = file;
        this.span = iSpan;
        this.delegate = fileInputStream;
        this.options = sentryOptions;
    }
}
