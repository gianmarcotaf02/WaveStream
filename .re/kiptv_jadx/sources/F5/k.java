package F5;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f3693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f3696d;

    public k(java.util.List offerings, boolean z6, boolean z9, java.lang.String str) {
        kotlin.jvm.internal.m.e(offerings, "offerings");
        this.f3693a = offerings;
        this.f3694b = z6;
        this.f3695c = z9;
        this.f3696d = str;
    }

    public static F5.k a(F5.k kVar, java.util.List offerings, boolean z6, boolean z9, java.lang.String str, int i3) {
        if ((i3 & 1) != 0) {
            offerings = kVar.f3693a;
        }
        if ((i3 & 2) != 0) {
            z6 = kVar.f3694b;
        }
        if ((i3 & 4) != 0) {
            z9 = kVar.f3695c;
        }
        if ((i3 & 8) != 0) {
            str = kVar.f3696d;
        }
        kVar.getClass();
        kVar.getClass();
        kotlin.jvm.internal.m.e(offerings, "offerings");
        return new F5.k(offerings, z6, z9, str);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F5.k)) {
            return false;
        }
        F5.k kVar = (F5.k) obj;
        return kotlin.jvm.internal.m.a(this.f3693a, kVar.f3693a) && this.f3694b == kVar.f3694b && this.f3695c == kVar.f3695c && kotlin.jvm.internal.m.a(this.f3696d, kVar.f3696d);
    }

    public final int hashCode() {
        int iF = p121o0.p.f(p121o0.p.f(this.f3693a.hashCode() * 31, 31, this.f3694b), 31, this.f3695c);
        java.lang.String str = this.f3696d;
        return java.lang.Boolean.hashCode(true) + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvPremiumUiState(offerings=");
        sb.append(this.f3693a);
        sb.append(", isPremium=");
        sb.append(this.f3694b);
        sb.append(", isLoading=");
        sb.append(this.f3695c);
        sb.append(", message=");
        return Y6.f.m(sb, this.f3696d, ", purchasesEnabled=true)");
    }
}
