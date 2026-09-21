package p123o2;

/* JADX INFO: loaded from: classes.dex */
@p114n2.J("dialog")
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo2/n;", "Ln2/K;", "Lo2/m;", "<init>", "()V", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class n extends p114n2.K {
    @Override // p114n2.K
    public final p114n2.t a() {
        p089k0.e eVar = p123o2.e.f26051a;
        return new p123o2.m(this);
    }

    @Override // p114n2.K
    public final void d(java.util.List list, p114n2.B b9) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((p114n2.C2650i) it.next());
        }
    }

    @Override // p114n2.K
    public final void e(p114n2.C2650i c2650i, boolean z6) {
        b().e(c2650i, z6);
        int iL1 = p078i6.o.l1((java.lang.Iterable) ((V7.n0) b().f25639f.f10419h).getValue(), c2650i);
        int i3 = 0;
        for (java.lang.Object obj : (java.lang.Iterable) ((V7.n0) b().f25639f.f10419h).getValue()) {
            int i9 = i3 + 1;
            if (i3 < 0) {
                p078i6.p.H0();
                throw null;
            }
            p114n2.C2650i c2650i2 = (p114n2.C2650i) obj;
            if (i3 > iL1) {
                b().c(c2650i2);
            }
            i3 = i9;
        }
    }
}
