package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC1853k0;
import com.google.android.gms.internal.play_billing.M0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

public abstract class AbstractC1915j implements Iterable, Serializable {

    public static final C1914i f19541i = new C1914i(B.f19467b);
    public static final C1912g j;

    public int f19542h;

    static {
        j = AbstractC1908c.a() ? new C1912g(1) : new C1912g(0);
    }

    public static int e(int i3, int i9, int i10) {
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

    public static C1914i f(byte[] bArr, int i3, int i9) {
        byte[] bArrCopyOfRange;
        e(i3, i3 + i9, bArr.length);
        switch (j.f19530a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i3, i9 + i3);
                break;
            default:
                bArrCopyOfRange = new byte[i9];
                System.arraycopy(bArr, i3, bArrCopyOfRange, 0, i9);
                break;
        }
        return new C1914i(bArrCopyOfRange);
    }

    public abstract byte d(int i3);

    public final int hashCode() {
        int i3 = this.f19542h;
        if (i3 != 0) {
            return i3;
        }
        int size = size();
        C1914i c1914i = (C1914i) this;
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
            return B.f19467b;
        }
        byte[] bArr = new byte[size];
        n(bArr, size);
        return bArr;
    }

    public abstract int size();

    public final String toString() {
        C1914i c1913h;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = AbstractC1853k0.o(this);
        } else {
            StringBuilder sb = new StringBuilder();
            C1914i c1914i = (C1914i) this;
            int iE = e(0, 47, c1914i.size());
            if (iE == 0) {
                c1913h = f19541i;
            } else {
                c1913h = new C1913h(c1914i.f19539k, c1914i.p(), iE);
            }
            sb.append(AbstractC1853k0.o(c1913h));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return Y6.f.m(sb2, string, "\">");
    }
}
