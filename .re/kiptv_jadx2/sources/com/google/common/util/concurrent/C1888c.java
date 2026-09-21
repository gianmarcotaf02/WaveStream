package com.google.common.util.concurrent;

public final class C1888c {

    public static final C1888c f19425c;

    public static final C1888c f19426d;

    public final boolean f19427a;

    public final RuntimeException f19428b;

    static {
        if (AbstractC1902q.GENERATE_CANCELLATION_CAUSES) {
            f19426d = null;
            f19425c = null;
        } else {
            f19426d = new C1888c(false, null);
            f19425c = new C1888c(true, null);
        }
    }

    public C1888c(boolean z6, RuntimeException runtimeException) {
        this.f19427a = z6;
        this.f19428b = runtimeException;
    }
}
