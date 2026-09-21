package p005a5;

import B2.a;
import com.kiptv.core.model.D;
import com.kiptv.core.model.F;
import kotlin.jvm.internal.m;

public final class C1353n6 {
    public static final C1343m6 Companion = new C1343m6();

    public final F f14821a;

    public final String f14822b;

    public final String f14823c;

    public final D f14824d;

    public C1353n6(F f9, String str, String str2, D sort) {
        m.e(sort, "sort");
        this.f14821a = f9;
        this.f14822b = str;
        this.f14823c = str2;
        this.f14824d = sort;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1353n6)) {
            return false;
        }
        C1353n6 c1353n6 = (C1353n6) obj;
        return this.f14821a == c1353n6.f14821a && m.a(this.f14822b, c1353n6.f14822b) && m.a(this.f14823c, c1353n6.f14823c) && this.f14824d == c1353n6.f14824d;
    }

    public final int hashCode() {
        int iA = a.a(this.f14821a.hashCode() * 31, 31, this.f14822b);
        String str = this.f14823c;
        return this.f14824d.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "TraktFeedSpec(source=" + this.f14821a + ", owner=" + this.f14822b + ", listId=" + this.f14823c + ", sort=" + this.f14824d + ")";
    }
}
