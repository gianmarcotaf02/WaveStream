package p114n2;

/* JADX INFO: loaded from: classes.dex */
public final class E extends p114n2.I {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.Class f25594l;

    public E(java.lang.Class cls) {
        super(true);
        if (!android.os.Parcelable.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }
        try {
            this.f25594l = java.lang.Class.forName("[L" + cls.getName() + ';');
        } catch (java.lang.ClassNotFoundException e6) {
            throw new java.lang.RuntimeException(e6);
        }
    }

    @Override // p114n2.I
    public final java.lang.Object a(java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.m.e(bundle, "bundle");
        return (android.os.Parcelable[]) bundle.get(str);
    }

    @Override // p114n2.I
    public final java.lang.String b() {
        return this.f25594l.getName();
    }

    @Override // p114n2.I
    public final java.lang.Object d(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // p114n2.I
    public final void e(android.os.Bundle bundle, java.lang.String key, java.lang.Object obj) {
        android.os.Parcelable[] parcelableArr = (android.os.Parcelable[]) obj;
        kotlin.jvm.internal.m.e(key, "key");
        this.f25594l.cast(parcelableArr);
        bundle.putParcelableArray(key, parcelableArr);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p114n2.E.class.equals(obj.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f25594l, ((p114n2.E) obj).f25594l);
    }

    @Override // p114n2.I
    public final boolean f(java.lang.Object obj, java.lang.Object obj2) {
        return p078i6.m.X((android.os.Parcelable[]) obj, (android.os.Parcelable[]) obj2);
    }

    public final int hashCode() {
        return this.f25594l.hashCode();
    }
}
