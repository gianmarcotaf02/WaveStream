package p114n2;

/* JADX INFO: loaded from: classes.dex */
public final class F extends p114n2.I {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.Class f25595l;

    public F(java.lang.Class cls) {
        super(true);
        if (android.os.Parcelable.class.isAssignableFrom(cls) || java.io.Serializable.class.isAssignableFrom(cls)) {
            this.f25595l = cls;
            return;
        }
        throw new java.lang.IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // p114n2.I
    public final java.lang.Object a(java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.m.e(bundle, "bundle");
        return bundle.get(str);
    }

    @Override // p114n2.I
    public final java.lang.String b() {
        return this.f25595l.getName();
    }

    @Override // p114n2.I
    public final java.lang.Object d(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // p114n2.I
    public final void e(android.os.Bundle bundle, java.lang.String key, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(key, "key");
        this.f25595l.cast(obj);
        if (obj == null || (obj instanceof android.os.Parcelable)) {
            bundle.putParcelable(key, (android.os.Parcelable) obj);
        } else if (obj instanceof java.io.Serializable) {
            bundle.putSerializable(key, (java.io.Serializable) obj);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p114n2.F.class.equals(obj.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f25595l, ((p114n2.F) obj).f25595l);
    }

    public final int hashCode() {
        return this.f25595l.hashCode();
    }
}
