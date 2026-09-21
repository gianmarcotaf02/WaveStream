package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1918m extends com.google.crypto.tink.shaded.protobuf.AbstractC1911f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.util.logging.Logger f19557h = java.util.logging.Logger.getLogger(com.google.crypto.tink.shaded.protobuf.C1918m.class.getName());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f19558i = com.google.crypto.tink.shaded.protobuf.p0.f19571e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.google.crypto.tink.shaded.protobuf.M f19559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f19560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19561f;
    public int g;

    public C1918m(byte[] bArr, int i3) {
        if (((bArr.length - i3) | i3) < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(bArr.length), 0, java.lang.Integer.valueOf(i3)));
        }
        this.f19560e = bArr;
        this.g = 0;
        this.f19561f = i3;
    }

    public static int F(int i3, com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j) {
        return G(abstractC1915j) + M(i3);
    }

    public static int G(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j) {
        int size = abstractC1915j.size();
        return N(size) + size;
    }

    public static int H(int i3) {
        return M(i3) + 4;
    }

    public static int I(int i3) {
        return M(i3) + 8;
    }

    public static int J(int i3, com.google.crypto.tink.shaded.protobuf.AbstractC1906a abstractC1906a, com.google.crypto.tink.shaded.protobuf.d0 d0Var) {
        return abstractC1906a.b(d0Var) + (M(i3) * 2);
    }

    public static int K(int i3) {
        if (i3 >= 0) {
            return N(i3);
        }
        return 10;
    }

    public static int L(java.lang.String str) {
        int length;
        try {
            length = com.google.crypto.tink.shaded.protobuf.s0.b(str);
        } catch (com.google.crypto.tink.shaded.protobuf.r0 unused) {
            length = str.getBytes(com.google.crypto.tink.shaded.protobuf.B.f19466a).length;
        }
        return N(length) + length;
    }

    public static int M(int i3) {
        return N(i3 << 3);
    }

    public static int N(int i3) {
        if ((i3 & (-128)) == 0) {
            return 1;
        }
        if ((i3 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i3) == 0) {
            return 3;
        }
        return (i3 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int O(long j) {
        int i3;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i3 = 6;
        } else {
            i3 = 2;
        }
        if (((-2097152) & j) != 0) {
            i3 += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i3 + 1 : i3;
    }

    public final void P(byte b9) throws androidx.datastore.preferences.protobuf.C1504k {
        try {
            byte[] bArr = this.f19560e;
            int i3 = this.g;
            this.g = i3 + 1;
            bArr[i3] = b9;
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new androidx.datastore.preferences.protobuf.C1504k(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(this.f19561f), 1), e6, 3);
        }
    }

    public final void Q(byte[] bArr, int i3, int i9) {
        try {
            java.lang.System.arraycopy(bArr, i3, this.f19560e, this.g, i9);
            this.g += i9;
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new androidx.datastore.preferences.protobuf.C1504k(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(this.f19561f), java.lang.Integer.valueOf(i9)), e6, 3);
        }
    }

    public final void R(int i3, int i9) {
        W(i3, 5);
        S(i9);
    }

    public final void S(int i3) throws androidx.datastore.preferences.protobuf.C1504k {
        try {
            byte[] bArr = this.f19560e;
            int i9 = this.g;
            int i10 = i9 + 1;
            this.g = i10;
            bArr[i9] = (byte) (i3 & 255);
            int i11 = i9 + 2;
            this.g = i11;
            bArr[i10] = (byte) ((i3 >> 8) & 255);
            int i12 = i9 + 3;
            this.g = i12;
            bArr[i11] = (byte) ((i3 >> 16) & 255);
            this.g = i9 + 4;
            bArr[i12] = (byte) ((i3 >> 24) & 255);
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new androidx.datastore.preferences.protobuf.C1504k(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(this.f19561f), 1), e6, 3);
        }
    }

    public final void T(int i3, long j) {
        W(i3, 1);
        U(j);
    }

    public final void U(long j) throws androidx.datastore.preferences.protobuf.C1504k {
        try {
            byte[] bArr = this.f19560e;
            int i3 = this.g;
            int i9 = i3 + 1;
            this.g = i9;
            bArr[i3] = (byte) (((int) j) & 255);
            int i10 = i3 + 2;
            this.g = i10;
            bArr[i9] = (byte) (((int) (j >> 8)) & 255);
            int i11 = i3 + 3;
            this.g = i11;
            bArr[i10] = (byte) (((int) (j >> 16)) & 255);
            int i12 = i3 + 4;
            this.g = i12;
            bArr[i11] = (byte) (((int) (j >> 24)) & 255);
            int i13 = i3 + 5;
            this.g = i13;
            bArr[i12] = (byte) (((int) (j >> 32)) & 255);
            int i14 = i3 + 6;
            this.g = i14;
            bArr[i13] = (byte) (((int) (j >> 40)) & 255);
            int i15 = i3 + 7;
            this.g = i15;
            bArr[i14] = (byte) (((int) (j >> 48)) & 255);
            this.g = i3 + 8;
            bArr[i15] = (byte) (((int) (j >> 56)) & 255);
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new androidx.datastore.preferences.protobuf.C1504k(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(this.f19561f), 1), e6, 3);
        }
    }

    public final void V(int i3) throws androidx.datastore.preferences.protobuf.C1504k {
        if (i3 >= 0) {
            X(i3);
        } else {
            Z(i3);
        }
    }

    public final void W(int i3, int i9) {
        X((i3 << 3) | i9);
    }

    public final void X(int i3) {
        while (true) {
            int i9 = i3 & (-128);
            byte[] bArr = this.f19560e;
            if (i9 == 0) {
                int i10 = this.g;
                this.g = i10 + 1;
                bArr[i10] = (byte) i3;
                return;
            } else {
                try {
                    int i11 = this.g;
                    this.g = i11 + 1;
                    bArr[i11] = (byte) ((i3 & 127) | 128);
                    i3 >>>= 7;
                } catch (java.lang.IndexOutOfBoundsException e6) {
                    throw new androidx.datastore.preferences.protobuf.C1504k(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(this.f19561f), 1), e6, 3);
                }
            }
            throw new androidx.datastore.preferences.protobuf.C1504k(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(this.f19561f), 1), e6, 3);
        }
    }

    public final void Y(int i3, long j) {
        W(i3, 0);
        Z(j);
    }

    public final void Z(long j) throws androidx.datastore.preferences.protobuf.C1504k {
        byte[] bArr = this.f19560e;
        boolean z6 = f19558i;
        int i3 = this.f19561f;
        if (z6 && i3 - this.g >= 10) {
            while ((j & (-128)) != 0) {
                int i9 = this.g;
                this.g = i9 + 1;
                com.google.crypto.tink.shaded.protobuf.p0.k(bArr, i9, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i10 = this.g;
            this.g = i10 + 1;
            com.google.crypto.tink.shaded.protobuf.p0.k(bArr, i10, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i11 = this.g;
                this.g = i11 + 1;
                bArr[i11] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (java.lang.IndexOutOfBoundsException e6) {
                throw new androidx.datastore.preferences.protobuf.C1504k(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(i3), 1), e6, 3);
            }
        }
        int i12 = this.g;
        this.g = i12 + 1;
        bArr[i12] = (byte) j;
    }
}
