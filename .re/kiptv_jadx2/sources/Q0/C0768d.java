package Q0;

import androidx.compose.ui.node.NodeCoordinator;

public final class C0768d extends kotlin.jvm.internal.o implements p194x6.j {

    public static final C0768d f8397i = new C0768d(1, 0);
    public static final C0768d j = new C0768d(1, 1);

    public static final C0768d f8398k = new C0768d(1, 2);

    public static final C0768d f8399l = new C0768d(1, 3);

    public static final C0768d f8400m = new C0768d(1, 4);

    public static final C0768d f8401n = new C0768d(1, 5);

    public static final C0768d f8402o = new C0768d(1, 6);

    public static final C0768d f8403p = new C0768d(1, 7);

    public static final C0768d f8404q = new C0768d(1, 8);

    public static final C0768d f8405r = new C0768d(1, 9);

    public static final C0768d f8406s = new C0768d(1, 10);

    public static final C0768d f8407t = new C0768d(1, 11);

    public final int f8408h;

    public C0768d(int i3, int i9) {
        super(i3);
        this.f8408h = i9;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f8408h) {
            case 0:
                InterfaceC0773g interfaceC0773g = (InterfaceC0773g) obj;
                F f9 = interfaceC0773g instanceof F ? (F) interfaceC0773g : null;
                if (f9 == null || !f9.f8240Y) {
                    return p070h6.A.f22523a;
                }
                throw new IllegalStateException("Apply is called on deactivated node " + interfaceC0773g);
            case 1:
                s0 s0Var = (s0) obj;
                if (s0Var.o()) {
                    N n3 = s0Var.f8470i;
                    if (!n3.f8301r) {
                        p194x6.j jVarE = s0Var.f8469h.e();
                        p136q.H h9 = n3.f8304u;
                        if (jVarE != null) {
                            n3.t0(s0Var, 9223372034707292159L, 0L);
                            n3.f8297n = jVarE;
                        } else if (h9 != null) {
                            Object[] objArr = h9.f26324c;
                            long[] jArr = h9.f26322a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                while (true) {
                                    long j9 = jArr[i3];
                                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i9 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((255 & j9) < 128) {
                                                n3.H0((p136q.I) objArr[(i3 << 3) + i10]);
                                            }
                                            j9 >>= 8;
                                        }
                                        if (i9 == 8) {
                                            if (i3 != length) {
                                                i3++;
                                            }
                                        }
                                    } else if (i3 != length) {
                                        i3++;
                                    }
                                }
                            }
                            h9.a();
                        }
                    }
                }
                return p070h6.A.f22523a;
            case 2:
                n0 n0Var = ((NodeCoordinator) obj).f15860S;
                if (n0Var != null) {
                    n0Var.invalidate();
                }
                return p070h6.A.f22523a;
            case 3:
                NodeCoordinator nodeCoordinator = (NodeCoordinator) obj;
                F f10 = nodeCoordinator.f15861v;
                try {
                    if (nodeCoordinator.o()) {
                        nodeCoordinator.t1(true);
                        break;
                    }
                    return p070h6.A.f22523a;
                } catch (Throwable th) {
                    f10.d0(th);
                    throw null;
                }
            case 4:
                k0 k0Var = (k0) obj;
                if (k0Var.o()) {
                    k0Var.f8445h.f0();
                }
                return p070h6.A.f22523a;
            case 5:
                F f11 = (F) obj;
                if (f11.K()) {
                    f11.Z(false);
                }
                return p070h6.A.f22523a;
            case 6:
                F f12 = (F) obj;
                if (f12.K()) {
                    f12.Z(false);
                }
                return p070h6.A.f22523a;
            case 7:
                F f13 = (F) obj;
                if (f13.K()) {
                    f13.X(false);
                }
                return p070h6.A.f22523a;
            case 8:
                F f14 = (F) obj;
                if (f14.K()) {
                    f14.X(false);
                }
                return p070h6.A.f22523a;
            case 9:
                F f15 = (F) obj;
                if (f15.K()) {
                    F.Y(f15, false, 7);
                }
                return p070h6.A.f22523a;
            case 10:
                F f16 = (F) obj;
                if (f16.K()) {
                    F.a0(f16, false, 7);
                }
                return p070h6.A.f22523a;
            default:
                F f17 = (F) obj;
                if (f17.K()) {
                    f17.I();
                }
                return p070h6.A.f22523a;
        }
    }
}
