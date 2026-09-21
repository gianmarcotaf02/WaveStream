package E;

/* JADX INFO: loaded from: classes.dex */
public final class z implements F.W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E.w f2735a;

    public z(E.w wVar) {
        this.f2735a = wVar;
    }

    @Override // F.W
    public final int a() {
        E.w wVar = this.f2735a;
        return (int) (wVar.g().f2679q == x.EnumC3061p0.f30978h ? wVar.g().g() & 4294967295L : wVar.g().g() >> 32);
    }

    @Override // F.W
    public final float b() {
        E.w wVar = this.f2735a;
        return (wVar.f2717d.f1779b.g() * 500) + wVar.f2717d.f1780c.g();
    }

    @Override // F.W
    public final int c() {
        E.w wVar = this.f2735a;
        return (-wVar.g().f2676n) + wVar.g().f2680r;
    }

    @Override // F.W
    public final float d() {
        E.w wVar = this.f2735a;
        int iG = wVar.f2717d.f1779b.g();
        int iG2 = wVar.f2717d.f1780c.g();
        return wVar.d() ? (iG * 500) + iG2 + 100 : (iG * 500) + iG2;
    }

    @Override // F.W
    public final Y0.c e() {
        return new Y0.c(-1, -1);
    }

    @Override // F.W
    public final java.lang.Object f(int i3, F.a0 a0Var) {
        java.lang.Object objI = E.w.i(this.f2735a, i3, a0Var);
        return objI == p109m6.a.f25430h ? objI : p070h6.A.f22523a;
    }
}
