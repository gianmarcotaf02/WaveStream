package S4;

import java.util.List;

public final class w {

    public final int f9471a;

    public final String f9472b;

    public final String f9473c;

    public final String f9474d;

    public final List f9475e;

    public final Integer f9476f;
    public final Integer g;

    public w(int i3, Integer num, Integer num2, String normalizedTitle, String matchingNormalized, String aggressiveNormalized, List coreWords) {
        kotlin.jvm.internal.m.e(normalizedTitle, "normalizedTitle");
        kotlin.jvm.internal.m.e(matchingNormalized, "matchingNormalized");
        kotlin.jvm.internal.m.e(aggressiveNormalized, "aggressiveNormalized");
        kotlin.jvm.internal.m.e(coreWords, "coreWords");
        this.f9471a = i3;
        this.f9472b = normalizedTitle;
        this.f9473c = matchingNormalized;
        this.f9474d = aggressiveNormalized;
        this.f9475e = coreWords;
        this.f9476f = num;
        this.g = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f9471a == wVar.f9471a && kotlin.jvm.internal.m.a(this.f9472b, wVar.f9472b) && kotlin.jvm.internal.m.a(this.f9473c, wVar.f9473c) && kotlin.jvm.internal.m.a(this.f9474d, wVar.f9474d) && kotlin.jvm.internal.m.a(this.f9475e, wVar.f9475e) && kotlin.jvm.internal.m.a(this.f9476f, wVar.f9476f) && kotlin.jvm.internal.m.a(this.g, wVar.g);
    }

    public final int hashCode() {
        int iB = B2.a.b(B2.a.a(B2.a.a(B2.a.a(Integer.hashCode(this.f9471a) * 31, 31, this.f9472b), 31, this.f9473c), 31, this.f9474d), 31, this.f9475e);
        Integer num = this.f9476f;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "IndexEntry(itemIndex=" + this.f9471a + ", normalizedTitle=" + this.f9472b + ", matchingNormalized=" + this.f9473c + ", aggressiveNormalized=" + this.f9474d + ", coreWords=" + this.f9475e + ", year=" + this.f9476f + ", tmdbId=" + this.g + ")";
    }
}
