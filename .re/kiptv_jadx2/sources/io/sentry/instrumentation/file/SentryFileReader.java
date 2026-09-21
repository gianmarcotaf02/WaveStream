package io.sentry.instrumentation.file;

import io.sentry.IScopes;
import java.io.File;
import java.io.FileDescriptor;
import java.io.InputStreamReader;

public final class SentryFileReader extends InputStreamReader {
    public SentryFileReader(String str) {
        super(new SentryFileInputStream(str));
    }

    public SentryFileReader(File file) {
        super(new SentryFileInputStream(file));
    }

    public SentryFileReader(FileDescriptor fileDescriptor) {
        super(new SentryFileInputStream(fileDescriptor));
    }

    public SentryFileReader(File file, IScopes iScopes) {
        super(new SentryFileInputStream(file, iScopes));
    }
}
