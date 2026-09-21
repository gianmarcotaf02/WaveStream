package A7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y extends p180v7.p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ E6.u[] f363f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y7.l f364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A7.x f365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B7.i f366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B7.h f367e;

    static {
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u(A7.y.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0);
        kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
        f363f = new E6.u[]{c9.h(uVar), B2.a.e(A7.y.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0, c9)};
    }

    public y(y7.l c9, java.util.List functionList, java.util.List propertyList, java.util.List typeAliasList, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.m.e(c9, "c");
        kotlin.jvm.internal.m.e(functionList, "functionList");
        kotlin.jvm.internal.m.e(propertyList, "propertyList");
        kotlin.jvm.internal.m.e(typeAliasList, "typeAliasList");
        this.f364b = c9;
        y7.j jVar = c9.f32069a;
        jVar.f32048c.getClass();
        this.f365c = new A7.x(this, functionList, propertyList, typeAliasList);
        B7.m mVar = jVar.f32046a;
        A7.t tVar = new A7.t(0, function0);
        mVar.getClass();
        this.f366d = new B7.i(mVar, tVar);
        A7.k kVar = new A7.k(1, this);
        mVar.getClass();
        this.f367e = new B7.h(mVar, kVar);
    }

    @Override // p180v7.p, p180v7.o
    public java.util.Collection b(p101l7.e name, V6.a aVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return this.f365c.a(name, aVar);
    }

    @Override // p180v7.p, p180v7.o
    public final java.util.Set c() {
        return (java.util.Set) p000a.a.v(this.f365c.g, A7.x.j[0]);
    }

    @Override // p180v7.p, p180v7.o
    public final java.util.Set d() {
        B7.h hVar = this.f367e;
        E6.u p2 = f363f[1];
        kotlin.jvm.internal.m.e(hVar, "<this>");
        kotlin.jvm.internal.m.e(p2, "p");
        return (java.util.Set) hVar.invoke();
    }

    @Override // p180v7.p, p180v7.o
    public java.util.Collection e(p101l7.e name, V6.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return this.f365c.b(name, cVar);
    }

    @Override // p180v7.p, p180v7.q
    public N6.InterfaceC0694h f(p101l7.e name, V6.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        if (q(name)) {
            return this.f364b.f32069a.b(l(name));
        }
        A7.x xVar = this.f365c;
        if (!xVar.f357c.keySet().contains(name)) {
            return null;
        }
        xVar.getClass();
        return (N6.T) xVar.f360f.invoke(name);
    }

    @Override // p180v7.p, p180v7.o
    public final java.util.Set g() {
        return (java.util.Set) p000a.a.v(this.f365c.f361h, A7.x.j[1]);
    }

    public abstract void h(java.util.ArrayList arrayList, p194x6.j jVar);

    public final java.util.List i(p180v7.f kindFilter, p194x6.j jVar) {
        V6.c cVar = V6.c.f10359k;
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        if (kindFilter.a(p180v7.f.f29665f)) {
            h(arrayList, jVar);
        }
        A7.x xVar = this.f365c;
        xVar.getClass();
        boolean zA = kindFilter.a(p180v7.f.j);
        p127o7.g gVar = p127o7.g.f26148i;
        if (zA) {
            java.util.Set<p101l7.e> set = (java.util.Set) p000a.a.v(xVar.f361h, A7.x.j[1]);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (p101l7.e eVar : set) {
                if (((java.lang.Boolean) jVar.invoke(eVar)).booleanValue()) {
                    arrayList2.addAll(xVar.b(eVar, cVar));
                }
            }
            p078i6.t.L0(gVar, arrayList2);
            arrayList.addAll(arrayList2);
        }
        if (kindFilter.a(p180v7.f.f29667i)) {
            java.util.Set<p101l7.e> set2 = (java.util.Set) p000a.a.v(xVar.g, A7.x.j[0]);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (p101l7.e eVar2 : set2) {
                if (((java.lang.Boolean) jVar.invoke(eVar2)).booleanValue()) {
                    arrayList3.addAll(xVar.a(eVar2, cVar));
                }
            }
            p078i6.t.L0(gVar, arrayList3);
            arrayList.addAll(arrayList3);
        }
        if (kindFilter.a(p180v7.f.f29669l)) {
            for (p101l7.e eVar3 : m()) {
                if (((java.lang.Boolean) jVar.invoke(eVar3)).booleanValue()) {
                    L7.k.a(arrayList, this.f364b.f32069a.b(l(eVar3)));
                }
            }
        }
        if (kindFilter.a(p180v7.f.g)) {
            for (java.lang.Object name : xVar.f357c.keySet()) {
                if (((java.lang.Boolean) jVar.invoke(name)).booleanValue()) {
                    xVar.getClass();
                    kotlin.jvm.internal.m.e(name, "name");
                    L7.k.a(arrayList, (N6.T) xVar.f360f.invoke(name));
                }
            }
        }
        return L7.k.d(arrayList);
    }

    public void j(java.util.ArrayList arrayList, p101l7.e name) {
        kotlin.jvm.internal.m.e(name, "name");
    }

    public void k(java.util.ArrayList arrayList, p101l7.e name) {
        kotlin.jvm.internal.m.e(name, "name");
    }

    public abstract p101l7.b l(p101l7.e eVar);

    public final java.util.Set m() {
        return (java.util.Set) p000a.a.v(this.f366d, f363f[0]);
    }

    public abstract java.util.Set n();

    public abstract java.util.Set o();

    public abstract java.util.Set p();

    public boolean q(p101l7.e name) {
        kotlin.jvm.internal.m.e(name, "name");
        return m().contains(name);
    }

    public boolean r(A7.B b9) {
        return true;
    }
}
