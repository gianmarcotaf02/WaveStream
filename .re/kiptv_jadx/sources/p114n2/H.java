package p114n2;

/* JADX INFO: loaded from: classes.dex */
public class H extends p114n2.I {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.Class f25597l;

    public H(java.lang.Class cls) {
        super(true);
        if (!java.io.Serializable.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        if (!cls.isEnum()) {
            this.f25597l = cls;
            return;
        }
        throw new java.lang.IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
    }

    @Override // p114n2.I
    public final java.lang.Object a(java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.m.e(bundle, "bundle");
        return (java.io.Serializable) bundle.get(str);
    }

    @Override // p114n2.I
    public java.lang.String b() {
        return this.f25597l.getName();
    }

    @Override // p114n2.I
    public final void e(android.os.Bundle bundle, java.lang.String key, java.lang.Object obj) {
        java.io.Serializable value = (java.io.Serializable) obj;
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        this.f25597l.cast(value);
        bundle.putSerializable(key, value);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p114n2.H)) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f25597l, ((p114n2.H) obj).f25597l);
    }

    @Override // p114n2.I
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public java.io.Serializable d(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f25597l.hashCode();
    }

    public H(java.lang.Class cls, int i3) {
        super(false);
        if (java.io.Serializable.class.isAssignableFrom(cls)) {
            this.f25597l = cls;
            return;
        }
        throw new java.lang.IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
