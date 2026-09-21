package p180v7;

import N6.InterfaceC0691e;
import N6.InterfaceC0694h;
import N6.InterfaceC0695i;
import N6.T;
import V6.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.m;
import p078i6.w;
import p101l7.e;

public final class j extends p {

    public final o f29686b;

    public j(o workerScope) {
        m.e(workerScope, "workerScope");
        this.f29686b = workerScope;
    }

    @Override
    public final Collection a(f kindFilter, p194x6.j jVar) {
        m.e(kindFilter, "kindFilter");
        int i3 = f.f29669l & kindFilter.f29678b;
        f fVar = i3 == 0 ? null : new f(i3, kindFilter.f29677a);
        if (fVar == null) {
            return w.f23205h;
        }
        Collection collectionA = this.f29686b.a(fVar, jVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionA) {
            if (obj instanceof InterfaceC0695i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override
    public final Set c() {
        return this.f29686b.c();
    }

    @Override
    public final Set d() {
        return this.f29686b.d();
    }

    @Override
    public final InterfaceC0694h f(e name, a location) {
        m.e(name, "name");
        m.e(location, "location");
        InterfaceC0694h interfaceC0694hF = this.f29686b.f(name, location);
        if (interfaceC0694hF != null) {
            InterfaceC0691e interfaceC0691e = interfaceC0694hF instanceof InterfaceC0691e ? (InterfaceC0691e) interfaceC0694hF : null;
            if (interfaceC0691e != null) {
                return interfaceC0691e;
            }
            if (interfaceC0694hF instanceof T) {
                return (T) interfaceC0694hF;
            }
        }
        return null;
    }

    @Override
    public final Set g() {
        return this.f29686b.g();
    }

    public final String toString() {
        return "Classes from " + this.f29686b;
    }
}
