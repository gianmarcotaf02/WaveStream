package O6;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements O6.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f7989i;

    public /* synthetic */ i(int i3, java.util.List list) {
        this.f7988h = i3;
        this.f7989i = list;
    }

    @Override // O6.h
    public final boolean h(p101l7.c fqName) {
        switch (this.f7988h) {
            case 0:
                return O2.g.P(this, fqName);
            case 1:
                kotlin.jvm.internal.m.e(fqName, "fqName");
                java.util.Iterator it = ((java.lang.Iterable) p078i6.o.Y0((java.util.List) this.f7989i).f7463b).iterator();
                while (it.hasNext()) {
                    if (((O6.h) it.next()).h(fqName)) {
                        return true;
                    }
                }
                return false;
            default:
                return O2.g.P(this, fqName);
        }
    }

    @Override // O6.h
    public final boolean isEmpty() {
        switch (this.f7988h) {
            case 0:
                return ((java.util.List) this.f7989i).isEmpty();
            case 1:
                java.util.List list = (java.util.List) this.f7989i;
                if (list != null && list.isEmpty()) {
                    return true;
                }
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((O6.h) it.next()).isEmpty()) {
                        return false;
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        switch (this.f7988h) {
            case 0:
                return ((java.util.List) this.f7989i).iterator();
            case 1:
                return new N7.h(new N7.j(p078i6.o.Y0((java.util.List) this.f7989i), O6.k.f7994h, N7.s.f7466h));
            default:
                return p078i6.v.f23204h;
        }
    }

    @Override // O6.h
    public final O6.b k(p101l7.c fqName) {
        switch (this.f7988h) {
            case 0:
                return O2.g.J(this, fqName);
            case 1:
                kotlin.jvm.internal.m.e(fqName, "fqName");
                N7.h hVar = (N7.h) N7.o.q0(p078i6.o.Y0((java.util.List) this.f7989i), new N6.H(fqName, 1)).iterator();
                return (O6.b) (!hVar.hasNext() ? null : hVar.next());
            default:
                kotlin.jvm.internal.m.e(fqName, "fqName");
                if (fqName.equals((p101l7.c) this.f7989i)) {
                    return p035d7.b.f21253a;
                }
                return null;
        }
    }

    public java.lang.String toString() {
        switch (this.f7988h) {
            case 0:
                return ((java.util.List) this.f7989i).toString();
            default:
                return super.toString();
        }
    }

    public i(O6.h[] hVarArr) {
        this.f7988h = 1;
        this.f7989i = p078i6.m.E0(hVarArr);
    }

    public i(p101l7.c fqNameToMatch) {
        this.f7988h = 2;
        kotlin.jvm.internal.m.e(fqNameToMatch, "fqNameToMatch");
        this.f7989i = fqNameToMatch;
    }
}
