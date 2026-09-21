package p033d3;

import java.util.ArrayList;

public final class l extends s {

    public final long f21213a;

    public final long f21214b;

    public final j f21215c;

    public final Integer f21216d;

    public final String f21217e;

    public final ArrayList f21218f;

    public l(long j, long j9, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f21228h;
        this.f21213a = j;
        this.f21214b = j9;
        this.f21215c = jVar;
        this.f21216d = num;
        this.f21217e = str;
        this.f21218f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        if (this.f21213a != lVar.f21213a) {
            return false;
        }
        if (this.f21214b != lVar.f21214b) {
            return false;
        }
        if (!this.f21215c.equals(lVar.f21215c)) {
            return false;
        }
        Integer num = lVar.f21216d;
        Integer num2 = this.f21216d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = lVar.f21217e;
        String str2 = this.f21217e;
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
        Object obj2 = w.f21228h;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f21213a;
        long j9 = this.f21214b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f21215c.hashCode()) * 1000003;
        Integer num = this.f21216d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f21217e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f21218f.hashCode()) * 1000003) ^ w.f21228h.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f21213a + ", requestUptimeMs=" + this.f21214b + ", clientInfo=" + this.f21215c + ", logSource=" + this.f21216d + ", logSourceName=" + this.f21217e + ", logEvents=" + this.f21218f + ", qosTier=" + w.f21228h + "}";
    }
}
