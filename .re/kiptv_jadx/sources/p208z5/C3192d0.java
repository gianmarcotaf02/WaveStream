package p208z5;

/* JADX INFO: renamed from: z5.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C3192d0 implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f32634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p208z5.J1 f32635i;
    public final /* synthetic */ java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p020c0.X f32636k;

    public /* synthetic */ C3192d0(p208z5.J1 j9, java.lang.String str, p020c0.X x9, int i3) {
        this.f32634h = i3;
        this.f32635i = j9;
        this.j = str;
        this.f32636k = x9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f32634h) {
            case 0:
                this.f32636k.setValue(new p208z5.Z(this.f32635i, this.j, 5));
                break;
            default:
                this.f32636k.setValue(new p208z5.Z(this.f32635i, this.j, 0));
                break;
        }
        return p070h6.A.f22523a;
    }
}
