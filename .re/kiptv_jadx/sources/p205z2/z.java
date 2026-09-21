package p205z2;

/* JADX INFO: loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f32336h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f32337i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(boolean z6, int i3) {
        super(1);
        this.f32336h = i3;
        this.f32337i = z6;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        p070h6.A a2 = p070h6.A.f22523a;
        boolean z6 = this.f32337i;
        switch (this.f32336h) {
            case 0:
                ((p188x0.L) obj).b(!z6 ? 0.8f : 1.0f);
                break;
            default:
                Y0.x xVar = (Y0.x) obj;
                E6.u[] uVarArr = Y0.v.f11144a;
                Y0.w wVar = Y0.t.f11111I;
                E6.u uVar = Y0.v.f11144a[22];
                xVar.d(wVar, java.lang.Boolean.valueOf(z6));
                Y0.v.c(xVar, 4);
                break;
        }
        return a2;
    }
}
