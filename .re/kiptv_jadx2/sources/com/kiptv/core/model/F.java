package com.kiptv.core.model;

public final class F {
    RECOMMENDATIONS("recommendations"),
    WATCHLIST("watchlist"),
    LIST("list");

    public static final E Companion = new E();

    public static final p126o6.b f19765m;

    public final String f19766h;

    static {
        f19765m = com.google.crypto.tink.shaded.protobuf.q0.t(new F[]{r0, r1, r2});
    }

    public F(String str) {
        super(str, i);
        this.f19766h = str;
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f19764l.clone();
    }
}
