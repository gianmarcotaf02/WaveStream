package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.lang.Object f16278k = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f16279a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p120o.f f16280b = new p120o.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16281c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f16283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f16284f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16286i;
    public final androidx.lifecycle.B j;

    public F() {
        java.lang.Object obj = f16278k;
        this.f16284f = obj;
        this.j = new androidx.lifecycle.B(this);
        this.f16283e = obj;
        this.g = -1;
    }

    public static void a(java.lang.String str) {
        p111n.a.m0().f25518a.getClass();
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            throw new java.lang.IllegalStateException(Y6.f.h("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(androidx.lifecycle.E e6) {
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

    public final void c(androidx.lifecycle.E e6) {
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
                fVar.j.put(dVar, java.lang.Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((androidx.lifecycle.E) ((java.util.Map.Entry) dVar.next()).getValue());
                    if (this.f16286i) {
                        break;
                    }
                }
            }
        } while (this.f16286i);
        this.f16285h = false;
    }

    public final void d(androidx.lifecycle.InterfaceC1540w interfaceC1540w, androidx.lifecycle.H h9) {
        java.lang.Object obj;
        a("observe");
        if (((androidx.lifecycle.C1542y) interfaceC1540w.getLifecycle()).f16379d == androidx.lifecycle.EnumC1533o.f16364h) {
            return;
        }
        androidx.lifecycle.D d4 = new androidx.lifecycle.D(this, interfaceC1540w, h9);
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
        androidx.lifecycle.E e6 = (androidx.lifecycle.E) obj;
        if (e6 != null && !e6.d(interfaceC1540w)) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (e6 != null) {
            return;
        }
        interfaceC1540w.getLifecycle().a(d4);
    }

    public final void e(androidx.lifecycle.H h9) {
        java.lang.Object obj;
        a("observeForever");
        androidx.lifecycle.C c9 = new androidx.lifecycle.C(this, h9);
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
        androidx.lifecycle.E e6 = (androidx.lifecycle.E) obj;
        if (e6 instanceof androidx.lifecycle.D) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
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

    public void h(androidx.lifecycle.H h9) {
        a("removeObserver");
        androidx.lifecycle.E e6 = (androidx.lifecycle.E) this.f16280b.e(h9);
        if (e6 == null) {
            return;
        }
        e6.c();
        e6.a(false);
    }

    public abstract void i(java.lang.Object obj);
}
