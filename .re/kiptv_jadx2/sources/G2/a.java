package G2;

import E2.o;
import kotlin.jvm.internal.m;

public final class a {

    public final Object f3762a;

    public final F2.b f3763b;

    public final o f3764c;

    public a(Object obj, F2.b bVar, o oVar) {
        this.f3762a = obj;
        this.f3763b = bVar;
        this.f3764c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        F2.b bVar = aVar.f3763b;
        F2.b bVar2 = this.f3763b;
        return m.a(bVar2, bVar) && bVar2.a(this.f3762a, aVar.f3762a) && m.a(this.f3764c, aVar.f3764c);
    }

    public final int hashCode() {
        F2.b bVar = this.f3763b;
        return this.f3764c.hashCode() + ((bVar.b(this.f3762a) + (bVar.hashCode() * 31)) * 31);
    }
}
