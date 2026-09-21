package J;

/* JADX INFO: loaded from: classes.dex */
public final class v0 implements x.Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x.Q0 f5940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p020c0.F f5941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p020c0.F f5942c;

    public v0(x.Q0 q9, final J.w0 w0Var) {
        this.f5940a = q9;
        final int i3 = 0;
        this.f5941b = p020c0.AbstractC1703s.r(new kotlin.jvm.functions.Function0() { // from class: J.u0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                switch (i3) {
                    case 0:
                        J.w0 w0Var2 = w0Var;
                        return java.lang.Boolean.valueOf(w0Var2.f5945a.g() < w0Var2.f5946b.g());
                    default:
                        return java.lang.Boolean.valueOf(w0Var.f5945a.g() > 0.0f);
                }
            }
        });
        final int i9 = 1;
        this.f5942c = p020c0.AbstractC1703s.r(new kotlin.jvm.functions.Function0() { // from class: J.u0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                switch (i9) {
                    case 0:
                        J.w0 w0Var2 = w0Var;
                        return java.lang.Boolean.valueOf(w0Var2.f5945a.g() < w0Var2.f5946b.g());
                    default:
                        return java.lang.Boolean.valueOf(w0Var.f5945a.g() > 0.0f);
                }
            }
        });
    }

    @Override // x.Q0
    public final boolean a() {
        return this.f5940a.a();
    }

    @Override // x.Q0
    public final boolean b() {
        return ((java.lang.Boolean) this.f5942c.getValue()).booleanValue();
    }

    @Override // x.Q0
    public final java.lang.Object c(v.n0 n0Var, p194x6.m mVar, p100l6.c cVar) {
        return this.f5940a.c(n0Var, mVar, cVar);
    }

    @Override // x.Q0
    public final boolean d() {
        return ((java.lang.Boolean) this.f5941b.getValue()).booleanValue();
    }

    @Override // x.Q0
    public final float e(float f9) {
        return this.f5940a.e(f9);
    }
}
