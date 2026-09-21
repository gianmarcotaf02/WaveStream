package v5;

/* JADX INFO: renamed from: v5.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2962y implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f29640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v5.d1 f29641i;

    public /* synthetic */ C2962y(v5.d1 d1Var, int i3) {
        this.f29640h = i3;
        this.f29641i = d1Var;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f29640h) {
            case 0:
                p020c0.I DisposableEffect = (p020c0.I) obj;
                kotlin.jvm.internal.m.e(DisposableEffect, "$this$DisposableEffect");
                return new C5.F0(16, this.f29641i);
            default:
                java.lang.Integer num = (java.lang.Integer) obj;
                num.getClass();
                v5.d1 d1Var = this.f29641i;
                return java.lang.Boolean.valueOf((d1Var.f29451u.contains(num) || d1Var.f29450t.contains(num)) ? false : true);
        }
    }
}
