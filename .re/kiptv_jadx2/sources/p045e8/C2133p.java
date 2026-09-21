package p045e8;

import kotlin.jvm.internal.m;
import p055f8.a;
import p080i8.c;

public final class C2133p implements InterfaceC2123f, c0, k0, c {

    public final E f21589a;

    public final F f21590b;

    public final G f21591c;

    public String f21592d;

    public C2133p(E e6, F f9, G g, String str) {
        this.f21589a = e6;
        this.f21590b = f9;
        this.f21591c = g;
        this.f21592d = str;
    }

    @Override
    public final void A(Integer num) {
        this.f21590b.f21495e = num;
    }

    @Override
    public final void B(Integer num) {
        this.f21591c.f21498b = num;
    }

    @Override
    public final void C(Integer num) {
        this.f21591c.f21500d = num;
    }

    @Override
    public final Object a() {
        E e6 = this.f21589a;
        E e9 = new E(e6.f21487a, e6.f21488b, e6.f21489c, e6.f21490d);
        F f9 = this.f21590b;
        F f10 = new F(f9.f21491a, f9.f21492b, f9.f21493c, f9.f21494d, f9.f21495e, f9.f21496f);
        G g = this.f21591c;
        return new C2133p(e9, f10, new G(g.f21497a, g.f21498b, g.f21499c, g.f21500d), this.f21592d);
    }

    @Override
    public final EnumC2122e b() {
        return this.f21590b.f21493c;
    }

    @Override
    public final Integer c() {
        return this.f21591c.f21498b;
    }

    @Override
    public final void d(Integer num) {
        this.f21590b.f21492b = num;
    }

    @Override
    public final void e(Integer num) {
        this.f21589a.f21488b = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2133p)) {
            return false;
        }
        C2133p c2133p = (C2133p) obj;
        return m.a(c2133p.f21589a, this.f21589a) && m.a(c2133p.f21590b, this.f21590b) && m.a(c2133p.f21591c, this.f21591c) && m.a(c2133p.f21592d, this.f21592d);
    }

    @Override
    public final Integer f() {
        return this.f21591c.f21500d;
    }

    @Override
    public final Integer g() {
        return this.f21590b.f21494d;
    }

    @Override
    public final void h(Integer num) {
        this.f21590b.f21494d = num;
    }

    public final int hashCode() {
        int iHashCode = (this.f21589a.hashCode() ^ this.f21590b.hashCode()) ^ this.f21591c.hashCode();
        String str = this.f21592d;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    @Override
    public final Integer i() {
        return this.f21589a.f21487a;
    }

    @Override
    public final void j(Integer num) {
        this.f21589a.f21489c = num;
    }

    @Override
    public final a k() {
        return this.f21590b.k();
    }

    @Override
    public final Integer l() {
        return this.f21590b.f21492b;
    }

    @Override
    public final Integer m() {
        return this.f21589a.f21490d;
    }

    @Override
    public final void n(a aVar) {
        this.f21590b.n(aVar);
    }

    @Override
    public final void o(Integer num) {
        this.f21589a.f21487a = num;
    }

    @Override
    public final Integer p() {
        return this.f21591c.f21499c;
    }

    @Override
    public final Integer q() {
        return this.f21589a.f21489c;
    }

    @Override
    public final Integer r() {
        return this.f21589a.f21488b;
    }

    @Override
    public final void s(EnumC2122e enumC2122e) {
        this.f21590b.f21493c = enumC2122e;
    }

    @Override
    public final void t(Integer num) {
        this.f21590b.f21491a = num;
    }

    @Override
    public final void u(Integer num) {
        this.f21589a.f21490d = num;
    }

    @Override
    public final Integer v() {
        return this.f21590b.f21491a;
    }

    @Override
    public final Boolean w() {
        return this.f21591c.f21497a;
    }

    @Override
    public final void x(Boolean bool) {
        this.f21591c.f21497a = bool;
    }

    @Override
    public final Integer y() {
        return this.f21590b.f21495e;
    }

    @Override
    public final void z(Integer num) {
        this.f21591c.f21499c = num;
    }
}
