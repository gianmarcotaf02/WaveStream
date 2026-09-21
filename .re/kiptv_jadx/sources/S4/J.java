package S4;

/* JADX INFO: loaded from: classes.dex */
public final class J {
    public static final S4.G Companion = new S4.G();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p070h6.p f9324d = com.google.common.util.concurrent.D.B(new C5.r(22));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p028c8.d f9325a = new p028c8.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashMap f9326b = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.LinkedHashMap f9327c = new java.util.LinkedHashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(int i3, java.util.List list, p117n6.c cVar) {
        S4.H h9;
        java.util.LinkedHashMap linkedHashMap;
        p028c8.d dVar;
        S4.J j;
        kotlin.jvm.internal.y yVar;
        if (cVar instanceof S4.H) {
            h9 = (S4.H) cVar;
            int i9 = h9.f9317o;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                h9.f9317o = i9 - Integer.MIN_VALUE;
            } else {
                h9 = new S4.H(this, cVar);
            }
        } else {
            h9 = new S4.H(this, cVar);
        }
        java.lang.Object obj = h9.f9315m;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = h9.f9317o;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            linkedHashMap = new java.util.LinkedHashMap();
            kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
            yVar2.f24555h = 1;
            java.util.Iterator it = p078i6.o.I1(list, new C5.O1(16)).iterator();
            while (it.hasNext()) {
                java.util.List list2 = ((com.kiptv.core.model.TMDBSeasonDetail) it.next()).f20312f;
                if (list2 != null) {
                    java.util.Iterator it2 = p078i6.o.I1(list2, new C5.O1(17)).iterator();
                    while (it2.hasNext()) {
                        linkedHashMap.put(new java.lang.Integer(yVar2.f24555h), (com.kiptv.core.model.TMDBEpisode) it2.next());
                        yVar2.f24555h++;
                    }
                }
            }
            h9.f9311h = this;
            h9.f9312i = linkedHashMap;
            h9.j = yVar2;
            dVar = this.f9325a;
            h9.f9313k = dVar;
            h9.f9314l = i3;
            h9.f9317o = 1;
            if (dVar.e(h9) == aVar) {
                return aVar;
            }
            j = this;
            yVar = yVar2;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = h9.f9314l;
            dVar = h9.f9313k;
            yVar = h9.j;
            linkedHashMap = h9.f9312i;
            j = h9.f9311h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        try {
            j.f9326b.put(new java.lang.Integer(i3), linkedHashMap);
            j.f9327c.put(new java.lang.Integer(i3), new java.lang.Integer(yVar.f24555h - 1));
            return linkedHashMap;
        } finally {
            dVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(int i3, int i9, p117n6.c cVar) {
        S4.I i10;
        S4.J j;
        p028c8.d dVar;
        if (cVar instanceof S4.I) {
            i10 = (S4.I) cVar;
            int i11 = i10.f9323n;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                i10.f9323n = i11 - Integer.MIN_VALUE;
            } else {
                i10 = new S4.I(this, cVar);
            }
        } else {
            i10 = new S4.I(this, cVar);
        }
        java.lang.Object obj = i10.f9321l;
        p109m6.a aVar = p109m6.a.f25430h;
        int i12 = i10.f9323n;
        if (i12 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            i10.f9318h = this;
            p028c8.d dVar2 = this.f9325a;
            i10.f9319i = dVar2;
            i10.j = i3;
            i10.f9320k = i9;
            i10.f9323n = 1;
            if (dVar2.e(i10) == aVar) {
                return aVar;
            }
            j = this;
            dVar = dVar2;
        } else {
            if (i12 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i9 = i10.f9320k;
            i3 = i10.j;
            dVar = i10.f9319i;
            j = i10.f9318h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        try {
            java.util.Map map = (java.util.Map) j.f9326b.get(new java.lang.Integer(i3));
            return map != null ? (com.kiptv.core.model.TMDBEpisode) map.get(new java.lang.Integer(i9)) : null;
        } finally {
            dVar.g(null);
        }
    }
}
