package x;

/* JADX INFO: renamed from: x.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3058o implements x.Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p194x6.j f30960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x.C3056n f30961b = new x.C3056n(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v.s0 f30962c = new v.s0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p020c0.C1681g0 f30963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p020c0.C1681g0 f30964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p020c0.C1681g0 f30965f;

    public C3058o(p194x6.j jVar) {
        this.f30960a = jVar;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f30963d = p020c0.AbstractC1703s.y(bool);
        this.f30964e = p020c0.AbstractC1703s.y(bool);
        this.f30965f = p020c0.AbstractC1703s.y(bool);
    }

    @Override // x.Q0
    public final boolean a() {
        return ((java.lang.Boolean) this.f30963d.getValue()).booleanValue();
    }

    @Override // x.Q0
    public final java.lang.Object c(v.n0 n0Var, p194x6.m mVar, p100l6.c cVar) {
        java.lang.Object objM = S7.C.m(new x.C3054m(this, n0Var, mVar, null), cVar);
        return objM == p109m6.a.f25430h ? objM : p070h6.A.f22523a;
    }

    @Override // x.Q0
    public final float e(float f9) {
        return ((java.lang.Number) this.f30960a.invoke(java.lang.Float.valueOf(f9))).floatValue();
    }
}
