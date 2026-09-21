package q2;

/* JADX INFO: loaded from: classes.dex */
public final class h implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26620h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26621i;
    public final /* synthetic */ F3.C0371k j;

    public h(F3.C0371k c0371k) {
        this.j = c0371k;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26620h + 1 < ((p136q.T) this.j.f3602c).g();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f26621i = true;
        p136q.T t9 = (p136q.T) this.j.f3602c;
        int i3 = this.f26620h + 1;
        this.f26620h = i3;
        return (p114n2.t) t9.h(i3);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f26621i) {
            throw new java.lang.IllegalStateException("You must call next() before you can remove an element");
        }
        p136q.T t9 = (p136q.T) this.j.f3602c;
        ((p114n2.t) t9.h(this.f26620h)).j = null;
        int i3 = this.f26620h;
        java.lang.Object[] objArr = t9.j;
        java.lang.Object obj = objArr[i3];
        java.lang.Object obj2 = p136q.AbstractC2674s.f26420c;
        if (obj != obj2) {
            objArr[i3] = obj2;
            t9.f26355h = true;
        }
        this.f26620h = i3 - 1;
        this.f26621i = false;
    }
}
