package D0;

/* JADX INFO: loaded from: classes.dex */
public final class G implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1809h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.Iterator f1810i;

    public G(java.lang.Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        this.f1810i = kotlin.jvm.internal.m.h(array);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1809h) {
            case 0:
                return this.f1810i.hasNext();
            case 1:
                return ((D1.X) this.f1810i).hasNext();
            default:
                return ((p064h0.e) this.f1810i).j;
        }
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.f1809h) {
            case 0:
                return (D0.J) this.f1810i.next();
            case 1:
                return ((D1.X) this.f1810i).next();
            default:
                return (java.util.Map.Entry) ((p064h0.e) this.f1810i).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1809h) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new java.lang.UnsupportedOperationException();
            default:
                ((p064h0.e) this.f1810i).remove();
                return;
        }
    }

    public G(p089k0.i iVar) {
        p064h0.l[] lVarArr = new p064h0.l[8];
        for (int i3 = 0; i3 < 8; i3++) {
            lVarArr[i3] = new p064h0.n(this);
        }
        this.f1810i = new p064h0.e(iVar, lVarArr);
    }

    public G(D0.H h9) {
        this.f1810i = h9.f1819q.iterator();
    }
}
