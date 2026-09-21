package E5;

import java.util.List;

public final class K0 {

    public final List f2898a;

    public final String f2899b;

    public final boolean f2900c;

    public final String f2901d;

    public final boolean f2902e;

    public final String f2903f;
    public final boolean g;

    public K0(List playlists, String str, boolean z6, String str2, boolean z9, String str3, boolean z10) {
        kotlin.jvm.internal.m.e(playlists, "playlists");
        this.f2898a = playlists;
        this.f2899b = str;
        this.f2900c = z6;
        this.f2901d = str2;
        this.f2902e = z9;
        this.f2903f = str3;
        this.g = z10;
    }

    public static K0 a(K0 k1, List list, boolean z6, String str, boolean z9, String str2, boolean z10, int i3) {
        if ((i3 & 1) != 0) {
            list = k1.f2898a;
        }
        List playlists = list;
        String str3 = k1.f2899b;
        if ((i3 & 4) != 0) {
            z6 = k1.f2900c;
        }
        boolean z11 = z6;
        if ((i3 & 8) != 0) {
            str = k1.f2901d;
        }
        String str4 = str;
        if ((i3 & 16) != 0) {
            z9 = k1.f2902e;
        }
        boolean z12 = z9;
        if ((i3 & 32) != 0) {
            str2 = k1.f2903f;
        }
        String str5 = str2;
        if ((i3 & 64) != 0) {
            z10 = k1.g;
        }
        k1.getClass();
        kotlin.jvm.internal.m.e(playlists, "playlists");
        return new K0(playlists, str3, z11, str4, z12, str5, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        K0 k1 = (K0) obj;
        return kotlin.jvm.internal.m.a(this.f2898a, k1.f2898a) && kotlin.jvm.internal.m.a(this.f2899b, k1.f2899b) && this.f2900c == k1.f2900c && kotlin.jvm.internal.m.a(this.f2901d, k1.f2901d) && this.f2902e == k1.f2902e && kotlin.jvm.internal.m.a(this.f2903f, k1.f2903f) && this.g == k1.g;
    }

    public final int hashCode() {
        int iHashCode = this.f2898a.hashCode() * 31;
        String str = this.f2899b;
        int iF = p121o0.p.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f2900c);
        String str2 = this.f2901d;
        int iF2 = p121o0.p.f((iF + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f2902e);
        String str3 = this.f2903f;
        return Boolean.hashCode(this.g) + ((iF2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvPlaylistUiState(playlists=");
        sb.append(this.f2898a);
        sb.append(", email=");
        sb.append(this.f2899b);
        sb.append(", isLoading=");
        sb.append(this.f2900c);
        sb.append(", errorMessage=");
        sb.append(this.f2901d);
        sb.append(", isAdding=");
        sb.append(this.f2902e);
        sb.append(", addError=");
        sb.append(this.f2903f);
        sb.append(", showMaxPlaylistAlert=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.g, ")");
    }
}
