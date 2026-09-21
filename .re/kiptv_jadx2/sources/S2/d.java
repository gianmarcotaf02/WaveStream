package S2;

public final class d implements k {

    public final E2.l f9216a;

    public final h f9217b;

    public final Throwable f9218c;

    public d(E2.l lVar, h hVar, Throwable th) {
        this.f9216a = lVar;
        this.f9217b = hVar;
        this.f9218c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.m.a(this.f9216a, dVar.f9216a) && kotlin.jvm.internal.m.a(this.f9217b, dVar.f9217b) && kotlin.jvm.internal.m.a(this.f9218c, dVar.f9218c);
    }

    @Override
    public final h getRequest() {
        return this.f9217b;
    }

    public final int hashCode() {
        E2.l lVar = this.f9216a;
        return this.f9218c.hashCode() + ((this.f9217b.hashCode() + ((lVar == null ? 0 : lVar.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.f9216a + ", request=" + this.f9217b + ", throwable=" + this.f9218c + ')';
    }
}
