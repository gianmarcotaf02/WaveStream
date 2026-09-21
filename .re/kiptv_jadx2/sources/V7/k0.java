package V7;

import U7.EnumC0955c;

public final class k0 implements e0 {

    public final long f10477a;

    public k0(long j) {
        this.f10477a = j;
        if (j < 0) {
            throw new IllegalArgumentException(B2.a.k(j, "stopTimeout(", " ms) cannot be negative").toString());
        }
    }

    @Override
    public final InterfaceC0981g a(W7.D d4) {
        i0 i0Var = new i0(this, null);
        int i3 = D.f10376a;
        return r.l(new C0999z(new W7.n(i0Var, d4, p100l6.i.f24820h, -2, EnumC0955c.f10175h), new j0(2, null), 0));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k0) {
            return this.f10477a == ((k0) obj).f10477a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(Long.MAX_VALUE) + (Long.hashCode(this.f10477a) * 31);
    }

    public final String toString() {
        p086j6.b bVar = new p086j6.b(2);
        long j = this.f10477a;
        if (j > 0) {
            bVar.add("stopTimeout=" + j + "ms");
        }
        return Y6.f.l(new StringBuilder("SharingStarted.WhileSubscribed("), p078i6.o.o1(com.google.common.util.concurrent.P.M(bVar), null, null, null, null, 63), ')');
    }
}
