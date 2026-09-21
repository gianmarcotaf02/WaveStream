package p137q0;

import Y6.f;
import p194x6.m;

public final class j implements p {

    public final p f26470b;

    public final p f26471c;

    public j(p pVar, p pVar2) {
        this.f26470b = pVar;
        this.f26471c = pVar2;
    }

    @Override
    public final boolean a(p194x6.j jVar) {
        return this.f26470b.a(jVar) && this.f26471c.a(jVar);
    }

    @Override
    public final Object c(Object obj, m mVar) {
        return this.f26471c.c(this.f26470b.c(obj, mVar), mVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(this.f26470b, jVar.f26470b) && kotlin.jvm.internal.m.a(this.f26471c, jVar.f26471c);
    }

    public final int hashCode() {
        return (this.f26471c.hashCode() * 31) + this.f26470b.hashCode();
    }

    public final String toString() {
        return f.l(new StringBuilder("["), (String) c("", i.f26469h), ']');
    }
}
