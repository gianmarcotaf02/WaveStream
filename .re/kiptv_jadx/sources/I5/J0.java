package I5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class J0 implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I5.P2 f4778i;
    public final /* synthetic */ java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p020c0.X f4779k;

    public /* synthetic */ J0(I5.P2 p2, java.lang.String str, p020c0.X x9, int i3) {
        this.f4777h = i3;
        this.f4778i = p2;
        this.j = str;
        this.f4779k = x9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f4777h) {
            case 0:
                this.f4779k.setValue(new I5.H0(this.f4778i, this.j, 5));
                break;
            default:
                this.f4779k.setValue(new I5.H0(this.f4778i, this.j, 3));
                break;
        }
        return p070h6.A.f22523a;
    }
}
