package D1;

/* JADX INFO: loaded from: classes.dex */
public final class B implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.Iterator f1959i;
    public final java.lang.Object j;

    public B(D1.X x9) {
        this.f1958h = 0;
        this.j = new java.util.ArrayList();
        this.f1959i = x9;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1958h) {
            case 0:
                break;
        }
        return this.f1959i.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.f1958h) {
            case 0:
                java.lang.Object next = this.f1959i.next();
                android.view.View view = (android.view.View) next;
                android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
                D1.X x9 = viewGroup != null ? new D1.X(0, viewGroup) : null;
                java.util.ArrayList arrayList = (java.util.ArrayList) this.j;
                if (x9 == null || !x9.hasNext()) {
                    while (!this.f1959i.hasNext() && !arrayList.isEmpty()) {
                        this.f1959i = (java.util.Iterator) p078i6.o.q1(arrayList);
                        p078i6.u.T0(arrayList);
                    }
                } else {
                    arrayList.add(this.f1959i);
                    this.f1959i = x9;
                }
                return next;
            default:
                return ((N7.u) this.j).f7471b.invoke(this.f1959i.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1958h) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public B(N7.u uVar) {
        this.f1958h = 1;
        this.j = uVar;
        this.f1959i = uVar.f7470a.iterator();
    }
}
