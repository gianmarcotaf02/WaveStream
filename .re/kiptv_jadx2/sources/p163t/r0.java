package p163t;

import kotlin.jvm.internal.o;
import p020c0.AbstractC1703s;
import p020c0.C1681g0;
import p194x6.j;

public final class r0 {

    public final E0 f27676a;

    public final C1681g0 f27677b = AbstractC1703s.y(null);

    public final y0 f27678c;

    public r0(y0 y0Var, E0 e6, String str) {
        this.f27678c = y0Var;
        this.f27676a = e6;
    }

    public final q0 a(j jVar, j jVar2) {
        C1681g0 c1681g0 = this.f27677b;
        q0 q0Var = (q0) c1681g0.getValue();
        y0 y0Var = this.f27678c;
        if (q0Var == null) {
            Object objInvoke = jVar2.invoke(y0Var.f27727a.s0());
            Object objInvoke2 = jVar2.invoke(y0Var.f27727a.s0());
            E0 e6 = this.f27676a;
            r rVar = (r) e6.f27453a.invoke(objInvoke2);
            rVar.d();
            u0 u0Var = new u0(y0Var, objInvoke, rVar, e6);
            q0Var = new q0(this, u0Var, jVar, jVar2);
            c1681g0.setValue(q0Var);
            y0Var.f27734i.add(u0Var);
        }
        q0Var.j = (o) jVar2;
        q0Var.f27674i = (o) jVar;
        q0Var.c(y0Var.f());
        return q0Var;
    }
}
