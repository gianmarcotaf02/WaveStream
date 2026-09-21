package D1;

/* JADX INFO: loaded from: classes.dex */
public class X implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1988i;
    public final java.lang.Object j;

    public /* synthetic */ X(int i3, java.lang.Object obj) {
        this.f1987h = i3;
        this.j = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1987h) {
            case 0:
                return this.f1988i < ((android.view.ViewGroup) this.j).getChildCount();
            case 1:
                return this.f1988i < ((byte[]) this.j).length;
            case 2:
                return this.f1988i < ((int[]) this.j).length;
            case 3:
                return this.f1988i < ((long[]) this.j).length;
            case 4:
                return this.f1988i < ((short[]) this.j).length;
            case 5:
                return this.f1988i < ((p078i6.AbstractC2254e) this.j).d();
            case 6:
                return this.f1988i < ((java.lang.Object[]) this.j).length;
            case 7:
                return this.f1988i > 0;
            default:
                return this.f1988i < ((p136q.T) this.j).g();
        }
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.f1987h) {
            case 0:
                int i3 = this.f1988i;
                this.f1988i = i3 + 1;
                android.view.View childAt = ((android.view.ViewGroup) this.j).getChildAt(i3);
                if (childAt != null) {
                    return childAt;
                }
                throw new java.lang.IndexOutOfBoundsException();
            case 1:
                int i9 = this.f1988i;
                byte[] bArr = (byte[]) this.j;
                if (i9 >= bArr.length) {
                    throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.f1988i));
                }
                this.f1988i = i9 + 1;
                return new p070h6.r(bArr[i9]);
            case 2:
                int i10 = this.f1988i;
                int[] iArr = (int[]) this.j;
                if (i10 >= iArr.length) {
                    throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.f1988i));
                }
                this.f1988i = i10 + 1;
                return new p070h6.t(iArr[i10]);
            case 3:
                int i11 = this.f1988i;
                long[] jArr = (long[]) this.j;
                if (i11 >= jArr.length) {
                    throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.f1988i));
                }
                this.f1988i = i11 + 1;
                return new p070h6.v(jArr[i11]);
            case 4:
                int i12 = this.f1988i;
                short[] sArr = (short[]) this.j;
                if (i12 >= sArr.length) {
                    throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.f1988i));
                }
                this.f1988i = i12 + 1;
                return new p070h6.y(sArr[i12]);
            case 5:
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                int i13 = this.f1988i;
                this.f1988i = i13 + 1;
                return ((p078i6.AbstractC2254e) this.j).get(i13);
            case 6:
                try {
                    java.lang.Object[] objArr = (java.lang.Object[]) this.j;
                    int i14 = this.f1988i;
                    this.f1988i = i14 + 1;
                    return objArr[i14];
                } catch (java.lang.ArrayIndexOutOfBoundsException e6) {
                    this.f1988i--;
                    throw new java.util.NoSuchElementException(e6.getMessage());
                }
            case 7:
                p153r8.C2713y c2713y = (p153r8.C2713y) this.j;
                int i15 = this.f1988i;
                this.f1988i = i15 - 1;
                return c2713y.f26949e[c2713y.f26947c - i15];
            default:
                int i16 = this.f1988i;
                this.f1988i = i16 + 1;
                return ((p136q.T) this.j).h(i16);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1987h) {
            case 0:
                int i3 = this.f1988i - 1;
                this.f1988i = i3;
                ((android.view.ViewGroup) this.j).removeViewAt(i3);
                return;
            case 1:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 7:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public X(java.lang.Object[] array) {
        this.f1987h = 6;
        kotlin.jvm.internal.m.e(array, "array");
        this.j = array;
    }

    public X(p153r8.C2713y c2713y) {
        this.f1987h = 7;
        this.j = c2713y;
        this.f1988i = c2713y.f26947c;
    }
}
