package V7;

/* JADX INFO: loaded from: classes4.dex */
public class a0 extends W7.AbstractC1008b implements V7.T, V7.InterfaceC0981g, W7.v {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f10432l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10433m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final U7.EnumC0955c f10434n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.lang.Object[] f10435o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f10436p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f10437q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10438r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10439s;

    public a0(int i3, int i9, U7.EnumC0955c enumC0955c) {
        this.f10432l = i3;
        this.f10433m = i9;
        this.f10434n = enumC0955c;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0079, B:34:0x0081, B:38:0x0094, B:41:0x009b, B:42:0x009f, B:43:0x00a0, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0094 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0079, B:34:0x0081, B:38:0x0094, B:41:0x009b, B:42:0x009f, B:43:0x00a0, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [V7.h] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [W7.b] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [V7.a0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [V7.h] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [W7.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [V7.b0] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [V7.b0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ae -> B:16:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:56:0x0092
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void i(V7.a0 r8, V7.InterfaceC0982h r9, p100l6.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof V7.Z
            if (r0 == 0) goto L13
            r0 = r10
            V7.Z r0 = (V7.Z) r0
            int r1 = r0.f10428n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10428n = r1
            goto L18
        L13:
            V7.Z r0 = new V7.Z
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f10426l
            m6.a r1 = p109m6.a.f25430h
            int r2 = r0.f10428n
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            S7.h0 r8 = r0.f10425k
            V7.b0 r9 = r0.j
            V7.h r2 = r0.f10424i
            V7.a0 r5 = r0.f10423h
            com.google.common.util.concurrent.P.u0(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L76
        L38:
            r8 = move-exception
            goto Lb4
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            S7.h0 r8 = r0.f10425k
            V7.b0 r9 = r0.j
            V7.h r2 = r0.f10424i
            V7.a0 r5 = r0.f10423h
            com.google.common.util.concurrent.P.u0(r10)     // Catch: java.lang.Throwable -> L38
            goto L79
        L4f:
            V7.b0 r9 = r0.j
            V7.h r8 = r0.f10424i
            V7.a0 r2 = r0.f10423h
            com.google.common.util.concurrent.P.u0(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb4
        L5e:
            com.google.common.util.concurrent.P.u0(r10)
            W7.d r10 = r8.b()
            V7.b0 r10 = (V7.b0) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            l6.h r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lb1
            S7.g0 r5 = S7.C0889g0.f9584h     // Catch: java.lang.Throwable -> Lb1
            l6.f r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lb1
            S7.h0 r2 = (S7.InterfaceC0891h0) r2     // Catch: java.lang.Throwable -> Lb1
        L76:
            r5 = r8
            r8 = r2
            r2 = r10
        L79:
            java.lang.Object r10 = r5.r(r9)     // Catch: java.lang.Throwable -> L38
            N6.A r6 = V7.r.f10508b     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L92
            r0.f10423h = r5     // Catch: java.lang.Throwable -> L38
            r0.f10424i = r2     // Catch: java.lang.Throwable -> L38
            r0.j = r9     // Catch: java.lang.Throwable -> L38
            r0.f10425k = r8     // Catch: java.lang.Throwable -> L38
            r0.f10428n = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.g(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L79
            goto Lb0
        L92:
            if (r8 == 0) goto La0
            boolean r6 = r8.isActive()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9b
            goto La0
        L9b:
            java.util.concurrent.CancellationException r8 = r8.t()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La0:
            r0.f10423h = r5     // Catch: java.lang.Throwable -> L38
            r0.f10424i = r2     // Catch: java.lang.Throwable -> L38
            r0.j = r9     // Catch: java.lang.Throwable -> L38
            r0.f10425k = r8     // Catch: java.lang.Throwable -> L38
            r0.f10428n = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
        Lb0:
            return
        Lb1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb4:
            r5.e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: V7.a0.i(V7.a0, V7.h, l6.c):void");
    }

    @Override // W7.v
    public final V7.InterfaceC0981g a(p100l6.h hVar, int i3, U7.EnumC0955c enumC0955c) {
        return V7.r.r(this, hVar, i3, enumC0955c);
    }

    @Override // W7.AbstractC1008b
    public final W7.AbstractC1010d c() {
        V7.b0 b0Var = new V7.b0();
        b0Var.f10443a = -1L;
        return b0Var;
    }

    @Override // V7.InterfaceC0981g
    public final java.lang.Object collect(V7.InterfaceC0982h interfaceC0982h, p100l6.c cVar) throws java.lang.Throwable {
        i(this, interfaceC0982h, cVar);
        return p109m6.a.f25430h;
    }

    @Override // W7.AbstractC1008b
    public final W7.AbstractC1010d[] d() {
        return new V7.b0[2];
    }

    @Override // V7.InterfaceC0982h
    public final java.lang.Object emit(java.lang.Object obj, p100l6.c cVar) throws java.lang.Throwable {
        java.lang.Throwable th;
        p100l6.c[] cVarArrL;
        V7.Y y;
        if (o(obj)) {
            return p070h6.A.f22523a;
        }
        S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(cVar));
        c0895k.r();
        p100l6.c[] cVarArrL2 = W7.AbstractC1009c.f10730a;
        synchronized (this) {
            try {
                if (p(obj)) {
                    try {
                        c0895k.resumeWith(p070h6.A.f22523a);
                        cVarArrL = l(cVarArrL2);
                        y = null;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        V7.Y y9 = new V7.Y(this, m() + ((long) (this.f10438r + this.f10439s)), obj, c0895k);
                        k(y9);
                        this.f10439s++;
                        if (this.f10433m == 0) {
                            cVarArrL2 = l(cVarArrL2);
                        }
                        cVarArrL = cVarArrL2;
                        y = y9;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (y != null) {
                    c0895k.u(new S7.C0890h(2, y));
                }
                for (p100l6.c cVar2 : cVarArrL) {
                    if (cVar2 != null) {
                        cVar2.resumeWith(p070h6.A.f22523a);
                    }
                }
                java.lang.Object objQ = c0895k.q();
                p109m6.a aVar = p109m6.a.f25430h;
                if (objQ != aVar) {
                    objQ = p070h6.A.f22523a;
                }
                return objQ == aVar ? objQ : p070h6.A.f22523a;
            } catch (java.lang.Throwable th4) {
                th = th4;
            }
        }
    }

    public final java.lang.Object g(V7.b0 b0Var, V7.Z z6) {
        S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(z6));
        c0895k.r();
        synchronized (this) {
            if (q(b0Var) < 0) {
                b0Var.f10444b = c0895k;
            } else {
                c0895k.resumeWith(p070h6.A.f22523a);
            }
        }
        java.lang.Object objQ = c0895k.q();
        return objQ == p109m6.a.f25430h ? objQ : p070h6.A.f22523a;
    }

    public final void h() {
        if (this.f10433m != 0 || this.f10439s > 1) {
            java.lang.Object[] objArr = this.f10435o;
            kotlin.jvm.internal.m.b(objArr);
            while (this.f10439s > 0) {
                long jM = m();
                int i3 = this.f10438r;
                int i9 = this.f10439s;
                if (objArr[((int) ((jM + ((long) (i3 + i9))) - 1)) & (objArr.length - 1)] != V7.r.f10508b) {
                    return;
                }
                this.f10439s = i9 - 1;
                V7.r.d(objArr, m() + ((long) (this.f10438r + this.f10439s)), null);
            }
        }
    }

    public final void j() {
        W7.AbstractC1010d[] abstractC1010dArr;
        java.lang.Object[] objArr = this.f10435o;
        kotlin.jvm.internal.m.b(objArr);
        V7.r.d(objArr, m(), null);
        this.f10438r--;
        long jM = m() + 1;
        if (this.f10436p < jM) {
            this.f10436p = jM;
        }
        if (this.f10437q < jM) {
            if (this.f10728i != 0 && (abstractC1010dArr = this.f10727h) != null) {
                for (W7.AbstractC1010d abstractC1010d : abstractC1010dArr) {
                    if (abstractC1010d != null) {
                        V7.b0 b0Var = (V7.b0) abstractC1010d;
                        long j = b0Var.f10443a;
                        if (j >= 0 && j < jM) {
                            b0Var.f10443a = jM;
                        }
                    }
                }
            }
            this.f10437q = jM;
        }
    }

    public final void k(java.lang.Object obj) {
        int i3 = this.f10438r + this.f10439s;
        java.lang.Object[] objArrN = this.f10435o;
        if (objArrN == null) {
            objArrN = n(null, 0, 2);
        } else if (i3 >= objArrN.length) {
            objArrN = n(objArrN, i3, objArrN.length * 2);
        }
        V7.r.d(objArrN, m() + ((long) i3), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [l6.c[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final p100l6.c[] l(p100l6.c[] cVarArr) {
        W7.AbstractC1010d[] abstractC1010dArr;
        V7.b0 b0Var;
        S7.C0895k c0895k;
        int length = cVarArr.length;
        if (this.f10728i != 0 && (abstractC1010dArr = this.f10727h) != null) {
            int length2 = abstractC1010dArr.length;
            int i3 = 0;
            while (i3 < length2) {
                W7.AbstractC1010d abstractC1010d = abstractC1010dArr[i3];
                if (abstractC1010d == null || (c0895k = (b0Var = (V7.b0) abstractC1010d).f10444b) == null || q(b0Var) < 0) {
                    cVarArr = cVarArr;
                } else {
                    if (length >= cVarArr.length) {
                        cVarArr = cVarArr;
                        cVarArr = cVarArr;
                        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf((java.lang.Object[]) cVarArr, java.lang.Math.max(2, cVarArr.length * 2));
                        kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
                        cVarArr = objArrCopyOf;
                    }
                    cVarArr = cVarArr;
                    cVarArr = cVarArr;
                    ((p100l6.c[]) cVarArr)[length] = c0895k;
                    b0Var.f10444b = null;
                    length++;
                }
                i3++;
                cVarArr = cVarArr;
            }
            cVarArr = cVarArr;
        }
        return (p100l6.c[]) cVarArr;
    }

    public final long m() {
        return java.lang.Math.min(this.f10437q, this.f10436p);
    }

    public final java.lang.Object[] n(java.lang.Object[] objArr, int i3, int i9) {
        if (i9 <= 0) {
            throw new java.lang.IllegalStateException("Buffer size overflow");
        }
        java.lang.Object[] objArr2 = new java.lang.Object[i9];
        this.f10435o = objArr2;
        if (objArr != null) {
            long jM = m();
            for (int i10 = 0; i10 < i3; i10++) {
                long j = ((long) i10) + jM;
                V7.r.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean o(java.lang.Object obj) {
        int i3;
        boolean z6;
        p100l6.c[] cVarArrL = W7.AbstractC1009c.f10730a;
        synchronized (this) {
            if (p(obj)) {
                cVarArrL = l(cVarArrL);
                z6 = true;
            } else {
                z6 = false;
            }
        }
        for (p100l6.c cVar : cVarArrL) {
            if (cVar != null) {
                cVar.resumeWith(p070h6.A.f22523a);
            }
        }
        return z6;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    public final boolean p(java.lang.Object obj) {
        int i3;
        long jM;
        long j;
        int i9 = this.f10728i;
        int i10 = this.f10432l;
        if (i9 != 0) {
            int i11 = this.f10438r;
            int i12 = this.f10433m;
            if (i11 < i12 || this.f10437q > this.f10436p) {
                k(obj);
                i3 = this.f10438r + 1;
                this.f10438r = i3;
                if (i3 > i12) {
                    j();
                }
                jM = m() + ((long) this.f10438r);
                j = this.f10436p;
                if (((int) (jM - j)) > i10) {
                    s(1 + j, this.f10437q, m() + ((long) this.f10438r), m() + ((long) this.f10438r) + ((long) this.f10439s));
                }
            } else {
                int iOrdinal = this.f10434n.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal == 1) {
                    k(obj);
                    i3 = this.f10438r + 1;
                    this.f10438r = i3;
                    if (i3 > i12) {
                        j();
                    }
                    jM = m() + ((long) this.f10438r);
                    j = this.f10436p;
                    if (((int) (jM - j)) > i10) {
                        s(1 + j, this.f10437q, m() + ((long) this.f10438r), m() + ((long) this.f10438r) + ((long) this.f10439s));
                    }
                } else if (iOrdinal != 2) {
                    throw new I3.b();
                }
            }
        } else if (i10 != 0) {
            k(obj);
            int i13 = this.f10438r + 1;
            this.f10438r = i13;
            if (i13 > i10) {
                j();
            }
            this.f10437q = m() + ((long) this.f10438r);
            return true;
        }
        return true;
    }

    public final long q(V7.b0 b0Var) {
        long j = b0Var.f10443a;
        if (j < m() + ((long) this.f10438r)) {
            return j;
        }
        if (this.f10433m <= 0 && j <= m() && this.f10439s != 0) {
            return j;
        }
        return -1L;
    }

    public final java.lang.Object r(V7.b0 b0Var) {
        java.lang.Object obj;
        p100l6.c[] cVarArrT = W7.AbstractC1009c.f10730a;
        synchronized (this) {
            try {
                long jQ = q(b0Var);
                if (jQ < 0) {
                    obj = V7.r.f10508b;
                } else {
                    long j = b0Var.f10443a;
                    java.lang.Object[] objArr = this.f10435o;
                    kotlin.jvm.internal.m.b(objArr);
                    java.lang.Object obj2 = objArr[((int) jQ) & (objArr.length - 1)];
                    if (obj2 instanceof V7.Y) {
                        obj2 = ((V7.Y) obj2).j;
                    }
                    b0Var.f10443a = jQ + 1;
                    java.lang.Object obj3 = obj2;
                    cVarArrT = t(j);
                    obj = obj3;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        for (p100l6.c cVar : cVarArrT) {
            if (cVar != null) {
                cVar.resumeWith(p070h6.A.f22523a);
            }
        }
        return obj;
    }

    public final void s(long j, long j9, long j10, long j11) {
        long jMin = java.lang.Math.min(j9, j);
        for (long jM = m(); jM < jMin; jM++) {
            java.lang.Object[] objArr = this.f10435o;
            kotlin.jvm.internal.m.b(objArr);
            V7.r.d(objArr, jM, null);
        }
        this.f10436p = j;
        this.f10437q = j9;
        this.f10438r = (int) (j10 - jMin);
        this.f10439s = (int) (j11 - j10);
    }

    public final p100l6.c[] t(long j) {
        long j9;
        long j10;
        long j11;
        p100l6.c[] cVarArr;
        W7.AbstractC1010d[] abstractC1010dArr;
        long j12 = this.f10437q;
        p100l6.c[] cVarArr2 = W7.AbstractC1009c.f10730a;
        if (j <= j12) {
            long jM = m();
            long j13 = ((long) this.f10438r) + jM;
            int i3 = this.f10433m;
            if (i3 == 0 && this.f10439s > 0) {
                j13++;
            }
            int i9 = 0;
            if (this.f10728i != 0 && (abstractC1010dArr = this.f10727h) != null) {
                for (W7.AbstractC1010d abstractC1010d : abstractC1010dArr) {
                    if (abstractC1010d != null) {
                        long j14 = ((V7.b0) abstractC1010d).f10443a;
                        if (j14 >= 0 && j14 < j13) {
                            j13 = j14;
                        }
                    }
                }
            }
            if (j13 > this.f10437q) {
                long jM2 = m() + ((long) this.f10438r);
                int iMin = this.f10728i > 0 ? java.lang.Math.min(this.f10439s, i3 - ((int) (jM2 - j13))) : this.f10439s;
                long j15 = ((long) this.f10439s) + jM2;
                N6.A a2 = V7.r.f10508b;
                if (iMin > 0) {
                    p100l6.c[] cVarArr3 = new p100l6.c[iMin];
                    j11 = 1;
                    java.lang.Object[] objArr = this.f10435o;
                    kotlin.jvm.internal.m.b(objArr);
                    long j16 = jM2;
                    while (true) {
                        if (jM2 >= j15) {
                            j9 = jM;
                            j10 = j13;
                            break;
                        }
                        j9 = jM;
                        java.lang.Object obj = objArr[((int) jM2) & (objArr.length - 1)];
                        if (obj != a2) {
                            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            V7.Y y = (V7.Y) obj;
                            int i10 = i9 + 1;
                            j10 = j13;
                            cVarArr3[i9] = y.f10422k;
                            V7.r.d(objArr, jM2, a2);
                            V7.r.d(objArr, j16, y.j);
                            j16++;
                            if (i10 >= iMin) {
                                break;
                            }
                            i9 = i10;
                        } else {
                            j10 = j13;
                        }
                        jM2++;
                        jM = j9;
                        j13 = j10;
                    }
                    jM2 = j16;
                    cVarArr = cVarArr3;
                } else {
                    j9 = jM;
                    j10 = j13;
                    j11 = 1;
                    cVarArr = cVarArr2;
                }
                int i11 = (int) (jM2 - j9);
                long j17 = this.f10728i == 0 ? jM2 : j10;
                long jMax = java.lang.Math.max(this.f10436p, jM2 - ((long) java.lang.Math.min(this.f10432l, i11)));
                if (i3 == 0 && jMax < j15) {
                    java.lang.Object[] objArr2 = this.f10435o;
                    kotlin.jvm.internal.m.b(objArr2);
                    if (kotlin.jvm.internal.m.a(objArr2[((int) jMax) & (objArr2.length - 1)], a2)) {
                        jM2 += j11;
                        jMax += j11;
                    }
                }
                s(jMax, j17, jM2, j15);
                h();
                return cVarArr.length == 0 ? cVarArr : l(cVarArr);
            }
        }
        return cVarArr2;
    }
}
