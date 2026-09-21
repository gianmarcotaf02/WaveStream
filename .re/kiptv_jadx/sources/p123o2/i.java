package p123o2;

/* JADX INFO: loaded from: classes.dex */
@p114n2.J("composable")
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo2/i;", "Ln2/K;", "Lo2/h;", "<init>", "()V", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class i extends p114n2.K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p020c0.C1681g0 f26057c = p020c0.AbstractC1703s.y(java.lang.Boolean.FALSE);

    @Override // p114n2.K
    public final p114n2.t a() {
        return new p123o2.h(this, p123o2.c.f26049a);
    }

    @Override // p114n2.K
    public final void d(java.util.List list, p114n2.B b9) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p114n2.C2650i backStackEntry = (p114n2.C2650i) it.next();
            p114n2.C2653l c2653lB = b();
            kotlin.jvm.internal.m.e(backStackEntry, "backStackEntry");
            V7.n0 n0Var = c2653lB.f25636c;
            java.lang.Iterable iterable = (java.lang.Iterable) n0Var.getValue();
            boolean z6 = iterable instanceof java.util.Collection;
            V7.W w6 = c2653lB.f25638e;
            if (!z6 || !((java.util.Collection) iterable).isEmpty()) {
                java.util.Iterator it2 = iterable.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((p114n2.C2650i) it2.next()) == backStackEntry) {
                            java.lang.Iterable iterable2 = (java.lang.Iterable) ((V7.n0) w6.f10419h).getValue();
                            if (!(iterable2 instanceof java.util.Collection) || !((java.util.Collection) iterable2).isEmpty()) {
                                java.util.Iterator it3 = iterable2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((p114n2.C2650i) it3.next()) == backStackEntry) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            p114n2.C2650i c2650i = (p114n2.C2650i) p078i6.o.s1((java.util.List) ((V7.n0) w6.f10419h).getValue());
            if (c2650i != null) {
                n0Var.i(null, p078i6.I.p0((java.util.Set) n0Var.getValue(), c2650i));
            }
            n0Var.i(null, p078i6.I.p0((java.util.Set) n0Var.getValue(), backStackEntry));
            c2653lB.f(backStackEntry);
        }
        this.f26057c.setValue(java.lang.Boolean.FALSE);
    }

    @Override // p114n2.K
    public final void e(p114n2.C2650i c2650i, boolean z6) {
        b().e(c2650i, z6);
        this.f26057c.setValue(java.lang.Boolean.TRUE);
    }

    public final void g(p114n2.C2650i entry) {
        p114n2.C2653l c2653lB = b();
        kotlin.jvm.internal.m.e(entry, "entry");
        V7.n0 n0Var = c2653lB.f25636c;
        n0Var.i(null, p078i6.I.p0((java.util.Set) n0Var.getValue(), entry));
        q2.f fVar = c2653lB.f25640h.f25684b;
        fVar.getClass();
        if (!fVar.f26600f.contains(entry)) {
            throw new java.lang.IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        entry.b(androidx.lifecycle.EnumC1533o.f16366k);
    }
}
