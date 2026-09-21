package p163t;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements p020c0.e1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p163t.u0 f27673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public kotlin.jvm.internal.o f27674i;
    public kotlin.jvm.internal.o j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p163t.r0 f27675k;

    /* JADX WARN: Multi-variable type inference failed */
    public q0(p163t.r0 r0Var, p163t.u0 u0Var, p194x6.j jVar, p194x6.j jVar2) {
        this.f27675k = r0Var;
        this.f27673h = u0Var;
        this.f27674i = (kotlin.jvm.internal.o) jVar;
        this.j = (kotlin.jvm.internal.o) jVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.o, x6.j] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.internal.o, x6.j] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.internal.o, x6.j] */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.internal.o, x6.j] */
    public final void c(p163t.s0 s0Var) {
        java.lang.Object objInvoke = this.j.invoke(s0Var.b());
        boolean zG = this.f27675k.f27678c.g();
        p163t.u0 u0Var = this.f27673h;
        if (zG) {
            u0Var.g(this.j.invoke(s0Var.a()), objInvoke, (p163t.A) this.f27674i.invoke(s0Var));
        } else {
            u0Var.h(objInvoke, (p163t.A) this.f27674i.invoke(s0Var));
        }
    }

    @Override // p020c0.e1
    public final java.lang.Object getValue() {
        c(this.f27675k.f27678c.f());
        return this.f27673h.f27708q.getValue();
    }
}
