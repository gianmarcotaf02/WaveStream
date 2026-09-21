package Z;

import S7.C0895k;

public final class C1165p0 {

    public final C1167q0 f12474a;

    public final C0895k f12475b;

    public C1165p0(C1167q0 c1167q0, C0895k c0895k) {
        this.f12474a = c1167q0;
        this.f12475b = c0895k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1165p0.class != obj.getClass()) {
            return false;
        }
        C1165p0 c1165p0 = (C1165p0) obj;
        return kotlin.jvm.internal.m.a(this.f12474a, c1165p0.f12474a) && this.f12475b.equals(c1165p0.f12475b);
    }

    public final int hashCode() {
        return this.f12475b.hashCode() + (this.f12474a.hashCode() * 31);
    }
}
