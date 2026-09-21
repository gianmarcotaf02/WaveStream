package I2;

/* JADX INFO: loaded from: classes.dex */
public final class e implements java.lang.AutoCloseable {
    public static final O7.o y = new O7.o("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M8.A f4584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f4585i;
    public final M8.A j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final M8.A f4586k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final M8.A f4587l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.LinkedHashMap f4588m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final X7.c f4589n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.Object f4590o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f4591p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4592q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public M8.D f4593r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4594s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4595t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4596u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4597v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4598w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final I2.c f4599x;

    public e(long j, M8.w wVar, M8.A a2) {
        this.f4584h = a2;
        this.f4585i = j;
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        this.j = a2.e("journal");
        this.f4586k = a2.e("journal.tmp");
        this.f4587l = a2.e("journal.bkp");
        this.f4588m = new java.util.LinkedHashMap(0, 0.75f, true);
        S7.y0 y0VarE = S7.C.e();
        S7.C0905v key = S7.AbstractC0906w.f9624h;
        kotlin.jvm.internal.m.e(key, "key");
        Z7.e eVar = S7.M.f9549a;
        this.f4589n = S7.C.c(com.google.android.gms.internal.play_billing.AbstractC1833d1.H(y0VarE, Z7.d.f13044i.Y(1)));
        this.f4590o = new java.lang.Object();
        this.f4599x = new I2.c(wVar);
    }

    public static void P(java.lang.String str) {
        if (!y.d(str)) {
            throw new java.lang.IllegalArgumentException(B2.a.i('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0111 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:16:0x0032, B:24:0x0040, B:26:0x0058, B:28:0x006b, B:30:0x0079, B:32:0x0080, B:27:0x005e, B:36:0x00a0, B:38:0x00a7, B:41:0x00ac, B:43:0x00bd, B:46:0x00c2, B:51:0x00fd, B:53:0x0108, B:57:0x0111, B:47:0x00da, B:49:0x00ef, B:50:0x00fa, B:35:0x0090, B:60:0x0116, B:61:0x011d), top: B:64:0x0003 }] */
    public static final void b(I2.e eVar, F.i0 i0Var, boolean z6) {
        synchronized (eVar.f4590o) {
            I2.a aVar = (I2.a) i0Var.f3465b;
            if (!kotlin.jvm.internal.m.a(aVar.g, i0Var)) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if (!z6 || aVar.f4578f) {
                for (int i3 = 0; i3 < 2; i3++) {
                    eVar.f4599x.j((M8.A) aVar.f4576d.get(i3));
                }
            } else {
                for (int i9 = 0; i9 < 2; i9++) {
                    if (((boolean[]) i0Var.f3466c)[i9] && !eVar.f4599x.t((M8.A) aVar.f4576d.get(i9))) {
                        i0Var.d(false);
                        return;
                    }
                }
                for (int i10 = 0; i10 < 2; i10++) {
                    M8.A a2 = (M8.A) aVar.f4576d.get(i10);
                    M8.A a9 = (M8.A) aVar.f4575c.get(i10);
                    if (eVar.f4599x.t(a2)) {
                        eVar.f4599x.P(a2, a9);
                    } else {
                        p000a.a.n(eVar.f4599x, (M8.A) aVar.f4575c.get(i10));
                    }
                    long j = aVar.f4574b[i10];
                    java.lang.Long l2 = eVar.f4599x.v(a9).f7271d;
                    long jLongValue = l2 != null ? l2.longValue() : 0L;
                    aVar.f4574b[i10] = jLongValue;
                    eVar.f4591p = (eVar.f4591p - j) + jLongValue;
                }
            }
            aVar.g = null;
            if (aVar.f4578f) {
                eVar.G(aVar);
                return;
            }
            eVar.f4592q++;
            M8.D d4 = eVar.f4593r;
            kotlin.jvm.internal.m.b(d4);
            if (z6 || aVar.f4577e) {
                aVar.f4577e = true;
                d4.w("CLEAN");
                d4.p(32);
                d4.w(aVar.f4573a);
                for (long j9 : aVar.f4574b) {
                    d4.p(32);
                    d4.i(j9);
                }
                d4.p(10);
            } else {
                eVar.f4588m.remove(aVar.f4573a);
                d4.w("REMOVE");
                d4.p(32);
                d4.w(aVar.f4573a);
                d4.p(10);
            }
            d4.flush();
            if (eVar.f4591p > eVar.f4585i) {
                eVar.t();
            } else if (eVar.f4592q >= 2000) {
                eVar.t();
            }
        }
    }

    public final void B(java.lang.String str) throws java.io.IOException {
        java.lang.String strSubstring;
        int iK0 = O7.q.K0(str, ' ', 0, 6);
        if (iK0 == -1) {
            throw new java.io.IOException("unexpected journal line: ".concat(str));
        }
        int i3 = iK0 + 1;
        int iK1 = O7.q.K0(str, ' ', i3, 4);
        java.util.LinkedHashMap linkedHashMap = this.f4588m;
        if (iK1 == -1) {
            strSubstring = str.substring(i3);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            if (iK0 == 6 && O7.x.x0(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i3, iK1);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        }
        java.lang.Object aVar = linkedHashMap.get(strSubstring);
        if (aVar == null) {
            aVar = new I2.a(this, strSubstring);
            linkedHashMap.put(strSubstring, aVar);
        }
        I2.a aVar2 = (I2.a) aVar;
        if (iK1 == -1 || iK0 != 5 || !O7.x.x0(str, "CLEAN", false)) {
            if (iK1 == -1 && iK0 == 5 && O7.x.x0(str, "DIRTY", false)) {
                aVar2.g = new F.i0(this, aVar2);
                return;
            } else {
                if (iK1 != -1 || iK0 != 4 || !O7.x.x0(str, "READ", false)) {
                    throw new java.io.IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        java.lang.String strSubstring2 = str.substring(iK1 + 1);
        kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
        java.util.List listC1 = O7.q.c1(strSubstring2, new char[]{' '});
        aVar2.f4577e = true;
        aVar2.g = null;
        int size = listC1.size();
        aVar2.f4580i.getClass();
        if (size != 2) {
            throw new java.io.IOException("unexpected journal line: " + listC1);
        }
        try {
            int size2 = listC1.size();
            for (int i9 = 0; i9 < size2; i9++) {
                aVar2.f4574b[i9] = java.lang.Long.parseLong((java.lang.String) listC1.get(i9));
            }
        } catch (java.lang.NumberFormatException unused) {
            throw new java.io.IOException("unexpected journal line: " + listC1);
        }
    }

    public final void G(I2.a aVar) {
        M8.D d4;
        int i3 = aVar.f4579h;
        java.lang.String str = aVar.f4573a;
        if (i3 > 0 && (d4 = this.f4593r) != null) {
            d4.w("DIRTY");
            d4.p(32);
            d4.w(str);
            d4.p(10);
            d4.flush();
        }
        if (aVar.f4579h > 0 || aVar.g != null) {
            aVar.f4578f = true;
            return;
        }
        for (int i9 = 0; i9 < 2; i9++) {
            this.f4599x.j((M8.A) aVar.f4575c.get(i9));
            long j = this.f4591p;
            long[] jArr = aVar.f4574b;
            this.f4591p = j - jArr[i9];
            jArr[i9] = 0;
        }
        this.f4592q++;
        M8.D d6 = this.f4593r;
        if (d6 != null) {
            d6.w("REMOVE");
            d6.p(32);
            d6.w(str);
            d6.p(10);
            d6.flush();
        }
        this.f4588m.remove(str);
        if (this.f4592q >= 2000) {
            t();
        }
    }

    public final void N() {
        while (this.f4591p > this.f4585i) {
            for (I2.a aVar : this.f4588m.values()) {
                if (!aVar.f4578f) {
                    G(aVar);
                }
            }
            return;
        }
        this.f4597v = false;
    }

    public final void T() {
        java.lang.Throwable th;
        synchronized (this.f4590o) {
            try {
                M8.D d4 = this.f4593r;
                if (d4 != null) {
                    d4.close();
                }
                M8.D dB = M8.AbstractC0674b.b(this.f4599x.G(this.f4586k, false));
                try {
                    dB.w("libcore.io.DiskLruCache");
                    dB.p(10);
                    dB.w(androidx.media3.extractor.metadata.icy.IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    dB.p(10);
                    dB.i(3);
                    dB.p(10);
                    dB.i(2);
                    dB.p(10);
                    dB.p(10);
                    for (I2.a aVar : this.f4588m.values()) {
                        if (aVar.g != null) {
                            dB.w("DIRTY");
                            dB.p(32);
                            dB.w(aVar.f4573a);
                            dB.p(10);
                        } else {
                            dB.w("CLEAN");
                            dB.p(32);
                            dB.w(aVar.f4573a);
                            for (long j : aVar.f4574b) {
                                dB.p(32);
                                dB.i(j);
                            }
                            dB.p(10);
                        }
                    }
                    try {
                        dB.close();
                        th = null;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                } catch (java.lang.Throwable th3) {
                    try {
                        dB.close();
                    } catch (java.lang.Throwable th4) {
                        com.google.common.util.concurrent.AbstractC1903s.j(th3, th4);
                    }
                    th = th3;
                }
                if (th != null) {
                    throw th;
                }
                if (this.f4599x.t(this.j)) {
                    this.f4599x.P(this.j, this.f4587l);
                    this.f4599x.P(this.f4586k, this.j);
                    this.f4599x.j(this.f4587l);
                } else {
                    this.f4599x.P(this.f4586k, this.j);
                }
                this.f4593r = u();
                this.f4592q = 0;
                this.f4594s = false;
                this.f4598w = false;
            } catch (java.lang.Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f4590o) {
            try {
                if (this.f4595t && !this.f4596u) {
                    for (I2.a aVar : (I2.a[]) this.f4588m.values().toArray(new I2.a[0])) {
                        F.i0 i0Var = aVar.g;
                        if (i0Var != null) {
                            I2.a aVar2 = (I2.a) i0Var.f3465b;
                            if (kotlin.jvm.internal.m.a(aVar2.g, i0Var)) {
                                aVar2.f4578f = true;
                            }
                        }
                    }
                    N();
                    S7.C.i(this.f4589n, null);
                    M8.D d4 = this.f4593r;
                    kotlin.jvm.internal.m.b(d4);
                    d4.close();
                    this.f4593r = null;
                    this.f4596u = true;
                    return;
                }
                this.f4596u = true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final F.i0 e(java.lang.String str) {
        synchronized (this.f4590o) {
            try {
                if (this.f4596u) {
                    throw new java.lang.IllegalStateException("cache is closed");
                }
                P(str);
                j();
                I2.a aVar = (I2.a) this.f4588m.get(str);
                if ((aVar != null ? aVar.g : null) != null) {
                    return null;
                }
                if (aVar != null && aVar.f4579h != 0) {
                    return null;
                }
                if (!this.f4597v && !this.f4598w) {
                    M8.D d4 = this.f4593r;
                    kotlin.jvm.internal.m.b(d4);
                    d4.w("DIRTY");
                    d4.p(32);
                    d4.w(str);
                    d4.p(10);
                    d4.flush();
                    if (this.f4594s) {
                        return null;
                    }
                    if (aVar == null) {
                        aVar = new I2.a(this, str);
                        this.f4588m.put(str, aVar);
                    }
                    F.i0 i0Var = new F.i0(this, aVar);
                    aVar.g = i0Var;
                    return i0Var;
                }
                t();
                return null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final I2.b i(java.lang.String str) {
        I2.b bVarA;
        synchronized (this.f4590o) {
            if (this.f4596u) {
                throw new java.lang.IllegalStateException("cache is closed");
            }
            P(str);
            j();
            I2.a aVar = (I2.a) this.f4588m.get(str);
            if (aVar != null && (bVarA = aVar.a()) != null) {
                boolean z6 = true;
                this.f4592q++;
                M8.D d4 = this.f4593r;
                kotlin.jvm.internal.m.b(d4);
                d4.w("READ");
                d4.p(32);
                d4.w(str);
                d4.p(10);
                d4.flush();
                if (this.f4592q < 2000) {
                    z6 = false;
                }
                if (z6) {
                    t();
                }
                return bVarA;
            }
            return null;
        }
    }

    public final void j() {
        synchronized (this.f4590o) {
            try {
                if (this.f4595t) {
                    return;
                }
                this.f4599x.j(this.f4586k);
                if (this.f4599x.t(this.f4587l)) {
                    if (this.f4599x.t(this.j)) {
                        this.f4599x.j(this.f4587l);
                    } else {
                        this.f4599x.P(this.f4587l, this.j);
                    }
                }
                if (this.f4599x.t(this.j)) {
                    try {
                        z();
                        v();
                        this.f4595t = true;
                        return;
                    } catch (java.io.IOException unused) {
                        try {
                            close();
                            p000a.a.p(this.f4599x, this.f4584h);
                            this.f4596u = false;
                            T();
                            this.f4595t = true;
                        } catch (java.lang.Throwable th) {
                            this.f4596u = false;
                            throw th;
                        }
                    }
                }
                T();
                this.f4595t = true;
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    public final void t() {
        S7.C.A(this.f4589n, null, new I2.d(this, null), 3);
    }

    public final M8.D u() {
        I2.c cVar = this.f4599x;
        cVar.getClass();
        M8.A file = this.j;
        kotlin.jvm.internal.m.e(file, "file");
        cVar.getClass();
        kotlin.jvm.internal.m.e(file, "file");
        cVar.j.getClass();
        java.io.File fileF = file.f();
        java.util.logging.Logger logger = M8.y.f7290a;
        return M8.AbstractC0674b.b(new C8.f(new M8.C0676d(new java.io.FileOutputStream(fileF, true), new M8.M(), 1), new C5.C0132n0(10, this)));
    }

    public final void v() {
        java.util.Iterator it = this.f4588m.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            I2.a aVar = (I2.a) it.next();
            int i3 = 0;
            if (aVar.g == null) {
                while (i3 < 2) {
                    j += aVar.f4574b[i3];
                    i3++;
                }
            } else {
                aVar.g = null;
                while (i3 < 2) {
                    M8.A a2 = (M8.A) aVar.f4575c.get(i3);
                    I2.c cVar = this.f4599x;
                    cVar.j(a2);
                    cVar.j((M8.A) aVar.f4576d.get(i3));
                    i3++;
                }
                it.remove();
            }
        }
        this.f4591p = j;
    }

    public final void z() throws java.lang.Throwable {
        M8.E eC = M8.AbstractC0674b.c(this.f4599x.N(this.j));
        try {
            java.lang.String strU = eC.u(Long.MAX_VALUE);
            java.lang.String strU2 = eC.u(Long.MAX_VALUE);
            java.lang.String strU3 = eC.u(Long.MAX_VALUE);
            java.lang.String strU4 = eC.u(Long.MAX_VALUE);
            java.lang.String strU5 = eC.u(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strU) || !androidx.media3.extractor.metadata.icy.IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strU2) || !kotlin.jvm.internal.m.a(java.lang.String.valueOf(3), strU3) || !kotlin.jvm.internal.m.a(java.lang.String.valueOf(2), strU4) || strU5.length() > 0) {
                throw new java.io.IOException("unexpected journal header: [" + strU + ", " + strU2 + ", " + strU3 + ", " + strU4 + ", " + strU5 + ']');
            }
            int i3 = 0;
            while (true) {
                try {
                    B(eC.u(Long.MAX_VALUE));
                    i3++;
                } catch (java.io.EOFException unused) {
                    this.f4592q = i3 - this.f4588m.size();
                    if (eC.o()) {
                        this.f4593r = u();
                    } else {
                        T();
                    }
                    try {
                        eC.close();
                        th = null;
                    } catch (java.lang.Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            try {
                eC.close();
            } catch (java.lang.Throwable th3) {
                com.google.common.util.concurrent.AbstractC1903s.j(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }
}
