package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class S implements java.util.Map.Entry, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f26926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f26927i;

    public S(java.lang.Object obj, java.lang.Object obj2) {
        this.f26926h = obj;
        this.f26927i = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p153r8.S)) {
            return false;
        }
        p153r8.S s9 = (p153r8.S) obj;
        return kotlin.jvm.internal.m.a(this.f26926h, s9.f26926h) && kotlin.jvm.internal.m.a(this.f26927i, s9.f26927i);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f26926h;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.f26927i;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Object obj = this.f26926h;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f26927i;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MapEntry(key=");
        sb.append(this.f26926h);
        sb.append(", value=");
        return B2.a.n(sb, this.f26927i, ')');
    }
}
