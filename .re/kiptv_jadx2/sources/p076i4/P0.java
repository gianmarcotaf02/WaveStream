package p076i4;

import p068h4.l;

public final class P0 extends Q0 implements l {
    public static final P0 j = new P0(L.f22808k, L.j);

    public final M f22823h;

    public final M f22824i;

    public P0(M m8, M m9) {
        this.f22823h = m8;
        this.f22824i = m9;
        if (m8.compareTo(m9) > 0 || m8 == L.j || m9 == L.f22808k) {
            StringBuilder sb = new StringBuilder("Invalid range: ");
            StringBuilder sb2 = new StringBuilder(16);
            m8.b(sb2);
            sb2.append("..");
            m9.c(sb2);
            sb.append(sb2.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override
    public final boolean apply(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return this.f22823h.e(comparable) && !this.f22824i.e(comparable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof P0) {
            P0 p2 = (P0) obj;
            if (this.f22823h.equals(p2.f22823h) && this.f22824i.equals(p2.f22824i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22824i.hashCode() + (this.f22823h.hashCode() * 31);
    }

    public final String toString() {
        M m8 = this.f22823h;
        M m9 = this.f22824i;
        StringBuilder sb = new StringBuilder(16);
        m8.b(sb);
        sb.append("..");
        m9.c(sb);
        return sb.toString();
    }
}
