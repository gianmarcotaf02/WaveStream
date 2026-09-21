package Q6;

/* JADX INFO: renamed from: Q6.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0803l implements N6.J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f8639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f8640b;

    public C0803l(java.util.List list, java.lang.String debugName) {
        kotlin.jvm.internal.m.e(debugName, "debugName");
        this.f8639a = list;
        this.f8640b = debugName;
        list.size();
        p078i6.o.R1(list).size();
    }

    @Override // N6.J
    public final boolean a(p101l7.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        java.util.List list = this.f8639a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!N6.AbstractC0709x.h((N6.J) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // N6.J
    public final void b(p101l7.c fqName, java.util.ArrayList arrayList) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        java.util.Iterator it = this.f8639a.iterator();
        while (it.hasNext()) {
            N6.AbstractC0709x.b((N6.J) it.next(), fqName, arrayList);
        }
    }

    @Override // N6.J
    public final java.util.Collection k(p101l7.c fqName, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = this.f8639a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((N6.J) it.next()).k(fqName, jVar));
        }
        return hashSet;
    }

    public final java.lang.String toString() {
        return this.f8640b;
    }
}
