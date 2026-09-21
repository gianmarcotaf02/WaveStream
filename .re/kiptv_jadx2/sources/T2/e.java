package T2;

import kotlin.jvm.internal.m;

public final class e implements i {

    public final h f9735b;

    public e(h hVar) {
        this.f9735b = hVar;
    }

    @Override
    public final Object e(p100l6.c cVar) {
        return this.f9735b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && m.a(this.f9735b, ((e) obj).f9735b);
    }

    public final int hashCode() {
        return this.f9735b.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.f9735b + ')';
    }
}
