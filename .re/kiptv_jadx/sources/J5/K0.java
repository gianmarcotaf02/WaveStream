package J5;

/* JADX INFO: loaded from: classes4.dex */
public final class K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f6163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.l0 f6164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f6165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f6166d;

    public K0(java.lang.String str, com.kiptv.core.model.l0 tier, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.m.e(tier, "tier");
        this.f6163a = str;
        this.f6164b = tier;
        this.f6165c = str2;
        this.f6166d = str3;
    }

    public static J5.K0 a(J5.K0 k1, com.kiptv.core.model.l0 tier, java.lang.String str, java.lang.String str2, int i3) {
        java.lang.String str3 = k1.f6163a;
        if ((i3 & 2) != 0) {
            tier = k1.f6164b;
        }
        k1.getClass();
        k1.getClass();
        if ((i3 & 16) != 0) {
            str = k1.f6165c;
        }
        if ((i3 & 32) != 0) {
            str2 = k1.f6166d;
        }
        k1.getClass();
        k1.getClass();
        kotlin.jvm.internal.m.e(tier, "tier");
        return new J5.K0(str3, tier, str, str2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J5.K0)) {
            return false;
        }
        J5.K0 k1 = (J5.K0) obj;
        return kotlin.jvm.internal.m.a(this.f6163a, k1.f6163a) && this.f6164b == k1.f6164b && kotlin.jvm.internal.m.a(this.f6165c, k1.f6165c) && kotlin.jvm.internal.m.a(this.f6166d, k1.f6166d);
    }

    public final int hashCode() {
        java.lang.String str = this.f6163a;
        int iF = p121o0.p.f((this.f6164b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 961, false);
        java.lang.String str2 = this.f6165c;
        int iHashCode = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f6166d;
        return java.lang.Boolean.hashCode(true) + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvGeneralSettingsUiState(email=");
        sb.append(this.f6163a);
        sb.append(", tier=");
        sb.append(this.f6164b);
        sb.append(", loading=false, message=null, activePlaylistId=");
        sb.append(this.f6165c);
        sb.append(", activePlaylistName=");
        return Y6.f.m(sb, this.f6166d, ", purchasesEnabled=true)");
    }
}
