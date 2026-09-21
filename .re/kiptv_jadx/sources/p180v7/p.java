package p180v7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p implements p180v7.o {
    @Override // p180v7.q
    public java.util.Collection a(p180v7.f kindFilter, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        return p078i6.w.f23205h;
    }

    @Override // p180v7.o
    public java.util.Collection b(p101l7.e name, V6.a aVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return p078i6.w.f23205h;
    }

    @Override // p180v7.o
    public java.util.Set c() {
        java.util.Collection collectionA = a(p180v7.f.f29673p, L7.c.f7094h);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.Object obj : collectionA) {
            if (obj instanceof Q6.L) {
                p101l7.e name = ((Q6.L) obj).getName();
                kotlin.jvm.internal.m.d(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // p180v7.o
    public java.util.Set d() {
        return null;
    }

    @Override // p180v7.o
    public java.util.Collection e(p101l7.e name, V6.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return p078i6.w.f23205h;
    }

    @Override // p180v7.q
    public N6.InterfaceC0694h f(p101l7.e name, V6.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        return null;
    }

    @Override // p180v7.o
    public java.util.Set g() {
        java.util.Collection collectionA = a(p180v7.f.f29674q, L7.c.f7094h);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.Object obj : collectionA) {
            if (obj instanceof Q6.L) {
                p101l7.e name = ((Q6.L) obj).getName();
                kotlin.jvm.internal.m.d(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }
}
