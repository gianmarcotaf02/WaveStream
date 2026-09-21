package p005a5;

/* JADX INFO: renamed from: a5.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1353n6 {
    public static final p005a5.C1343m6 Companion = new p005a5.C1343m6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.F f14821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f14822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f14823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.kiptv.core.model.D f14824d;

    public C1353n6(com.kiptv.core.model.F f9, java.lang.String str, java.lang.String str2, com.kiptv.core.model.D sort) {
        kotlin.jvm.internal.m.e(sort, "sort");
        this.f14821a = f9;
        this.f14822b = str;
        this.f14823c = str2;
        this.f14824d = sort;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.C1353n6)) {
            return false;
        }
        p005a5.C1353n6 c1353n6 = (p005a5.C1353n6) obj;
        return this.f14821a == c1353n6.f14821a && kotlin.jvm.internal.m.a(this.f14822b, c1353n6.f14822b) && kotlin.jvm.internal.m.a(this.f14823c, c1353n6.f14823c) && this.f14824d == c1353n6.f14824d;
    }

    public final int hashCode() {
        int iA = B2.a.a(this.f14821a.hashCode() * 31, 31, this.f14822b);
        java.lang.String str = this.f14823c;
        return this.f14824d.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final java.lang.String toString() {
        return "TraktFeedSpec(source=" + this.f14821a + ", owner=" + this.f14822b + ", listId=" + this.f14823c + ", sort=" + this.f14824d + ")";
    }
}
