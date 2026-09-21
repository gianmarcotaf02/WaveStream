package p033d3;

import java.util.Arrays;

public final class k extends r {

    public final long f21207a;

    public final Integer f21208b;

    public final long f21209c;

    public final byte[] f21210d;

    public final String f21211e;

    public final long f21212f;
    public final n g;

    public k(long j, Integer num, long j9, byte[] bArr, String str, long j10, n nVar) {
        this.f21207a = j;
        this.f21208b = num;
        this.f21209c = j9;
        this.f21210d = bArr;
        this.f21211e = str;
        this.f21212f = j10;
        this.g = nVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        k kVar = (k) rVar;
        if (this.f21207a != kVar.f21207a) {
            return false;
        }
        Integer num = this.f21208b;
        if (num == null) {
            if (kVar.f21208b != null) {
                return false;
            }
        } else if (!num.equals(kVar.f21208b)) {
            return false;
        }
        if (this.f21209c != kVar.f21209c) {
            return false;
        }
        if (!Arrays.equals(this.f21210d, rVar instanceof k ? ((k) rVar).f21210d : kVar.f21210d)) {
            return false;
        }
        String str = kVar.f21211e;
        String str2 = this.f21211e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f21212f != kVar.f21212f) {
            return false;
        }
        n nVar = kVar.g;
        n nVar2 = this.g;
        if (nVar2 == null) {
            return nVar == null;
        }
        return nVar2.equals(nVar);
    }

    public final int hashCode() {
        long j = this.f21207a;
        int i3 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f21208b;
        int iHashCode = (i3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j9 = this.f21209c;
        int iHashCode2 = (((iHashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f21210d)) * 1000003;
        String str = this.f21211e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f21212f;
        int i9 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        n nVar = this.g;
        return i9 ^ (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f21207a + ", eventCode=" + this.f21208b + ", eventUptimeMs=" + this.f21209c + ", sourceExtension=" + Arrays.toString(this.f21210d) + ", sourceExtensionJsonProto3=" + this.f21211e + ", timezoneOffsetSeconds=" + this.f21212f + ", networkConnectionInfo=" + this.g + "}";
    }
}
