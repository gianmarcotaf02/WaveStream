package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;

public abstract class F {

    public static final Object f16278k = new Object();

    public final Object f16279a = new Object();

    public final p120o.f f16280b = new p120o.f();

    public int f16281c = 0;

    public boolean f16282d;

    public volatile Object f16283e;

    public volatile Object f16284f;
    public int g;

    public boolean f16285h;

    public boolean f16286i;
    public final B j;

    public F() {
        Object obj = f16278k;
        this.f16284f = obj;
        this.j = new B(this);
        this.f16283e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        p111n.a.m0().f25518a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(Y6.f.h("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(E e6) {
        if (e6.f16276i) {
            if (!e6.e()) {
                e6.a(false);
                return;
            }
            int i3 = e6.j;
            int i9 = this.g;
            if (i3 >= i9) {
                return;
            }
            e6.j = i9;
            e6.f16275h.onChanged(this.f16283e);
        }
    }

    public final void c(E e6) {
        if (this.f16285h) {
            this.f16286i = true;
            return;
        }
        this.f16285h = true;
        do {
            this.f16286i = false;
            if (e6 != null) {
                b(e6);
                e6 = null;
            } else {
                p120o.f fVar = this.f16280b;
                fVar.getClass();
                p120o.d dVar = new p120o.d(fVar);
                fVar.j.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((E) ((Map.Entry) dVar.next()).getValue());
                    if (this.f16286i) {
                        break;
                    }
                }
            }
        } while (this.f16286i);
        this.f16285h = false;
    }

    public final void d(InterfaceC1540w interfaceC1540w, H h9) {
        Object obj;
        a("observe");
        if (((C1542y) interfaceC1540w.getLifecycle()).f16379d == EnumC1533o.f16364h) {
            return;
        }
        D d4 = new D(this, interfaceC1540w, h9);
        p120o.f fVar = this.f16280b;
        p120o.c cVarD = fVar.d(h9);
        if (cVarD != null) {
            obj = cVarD.f25955i;
        } else {
            p120o.c cVar = new p120o.c(h9, d4);
            fVar.f25961k++;
            p120o.c cVar2 = fVar.f25960i;
            if (cVar2 == null) {
                fVar.f25959h = cVar;
                fVar.f25960i = cVar;
            } else {
                cVar2.j = cVar;
                cVar.f25956k = cVar2;
                fVar.f25960i = cVar;
            }
            obj = null;
        }
        E e6 = (E) obj;
        if (e6 != null && !e6.d(interfaceC1540w)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (e6 != null) {
            return;
        }
        interfaceC1540w.getLifecycle().a(d4);
    }

    public final void e(H h9) {
        Object obj;
        a("observeForever");
        C c9 = new C(this, h9);
        p120o.f fVar = this.f16280b;
        p120o.c cVarD = fVar.d(h9);
        if (cVarD != null) {
            obj = cVarD.f25955i;
        } else {
            p120o.c cVar = new p120o.c(h9, c9);
            fVar.f25961k++;
            p120o.c cVar2 = fVar.f25960i;
            if (cVar2 == null) {
                fVar.f25959h = cVar;
                fVar.f25960i = cVar;
            } else {
                cVar2.j = cVar;
                cVar.f25956k = cVar2;
                fVar.f25960i = cVar;
            }
            obj = null;
        }
        E e6 = (E) obj;
        if (e6 instanceof D) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (e6 != null) {
            return;
        }
        c9.a(true);
    }

    public void f() {
    }

    public void g() {
    }

    public void h(H h9) {
        a("removeObserver");
        E e6 = (E) this.f16280b.e(h9);
        if (e6 == null) {
            return;
        }
        e6.c();
        e6.a(false);
    }

    public abstract void i(Object obj);
}
