package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1859m0 implements java.lang.Iterable, java.io.Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.C1862n0 f19359i = new com.google.android.gms.internal.play_billing.C1862n0(com.google.android.gms.internal.play_billing.B0.f19194b);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19360h = 0;

    static {
        int i3 = com.google.android.gms.internal.play_billing.AbstractC1847i0.f19337a;
    }

    public static int r(int i3, int i9, int i10) {
        int i11 = i9 - i3;
        if ((i3 | i9 | i11 | (i10 - i9)) >= 0) {
            return i11;
        }
        if (i3 < 0) {
            throw new java.lang.IndexOutOfBoundsException(Y6.f.f(i3, "Beginning index: ", " < 0"));
        }
        if (i9 < i3) {
            throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, i9, "Beginning index larger than ending index: ", ", "));
        }
        throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i9, i10, "End index: ", " >= "));
    }

    public static com.google.android.gms.internal.play_billing.C1862n0 s(byte[] bArr, int i3, int i9) {
        try {
            r(i3, i3 + i9, bArr.length);
            byte[] bArr2 = new byte[i9];
            java.lang.System.arraycopy(bArr, i3, bArr2, 0, i9);
            return new com.google.android.gms.internal.play_billing.C1862n0(bArr2);
        } catch (com.google.android.gms.internal.play_billing.D0 e6) {
            throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e6);
        }
    }

    public static /* bridge */ /* synthetic */ boolean t(byte[] bArr, int i3, int i9, byte[] bArr2, int i10) {
        int i11 = i3 + i10;
        r(i3, i11, bArr.length);
        r(i9, i10 + i9, bArr2.length);
        while (i3 < i11) {
            if (bArr[i3] != bArr2[i9]) {
                return false;
            }
            i3++;
            i9++;
        }
        return true;
    }

    public abstract byte d(int i3);

    public abstract byte e(int i3);

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.play_billing.AbstractC1859m0)) {
            return false;
        }
        com.google.android.gms.internal.play_billing.AbstractC1859m0 abstractC1859m0 = (com.google.android.gms.internal.play_billing.AbstractC1859m0) obj;
        int iN = n();
        if (iN != abstractC1859m0.n()) {
            return false;
        }
        if (iN == 0) {
            return true;
        }
        int i3 = this.f19360h;
        int i9 = abstractC1859m0.f19360h;
        if (i3 == 0 || i9 == 0 || i3 == i9) {
            return q(abstractC1859m0);
        }
        return false;
    }

    public abstract int f(int i3, int i9);

    public final int hashCode() {
        int iF = this.f19360h;
        if (iF == 0) {
            int iN = n();
            iF = f(iN, iN);
            if (iF == 0) {
                iF = 1;
            }
            this.f19360h = iF;
        }
        return iF;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.C1497d(this);
    }

    public abstract int n();

    public abstract com.google.android.gms.internal.play_billing.AbstractC1859m0 o(int i3, int i9);

    public abstract void p(com.google.android.gms.internal.play_billing.C1866p0 c1866p0);

    public abstract boolean q(com.google.android.gms.internal.play_billing.AbstractC1859m0 abstractC1859m0);

    public final java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        int iN = n();
        java.lang.String strN = n() <= 50 ? com.google.crypto.tink.shaded.protobuf.q0.N(this) : com.google.crypto.tink.shaded.protobuf.q0.N(o(0, 47)).concat("...");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iN);
        sb.append(" contents=\"");
        return Y6.f.m(sb, strN, "\">");
    }
}
