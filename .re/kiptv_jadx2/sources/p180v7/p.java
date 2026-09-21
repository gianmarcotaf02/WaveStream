package p180v7;

import L7.c;
import N6.InterfaceC0694h;
import Q6.L;
import V6.a;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.m;
import p078i6.w;
import p101l7.e;
import p194x6.j;

public abstract class p implements o {
    @Override
    public Collection a(f kindFilter, j jVar) {
        m.e(kindFilter, "kindFilter");
        return w.f23205h;
    }

    @Override
    public Collection b(e name, a aVar) {
        m.e(name, "name");
        return w.f23205h;
    }

    @Override
    public Set c() {
        Collection collectionA = a(f.f29673p, c.f7094h);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionA) {
            if (obj instanceof L) {
                e name = ((L) obj).getName();
                m.d(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override
    public Set d() {
        return null;
    }

    @Override
    public Collection e(e name, V6.c cVar) {
        m.e(name, "name");
        return w.f23205h;
    }

    @Override
    public InterfaceC0694h f(e name, a location) {
        m.e(name, "name");
        m.e(location, "location");
        return null;
    }

    @Override
    public Set g() {
        Collection collectionA = a(f.f29674q, c.f7094h);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionA) {
            if (obj instanceof L) {
                e name = ((L) obj).getName();
                m.d(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }
}
