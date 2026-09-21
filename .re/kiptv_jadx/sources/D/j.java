package D;

/* JADX INFO: loaded from: classes.dex */
public final class j extends F.AbstractC0349n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B8.h f1695b = new B8.h(1, (byte) 0);

    public j(p194x6.j jVar) {
        jVar.invoke(this);
    }

    public static void p(D.j jVar, java.lang.String str, p089k0.e eVar, int i3) {
        if ((i3 & 1) != 0) {
            str = null;
        }
        jVar.getClass();
        jVar.f1695b.a(1, new D.g(str != null ? new D.h(0, str) : null, new B5.r(8), new p089k0.e(-857469575, new D.i(0, eVar), true)));
    }

    @Override // F.AbstractC0349n
    public final B8.h k() {
        return this.f1695b;
    }

    public final void q(int i3, p194x6.j jVar, p194x6.j jVar2, p089k0.e eVar) {
        this.f1695b.a(i3, new D.g(jVar, jVar2, eVar));
    }
}
