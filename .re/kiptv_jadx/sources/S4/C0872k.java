package S4;

/* JADX INFO: renamed from: S4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0872k {
    public static S4.C0873l a(com.kiptv.core.model.C1944g0 c1944g0, java.util.List categories, com.kiptv.core.model.EnumC1937d enumC1937d) {
        java.util.Set setH0;
        kotlin.jvm.internal.m.e(categories, "categories");
        if (c1944g0 == null) {
            return S4.C0873l.f9408c;
        }
        N7.u uVarP0 = N7.o.p0(N7.o.k0(p078i6.o.Y0(categories), new B.K(c1944g0, enumC1937d, 22)), new J5.t2(12));
        java.util.Iterator it = uVarP0.f7470a.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            p194x6.j jVar = uVarP0.f7471b;
            java.lang.Object objInvoke = jVar.invoke(next);
            if (it.hasNext()) {
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                linkedHashSet.add(objInvoke);
                while (it.hasNext()) {
                    linkedHashSet.add(jVar.invoke(it.next()));
                }
                setH0 = linkedHashSet;
            } else {
                setH0 = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.h0(objInvoke);
            }
        } else {
            setH0 = p078i6.y.f23207h;
        }
        return new S4.C0873l(setH0, p078i6.o.R1(c1944g0.d(enumC1937d).f19690b));
    }
}
