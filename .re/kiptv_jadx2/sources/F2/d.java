package F2;

import E2.o;

public final class d {

    public final o f3528a;

    public final S2.h f3529b;

    public final b f3530c;

    public d(o oVar, S2.h hVar, b bVar) {
        this.f3528a = oVar;
        this.f3529b = hVar;
        this.f3530c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!kotlin.jvm.internal.m.a(this.f3528a, dVar.f3528a)) {
            return false;
        }
        b bVar = dVar.f3530c;
        b bVar2 = this.f3530c;
        return kotlin.jvm.internal.m.a(bVar2, bVar) && bVar2.a(this.f3529b, dVar.f3529b);
    }

    public final int hashCode() {
        int iHashCode = this.f3528a.hashCode() * 31;
        b bVar = this.f3530c;
        return bVar.b(this.f3529b) + ((bVar.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.f3528a + ", request=" + this.f3529b + ", modelEqualityDelegate=" + this.f3530c + ')';
    }
}
