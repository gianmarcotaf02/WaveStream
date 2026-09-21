package O2;

public final class b {

    public final u f7886a;

    public b(u uVar) {
        this.f7886a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return kotlin.jvm.internal.m.a(this.f7886a, ((b) obj).f7886a);
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f7886a;
        if (uVar != null) {
            return uVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.f7886a + ')';
    }
}
