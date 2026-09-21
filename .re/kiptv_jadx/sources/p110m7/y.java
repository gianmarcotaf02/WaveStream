package p110m7;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements java.util.Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.x f25509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.C1497d f25510i;
    public int j;

    public y(p110m7.z zVar) {
        p110m7.x xVar = new p110m7.x(zVar);
        this.f25509h = xVar;
        this.f25510i = new androidx.datastore.preferences.protobuf.C1497d(xVar.next());
        this.j = zVar.f25512i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.j > 0;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!this.f25510i.hasNext()) {
            this.f25510i = new androidx.datastore.preferences.protobuf.C1497d(this.f25509h.next());
        }
        this.j--;
        return java.lang.Byte.valueOf(this.f25510i.a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
