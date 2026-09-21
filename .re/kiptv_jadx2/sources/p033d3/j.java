package p033d3;

public final class j extends q {

    public final h f21206a;

    public j(h hVar) {
        this.f21206a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f21222h;
        ((j) qVar).getClass();
        return obj2.equals(obj2) && this.f21206a.equals(((j) qVar).f21206a);
    }

    public final int hashCode() {
        return ((p.f21222h.hashCode() ^ 1000003) * 1000003) ^ this.f21206a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f21222h + ", androidClientInfo=" + this.f21206a + "}";
    }
}
