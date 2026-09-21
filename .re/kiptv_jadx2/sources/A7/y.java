package A7;

import N6.InterfaceC0694h;
import N6.T;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

public abstract class y extends p180v7.p {

    public static final E6.u[] f363f;

    public final y7.l f364b;

    public final x f365c;

    public final B7.i f366d;

    public final B7.h f367e;

    static {
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u(y.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0);
        kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
        f363f = new E6.u[]{c9.h(uVar), B2.a.e(y.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0, c9)};
    }

    public y(y7.l c9, List functionList, List propertyList, List typeAliasList, Function0 function0) {
        kotlin.jvm.internal.m.e(c9, "c");
        kotlin.jvm.internal.m.e(functionList, "functionList");
        kotlin.jvm.internal.m.e(propertyList, "propertyList");
        kotlin.jvm.internal.m.e(typeAliasList, "typeAliasList");
        this.f364b = c9;
        y7.j jVar = c9.f32069a;
        jVar.f32048c.getClass();
        this.f365c = new x(this, functionList, propertyList, typeAliasList);
        B7.m mVar = jVar.f32046a;
        t tVar = new t(0, function0);
        mVar.getClass();
        this.f366d = new B7.i(mVar, tVar);
        k kVar = new k(1, this);
        mVar.getClass();
        this.f367e = new B7.h(mVar, kVar);
    }

    @Override
    public Collection b(p101l7.e name, V6.a aVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return this.f365c.a(name, aVar);
    }

    @Override
    public final Set c() {
        return (Set) p000a.a.v(this.f365c.g, x.j[0]);
    }

    @Override
    public final Set d() {
        B7.h hVar = this.f367e;
        E6.u p2 = f363f[1];
        kotlin.jvm.internal.m.e(hVar, "<this>");
        kotlin.jvm.internal.m.e(p2, "p");
        return (Set) hVar.invoke();
    }

    @Override
    public Collection e(p101l7.e name, V6.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return this.f365c.b(name, cVar);
    }

    @Override
    public InterfaceC0694h f(p101l7.e name, V6.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        if (q(name)) {
            return this.f364b.f32069a.b(l(name));
        }
        x xVar = this.f365c;
        if (!xVar.f357c.keySet().contains(name)) {
            return null;
        }
        xVar.getClass();
        return (T) xVar.f360f.invoke(name);
    }

    @Override
    public final Set g() {
        return (Set) p000a.a.v(this.f365c.f361h, x.j[1]);
    }

    public abstract void h(ArrayList arrayList, p194x6.j jVar);

    public final List i(p180v7.f kindFilter, p194x6.j jVar) {
        V6.c cVar = V6.c.f10359k;
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        ArrayList arrayList = new ArrayList(0);
        if (kindFilter.a(p180v7.f.f29665f)) {
            h(arrayList, jVar);
        }
        x xVar = this.f365c;
        xVar.getClass();
        boolean zA = kindFilter.a(p180v7.f.j);
        p127o7.g gVar = p127o7.g.f26148i;
        if (zA) {
            Set<p101l7.e> set = (Set) p000a.a.v(xVar.f361h, x.j[1]);
            ArrayList arrayList2 = new ArrayList();
            for (p101l7.e eVar : set) {
                if (((Boolean) jVar.invoke(eVar)).booleanValue()) {
                    arrayList2.addAll(xVar.b(eVar, cVar));
                }
            }
            p078i6.t.L0(gVar, arrayList2);
            arrayList.addAll(arrayList2);
        }
        if (kindFilter.a(p180v7.f.f29667i)) {
            Set<p101l7.e> set2 = (Set) p000a.a.v(xVar.g, x.j[0]);
            ArrayList arrayList3 = new ArrayList();
            for (p101l7.e eVar2 : set2) {
                if (((Boolean) jVar.invoke(eVar2)).booleanValue()) {
                    arrayList3.addAll(xVar.a(eVar2, cVar));
                }
            }
            p078i6.t.L0(gVar, arrayList3);
            arrayList.addAll(arrayList3);
        }
        if (kindFilter.a(p180v7.f.f29669l)) {
            for (p101l7.e eVar3 : m()) {
                if (((Boolean) jVar.invoke(eVar3)).booleanValue()) {
                    L7.k.a(arrayList, this.f364b.f32069a.b(l(eVar3)));
                }
            }
        }
        if (kindFilter.a(p180v7.f.g)) {
            for (Object name : xVar.f357c.keySet()) {
                if (((Boolean) jVar.invoke(name)).booleanValue()) {
                    xVar.getClass();
                    kotlin.jvm.internal.m.e(name, "name");
                    L7.k.a(arrayList, (T) xVar.f360f.invoke(name));
                }
            }
        }
        return L7.k.d(arrayList);
    }

    public void j(ArrayList arrayList, p101l7.e name) {
        kotlin.jvm.internal.m.e(name, "name");
    }

    public void k(ArrayList arrayList, p101l7.e name) {
        kotlin.jvm.internal.m.e(name, "name");
    }

    public abstract p101l7.b l(p101l7.e eVar);

    public final Set m() {
        return (Set) p000a.a.v(this.f366d, f363f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(p101l7.e name) {
        kotlin.jvm.internal.m.e(name, "name");
        return m().contains(name);
    }

    public boolean r(B b9) {
        return true;
    }
}
