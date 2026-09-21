package p154s;

import O0.InterfaceC0728q;
import O0.Q;
import O0.S;
import O0.T;
import O0.U;
import O0.g0;
import O0.k0;
import java.util.ArrayList;
import java.util.List;
import p078i6.p;
import p078i6.x;
import p113n1.m;

public final class C2730p implements S {

    public final C2737x f27165a;

    public boolean f27166b;

    public C2730p(C2737x c2737x) {
        this.f27165a = c2737x;
    }

    @Override
    public final int a(InterfaceC0728q interfaceC0728q, List list, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int iZ = ((Q) list.get(0)).Z(i3);
        int iA0 = p.A0(list);
        int i9 = 1;
        if (1 <= iA0) {
            while (true) {
                int iZ2 = ((Q) list.get(i9)).Z(i3);
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

    @Override
    public final int b(InterfaceC0728q interfaceC0728q, List list, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int iN = ((Q) list.get(0)).n(i3);
        int iA0 = p.A0(list);
        int i9 = 1;
        if (1 <= iA0) {
            while (true) {
                int iN2 = ((Q) list.get(i9)).n(i3);
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

    @Override
    public final int c(InterfaceC0728q interfaceC0728q, List list, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int iZ = ((Q) list.get(0)).z(i3);
        int iA0 = p.A0(list);
        int i9 = 1;
        if (1 <= iA0) {
            while (true) {
                int iZ2 = ((Q) list.get(i9)).z(i3);
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

    @Override
    public final int d(InterfaceC0728q interfaceC0728q, List list, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int iA = ((Q) list.get(0)).a(i3);
        int iA0 = p.A0(list);
        int i9 = 1;
        if (1 <= iA0) {
            while (true) {
                int iA2 = ((Q) list.get(i9)).a(i3);
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

    @Override
    public final T g(U u6, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            g0 g0VarC = ((Q) list.get(i3)).C(j);
            iMax = Math.max(iMax, g0VarC.f7639h);
            iMax2 = Math.max(iMax2, g0VarC.f7640i);
            arrayList.add(g0VarC);
        }
        boolean zV = u6.V();
        C2737x c2737x = this.f27165a;
        if (zV) {
            this.f27166b = true;
            c2737x.f27191b.setValue(new m((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        } else if (!this.f27166b) {
            c2737x.f27191b.setValue(new m((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        }
        return u6.q0(iMax, iMax2, x.f23206h, new k0(3, arrayList));
    }
}
