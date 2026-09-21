package p154s;

import O0.f0;
import O0.g0;
import kotlin.jvm.internal.o;
import p029d.b;
import p070h6.A;
import p113n1.k;
import p194x6.j;

public final class L extends o implements j {

    public final g0 f27073h;

    public final long f27074i;
    public final long j;

    public final b f27075k;

    public L(g0 g0Var, long j, long j9, b bVar) {
        super(1);
        this.f27073h = g0Var;
        this.f27074i = j;
        this.j = j9;
        this.f27075k = bVar;
    }

    @Override
    public final Object invoke(Object obj) {
        f0 f0Var = (f0) obj;
        long j = this.f27074i;
        long j9 = this.j;
        int i3 = ((int) (j >> 32)) + ((int) (j9 >> 32));
        int i9 = ((int) (j & 4294967295L)) + ((int) (j9 & 4294967295L));
        b bVar = this.f27075k;
        g0 g0Var = this.f27073h;
        f0Var.getClass();
        f0.a(f0Var, g0Var);
        g0Var.h0(k.c((((long) i3) << 32) | (((long) i9) & 4294967295L), g0Var.f7642l), 0.0f, bVar);
        return A.f22523a;
    }
}
