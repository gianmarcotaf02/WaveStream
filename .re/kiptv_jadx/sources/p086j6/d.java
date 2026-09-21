package p086j6;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements java.util.Map.Entry, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p086j6.e f24238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24239i;
    public final int j;

    public d(p086j6.e map, int i3) {
        kotlin.jvm.internal.m.e(map, "map");
        this.f24238h = map;
        this.f24239i = i3;
        this.j = map.f24247o;
    }

    public final void a() {
        if (this.f24238h.f24247o != this.j) {
            throw new java.util.ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return kotlin.jvm.internal.m.a(entry.getKey(), getKey()) && kotlin.jvm.internal.m.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        a();
        return this.f24238h.f24241h[this.f24239i];
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        a();
        java.lang.Object[] objArr = this.f24238h.f24242i;
        kotlin.jvm.internal.m.b(objArr);
        return objArr[this.f24239i];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        java.lang.Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        a();
        p086j6.e eVar = this.f24238h;
        eVar.c();
        java.lang.Object[] objArr = eVar.f24242i;
        if (objArr == null) {
            int length = eVar.f24241h.length;
            if (length < 0) {
                throw new java.lang.IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new java.lang.Object[length];
            eVar.f24242i = objArr;
        }
        int i3 = this.f24239i;
        java.lang.Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
