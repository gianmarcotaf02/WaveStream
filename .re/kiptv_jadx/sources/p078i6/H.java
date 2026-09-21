package p078i6;

/* JADX INFO: loaded from: classes4.dex */
public final class H extends p078i6.AbstractC2254e implements java.util.RandomAccess {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object[] f23181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f23182i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23183k;

    public H(java.lang.Object[] objArr, int i3) {
        this.f23181h = objArr;
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i3 <= objArr.length) {
            this.f23182i = objArr.length;
            this.f23183k = i3;
        } else {
            java.lang.StringBuilder sbT = p121o0.p.t(i3, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbT.append(objArr.length);
            throw new java.lang.IllegalArgumentException(sbT.toString().toString());
        }
    }

    @Override // p078i6.AbstractC2250a
    public final int d() {
        return this.f23183k;
    }

    public final void e(int i3) {
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "n shouldn't be negative but it is ").toString());
        }
        if (i3 > this.f23183k) {
            java.lang.StringBuilder sbT = p121o0.p.t(i3, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbT.append(this.f23183k);
            throw new java.lang.IllegalArgumentException(sbT.toString().toString());
        }
        if (i3 > 0) {
            int i9 = this.j;
            int i10 = this.f23182i;
            int i11 = (i9 + i3) % i10;
            java.lang.Object[] objArr = this.f23181h;
            if (i9 > i11) {
                java.util.Arrays.fill(objArr, i9, i10, (java.lang.Object) null);
                java.util.Arrays.fill(objArr, 0, i11, (java.lang.Object) null);
            } else {
                java.util.Arrays.fill(objArr, i9, i11, (java.lang.Object) null);
            }
            this.j = i11;
            this.f23183k -= i3;
        }
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        int iD = d();
        if (i3 < 0 || i3 >= iD) {
            throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, iD, "index: ", ", size: "));
        }
        return this.f23181h[(this.j + i3) % this.f23182i];
    }

    @Override // p078i6.AbstractC2254e, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return new p078i6.G(this);
    }

    @Override // p078i6.AbstractC2250a, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
        return toArray(new java.lang.Object[d()]);
    }

    @Override // p078i6.AbstractC2250a, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] array) {
        java.lang.Object[] objArr;
        kotlin.jvm.internal.m.e(array, "array");
        int length = array.length;
        int i3 = this.f23183k;
        if (length < i3) {
            array = java.util.Arrays.copyOf(array, i3);
            kotlin.jvm.internal.m.d(array, "copyOf(...)");
        }
        int i9 = this.f23183k;
        int i10 = this.j;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            objArr = this.f23181h;
            if (i12 >= i9 || i10 >= this.f23182i) {
                break;
            }
            array[i12] = objArr[i10];
            i12++;
            i10++;
        }
        while (i12 < i9) {
            array[i12] = objArr[i11];
            i12++;
            i11++;
        }
        if (i9 < array.length) {
            array[i9] = null;
        }
        return array;
    }
}
