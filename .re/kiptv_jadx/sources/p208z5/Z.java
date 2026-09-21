package p208z5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Z implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f32605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p208z5.J1 f32606i;
    public final /* synthetic */ java.lang.String j;

    public /* synthetic */ Z(p208z5.J1 j9, java.lang.String str, int i3) {
        this.f32605h = i3;
        this.f32606i = j9;
        this.j = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f32605h) {
            case 0:
                this.f32606i.w(this.j);
                break;
            case 1:
                p208z5.J1 j9 = this.f32606i;
                S7.C.A(androidx.lifecycle.X.h(j9), null, new p208z5.O0(j9, this.j, null), 3);
                break;
            case 2:
                p208z5.J1 j10 = this.f32606i;
                S7.C.A(androidx.lifecycle.X.h(j10), null, new p208z5.z1(j10, this.j, null), 3);
                break;
            case 3:
                this.f32606i.w(this.j);
                break;
            case 4:
                p208z5.J1 j11 = this.f32606i;
                S7.C.A(androidx.lifecycle.X.h(j11), null, new p208z5.K0(j11, this.j, null), 3);
                break;
            default:
                this.f32606i.w(this.j);
                break;
        }
        return p070h6.A.f22523a;
    }
}
