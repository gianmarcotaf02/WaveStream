package O7;

public final class i {

    public final String f8049a;

    public final D6.g f8050b;

    public i(String str, D6.g gVar) {
        this.f8049a = str;
        this.f8050b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.f8049a, iVar.f8049a) && kotlin.jvm.internal.m.a(this.f8050b, iVar.f8050b);
    }

    public final int hashCode() {
        return this.f8050b.hashCode() + (this.f8049a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f8049a + ", range=" + this.f8050b + ')';
    }
}
