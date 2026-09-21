package J;

import Q0.AbstractC0777k;
import S7.InterfaceC0891h0;
import V7.InterfaceC0982h;
import p005a5.C1245c8;
import p005a5.EnumC1224a7;

public final class C0559y implements InterfaceC0982h {

    public final int f5959h;

    public final Object f5960i;
    public final Object j;

    public final Object f5961k;

    public final Object f5962l;

    public C0559y(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f5959h = i3;
        this.f5960i = obj;
        this.j = obj2;
        this.f5961k = obj3;
        this.f5962l = obj4;
    }

    @Override
    public final Object emit(Object obj, p100l6.c cVar) {
        W7.l lVar;
        C0559y c0559y;
        boolean z6 = true;
        Object obj2 = this.f5962l;
        Object obj3 = this.j;
        Object obj4 = this.f5961k;
        p070h6.A a2 = p070h6.A.f22523a;
        Object obj5 = this.f5960i;
        switch (this.f5959h) {
            case 0:
                X x9 = (X) obj5;
                if (((Boolean) obj).booleanValue() && x9.b()) {
                    U.i0 i0Var = (U.i0) obj4;
                    AbstractC0549n.t((g1.y) obj3, x9, i0Var.n(), (g1.k) obj2, i0Var.f10010b);
                } else {
                    AbstractC0549n.l(x9);
                }
                return a2;
            case 1:
                if (cVar instanceof W7.l) {
                    lVar = (W7.l) cVar;
                    int i3 = lVar.f10750l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        lVar.f10750l = i3 - Integer.MIN_VALUE;
                    } else {
                        lVar = new W7.l(this, cVar);
                    }
                } else {
                    lVar = new W7.l(this, cVar);
                }
                Object obj6 = lVar.j;
                p109m6.a aVar = p109m6.a.f25430h;
                int i9 = lVar.f10750l;
                if (i9 == 0) {
                    com.google.common.util.concurrent.P.u0(obj6);
                    InterfaceC0891h0 interfaceC0891h0 = (InterfaceC0891h0) ((kotlin.jvm.internal.A) obj5).f24539h;
                    if (interfaceC0891h0 != null) {
                        interfaceC0891h0.e(new W7.o("Child of the scoped flow was cancelled"));
                        lVar.f10747h = this;
                        lVar.f10748i = obj;
                        lVar.f10750l = 1;
                        if (interfaceC0891h0.z(lVar) == aVar) {
                            return aVar;
                        }
                    }
                    c0559y = this;
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = lVar.f10748i;
                    c0559y = lVar.f10747h;
                    com.google.common.util.concurrent.P.u0(obj6);
                }
                kotlin.jvm.internal.A a9 = (kotlin.jvm.internal.A) c0559y.f5960i;
                S7.B b9 = S7.B.f9521h;
                a9.f24539h = S7.C.A((S7.A) c0559y.j, null, new W7.k((W7.n) c0559y.f5961k, (InterfaceC0982h) c0559y.f5962l, obj, null), 1);
                return a2;
            case 2:
                p070h6.q qVar = (p070h6.q) obj;
                String str = (String) qVar.f22547h;
                p070h6.k kVar = new p070h6.k(new Integer(((Number) qVar.f22548i).intValue()), new Integer(((Number) qVar.j).intValue()));
                kotlin.jvm.internal.A a10 = (kotlin.jvm.internal.A) obj5;
                kotlin.jvm.internal.A a11 = (kotlin.jvm.internal.A) obj3;
                if (str == null) {
                    a10.f24539h = null;
                    a11.f24539h = null;
                } else {
                    kotlin.jvm.internal.A a12 = (kotlin.jvm.internal.A) obj4;
                    if (!str.equals(a10.f24539h)) {
                        a10.f24539h = str;
                        a12.f24539h = kVar;
                        a11.f24539h = null;
                    }
                    C1245c8 c1245c8 = (C1245c8) obj2;
                    if ((((V7.n0) c1245c8.f14316e.f15322n.f10419h).getValue() != null || ((V7.n0) c1245c8.f14316e.f15324p.f10419h).getValue() != null) && !kVar.equals(a12.f24539h) && !kotlin.jvm.internal.m.a(a11.f24539h, str)) {
                        a11.f24539h = str;
                        c1245c8.y(EnumC1224a7.f14218i);
                    }
                }
                return a2;
            default:
                p202z.j jVar = (p202z.j) obj;
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) obj4;
                kotlin.jvm.internal.y yVar2 = (kotlin.jvm.internal.y) obj3;
                kotlin.jvm.internal.y yVar3 = (kotlin.jvm.internal.y) obj5;
                if (jVar instanceof p202z.m) {
                    yVar3.f24555h++;
                } else if ((jVar instanceof p202z.n) || (jVar instanceof p202z.l)) {
                    yVar3.f24555h--;
                } else if (jVar instanceof p202z.h) {
                    yVar2.f24555h++;
                } else if (jVar instanceof p202z.i) {
                    yVar2.f24555h--;
                } else if (jVar instanceof p202z.d) {
                    yVar.f24555h++;
                } else if (jVar instanceof p202z.e) {
                    yVar.f24555h--;
                }
                boolean z9 = false;
                boolean z10 = yVar3.f24555h > 0;
                boolean z11 = yVar2.f24555h > 0;
                boolean z12 = yVar.f24555h > 0;
                v.J j = (v.J) obj2;
                if (j.f28871w != z10) {
                    j.f28871w = z10;
                    z9 = true;
                }
                if (j.f28872x != z11) {
                    j.f28872x = z11;
                    z9 = true;
                }
                if (j.y != z12) {
                    j.y = z12;
                } else {
                    z6 = z9;
                }
                if (z6) {
                    AbstractC0777k.j(j);
                }
                return a2;
        }
    }
}
