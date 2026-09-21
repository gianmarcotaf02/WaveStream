package p114n2;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p114n2.C2653l f25607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25608b;

    public abstract p114n2.t a();

    public final p114n2.C2653l b() {
        p114n2.C2653l c2653l = this.f25607a;
        if (c2653l != null) {
            return c2653l;
        }
        throw new java.lang.IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(java.util.List list, p114n2.B b9) {
        N7.h hVar = new N7.h(new N7.i(N7.o.p0(p078i6.o.Y0(list), new p078i6.C2255f(this, b9)), false, new J5.t2(4)));
        while (hVar.hasNext()) {
            b().f((p114n2.C2650i) hVar.next());
        }
    }

    public void e(p114n2.C2650i c2650i, boolean z6) {
        java.util.List list = (java.util.List) ((V7.n0) b().f25638e.f10419h).getValue();
        if (!list.contains(c2650i)) {
            throw new java.lang.IllegalStateException(("popBackStack was called with " + c2650i + " which does not exist in back stack " + list).toString());
        }
        java.util.ListIterator listIterator = list.listIterator(list.size());
        p114n2.C2650i c2650i2 = null;
        while (f()) {
            c2650i2 = (p114n2.C2650i) listIterator.previous();
            if (kotlin.jvm.internal.m.a(c2650i2, c2650i)) {
                break;
            }
        }
        if (c2650i2 != null) {
            b().d(c2650i2, z6);
        }
    }

    public boolean f() {
        return true;
    }

    public p114n2.t c(p114n2.t tVar) {
        return tVar;
    }
}
