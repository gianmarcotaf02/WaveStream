package N6;

/* JADX INFO: loaded from: classes4.dex */
public final class I implements N6.J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f7371a;

    public I(java.util.ArrayList arrayList) {
        this.f7371a = arrayList;
    }

    @Override // N6.J
    public final boolean a(p101l7.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        java.util.ArrayList arrayList = this.f7371a;
        if (arrayList.isEmpty()) {
            return true;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.m.a(((Q6.C) ((N6.G) it.next())).f8549l, fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // N6.J
    public final void b(p101l7.c fqName, java.util.ArrayList arrayList) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        for (java.lang.Object obj : this.f7371a) {
            if (kotlin.jvm.internal.m.a(((Q6.C) ((N6.G) obj)).f8549l, fqName)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // N6.J
    public final java.util.Collection k(p101l7.c fqName, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        return N7.o.s0(N7.o.k0(N7.o.p0(p078i6.o.Y0(this.f7371a), N6.r.j), new N6.H(fqName, 0)));
    }
}
