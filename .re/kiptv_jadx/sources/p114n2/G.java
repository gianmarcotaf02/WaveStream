package p114n2;

/* JADX INFO: loaded from: classes.dex */
public final class G extends p114n2.I {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.Class f25596l;

    public G(java.lang.Class cls) {
        super(true);
        if (!java.io.Serializable.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        try {
            this.f25596l = java.lang.Class.forName("[L" + cls.getName() + ';');
        } catch (java.lang.ClassNotFoundException e6) {
            throw new java.lang.RuntimeException(e6);
        }
    }

    @Override // p114n2.I
    public final java.lang.Object a(java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.m.e(bundle, "bundle");
        return (java.io.Serializable[]) bundle.get(str);
    }

    @Override // p114n2.I
    public final java.lang.String b() {
        return this.f25596l.getName();
    }

    @Override // p114n2.I
    public final java.lang.Object d(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // p114n2.I
    public final void e(android.os.Bundle bundle, java.lang.String key, java.lang.Object obj) {
        ?? r9 = (java.io.Serializable[]) obj;
        kotlin.jvm.internal.m.e(key, "key");
        this.f25596l.cast(r9);
        bundle.putSerializable(key, r9);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p114n2.G.class.equals(obj.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f25596l, ((p114n2.G) obj).f25596l);
    }

    @Override // p114n2.I
    public final boolean f(java.lang.Object obj, java.lang.Object obj2) {
        return p078i6.m.X((java.io.Serializable[]) obj, (java.io.Serializable[]) obj2);
    }

    public final int hashCode() {
        return this.f25596l.hashCode();
    }
}
