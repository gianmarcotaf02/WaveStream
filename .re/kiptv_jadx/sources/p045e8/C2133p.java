package p045e8;

/* JADX INFO: renamed from: e8.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2133p implements p045e8.InterfaceC2123f, p045e8.c0, p045e8.k0, p080i8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p045e8.E f21589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p045e8.F f21590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p045e8.G f21591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.String f21592d;

    public C2133p(p045e8.E e6, p045e8.F f9, p045e8.G g, java.lang.String str) {
        this.f21589a = e6;
        this.f21590b = f9;
        this.f21591c = g;
        this.f21592d = str;
    }

    @Override // p045e8.c0
    public final void A(java.lang.Integer num) {
        this.f21590b.f21495e = num;
    }

    @Override // p045e8.k0
    public final void B(java.lang.Integer num) {
        this.f21591c.f21498b = num;
    }

    @Override // p045e8.k0
    public final void C(java.lang.Integer num) {
        this.f21591c.f21500d = num;
    }

    @Override // p080i8.c
    public final java.lang.Object a() {
        p045e8.E e6 = this.f21589a;
        p045e8.E e9 = new p045e8.E(e6.f21487a, e6.f21488b, e6.f21489c, e6.f21490d);
        p045e8.F f9 = this.f21590b;
        p045e8.F f10 = new p045e8.F(f9.f21491a, f9.f21492b, f9.f21493c, f9.f21494d, f9.f21495e, f9.f21496f);
        p045e8.G g = this.f21591c;
        return new p045e8.C2133p(e9, f10, new p045e8.G(g.f21497a, g.f21498b, g.f21499c, g.f21500d), this.f21592d);
    }

    @Override // p045e8.c0
    public final p045e8.EnumC2122e b() {
        return this.f21590b.f21493c;
    }

    @Override // p045e8.k0
    public final java.lang.Integer c() {
        return this.f21591c.f21498b;
    }

    @Override // p045e8.c0
    public final void d(java.lang.Integer num) {
        this.f21590b.f21492b = num;
    }

    @Override // p045e8.InterfaceC2123f
    public final void e(java.lang.Integer num) {
        this.f21589a.f21488b = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p045e8.C2133p)) {
            return false;
        }
        p045e8.C2133p c2133p = (p045e8.C2133p) obj;
        return kotlin.jvm.internal.m.a(c2133p.f21589a, this.f21589a) && kotlin.jvm.internal.m.a(c2133p.f21590b, this.f21590b) && kotlin.jvm.internal.m.a(c2133p.f21591c, this.f21591c) && kotlin.jvm.internal.m.a(c2133p.f21592d, this.f21592d);
    }

    @Override // p045e8.k0
    public final java.lang.Integer f() {
        return this.f21591c.f21500d;
    }

    @Override // p045e8.c0
    public final java.lang.Integer g() {
        return this.f21590b.f21494d;
    }

    @Override // p045e8.c0
    public final void h(java.lang.Integer num) {
        this.f21590b.f21494d = num;
    }

    public final int hashCode() {
        int iHashCode = (this.f21589a.hashCode() ^ this.f21590b.hashCode()) ^ this.f21591c.hashCode();
        java.lang.String str = this.f21592d;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    @Override // p045e8.InterfaceC2123f
    public final java.lang.Integer i() {
        return this.f21589a.f21487a;
    }

    @Override // p045e8.InterfaceC2123f
    public final void j(java.lang.Integer num) {
        this.f21589a.f21489c = num;
    }

    @Override // p045e8.c0
    public final p055f8.a k() {
        return this.f21590b.k();
    }

    @Override // p045e8.c0
    public final java.lang.Integer l() {
        return this.f21590b.f21492b;
    }

    @Override // p045e8.InterfaceC2123f
    public final java.lang.Integer m() {
        return this.f21589a.f21490d;
    }

    @Override // p045e8.c0
    public final void n(p055f8.a aVar) {
        this.f21590b.n(aVar);
    }

    @Override // p045e8.InterfaceC2123f
    public final void o(java.lang.Integer num) {
        this.f21589a.f21487a = num;
    }

    @Override // p045e8.k0
    public final java.lang.Integer p() {
        return this.f21591c.f21499c;
    }

    @Override // p045e8.InterfaceC2123f
    public final java.lang.Integer q() {
        return this.f21589a.f21489c;
    }

    @Override // p045e8.InterfaceC2123f
    public final java.lang.Integer r() {
        return this.f21589a.f21488b;
    }

    @Override // p045e8.c0
    public final void s(p045e8.EnumC2122e enumC2122e) {
        this.f21590b.f21493c = enumC2122e;
    }

    @Override // p045e8.c0
    public final void t(java.lang.Integer num) {
        this.f21590b.f21491a = num;
    }

    @Override // p045e8.InterfaceC2123f
    public final void u(java.lang.Integer num) {
        this.f21589a.f21490d = num;
    }

    @Override // p045e8.c0
    public final java.lang.Integer v() {
        return this.f21590b.f21491a;
    }

    @Override // p045e8.k0
    public final java.lang.Boolean w() {
        return this.f21591c.f21497a;
    }

    @Override // p045e8.k0
    public final void x(java.lang.Boolean bool) {
        this.f21591c.f21497a = bool;
    }

    @Override // p045e8.c0
    public final java.lang.Integer y() {
        return this.f21590b.f21495e;
    }

    @Override // p045e8.k0
    public final void z(java.lang.Integer num) {
        this.f21591c.f21499c = num;
    }
}
