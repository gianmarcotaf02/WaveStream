package com.kiptv.core.model;

public final class EnumC1937d {
    MOVIES("movies.title"),
    SERIES("series.title"),
    LIVE("livetv.title");


    public static final p126o6.b f20747m;

    public final String f20748h;

    static {
        f20747m = com.google.crypto.tink.shaded.protobuf.q0.t(enumC1937dArr);
    }

    public EnumC1937d(String str) {
        super(str, i);
        this.f20748h = str;
    }

    public static EnumC1937d valueOf(String str) {
        return (EnumC1937d) Enum.valueOf(EnumC1937d.class, str);
    }

    public static EnumC1937d[] values() {
        return (EnumC1937d[]) f20746l.clone();
    }
}
