package p154s;

/* JADX INFO: renamed from: s.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2728n extends p154s.W {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p163t.r0 f27158v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p020c0.X f27159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p154s.C2729o f27160x;
    public long y;

    @Override // p137q0.o
    public final void H0() {
        this.y = p154s.AbstractC2721g.f27145a;
    }

    @Override // Q0.InterfaceC0788w
    public final O0.T b(O0.U u6, O0.Q q9, long j) {
        long j9;
        O0.g0 g0VarC = q9.C(j);
        if (u6.V()) {
            j9 = (((long) g0VarC.f7639h) << 32) | (((long) g0VarC.f7640i) & 4294967295L);
        } else {
            p163t.r0 r0Var = this.f27158v;
            if (r0Var == null) {
                j9 = (((long) g0VarC.f7639h) << 32) | (((long) g0VarC.f7640i) & 4294967295L);
                this.y = j9;
            } else {
                long j10 = (((long) g0VarC.f7640i) & 4294967295L) | (((long) g0VarC.f7639h) << 32);
                p163t.q0 q0VarA = r0Var.a(new A0.b(this, j10), new p154s.M(this, j10, 3));
                this.f27160x.getClass();
                j9 = ((p113n1.m) q0VarA.getValue()).f25565a;
                this.y = ((p113n1.m) q0VarA.getValue()).f25565a;
            }
        }
        return u6.q0((int) (j9 >> 32), (int) (4294967295L & j9), p078i6.x.f23206h, new p154s.C2727m(this, g0VarC, j9));
    }
}
