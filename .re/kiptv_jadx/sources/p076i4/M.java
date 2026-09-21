package p076i4;

/* JADX INFO: loaded from: classes.dex */
public abstract class M implements java.lang.Comparable, java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f22812h;

    public M(java.lang.Comparable comparable) {
        this.f22812h = comparable;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Comparable, java.lang.Object] */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(p076i4.M m8) {
        if (m8 == p076i4.L.f22808k) {
            return 1;
        }
        if (m8 == p076i4.L.j) {
            return -1;
        }
        java.lang.Object obj = m8.f22812h;
        p076i4.P0 p2 = p076i4.P0.j;
        int iCompareTo = this.f22812h.compareTo(obj);
        return iCompareTo != 0 ? iCompareTo : java.lang.Boolean.compare(false, false);
    }

    public abstract void b(java.lang.StringBuilder sb);

    public abstract void c(java.lang.StringBuilder sb);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Comparable, java.lang.Object] */
    public java.lang.Comparable d() {
        return this.f22812h;
    }

    public abstract boolean e(java.lang.Comparable comparable);

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p076i4.M) {
            try {
                if (compareTo((p076i4.M) obj) == 0) {
                    return true;
                }
            } catch (java.lang.ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}
