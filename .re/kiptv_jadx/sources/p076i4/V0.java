package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class V0 extends p076i4.AbstractC2214p0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient p076i4.AbstractC2194f0 f22841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient p076i4.W0 f22842l;

    public V0(p076i4.AbstractC2194f0 abstractC2194f0, p076i4.W0 w6) {
        this.f22841k = abstractC2194f0;
        this.f22842l = w6;
    }

    @Override // p076i4.W, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.f22841k.get(obj) != null;
    }

    @Override // p076i4.AbstractC2214p0, p076i4.W
    public final p076i4.AbstractC2186b0 d() {
        return this.f22842l;
    }

    @Override // p076i4.W
    public final int e(java.lang.Object[] objArr, int i3) {
        return this.f22842l.e(objArr, i3);
    }

    @Override // p076i4.W
    public final boolean p() {
        return true;
    }

    @Override // p076i4.W
    /* JADX INFO: renamed from: q */
    public final p076i4.j1 iterator() {
        return this.f22842l.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f22841k.size();
    }
}
