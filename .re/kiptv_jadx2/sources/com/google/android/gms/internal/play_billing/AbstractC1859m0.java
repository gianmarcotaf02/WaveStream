package com.google.android.gms.internal.play_billing;

import androidx.datastore.preferences.protobuf.C1497d;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

public abstract class AbstractC1859m0 implements Iterable, Serializable {

    public static final C1862n0 f19359i = new C1862n0(B0.f19194b);

    public int f19360h = 0;

    static {
        int i3 = AbstractC1847i0.f19337a;
    }

    public static int r(int i3, int i9, int i10) {
        int i11 = i9 - i3;
        if ((i3 | i9 | i11 | (i10 - i9)) >= 0) {
            return i11;
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(Y6.f.f(i3, "Beginning index: ", " < 0"));
        }
        if (i9 < i3) {
            throw new IndexOutOfBoundsException(M0.k(i3, i9, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(M0.k(i9, i10, "End index: ", " >= "));
    }

    public static C1862n0 s(byte[] bArr, int i3, int i9) {
        try {
            r(i3, i3 + i9, bArr.length);
            byte[] bArr2 = new byte[i9];
            System.arraycopy(bArr, i3, bArr2, 0, i9);
            return new C1862n0(bArr2);
        } catch (D0 e6) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e6);
        }
    }

    public static boolean t(byte[] bArr, int i3, int i9, byte[] bArr2, int i10) {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1859m0)) {
            return false;
        }
        AbstractC1859m0 abstractC1859m0 = (AbstractC1859m0) obj;
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

    @Override
    public final Iterator iterator() {
        return new C1497d(this);
    }

    public abstract int n();

    public abstract AbstractC1859m0 o(int i3, int i9);

    public abstract void p(C1866p0 c1866p0);

    public abstract boolean q(AbstractC1859m0 abstractC1859m0);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iN = n();
        String strN = n() <= 50 ? com.google.crypto.tink.shaded.protobuf.q0.N(this) : com.google.crypto.tink.shaded.protobuf.q0.N(o(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iN);
        sb.append(" contents=\"");
        return Y6.f.m(sb, strN, "\">");
    }
}
