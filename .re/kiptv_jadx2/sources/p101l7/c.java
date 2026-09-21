package p101l7;

import O7.q;
import O7.x;
import kotlin.jvm.internal.m;

public final class c {

    public static final c f24828c = new c("");

    public final d f24829a;

    public transient c f24830b;

    public c(String fqName) {
        m.e(fqName, "fqName");
        this.f24829a = new d(fqName, this);
    }

    public final c a(e name) {
        m.e(name, "name");
        return new c(this.f24829a.a(name), this);
    }

    public final c b() {
        c cVar = this.f24830b;
        if (cVar != null) {
            return cVar;
        }
        d dVar = this.f24829a;
        if (dVar.c()) {
            throw new IllegalStateException("root");
        }
        d dVar2 = dVar.f24834c;
        if (dVar2 == null) {
            if (dVar.c()) {
                throw new IllegalStateException("root");
            }
            dVar.b();
            dVar2 = dVar.f24834c;
            m.b(dVar2);
        }
        c cVar2 = new c(dVar2);
        this.f24830b = cVar2;
        return cVar2;
    }

    public final boolean c(e segment) {
        m.e(segment, "segment");
        d dVar = this.f24829a;
        dVar.getClass();
        if (!dVar.c()) {
            String str = dVar.f24832a;
            int iK0 = q.K0(str, '.', 0, 6);
            if (iK0 == -1) {
                iK0 = str.length();
            }
            int i3 = iK0;
            String strB = segment.b();
            m.d(strB, "asString(...)");
            if (i3 == strB.length() && x.t0(0, 0, i3, dVar.f24832a, strB, false)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return m.a(this.f24829a, ((c) obj).f24829a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24829a.f24832a.hashCode();
    }

    public final String toString() {
        return this.f24829a.toString();
    }

    public c(d fqName) {
        m.e(fqName, "fqName");
        this.f24829a = fqName;
    }

    public c(d dVar, c cVar) {
        this.f24829a = dVar;
        this.f24830b = cVar;
    }
}
