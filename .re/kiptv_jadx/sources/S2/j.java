package S2;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E2.j f9275a = new E2.j(W2.a.f10593a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E2.j f9276b = new E2.j(X2.l.f10837b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E2.j f9277c = new E2.j(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E2.j f9278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final E2.j f9279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final E2.j f9280f;
    public static final E2.j g;

    static {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        f9278d = new E2.j(bool);
        f9279e = new E2.j(null);
        f9280f = new E2.j(bool);
        g = new E2.j(java.lang.Boolean.FALSE);
    }

    public static final void a(S2.e eVar) {
        E2.i iVar;
        java.lang.Object obj = eVar.f9231o;
        if (obj instanceof E2.i) {
            iVar = (E2.i) obj;
        } else {
            if (!(obj instanceof E2.k)) {
                throw new java.lang.AssertionError();
            }
            E2.k kVar = (E2.k) obj;
            kVar.getClass();
            E2.i iVar2 = new E2.i(kVar);
            eVar.f9231o = iVar2;
            iVar = iVar2;
        }
        iVar.f2784a.put(f9280f, java.lang.Boolean.FALSE);
    }

    public static final android.graphics.Bitmap.Config b(S2.o oVar) {
        return (android.graphics.Bitmap.Config) E2.p.e(oVar, f9276b);
    }
}
