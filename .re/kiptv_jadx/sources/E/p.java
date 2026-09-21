package E;

/* JADX INFO: loaded from: classes.dex */
public final class p implements O0.T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E.r f2665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O0.T f2669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f2670f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final S7.A f2671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p113n1.c f2672i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p194x6.j f2673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p194x6.j f2674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.Object f2675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x.EnumC3061p0 f2679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2681s;

    public p(E.r rVar, int i3, boolean z6, float f9, O0.T t9, float f10, boolean z9, S7.A a2, p113n1.c cVar, int i9, p194x6.j jVar, p194x6.j jVar2, java.util.List list, int i10, int i11, int i12, x.EnumC3061p0 enumC3061p0, int i13, int i14) {
        this.f2665a = rVar;
        this.f2666b = i3;
        this.f2667c = z6;
        this.f2668d = f9;
        this.f2669e = t9;
        this.f2670f = f10;
        this.g = z9;
        this.f2671h = a2;
        this.f2672i = cVar;
        this.j = i9;
        this.f2673k = jVar;
        this.f2674l = jVar2;
        this.f2675m = list;
        this.f2676n = i10;
        this.f2677o = i11;
        this.f2678p = i12;
        this.f2679q = enumC3061p0;
        this.f2680r = i13;
        this.f2681s = i14;
    }

    @Override // O0.T
    public final int a() {
        return this.f2669e.a();
    }

    @Override // O0.T
    public final int b() {
        return this.f2669e.b();
    }

    @Override // O0.T
    public final java.util.Map c() {
        return this.f2669e.c();
    }

    @Override // O0.T
    public final void d() {
        this.f2669e.d();
    }

    @Override // O0.T
    public final p194x6.j e() {
        return this.f2669e.e();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final E.p f(int i3, boolean z6) {
        E.r rVar;
        int i9;
        int i10;
        if (this.g) {
            return null;
        }
        ?? r9 = this.f2675m;
        if (r9.isEmpty() || (rVar = this.f2665a) == null || (i9 = this.f2666b - i3) < 0 || i9 >= rVar.g) {
            return null;
        }
        E.q qVar = (E.q) p078i6.o.h1(r9);
        E.q qVar2 = (E.q) p078i6.o.q1(r9);
        if (qVar.f2697r || qVar2.f2697r) {
            return null;
        }
        x.EnumC3061p0 enumC3061p0 = this.f2679q;
        int i11 = this.f2677o;
        int i12 = this.f2676n;
        if (i3 < 0) {
            if (java.lang.Math.min((com.google.android.gms.internal.play_billing.V0.y(qVar, enumC3061p0) + qVar.f2691l) - i12, (com.google.android.gms.internal.play_billing.V0.y(qVar2, enumC3061p0) + qVar2.f2691l) - i11) <= (-i3)) {
                return null;
            }
        } else if (java.lang.Math.min(i12 - com.google.android.gms.internal.play_billing.V0.y(qVar, enumC3061p0), i11 - com.google.android.gms.internal.play_billing.V0.y(qVar2, enumC3061p0)) <= i3) {
            return null;
        }
        int size = r9.size();
        int i13 = 0;
        while (i13 < size) {
            E.q qVar3 = (E.q) r9.get(i13);
            if (qVar3.f2697r) {
                i10 = i9;
            } else {
                long j = qVar3.f2694o;
                i10 = i9;
                qVar3.f2694o = (((long) ((int) (j >> 32))) << 32) | (((long) (((int) (j & 4294967295L)) + i3)) & 4294967295L);
                if (z6) {
                    int size2 = qVar3.f2686e.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        qVar3.f2688h.a(i14, qVar3.f2683b);
                    }
                }
            }
            i13++;
            i9 = i10;
        }
        return new E.p(this.f2665a, i9, this.f2667c || i3 > 0, i3, this.f2669e, this.f2670f, this.g, this.f2671h, this.f2672i, this.j, this.f2673k, this.f2674l, r9, this.f2676n, this.f2677o, this.f2678p, enumC3061p0, this.f2680r, this.f2681s);
    }

    public final long g() {
        O0.T t9 = this.f2669e;
        return (((long) t9.b()) << 32) | (((long) t9.a()) & 4294967295L);
    }
}
