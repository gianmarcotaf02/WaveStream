package p035d7;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f21285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f21286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f21287c = new java.util.ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p070h6.k f21288d = new p070h6.k("V", null);

    public o(S2.a aVar, java.lang.String str, java.lang.String str2) {
        this.f21285a = str;
        this.f21286b = str2;
    }

    public final void a(java.lang.String type, p035d7.d... dVarArr) {
        p035d7.r rVar;
        kotlin.jvm.internal.m.e(type, "type");
        java.util.ArrayList arrayList = this.f21287c;
        if (dVarArr.length == 0) {
            rVar = null;
        } else {
            N7.r rVar2 = new N7.r(2, new p077i5.C2237d(1, dVarArr));
            int iI0 = p078i6.D.I0(p078i6.q.I0(rVar2, 10));
            if (iI0 < 16) {
                iI0 = 16;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iI0);
            java.util.Iterator it = rVar2.iterator();
            while (true) {
                N7.d dVar = (N7.d) it;
                if (!dVar.j.hasNext()) {
                    break;
                }
                p078i6.z zVar = (p078i6.z) dVar.next();
                linkedHashMap.put(java.lang.Integer.valueOf(zVar.f23208a), (p035d7.d) zVar.f23209b);
            }
            rVar = new p035d7.r(linkedHashMap);
        }
        arrayList.add(new p070h6.k(type, rVar));
    }

    public final void b(java.lang.String type, p035d7.d... dVarArr) {
        kotlin.jvm.internal.m.e(type, "type");
        N7.r rVar = new N7.r(2, new p077i5.C2237d(1, dVarArr));
        int iI0 = p078i6.D.I0(p078i6.q.I0(rVar, 10));
        if (iI0 < 16) {
            iI0 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iI0);
        java.util.Iterator it = rVar.iterator();
        while (true) {
            N7.d dVar = (N7.d) it;
            if (!dVar.j.hasNext()) {
                this.f21288d = new p070h6.k(type, new p035d7.r(linkedHashMap));
                return;
            } else {
                p078i6.z zVar = (p078i6.z) dVar.next();
                linkedHashMap.put(java.lang.Integer.valueOf(zVar.f23208a), (p035d7.d) zVar.f23209b);
            }
        }
    }

    public final void c(p169t7.c type) {
        kotlin.jvm.internal.m.e(type, "type");
        java.lang.String strC = type.c();
        kotlin.jvm.internal.m.d(strC, "getDesc(...)");
        this.f21288d = new p070h6.k(strC, null);
    }
}
