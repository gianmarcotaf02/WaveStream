package p014b4;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p014b4.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.lang.Object f17891i = new java.lang.Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f17892h;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17892h != f17891i;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.lang.Object obj = this.f17892h;
        java.lang.Object obj2 = f17891i;
        if (obj == obj2) {
            throw new java.util.NoSuchElementException();
        }
        this.f17892h = obj2;
        return obj;
    }
}
