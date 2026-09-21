package com.google.android.gms.internal.play_billing;

import java.util.concurrent.TimeoutException;

public final class W extends TimeoutException {
    @Override
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
