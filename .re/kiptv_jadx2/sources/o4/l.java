package o4;

import java.util.Arrays;

public final class l implements Comparable {

    public final byte[] f26130h;

    public l(byte[] bArr) {
        this.f26130h = Arrays.copyOf(bArr, bArr.length);
    }

    @Override
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        byte[] bArr = this.f26130h;
        int length = bArr.length;
        byte[] bArr2 = lVar.f26130h;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i3 = 0; i3 < bArr.length; i3++) {
            byte b9 = bArr[i3];
            byte b10 = lVar.f26130h[i3];
            if (b9 != b10) {
                return b9 - b10;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return Arrays.equals(this.f26130h, ((l) obj).f26130h);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f26130h);
    }

    public final String toString() {
        return B4.k.f(this.f26130h);
    }
}
