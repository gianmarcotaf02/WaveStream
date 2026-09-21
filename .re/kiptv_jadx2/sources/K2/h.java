package K2;

import E2.C0274a;
import E2.l;
import E2.w;
import E6.InterfaceC0331d;
import H2.q;
import S2.o;
import S7.C;
import android.graphics.Bitmap;
import com.google.android.gms.internal.play_billing.M0;
import com.google.common.util.concurrent.P;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.m;

public final class h {

    public final w f6817a;

    public final X2.a f6818b;

    public final S2.a f6819c;

    public final p166t3.i f6820d;

    public h(w wVar, X2.a aVar, S2.a aVar2) {
        this.f6817a = wVar;
        this.f6818b = aVar;
        this.f6819c = aVar2;
        this.f6820d = new p166t3.i(wVar, aVar2);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(K2.h r7, J2.i r8, E2.e r9, S2.h r10, java.lang.Object r11, S2.o r12, E2.g r13, p117n6.c r14) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.h.a(K2.h, J2.i, E2.e, S2.h, java.lang.Object, S2.o, E2.g, n6.c):java.lang.Object");
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(h hVar, S2.h hVar2, Object obj, o oVar, E2.g gVar, p117n6.c cVar) throws Throwable {
        c cVar2;
        J2.i iVar;
        q qVar;
        h hVar3;
        Object obj2;
        E2.g gVar2;
        A a2;
        A a9;
        A a10;
        A a11;
        S2.h hVar4;
        S2.h hVar5;
        A a12;
        E2.g gVar3;
        a aVar;
        A a13;
        h hVar6;
        Object obj3;
        J2.i iVar2;
        q qVar2;
        hVar.getClass();
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i3 = cVar2.f6790r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar2.f6790r = i3 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(hVar, cVar);
            }
        } else {
            cVar2 = new c(hVar, cVar);
        }
        c cVar3 = cVar2;
        Object objC = cVar3.f6788p;
        p109m6.a aVar2 = p109m6.a.f25430h;
        A a14 = cVar3.f6790r;
        try {
            if (a14 == 0) {
                P.u0(objC);
                A a15 = new A();
                a15.f24539h = oVar;
                A a16 = new A();
                a16.f24539h = hVar.f6817a.f2820c;
                A a17 = new A();
                try {
                    a15.f24539h = hVar.f6819c.Q((o) a15.f24539h);
                    hVar2.getClass();
                    E2.e eVar = (E2.e) a16.f24539h;
                    o oVar2 = (o) a15.f24539h;
                    cVar3.f6781h = hVar;
                    cVar3.f6782i = hVar2;
                    cVar3.j = obj;
                    cVar3.f6783k = gVar;
                    cVar3.f6784l = a15;
                    cVar3.f6785m = a16;
                    cVar3.f6786n = a17;
                    cVar3.f6787o = a17;
                    cVar3.f6790r = 1;
                    objC = hVar.c(eVar, hVar2, obj, oVar2, gVar, cVar3);
                    if (objC != aVar2) {
                        hVar3 = hVar;
                        obj2 = obj;
                        gVar2 = gVar;
                        a2 = a15;
                        a9 = a16;
                        a10 = a17;
                        a11 = a10;
                        hVar4 = hVar2;
                    }
                    return aVar2;
                } catch (Throwable th) {
                    th = th;
                    a14 = a17;
                    Object obj4 = a14.f24539h;
                    iVar = obj4 instanceof J2.i ? (J2.i) obj4 : null;
                    if (iVar != null) {
                        try {
                            M0.v(qVar);
                        } catch (RuntimeException e6) {
                            throw e6;
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            }
            if (a14 == 1) {
                a10 = cVar3.f6787o;
                a11 = cVar3.f6786n;
                A a18 = cVar3.f6785m;
                A a19 = cVar3.f6784l;
                E2.g gVar4 = (E2.g) cVar3.f6783k;
                Object obj5 = cVar3.j;
                hVar4 = cVar3.f6782i;
                h hVar7 = cVar3.f6781h;
                P.u0(objC);
                a9 = a18;
                a2 = a19;
                gVar2 = gVar4;
                obj2 = obj5;
                hVar3 = hVar7;
            } else if (a14 == 2) {
                a11 = cVar3.f6784l;
                a13 = (A) cVar3.f6783k;
                gVar3 = (E2.g) cVar3.j;
                hVar5 = cVar3.f6782i;
                hVar6 = cVar3.f6781h;
                P.u0(objC);
                aVar = (a) objC;
                a12 = a13;
                hVar3 = hVar6;
                S2.h hVar8 = hVar5;
                obj3 = a11.f24539h;
                if (obj3 instanceof J2.i) {
                    iVar2 = (J2.i) obj3;
                } else {
                    iVar2 = null;
                }
                if (iVar2 != null && (qVar2 = iVar2.f6009a) != null) {
                    try {
                        M0.v(qVar2);
                    } catch (RuntimeException e9) {
                        throw e9;
                    } catch (Exception unused2) {
                    }
                }
                o oVar3 = (o) a12.f24539h;
                hVar3.getClass();
                cVar3.f6781h = null;
                cVar3.f6782i = null;
                cVar3.j = null;
                cVar3.f6783k = null;
                cVar3.f6784l = null;
                cVar3.f6785m = null;
                cVar3.f6786n = null;
                cVar3.f6787o = null;
                cVar3.f6790r = 3;
                objC = O2.g.f0(aVar, hVar8, oVar3, gVar3, cVar3);
            } else {
                if (a14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P.u0(objC);
            }
            a aVar3 = (a) objC;
            l lVar = aVar3.f6767a;
            Bitmap.Config[] configArr = X2.l.f10836a;
            if (lVar instanceof C0274a) {
                ((C0274a) lVar).f2766a.prepareToDraw();
            }
            return aVar3;
            a10.f24539h = objC;
            Object obj6 = a11.f24539h;
            J2.e eVar2 = (J2.e) obj6;
            if (eVar2 instanceof J2.i) {
                p100l6.h hVar9 = hVar4.f9259h;
                A a20 = a11;
                S2.h hVar10 = hVar4;
                try {
                    d dVar = new d(hVar3, a20, a9, hVar10, obj2, a2, gVar2, null);
                    hVar5 = hVar10;
                    A a21 = a2;
                    gVar3 = gVar2;
                    cVar3.f6781h = hVar3;
                    cVar3.f6782i = hVar5;
                    cVar3.j = gVar3;
                    cVar3.f6783k = a21;
                    cVar3.f6784l = a11;
                    cVar3.f6785m = null;
                    cVar3.f6786n = null;
                    cVar3.f6787o = null;
                    cVar3.f6790r = 2;
                    objC = C.K(hVar9, dVar, cVar3);
                    if (objC != aVar2) {
                        a13 = a21;
                        hVar6 = hVar3;
                        aVar = (a) objC;
                        a12 = a13;
                        hVar3 = hVar6;
                        S2.h hVar11 = hVar5;
                        obj3 = a11.f24539h;
                        if (obj3 instanceof J2.i) {
                            iVar2 = (J2.i) obj3;
                        } else {
                            iVar2 = null;
                        }
                        if (iVar2 != null) {
                            M0.v(qVar2);
                        }
                        o oVar4 = (o) a12.f24539h;
                        hVar3.getClass();
                        cVar3.f6781h = null;
                        cVar3.f6782i = null;
                        cVar3.j = null;
                        cVar3.f6783k = null;
                        cVar3.f6784l = null;
                        cVar3.f6785m = null;
                        cVar3.f6786n = null;
                        cVar3.f6787o = null;
                        cVar3.f6790r = 3;
                        objC = O2.g.f0(aVar, hVar11, oVar4, gVar3, cVar3);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    a14 = a20;
                    Object obj7 = a14.f24539h;
                    if (obj7 instanceof J2.i) {
                    }
                    if (iVar != null && (qVar = iVar.f6009a) != null) {
                        M0.v(qVar);
                    }
                    throw th;
                }
            } else {
                hVar5 = hVar4;
                a12 = a2;
                gVar3 = gVar2;
                if (!(eVar2 instanceof J2.h)) {
                    throw new I3.b();
                }
                aVar = new a(((J2.h) obj6).f6006a, ((J2.h) obj6).f6007b, ((J2.h) obj6).f6008c, null);
                S2.h hVar12 = hVar5;
                obj3 = a11.f24539h;
                if (obj3 instanceof J2.i) {
                    iVar2 = (J2.i) obj3;
                } else {
                    iVar2 = null;
                }
                if (iVar2 != null) {
                    M0.v(qVar2);
                }
                o oVar5 = (o) a12.f24539h;
                hVar3.getClass();
                cVar3.f6781h = null;
                cVar3.f6782i = null;
                cVar3.j = null;
                cVar3.f6783k = null;
                cVar3.f6784l = null;
                cVar3.f6785m = null;
                cVar3.f6786n = null;
                cVar3.f6787o = null;
                cVar3.f6790r = 3;
                objC = O2.g.f0(aVar, hVar12, oVar5, gVar3, cVar3);
            }
            return aVar2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(E2.e r18, S2.h r19, java.lang.Object r20, S2.o r21, E2.g r22, p117n6.c r23) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.h.c(E2.e, S2.h, java.lang.Object, S2.o, E2.g, n6.c):java.lang.Object");
    }

    public final Object d(k kVar, p117n6.c cVar) throws Throwable {
        f fVar;
        k kVar2 = kVar;
        p166t3.i iVar = this.f6820d;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i3 = fVar.f6809k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fVar.f6809k = i3 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        f fVar2 = fVar;
        Object obj = fVar2.f6808i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = fVar2.f6809k;
        if (i9 == 0) {
            P.u0(obj);
            try {
                S2.h hVar = kVar2.f6836d;
                Object obj2 = hVar.f9254b;
                T2.h hVar2 = kVar2.f6837e;
                E2.g gVar = kVar2.f6838f;
                o oVarK = this.f6819c.K(hVar, hVar2);
                T2.g gVar2 = oVarK.f9286c;
                List list = this.f6817a.f2820c.f2776b;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    p070h6.k kVar3 = (p070h6.k) list.get(i10);
                    M2.a aVar2 = (M2.a) kVar3.f22539h;
                    if (((InterfaceC0331d) kVar3.f22540i).i(obj2)) {
                        m.c(aVar2, "null cannot be cast to non-null type coil3.map.Mapper<kotlin.Any, *>");
                        E2.C cA = aVar2.a(obj2, oVarK);
                        if (cA != null) {
                            obj2 = cA;
                        }
                    }
                }
                N2.a aVarS = iVar.s(hVar, obj2, oVarK, gVar);
                N2.b bVarO = aVarS != null ? iVar.o(hVar, aVarS, hVar2, gVar2) : null;
                if (bVarO == null) {
                    p100l6.h hVar3 = hVar.g;
                    g gVar3 = new g(this, hVar, obj2, oVarK, gVar, aVarS, kVar2, null);
                    fVar2.f6807h = kVar2;
                    fVar2.f6809k = 1;
                    Object objK = C.K(hVar3, gVar3, fVar2);
                    return objK == aVar ? aVar : objK;
                }
                Map map = bVarO.f7303b;
                l lVar = bVarO.f7302a;
                H2.h hVar4 = H2.h.f3886h;
                Object obj3 = map.get("coil#disk_cache_key");
                String str = obj3 instanceof String ? (String) obj3 : null;
                Object obj4 = map.get("coil#is_sampled");
                Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
                return new S2.q(lVar, hVar, hVar4, aVarS, str, bool != null ? bool.booleanValue() : false, kVar2.g);
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k kVar4 = fVar2.f6807h;
            try {
                P.u0(obj);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                kVar2 = kVar4;
            }
        }
        if (th instanceof CancellationException) {
            throw th;
        }
        return C2.a.b(kVar2.f6836d, th);
    }
}
