package p163t;

import kotlin.jvm.internal.m;

public final class C2765k0 implements G0 {

    public final G0 f27631h;

    public final long f27632i;

    public C2765k0(G0 g9, long j) {
        this.f27631h = g9;
        this.f27632i = j;
    }

    @Override
    public final boolean a() {
        return this.f27631h.a();
    }

    @Override
    public final long b(r rVar, r rVar2, r rVar3) {
        return this.f27631h.b(rVar, rVar2, rVar3) + this.f27632i;
    }

    @Override
    public final r e(long j, r rVar, r rVar2, r rVar3) {
        long j9 = this.f27632i;
        return j < j9 ? rVar : this.f27631h.e(j - j9, rVar, rVar2, rVar3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2765k0)) {
            return false;
        }
        C2765k0 c2765k0 = (C2765k0) obj;
        return c2765k0.f27632i == this.f27632i && m.a(c2765k0.f27631h, this.f27631h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f27632i) + (this.f27631h.hashCode() * 31);
    }

    @Override
    public final r u(long j, r rVar, r rVar2, r rVar3) {
        long j9 = this.f27632i;
        return j < j9 ? rVar3 : this.f27631h.u(j - j9, rVar, rVar2, rVar3);
    }
}
