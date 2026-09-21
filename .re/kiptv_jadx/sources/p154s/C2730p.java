package p154s;

/* JADX INFO: renamed from: s.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2730p implements O0.S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p154s.C2737x f27165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27166b;

    public C2730p(p154s.C2737x c2737x) {
        this.f27165a = c2737x;
    }

    @Override // O0.S
    public final int a(O0.InterfaceC0728q interfaceC0728q, java.util.List list, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int iZ = ((O0.Q) list.get(0)).Z(i3);
        int iA0 = p078i6.p.A0(list);
        int i9 = 1;
        if (1 <= iA0) {
            while (true) {
                int iZ2 = ((O0.Q) list.get(i9)).Z(i3);
                if (iZ2 > iZ) {
                    iZ = iZ2;
                }
                if (i9 == iA0) {
                    break;
                }
                i9++;
            }
        }
        return iZ;
    }

    @Override // O0.S
    public final int b(O0.InterfaceC0728q interfaceC0728q, java.util.List list, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int iN = ((O0.Q) list.get(0)).n(i3);
        int iA0 = p078i6.p.A0(list);
        int i9 = 1;
        if (1 <= iA0) {
            while (true) {
                int iN2 = ((O0.Q) list.get(i9)).n(i3);
                if (iN2 > iN) {
                    iN = iN2;
                }
                if (i9 == iA0) {
                    break;
                }
                i9++;
            }
        }
        return iN;
    }

    @Override // O0.S
    public final int c(O0.InterfaceC0728q interfaceC0728q, java.util.List list, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int iZ = ((O0.Q) list.get(0)).z(i3);
        int iA0 = p078i6.p.A0(list);
        int i9 = 1;
        if (1 <= iA0) {
            while (true) {
                int iZ2 = ((O0.Q) list.get(i9)).z(i3);
                if (iZ2 > iZ) {
                    iZ = iZ2;
                }
                if (i9 == iA0) {
                    break;
                }
                i9++;
            }
        }
        return iZ;
    }

    @Override // O0.S
    public final int d(O0.InterfaceC0728q interfaceC0728q, java.util.List list, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int iA = ((O0.Q) list.get(0)).a(i3);
        int iA0 = p078i6.p.A0(list);
        int i9 = 1;
        if (1 <= iA0) {
            while (true) {
                int iA2 = ((O0.Q) list.get(i9)).a(i3);
                if (iA2 > iA) {
                    iA = iA2;
                }
                if (i9 == iA0) {
                    break;
                }
                i9++;
            }
        }
        return iA;
    }

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
        boolean zV = u6.V();
        p154s.C2737x c2737x = this.f27165a;
        if (zV) {
            this.f27166b = true;
            c2737x.f27191b.setValue(new p113n1.m((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        } else if (!this.f27166b) {
            c2737x.f27191b.setValue(new p113n1.m((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        }
        return u6.q0(iMax, iMax2, p078i6.x.f23206h, new O0.k0(3, arrayList));
    }
}
