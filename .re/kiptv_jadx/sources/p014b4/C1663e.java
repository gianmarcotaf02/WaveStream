package p014b4;

/* JADX INFO: renamed from: b4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1663e implements java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f17882h;

    public C1663e(java.lang.Object obj) {
        this.f17882h = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p014b4.C1663e) {
            return p014b4.AbstractC1659a.d(this.f17882h, ((p014b4.C1663e) obj).f17882h);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f17882h});
    }

    public final java.lang.String toString() {
        return Y6.f.h("Suppliers.ofInstance(", this.f17882h.toString(), ")");
    }
}
