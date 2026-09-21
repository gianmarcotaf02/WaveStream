package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidLogger implements io.sentry.ILogger {
    private final java.lang.String tag;

    /* JADX INFO: renamed from: io.sentry.android.core.AndroidLogger$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$SentryLevel;

        static {
            int[] iArr = new int[io.sentry.SentryLevel.values().length];
            $SwitchMap$io$sentry$SentryLevel = iArr;
            try {
                iArr[io.sentry.SentryLevel.INFO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[io.sentry.SentryLevel.WARNING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[io.sentry.SentryLevel.ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[io.sentry.SentryLevel.FATAL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[io.sentry.SentryLevel.DEBUG.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public AndroidLogger() {
        this("Sentry");
    }

    private int toLogcatLevel(io.sentry.SentryLevel sentryLevel) {
        int i3 = io.sentry.android.core.AndroidLogger.AnonymousClass1.$SwitchMap$io$sentry$SentryLevel[sentryLevel.ordinal()];
        if (i3 == 1) {
            return 4;
        }
        if (i3 != 2) {
            return i3 != 4 ? 3 : 7;
        }
        return 5;
    }

    @Override // io.sentry.ILogger
    public boolean isEnabled(io.sentry.SentryLevel sentryLevel) {
        return true;
    }

    @Override // io.sentry.ILogger
    public void log(io.sentry.SentryLevel sentryLevel, java.lang.String str, java.lang.Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            android.util.Log.println(toLogcatLevel(sentryLevel), this.tag, str);
        } else {
            android.util.Log.println(toLogcatLevel(sentryLevel), this.tag, java.lang.String.format(str, objArr));
        }
    }

    public AndroidLogger(java.lang.String str) {
        this.tag = str;
    }

    @Override // io.sentry.ILogger
    public void log(io.sentry.SentryLevel sentryLevel, java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            log(sentryLevel, java.lang.String.format(str, objArr), th);
        } else {
            log(sentryLevel, str, th);
        }
    }

    @Override // io.sentry.ILogger
    public void log(io.sentry.SentryLevel sentryLevel, java.lang.String str, java.lang.Throwable th) {
        int i3 = io.sentry.android.core.AndroidLogger.AnonymousClass1.$SwitchMap$io$sentry$SentryLevel[sentryLevel.ordinal()];
        if (i3 == 1) {
            android.util.Log.i(this.tag, str, th);
            return;
        }
        if (i3 == 2) {
            android.util.Log.w(this.tag, str, th);
            return;
        }
        if (i3 == 3) {
            android.util.Log.e(this.tag, str, th);
        } else if (i3 != 4) {
            android.util.Log.d(this.tag, str, th);
        } else {
            android.util.Log.wtf(this.tag, str, th);
        }
    }
}
