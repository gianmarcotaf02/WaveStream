package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1866p0 extends com.google.android.gms.internal.play_billing.AbstractC1853k0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final boolean f19371p = com.google.android.gms.internal.play_billing.AbstractC1830c1.f19312e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.google.android.gms.internal.play_billing.G0 f19372l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f19373m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f19374n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f19375o;

    public C1866p0(byte[] bArr, int i3) {
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            java.util.Locale locale = java.util.Locale.US;
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.k(length, i3, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f19373m = bArr;
        this.f19375o = 0;
        this.f19374n = i3;
    }

    public static int U(int i3) {
        return (352 - (java.lang.Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public static int V(long j) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void H(byte b9) throws androidx.datastore.preferences.protobuf.C1504k {
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i3 = this.f19375o;
        try {
            int i9 = i3 + 1;
            try {
                this.f19373m[i3] = b9;
                this.f19375o = i9;
            } catch (java.lang.IndexOutOfBoundsException e6) {
                indexOutOfBoundsException = e6;
                i3 = i9;
                throw new androidx.datastore.preferences.protobuf.C1504k(i3, this.f19374n, 1, indexOutOfBoundsException);
            }
        } catch (java.lang.IndexOutOfBoundsException e9) {
            indexOutOfBoundsException = e9;
        }
    }

    public final void I(byte[] bArr, int i3, int i9) {
        try {
            java.lang.System.arraycopy(bArr, i3, this.f19373m, this.f19375o, i9);
            this.f19375o += i9;
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new androidx.datastore.preferences.protobuf.C1504k(this.f19375o, this.f19374n, i9, e6);
        }
    }

    public final void J(int i3, int i9) throws androidx.datastore.preferences.protobuf.C1504k {
        R((i3 << 3) | 5);
        K(i9);
    }

    public final void K(int i3) throws androidx.datastore.preferences.protobuf.C1504k {
        int i9 = this.f19375o;
        try {
            byte[] bArr = this.f19373m;
            bArr[i9] = (byte) i3;
            bArr[i9 + 1] = (byte) (i3 >> 8);
            bArr[i9 + 2] = (byte) (i3 >> 16);
            bArr[i9 + 3] = (byte) (i3 >> 24);
            this.f19375o = i9 + 4;
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new androidx.datastore.preferences.protobuf.C1504k(i9, this.f19374n, 4, e6);
        }
    }

    public final void L(int i3, long j) throws androidx.datastore.preferences.protobuf.C1504k {
        R((i3 << 3) | 1);
        M(j);
    }

    public final void M(long j) throws androidx.datastore.preferences.protobuf.C1504k {
        int i3 = this.f19375o;
        try {
            byte[] bArr = this.f19373m;
            bArr[i3] = (byte) j;
            bArr[i3 + 1] = (byte) (j >> 8);
            bArr[i3 + 2] = (byte) (j >> 16);
            bArr[i3 + 3] = (byte) (j >> 24);
            bArr[i3 + 4] = (byte) (j >> 32);
            bArr[i3 + 5] = (byte) (j >> 40);
            bArr[i3 + 6] = (byte) (j >> 48);
            bArr[i3 + 7] = (byte) (j >> 56);
            this.f19375o = i3 + 8;
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new androidx.datastore.preferences.protobuf.C1504k(i3, this.f19374n, 8, e6);
        }
    }

    public final void N(int i3, int i9) throws androidx.datastore.preferences.protobuf.C1504k {
        R(i3 << 3);
        O(i9);
    }

    public final void O(int i3) throws androidx.datastore.preferences.protobuf.C1504k {
        if (i3 >= 0) {
            R(i3);
        } else {
            T(i3);
        }
    }

    public final void P(int i3, int i9) throws androidx.datastore.preferences.protobuf.C1504k {
        R((i3 << 3) | i9);
    }

    public final void Q(int i3, int i9) throws androidx.datastore.preferences.protobuf.C1504k {
        R(i3 << 3);
        R(i9);
    }

    public final void R(int i3) throws androidx.datastore.preferences.protobuf.C1504k {
        int i9;
        int i10 = this.f19375o;
        while (true) {
            int i11 = i3 & (-128);
            byte[] bArr = this.f19373m;
            if (i11 == 0) {
                i9 = i10 + 1;
                bArr[i10] = (byte) i3;
                this.f19375o = i9;
                return;
            } else {
                i9 = i10 + 1;
                try {
                    bArr[i10] = (byte) (i3 | 128);
                    i3 >>>= 7;
                    i10 = i9;
                } catch (java.lang.IndexOutOfBoundsException e6) {
                    throw new androidx.datastore.preferences.protobuf.C1504k(i9, this.f19374n, 1, e6);
                }
            }
            throw new androidx.datastore.preferences.protobuf.C1504k(i9, this.f19374n, 1, e6);
        }
    }

    public final void S(int i3, long j) throws androidx.datastore.preferences.protobuf.C1504k {
        R(i3 << 3);
        T(j);
    }

    public final void T(long j) throws androidx.datastore.preferences.protobuf.C1504k {
        int i3;
        int i9 = this.f19375o;
        byte[] bArr = this.f19373m;
        boolean z6 = f19371p;
        int i10 = this.f19374n;
        if (!z6 || i10 - i9 < 10) {
            long j9 = j;
            while ((j9 & (-128)) != 0) {
                i3 = i9 + 1;
                try {
                    bArr[i9] = (byte) (((int) j9) | 128);
                    j9 >>>= 7;
                    i9 = i3;
                } catch (java.lang.IndexOutOfBoundsException e6) {
                    throw new androidx.datastore.preferences.protobuf.C1504k(i3, i10, 1, e6);
                }
            }
            i3 = i9 + 1;
            bArr[i9] = (byte) j9;
        } else {
            long j10 = j;
            while ((j10 & (-128)) != 0) {
                com.google.android.gms.internal.play_billing.AbstractC1830c1.f19310c.d(bArr, com.google.android.gms.internal.play_billing.AbstractC1830c1.f19313f + ((long) i9), (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i9++;
            }
            i3 = i9 + 1;
            com.google.android.gms.internal.play_billing.AbstractC1830c1.f19310c.d(bArr, com.google.android.gms.internal.play_billing.AbstractC1830c1.f19313f + ((long) i9), (byte) j10);
        }
        this.f19375o = i3;
    }
}
