package O0;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends Q0.C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O0.l0 f7656b = new O0.l0("Undefined intrinsics block and it is required");

    @Override // O0.S
    public final O0.T g(O0.U u6, java.util.List list, long j) {
        int size = list.size();
        p078i6.x xVar = p078i6.x.f23206h;
        if (size == 0) {
            return u6.q0(p113n1.a.j(j), p113n1.a.i(j), xVar, O0.h0.j);
        }
        if (size == 1) {
            O0.g0 g0VarC = ((O0.Q) list.get(0)).C(j);
            return u6.q0(p113n1.b.g(g0VarC.f7639h, j), p113n1.b.f(g0VarC.f7640i, j), xVar, new O0.j0(g0VarC, 0));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            O0.g0 g0VarC2 = ((O0.Q) list.get(i3)).C(j);
            iMax = java.lang.Math.max(g0VarC2.f7639h, iMax);
            iMax2 = java.lang.Math.max(g0VarC2.f7640i, iMax2);
            arrayList.add(g0VarC2);
        }
        return u6.q0(p113n1.b.g(iMax, j), p113n1.b.f(iMax2, j), xVar, new O0.k0(0, arrayList));
    }
}
