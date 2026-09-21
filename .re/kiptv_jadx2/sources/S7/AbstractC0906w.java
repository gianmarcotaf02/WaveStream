package S7;

import J5.t2;

public abstract class AbstractC0906w extends p100l6.a implements p100l6.e {

    public static final C0905v f9624h = new C0905v(p100l6.d.f24819h, new t2(27));

    public AbstractC0906w() {
        super(p100l6.d.f24819h);
    }

    public abstract void V(p100l6.h hVar, Runnable runnable);

    public void W(p100l6.h hVar, Runnable runnable) {
        X7.a.i(this, hVar, runnable);
    }

    public boolean X(p100l6.h hVar) {
        return !(this instanceof E0);
    }

    public AbstractC0906w Y(int i3) {
        X7.a.a(i3);
        return new X7.g(this, i3);
    }

    @Override
    public final p100l6.f get(p100l6.g key) {
        p100l6.f fVar;
        kotlin.jvm.internal.m.e(key, "key");
        if (!(key instanceof C0905v)) {
            if (p100l6.d.f24819h == key) {
                return this;
            }
            return null;
        }
        C0905v c0905v = (C0905v) key;
        p100l6.g key2 = getKey();
        kotlin.jvm.internal.m.e(key2, "key");
        if ((key2 == c0905v || c0905v.f9623i == key2) && (fVar = (p100l6.f) c0905v.f9622h.invoke(this)) != null) {
            return fVar;
        }
        return null;
    }

    @Override
    public final p100l6.h minusKey(p100l6.g key) {
        kotlin.jvm.internal.m.e(key, "key");
        boolean z6 = key instanceof C0905v;
        p100l6.i iVar = p100l6.i.f24820h;
        if (!z6) {
            if (p100l6.d.f24819h == key) {
                return iVar;
            }
            return this;
        }
        C0905v c0905v = (C0905v) key;
        p100l6.g key2 = getKey();
        kotlin.jvm.internal.m.e(key2, "key");
        if ((key2 == c0905v || c0905v.f9623i == key2) && ((p100l6.f) c0905v.f9622h.invoke(this)) != null) {
            return iVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + C.s(this);
    }
}
