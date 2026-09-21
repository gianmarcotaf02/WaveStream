package p163t;

/* JADX INFO: renamed from: t.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2763j0 implements p163t.InterfaceC2766l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p163t.A f27621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27622b;

    public C2763j0(p163t.A a2, long j) {
        this.f27621a = a2;
        this.f27622b = j;
    }

    @Override // p163t.InterfaceC2766l
    public final p163t.G0 a(p163t.E0 e6) {
        return new p163t.C2765k0(this.f27621a.a(e6), this.f27622b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p163t.C2763j0)) {
            return false;
        }
        p163t.C2763j0 c2763j0 = (p163t.C2763j0) obj;
        return c2763j0.f27622b == this.f27622b && kotlin.jvm.internal.m.a(c2763j0.f27621a, this.f27621a);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f27622b) + (this.f27621a.hashCode() * 31);
    }
}
