package p038e0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements java.util.ListIterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f21323i;
    public int j;

    public d(int i3, int i9, java.util.List list) {
        this.f21322h = i9;
        switch (i9) {
            case 1:
                this.f21323i = list;
                this.j = i3 - 1;
                break;
            default:
                this.f21323i = list;
                this.j = i3;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        switch (this.f21322h) {
            case 0:
                this.f21323i.add(this.j, obj);
                this.j++;
                break;
            default:
                int i3 = this.j + 1;
                this.j = i3;
                this.f21323i.add(i3, obj);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f21322h) {
            case 0:
                return this.j < this.f21323i.size();
            default:
                return this.j < this.f21323i.size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f21322h) {
            case 0:
                return this.j > 0;
            default:
                return this.j >= 0;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        switch (this.f21322h) {
            case 0:
                int i3 = this.j;
                this.j = i3 + 1;
                return this.f21323i.get(i3);
            default:
                int i9 = this.j + 1;
                this.j = i9;
                return this.f21323i.get(i9);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f21322h) {
            case 0:
                return this.j;
            default:
                return this.j + 1;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        switch (this.f21322h) {
            case 0:
                int i3 = this.j - 1;
                this.j = i3;
                return this.f21323i.get(i3);
            default:
                int i9 = this.j;
                this.j = i9 - 1;
                return this.f21323i.get(i9);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f21322h) {
            case 0:
                return this.j - 1;
            default:
                return this.j;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f21322h) {
            case 0:
                int i3 = this.j - 1;
                this.j = i3;
                this.f21323i.remove(i3);
                break;
            default:
                this.f21323i.remove(this.j);
                this.j--;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        switch (this.f21322h) {
            case 0:
                this.f21323i.set(this.j, obj);
                break;
            default:
                this.f21323i.set(this.j, obj);
                break;
        }
    }
}
