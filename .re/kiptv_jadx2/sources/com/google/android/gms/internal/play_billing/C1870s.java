package com.google.android.gms.internal.play_billing;

public final class C1870s {

    public final Object f19381a;

    public final Object f19382b;

    public final Object f19383c;

    public C1870s(Object obj, Object obj2, Object obj3) {
        this.f19381a = obj;
        this.f19382b = obj2;
        this.f19383c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f19381a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f19382b);
        return new IllegalArgumentException(B2.a.o(Y6.f.o("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.f19383c)));
    }
}
