package T2;

import kotlin.jvm.internal.m;

public final class h {

    public static final h f9738c;

    public final c f9739a;

    public final c f9740b;

    static {
        b bVar = b.f9732a;
        f9738c = new h(bVar, bVar);
    }

    public h(c cVar, c cVar2) {
        this.f9739a = cVar;
        this.f9740b = cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return m.a(this.f9739a, hVar.f9739a) && m.a(this.f9740b, hVar.f9740b);
    }

    public final int hashCode() {
        return this.f9740b.hashCode() + (this.f9739a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f9739a + ", height=" + this.f9740b + ')';
    }
}
