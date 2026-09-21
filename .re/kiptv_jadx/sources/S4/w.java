package S4;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f9472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f9473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f9474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f9475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f9476f;
    public final java.lang.Integer g;

    public w(int i3, java.lang.Integer num, java.lang.Integer num2, java.lang.String normalizedTitle, java.lang.String matchingNormalized, java.lang.String aggressiveNormalized, java.util.List coreWords) {
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S4.w)) {
            return false;
        }
        S4.w wVar = (S4.w) obj;
        return this.f9471a == wVar.f9471a && kotlin.jvm.internal.m.a(this.f9472b, wVar.f9472b) && kotlin.jvm.internal.m.a(this.f9473c, wVar.f9473c) && kotlin.jvm.internal.m.a(this.f9474d, wVar.f9474d) && kotlin.jvm.internal.m.a(this.f9475e, wVar.f9475e) && kotlin.jvm.internal.m.a(this.f9476f, wVar.f9476f) && kotlin.jvm.internal.m.a(this.g, wVar.g);
    }

    public final int hashCode() {
        int iB = B2.a.b(B2.a.a(B2.a.a(B2.a.a(java.lang.Integer.hashCode(this.f9471a) * 31, 31, this.f9472b), 31, this.f9473c), 31, this.f9474d), 31, this.f9475e);
        java.lang.Integer num = this.f9476f;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.g;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "IndexEntry(itemIndex=" + this.f9471a + ", normalizedTitle=" + this.f9472b + ", matchingNormalized=" + this.f9473c + ", aggressiveNormalized=" + this.f9474d + ", coreWords=" + this.f9475e + ", year=" + this.f9476f + ", tmdbId=" + this.g + ")";
    }
}
