package p163t;

import O7.r;
import kotlin.jvm.internal.m;
import p020c0.AbstractC1703s;
import p020c0.C1681g0;
import p070h6.A;
import p100l6.c;
import p109m6.a;
import p194x6.j;

public final class C2748c {

    public final E0 f27549a;

    public final Object f27550b;

    public final C2768m f27551c;

    public final C1681g0 f27552d;

    public final C1681g0 f27553e;

    public final Q f27554f;
    public final C2761i0 g;

    public final r f27555h;

    public final r f27556i;
    public final r j;

    public final r f27557k;

    public C2748c(Object obj, E0 e6, Object obj2) {
        this.f27549a = e6;
        this.f27550b = obj2;
        C2768m c2768m = new C2768m(e6, obj, null, 60);
        this.f27551c = c2768m;
        this.f27552d = AbstractC1703s.y(Boolean.FALSE);
        this.f27553e = AbstractC1703s.y(obj);
        this.f27554f = new Q();
        this.g = new C2761i0(obj2);
        r rVar = c2768m.j;
        boolean z6 = rVar instanceof C2770n;
        r rVar2 = z6 ? AbstractC2750d.f27565e : rVar instanceof C2771o ? AbstractC2750d.f27566f : rVar instanceof C2772p ? AbstractC2750d.g : AbstractC2750d.f27567h;
        this.f27555h = rVar2;
        r rVar3 = z6 ? AbstractC2750d.f27561a : rVar instanceof C2771o ? AbstractC2750d.f27562b : rVar instanceof C2772p ? AbstractC2750d.f27563c : AbstractC2750d.f27564d;
        this.f27556i = rVar3;
        this.j = rVar2;
        this.f27557k = rVar3;
    }

    public static final Object a(C2748c c2748c, Object obj) {
        r rVar = c2748c.f27555h;
        r rVar2 = c2748c.j;
        boolean zA = m.a(rVar2, rVar);
        r rVar3 = c2748c.f27557k;
        if (!zA || !m.a(rVar3, c2748c.f27556i)) {
            E0 e6 = c2748c.f27549a;
            r rVar4 = (r) e6.f27453a.invoke(obj);
            int iB = rVar4.b();
            boolean z6 = false;
            for (int i3 = 0; i3 < iB; i3++) {
                if (rVar4.a(i3) < rVar2.a(i3) || rVar4.a(i3) > rVar3.a(i3)) {
                    rVar4.e(r.r(rVar4.a(i3), rVar2.a(i3), rVar3.a(i3)), i3);
                    z6 = true;
                }
            }
            if (z6) {
                return e6.f27454b.invoke(rVar4);
            }
        }
        return obj;
    }

    public static final void b(C2748c c2748c) {
        C2768m c2768m = c2748c.f27551c;
        c2768m.j.d();
        c2768m.f27641k = Long.MIN_VALUE;
        c2748c.f27552d.setValue(Boolean.FALSE);
    }

    public static Object c(C2748c c2748c, Object obj, InterfaceC2766l interfaceC2766l, j jVar, c cVar, int i3) {
        if ((i3 & 2) != 0) {
            interfaceC2766l = c2748c.g;
        }
        InterfaceC2766l interfaceC2766l2 = interfaceC2766l;
        Object objInvoke = c2748c.f27549a.f27454b.invoke(c2748c.f27551c.j);
        if ((i3 & 8) != 0) {
            jVar = null;
        }
        Object objD = c2748c.d();
        E0 e6 = c2748c.f27549a;
        return Q.a(c2748c.f27554f, new C2744a(c2748c, objInvoke, new o0(interfaceC2766l2, e6, objD, obj, (r) e6.f27453a.invoke(objInvoke)), c2748c.f27551c.f27641k, jVar, null), cVar);
    }

    public final Object d() {
        return this.f27551c.f27640i.getValue();
    }

    public final Object e(Object obj, c cVar) {
        Object objA = Q.a(this.f27554f, new C2746b(this, obj, null), cVar);
        return objA == a.f25430h ? objA : A.f22523a;
    }

    public C2748c(Object obj, E0 e6, Object obj2, int i3) {
        this(obj, e6, (i3 & 4) != 0 ? null : obj2);
    }
}
