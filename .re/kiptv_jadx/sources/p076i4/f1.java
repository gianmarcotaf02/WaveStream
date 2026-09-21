package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends p076i4.AbstractC2214p0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient java.lang.Object f22896k;

    public f1(java.lang.Object obj) {
        obj.getClass();
        this.f22896k = obj;
    }

    @Override // p076i4.W, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.f22896k.equals(obj);
    }

    @Override // p076i4.AbstractC2214p0, p076i4.W
    public final p076i4.AbstractC2186b0 d() {
        return p076i4.AbstractC2186b0.y(this.f22896k);
    }

    @Override // p076i4.W
    public final int e(java.lang.Object[] objArr, int i3) {
        objArr[i3] = this.f22896k;
        return i3 + 1;
    }

    @Override // p076i4.AbstractC2214p0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f22896k.hashCode();
    }

    @Override // p076i4.W
    public final boolean p() {
        return false;
    }

    @Override // p076i4.W
    /* JADX INFO: renamed from: q */
    public final p076i4.j1 iterator() {
        return new p076i4.C2225v0(this.f22896k);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return "[" + this.f22896k.toString() + ']';
    }
}
