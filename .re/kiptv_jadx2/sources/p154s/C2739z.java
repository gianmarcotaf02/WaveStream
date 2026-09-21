package p154s;

import kotlin.jvm.internal.m;
import p137q0.d;
import p163t.A;
import p194x6.j;

public final class C2739z {

    public final d f27193a;

    public final j f27194b;

    public final A f27195c;

    public C2739z(d dVar, j jVar, A a2) {
        this.f27193a = dVar;
        this.f27194b = jVar;
        this.f27195c = a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2739z)) {
            return false;
        }
        C2739z c2739z = (C2739z) obj;
        return m.a(this.f27193a, c2739z.f27193a) && m.a(this.f27194b, c2739z.f27194b) && m.a(this.f27195c, c2739z.f27195c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f27195c.hashCode() + ((this.f27194b.hashCode() + (this.f27193a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f27193a + ", size=" + this.f27194b + ", animationSpec=" + this.f27195c + ", clip=true)";
    }
}
