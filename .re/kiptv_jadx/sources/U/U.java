package U;

/* JADX INFO: loaded from: classes.dex */
public final class U implements O0.S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U.U f9940a = new U.U();

    @Override // O0.S
    public final O0.T g(O0.U u6, java.util.List list, long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            O0.g0 g0VarC = ((O0.Q) list.get(i3)).C(j);
            iMax = java.lang.Math.max(iMax, g0VarC.f7639h);
            iMax2 = java.lang.Math.max(iMax2, g0VarC.f7640i);
            arrayList.add(g0VarC);
        }
        return u6.q0(iMax, iMax2, p078i6.x.f23206h, new U.T(0, arrayList));
    }
}
