package C4;

import B4.k;
import java.util.Arrays;

public final class a {

    public final byte[] f889a;

    public a(byte[] bArr, int i3) {
        byte[] bArr2 = new byte[i3];
        this.f889a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i3);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return new a(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f889a, this.f889a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f889a);
    }

    public final String toString() {
        return "Bytes(" + k.f(this.f889a) + ")";
    }
}
