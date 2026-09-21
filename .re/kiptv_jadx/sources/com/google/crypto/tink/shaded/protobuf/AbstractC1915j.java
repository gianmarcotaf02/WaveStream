package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1915j implements java.lang.Iterable, java.io.Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.google.crypto.tink.shaded.protobuf.C1914i f19541i = new com.google.crypto.tink.shaded.protobuf.C1914i(com.google.crypto.tink.shaded.protobuf.B.f19467b);
    public static final com.google.crypto.tink.shaded.protobuf.C1912g j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19542h;

    static {
        j = com.google.crypto.tink.shaded.protobuf.AbstractC1908c.a() ? new com.google.crypto.tink.shaded.protobuf.C1912g(1) : new com.google.crypto.tink.shaded.protobuf.C1912g(0);
    }

    public static int e(int i3, int i9, int i10) {
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

    public static com.google.crypto.tink.shaded.protobuf.C1914i f(byte[] bArr, int i3, int i9) {
        byte[] bArrCopyOfRange;
        e(i3, i3 + i9, bArr.length);
        switch (j.f19530a) {
            case 0:
                bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, i3, i9 + i3);
                break;
            default:
                bArrCopyOfRange = new byte[i9];
                java.lang.System.arraycopy(bArr, i3, bArrCopyOfRange, 0, i9);
                break;
        }
        return new com.google.crypto.tink.shaded.protobuf.C1914i(bArrCopyOfRange);
    }

    public abstract byte d(int i3);

    public final int hashCode() {
        int i3 = this.f19542h;
        if (i3 != 0) {
            return i3;
        }
        int size = size();
        com.google.crypto.tink.shaded.protobuf.C1914i c1914i = (com.google.crypto.tink.shaded.protobuf.C1914i) this;
        int iP = c1914i.p();
        int i9 = size;
        for (int i10 = iP; i10 < iP + size; i10++) {
            i9 = (i9 * 31) + c1914i.f19539k[i10];
        }
        if (i9 == 0) {
            i9 = 1;
        }
        this.f19542h = i9;
        return i9;
    }

    public abstract void n(byte[] bArr, int i3);

    public final byte[] o() {
        int size = size();
        if (size == 0) {
            return com.google.crypto.tink.shaded.protobuf.B.f19467b;
        }
        byte[] bArr = new byte[size];
        n(bArr, size);
        return bArr;
    }

    public abstract int size();

    public final java.lang.String toString() {
        com.google.crypto.tink.shaded.protobuf.C1914i c1913h;
        java.lang.String string;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = com.google.android.gms.internal.play_billing.AbstractC1853k0.o(this);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            com.google.crypto.tink.shaded.protobuf.C1914i c1914i = (com.google.crypto.tink.shaded.protobuf.C1914i) this;
            int iE = e(0, 47, c1914i.size());
            if (iE == 0) {
                c1913h = f19541i;
            } else {
                c1913h = new com.google.crypto.tink.shaded.protobuf.C1913h(c1914i.f19539k, c1914i.p(), iE);
            }
            sb.append(com.google.android.gms.internal.play_billing.AbstractC1853k0.o(c1913h));
            sb.append("...");
            string = sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return Y6.f.m(sb2, string, "\">");
    }
}
