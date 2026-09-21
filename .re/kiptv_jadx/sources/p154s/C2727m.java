package p154s;

/* JADX INFO: renamed from: s.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2727m extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p154s.C2728n f27156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O0.g0 f27157i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2727m(p154s.C2728n c2728n, O0.g0 g0Var, long j) {
        super(1);
        this.f27156h = c2728n;
        this.f27157i = g0Var;
        this.j = j;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        p137q0.d dVar = this.f27156h.f27160x.f27162b;
        O0.g0 g0Var = this.f27157i;
        O0.f0.i((O0.f0) obj, g0Var, dVar.a((((long) g0Var.f7640i) & 4294967295L) | (((long) g0Var.f7639h) << 32), this.j, p113n1.n.f25566h));
        return p070h6.A.f22523a;
    }
}
