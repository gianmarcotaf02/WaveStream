package N7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o extends N7.q {
    public static N7.m g0(java.util.Iterator it) {
        kotlin.jvm.internal.m.e(it, "<this>");
        return h0(new N7.p(1, it));
    }

    public static N7.m h0(N7.m mVar) {
        return mVar instanceof N7.a ? mVar : new N7.a(mVar);
    }

    public static int i0(N7.m mVar) {
        kotlin.jvm.internal.m.e(mVar, "<this>");
        java.util.Iterator it = mVar.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            it.next();
            i3++;
            if (i3 < 0) {
                p078i6.p.G0();
                throw null;
            }
        }
        return i3;
    }

    public static N7.m j0(N7.m mVar, int i3) {
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(Y6.f.f(i3, "Requested element count ", " is less than zero.").toString());
        }
        if (i3 == 0) {
            return mVar;
        }
        return mVar instanceof N7.f ? ((N7.f) mVar).b(i3) : new N7.e(mVar, i3, 0);
    }

    public static N7.i k0(N7.m mVar, p194x6.j predicate) {
        kotlin.jvm.internal.m.e(predicate, "predicate");
        return new N7.i(mVar, true, predicate);
    }

    public static final N7.j l0(N7.m mVar, p194x6.j jVar) {
        if (!(mVar instanceof N7.u)) {
            return new N7.j(mVar, new p108m5.c(5), jVar);
        }
        N7.u uVar = (N7.u) mVar;
        return new N7.j(uVar.f7470a, uVar.f7471b, jVar);
    }

    public static N7.m m0(java.lang.Object obj, p194x6.j jVar) {
        return obj == null ? N7.g.f7442a : new N7.l(new D5.C0261o(11, obj), jVar, 0);
    }

    public static N7.m n0(kotlin.jvm.functions.Function0 function0) {
        return h0(new N7.l(function0, new E5.c1(2, function0), 0));
    }

    public static java.lang.Object o0(N7.m mVar) {
        java.util.Iterator it = mVar.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException("Sequence is empty.");
        }
        java.lang.Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static N7.u p0(N7.m mVar, p194x6.j transform) {
        kotlin.jvm.internal.m.e(mVar, "<this>");
        kotlin.jvm.internal.m.e(transform, "transform");
        return new N7.u(mVar, transform);
    }

    public static N7.i q0(N7.m mVar, p194x6.j jVar) {
        return new N7.i(new N7.u(mVar, jVar), false, new J5.t2(4));
    }

    public static N7.m r0(N7.m mVar, int i3) {
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(Y6.f.f(i3, "Requested element count ", " is less than zero.").toString());
        }
        if (i3 == 0) {
            return N7.g.f7442a;
        }
        return mVar instanceof N7.f ? ((N7.f) mVar).a(i3) : new N7.e(mVar, i3, 1);
    }

    public static java.util.List s0(N7.m mVar) {
        kotlin.jvm.internal.m.e(mVar, "<this>");
        java.util.Iterator it = mVar.iterator();
        if (!it.hasNext()) {
            return p078i6.w.f23205h;
        }
        java.lang.Object next = it.next();
        if (!it.hasNext()) {
            return com.google.common.util.concurrent.P.i0(next);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
