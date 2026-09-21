package p056g0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p056g0.a {
    public final /* synthetic */ int j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f21752k;

    public d(java.lang.Object[] objArr, int i3, int i9) {
        super(i3, i9);
        this.f21752k = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        switch (this.j) {
            case 0:
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                int i3 = this.f21748h;
                this.f21748h = i3 + 1;
                return ((java.lang.Object[]) this.f21752k)[i3];
            default:
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                this.f21748h++;
                return this.f21752k;
        }
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        switch (this.j) {
            case 0:
                if (!hasPrevious()) {
                    throw new java.util.NoSuchElementException();
                }
                int i3 = this.f21748h - 1;
                this.f21748h = i3;
                return ((java.lang.Object[]) this.f21752k)[i3];
            default:
                if (!hasPrevious()) {
                    throw new java.util.NoSuchElementException();
                }
                this.f21748h--;
                return this.f21752k;
        }
    }

    public d(int i3, java.lang.Object obj) {
        super(i3, 1);
        this.f21752k = obj;
    }
}
