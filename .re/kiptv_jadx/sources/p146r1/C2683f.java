package p146r1;

/* JADX INFO: renamed from: r1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2683f implements O0.S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p146r1.C2683f f26739b = new p146r1.C2683f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p146r1.C2683f f26740c = new p146r1.C2683f(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26741a;

    public /* synthetic */ C2683f(int i3) {
        this.f26741a = i3;
    }

    @Override // O0.S
    public final O0.T g(O0.U u6, java.util.List list, long j) {
        switch (this.f26741a) {
            case 0:
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                int size = list.size();
                int iJ = 0;
                int i3 = 0;
                for (int i9 = 0; i9 < size; i9++) {
                    O0.g0 g0VarC = ((O0.Q) list.get(i9)).C(j);
                    iJ = java.lang.Math.max(iJ, g0VarC.f7639h);
                    i3 = java.lang.Math.max(i3, g0VarC.f7640i);
                    arrayList.add(g0VarC);
                }
                if (list.isEmpty()) {
                    iJ = p113n1.a.j(j);
                    i3 = p113n1.a.i(j);
                }
                return u6.q0(iJ, i3, p078i6.x.f23206h, new O0.k0(1, arrayList));
            default:
                int size2 = list.size();
                p078i6.x xVar = p078i6.x.f23206h;
                if (size2 == 0) {
                    return u6.q0(0, 0, xVar, p146r1.C2681d.f26732m);
                }
                if (size2 == 1) {
                    O0.g0 g0VarC2 = ((O0.Q) list.get(0)).C(j);
                    return u6.q0(g0VarC2.f7639h, g0VarC2.f7640i, xVar, new O0.j0(g0VarC2, 2));
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i10 = 0; i10 < size3; i10++) {
                    O0.g0 g0VarC3 = ((O0.Q) list.get(i10)).C(j);
                    iMax = java.lang.Math.max(iMax, g0VarC3.f7639h);
                    iMax2 = java.lang.Math.max(iMax2, g0VarC3.f7640i);
                    arrayList2.add(g0VarC3);
                }
                return u6.q0(iMax, iMax2, xVar, new O0.k0(2, arrayList2));
        }
    }
}
