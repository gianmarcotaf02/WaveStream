package p121o0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p194x6.j f26014a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26016c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k3.h f26020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p121o0.q f26021i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f26015b = new java.util.concurrent.atomic.AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B.d0 f26017d = new B.d0(21, this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p078i6.C2255f f26018e = new p078i6.C2255f(17, this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p038e0.e f26019f = new p038e0.e(new p121o0.q[16]);
    public final java.lang.Object g = new java.lang.Object();
    public long j = -1;

    public r(p194x6.j jVar) {
        this.f26014a = jVar;
    }

    public final void a() {
        synchronized (this.g) {
            p038e0.e eVar = this.f26019f;
            java.lang.Object[] objArr = eVar.f21324h;
            int i3 = eVar.j;
            for (int i9 = 0; i9 < i3; i9++) {
                p121o0.q qVar = (p121o0.q) objArr[i9];
                qVar.f26007e.a();
                qVar.f26008f.a();
                qVar.f26012l.a();
                qVar.f26013m.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0073 A[Catch: all -> 0x0090, LOOP:1: B:12:0x002e->B:23:0x0073, LOOP_END, TryCatch #0 {all -> 0x0090, blocks: (B:4:0x0007, B:6:0x000f, B:24:0x007a, B:26:0x0082, B:31:0x0092, B:28:0x0087, B:9:0x0022, B:12:0x002e, B:14:0x0043, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:23:0x0073, B:32:0x0098), top: B:37:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x007a A[EDGE_INSN: B:44:0x007a->B:24:0x007a BREAK  A[LOOP:1: B:12:0x002e->B:23:0x0073], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final void b(java.lang.Object obj) {
        int i3;
        synchronized (this.g) {
            try {
                p038e0.e eVar = this.f26019f;
                int i9 = eVar.j;
                int i10 = 0;
                int i11 = 0;
                while (i10 < i9) {
                    p121o0.q qVar = (p121o0.q) eVar.f21324h[i10];
                    p136q.C c9 = (p136q.C) qVar.f26008f.k(obj);
                    if (c9 == null) {
                        i3 = i10;
                    } else {
                        java.lang.Object[] objArr = c9.f26298b;
                        int[] iArr = c9.f26299c;
                        long[] jArr = c9.f26297a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i12 = 0;
                            while (true) {
                                long j = jArr[i12];
                                i3 = i10;
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        if ((j & 255) < 128) {
                                            int i15 = (i12 << 3) + i14;
                                            java.lang.Object obj2 = objArr[i15];
                                            int i16 = iArr[i15];
                                            qVar.c(obj, obj2);
                                        }
                                        j >>= 8;
                                    }
                                    if (i13 != 8) {
                                        break;
                                    }
                                    if (i12 != length) {
                                        break;
                                    }
                                    i12++;
                                    i10 = i3;
                                } else if (i12 != length) {
                                    break;
                                    break;
                                } else {
                                    i12++;
                                    i10 = i3;
                                }
                            }
                        } else {
                            i3 = i10;
                        }
                    }
                    if (!qVar.f26008f.j()) {
                        i11++;
                    } else if (i11 > 0) {
                        java.lang.Object[] objArr2 = eVar.f21324h;
                        objArr2[i3 - i11] = objArr2[i3];
                    }
                    i10 = i3 + 1;
                }
                int i17 = i9 - i11;
                java.util.Arrays.fill(eVar.f21324h, i17, i9, (java.lang.Object) null);
                eVar.j = i17;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z6;
        java.util.Set set;
        synchronized (this.g) {
            z6 = this.f26016c;
        }
        if (z6) {
            return false;
        }
        boolean z9 = false;
        while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.f26015b;
            java.lang.Object obj = atomicReference.get();
            java.util.Set set2 = null;
            java.lang.Object obj2 = null;
            java.lang.Object objSubList = null;
            if (obj != null) {
                if (obj instanceof java.util.Set) {
                    set = (java.util.Set) obj;
                } else {
                    if (!(obj instanceof java.util.List)) {
                        p020c0.AbstractC1705t.b("Unexpected notification");
                        throw new I3.b();
                    }
                    java.util.List list = (java.util.List) obj;
                    java.util.Set set3 = (java.util.Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set = set3;
                    obj2 = objSubList;
                }
                while (true) {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set2 = set;
                    } else if (atomicReference.get() != obj) {
                    }
                }
            }
            if (set2 == null) {
                return z9;
            }
            synchronized (this.g) {
                p038e0.e eVar = this.f26019f;
                java.lang.Object[] objArr = eVar.f21324h;
                int i3 = eVar.j;
                for (int i9 = 0; i9 < i3; i9++) {
                    z9 = ((p121o0.q) objArr[i9]).a(set2) || z9;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01ca  */
    public final void d(java.lang.Object obj, p194x6.j jVar, kotlin.jvm.functions.Function0 function0) {
        java.lang.Object obj2;
        p121o0.q qVar;
        boolean z6;
        p136q.C c9;
        p121o0.f xVar;
        java.lang.Object obj3;
        java.lang.Object obj4;
        long[] jArr;
        int i3;
        long[] jArr2;
        long j;
        synchronized (this.g) {
            p038e0.e eVar = this.f26019f;
            java.lang.Object[] objArr = eVar.f21324h;
            int i9 = eVar.j;
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i10];
                if (((p121o0.q) obj2).f26003a == jVar) {
                    break;
                } else {
                    i10++;
                }
            }
            qVar = (p121o0.q) obj2;
            z6 = true;
            if (qVar == null) {
                kotlin.jvm.internal.m.c(jVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                kotlin.jvm.internal.E.c(1, jVar);
                qVar = new p121o0.q(jVar);
                eVar.c(qVar);
            }
        }
        p121o0.q qVar2 = this.f26021i;
        long j9 = this.j;
        if (j9 != -1 && j9 != p089k0.f.c()) {
            java.lang.StringBuilder sbU = p121o0.p.u(j9, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
            sbU.append(p089k0.f.c());
            sbU.append(", name=");
            sbU.append(java.lang.Thread.currentThread().getName());
            sbU.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            p020c0.AbstractC1693m0.a(sbU.toString());
        }
        try {
            this.f26021i = qVar;
            this.j = p089k0.f.c();
            p078i6.C2255f c2255f = this.f26018e;
            java.lang.Object obj5 = qVar.f26004b;
            p136q.C c10 = qVar.f26005c;
            int i11 = qVar.f26006d;
            qVar.f26004b = obj;
            qVar.f26005c = (p136q.C) qVar.f26008f.g(obj);
            if (qVar.f26006d == -1) {
                qVar.f26006d = java.lang.Long.hashCode(p121o0.k.j().g());
            }
            p020c0.C1698p c1698p = qVar.f26010i;
            p038e0.e eVarQ = p020c0.AbstractC1703s.q();
            try {
                eVarQ.c(c1698p);
                if (c2255f == null) {
                    function0.invoke();
                    c9 = c10;
                } else {
                    p121o0.f fVar = (p121o0.f) p121o0.k.f25992b.i();
                    if (fVar instanceof p121o0.x) {
                        c9 = c10;
                        if (((p121o0.x) fVar).f26036t == p089k0.f.c()) {
                            p194x6.j jVar2 = ((p121o0.x) fVar).f26034r;
                            p194x6.j jVar3 = ((p121o0.x) fVar).f26035s;
                            try {
                                ((p121o0.x) fVar).f26034r = p121o0.k.k(true, c2255f, jVar2);
                                ((p121o0.x) fVar).f26035s = jVar3;
                                function0.invoke();
                                ((p121o0.x) fVar).f26034r = jVar2;
                                ((p121o0.x) fVar).f26035s = jVar3;
                            } catch (java.lang.Throwable th) {
                                ((p121o0.x) fVar).f26034r = jVar2;
                                ((p121o0.x) fVar).f26035s = jVar3;
                                throw th;
                            }
                        }
                    } else {
                        c9 = c10;
                    }
                    if (fVar == null || (fVar instanceof p121o0.b)) {
                        xVar = new p121o0.x(fVar instanceof p121o0.b ? (p121o0.b) fVar : null, c2255f, null, true, false);
                    } else {
                        xVar = fVar.u(c2255f);
                    }
                    try {
                        p121o0.f fVarJ = xVar.j();
                        try {
                            function0.invoke();
                            p121o0.f.q(fVarJ);
                            xVar.c();
                        } catch (java.lang.Throwable th2) {
                            try {
                                p121o0.f.q(fVarJ);
                                throw th2;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                try {
                                    xVar.c();
                                    throw th;
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    eVarQ.m(eVarQ.j - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                    }
                }
                eVarQ.m(eVarQ.j - 1);
                java.lang.Object obj6 = qVar.f26004b;
                kotlin.jvm.internal.m.b(obj6);
                int i12 = qVar.f26006d;
                p136q.C c11 = qVar.f26005c;
                if (c11 != null) {
                    long[] jArr3 = c11.f26297a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j10 = jArr3[i13];
                            boolean z9 = z6;
                            obj4 = obj5;
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i14 = 8 - ((~(i13 - length)) >>> 31);
                                int i15 = 0;
                                while (i15 < i14) {
                                    if ((j10 & 255) < 128) {
                                        i3 = i15;
                                        int i16 = (i13 << 3) + i3;
                                        jArr2 = jArr3;
                                        java.lang.Object obj7 = c11.f26298b[i16];
                                        j = j10;
                                        boolean z10 = c11.f26299c[i16] != i12 ? z9 : false;
                                        if (z10) {
                                            qVar.c(obj6, obj7);
                                        }
                                        if (z10) {
                                            c11.f(i16);
                                        }
                                    } else {
                                        i3 = i15;
                                        jArr2 = jArr3;
                                        j = j10;
                                    }
                                    j10 = j >> 8;
                                    i15 = i3 + 1;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                if (i14 != 8) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                            }
                            if (i13 == length) {
                                break;
                            }
                            i13++;
                            z6 = z9;
                            obj5 = obj4;
                            jArr3 = jArr;
                        }
                        obj3 = obj4;
                    } else {
                        obj3 = obj5;
                    }
                } else {
                    obj3 = obj5;
                }
                qVar.f26004b = obj3;
                qVar.f26005c = c9;
                qVar.f26006d = i11;
                this.f26021i = qVar2;
                this.j = j9;
            } catch (java.lang.Throwable th6) {
                th = th6;
                eVarQ.m(eVarQ.j - 1);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            this.f26021i = qVar2;
            this.j = j9;
            throw th7;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void e() {
        B.d0 d0Var = this.f26017d;
        p121o0.k.e(p121o0.k.f25991a);
        synchronized (p121o0.k.f25993c) {
            p121o0.k.f25997h = p078i6.o.z1(d0Var, p121o0.k.f25997h);
        }
        this.f26020h = new k3.h(3, d0Var);
    }
}
