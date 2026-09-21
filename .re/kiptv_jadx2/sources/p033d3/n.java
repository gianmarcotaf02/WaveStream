package p033d3;

public final class n extends v {

    public final u f21220a;

    public final t f21221b;

    public n(u uVar, t tVar) {
        this.f21220a = uVar;
        this.f21221b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f21220a;
            if (uVar != null ? uVar.equals(((n) vVar).f21220a) : ((n) vVar).f21220a == null) {
                t tVar = this.f21221b;
                if (tVar != null ? tVar.equals(((n) vVar).f21221b) : ((n) vVar).f21221b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f21220a;
        int iHashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f21221b;
        return (tVar != null ? tVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f21220a + ", mobileSubtype=" + this.f21221b + "}";
    }
}
