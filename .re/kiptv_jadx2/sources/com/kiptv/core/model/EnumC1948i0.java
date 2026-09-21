package com.kiptv.core.model;

@p119n8.i
public final class EnumC1948i0 {
    public static final RatingProvenance$Companion Companion;

    public static final Object f20777h;

    public static final EnumC1948i0 f20778i;
    public static final EnumC1948i0 j;

    public static final EnumC1948i0[] f20779k;

    static {
        EnumC1948i0 enumC1948i0 = new EnumC1948i0("OFFICIAL", 0);
        f20778i = enumC1948i0;
        EnumC1948i0 enumC1948i1 = new EnumC1948i0("CONVERTED", 1);
        j = enumC1948i1;
        EnumC1948i0[] enumC1948i0Arr = {enumC1948i0, enumC1948i1};
        f20779k = enumC1948i0Arr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC1948i0Arr);
        Companion = new RatingProvenance$Companion();
        f20777h = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new p026c6.a(2));
    }

    public static EnumC1948i0 valueOf(String str) {
        return (EnumC1948i0) Enum.valueOf(EnumC1948i0.class, str);
    }

    public static EnumC1948i0[] values() {
        return (EnumC1948i0[]) f20779k.clone();
    }
}
