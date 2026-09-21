package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class A2 extends com.google.android.gms.internal.cast.H {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final java.util.logging.Logger f18739o = java.util.logging.Logger.getLogger(com.google.android.gms.internal.cast.A2.class.getName());

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final boolean f18740p = com.google.android.gms.internal.cast.e3.f18901e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.google.android.gms.internal.cast.N2 f18741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f18742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18743m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18744n;

    public A2(byte[] bArr, int i3) {
        super(12);
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(length), 0, java.lang.Integer.valueOf(i3)));
        }
        this.f18742l = bArr;
        this.f18744n = 0;
        this.f18743m = i3;
    }

    public static int J(java.lang.String str) {
        int length;
        try {
            length = com.google.android.gms.internal.cast.g3.b(str);
        } catch (com.google.android.gms.internal.cast.f3 unused) {
            length = str.getBytes(com.google.android.gms.internal.cast.J2.f18779a).length;
        }
        return K(length) + length;
    }

    public static int K(int i3) {
        return (352 - (java.lang.Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public static int t(long j) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void A(long j) throws androidx.datastore.preferences.protobuf.C1504k {
        try {
            byte[] bArr = this.f18742l;
            int i3 = this.f18744n;
            int i9 = i3 + 1;
            this.f18744n = i9;
            bArr[i3] = (byte) (((int) j) & 255);
            int i10 = i3 + 2;
            this.f18744n = i10;
            bArr[i9] = (byte) (((int) (j >> 8)) & 255);
            int i11 = i3 + 3;
            this.f18744n = i11;
            bArr[i10] = (byte) (((int) (j >> 16)) & 255);
            int i12 = i3 + 4;
            this.f18744n = i12;
            bArr[i11] = (byte) (((int) (j >> 24)) & 255);
            int i13 = i3 + 5;
            this.f18744n = i13;
            bArr[i12] = (byte) (((int) (j >> 32)) & 255);
            int i14 = i3 + 6;
            this.f18744n = i14;
            bArr[i13] = (byte) (((int) (j >> 40)) & 255);
            int i15 = i3 + 7;
            this.f18744n = i15;
            bArr[i14] = (byte) (((int) (j >> 48)) & 255);
            this.f18744n = i3 + 8;
            bArr[i15] = (byte) (((int) (j >> 56)) & 255);
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new androidx.datastore.preferences.protobuf.C1504k(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f18744n), java.lang.Integer.valueOf(this.f18743m), 1), e6, 1);
        }
    }

    public final void B(int i3, int i9) throws androidx.datastore.preferences.protobuf.C1504k {
        G(i3 << 3);
        C(i9);
    }

    public final void C(int i3) throws androidx.datastore.preferences.protobuf.C1504k {
        if (i3 >= 0) {
            G(i3);
        } else {
            I(i3);
        }
    }

    public final void D(int i3, java.lang.String str) throws androidx.datastore.preferences.protobuf.C1504k {
        G((i3 << 3) | 2);
        int i9 = this.f18744n;
        try {
            int iK = K(str.length() * 3);
            int iK2 = K(str.length());
            byte[] bArr = this.f18742l;
            int i10 = this.f18743m;
            if (iK2 != iK) {
                G(com.google.android.gms.internal.cast.g3.b(str));
                int i11 = this.f18744n;
                this.f18744n = com.google.android.gms.internal.cast.g3.a(str, bArr, i11, i10 - i11);
            } else {
                int i12 = i9 + iK2;
                this.f18744n = i12;
                int iA = com.google.android.gms.internal.cast.g3.a(str, bArr, i12, i10 - i12);
                this.f18744n = i9;
                G((iA - i9) - iK2);
                this.f18744n = iA;
            }
        } catch (com.google.android.gms.internal.cast.f3 e6) {
            this.f18744n = i9;
            f18739o.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) e6);
            byte[] bytes = str.getBytes(com.google.android.gms.internal.cast.J2.f18779a);
            try {
                int length = bytes.length;
                G(length);
                v(bytes, length);
            } catch (java.lang.IndexOutOfBoundsException e9) {
                throw new androidx.datastore.preferences.protobuf.C1504k(e9);
            }
        } catch (java.lang.IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.C1504k(e10);
        }
    }

    public final void E(int i3, int i9) throws androidx.datastore.preferences.protobuf.C1504k {
        G((i3 << 3) | i9);
    }

    public final void F(int i3, int i9) throws androidx.datastore.preferences.protobuf.C1504k {
        G(i3 << 3);
        G(i9);
    }

    public final void G(int i3) throws androidx.datastore.preferences.protobuf.C1504k {
        while (true) {
            int i9 = i3 & (-128);
            byte[] bArr = this.f18742l;
            if (i9 == 0) {
                int i10 = this.f18744n;
                this.f18744n = i10 + 1;
                bArr[i10] = (byte) i3;
                return;
            } else {
                try {
                    int i11 = this.f18744n;
                    this.f18744n = i11 + 1;
                    bArr[i11] = (byte) ((i3 | 128) & 255);
                    i3 >>>= 7;
                } catch (java.lang.IndexOutOfBoundsException e6) {
                    throw new androidx.datastore.preferences.protobuf.C1504k(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f18744n), java.lang.Integer.valueOf(this.f18743m), 1), e6, 1);
                }
            }
            throw new androidx.datastore.preferences.protobuf.C1504k(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f18744n), java.lang.Integer.valueOf(this.f18743m), 1), e6, 1);
        }
    }

    public final void H(int i3, long j) throws androidx.datastore.preferences.protobuf.C1504k {
        G(i3 << 3);
        I(j);
    }

    public final void I(long j) throws androidx.datastore.preferences.protobuf.C1504k {
        byte[] bArr = this.f18742l;
        boolean z6 = f18740p;
        int i3 = this.f18743m;
        if (!z6 || i3 - this.f18744n < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i9 = this.f18744n;
                    this.f18744n = i9 + 1;
                    bArr[i9] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                } catch (java.lang.IndexOutOfBoundsException e6) {
                    throw new androidx.datastore.preferences.protobuf.C1504k(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f18744n), java.lang.Integer.valueOf(i3), 1), e6, 1);
                }
            }
            int i10 = this.f18744n;
            this.f18744n = i10 + 1;
            bArr[i10] = (byte) j;
            return;
        }
        while (true) {
            int i11 = (int) j;
            if ((j & (-128)) == 0) {
                int i12 = this.f18744n;
                this.f18744n = i12 + 1;
                com.google.android.gms.internal.cast.e3.f18899c.d(bArr, com.google.android.gms.internal.cast.e3.f18902f + ((long) i12), (byte) i11);
                return;
            }
            int i13 = this.f18744n;
            this.f18744n = i13 + 1;
            com.google.android.gms.internal.cast.e3.f18899c.d(bArr, com.google.android.gms.internal.cast.e3.f18902f + i13, (byte) ((i11 | 128) & 255));
            j >>>= 7;
        }
    }

    public final void u(byte b9) throws androidx.datastore.preferences.protobuf.C1504k {
        try {
            byte[] bArr = this.f18742l;
            int i3 = this.f18744n;
            this.f18744n = i3 + 1;
            bArr[i3] = b9;
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new androidx.datastore.preferences.protobuf.C1504k(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f18744n), java.lang.Integer.valueOf(this.f18743m), 1), e6, 1);
        }
    }

    public final void v(byte[] bArr, int i3) throws androidx.datastore.preferences.protobuf.C1504k {
        try {
            java.lang.System.arraycopy(bArr, 0, this.f18742l, this.f18744n, i3);
            this.f18744n += i3;
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new androidx.datastore.preferences.protobuf.C1504k(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f18744n), java.lang.Integer.valueOf(this.f18743m), java.lang.Integer.valueOf(i3)), e6, 1);
        }
    }

    public final void w(int i3, com.google.android.gms.internal.cast.C1821z2 c1821z2) throws androidx.datastore.preferences.protobuf.C1504k {
        G((i3 << 3) | 2);
        G(c1821z2.f());
        v(c1821z2.f19181i, c1821z2.f());
    }

    public final void x(int i3, int i9) throws androidx.datastore.preferences.protobuf.C1504k {
        G((i3 << 3) | 5);
        y(i9);
    }

    public final void y(int i3) throws androidx.datastore.preferences.protobuf.C1504k {
        try {
            byte[] bArr = this.f18742l;
            int i9 = this.f18744n;
            int i10 = i9 + 1;
            this.f18744n = i10;
            bArr[i9] = (byte) (i3 & 255);
            int i11 = i9 + 2;
            this.f18744n = i11;
            bArr[i10] = (byte) ((i3 >> 8) & 255);
            int i12 = i9 + 3;
            this.f18744n = i12;
            bArr[i11] = (byte) ((i3 >> 16) & 255);
            this.f18744n = i9 + 4;
            bArr[i12] = (byte) ((i3 >> 24) & 255);
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new androidx.datastore.preferences.protobuf.C1504k(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f18744n), java.lang.Integer.valueOf(this.f18743m), 1), e6, 1);
        }
    }

    public final void z(int i3, long j) throws androidx.datastore.preferences.protobuf.C1504k {
        G((i3 << 3) | 1);
        A(j);
    }
}
