package p163t;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z0 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f27740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p163t.y0 f27741i;

    public /* synthetic */ z0(p163t.y0 y0Var, int i3) {
        this.f27740h = i3;
        this.f27741i = y0Var;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f27740h) {
            case 0:
                return new p163t.B0(this.f27741i, 0);
            default:
                return new p163t.B0(this.f27741i, 1);
        }
    }
}
