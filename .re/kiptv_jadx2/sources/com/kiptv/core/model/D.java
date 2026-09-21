package com.kiptv.core.model;

import io.ktor.http.LinkHeader;

public final class D {
    f19714l("rank", "home.trakt.sort.listOrder", "asc"),
    f19715m("added", "home.trakt.sort.added", "desc"),
    f19716n("released", "home.trakt.sort.released", "desc"),
    f19717o(LinkHeader.Parameters.Title, "home.trakt.sort.title", "asc"),
    EF75("percentage", "home.trakt.sort.rating", "desc"),
    EF89("popularity", "home.trakt.sort.popularity", "desc");

    public static final C Companion;

    public static final D f19713k;

    public static final p126o6.b f19719q;

    public final String f19720h;

    public final String f19721i;
    public final String j;

    static {
        D d4 = f19714l;
        f19719q = com.google.crypto.tink.shaded.protobuf.q0.t(dArr);
        Companion = new C();
        f19713k = d4;
    }

    public D(String str, String str2, String str3) {
        super(str, i);
        this.f19720h = str;
        this.f19721i = str2;
        this.j = str3;
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f19718p.clone();
    }
}
