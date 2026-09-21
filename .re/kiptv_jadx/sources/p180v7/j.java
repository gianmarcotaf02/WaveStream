package p180v7;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends p180v7.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p180v7.o f29686b;

    public j(p180v7.o workerScope) {
        kotlin.jvm.internal.m.e(workerScope, "workerScope");
        this.f29686b = workerScope;
    }

    @Override // p180v7.p, p180v7.q
    public final java.util.Collection a(p180v7.f kindFilter, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        int i3 = p180v7.f.f29669l & kindFilter.f29678b;
        p180v7.f fVar = i3 == 0 ? null : new p180v7.f(i3, kindFilter.f29677a);
        if (fVar == null) {
            return p078i6.w.f23205h;
        }
        java.util.Collection collectionA = this.f29686b.a(fVar, jVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collectionA) {
            if (obj instanceof N6.InterfaceC0695i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p180v7.p, p180v7.o
    public final java.util.Set c() {
        return this.f29686b.c();
    }

    @Override // p180v7.p, p180v7.o
    public final java.util.Set d() {
        return this.f29686b.d();
    }

    @Override // p180v7.p, p180v7.q
    public final N6.InterfaceC0694h f(p101l7.e name, V6.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        N6.InterfaceC0694h interfaceC0694hF = this.f29686b.f(name, location);
        if (interfaceC0694hF != null) {
            N6.InterfaceC0691e interfaceC0691e = interfaceC0694hF instanceof N6.InterfaceC0691e ? (N6.InterfaceC0691e) interfaceC0694hF : null;
            if (interfaceC0691e != null) {
                return interfaceC0691e;
            }
            if (interfaceC0694hF instanceof N6.T) {
                return (N6.T) interfaceC0694hF;
            }
        }
        return null;
    }

    @Override // p180v7.p, p180v7.o
    public final java.util.Set g() {
        return this.f29686b.g();
    }

    public final java.lang.String toString() {
        return "Classes from " + this.f29686b;
    }
}
