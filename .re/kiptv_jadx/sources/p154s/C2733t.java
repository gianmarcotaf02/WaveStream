package p154s;

/* JADX INFO: renamed from: s.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2733t extends kotlin.jvm.internal.o implements p194x6.n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f27185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p163t.y0 f27186i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2733t(p194x6.j jVar, p163t.y0 y0Var) {
        super(3);
        this.f27185h = jVar;
        this.f27186i = y0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    @Override // p194x6.n
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long j;
        O0.U u6 = (O0.U) obj;
        O0.g0 g0VarC = ((O0.Q) obj2).C(((p113n1.a) obj3).f25547a);
        if (u6.V()) {
            if (((java.lang.Boolean) this.f27185h.invoke(this.f27186i.f27730d.getValue())).booleanValue()) {
                j = (((long) g0VarC.f7639h) << 32) | (((long) g0VarC.f7640i) & 4294967295L);
            } else {
                j = 0;
            }
        } else {
            j = (((long) g0VarC.f7639h) << 32) | (((long) g0VarC.f7640i) & 4294967295L);
        }
        return u6.q0((int) (j >> 32), (int) (4294967295L & j), p078i6.x.f23206h, new O0.j0(g0VarC, 3));
    }
}
