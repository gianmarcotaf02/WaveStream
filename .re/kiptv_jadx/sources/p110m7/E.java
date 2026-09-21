package p110m7;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements java.lang.Comparable, java.util.Map.Entry {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Comparable f25448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f25449i;
    public final /* synthetic */ p110m7.A j;

    public E(p110m7.A a2, java.lang.Comparable comparable, java.lang.Object obj) {
        this.j = a2;
        this.f25448h = comparable;
        this.f25449i = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return this.f25448h.compareTo(((p110m7.E) obj).f25448h);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof java.util.Map.Entry) {
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                java.lang.Object key = entry.getKey();
                java.lang.Comparable comparable = this.f25448h;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    java.lang.Object obj2 = this.f25449i;
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
        return this.f25448h;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.f25449i;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Comparable comparable = this.f25448h;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        java.lang.Object obj = this.f25449i;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        this.j.b();
        java.lang.Object obj2 = this.f25449i;
        this.f25449i = obj;
        return obj2;
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.f25448h);
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.f25449i);
        return B2.a.o(new java.lang.StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, "=", strValueOf2);
    }
}
