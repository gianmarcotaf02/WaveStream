package com.google.android.gms.internal.play_billing;

public final class B {

    public static final B f19189c;

    public static final B f19190d;

    public final boolean f19191a;

    public final RuntimeException f19192b;

    static {
        if (L.f19253m) {
            f19190d = null;
            f19189c = null;
        } else {
            f19190d = new B(false, null);
            f19189c = new B(true, null);
        }
    }

    public B(boolean z6, RuntimeException runtimeException) {
        this.f19191a = z6;
        this.f19192b = runtimeException;
    }
}
