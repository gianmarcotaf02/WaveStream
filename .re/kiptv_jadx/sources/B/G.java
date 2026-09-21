package B;

/* JADX INFO: loaded from: classes.dex */
public final class G extends p137q0.o implements Q0.InterfaceC0788w {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public B.E f467v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f468w;

    @Override // Q0.InterfaceC0788w
    public final int A(Q0.N n3, O0.Q q9, int i3) {
        return q9.Z(i3);
    }

    @Override // Q0.InterfaceC0788w
    public final O0.T b(O0.U u6, O0.Q q9, long j) {
        int iN = this.f467v == B.E.f465h ? q9.n(p113n1.a.g(j)) : q9.z(p113n1.a.g(j));
        if (iN < 0) {
            iN = 0;
        }
        if (iN < 0) {
            p113n1.j.a("width must be >= 0");
        }
        long jH = p113n1.b.h(iN, iN, 0, androidx.media3.common.util.Log.LOG_LEVEL_OFF);
        if (this.f468w) {
            jH = p113n1.b.e(j, jH);
        }
        O0.g0 g0VarC = q9.C(jH);
        return u6.q0(g0VarC.f7639h, g0VarC.f7640i, p078i6.x.f23206h, new B.C0073k(g0VarC, 2));
    }

    @Override // Q0.InterfaceC0788w
    public final int b0(Q0.N n3, O0.Q q9, int i3) {
        return this.f467v == B.E.f465h ? q9.n(i3) : q9.z(i3);
    }

    @Override // Q0.InterfaceC0788w
    public final int j(Q0.N n3, O0.Q q9, int i3) {
        return q9.a(i3);
    }

    @Override // Q0.InterfaceC0788w
    public final int t0(Q0.N n3, O0.Q q9, int i3) {
        return this.f467v == B.E.f465h ? q9.n(i3) : q9.z(i3);
    }
}
