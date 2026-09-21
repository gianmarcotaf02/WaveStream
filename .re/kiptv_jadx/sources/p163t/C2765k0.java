package p163t;

/* JADX INFO: renamed from: t.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2765k0 implements p163t.G0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p163t.G0 f27631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f27632i;

    public C2765k0(p163t.G0 g9, long j) {
        this.f27631h = g9;
        this.f27632i = j;
    }

    @Override // p163t.G0
    public final boolean a() {
        return this.f27631h.a();
    }

    @Override // p163t.G0
    public final long b(p163t.r rVar, p163t.r rVar2, p163t.r rVar3) {
        return this.f27631h.b(rVar, rVar2, rVar3) + this.f27632i;
    }

    @Override // p163t.G0
    public final p163t.r e(long j, p163t.r rVar, p163t.r rVar2, p163t.r rVar3) {
        long j9 = this.f27632i;
        return j < j9 ? rVar : this.f27631h.e(j - j9, rVar, rVar2, rVar3);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p163t.C2765k0)) {
            return false;
        }
        p163t.C2765k0 c2765k0 = (p163t.C2765k0) obj;
        return c2765k0.f27632i == this.f27632i && kotlin.jvm.internal.m.a(c2765k0.f27631h, this.f27631h);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f27632i) + (this.f27631h.hashCode() * 31);
    }

    @Override // p163t.G0
    public final p163t.r u(long j, p163t.r rVar, p163t.r rVar2, p163t.r rVar3) {
        long j9 = this.f27632i;
        return j < j9 ? rVar3 : this.f27631h.u(j - j9, rVar, rVar2, rVar3);
    }
}
