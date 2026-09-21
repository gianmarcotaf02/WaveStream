package p078i6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class A implements java.util.Iterator, p201y6.a {
    public abstract int a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return java.lang.Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
