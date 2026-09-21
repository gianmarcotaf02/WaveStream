package p121o0;

/* JADX INFO: loaded from: classes.dex */
public class b extends p121o0.f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f25962n = new int[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p194x6.j f25963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p194x6.j f25964f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p136q.I f25965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f25966i;
    public p121o0.j j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f25967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f25968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f25969m;

    public b(long j, p121o0.j jVar, p194x6.j jVar2, p194x6.j jVar3) {
        super(j, jVar);
        this.f25963e = jVar2;
        this.f25964f = jVar3;
        this.j = p121o0.j.f25987l;
        this.f25967k = f25962n;
        this.f25968l = 1;
    }

    public final void A(long j) {
        synchronized (p121o0.k.f25993c) {
            this.j = this.j.p(j);
        }
    }

    public void B(p136q.I i3) {
        this.f25965h = i3;
    }

    public p121o0.b C(p194x6.j jVar, p194x6.j jVar2) throws java.lang.Throwable {
        if (this.f25978c) {
            p020c0.AbstractC1693m0.a("Cannot use a disposed snapshot");
        }
        if (this.f25969m && this.f25979d < 0) {
            p020c0.AbstractC1693m0.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        java.lang.Object obj = p121o0.k.f25993c;
        synchronized (obj) {
            try {
                long j = p121o0.k.f25995e;
                long j9 = 1;
                p121o0.k.f25995e = j + j9;
                p121o0.k.f25994d = p121o0.k.f25994d.p(j);
                p121o0.j jVarD = d();
                r(jVarD.p(j));
                try {
                    p121o0.c cVar = new p121o0.c(j, p121o0.k.d(jVarD, g() + j9, j), p121o0.k.k(true, jVar, e()), p121o0.k.l(jVar2, i()), this);
                    if (this.f25969m || this.f25978c) {
                        return cVar;
                    }
                    long jG = g();
                    synchronized (obj) {
                        long j10 = p121o0.k.f25995e;
                        p121o0.k.f25995e = j10 + j9;
                        s(j10);
                        p121o0.k.f25994d = p121o0.k.f25994d.p(g());
                    }
                    r(p121o0.k.d(d(), jG + j9, g()));
                    return cVar;
                } catch (java.lang.Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // p121o0.f
    public final void b() {
        p121o0.k.f25994d = p121o0.k.f25994d.e(g()).d(this.j);
    }

    @Override // p121o0.f
    public void c() {
        if (this.f25978c) {
            return;
        }
        this.f25978c = true;
        synchronized (p121o0.k.f25993c) {
            o();
        }
        l();
    }

    @Override // p121o0.f
    public boolean f() {
        return false;
    }

    @Override // p121o0.f
    public int h() {
        return this.g;
    }

    @Override // p121o0.f
    public p194x6.j i() {
        return this.f25964f;
    }

    @Override // p121o0.f
    public void k() {
        this.f25968l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // p121o0.f
    public void l() {
        if (this.f25968l <= 0) {
            p020c0.AbstractC1693m0.a("no pending nested snapshots");
        }
        int i3 = this.f25968l - 1;
        this.f25968l = i3;
        if (i3 != 0 || this.f25969m) {
            return;
        }
        p136q.I iX = x();
        if (iX != null) {
            if (this.f25969m) {
                p020c0.AbstractC1693m0.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            java.lang.Object[] objArr = iX.f26329b;
            long[] jArr = iX.f26328a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i9 = 0;
                while (true) {
                    long j = jArr[i9];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i9 != length) {
                            break;
                            break;
                        }
                        i9++;
                    } else {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j) < 128) {
                                for (p121o0.v vVarD = ((p121o0.t) objArr[(i9 << 3) + i11]).d(); vVarD != null; vVarD = vVarD.f26027b) {
                                    long j9 = vVarD.f26026a;
                                    if (j9 == jG || p078i6.o.b1(this.j, java.lang.Long.valueOf(j9))) {
                                        p108m5.c cVar = p121o0.k.f25991a;
                                        vVarD.f26026a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        } else if (i9 != length) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // p121o0.f
    public void m() {
        if (this.f25969m || this.f25978c) {
            return;
        }
        v();
    }

    @Override // p121o0.f
    public void n(p121o0.t tVar) {
        p136q.I iX = x();
        if (iX == null) {
            p136q.I i3 = p136q.Q.f26352a;
            iX = new p136q.I();
            B(iX);
        }
        iX.a(tVar);
    }

    @Override // p121o0.f
    public final void p() {
        int length = this.f25967k.length;
        for (int i3 = 0; i3 < length; i3++) {
            p121o0.k.u(this.f25967k[i3]);
        }
        o();
    }

    @Override // p121o0.f
    public void t(int i3) {
        this.g = i3;
    }

    @Override // p121o0.f
    public p121o0.f u(p194x6.j jVar) throws java.lang.Throwable {
        if (this.f25978c) {
            p020c0.AbstractC1693m0.a("Cannot use a disposed snapshot");
        }
        if (this.f25969m && this.f25979d < 0) {
            p020c0.AbstractC1693m0.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        boolean z6 = this instanceof p121o0.a;
        A(g());
        java.lang.Object obj = p121o0.k.f25993c;
        synchronized (obj) {
            try {
                long j = p121o0.k.f25995e;
                long j9 = 1;
                p121o0.k.f25995e = j + j9;
                p121o0.k.f25994d = p121o0.k.f25994d.p(j);
                try {
                    p121o0.d dVar = new p121o0.d(j, p121o0.k.d(d(), jG + j9, j), p121o0.k.k(true, jVar, e()), this);
                    if (this.f25969m || this.f25978c) {
                        return dVar;
                    }
                    long jG2 = g();
                    synchronized (obj) {
                        long j10 = p121o0.k.f25995e;
                        p121o0.k.f25995e = j10 + j9;
                        s(j10);
                        p121o0.k.f25994d = p121o0.k.f25994d.p(g());
                    }
                    r(p121o0.k.d(d(), jG2 + j9, g()));
                    return dVar;
                } catch (java.lang.Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
    }

    public final void v() {
        long j;
        A(g());
        if (this.f25969m || this.f25978c) {
            return;
        }
        long jG = g();
        synchronized (p121o0.k.f25993c) {
            long j9 = p121o0.k.f25995e;
            j = 1;
            p121o0.k.f25995e = j9 + j;
            s(j9);
            p121o0.k.f25994d = p121o0.k.f25994d.p(g());
        }
        r(p121o0.k.d(d(), jG + j, g()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014a A[EDGE_INSN: B:101:0x014a->B:77:0x014a BREAK  A[LOOP:4: B:66:0x011b->B:76:0x0147], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0108 A[Catch: all -> 0x00fe, LOOP:2: B:48:0x00d6->B:60:0x0108, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0147 A[Catch: all -> 0x00fe, LOOP:4: B:66:0x011b->B:76:0x0147, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:96:0x010f A[EDGE_INSN: B:96:0x010f->B:62:0x010f BREAK  A[LOOP:2: B:48:0x00d6->B:60:0x0108], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection, java.util.List] */
    public p121o0.o w() {
        java.util.HashMap mapB;
        ?? r9;
        p136q.I i3;
        long j;
        long j9;
        p136q.I iX = x();
        if (iX != null) {
            long j10 = p121o0.k.j.f25977b;
            mapB = p121o0.k.b(j10, this, p121o0.k.f25994d.e(j10));
        } else {
            mapB = null;
        }
        p078i6.w wVar = p078i6.w.f23205h;
        synchronized (p121o0.k.f25993c) {
            try {
                p121o0.k.c(this);
                if (iX == null || iX.f26331d == 0) {
                    b();
                    p121o0.a aVar = p121o0.k.j;
                    p136q.I i9 = aVar.f25965h;
                    p121o0.k.v(aVar, p121o0.k.f25991a);
                    if (i9 == null || !i9.h()) {
                        r9 = wVar;
                        i3 = null;
                    } else {
                        r9 = p121o0.k.f25997h;
                        i3 = i9;
                    }
                } else {
                    p121o0.a aVar2 = p121o0.k.j;
                    p121o0.o oVarZ = z(p121o0.k.f25995e, iX, mapB, p121o0.k.f25994d.e(aVar2.f25977b));
                    if (!oVarZ.equals(p121o0.h.f25981b)) {
                        return oVarZ;
                    }
                    b();
                    i3 = aVar2.f25965h;
                    p121o0.k.v(aVar2, p121o0.k.f25991a);
                    B(null);
                    aVar2.f25965h = null;
                    r9 = p121o0.k.f25997h;
                }
                this.f25969m = true;
                if (i3 != null) {
                    p038e0.h hVar = new p038e0.h(i3);
                    if (!i3.g()) {
                        int size = r9.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ((p194x6.m) r9.get(i10)).invoke(hVar, this);
                        }
                    }
                }
                if (iX != null && iX.h()) {
                    p038e0.h hVar2 = new p038e0.h(iX);
                    int size2 = r9.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((p194x6.m) r9.get(i11)).invoke(hVar2, this);
                    }
                }
                synchronized (p121o0.k.f25993c) {
                    try {
                        p();
                        p121o0.k.f();
                        if (i3 != null) {
                            java.lang.Object[] objArr = i3.f26329b;
                            long[] jArr = i3.f26328a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i12 = 0;
                                j = 128;
                                while (true) {
                                    long j11 = jArr[i12];
                                    j9 = 255;
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                p121o0.k.q((p121o0.t) objArr[(i12 << 3) + i14]);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                        if (i12 != length) {
                                            break;
                                        }
                                        i12++;
                                    }
                                }
                            } else {
                                j = 128;
                                j9 = 255;
                            }
                        } else {
                            j = 128;
                            j9 = 255;
                        }
                        if (iX != null) {
                            java.lang.Object[] objArr2 = iX.f26329b;
                            long[] jArr2 = iX.f26328a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j12 = jArr2[i15];
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i15 != length2) {
                                            break;
                                            break;
                                        }
                                        i15++;
                                    } else {
                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            if ((j12 & j9) < j) {
                                                p121o0.k.q((p121o0.t) objArr2[(i15 << 3) + i17]);
                                            }
                                            j12 >>= 8;
                                        }
                                        if (i16 != 8) {
                                            break;
                                        }
                                        if (i15 != length2) {
                                            break;
                                        }
                                        i15++;
                                    }
                                }
                            }
                        }
                        java.util.ArrayList arrayList = this.f25966i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i18 = 0; i18 < size3; i18++) {
                                p121o0.k.q((p121o0.t) arrayList.get(i18));
                            }
                        }
                        this.f25966i = null;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                return p121o0.h.f25981b;
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    public p136q.I x() {
        return this.f25965h;
    }

    @Override // p121o0.f
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public p194x6.j e() {
        return this.f25963e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0173  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a9 A[LOOP:3: B:79:0x01a7->B:80:0x01a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:88:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final p121o0.o z(long j, p136q.I i3, java.util.HashMap map, p121o0.j jVar) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayListA1;
        java.util.ArrayList arrayList2;
        int size;
        int i9;
        java.util.ArrayList arrayList3;
        int size2;
        int i10;
        p121o0.t tVar;
        p121o0.v vVar;
        p121o0.j jVar2;
        java.lang.Object[] objArr;
        long[] jArr;
        p121o0.j jVar3;
        java.lang.Object[] objArr2;
        long[] jArr2;
        int i11;
        long j9;
        java.util.ArrayList arrayList4;
        p121o0.v vVarN;
        p121o0.j jVarO = d().p(g()).o(this.j);
        java.lang.Object[] objArr3 = i3.f26329b;
        long[] jArr3 = i3.f26328a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i12 = 0;
            arrayList2 = null;
            arrayListA1 = null;
            while (true) {
                long j10 = jArr3[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j10 & 255) < 128) {
                            objArr2 = objArr3;
                            p121o0.t tVar2 = (p121o0.t) objArr3[(i12 << 3) + i14];
                            jArr2 = jArr3;
                            p121o0.v vVarD = tVar2.d();
                            i11 = i14;
                            java.util.ArrayList arrayList5 = arrayList2;
                            p121o0.v vVarS = p121o0.k.s(vVarD, j, jVar);
                            if (vVarS == null) {
                                jVar3 = jVarO;
                                arrayList4 = arrayListA1;
                                j9 = j10;
                            } else {
                                arrayList4 = arrayListA1;
                                j9 = j10;
                                p121o0.v vVarS2 = p121o0.k.s(vVarD, g(), jVarO);
                                if (vVarS2 == null) {
                                    jVar3 = jVarO;
                                } else {
                                    jVar3 = jVarO;
                                    if (vVarS2.f26026a != 1 && !vVarS.equals(vVarS2)) {
                                        p121o0.v vVarS3 = p121o0.k.s(vVarD, g(), d());
                                        if (vVarS3 == null) {
                                            p121o0.k.r();
                                            throw null;
                                        }
                                        if (map == null || (vVarN = (p121o0.v) map.get(vVarS)) == null) {
                                            vVarN = tVar2.n(vVarS2, vVarS, vVarS3);
                                        }
                                        if (vVarN == null) {
                                            return new p121o0.g(this);
                                        }
                                        if (!vVarN.equals(vVarS3)) {
                                            if (vVarN.equals(vVarS)) {
                                                java.util.ArrayList arrayList6 = arrayList5 == null ? new java.util.ArrayList() : arrayList5;
                                                arrayList6.add(new p070h6.k(tVar2, vVarS.b(g())));
                                                arrayListA1 = arrayList4 == null ? new java.util.ArrayList() : arrayList4;
                                                arrayListA1.add(tVar2);
                                                arrayList2 = arrayList6;
                                            } else {
                                                arrayList2 = arrayList5 == null ? new java.util.ArrayList() : arrayList5;
                                                arrayList2.add(!vVarN.equals(vVarS2) ? new p070h6.k(tVar2, vVarN) : new p070h6.k(tVar2, vVarS2.b(g())));
                                            }
                                        }
                                        arrayListA1 = arrayList4;
                                    }
                                }
                            }
                            arrayList2 = arrayList5;
                            arrayListA1 = arrayList4;
                        } else {
                            jVar3 = jVarO;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i11 = i14;
                            j9 = j10;
                        }
                        j10 = j9 >> 8;
                        i14 = i11 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        jVarO = jVar3;
                    }
                    jVar2 = jVarO;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i13 != 8) {
                        break;
                    }
                } else {
                    jVar2 = jVarO;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i12 != length) {
                    i12++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    jVarO = jVar2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i10 = 0; i10 < size2; i10++) {
                    p070h6.k kVar = (p070h6.k) arrayList2.get(i10);
                    tVar = (p121o0.t) kVar.f22539h;
                    vVar = (p121o0.v) kVar.f22540i;
                    vVar.f26026a = j;
                    synchronized (p121o0.k.f25993c) {
                        vVar.f26027b = tVar.d();
                        tVar.e(vVar);
                    }
                }
            }
            if (arrayListA1 != null) {
                size = arrayListA1.size();
                for (i9 = 0; i9 < size; i9++) {
                    i3.l((p121o0.t) arrayListA1.get(i9));
                }
                arrayList3 = this.f25966i;
                if (arrayList3 != null) {
                    arrayListA1 = p078i6.o.A1(arrayList3, arrayListA1);
                }
                this.f25966i = arrayListA1;
            }
            return p121o0.h.f25981b;
        }
        arrayList = null;
        arrayListA1 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i10 < size2) {
                p070h6.k kVar2 = (p070h6.k) arrayList2.get(i10);
                tVar = (p121o0.t) kVar2.f22539h;
                vVar = (p121o0.v) kVar2.f22540i;
                vVar.f26026a = j;
                synchronized (p121o0.k.f25993c) {
                    vVar.f26027b = tVar.d();
                    tVar.e(vVar);
                }
            }
        }
        if (arrayListA1 != null) {
            size = arrayListA1.size();
            while (i9 < size) {
                i3.l((p121o0.t) arrayListA1.get(i9));
            }
            arrayList3 = this.f25966i;
            if (arrayList3 != null) {
                arrayListA1 = p078i6.o.A1(arrayList3, arrayListA1);
            }
            this.f25966i = arrayListA1;
        }
        return p121o0.h.f25981b;
    }
}
