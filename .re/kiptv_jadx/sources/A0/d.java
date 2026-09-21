package A0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A0.f f21a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public android.graphics.Outline f26f;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p188x0.z f29k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p188x0.C3088h f30l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p188x0.C3088h f31m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f32n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p203z0.b f33o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public F3.C0371k f34p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f37s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f38t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f39u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f40v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f41w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public android.graphics.RectF f42x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p113n1.c f22b = p203z0.c.f32130a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p113n1.n f23c = p113n1.n.f25566h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.o f24d = A0.c.f19i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final A0.b f25e = new A0.b(0, this);
    public boolean g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f27h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f28i = 9205357640488583168L;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final A0.a f36r = new A0.a();

    static {
        java.lang.String lowerCase = android.os.Build.FINGERPRINT.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        lowerCase.equals("robolectric");
    }

    public d(A0.f fVar) {
        this.f21a = fVar;
        fVar.C(false);
        this.f38t = 0L;
        this.f39u = 0L;
        this.f40v = 9205357640488583168L;
    }

    public final void a() {
        android.graphics.Outline outline;
        if (this.g) {
            boolean z6 = this.f41w;
            A0.f fVar = this.f21a;
            android.graphics.Outline outline2 = null;
            if (z6 || fVar.K() > 0.0f) {
                p188x0.C3088h c3088h = this.f30l;
                if (c3088h != null) {
                    android.graphics.RectF rectF = this.f42x;
                    if (rectF == null) {
                        rectF = new android.graphics.RectF();
                        this.f42x = rectF;
                    }
                    android.graphics.Path path = c3088h.f31111a;
                    path.computeBounds(rectF, false);
                    int i3 = android.os.Build.VERSION.SDK_INT;
                    if (i3 > 28 || path.isConvex()) {
                        outline = this.f26f;
                        if (outline == null) {
                            outline = new android.graphics.Outline();
                            this.f26f = outline;
                        }
                        if (i3 >= 30) {
                            outline.setPath(path);
                        } else {
                            outline.setConvexPath(path);
                        }
                        this.f32n = !outline.canClip();
                    } else {
                        android.graphics.Outline outline3 = this.f26f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f32n = true;
                        outline = null;
                    }
                    this.f30l = c3088h;
                    if (outline != null) {
                        outline.setAlpha(fVar.a());
                        outline2 = outline;
                    }
                    fVar.g(outline2, (4294967295L & ((long) java.lang.Math.round(rectF.height()))) | (((long) java.lang.Math.round(rectF.width())) << 32));
                    if (this.f32n && this.f41w) {
                        fVar.C(false);
                        fVar.i();
                    } else {
                        fVar.C(this.f41w);
                    }
                } else {
                    fVar.C(this.f41w);
                    android.graphics.Outline outline4 = this.f26f;
                    if (outline4 == null) {
                        outline4 = new android.graphics.Outline();
                        this.f26f = outline4;
                    }
                    android.graphics.Outline outline5 = outline4;
                    long jK = com.google.common.util.concurrent.AbstractC1903s.K(this.f39u);
                    long j = this.f27h;
                    long j9 = this.f28i;
                    if (j9 != 9205357640488583168L) {
                        jK = j9;
                    }
                    int i9 = (int) (j >> 32);
                    int i10 = (int) (j & 4294967295L);
                    int i11 = (int) (jK >> 32);
                    int i12 = (int) (jK & 4294967295L);
                    outline5.setRoundRect(java.lang.Math.round(java.lang.Float.intBitsToFloat(i9)), java.lang.Math.round(java.lang.Float.intBitsToFloat(i10)), java.lang.Math.round(java.lang.Float.intBitsToFloat(i11) + java.lang.Float.intBitsToFloat(i9)), java.lang.Math.round(java.lang.Float.intBitsToFloat(i12) + java.lang.Float.intBitsToFloat(i10)), this.j);
                    outline5.setAlpha(fVar.a());
                    fVar.g(outline5, (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat(i12))) & 4294967295L) | (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat(i11))) << 32));
                }
            } else {
                fVar.C(false);
                fVar.g(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e A[LOOP:0: B:14:0x0027->B:24:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[EDGE_INSN: B:29:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:14:0x0027->B:24:0x005e], SYNTHETIC] */
    public final void b() {
        if (this.f37s && this.f35q == 0) {
            A0.a aVar = this.f36r;
            A0.d dVar = (A0.d) aVar.f13b;
            if (dVar != null) {
                dVar.e();
                aVar.f13b = null;
            }
            p136q.I i3 = (p136q.I) aVar.f15d;
            if (i3 != null) {
                java.lang.Object[] objArr = i3.f26329b;
                long[] jArr = i3.f26328a;
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
                                    ((A0.d) objArr[(i9 << 3) + i11]).e();
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
                i3.b();
            }
            this.f21a.i();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008d A[LOOP:0: B:20:0x0057->B:30:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008f A[EDGE_INSN: B:34:0x008f->B:31:0x008f BREAK  A[LOOP:0: B:20:0x0057->B:30:0x008d], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.internal.o, x6.j] */
    public final void c(p203z0.d dVar) {
        A0.a aVar = this.f36r;
        aVar.f14c = (A0.d) aVar.f13b;
        p136q.I i3 = (p136q.I) aVar.f15d;
        if (i3 != null && i3.h()) {
            p136q.I i9 = (p136q.I) aVar.f16e;
            if (i9 == null) {
                p136q.I i10 = p136q.Q.f26352a;
                i9 = new p136q.I();
                aVar.f16e = i9;
            }
            i9.k(i3);
            i3.b();
        }
        aVar.f12a = true;
        this.f24d.invoke(dVar);
        aVar.f12a = false;
        A0.d dVar2 = (A0.d) aVar.f14c;
        if (dVar2 != null) {
            dVar2.e();
        }
        p136q.I i11 = (p136q.I) aVar.f16e;
        if (i11 == null || !i11.h()) {
            return;
        }
        java.lang.Object[] objArr = i11.f26329b;
        long[] jArr = i11.f26328a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j = jArr[i12];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i12 != length) {
                        break;
                        break;
                    }
                    i12++;
                } else {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j) < 128) {
                            ((A0.d) objArr[(i12 << 3) + i14]).e();
                        }
                        j >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    } else if (i12 != length) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        i11.b();
    }

    public final p188x0.z d() {
        p188x0.z g;
        p188x0.z zVar = this.f29k;
        p188x0.C3088h c3088h = this.f30l;
        if (zVar != null) {
            return zVar;
        }
        if (c3088h != null) {
            p188x0.F f9 = new p188x0.F(c3088h);
            this.f29k = f9;
            return f9;
        }
        long jK = com.google.common.util.concurrent.AbstractC1903s.K(this.f39u);
        long j = this.f27h;
        long j9 = this.f28i;
        if (j9 != 9205357640488583168L) {
            jK = j9;
        }
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (jK >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (jK & 4294967295L)) + fIntBitsToFloat2;
        float f10 = this.j;
        if (f10 > 0.0f) {
            g = new p188x0.H(com.google.android.gms.internal.play_billing.AbstractC1833d1.e(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) java.lang.Float.floatToRawIntBits(f10)) << 32) | (4294967295L & ((long) java.lang.Float.floatToRawIntBits(f10)))));
        } else {
            g = new p188x0.G(new p181w0.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f29k = g;
        return g;
    }

    public final void e() {
        this.f35q--;
        b();
    }

    public final void f(long j, long j9, float f9) {
        if (p181w0.a.b(this.f27h, j) && p181w0.d.a(this.f28i, j9) && this.j == f9 && this.f30l == null) {
            return;
        }
        this.f29k = null;
        this.f30l = null;
        this.g = true;
        this.f32n = false;
        this.f27h = j;
        this.f28i = j9;
        this.j = f9;
        a();
    }
}
