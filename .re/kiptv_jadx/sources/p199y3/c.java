package p199y3;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f31808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p199y3.g f31809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f31810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.util.SparseIntArray f31811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p199y3.p f31812f;
    public final java.util.ArrayList g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayDeque f31813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Z3.d f31814i;
    public final p199y3.o j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.google.android.gms.common.api.internal.BasePendingResult f31815k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.google.android.gms.common.api.internal.BasePendingResult f31816l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.Set f31817m = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B3.C0089b f31807a = new B3.C0089b("MediaQueue", null);

    public c(p199y3.g gVar) {
        this.f31809c = gVar;
        java.lang.Math.max(20, 1);
        this.f31810d = new java.util.ArrayList();
        this.f31811e = new android.util.SparseIntArray();
        this.g = new java.util.ArrayList();
        this.f31813h = new java.util.ArrayDeque(20);
        this.f31814i = new Z3.d(android.os.Looper.getMainLooper(), 2);
        this.j = new p199y3.o(this);
        p191x3.B b9 = new p191x3.B(1, this);
        gVar.getClass();
        H3.q.d();
        gVar.f31869i.add(b9);
        this.f31812f = new p199y3.p(this);
        this.f31808b = e();
        d();
    }

    public static void a(p199y3.c cVar) {
        synchronized (cVar.f31817m) {
            try {
                java.util.Iterator it = cVar.f31817m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new java.lang.ClassCastException();
                    }
                    throw null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void b(p199y3.c cVar) {
        cVar.f31811e.clear();
        for (int i3 = 0; i3 < cVar.f31810d.size(); i3++) {
            cVar.f31811e.put(((java.lang.Integer) cVar.f31810d.get(i3)).intValue(), i3);
        }
    }

    public final void c() {
        h();
        this.f31810d.clear();
        this.f31811e.clear();
        this.f31812f.evictAll();
        this.g.clear();
        this.f31814i.removeCallbacks(this.j);
        this.f31813h.clear();
        com.google.android.gms.common.api.internal.BasePendingResult basePendingResult = this.f31816l;
        if (basePendingResult != null) {
            basePendingResult.j0();
            this.f31816l = null;
        }
        com.google.android.gms.common.api.internal.BasePendingResult basePendingResult2 = this.f31815k;
        if (basePendingResult2 != null) {
            basePendingResult2.j0();
            this.f31815k = null;
        }
        g();
        f();
    }

    public final void d() {
        com.google.android.gms.common.api.internal.BasePendingResult basePendingResult;
        com.google.android.gms.common.api.internal.BasePendingResult basePendingResultQ;
        H3.q.d();
        if (this.f31808b != 0 && (basePendingResult = this.f31816l) == null) {
            if (basePendingResult != null) {
                basePendingResult.j0();
                this.f31816l = null;
            }
            com.google.android.gms.common.api.internal.BasePendingResult basePendingResult2 = this.f31815k;
            if (basePendingResult2 != null) {
                basePendingResult2.j0();
                this.f31815k = null;
            }
            p199y3.g gVar = this.f31809c;
            gVar.getClass();
            H3.q.d();
            if (gVar.t()) {
                p199y3.h hVar = new p199y3.h(gVar);
                p199y3.g.u(hVar);
                basePendingResultQ = hVar;
            } else {
                basePendingResultQ = p199y3.g.q();
            }
            this.f31816l = basePendingResultQ;
            basePendingResultQ.o0(new p199y3.n(this, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    public final long e() {
        p184w3.q qVarD = this.f31809c.d();
        if (qVarD == null) {
            return 0L;
        }
        com.google.android.gms.cast.MediaInfo mediaInfo = qVarD.f29904h;
        int i3 = mediaInfo == null ? -1 : mediaInfo.f18640i;
        int i9 = qVarD.f29907l;
        int i10 = qVarD.f29908m;
        int i11 = qVarD.f29914s;
        if (i9 == 1) {
            if (i10 == 1) {
                if (i11 == 0) {
                    return 0L;
                }
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return 0L;
                }
                if (i11 == 0) {
                    return 0L;
                }
            } else if (i3 != 2) {
                return 0L;
            }
        }
        return qVarD.f29905i;
    }

    public final void f() {
        synchronized (this.f31817m) {
            try {
                java.util.Iterator it = this.f31817m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new java.lang.ClassCastException();
                    }
                    throw null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.f31817m) {
            try {
                java.util.Iterator it = this.f31817m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new java.lang.ClassCastException();
                    }
                    throw null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f31817m) {
            try {
                java.util.Iterator it = this.f31817m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new java.lang.ClassCastException();
                    }
                    throw null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
