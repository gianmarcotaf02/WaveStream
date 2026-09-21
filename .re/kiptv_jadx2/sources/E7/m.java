package E7;

import N6.InterfaceC0694h;
import java.util.Collection;
import java.util.Set;

public final class m extends g {
    @Override
    public final Collection a(p180v7.f kindFilter, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        throw new IllegalStateException(this.f3234b);
    }

    @Override
    public final Collection b(p101l7.e eVar, V6.a aVar) {
        b(eVar, (V6.c) aVar);
        throw null;
    }

    @Override
    public final Set c() {
        throw new IllegalStateException();
    }

    @Override
    public final Set d() {
        throw new IllegalStateException();
    }

    @Override
    public final Collection e(p101l7.e eVar, V6.c cVar) {
        e(eVar, cVar);
        throw null;
    }

    @Override
    public final InterfaceC0694h f(p101l7.e name, V6.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        throw new IllegalStateException(this.f3234b + ", required name: " + name);
    }

    @Override
    public final Set g() {
        throw new IllegalStateException();
    }

    @Override
    public final Set b(p101l7.e name, V6.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        throw new IllegalStateException(this.f3234b + ", required name: " + name);
    }

    @Override
    public final Set e(p101l7.e name, V6.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        throw new IllegalStateException(this.f3234b + ", required name: " + name);
    }

    @Override
    public final String toString() {
        return Y6.f.l(new StringBuilder("ThrowingScope{"), this.f3234b, '}');
    }
}
