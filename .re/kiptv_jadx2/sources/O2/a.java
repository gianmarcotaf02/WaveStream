package O2;

public final class a {

    public final u f7885a;

    public a(u uVar) {
        this.f7885a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return kotlin.jvm.internal.m.a(this.f7885a, aVar.f7885a);
    }

    public final int hashCode() {
        u uVar = this.f7885a;
        if (uVar != null) {
            return uVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReadResult(request=null, response=" + this.f7885a + ')';
    }
}
