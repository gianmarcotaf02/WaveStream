package p076i4;

/* JADX INFO: loaded from: classes.dex */
public abstract class g1 implements java.util.Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.Iterator f22901h;

    public g1(java.util.Iterator it) {
        it.getClass();
        this.f22901h = it;
    }

    public abstract java.lang.Object a(java.lang.Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22901h.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return a(this.f22901h.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f22901h.remove();
    }
}
