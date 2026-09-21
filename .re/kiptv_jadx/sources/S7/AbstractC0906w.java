package S7;

/* JADX INFO: renamed from: S7.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0906w extends p100l6.a implements p100l6.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final S7.C0905v f9624h = new S7.C0905v(p100l6.d.f24819h, new J5.t2(27));

    public AbstractC0906w() {
        super(p100l6.d.f24819h);
    }

    public abstract void V(p100l6.h hVar, java.lang.Runnable runnable);

    public void W(p100l6.h hVar, java.lang.Runnable runnable) {
        X7.a.i(this, hVar, runnable);
    }

    public boolean X(p100l6.h hVar) {
        return !(this instanceof S7.E0);
    }

    public S7.AbstractC0906w Y(int i3) {
        X7.a.a(i3);
        return new X7.g(this, i3);
    }

    @Override // p100l6.a, p100l6.h
    public final p100l6.f get(p100l6.g key) {
        p100l6.f fVar;
        kotlin.jvm.internal.m.e(key, "key");
        if (!(key instanceof S7.C0905v)) {
            if (p100l6.d.f24819h == key) {
                return this;
            }
            return null;
        }
        S7.C0905v c0905v = (S7.C0905v) key;
        p100l6.g key2 = getKey();
        kotlin.jvm.internal.m.e(key2, "key");
        if ((key2 == c0905v || c0905v.f9623i == key2) && (fVar = (p100l6.f) c0905v.f9622h.invoke(this)) != null) {
            return fVar;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x002c A[RETURN] */
    @Override // p100l6.a, p100l6.h
    public final p100l6.h minusKey(p100l6.g key) {
        kotlin.jvm.internal.m.e(key, "key");
        boolean z6 = key instanceof S7.C0905v;
        p100l6.i iVar = p100l6.i.f24820h;
        if (!z6) {
            if (p100l6.d.f24819h == key) {
                return iVar;
            }
            return this;
        }
        S7.C0905v c0905v = (S7.C0905v) key;
        p100l6.g key2 = getKey();
        kotlin.jvm.internal.m.e(key2, "key");
        if ((key2 == c0905v || c0905v.f9623i == key2) && ((p100l6.f) c0905v.f9622h.invoke(this)) != null) {
            return iVar;
        }
        return this;
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + '@' + S7.C.s(this);
    }
}
