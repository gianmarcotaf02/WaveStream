package p076i4;

/* JADX INFO: renamed from: i4.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2229x0 extends p076i4.g1 implements java.util.ListIterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22949i;
    public final /* synthetic */ java.util.AbstractList j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2229x0(java.util.AbstractList abstractList, java.util.ListIterator listIterator, int i3) {
        super(listIterator);
        this.f22949i = i3;
        this.j = abstractList;
    }

    @Override // p076i4.g1
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.f22949i) {
            case 0:
                return ((p076i4.C2231y0) this.j).f22951i.apply(obj);
            default:
                return ((p076i4.C2233z0) this.j).f22955i.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((java.util.ListIterator) this.f22901h).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((java.util.ListIterator) this.f22901h).nextIndex();
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        return a(((java.util.ListIterator) this.f22901h).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((java.util.ListIterator) this.f22901h).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
