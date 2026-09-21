package I5;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t5.C2796e1 f4625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4626i;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I5.D0 f4627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p020c0.X f4628l;

    public B(t5.C2796e1 c2796e1, int i3, int i9, I5.D0 d4, p020c0.X x9) {
        this.f4625h = c2796e1;
        this.f4626i = i3;
        this.j = i9;
        this.f4627k = d4;
        this.f4628l = x9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        this.f4625h.a(this.f4626i);
        int i3 = ((I5.S) this.f4628l.getValue()).f4921k;
        int i9 = this.j;
        if (i9 != i3) {
            this.f4627k.v(i9);
        }
        return p070h6.A.f22523a;
    }
}
