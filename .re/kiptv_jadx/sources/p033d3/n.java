package p033d3;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p033d3.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p033d3.u f21220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p033d3.t f21221b;

    public n(p033d3.u uVar, p033d3.t tVar) {
        this.f21220a = uVar;
        this.f21221b = tVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p033d3.v) {
            p033d3.v vVar = (p033d3.v) obj;
            p033d3.u uVar = this.f21220a;
            if (uVar != null ? uVar.equals(((p033d3.n) vVar).f21220a) : ((p033d3.n) vVar).f21220a == null) {
                p033d3.t tVar = this.f21221b;
                if (tVar != null ? tVar.equals(((p033d3.n) vVar).f21221b) : ((p033d3.n) vVar).f21221b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        p033d3.u uVar = this.f21220a;
        int iHashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        p033d3.t tVar = this.f21221b;
        return (tVar != null ? tVar.hashCode() : 0) ^ iHashCode;
    }

    public final java.lang.String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f21220a + ", mobileSubtype=" + this.f21221b + "}";
    }
}
