package p056g0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p056g0.a {
    public final java.lang.Object[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p056g0.j f21763k;

    public g(int i3, int i9, int i10, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        super(i3, i9);
        this.j = objArr2;
        int i11 = (i9 - 1) & (-32);
        this.f21763k = new p056g0.j(objArr, i3 > i11 ? i11 : i3, i11, i10);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        p056g0.j jVar = this.f21763k;
        if (jVar.hasNext()) {
            this.f21748h++;
            return jVar.next();
        }
        int i3 = this.f21748h;
        this.f21748h = i3 + 1;
        return this.j[i3 - jVar.f21749i];
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i3 = this.f21748h;
        p056g0.j jVar = this.f21763k;
        int i9 = jVar.f21749i;
        if (i3 <= i9) {
            this.f21748h = i3 - 1;
            return jVar.previous();
        }
        int i10 = i3 - 1;
        this.f21748h = i10;
        return this.j[i10 - i9];
    }
}
