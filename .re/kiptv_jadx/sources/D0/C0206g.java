package D0;

/* JADX INFO: renamed from: D0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0206g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f1884a;

    public C0206g(int i3) {
        this.f1884a = new java.util.ArrayList(i3);
    }

    public void a(java.lang.Object obj) {
        this.f1884a.add(obj);
    }

    public void b(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        boolean z6 = obj instanceof java.lang.Object[];
        java.util.ArrayList arrayList = this.f1884a;
        if (z6) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                java.util.Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof java.util.Collection) {
            arrayList.addAll((java.util.Collection) obj);
            return;
        }
        if (obj instanceof java.lang.Iterable) {
            java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof java.util.Iterator)) {
                throw new java.lang.UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            java.util.Iterator it2 = (java.util.Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    public void c(float f9, float f10, float f11, float f12, boolean z6) {
        this.f1884a.add(new D0.s(f9, f10, 0.0f, false, z6, f11, f12));
    }

    public p105m2.C2623v d() {
        if (this.f1884a == null) {
            return p105m2.C2623v.f25370c;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putStringArrayList("controlCategories", this.f1884a);
        return new p105m2.C2623v(bundle, this.f1884a);
    }

    public void e() {
        this.f1884a.add(D0.C0210k.f1911c);
    }

    public void f(float f9, float f10, float f11, float f12, float f13, float f14) {
        this.f1884a.add(new D0.l(f9, f10, f11, f12, f13, f14));
    }

    public void g(float f9, float f10, float f11, float f12, float f13, float f14) {
        this.f1884a.add(new D0.t(f9, f10, f11, f12, f13, f14));
    }

    public void h(float f9) {
        this.f1884a.add(new D0.m(f9));
    }

    public void i(float f9) {
        this.f1884a.add(new D0.u(f9));
    }

    public void j(float f9, float f10) {
        this.f1884a.add(new D0.n(f9, f10));
    }

    public void k(float f9, float f10) {
        this.f1884a.add(new D0.v(f9, f10));
    }

    public void l(float f9, float f10) {
        this.f1884a.add(new D0.o(f9, f10));
    }

    public void m(float f9, float f10, float f11, float f12) {
        this.f1884a.add(new D0.q(f9, f10, f11, f12));
    }

    public void n(float f9, float f10, float f11, float f12) {
        this.f1884a.add(new D0.y(f9, f10, f11, f12));
    }

    public void o(float f9) {
        this.f1884a.add(new D0.B(f9));
    }

    public void p(float f9) {
        this.f1884a.add(new D0.A(f9));
    }

    public C0206g() {
        this.f1884a = new java.util.ArrayList(32);
    }
}
