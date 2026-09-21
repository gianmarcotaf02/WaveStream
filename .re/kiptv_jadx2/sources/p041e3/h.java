package p041e3;

import Z2.C0;
import java.util.HashMap;

public final class h {

    public final String f21389a;

    public final Integer f21390b;

    public final k f21391c;

    public final long f21392d;

    public final long f21393e;

    public final HashMap f21394f;

    public h(String str, Integer num, k kVar, long j, long j9, HashMap map) {
        this.f21389a = str;
        this.f21390b = num;
        this.f21391c = kVar;
        this.f21392d = j;
        this.f21393e = j9;
        this.f21394f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f21394f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f21394f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final C0 c() {
        C0 c9 = new C0();
        String str = this.f21389a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        c9.f12655a = str;
        c9.f12656b = this.f21390b;
        k kVar = this.f21391c;
        if (kVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        c9.f12657c = kVar;
        c9.f12658d = Long.valueOf(this.f21392d);
        c9.f12659e = Long.valueOf(this.f21393e);
        c9.f12660f = new HashMap(this.f21394f);
        return c9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f21389a.equals(hVar.f21389a)) {
            return false;
        }
        Integer num = hVar.f21390b;
        Integer num2 = this.f21390b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        return this.f21391c.equals(hVar.f21391c) && this.f21392d == hVar.f21392d && this.f21393e == hVar.f21393e && this.f21394f.equals(hVar.f21394f);
    }

    public final int hashCode() {
        int iHashCode = (this.f21389a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f21390b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f21391c.hashCode()) * 1000003;
        long j = this.f21392d;
        int i3 = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j9 = this.f21393e;
        return ((i3 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f21394f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f21389a + ", code=" + this.f21390b + ", encodedPayload=" + this.f21391c + ", eventMillis=" + this.f21392d + ", uptimeMillis=" + this.f21393e + ", autoMetadata=" + this.f21394f + "}";
    }
}
