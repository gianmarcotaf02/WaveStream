package com.kiptv.core.model;

public final class EnumC1956p {

    public static final EnumC1956p f20810h;

    public static final EnumC1956p f20811i;
    public static final EnumC1956p j;

    public static final EnumC1956p f20812k;

    public static final EnumC1956p f20813l;

    public static final EnumC1956p[] f20814m;

    static {
        EnumC1956p enumC1956p = new EnumC1956p("IMDB", 0);
        f20810h = enumC1956p;
        EnumC1956p enumC1956p2 = new EnumC1956p("TMDB", 1);
        f20811i = enumC1956p2;
        EnumC1956p enumC1956p3 = new EnumC1956p("TOMATOMETER", 2);
        j = enumC1956p3;
        EnumC1956p enumC1956p4 = new EnumC1956p("POPCORNMETER", 3);
        f20812k = enumC1956p4;
        EnumC1956p enumC1956p5 = new EnumC1956p("TRAKT", 4);
        f20813l = enumC1956p5;
        EnumC1956p[] enumC1956pArr = {enumC1956p, enumC1956p2, enumC1956p3, enumC1956p4, enumC1956p5};
        f20814m = enumC1956pArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC1956pArr);
    }

    public static EnumC1956p valueOf(String str) {
        return (EnumC1956p) Enum.valueOf(EnumC1956p.class, str);
    }

    public static EnumC1956p[] values() {
        return (EnumC1956p[]) f20814m.clone();
    }
}
