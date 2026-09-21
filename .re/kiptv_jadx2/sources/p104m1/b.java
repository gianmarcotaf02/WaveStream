package p104m1;

import kotlin.jvm.internal.m;
import p121o0.p;
import p188x0.AbstractC3095o;
import p188x0.C3098s;
import p188x0.M;

public final class b implements o {

    public final M f25157a;

    public final float f25158b;

    public b(M m8, float f9) {
        this.f25157a = m8;
        this.f25158b = f9;
    }

    @Override
    public final float a() {
        return this.f25158b;
    }

    @Override
    public final long b() {
        int i3 = C3098s.f31128h;
        return C3098s.g;
    }

    @Override
    public final AbstractC3095o c() {
        return this.f25157a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f25157a, bVar.f25157a) && Float.compare(this.f25158b, bVar.f25158b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f25158b) + (this.f25157a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f25157a);
        sb.append(", alpha=");
        return p.q(sb, this.f25158b, ')');
    }
}
