package p041e3;

import java.util.Arrays;
import p013b3.b;

public final class k {

    public final b f21403a;

    public final byte[] f21404b;

    public k(b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f21403a = bVar;
        this.f21404b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f21403a.equals(kVar.f21403a)) {
            return Arrays.equals(this.f21404b, kVar.f21404b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f21403a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21404b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f21403a + ", bytes=[...]}";
    }
}
