package p154s;

import O0.f0;
import O0.g0;
import kotlin.jvm.internal.o;
import p070h6.A;
import p113n1.n;
import p137q0.d;
import p194x6.j;

public final class C2727m extends o implements j {

    public final C2728n f27156h;

    public final g0 f27157i;
    public final long j;

    public C2727m(C2728n c2728n, g0 g0Var, long j) {
        super(1);
        this.f27156h = c2728n;
        this.f27157i = g0Var;
        this.j = j;
    }

    @Override
    public final Object invoke(Object obj) {
        d dVar = this.f27156h.f27160x.f27162b;
        g0 g0Var = this.f27157i;
        f0.i((f0) obj, g0Var, dVar.a((((long) g0Var.f7640i) & 4294967295L) | (((long) g0Var.f7639h) << 32), this.j, n.f25566h));
        return A.f22523a;
    }
}
