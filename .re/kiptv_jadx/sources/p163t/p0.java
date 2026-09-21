package p163t;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f27667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p163t.y0 f27668i;

    public /* synthetic */ p0(p163t.y0 y0Var, int i3) {
        this.f27667h = i3;
        this.f27668i = y0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f27667h) {
            case 0:
                p163t.y0 y0Var = this.f27668i;
                return java.lang.Boolean.valueOf((kotlin.jvm.internal.m.a(y0Var.f27730d.getValue(), y0Var.f27727a.s0()) && y0Var.g.g() == Long.MIN_VALUE && !((java.lang.Boolean) y0Var.f27733h.getValue()).booleanValue()) ? false : true);
            default:
                return java.lang.Long.valueOf(this.f27668i.b());
        }
    }
}
