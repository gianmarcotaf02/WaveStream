package com.kiptv.core.model;

/* JADX INFO: renamed from: com.kiptv.core.model.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1955o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.EnumC1956p f20802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f20804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20805d;

    public C1955o(com.kiptv.core.model.EnumC1956p enumC1956p, java.lang.String value, java.lang.Integer num, java.lang.String str) {
        kotlin.jvm.internal.m.e(value, "value");
        this.f20802a = enumC1956p;
        this.f20803b = value;
        this.f20804c = num;
        this.f20805d = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.C1955o)) {
            return false;
        }
        com.kiptv.core.model.C1955o c1955o = (com.kiptv.core.model.C1955o) obj;
        return this.f20802a == c1955o.f20802a && kotlin.jvm.internal.m.a(this.f20803b, c1955o.f20803b) && kotlin.jvm.internal.m.a(this.f20804c, c1955o.f20804c) && kotlin.jvm.internal.m.a(this.f20805d, c1955o.f20805d);
    }

    public final int hashCode() {
        int iA = B2.a.a(this.f20802a.hashCode() * 31, 31, this.f20803b);
        java.lang.Integer num = this.f20804c;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str = this.f20805d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ExternalRatingItem(source=" + this.f20802a + ", value=" + this.f20803b + ", score=" + this.f20804c + ", link=" + this.f20805d + ")";
    }
}
