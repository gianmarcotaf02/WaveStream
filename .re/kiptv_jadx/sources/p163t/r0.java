package p163t;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p163t.E0 f27676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p020c0.C1681g0 f27677b = p020c0.AbstractC1703s.y(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p163t.y0 f27678c;

    public r0(p163t.y0 y0Var, p163t.E0 e6, java.lang.String str) {
        this.f27678c = y0Var;
        this.f27676a = e6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p163t.q0 a(p194x6.j jVar, p194x6.j jVar2) {
        p020c0.C1681g0 c1681g0 = this.f27677b;
        p163t.q0 q0Var = (p163t.q0) c1681g0.getValue();
        p163t.y0 y0Var = this.f27678c;
        if (q0Var == null) {
            java.lang.Object objInvoke = jVar2.invoke(y0Var.f27727a.s0());
            java.lang.Object objInvoke2 = jVar2.invoke(y0Var.f27727a.s0());
            p163t.E0 e6 = this.f27676a;
            p163t.r rVar = (p163t.r) e6.f27453a.invoke(objInvoke2);
            rVar.d();
            p163t.u0 u0Var = new p163t.u0(y0Var, objInvoke, rVar, e6);
            q0Var = new p163t.q0(this, u0Var, jVar, jVar2);
            c1681g0.setValue(q0Var);
            y0Var.f27734i.add(u0Var);
        }
        q0Var.j = (kotlin.jvm.internal.o) jVar2;
        q0Var.f27674i = (kotlin.jvm.internal.o) jVar;
        q0Var.c(y0Var.f());
        return q0Var;
    }
}
