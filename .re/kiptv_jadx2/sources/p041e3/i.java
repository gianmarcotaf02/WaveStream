package p041e3;

import android.support.v4.media.session.q;
import android.util.Base64;
import java.util.Arrays;
import p013b3.c;

public final class i {

    public final String f21395a;

    public final byte[] f21396b;

    public final c f21397c;

    public i(String str, byte[] bArr, c cVar) {
        this.f21395a = str;
        this.f21396b = bArr;
        this.f21397c = cVar;
    }

    public static q a() {
        q qVar = new q(23, false);
        qVar.f15618k = c.f17869h;
        return qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f21395a.equals(iVar.f21395a) && Arrays.equals(this.f21396b, iVar.f21396b) && this.f21397c.equals(iVar.f21397c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f21395a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21396b)) * 1000003) ^ this.f21397c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f21396b;
        return "TransportContext(" + this.f21395a + ", " + this.f21397c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
