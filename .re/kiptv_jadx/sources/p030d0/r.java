package p030d0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p030d0.J {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p030d0.r f21146f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p030d0.r f21147h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p030d0.r f21145e = new p030d0.r(1, 2, 0);
    public static final p030d0.r g = new p030d0.r(1, 2, 2);

    static {
        int i3 = 1;
        f21146f = new p030d0.r(i3, i3, 1);
        int i9 = 1;
        f21147h = new p030d0.r(i9, i9, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i3, int i9, int i10) {
        super(i3, i9, 0, (byte) 0);
        this.f21148d = i10;
    }

    @Override // p030d0.J
    public final void c(U.C0948v c0948v, p020c0.InterfaceC1672c interfaceC1672c, p020c0.N0 n3, p089k0.k kVar, p030d0.K k9) {
        switch (this.f21148d) {
            case 0:
                java.lang.Object objInvoke = ((kotlin.jvm.functions.Function0) c0948v.g(0)).invoke();
                p020c0.C1668a c1668a = (p020c0.C1668a) c0948v.g(1);
                int iF = c0948v.f(0);
                c1668a.getClass();
                n3.U(n3.c(c1668a), objInvoke);
                interfaceC1672c.k(iF, objInvoke);
                interfaceC1672c.d(objInvoke);
                break;
            case 1:
                p020c0.C1668a c1668a2 = (p020c0.C1668a) c0948v.g(0);
                int iF2 = c0948v.f(0);
                interfaceC1672c.j();
                c1668a2.getClass();
                interfaceC1672c.c(iF2, n3.D(n3.c(c1668a2)));
                break;
            case 2:
                java.lang.Object objG = c0948v.g(0);
                p020c0.C1668a c1668a3 = (p020c0.C1668a) c0948v.g(1);
                int iF3 = c0948v.f(0);
                if (objG instanceof p020c0.D0) {
                    p020c0.D0 d4 = (p020c0.D0) objG;
                    kVar.f24427e.c(d4);
                    kVar.f24426d.a(d4);
                }
                java.lang.Object objK = n3.K(n3.c(c1668a3), iF3, objG);
                if (objK instanceof p020c0.D0) {
                    kVar.e((p020c0.D0) objK);
                } else if (objK instanceof p020c0.C1701q0) {
                    ((p020c0.C1701q0) objK).d();
                }
                break;
            default:
                java.lang.Object objG2 = c0948v.g(0);
                int iF4 = c0948v.f(0);
                if (objG2 instanceof p020c0.D0) {
                    p020c0.D0 d6 = (p020c0.D0) objG2;
                    kVar.f24427e.c(d6);
                    kVar.f24426d.a(d6);
                }
                java.lang.Object objK2 = n3.K(n3.f18170t, iF4, objG2);
                if (objK2 instanceof p020c0.D0) {
                    kVar.e((p020c0.D0) objK2);
                } else if (objK2 instanceof p020c0.C1701q0) {
                    ((p020c0.C1701q0) objK2).d();
                }
                break;
        }
    }

    @Override // p030d0.J
    public p020c0.C1668a d(U.C0948v c0948v) {
        switch (this.f21148d) {
            case 0:
                return (p020c0.C1668a) c0948v.g(1);
            case 1:
                return (p020c0.C1668a) c0948v.g(0);
            default:
                return super.d(c0948v);
        }
    }
}
