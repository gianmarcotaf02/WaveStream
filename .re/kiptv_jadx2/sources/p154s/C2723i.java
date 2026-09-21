package p154s;

import O0.InterfaceC0728q;
import O0.Q;
import O0.S;
import O0.T;
import O0.U;
import O0.g0;
import java.util.List;
import p078i6.p;
import p078i6.x;
import p113n1.m;

public final class C2723i implements S {

    public final C2729o f27150a;

    public C2723i(C2729o c2729o) {
        this.f27150a = c2729o;
    }

    @Override
    public final int a(InterfaceC0728q interfaceC0728q, List list, int i3) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((Q) list.get(0)).Z(i3));
            int iA0 = p.A0(list);
            int i9 = 1;
            if (1 <= iA0) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((Q) list.get(i9)).Z(i3));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i9 == iA0) {
                        break;
                    }
                    i9++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override
    public final int b(InterfaceC0728q interfaceC0728q, List list, int i3) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((Q) list.get(0)).n(i3));
            int iA0 = p.A0(list);
            int i9 = 1;
            if (1 <= iA0) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((Q) list.get(i9)).n(i3));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i9 == iA0) {
                        break;
                    }
                    i9++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override
    public final int c(InterfaceC0728q interfaceC0728q, List list, int i3) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((Q) list.get(0)).z(i3));
            int iA0 = p.A0(list);
            int i9 = 1;
            if (1 <= iA0) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((Q) list.get(i9)).z(i3));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i9 == iA0) {
                        break;
                    }
                    i9++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override
    public final int d(InterfaceC0728q interfaceC0728q, List list, int i3) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((Q) list.get(0)).a(i3));
            int iA0 = p.A0(list);
            int i9 = 1;
            if (1 <= iA0) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((Q) list.get(i9)).a(i3));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i9 == iA0) {
                        break;
                    }
                    i9++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override
    public final T g(U u6, List list, long j) {
        int i3;
        g0 g0Var;
        g0 g0Var2;
        int i9;
        int i10;
        int size = list.size();
        g0[] g0VarArr = new g0[size];
        int size2 = list.size();
        long j9 = 0;
        int i11 = 0;
        while (true) {
            i3 = 1;
            g0Var = null;
            if (i11 >= size2) {
                break;
            }
            Q q9 = (Q) list.get(i11);
            Object objE = q9.E();
            C2725k c2725k = objE instanceof C2725k ? (C2725k) objE : null;
            if (c2725k != null && ((Boolean) c2725k.f27152b.getValue()).booleanValue()) {
                g0 g0VarC = q9.C(j);
                long j10 = (((long) g0VarC.f7640i) & 4294967295L) | (((long) g0VarC.f7639h) << 32);
                g0VarArr[i11] = g0VarC;
                j9 = j10;
            }
            i11++;
        }
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Q q10 = (Q) list.get(i12);
            if (g0VarArr[i12] == null) {
                g0VarArr[i12] = q10.C(j);
            }
        }
        if (u6.V()) {
            i9 = (int) (j9 >> 32);
        } else {
            if (size != 0) {
                g0Var2 = g0VarArr[0];
                int i13 = size - 1;
                if (i13 != 0) {
                    int i14 = g0Var2 != null ? g0Var2.f7639h : 0;
                    if (1 <= i13) {
                        int i15 = 1;
                        while (true) {
                            g0 g0Var3 = g0VarArr[i15];
                            int i16 = g0Var3 != null ? g0Var3.f7639h : 0;
                            if (i14 < i16) {
                                g0Var2 = g0Var3;
                                i14 = i16;
                            }
                            if (i15 == i13) {
                                break;
                            }
                            i15++;
                        }
                    }
                }
            } else {
                g0Var2 = null;
            }
            i9 = g0Var2 != null ? g0Var2.f7639h : 0;
        }
        if (u6.V()) {
            i10 = (int) (j9 & 4294967295L);
        } else {
            if (size != 0) {
                g0Var = g0VarArr[0];
                int i17 = size - 1;
                if (i17 != 0) {
                    int i18 = g0Var != null ? g0Var.f7640i : 0;
                    if (1 <= i17) {
                        while (true) {
                            g0 g0Var4 = g0VarArr[i3];
                            int i19 = g0Var4 != null ? g0Var4.f7640i : 0;
                            if (i18 < i19) {
                                g0Var = g0Var4;
                                i18 = i19;
                            }
                            if (i3 == i17) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
            i10 = g0Var != null ? g0Var.f7640i : 0;
        }
        if (!u6.V()) {
            this.f27150a.f27163c.setValue(new m((((long) i9) << 32) | (((long) i10) & 4294967295L)));
        }
        return u6.q0(i9, i10, x.f23206h, new C2722h(g0VarArr, this, i9, i10));
    }
}
