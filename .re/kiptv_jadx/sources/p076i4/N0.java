package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient java.lang.Object[] f22817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int[] f22818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int f22819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient int[] f22820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient long[] f22821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient float f22822f;
    public transient int g;

    public final void a(int i3) {
        if (i3 > this.f22821e.length) {
            f(i3);
        }
        if (i3 >= this.g) {
            g(java.lang.Math.max(2, java.lang.Integer.highestOneBit(i3 - 1) << 1));
        }
    }

    public final int b(java.lang.Object obj) {
        int iC = c(obj);
        if (iC == -1) {
            return 0;
        }
        return this.f22818b[iC];
    }

    public final int c(java.lang.Object obj) {
        int iW = p076i4.AbstractC2230y.w(obj);
        int[] iArr = this.f22820d;
        int i3 = iArr[(iArr.length - 1) & iW];
        while (i3 != -1) {
            long j = this.f22821e[i3];
            if (((int) (j >>> 32)) == iW && com.google.android.gms.internal.play_billing.AbstractC1853k0.m(obj, this.f22817a[i3])) {
                return i3;
            }
            i3 = (int) j;
        }
        return -1;
    }

    public final void d(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(i3 >= 0, "Initial capacity must be non-negative");
        int iMax = java.lang.Math.max(i3, 2);
        int iHighestOneBit = java.lang.Integer.highestOneBit(iMax);
        if (iMax > ((int) (((double) 1.0f) * ((double) iHighestOneBit))) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
            iHighestOneBit = 1073741824;
        }
        int[] iArr = new int[iHighestOneBit];
        java.util.Arrays.fill(iArr, -1);
        this.f22820d = iArr;
        this.f22822f = 1.0f;
        this.f22817a = new java.lang.Object[i3];
        this.f22818b = new int[i3];
        long[] jArr = new long[i3];
        java.util.Arrays.fill(jArr, -1L);
        this.f22821e = jArr;
        this.g = java.lang.Math.max(1, (int) (iHighestOneBit * 1.0f));
    }

    public final void e(int i3, java.lang.Object obj) {
        long j;
        if (i3 <= 0) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "count must be positive but was: "));
        }
        long[] jArr = this.f22821e;
        java.lang.Object[] objArr = this.f22817a;
        int[] iArr = this.f22818b;
        int iW = p076i4.AbstractC2230y.w(obj);
        int[] iArr2 = this.f22820d;
        int length = (iArr2.length - 1) & iW;
        int i9 = this.f22819c;
        int i10 = iArr2[length];
        if (i10 == -1) {
            iArr2[length] = i9;
            j = 4294967295L;
        } else {
            while (true) {
                long j9 = jArr[i10];
                j = 4294967295L;
                if (((int) (j9 >>> 32)) == iW && com.google.android.gms.internal.play_billing.AbstractC1853k0.m(obj, objArr[i10])) {
                    int i11 = iArr[i10];
                    iArr[i10] = i3;
                    return;
                } else {
                    int i12 = (int) j9;
                    if (i12 == -1) {
                        jArr[i10] = ((-4294967296L) & j9) | (((long) i9) & 4294967295L);
                        break;
                    }
                    i10 = i12;
                }
            }
        }
        int i13 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        if (i9 == Integer.MAX_VALUE) {
            throw new java.lang.IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i14 = i9 + 1;
        int length2 = this.f22821e.length;
        if (i14 > length2) {
            int iMax = java.lang.Math.max(1, length2 >>> 1) + length2;
            if (iMax >= 0) {
                i13 = iMax;
            }
            if (i13 != length2) {
                f(i13);
            }
        }
        this.f22821e[i9] = (((long) iW) << 32) | j;
        this.f22817a[i9] = obj;
        this.f22818b[i9] = i3;
        this.f22819c = i14;
        if (i9 >= this.g) {
            g(this.f22820d.length * 2);
        }
    }

    public final void f(int i3) {
        this.f22817a = java.util.Arrays.copyOf(this.f22817a, i3);
        this.f22818b = java.util.Arrays.copyOf(this.f22818b, i3);
        long[] jArr = this.f22821e;
        int length = jArr.length;
        long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, i3);
        if (i3 > length) {
            java.util.Arrays.fill(jArrCopyOf, length, i3, -1L);
        }
        this.f22821e = jArrCopyOf;
    }

    public final void g(int i3) {
        if (this.f22820d.length >= 1073741824) {
            this.g = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
            return;
        }
        int i9 = ((int) (i3 * this.f22822f)) + 1;
        int[] iArr = new int[i3];
        java.util.Arrays.fill(iArr, -1);
        long[] jArr = this.f22821e;
        int i10 = i3 - 1;
        for (int i11 = 0; i11 < this.f22819c; i11++) {
            int i12 = (int) (jArr[i11] >>> 32);
            int i13 = i12 & i10;
            int i14 = iArr[i13];
            iArr[i13] = i11;
            jArr[i11] = (((long) i12) << 32) | (((long) i14) & 4294967295L);
        }
        this.g = i9;
        this.f22820d = iArr;
    }
}
