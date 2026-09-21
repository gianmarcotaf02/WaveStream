package P5;

/* JADX INFO: loaded from: classes4.dex */
public final class g {
    private static final P5.a Companion = new P5.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final S1.e f8156e = E6.G.Q("last_seen_whats_new_version");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f8157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f8158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V7.n0 f8159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V7.W f8160d;

    public g(android.content.Context context, p132p5.a appConfig) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        this.f8157a = context;
        this.f8158b = O7.q.l1("3.0", '-');
        V7.n0 n0VarB = V7.r.b(null);
        this.f8159c = n0VarB;
        this.f8160d = new V7.W(n0VarB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(p117n6.c cVar) {
        P5.b bVar;
        P5.g gVar;
        if (cVar instanceof P5.b) {
            bVar = (P5.b) cVar;
            int i3 = bVar.f8146k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.f8146k = i3 - Integer.MIN_VALUE;
            } else {
                bVar = new P5.b(this, cVar);
            }
        } else {
            bVar = new P5.b(this, cVar);
        }
        java.lang.Object obj = bVar.f8145i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = bVar.f8146k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            bVar.f8144h = this;
            bVar.f8146k = 1;
            if (d(bVar) == aVar) {
                return aVar;
            }
            gVar = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = bVar.f8144h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        gVar.f8159c.h(null);
        return p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object c(p117n6.c cVar) {
        P5.e eVar;
        P5.g gVar;
        boolean zA;
        if (cVar instanceof P5.e) {
            eVar = (P5.e) cVar;
            int i3 = eVar.f8153k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eVar.f8153k = i3 - Integer.MIN_VALUE;
            } else {
                eVar = new P5.e(this, cVar);
            }
        } else {
            eVar = new P5.e(this, cVar);
        }
        java.lang.Object objO = eVar.f8152i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = eVar.f8153k;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objO);
            if (this.f8159c.getValue() == null) {
                P5.d dVar = new P5.d(((O1.InterfaceC0744h) P5.h.f8162b.getValue(this.f8157a, P5.h.f8161a[0])).getData(), 0);
                eVar.f8151h = this;
                eVar.f8153k = 1;
                objO = V7.r.o(dVar, eVar);
                if (objO != aVar) {
                    gVar = this;
                }
                return aVar;
            }
            return a2;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objO);
            return a2;
        }
        gVar = eVar.f8151h;
        com.google.common.util.concurrent.P.u0(objO);
        java.lang.String str = (java.lang.String) objO;
        if (!kotlin.jvm.internal.m.a(str, gVar.f8158b)) {
            p043e5.h hVar = p043e5.h.f21437h;
            java.lang.String current = gVar.f8158b;
            kotlin.jvm.internal.m.e(current, "current");
            java.util.List list = p043e5.c.f21424a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (true) {
                p043e5.e eVar2 = null;
                fVar = null;
                p043e5.f fVar = null;
                if (!it.hasNext()) {
                    break;
                }
                p043e5.e eVar3 = (p043e5.e) it.next();
                eVar3.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : eVar3.f21431b) {
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
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList) {
                p043e5.e eVar4 = (p043e5.e) obj2;
                if (com.google.common.util.concurrent.AbstractC1903s.o(eVar4.f21430a, current) > 0) {
                    zA = false;
                } else {
                    java.lang.String str2 = eVar4.f21430a;
                    if (str == null) {
                        zA = kotlin.jvm.internal.m.a(str2, current);
                    } else if (com.google.common.util.concurrent.AbstractC1903s.o(str2, str) > 0) {
                        zA = true;
                    } else {
                        zA = false;
                    }
                }
                if (zA) {
                    arrayList3.add(obj2);
                }
            }
            java.util.List listI1 = p078i6.o.I1(arrayList3, new S4.B(9, new p011b1.y(10)));
            if (!listI1.isEmpty()) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList(p078i6.q.I0(listI1, 10));
                java.util.Iterator it2 = listI1.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((p043e5.e) it2.next()).f21430a);
                }
                android.util.Log.i("TvWhatsNew", "showing " + arrayList4 + " (lastSeen=" + str + ", current=" + current + ")");
                p043e5.b bVar = new p043e5.b(listI1);
                V7.n0 n0Var = gVar.f8159c;
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

    public final java.lang.Object d(p117n6.c cVar) {
        java.lang.Object objM = E8.d.M((O1.InterfaceC0744h) P5.h.f8162b.getValue(this.f8157a, P5.h.f8161a[0]), new P5.f(this, null), cVar);
        return objM == p109m6.a.f25430h ? objM : p070h6.A.f22523a;
    }
}
