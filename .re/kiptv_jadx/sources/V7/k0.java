package V7;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 implements V7.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10477a;

    public k0(long j) {
        this.f10477a = j;
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(B2.a.k(j, "stopTimeout(", " ms) cannot be negative").toString());
        }
    }

    @Override // V7.e0
    public final V7.InterfaceC0981g a(W7.D d4) {
        V7.i0 i0Var = new V7.i0(this, null);
        int i3 = V7.D.f10376a;
        return V7.r.l(new V7.C0999z(new W7.n(i0Var, d4, p100l6.i.f24820h, -2, U7.EnumC0955c.f10175h), new V7.j0(2, null), 0));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof V7.k0) {
            return this.f10477a == ((V7.k0) obj).f10477a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(Long.MAX_VALUE) + (java.lang.Long.hashCode(this.f10477a) * 31);
    }

    public final java.lang.String toString() {
        p086j6.b bVar = new p086j6.b(2);
        long j = this.f10477a;
        if (j > 0) {
            bVar.add("stopTimeout=" + j + "ms");
        }
        return Y6.f.l(new java.lang.StringBuilder("SharingStarted.WhileSubscribed("), p078i6.o.o1(com.google.common.util.concurrent.P.M(bVar), null, null, null, null, 63), ')');
    }
}
