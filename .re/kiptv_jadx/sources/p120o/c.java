package p120o;

/* JADX INFO: loaded from: classes.dex */
public final class c implements java.util.Map.Entry {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f25954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f25955i;
    public p120o.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p120o.c f25956k;

    public c(java.lang.Object obj, java.lang.Object obj2) {
        this.f25954h = obj;
        this.f25955i = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p120o.c)) {
            return false;
        }
        p120o.c cVar = (p120o.c) obj;
        return this.f25954h.equals(cVar.f25954h) && this.f25955i.equals(cVar.f25955i);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f25954h;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.f25955i;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f25954h.hashCode() ^ this.f25955i.hashCode();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("An entry modification is not supported");
    }

    public final java.lang.String toString() {
        return this.f25954h + "=" + this.f25955i;
    }
}
