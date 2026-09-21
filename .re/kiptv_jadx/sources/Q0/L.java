package Q0;

/* JADX INFO: loaded from: classes.dex */
public final class L extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Q0.N f8287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f8288i;
    public final /* synthetic */ long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Q0.s0 f8289k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(Q0.N n3, long j, long j9, Q0.s0 s0Var) {
        super(0);
        this.f8287h = n3;
        this.f8288i = j;
        this.j = j9;
        this.f8289k = s0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        Q0.N n3 = this.f8287h;
        n3.F0().f8284h = false;
        n3.F0().f8285i = this.f8288i;
        n3.F0().j = this.j;
        p194x6.j jVarE = this.f8289k.f8469h.e();
        if (jVarE != null) {
            jVarE.invoke(n3.F0());
        }
        return p070h6.A.f22523a;
    }
}
