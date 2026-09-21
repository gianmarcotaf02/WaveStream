package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class U0 extends p076i4.AbstractC2214p0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient p076i4.AbstractC2194f0 f22837k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient java.lang.Object[] f22838l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient int f22839m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final transient int f22840n;

    public U0(p076i4.AbstractC2194f0 abstractC2194f0, java.lang.Object[] objArr, int i3, int i9) {
        this.f22837k = abstractC2194f0;
        this.f22838l = objArr;
        this.f22839m = i3;
        this.f22840n = i9;
    }

    @Override // p076i4.W, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value != null && value.equals(this.f22837k.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p076i4.W
    public final int e(java.lang.Object[] objArr, int i3) {
        return d().e(objArr, i3);
    }

    @Override // p076i4.W
    public final boolean p() {
        return true;
    }

    @Override // p076i4.W
    /* JADX INFO: renamed from: q */
    public final p076i4.j1 iterator() {
        return d().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f22840n;
    }

    @Override // p076i4.AbstractC2214p0
    public final p076i4.AbstractC2186b0 u() {
        return new p076i4.T0(this);
    }
}
