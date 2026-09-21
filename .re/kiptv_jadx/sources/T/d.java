package T;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f9641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p011b1.M f9642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p048f1.h f9643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9646f;
    public int g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public O0.InterfaceC0728q f9648i;
    public p011b1.C1644a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9649k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f9650l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public T.b f9651m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p011b1.s f9652n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p113n1.n f9653o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f9657s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f9647h = T.a.f9630a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f9654p = p113n1.b.h(0, 0, 0, 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9655q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9656r = -1;

    public d(java.lang.String str, p011b1.M m8, p048f1.h hVar, int i3, boolean z6, int i9, int i10) {
        this.f9641a = str;
        this.f9642b = m8;
        this.f9643c = hVar;
        this.f9644d = i3;
        this.f9645e = z6;
        this.f9646f = i9;
        this.g = i10;
        long j = 0;
        this.f9650l = (j & 4294967295L) | (j << 32);
    }

    public static long f(T.d dVar, long j, p113n1.n nVar) {
        int i3;
        p011b1.M m8 = dVar.f9642b;
        T.b bVar = dVar.f9651m;
        O0.InterfaceC0728q interfaceC0728q = dVar.f9648i;
        kotlin.jvm.internal.m.b(interfaceC0728q);
        p048f1.h hVar = dVar.f9643c;
        if ((bVar == null || nVar != bVar.f9633a || !p011b1.D.h(m8, nVar).equals(bVar.f9634b) || interfaceC0728q.getDensity() != bVar.f9635c.f25548h || hVar != bVar.f9636d) && ((bVar = T.b.f9632h) == null || nVar != bVar.f9633a || !p011b1.D.h(m8, nVar).equals(bVar.f9634b) || interfaceC0728q.getDensity() != bVar.f9635c.f25548h || hVar != bVar.f9636d)) {
            bVar = new T.b(nVar, p011b1.D.h(m8, nVar), new p113n1.d(interfaceC0728q.getDensity(), interfaceC0728q.S()), hVar);
            T.b.f9632h = bVar;
        }
        dVar.f9651m = bVar;
        int i9 = dVar.g;
        float f9 = bVar.g;
        float f10 = bVar.f9638f;
        if (java.lang.Float.isNaN(f9) || java.lang.Float.isNaN(f10)) {
            java.lang.String str = T.c.f9639a;
            long jB = p113n1.b.b(0, 0, 15);
            p113n1.d dVar2 = bVar.f9635c;
            float fB = p011b1.D.a(str, bVar.f9637e, jB, dVar2, bVar.f9636d, 1, 96).b();
            float fB2 = p011b1.D.a(T.c.f9640b, bVar.f9637e, p113n1.b.b(0, 0, 15), dVar2, bVar.f9636d, 2, 96).b() - fB;
            bVar.g = fB;
            bVar.f9638f = fB2;
            f10 = fB2;
            f9 = fB;
        }
        if (i9 != 1) {
            int iRound = java.lang.Math.round((f10 * (i9 - 1)) + f9);
            i3 = iRound >= 0 ? iRound : 0;
            int iG = p113n1.a.g(j);
            if (i3 > iG) {
                i3 = iG;
            }
        } else {
            i3 = p113n1.a.i(j);
        }
        return p113n1.b.a(p113n1.a.j(j), p113n1.a.h(j), i3, p113n1.a.g(j));
    }

    public final int a(int i3, p113n1.n nVar) {
        int i9 = this.f9655q;
        int i10 = this.f9656r;
        if (i3 == i9 && i9 != -1) {
            return i10;
        }
        long jA = p113n1.b.a(0, i3, 0, androidx.media3.common.util.Log.LOG_LEVEL_OFF);
        if (this.g > 1) {
            jA = f(this, jA, nVar);
        }
        p011b1.s sVarE = e(nVar);
        long jU = E6.G.u(jA, this.f9645e, this.f9644d, sVarE.d());
        boolean z6 = this.f9645e;
        int i11 = this.f9644d;
        int i12 = this.f9646f;
        int iK = J.AbstractC0549n.k(new p011b1.C1644a((j1.c) sVarE, ((z6 || !(i11 == 2 || i11 == 4 || i11 == 5)) && i12 >= 1) ? i12 : 1, i11, jU).b());
        int i13 = p113n1.a.i(jA);
        if (iK < i13) {
            iK = i13;
        }
        this.f9655q = i3;
        this.f9656r = iK;
        return iK;
    }

    public final boolean b(long j, p113n1.n nVar) {
        p011b1.s sVar;
        this.f9657s = (this.f9657s << 2) | 3;
        boolean z6 = true;
        long jF = this.g > 1 ? f(this, j, nVar) : j;
        p011b1.C1644a c1644a = this.j;
        boolean z9 = false;
        if (c1644a != null && (sVar = this.f9652n) != null && !sVar.a() && nVar == this.f9653o && (p113n1.a.b(jF, this.f9654p) || (p113n1.a.h(jF) == p113n1.a.h(this.f9654p) && p113n1.a.j(jF) == p113n1.a.j(this.f9654p) && p113n1.a.g(jF) >= c1644a.b() && !c1644a.f17794d.f18471d))) {
            if (!p113n1.a.b(jF, this.f9654p)) {
                p011b1.C1644a c1644a2 = this.j;
                kotlin.jvm.internal.m.b(c1644a2);
                long jD = p113n1.b.d(jF, (((long) J.AbstractC0549n.k(java.lang.Math.min(c1644a2.f17791a.f23877p.c(), c1644a2.d()))) << 32) | (((long) J.AbstractC0549n.k(c1644a2.b())) & 4294967295L));
                this.f9650l = jD;
                if (this.f9644d == 3 || (((int) (jD >> 32)) >= c1644a2.d() && ((int) (4294967295L & jD)) >= c1644a2.b())) {
                    z6 = false;
                }
                this.f9649k = z6;
                this.f9654p = jF;
            }
            return false;
        }
        p011b1.s sVarE = e(nVar);
        long jU = E6.G.u(jF, this.f9645e, this.f9644d, sVarE.d());
        boolean z10 = this.f9645e;
        int i3 = this.f9644d;
        int i9 = this.f9646f;
        p011b1.C1644a c1644a3 = new p011b1.C1644a((j1.c) sVarE, ((z10 || !(i3 == 2 || i3 == 4 || i3 == 5)) && i9 >= 1) ? i9 : 1, i3, jU);
        this.f9654p = jF;
        long jD2 = p113n1.b.d(jF, (((long) J.AbstractC0549n.k(c1644a3.b())) & 4294967295L) | (((long) J.AbstractC0549n.k(c1644a3.d())) << 32));
        this.f9650l = jD2;
        if (this.f9644d != 3 && (((int) (jD2 >> 32)) < c1644a3.d() || ((int) (jD2 & 4294967295L)) < c1644a3.b())) {
            z9 = true;
        }
        this.f9649k = z9;
        this.j = c1644a3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.f9652n = null;
        this.f9653o = null;
        this.f9655q = -1;
        this.f9656r = -1;
        this.f9654p = p113n1.b.h(0, 0, 0, 0);
        long j = 0;
        this.f9650l = (j & 4294967295L) | (j << 32);
        this.f9649k = false;
    }

    public final void d(O0.InterfaceC0728q interfaceC0728q) {
        long jA;
        O0.InterfaceC0728q interfaceC0728q2 = this.f9648i;
        if (interfaceC0728q != null) {
            int i3 = T.a.f9631b;
            jA = T.a.a(interfaceC0728q.getDensity(), interfaceC0728q.S());
        } else {
            jA = T.a.f9630a;
        }
        if (interfaceC0728q2 == null) {
            this.f9648i = interfaceC0728q;
            this.f9647h = jA;
        } else if (interfaceC0728q == null || this.f9647h != jA) {
            this.f9648i = interfaceC0728q;
            this.f9647h = jA;
            this.f9657s = (this.f9657s << 2) | 1;
            c();
        }
    }

    public final p011b1.s e(p113n1.n nVar) {
        p011b1.s cVar = this.f9652n;
        if (cVar == null || nVar != this.f9653o || cVar.a()) {
            this.f9653o = nVar;
            java.lang.String str = this.f9641a;
            p011b1.M mH = p011b1.D.h(this.f9642b, nVar);
            p078i6.w wVar = p078i6.w.f23205h;
            O0.InterfaceC0728q interfaceC0728q = this.f9648i;
            kotlin.jvm.internal.m.b(interfaceC0728q);
            cVar = new j1.c(str, mH, wVar, wVar, this.f9643c, interfaceC0728q);
        }
        this.f9652n = cVar;
        return cVar;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((java.lang.Object) T.a.b(this.f9647h));
        sb.append(", history=");
        return Y6.f.g(this.f9657s, ", constraints=$)", sb);
    }
}
