package com.google.android.gms.internal.cast;

import androidx.datastore.preferences.protobuf.C1497d;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

public class C1821z2 implements Iterable, Serializable {
    public static final C1821z2 j = new C1821z2(J2.f18780b);

    public int f19180h = 0;

    public final byte[] f19181i;

    static {
        int i3 = AbstractC1809w2.f19165a;
    }

    public C1821z2(byte[] bArr) {
        bArr.getClass();
        this.f19181i = bArr;
    }

    public static void n(int i3) {
        if (((i3 - 47) | 47) < 0) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.l(i3, "End index: 47 >= "));
        }
    }

    public byte d(int i3) {
        return this.f19181i[i3];
    }

    public byte e(int i3) {
        return this.f19181i[i3];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C1821z2) && f() == ((C1821z2) obj).f()) {
            if (f() == 0) {
                return true;
            }
            if (!(obj instanceof C1821z2)) {
                return obj.equals(this);
            }
            C1821z2 c1821z2 = (C1821z2) obj;
            int i3 = this.f19180h;
            int i9 = c1821z2.f19180h;
            if (i3 == 0 || i9 == 0 || i3 == i9) {
                int iF = f();
                if (iF > c1821z2.f()) {
                    throw new IllegalArgumentException("Length too large: " + iF + f());
                }
                if (iF > c1821z2.f()) {
                    throw new IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.k(iF, c1821z2.f(), "Ran off end of other: 0, ", ", "));
                }
                int i10 = 0;
                int i11 = 0;
                while (i10 < iF) {
                    if (this.f19181i[i10] == c1821z2.f19181i[i11]) {
                        i10++;
                        i11++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f19181i.length;
    }

    public final int hashCode() {
        int i3 = this.f19180h;
        if (i3 != 0) {
            return i3;
        }
        int iF = f();
        Charset charset = J2.f18779a;
        int i9 = iF;
        for (int i10 = 0; i10 < iF; i10++) {
            i9 = (i9 * 31) + this.f19181i[i10];
        }
        int i11 = i9 != 0 ? i9 : 1;
        this.f19180h = i11;
        return i11;
    }

    @Override
    public final Iterator iterator() {
        return new C1497d(this);
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iF = f();
        if (f() <= 50) {
            strConcat = H.e(this);
        } else {
            n(f());
            strConcat = H.e(new C1813x2(this.f19181i)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iF);
        sb.append(" contents=\"");
        return Y6.f.m(sb, strConcat, "\">");
    }
}
