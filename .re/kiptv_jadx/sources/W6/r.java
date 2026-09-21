package W6;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final W6.r f10674d = new W6.r(W6.B.STRICT, 6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W6.B f10675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p070h6.g f10676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W6.B f10677c;

    public r(W6.B b9, p070h6.g gVar, W6.B b10) {
        this.f10675a = b9;
        this.f10676b = gVar;
        this.f10677c = b10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W6.r)) {
            return false;
        }
        W6.r rVar = (W6.r) obj;
        return this.f10675a == rVar.f10675a && kotlin.jvm.internal.m.a(this.f10676b, rVar.f10676b) && this.f10677c == rVar.f10677c;
    }

    public final int hashCode() {
        int iHashCode = this.f10675a.hashCode() * 31;
        p070h6.g gVar = this.f10676b;
        return this.f10677c.hashCode() + ((iHashCode + (gVar == null ? 0 : gVar.f22535k)) * 31);
    }

    public final java.lang.String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f10675a + ", sinceVersion=" + this.f10676b + ", reportLevelAfter=" + this.f10677c + ')';
    }

    public r(W6.B b9, int i3) {
        this(b9, (i3 & 2) != 0 ? new p070h6.g(1, 0, 0) : null, b9);
    }
}
