package Q0;

/* JADX INFO: renamed from: Q0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0768d extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Q0.C0768d f8397i = new Q0.C0768d(1, 0);
    public static final Q0.C0768d j = new Q0.C0768d(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Q0.C0768d f8398k = new Q0.C0768d(1, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Q0.C0768d f8399l = new Q0.C0768d(1, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Q0.C0768d f8400m = new Q0.C0768d(1, 4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Q0.C0768d f8401n = new Q0.C0768d(1, 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Q0.C0768d f8402o = new Q0.C0768d(1, 6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Q0.C0768d f8403p = new Q0.C0768d(1, 7);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Q0.C0768d f8404q = new Q0.C0768d(1, 8);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Q0.C0768d f8405r = new Q0.C0768d(1, 9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Q0.C0768d f8406s = new Q0.C0768d(1, 10);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Q0.C0768d f8407t = new Q0.C0768d(1, 11);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8408h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0768d(int i3, int i9) {
        super(i3);
        this.f8408h = i9;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0117 A[LOOP:0: B:69:0x00e0->B:79:0x0117, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x011a A[SYNTHETIC] */
    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f8408h) {
            case 0:
                Q0.InterfaceC0773g interfaceC0773g = (Q0.InterfaceC0773g) obj;
                Q0.F f9 = interfaceC0773g instanceof Q0.F ? (Q0.F) interfaceC0773g : null;
                if (f9 == null || !f9.f8240Y) {
                    return p070h6.A.f22523a;
                }
                throw new java.lang.IllegalStateException("Apply is called on deactivated node " + interfaceC0773g);
            case 1:
                Q0.s0 s0Var = (Q0.s0) obj;
                if (s0Var.o()) {
                    Q0.N n3 = s0Var.f8470i;
                    if (!n3.f8301r) {
                        p194x6.j jVarE = s0Var.f8469h.e();
                        p136q.H h9 = n3.f8304u;
                        if (jVarE != null) {
                            n3.t0(s0Var, 9223372034707292159L, 0L);
                            n3.f8297n = jVarE;
                        } else if (h9 != null) {
                            java.lang.Object[] objArr = h9.f26324c;
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
                Q0.n0 n0Var = ((androidx.compose.ui.node.NodeCoordinator) obj).f15860S;
                if (n0Var != null) {
                    n0Var.invalidate();
                }
                return p070h6.A.f22523a;
            case 3:
                androidx.compose.ui.node.NodeCoordinator nodeCoordinator = (androidx.compose.ui.node.NodeCoordinator) obj;
                Q0.F f10 = nodeCoordinator.f15861v;
                try {
                    if (nodeCoordinator.o()) {
                        nodeCoordinator.t1(true);
                        break;
                    }
                    return p070h6.A.f22523a;
                } catch (java.lang.Throwable th) {
                    f10.d0(th);
                    throw null;
                }
            case 4:
                Q0.k0 k0Var = (Q0.k0) obj;
                if (k0Var.o()) {
                    k0Var.f8445h.f0();
                }
                return p070h6.A.f22523a;
            case 5:
                Q0.F f11 = (Q0.F) obj;
                if (f11.K()) {
                    f11.Z(false);
                }
                return p070h6.A.f22523a;
            case 6:
                Q0.F f12 = (Q0.F) obj;
                if (f12.K()) {
                    f12.Z(false);
                }
                return p070h6.A.f22523a;
            case 7:
                Q0.F f13 = (Q0.F) obj;
                if (f13.K()) {
                    f13.X(false);
                }
                return p070h6.A.f22523a;
            case 8:
                Q0.F f14 = (Q0.F) obj;
                if (f14.K()) {
                    f14.X(false);
                }
                return p070h6.A.f22523a;
            case 9:
                Q0.F f15 = (Q0.F) obj;
                if (f15.K()) {
                    Q0.F.Y(f15, false, 7);
                }
                return p070h6.A.f22523a;
            case 10:
                Q0.F f16 = (Q0.F) obj;
                if (f16.K()) {
                    Q0.F.a0(f16, false, 7);
                }
                return p070h6.A.f22523a;
            default:
                Q0.F f17 = (Q0.F) obj;
                if (f17.K()) {
                    f17.I();
                }
                return p070h6.A.f22523a;
        }
    }
}
