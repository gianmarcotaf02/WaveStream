package U;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p113n1.c f10044i;
    public final /* synthetic */ p020c0.X j;

    public /* synthetic */ l0(p113n1.c cVar, p020c0.X x9, int i3) {
        this.f10043h = i3;
        this.f10044i = cVar;
        this.j = x9;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f10043h) {
            case 0:
                p137q0.m mVar = p137q0.m.f26474b;
                E5.c1 c1Var = new E5.c1(3, (kotlin.jvm.functions.Function0) obj);
                U.l0 l0Var = new U.l0(this.f10044i, this.j, 1);
                if (v.m0.a()) {
                    return v.m0.a() ? new v.C2888i0(c1Var, l0Var, android.os.Build.VERSION.SDK_INT == 28 ? v.A0.f28797b : v.A0.f28798c) : mVar;
                }
                throw new java.lang.UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            default:
                p113n1.i iVar = (p113n1.i) obj;
                float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (iVar.f25558a >> 32));
                p113n1.c cVar = this.f10044i;
                this.j.setValue(new p113n1.m((((long) cVar.k0(fIntBitsToFloat)) << 32) | (((long) cVar.k0(java.lang.Float.intBitsToFloat((int) (iVar.f25558a & 4294967295L)))) & 4294967295L)));
                return p070h6.A.f22523a;
        }
    }
}
