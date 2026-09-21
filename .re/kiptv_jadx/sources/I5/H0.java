package I5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class H0 implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I5.P2 f4755i;
    public final /* synthetic */ java.lang.String j;

    public /* synthetic */ H0(I5.P2 p2, java.lang.String str, int i3) {
        this.f4754h = i3;
        this.f4755i = p2;
        this.j = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f4754h) {
            case 0:
                I5.P2 p2 = this.f4755i;
                S7.C.A(androidx.lifecycle.X.h(p2), null, new I5.O1(p2, this.j, null), 3);
                break;
            case 1:
                I5.P2 p9 = this.f4755i;
                S7.C.A(androidx.lifecycle.X.h(p9), null, new I5.F2(p9, this.j, null), 3);
                break;
            case 2:
                this.f4755i.A(this.j);
                break;
            case 3:
                this.f4755i.A(this.j);
                break;
            case 4:
                I5.P2 p10 = this.f4755i;
                S7.C.A(androidx.lifecycle.X.h(p10), null, new I5.K1(p10, this.j, null), 3);
                break;
            default:
                this.f4755i.A(this.j);
                break;
        }
        return p070h6.A.f22523a;
    }
}
