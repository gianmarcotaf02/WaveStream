package J;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Y implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J.g0 f5744i;

    public /* synthetic */ Y(J.g0 g0Var, int i3) {
        this.f5743h = i3;
        this.f5744i = g0Var;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f5743h) {
            case 0:
                this.f5744i.c(((p181w0.a) obj).f29744a, U.C0952z.f10100d);
                break;
            case 1:
                K0.x xVar = (K0.x) obj;
                this.f5744i.e(K0.w.g(xVar, false));
                xVar.a();
                break;
            default:
                K0.x xVar2 = (K0.x) obj;
                this.f5744i.e(K0.w.g(xVar2, false));
                xVar2.a();
                break;
        }
        return p070h6.A.f22523a;
    }
}
