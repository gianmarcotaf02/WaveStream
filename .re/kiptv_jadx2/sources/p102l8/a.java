package p102l8;

import Y6.f;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class a implements Comparable {
    public static final a j = new a(new byte[0]);

    public static final char[] f24870k;

    public final byte[] f24871h;

    public int f24872i;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        m.d(charArray, "toCharArray(...)");
        f24870k = charArray;
    }

    public a(byte[] bArr) {
        this.f24871h = bArr;
    }

    public final byte a(int i3) {
        byte[] bArr = this.f24871h;
        if (i3 < 0 || i3 >= bArr.length) {
            throw new IndexOutOfBoundsException(f.j(p.t(i3, "index (", ") is out of byte string bounds: [0.."), bArr.length, ')'));
        }
        return bArr[i3];
    }

    @Override
    public final int compareTo(Object obj) {
        a other = (a) obj;
        m.e(other, "other");
        if (other == this) {
            return 0;
        }
        byte[] bArr = this.f24871h;
        int length = bArr.length;
        byte[] bArr2 = other.f24871h;
        int iMin = Math.min(length, bArr2.length);
        for (int i3 = 0; i3 < iMin; i3++) {
            int iF = m.f(bArr[i3] & 255, bArr2[i3] & 255);
            if (iF != 0) {
                return iF;
            }
        }
        return m.f(bArr.length, bArr2.length);
    }

    public final boolean equals(Object obj) {
        int i3;
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        byte[] bArr = aVar.f24871h;
        int length = bArr.length;
        byte[] bArr2 = this.f24871h;
        if (length != bArr2.length) {
            return false;
        }
        int i9 = aVar.f24872i;
        if (i9 == 0 || (i3 = this.f24872i) == 0 || i9 == i3) {
            return Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f24872i;
        if (i3 != 0) {
            return i3;
        }
        int iHashCode = Arrays.hashCode(this.f24871h);
        this.f24872i = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        byte[] bArr = this.f24871h;
        if (bArr.length == 0) {
            return "ByteString(size=0)";
        }
        String strValueOf = String.valueOf(bArr.length);
        StringBuilder sb = new StringBuilder((bArr.length * 2) + strValueOf.length() + 22);
        sb.append("ByteString(size=");
        sb.append(strValueOf);
        sb.append(" hex=");
        for (byte b9 : bArr) {
            char[] cArr = f24870k;
            sb.append(cArr[(b9 >>> 4) & 15]);
            sb.append(cArr[b9 & 15]);
        }
        sb.append(')');
        String string = sb.toString();
        m.d(string, "toString(...)");
        return string;
    }

    public a(byte[] bArr, int i3) {
        this(bArr, 0, bArr.length);
    }

    public a(byte[] data, int i3, int i9) {
        this(p078i6.m.f0(data, i3, i9));
        m.e(data, "data");
    }
}
