package p191x3;

import java.util.HashSet;
import java.util.Iterator;

public final class D {

    public final C3102c f31154a;

    public D(C3102c c3102c) {
        this.f31154a = c3102c;
    }

    public final void a() {
        Iterator it = new HashSet(this.f31154a.f31185d).iterator();
        while (it.hasNext()) {
            ((D) it.next()).a();
        }
    }

    public final void b(int i3) {
        C3102c c3102c = this.f31154a;
        C3102c.d(c3102c, i3);
        c3102c.a(i3);
        Iterator it = new HashSet(c3102c.f31185d).iterator();
        while (it.hasNext()) {
            ((D) it.next()).b(i3);
        }
    }

    public final void c() {
        Iterator it = new HashSet(this.f31154a.f31185d).iterator();
        while (it.hasNext()) {
            ((D) it.next()).c();
        }
    }

    public final void d() {
        Iterator it = new HashSet(this.f31154a.f31185d).iterator();
        while (it.hasNext()) {
            ((D) it.next()).d();
        }
    }

    public final void e() {
        Iterator it = new HashSet(this.f31154a.f31185d).iterator();
        while (it.hasNext()) {
            ((D) it.next()).e();
        }
    }

    public final void f() {
        Iterator it = new HashSet(this.f31154a.f31185d).iterator();
        while (it.hasNext()) {
            ((D) it.next()).f();
        }
    }
}
