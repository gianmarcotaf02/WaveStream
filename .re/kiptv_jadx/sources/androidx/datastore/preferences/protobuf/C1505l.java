package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1505l extends E8.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final java.util.logging.Logger f16227r = java.util.logging.Logger.getLogger(androidx.datastore.preferences.protobuf.C1505l.class.getName());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f16228s = androidx.datastore.preferences.protobuf.k0.f16225e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.F f16229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f16230n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f16231o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.io.OutputStream f16233q;

    public C1505l(java.io.OutputStream outputStream, int i3) {
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = java.lang.Math.max(i3, 20);
        this.f16230n = new byte[iMax];
        this.f16231o = iMax;
        if (outputStream == null) {
            throw new java.lang.NullPointerException("out");
        }
        this.f16233q = outputStream;
    }

    public static int l0(int i3, androidx.datastore.preferences.protobuf.C1500g c1500g) {
        int iN0 = n0(i3);
        int size = c1500g.size();
        return o0(size) + size + iN0;
    }

    public static int m0(java.lang.String str) {
        int length;
        try {
            length = androidx.datastore.preferences.protobuf.n0.a(str);
        } catch (androidx.datastore.preferences.protobuf.m0 unused) {
            length = str.getBytes(androidx.datastore.preferences.protobuf.AbstractC1516x.f16267a).length;
        }
        return o0(length) + length;
    }

    public static int n0(int i3) {
        return o0(i3 << 3);
    }

    public static int o0(int i3) {
        return (352 - (java.lang.Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public static int p0(long j) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void A0(long j) throws java.io.IOException {
        r0(8);
        h0(j);
    }

    public final void B0(int i3, int i9) throws java.io.IOException {
        r0(20);
        i0(i3, 0);
        if (i9 >= 0) {
            j0(i9);
        } else {
            k0(i9);
        }
    }

    public final void C0(int i3) throws java.io.IOException {
        if (i3 >= 0) {
            I0(i3);
        } else {
            K0(i3);
        }
    }

    public final void D0(int i3, androidx.datastore.preferences.protobuf.AbstractC1494a abstractC1494a, androidx.datastore.preferences.protobuf.X x9) throws java.io.IOException {
        G0(i3, 2);
        I0(abstractC1494a.a(x9));
        x9.e(abstractC1494a, this.f16229m);
    }

    public final void E0(int i3, java.lang.String str) throws java.io.IOException {
        G0(i3, 2);
        F0(str);
    }

    public final void F0(java.lang.String str) throws java.io.IOException {
        try {
            int length = str.length() * 3;
            int iO0 = o0(length);
            int i3 = iO0 + length;
            int i9 = this.f16231o;
            if (i3 > i9) {
                byte[] bArr = new byte[length];
                int I9 = androidx.datastore.preferences.protobuf.n0.f16238a.I(str, bArr, 0, length);
                I0(I9);
                t0(bArr, 0, I9);
                return;
            }
            if (i3 > i9 - this.f16232p) {
                q0();
            }
            int iO1 = o0(str.length());
            int i10 = this.f16232p;
            byte[] bArr2 = this.f16230n;
            try {
                if (iO1 == iO0) {
                    int i11 = i10 + iO1;
                    this.f16232p = i11;
                    int I10 = androidx.datastore.preferences.protobuf.n0.f16238a.I(str, bArr2, i11, i9 - i11);
                    this.f16232p = i10;
                    j0((I10 - i10) - iO1);
                    this.f16232p = I10;
                } else {
                    int iA = androidx.datastore.preferences.protobuf.n0.a(str);
                    j0(iA);
                    this.f16232p = androidx.datastore.preferences.protobuf.n0.f16238a.I(str, bArr2, this.f16232p, iA);
                }
            } catch (androidx.datastore.preferences.protobuf.m0 e6) {
                this.f16232p = i10;
                throw e6;
            } catch (java.lang.ArrayIndexOutOfBoundsException e9) {
                throw new androidx.datastore.preferences.protobuf.C1504k(e9);
            }
        } catch (androidx.datastore.preferences.protobuf.m0 e10) {
            f16227r.log(java.util.logging.Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) e10);
            byte[] bytes = str.getBytes(androidx.datastore.preferences.protobuf.AbstractC1516x.f16267a);
            try {
                I0(bytes.length);
                a0(bytes, 0, bytes.length);
            } catch (java.lang.IndexOutOfBoundsException e11) {
                throw new androidx.datastore.preferences.protobuf.C1504k(e11);
            }
        }
    }

    public final void G0(int i3, int i9) {
        I0((i3 << 3) | i9);
    }

    public final void H0(int i3, int i9) throws java.io.IOException {
        r0(20);
        i0(i3, 0);
        j0(i9);
    }

    public final void I0(int i3) throws java.io.IOException {
        r0(5);
        j0(i3);
    }

    public final void J0(int i3, long j) {
        r0(20);
        i0(i3, 0);
        k0(j);
    }

    public final void K0(long j) throws java.io.IOException {
        r0(10);
        k0(j);
    }

    @Override // E8.d
    public final void a0(byte[] bArr, int i3, int i9) throws java.io.IOException {
        t0(bArr, i3, i9);
    }

    public final void g0(int i3) {
        int i9 = this.f16232p;
        int i10 = i9 + 1;
        this.f16232p = i10;
        byte[] bArr = this.f16230n;
        bArr[i9] = (byte) (i3 & 255);
        int i11 = i9 + 2;
        this.f16232p = i11;
        bArr[i10] = (byte) ((i3 >> 8) & 255);
        int i12 = i9 + 3;
        this.f16232p = i12;
        bArr[i11] = (byte) ((i3 >> 16) & 255);
        this.f16232p = i9 + 4;
        bArr[i12] = (byte) ((i3 >> 24) & 255);
    }

    public final void h0(long j) {
        int i3 = this.f16232p;
        int i9 = i3 + 1;
        this.f16232p = i9;
        byte[] bArr = this.f16230n;
        bArr[i3] = (byte) (j & 255);
        int i10 = i3 + 2;
        this.f16232p = i10;
        bArr[i9] = (byte) ((j >> 8) & 255);
        int i11 = i3 + 3;
        this.f16232p = i11;
        bArr[i10] = (byte) ((j >> 16) & 255);
        int i12 = i3 + 4;
        this.f16232p = i12;
        bArr[i11] = (byte) (255 & (j >> 24));
        int i13 = i3 + 5;
        this.f16232p = i13;
        bArr[i12] = (byte) (((int) (j >> 32)) & 255);
        int i14 = i3 + 6;
        this.f16232p = i14;
        bArr[i13] = (byte) (((int) (j >> 40)) & 255);
        int i15 = i3 + 7;
        this.f16232p = i15;
        bArr[i14] = (byte) (((int) (j >> 48)) & 255);
        this.f16232p = i3 + 8;
        bArr[i15] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void i0(int i3, int i9) {
        j0((i3 << 3) | i9);
    }

    public final void j0(int i3) {
        boolean z6 = f16228s;
        byte[] bArr = this.f16230n;
        if (z6) {
            while ((i3 & (-128)) != 0) {
                int i9 = this.f16232p;
                this.f16232p = i9 + 1;
                androidx.datastore.preferences.protobuf.k0.j(bArr, i9, (byte) ((i3 | 128) & 255));
                i3 >>>= 7;
            }
            int i10 = this.f16232p;
            this.f16232p = i10 + 1;
            androidx.datastore.preferences.protobuf.k0.j(bArr, i10, (byte) i3);
            return;
        }
        while ((i3 & (-128)) != 0) {
            int i11 = this.f16232p;
            this.f16232p = i11 + 1;
            bArr[i11] = (byte) ((i3 | 128) & 255);
            i3 >>>= 7;
        }
        int i12 = this.f16232p;
        this.f16232p = i12 + 1;
        bArr[i12] = (byte) i3;
    }

    public final void k0(long j) {
        boolean z6 = f16228s;
        byte[] bArr = this.f16230n;
        if (z6) {
            while ((j & (-128)) != 0) {
                int i3 = this.f16232p;
                this.f16232p = i3 + 1;
                androidx.datastore.preferences.protobuf.k0.j(bArr, i3, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i9 = this.f16232p;
            this.f16232p = i9 + 1;
            androidx.datastore.preferences.protobuf.k0.j(bArr, i9, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i10 = this.f16232p;
            this.f16232p = i10 + 1;
            bArr[i10] = (byte) ((((int) j) | 128) & 255);
            j >>>= 7;
        }
        int i11 = this.f16232p;
        this.f16232p = i11 + 1;
        bArr[i11] = (byte) j;
    }

    public final void q0() throws java.io.IOException {
        this.f16233q.write(this.f16230n, 0, this.f16232p);
        this.f16232p = 0;
    }

    public final void r0(int i3) throws java.io.IOException {
        if (this.f16231o - this.f16232p < i3) {
            q0();
        }
    }

    public final void s0(byte b9) throws java.io.IOException {
        if (this.f16232p == this.f16231o) {
            q0();
        }
        int i3 = this.f16232p;
        this.f16232p = i3 + 1;
        this.f16230n[i3] = b9;
    }

    public final void t0(byte[] bArr, int i3, int i9) throws java.io.IOException {
        int i10 = this.f16232p;
        int i11 = this.f16231o;
        int i12 = i11 - i10;
        byte[] bArr2 = this.f16230n;
        if (i12 >= i9) {
            java.lang.System.arraycopy(bArr, i3, bArr2, i10, i9);
            this.f16232p += i9;
            return;
        }
        java.lang.System.arraycopy(bArr, i3, bArr2, i10, i12);
        int i13 = i3 + i12;
        int i14 = i9 - i12;
        this.f16232p = i11;
        q0();
        if (i14 > i11) {
            this.f16233q.write(bArr, i13, i14);
        } else {
            java.lang.System.arraycopy(bArr, i13, bArr2, 0, i14);
            this.f16232p = i14;
        }
    }

    public final void u0(int i3, boolean z6) throws java.io.IOException {
        r0(11);
        i0(i3, 0);
        byte b9 = z6 ? (byte) 1 : (byte) 0;
        int i9 = this.f16232p;
        this.f16232p = i9 + 1;
        this.f16230n[i9] = b9;
    }

    public final void v0(int i3, androidx.datastore.preferences.protobuf.C1500g c1500g) {
        G0(i3, 2);
        w0(c1500g);
    }

    public final void w0(androidx.datastore.preferences.protobuf.C1500g c1500g) throws java.io.IOException {
        I0(c1500g.size());
        a0(c1500g.f16204i, c1500g.o(), c1500g.size());
    }

    public final void x0(int i3, int i9) {
        r0(14);
        i0(i3, 5);
        g0(i9);
    }

    public final void y0(int i3) throws java.io.IOException {
        r0(4);
        g0(i3);
    }

    public final void z0(int i3, long j) {
        r0(18);
        i0(i3, 1);
        h0(j);
    }
}
