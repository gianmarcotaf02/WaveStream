package p154s;

/* JADX INFO: loaded from: classes.dex */
public final class L extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ O0.g0 f27073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f27074i;
    public final /* synthetic */ long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p029d.b f27075k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(O0.g0 g0Var, long j, long j9, p029d.b bVar) {
        super(1);
        this.f27073h = g0Var;
        this.f27074i = j;
        this.j = j9;
        this.f27075k = bVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        O0.f0 f0Var = (O0.f0) obj;
        long j = this.f27074i;
        long j9 = this.j;
        int i3 = ((int) (j >> 32)) + ((int) (j9 >> 32));
        int i9 = ((int) (j & 4294967295L)) + ((int) (j9 & 4294967295L));
        p029d.b bVar = this.f27075k;
        O0.g0 g0Var = this.f27073h;
        f0Var.getClass();
        O0.f0.a(f0Var, g0Var);
        g0Var.h0(p113n1.k.c((((long) i3) << 32) | (((long) i9) & 4294967295L), g0Var.f7642l), 0.0f, bVar);
        return p070h6.A.f22523a;
    }
}
