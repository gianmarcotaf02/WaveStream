package M6;

public final class c {

    public final p101l7.b f7149a;

    public final p101l7.b f7150b;

    public final p101l7.b f7151c;

    public c(p101l7.b bVar, p101l7.b bVar2, p101l7.b bVar3) {
        this.f7149a = bVar;
        this.f7150b = bVar2;
        this.f7151c = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.a(this.f7149a, cVar.f7149a) && kotlin.jvm.internal.m.a(this.f7150b, cVar.f7150b) && kotlin.jvm.internal.m.a(this.f7151c, cVar.f7151c);
    }

    public final int hashCode() {
        return this.f7151c.hashCode() + ((this.f7150b.hashCode() + (this.f7149a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.f7149a + ", kotlinReadOnly=" + this.f7150b + ", kotlinMutable=" + this.f7151c + ')';
    }
}
