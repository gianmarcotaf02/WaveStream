package p110m7;

/* JADX INFO: loaded from: classes4.dex */
public final class G implements java.util.Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.util.Iterator f25451h;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25451h.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return (java.lang.String) this.f25451h.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
