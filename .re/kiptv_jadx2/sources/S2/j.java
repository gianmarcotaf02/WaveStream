package S2;

import android.graphics.Bitmap;

public abstract class j {

    public static final E2.j f9275a = new E2.j(W2.a.f10593a);

    public static final E2.j f9276b = new E2.j(X2.l.f10837b);

    public static final E2.j f9277c = new E2.j(null);

    public static final E2.j f9278d;

    public static final E2.j f9279e;

    public static final E2.j f9280f;
    public static final E2.j g;

    static {
        Boolean bool = Boolean.TRUE;
        f9278d = new E2.j(bool);
        f9279e = new E2.j(null);
        f9280f = new E2.j(bool);
        g = new E2.j(Boolean.FALSE);
    }

    public static final void a(e eVar) {
        E2.i iVar;
        Object obj = eVar.f9231o;
        if (obj instanceof E2.i) {
            iVar = (E2.i) obj;
        } else {
            if (!(obj instanceof E2.k)) {
                throw new AssertionError();
            }
            E2.k kVar = (E2.k) obj;
            kVar.getClass();
            E2.i iVar2 = new E2.i(kVar);
            eVar.f9231o = iVar2;
            iVar = iVar2;
        }
        iVar.f2784a.put(f9280f, Boolean.FALSE);
    }

    public static final Bitmap.Config b(o oVar) {
        return (Bitmap.Config) E2.p.e(oVar, f9276b);
    }
}
