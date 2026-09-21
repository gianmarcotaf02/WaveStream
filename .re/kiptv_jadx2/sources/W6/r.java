package W6;

public final class r {

    public static final r f10674d = new r(B.STRICT, 6);

    public final B f10675a;

    public final p070h6.g f10676b;

    public final B f10677c;

    public r(B b9, p070h6.g gVar, B b10) {
        this.f10675a = b9;
        this.f10676b = gVar;
        this.f10677c = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f10675a == rVar.f10675a && kotlin.jvm.internal.m.a(this.f10676b, rVar.f10676b) && this.f10677c == rVar.f10677c;
    }

    public final int hashCode() {
        int iHashCode = this.f10675a.hashCode() * 31;
        p070h6.g gVar = this.f10676b;
        return this.f10677c.hashCode() + ((iHashCode + (gVar == null ? 0 : gVar.f22535k)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f10675a + ", sinceVersion=" + this.f10676b + ", reportLevelAfter=" + this.f10677c + ')';
    }

    public r(B b9, int i3) {
        this(b9, (i3 & 2) != 0 ? new p070h6.g(1, 0, 0) : null, b9);
    }
}
