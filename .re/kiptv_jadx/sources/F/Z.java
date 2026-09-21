package F;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Z implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ F.b0 f3401i;

    public /* synthetic */ Z(F.b0 b0Var, int i3) {
        this.f3400h = i3;
        this.f3401i = b0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f3400h) {
            case 0:
                return java.lang.Float.valueOf(this.f3401i.f3416w.b());
            case 1:
                return java.lang.Float.valueOf(this.f3401i.f3416w.d());
            default:
                F.b0 b0Var = this.f3401i;
                return java.lang.Float.valueOf(b0Var.f3416w.a() - b0Var.f3416w.c());
        }
    }
}
