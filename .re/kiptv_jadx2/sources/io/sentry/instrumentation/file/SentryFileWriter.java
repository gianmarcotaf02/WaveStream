package io.sentry.instrumentation.file;

import io.sentry.IScopes;
import java.io.File;
import java.io.FileDescriptor;
import java.io.OutputStreamWriter;

public final class SentryFileWriter extends OutputStreamWriter {
    public SentryFileWriter(String str) {
        super(new SentryFileOutputStream(str));
    }

    public SentryFileWriter(String str, boolean z6) {
        super(new SentryFileOutputStream(str, z6));
    }

    public SentryFileWriter(File file) {
        super(new SentryFileOutputStream(file));
    }

    public SentryFileWriter(File file, boolean z6) {
        super(new SentryFileOutputStream(file, z6));
    }

    public SentryFileWriter(FileDescriptor fileDescriptor) {
        super(new SentryFileOutputStream(fileDescriptor));
    }

    public SentryFileWriter(File file, boolean z6, IScopes iScopes) {
        super(new SentryFileOutputStream(file, z6, iScopes));
    }
}
