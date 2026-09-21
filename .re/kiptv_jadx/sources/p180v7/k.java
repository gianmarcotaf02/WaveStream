package p180v7;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements p180v7.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29687b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f29688c;

    public k(B7.p storageManager, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.m.e(storageManager, "storageManager");
        this.f29688c = new B7.i((B7.m) storageManager, new A7.t(1, function0));
    }

    @Override // p180v7.q
    public java.util.Collection a(p180v7.f kindFilter, p194x6.j jVar) {
        switch (this.f29687b) {
            case 1:
                kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
                java.util.Collection collectionI = i(kindFilter, jVar);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : collectionI) {
                    if (((N6.InterfaceC0697k) obj) instanceof N6.InterfaceC0688b) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return p078i6.o.A1(p127o7.k.o(arrayList, p180v7.l.f29691l), arrayList2);
            default:
                return i(kindFilter, jVar);
        }
    }

    @Override // p180v7.o
    public java.util.Collection b(p101l7.e name, V6.a aVar) {
        switch (this.f29687b) {
            case 1:
                kotlin.jvm.internal.m.e(name, "name");
                return p127o7.k.o(j(name, aVar), p180v7.l.j);
            default:
                return j(name, aVar);
        }
    }

    @Override // p180v7.o
    public final java.util.Set c() {
        return l().c();
    }

    @Override // p180v7.o
    public final java.util.Set d() {
        return l().d();
    }

    @Override // p180v7.o
    public java.util.Collection e(p101l7.e name, V6.c cVar) {
        switch (this.f29687b) {
            case 1:
                kotlin.jvm.internal.m.e(name, "name");
                return p127o7.k.o(k(name, cVar), p180v7.l.f29690k);
            default:
                return k(name, cVar);
        }
    }

    @Override // p180v7.q
    public final N6.InterfaceC0694h f(p101l7.e name, V6.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        return l().f(name, location);
    }

    @Override // p180v7.o
    public final java.util.Set g() {
        return l().g();
    }

    public final p180v7.o h() {
        if (!(l() instanceof p180v7.k)) {
            return l();
        }
        p180v7.o oVarL = l();
        kotlin.jvm.internal.m.c(oVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((p180v7.k) oVarL).h();
    }

    public final java.util.Collection i(p180v7.f kindFilter, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        return l().a(kindFilter, jVar);
    }

    public final java.util.Collection j(p101l7.e name, V6.a aVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return l().b(name, aVar);
    }

    public final java.util.Collection k(p101l7.e name, V6.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return l().e(name, cVar);
    }

    public final p180v7.o l() {
        switch (this.f29687b) {
            case 0:
                return (p180v7.o) ((B7.i) this.f29688c).invoke();
            default:
                return (p180v7.o) this.f29688c;
        }
    }

    public k(p180v7.o oVar) {
        this.f29688c = oVar;
    }
}
