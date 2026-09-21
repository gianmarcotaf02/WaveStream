package p033d3;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p033d3.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p033d3.h f21206a;

    public j(p033d3.h hVar) {
        this.f21206a = hVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p033d3.q)) {
            return false;
        }
        p033d3.q qVar = (p033d3.q) obj;
        java.lang.Object obj2 = p033d3.p.f21222h;
        ((p033d3.j) qVar).getClass();
        return obj2.equals(obj2) && this.f21206a.equals(((p033d3.j) qVar).f21206a);
    }

    public final int hashCode() {
        return ((p033d3.p.f21222h.hashCode() ^ 1000003) * 1000003) ^ this.f21206a.hashCode();
    }

    public final java.lang.String toString() {
        return "ClientInfo{clientType=" + p033d3.p.f21222h + ", androidClientInfo=" + this.f21206a + "}";
    }
}
