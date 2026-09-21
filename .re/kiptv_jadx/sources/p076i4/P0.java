package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class P0 extends p076i4.Q0 implements p068h4.l {
    public static final p076i4.P0 j = new p076i4.P0(p076i4.L.f22808k, p076i4.L.j);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p076i4.M f22823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p076i4.M f22824i;

    public P0(p076i4.M m8, p076i4.M m9) {
        this.f22823h = m8;
        this.f22824i = m9;
        if (m8.compareTo(m9) > 0 || m8 == p076i4.L.j || m9 == p076i4.L.f22808k) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid range: ");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(16);
            m8.b(sb2);
            sb2.append("..");
            m9.c(sb2);
            sb.append(sb2.toString());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    @Override // p068h4.l
    public final boolean apply(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        comparable.getClass();
        return this.f22823h.e(comparable) && !this.f22824i.e(comparable);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p076i4.P0) {
            p076i4.P0 p2 = (p076i4.P0) obj;
            if (this.f22823h.equals(p2.f22823h) && this.f22824i.equals(p2.f22824i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22824i.hashCode() + (this.f22823h.hashCode() * 31);
    }

    public final java.lang.String toString() {
        p076i4.M m8 = this.f22823h;
        p076i4.M m9 = this.f22824i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(16);
        m8.b(sb);
        sb.append("..");
        m9.c(sb);
        return sb.toString();
    }
}
