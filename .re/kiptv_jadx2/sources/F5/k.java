package F5;

import java.util.List;

public final class k {

    public final List f3693a;

    public final boolean f3694b;

    public final boolean f3695c;

    public final String f3696d;

    public k(List offerings, boolean z6, boolean z9, String str) {
        kotlin.jvm.internal.m.e(offerings, "offerings");
        this.f3693a = offerings;
        this.f3694b = z6;
        this.f3695c = z9;
        this.f3696d = str;
    }

    public static k a(k kVar, List offerings, boolean z6, boolean z9, String str, int i3) {
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
        return new k(offerings, z6, z9, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.m.a(this.f3693a, kVar.f3693a) && this.f3694b == kVar.f3694b && this.f3695c == kVar.f3695c && kotlin.jvm.internal.m.a(this.f3696d, kVar.f3696d);
    }

    public final int hashCode() {
        int iF = p121o0.p.f(p121o0.p.f(this.f3693a.hashCode() * 31, 31, this.f3694b), 31, this.f3695c);
        String str = this.f3696d;
        return Boolean.hashCode(true) + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvPremiumUiState(offerings=");
        sb.append(this.f3693a);
        sb.append(", isPremium=");
        sb.append(this.f3694b);
        sb.append(", isLoading=");
        sb.append(this.f3695c);
        sb.append(", message=");
        return Y6.f.m(sb, this.f3696d, ", purchasesEnabled=true)");
    }
}
