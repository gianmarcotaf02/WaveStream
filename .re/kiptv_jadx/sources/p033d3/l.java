package p033d3;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p033d3.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p033d3.j f21215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f21216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f21217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f21218f;

    public l(long j, long j9, p033d3.j jVar, java.lang.Integer num, java.lang.String str, java.util.ArrayList arrayList) {
        p033d3.w wVar = p033d3.w.f21228h;
        this.f21213a = j;
        this.f21214b = j9;
        this.f21215c = jVar;
        this.f21216d = num;
        this.f21217e = str;
        this.f21218f = arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p033d3.s)) {
            return false;
        }
        p033d3.l lVar = (p033d3.l) ((p033d3.s) obj);
        if (this.f21213a != lVar.f21213a) {
            return false;
        }
        if (this.f21214b != lVar.f21214b) {
            return false;
        }
        if (!this.f21215c.equals(lVar.f21215c)) {
            return false;
        }
        java.lang.Integer num = lVar.f21216d;
        java.lang.Integer num2 = this.f21216d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        java.lang.String str = lVar.f21217e;
        java.lang.String str2 = this.f21217e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f21218f.equals(lVar.f21218f)) {
            return false;
        }
        java.lang.Object obj2 = p033d3.w.f21228h;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f21213a;
        long j9 = this.f21214b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f21215c.hashCode()) * 1000003;
        java.lang.Integer num = this.f21216d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        java.lang.String str = this.f21217e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f21218f.hashCode()) * 1000003) ^ p033d3.w.f21228h.hashCode();
    }

    public final java.lang.String toString() {
        return "LogRequest{requestTimeMs=" + this.f21213a + ", requestUptimeMs=" + this.f21214b + ", clientInfo=" + this.f21215c + ", logSource=" + this.f21216d + ", logSourceName=" + this.f21217e + ", logEvents=" + this.f21218f + ", qosTier=" + p033d3.w.f21228h + "}";
    }
}
