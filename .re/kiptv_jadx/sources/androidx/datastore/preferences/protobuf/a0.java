package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements java.util.Map.Entry, java.lang.Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Comparable f16179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f16180i;
    public final /* synthetic */ androidx.datastore.preferences.protobuf.Z j;

    public a0(androidx.datastore.preferences.protobuf.Z z6, java.lang.Comparable comparable, java.lang.Object obj) {
        this.j = z6;
        this.f16179h = comparable;
        this.f16180i = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return this.f16179h.compareTo(((androidx.datastore.preferences.protobuf.a0) obj).f16179h);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof java.util.Map.Entry) {
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                java.lang.Object key = entry.getKey();
                java.lang.Comparable comparable = this.f16179h;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    java.lang.Object obj2 = this.f16180i;
                    java.lang.Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f16179h;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.f16180i;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Comparable comparable = this.f16179h;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        java.lang.Object obj = this.f16180i;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        this.j.b();
        java.lang.Object obj2 = this.f16180i;
        this.f16180i = obj;
        return obj2;
    }

    public final java.lang.String toString() {
        return this.f16179h + "=" + this.f16180i;
    }
}
