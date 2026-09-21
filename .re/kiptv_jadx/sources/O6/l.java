package O6;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements O6.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final O6.h f7995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C7.C0189v f7996i;

    public l(O6.h hVar, C7.C0189v c0189v) {
        this.f7995h = hVar;
        this.f7996i = c0189v;
    }

    @Override // O6.h
    public final boolean h(p101l7.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        if (((java.lang.Boolean) this.f7996i.invoke(fqName)).booleanValue()) {
            return this.f7995h.h(fqName);
        }
        return false;
    }

    @Override // O6.h
    public final boolean isEmpty() {
        O6.h hVar = this.f7995h;
        if ((hVar instanceof java.util.Collection) && ((java.util.Collection) hVar).isEmpty()) {
            return false;
        }
        java.util.Iterator it = hVar.iterator();
        while (it.hasNext()) {
            p101l7.c cVarA = ((O6.b) it.next()).a();
            if (cVarA != null && ((java.lang.Boolean) this.f7996i.invoke(cVarA)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.f7995h) {
            p101l7.c cVarA = ((O6.b) obj).a();
            if (cVarA != null && ((java.lang.Boolean) this.f7996i.invoke(cVarA)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // O6.h
    public final O6.b k(p101l7.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        if (((java.lang.Boolean) this.f7996i.invoke(fqName)).booleanValue()) {
            return this.f7995h.k(fqName);
        }
        return null;
    }
}
