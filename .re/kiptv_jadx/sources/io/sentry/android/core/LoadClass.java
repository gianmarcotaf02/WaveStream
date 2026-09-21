package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public final class LoadClass extends io.sentry.util.LoadClass {
    private final io.sentry.util.LoadClass delegate = new io.sentry.util.LoadClass();

    @Override // io.sentry.util.LoadClass
    public boolean isClassAvailable(java.lang.String str, io.sentry.ILogger iLogger) {
        return this.delegate.isClassAvailable(str, iLogger);
    }

    @Override // io.sentry.util.LoadClass
    public java.lang.Class<?> loadClass(java.lang.String str, io.sentry.ILogger iLogger) {
        return this.delegate.loadClass(str, iLogger);
    }

    @Override // io.sentry.util.LoadClass
    public boolean isClassAvailable(java.lang.String str, io.sentry.SentryOptions sentryOptions) {
        return this.delegate.isClassAvailable(str, sentryOptions);
    }
}
