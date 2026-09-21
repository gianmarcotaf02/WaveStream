package io.sentry.android.core;

import android.util.Log;
import io.sentry.ILogger;
import io.sentry.SentryLevel;

public final class AndroidLogger implements ILogger {
    private final String tag;

    public static class AnonymousClass1 {
        static final int[] $SwitchMap$io$sentry$SentryLevel;

        static {
            int[] iArr = new int[SentryLevel.values().length];
            $SwitchMap$io$sentry$SentryLevel = iArr;
            try {
                iArr[SentryLevel.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[SentryLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[SentryLevel.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[SentryLevel.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[SentryLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public AndroidLogger() {
        this("Sentry");
    }

    private int toLogcatLevel(SentryLevel sentryLevel) {
        int i3 = AnonymousClass1.$SwitchMap$io$sentry$SentryLevel[sentryLevel.ordinal()];
        if (i3 == 1) {
            return 4;
        }
        if (i3 != 2) {
            return i3 != 4 ? 3 : 7;
        }
        return 5;
    }

    @Override
    public boolean isEnabled(SentryLevel sentryLevel) {
        return true;
    }

    @Override
    public void log(SentryLevel sentryLevel, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            Log.println(toLogcatLevel(sentryLevel), this.tag, str);
        } else {
            Log.println(toLogcatLevel(sentryLevel), this.tag, String.format(str, objArr));
        }
    }

    public AndroidLogger(String str) {
        this.tag = str;
    }

    @Override
    public void log(SentryLevel sentryLevel, Throwable th, String str, Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            log(sentryLevel, String.format(str, objArr), th);
        } else {
            log(sentryLevel, str, th);
        }
    }

    @Override
    public void log(SentryLevel sentryLevel, String str, Throwable th) {
        int i3 = AnonymousClass1.$SwitchMap$io$sentry$SentryLevel[sentryLevel.ordinal()];
        if (i3 == 1) {
            Log.i(this.tag, str, th);
            return;
        }
        if (i3 == 2) {
            Log.w(this.tag, str, th);
            return;
        }
        if (i3 == 3) {
            Log.e(this.tag, str, th);
        } else if (i3 != 4) {
            Log.d(this.tag, str, th);
        } else {
            Log.wtf(this.tag, str, th);
        }
    }
}
