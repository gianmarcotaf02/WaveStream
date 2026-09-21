package p033d3;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p033d3.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f21208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f21210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f21211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f21212f;
    public final p033d3.n g;

    public k(long j, java.lang.Integer num, long j9, byte[] bArr, java.lang.String str, long j10, p033d3.n nVar) {
        this.f21207a = j;
        this.f21208b = num;
        this.f21209c = j9;
        this.f21210d = bArr;
        this.f21211e = str;
        this.f21212f = j10;
        this.g = nVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p033d3.r)) {
            return false;
        }
        p033d3.r rVar = (p033d3.r) obj;
        p033d3.k kVar = (p033d3.k) rVar;
        if (this.f21207a != kVar.f21207a) {
            return false;
        }
        java.lang.Integer num = this.f21208b;
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
        if (!java.util.Arrays.equals(this.f21210d, rVar instanceof p033d3.k ? ((p033d3.k) rVar).f21210d : kVar.f21210d)) {
            return false;
        }
        java.lang.String str = kVar.f21211e;
        java.lang.String str2 = this.f21211e;
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
        p033d3.n nVar = kVar.g;
        p033d3.n nVar2 = this.g;
        if (nVar2 == null) {
            return nVar == null;
        }
        return nVar2.equals(nVar);
    }

    public final int hashCode() {
        long j = this.f21207a;
        int i3 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        java.lang.Integer num = this.f21208b;
        int iHashCode = (i3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j9 = this.f21209c;
        int iHashCode2 = (((iHashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ java.util.Arrays.hashCode(this.f21210d)) * 1000003;
        java.lang.String str = this.f21211e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f21212f;
        int i9 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        p033d3.n nVar = this.g;
        return i9 ^ (nVar != null ? nVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "LogEvent{eventTimeMs=" + this.f21207a + ", eventCode=" + this.f21208b + ", eventUptimeMs=" + this.f21209c + ", sourceExtension=" + java.util.Arrays.toString(this.f21210d) + ", sourceExtensionJsonProto3=" + this.f21211e + ", timezoneOffsetSeconds=" + this.f21212f + ", networkConnectionInfo=" + this.g + "}";
    }
}
