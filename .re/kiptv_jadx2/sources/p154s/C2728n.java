package p154s;

import A0.b;
import O0.Q;
import O0.T;
import O0.U;
import O0.g0;
import p020c0.X;
import p078i6.x;
import p113n1.m;
import p163t.q0;
import p163t.r0;

public final class C2728n extends W {

    public r0 f27158v;

    public X f27159w;

    public C2729o f27160x;
    public long y;

    @Override
    public final void H0() {
        this.y = AbstractC2721g.f27145a;
    }

    @Override
    public final T b(U u6, Q q9, long j) {
        long j9;
        g0 g0VarC = q9.C(j);
        if (u6.V()) {
            j9 = (((long) g0VarC.f7639h) << 32) | (((long) g0VarC.f7640i) & 4294967295L);
        } else {
            r0 r0Var = this.f27158v;
            if (r0Var == null) {
                j9 = (((long) g0VarC.f7639h) << 32) | (((long) g0VarC.f7640i) & 4294967295L);
                this.y = j9;
            } else {
                long j10 = (((long) g0VarC.f7640i) & 4294967295L) | (((long) g0VarC.f7639h) << 32);
                q0 q0VarA = r0Var.a(new b(this, j10), new M(this, j10, 3));
                this.f27160x.getClass();
                j9 = ((m) q0VarA.getValue()).f25565a;
                this.y = ((m) q0VarA.getValue()).f25565a;
            }
        }
        return u6.q0((int) (j9 >> 32), (int) (4294967295L & j9), x.f23206h, new C2727m(this, g0VarC, j9));
    }
}
