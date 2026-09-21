package p205z2;

import p113n1.f;
import p121o0.p;
import p188x0.C3098s;
import p188x0.S;
import p188x0.z;
import v.C;

public final class C3166b {

    public static final C3166b f32217c;

    public final C f32218a;

    public final float f32219b;

    static {
        float f9 = 0;
        f32217c = new C3166b(new C(f9, new S(C3098s.f31127f)), f9);
    }

    public C3166b(C c9, float f9) {
        this.f32218a = c9;
        this.f32219b = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3166b.class != obj.getClass()) {
            return false;
        }
        C3166b c3166b = (C3166b) obj;
        if (!this.f32218a.equals(c3166b.f32218a) || !f.c(this.f32219b, c3166b.f32219b)) {
            return false;
        }
        Object obj2 = z.f31141b;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return z.f31141b.hashCode() + p.c(this.f32219b, this.f32218a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Border(border=" + this.f32218a + ", inset=" + ((Object) f.d(this.f32219b)) + ", shape=" + z.f31141b + ')';
    }
}
