package p154s;

/* JADX INFO: renamed from: s.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2722h extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ O0.g0[] f27147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p154s.C2723i f27148i;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f27149k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2722h(O0.g0[] g0VarArr, p154s.C2723i c2723i, int i3, int i9) {
        super(1);
        this.f27147h = g0VarArr;
        this.f27148i = c2723i;
        this.j = i3;
        this.f27149k = i9;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        O0.f0 f0Var = (O0.f0) obj;
        for (O0.g0 g0Var : this.f27147h) {
            if (g0Var != null) {
                long jA = this.f27148i.f27150a.f27162b.a((((long) g0Var.f7639h) << 32) | (((long) g0Var.f7640i) & 4294967295L), (((long) this.j) << 32) | (((long) this.f27149k) & 4294967295L), p113n1.n.f25566h);
                f0Var.g(g0Var, (int) (jA >> 32), (int) (jA & 4294967295L), 0.0f);
            }
        }
        return p070h6.A.f22523a;
    }
}
