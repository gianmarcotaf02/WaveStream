package p014b4;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p014b4.k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient java.lang.Object f17902k;

    public o(java.lang.Object obj) {
        this.f17902k = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.f17902k.equals(obj);
    }

    @Override // p014b4.f
    public final int d(java.lang.Object[] objArr) {
        objArr[0] = this.f17902k;
        return 1;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f17902k.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        java.lang.Object obj = this.f17902k;
        p014b4.l lVar = new p014b4.l();
        lVar.f17892h = obj;
        return lVar;
    }

    @Override // p014b4.k
    public final p014b4.j q() {
        java.lang.Object[] objArr = {this.f17902k};
        for (int i3 = 0; i3 < 1; i3++) {
            p014b4.g gVar = p014b4.j.f17889i;
            if (objArr[i3] == null) {
                throw new java.lang.NullPointerException(com.google.android.gms.internal.play_billing.M0.l(i3, "at index "));
            }
        }
        return p014b4.j.p(objArr, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return Y6.f.h("[", this.f17902k.toString(), "]");
    }
}
