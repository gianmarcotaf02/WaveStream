package J;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Z implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J.g0 f5746i;

    public /* synthetic */ Z(J.g0 g0Var, int i3) {
        this.f5745h = i3;
        this.f5746i = g0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f5745h) {
            case 0:
                this.f5746i.a();
                break;
            default:
                this.f5746i.onCancel();
                break;
        }
        return p070h6.A.f22523a;
    }
}
