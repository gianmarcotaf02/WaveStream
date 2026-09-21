package P5;

import E6.G;
import O1.InterfaceC0744h;
import O7.q;
import S4.B;
import V7.W;
import V7.n0;
import V7.r;
import android.content.Context;
import android.util.Log;
import com.google.common.util.concurrent.AbstractC1903s;
import com.google.common.util.concurrent.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import p011b1.y;
import p070h6.A;
import p078i6.o;

public final class g {
    private static final a Companion = new a();

    public static final S1.e f8156e = G.Q("last_seen_whats_new_version");

    public final Context f8157a;

    public final String f8158b;

    public final n0 f8159c;

    public final W f8160d;

    public g(Context context, p132p5.a appConfig) {
        m.e(context, "context");
        m.e(appConfig, "appConfig");
        this.f8157a = context;
        this.f8158b = q.l1("3.0", '-');
        n0 n0VarB = r.b(null);
        this.f8159c = n0VarB;
        this.f8160d = new W(n0VarB);
    }

    public final Object b(p117n6.c cVar) {
        b bVar;
        g gVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i3 = bVar.f8146k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.f8146k = i3 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.f8145i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = bVar.f8146k;
        if (i9 == 0) {
            P.u0(obj);
            bVar.f8144h = this;
            bVar.f8146k = 1;
            if (d(bVar) == aVar) {
                return aVar;
            }
            gVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = bVar.f8144h;
            P.u0(obj);
        }
        gVar.f8159c.h(null);
        return A.f22523a;
    }

    public final Object c(p117n6.c cVar) {
        e eVar;
        g gVar;
        boolean zA;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i3 = eVar.f8153k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eVar.f8153k = i3 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objO = eVar.f8152i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = eVar.f8153k;
        A a2 = A.f22523a;
        if (i9 == 0) {
            P.u0(objO);
            if (this.f8159c.getValue() == null) {
                d dVar = new d(((InterfaceC0744h) h.f8162b.getValue(this.f8157a, h.f8161a[0])).getData(), 0);
                eVar.f8151h = this;
                eVar.f8153k = 1;
                objO = r.o(dVar, eVar);
                if (objO != aVar) {
                    gVar = this;
                }
                return aVar;
            }
            return a2;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(objO);
            return a2;
        }
        gVar = eVar.f8151h;
        P.u0(objO);
        String str = (String) objO;
        if (!m.a(str, gVar.f8158b)) {
            p043e5.h hVar = p043e5.h.f21437h;
            String current = gVar.f8158b;
            m.e(current, "current");
            List list = p043e5.c.f21424a;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                p043e5.e eVar2 = null;
                fVar = null;
                p043e5.f fVar = null;
                if (!it.hasNext()) {
                    break;
                }
                p043e5.e eVar3 = (p043e5.e) it.next();
                eVar3.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : eVar3.f21431b) {
                    if (((p043e5.a) obj).f21422d.contains(hVar)) {
                        arrayList2.add(obj);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    p043e5.f fVar2 = eVar3.f21432c;
                    if (fVar2 != null && fVar2.f21435c.contains(hVar)) {
                        fVar = fVar2;
                    }
                    eVar2 = new p043e5.e(eVar3.f21430a, arrayList2, fVar);
                }
                if (eVar2 != null) {
                    arrayList.add(eVar2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                p043e5.e eVar4 = (p043e5.e) obj2;
                if (AbstractC1903s.o(eVar4.f21430a, current) > 0) {
                    zA = false;
                } else {
                    String str2 = eVar4.f21430a;
                    if (str == null) {
                        zA = m.a(str2, current);
                    } else if (AbstractC1903s.o(str2, str) > 0) {
                        zA = true;
                    } else {
                        zA = false;
                    }
                }
                if (zA) {
                    arrayList3.add(obj2);
                }
            }
            List listI1 = o.I1(arrayList3, new B(9, new y(10)));
            if (!listI1.isEmpty()) {
                ArrayList arrayList4 = new ArrayList(p078i6.q.I0(listI1, 10));
                Iterator it2 = listI1.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((p043e5.e) it2.next()).f21430a);
                }
                Log.i("TvWhatsNew", "showing " + arrayList4 + " (lastSeen=" + str + ", current=" + current + ")");
                p043e5.b bVar = new p043e5.b(listI1);
                n0 n0Var = gVar.f8159c;
                n0Var.getClass();
                n0Var.i(null, bVar);
                return a2;
            }
            eVar.f8151h = null;
            eVar.f8153k = 2;
            if (gVar.d(eVar) == aVar) {
                return aVar;
            }
        }
        return a2;
    }

    public final Object d(p117n6.c cVar) {
        Object objM = E8.d.M((InterfaceC0744h) h.f8162b.getValue(this.f8157a, h.f8161a[0]), new f(this, null), cVar);
        return objM == p109m6.a.f25430h ? objM : A.f22523a;
    }
}
