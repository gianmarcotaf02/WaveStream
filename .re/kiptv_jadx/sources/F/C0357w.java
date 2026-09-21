package F;

/* JADX INFO: renamed from: F.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0357w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p136q.H f3493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B8.h f3494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p136q.I f3495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f3496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f3497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f3498f;
    public final java.util.ArrayList g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f3499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p137q0.p f3500i;

    public C0357w() {
        long[] jArr = p136q.P.f26351a;
        this.f3493a = new p136q.H();
        p136q.I i3 = p136q.Q.f26352a;
        this.f3495c = new p136q.I();
        this.f3496d = new java.util.ArrayList();
        this.f3497e = new java.util.ArrayList();
        this.f3498f = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
        this.f3499h = new java.util.ArrayList();
        this.f3500i = new F.C0354t(this);
    }

    public static int e(int[] iArr, F.F f9) {
        int iH = f9.h();
        int span = f9.getSpan() + iH;
        int iMax = 0;
        while (iH < span) {
            int iB = f9.b() + iArr[iH];
            iArr[iH] = iB;
            iMax = java.lang.Math.max(iMax, iB);
            iH++;
        }
        return iMax;
    }

    public final void a(int i3, java.lang.Object obj) {
        B2.a.u(this.f3493a.g(obj));
    }

    public final long b() {
        java.util.ArrayList arrayList = this.f3499h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        B2.a.u(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x008e A[EDGE_INSN: B:107:0x008e->B:33:0x008e BREAK  A[LOOP:2: B:21:0x0057->B:32:0x008b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x008b A[LOOP:2: B:21:0x0057->B:32:0x008b, LOOP_END] */
    public final void c(int i3, int i9, java.util.ArrayList arrayList, B8.h hVar, D1.AbstractC0220e0 abstractC0220e0, boolean z6, int i10, boolean z9, int i11, int i12) throws java.lang.Throwable {
        java.util.ArrayList arrayList2;
        java.lang.Throwable th;
        B8.h hVar2 = this.f3494b;
        this.f3494b = hVar;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            F.F f9 = (F.F) arrayList.get(i13);
            int iA = f9.a();
            for (int i14 = 0; i14 < iA; i14++) {
                f9.c(i14);
            }
        }
        p136q.H h9 = this.f3493a;
        if (h9.i()) {
            d();
            return;
        }
        boolean z10 = z6 || !z9;
        java.lang.Object[] objArr = h9.f26323b;
        long[] jArr = h9.f26322a;
        int length = jArr.length - 2;
        p136q.I i15 = this.f3495c;
        if (length >= 0) {
            int i16 = 0;
            while (true) {
                long j = jArr[i16];
                int i17 = i16;
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i17 != length) {
                        break;
                        break;
                    }
                    i16 = i17 + 1;
                } else {
                    int i18 = 8 - ((~(i17 - length)) >>> 31);
                    long j9 = j;
                    for (int i19 = 0; i19 < i18; i19++) {
                        if ((j9 & 255) < 128) {
                            i15.a(objArr[(i17 << 3) + i19]);
                        }
                        j9 >>= 8;
                    }
                    if (i18 != 8) {
                        break;
                    } else if (i17 != length) {
                        break;
                    } else {
                        i16 = i17 + 1;
                    }
                }
            }
        }
        int size2 = arrayList.size();
        for (int i20 = 0; i20 < size2; i20++) {
            F.F f10 = (F.F) arrayList.get(i20);
            i15.l(f10.getKey());
            int iA2 = f10.a();
            for (int i21 = 0; i21 < iA2; i21++) {
                f10.c(i21);
            }
            B2.a.u(this.f3493a.k(f10.getKey()));
        }
        int[] iArr = new int[i10];
        java.util.ArrayList arrayList3 = this.f3497e;
        java.util.ArrayList arrayList4 = this.f3496d;
        if (z10 && hVar2 != null) {
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    p078i6.t.L0(new F.C0356v(hVar2, 2), arrayList4);
                }
                if (arrayList4.size() > 0) {
                    F.F f11 = (F.F) arrayList4.get(0);
                    e(iArr, f11);
                    java.lang.Object objG = h9.g(f11.getKey());
                    kotlin.jvm.internal.m.b(objG);
                    B2.a.u(objG);
                    f11.g(0);
                    throw null;
                }
                p078i6.m.i0(iArr, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    p078i6.t.L0(new F.C0356v(hVar2, 0), arrayList3);
                }
                if (arrayList3.size() > 0) {
                    F.F f12 = (F.F) arrayList3.get(0);
                    e(iArr, f12);
                    java.lang.Object objG2 = h9.g(f12.getKey());
                    kotlin.jvm.internal.m.b(objG2);
                    B2.a.u(objG2);
                    f12.g(0);
                    throw null;
                }
                p078i6.m.i0(iArr, 0);
            }
        }
        java.lang.Object[] objArr2 = i15.f26329b;
        long[] jArr2 = i15.f26328a;
        int length2 = jArr2.length - 2;
        java.util.ArrayList arrayList5 = this.g;
        java.util.ArrayList arrayList6 = this.f3498f;
        if (length2 >= 0) {
            th = null;
            int i22 = 0;
            while (true) {
                long j10 = jArr2[i22];
                arrayList2 = arrayList3;
                long[] jArr3 = jArr2;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i23 = 8 - ((~(i22 - length2)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & 255) < 128) {
                            B2.a.u(h9.g(objArr2[(i22 << 3) + i24]));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length2) {
                    break;
                }
                i22++;
                arrayList3 = arrayList2;
                jArr2 = jArr3;
            }
        } else {
            arrayList2 = arrayList3;
            th = null;
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > 1) {
                p078i6.t.L0(new F.C0356v(hVar, 3), arrayList6);
            }
            if (arrayList6.size() > 0) {
                F.F f13 = (F.F) arrayList6.get(0);
                java.lang.Object objG3 = h9.g(f13.getKey());
                kotlin.jvm.internal.m.b(objG3);
                B2.a.u(objG3);
                e(iArr, f13);
                if (!z6) {
                    throw th;
                }
                ((F.F) p078i6.o.h1(arrayList)).g(0);
                throw th;
            }
            p078i6.m.i0(iArr, 0);
        }
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > 1) {
                p078i6.t.L0(new F.C0356v(hVar, 1), arrayList5);
            }
            if (arrayList5.size() > 0) {
                F.F f14 = (F.F) arrayList5.get(0);
                java.lang.Object objG4 = h9.g(f14.getKey());
                kotlin.jvm.internal.m.b(objG4);
                B2.a.u(objG4);
                e(iArr, f14);
                throw th;
            }
        }
        java.util.Collections.reverse(arrayList6);
        arrayList.addAll(0, arrayList6);
        arrayList.addAll(arrayList5);
        arrayList4.clear();
        arrayList2.clear();
        arrayList6.clear();
        arrayList5.clear();
        i15.b();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004a A[LOOP:0: B:7:0x0013->B:18:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x004d A[EDGE_INSN: B:22:0x004d->B:19:0x004d BREAK  A[LOOP:0: B:7:0x0013->B:18:0x004a], SYNTHETIC] */
    public final void d() {
        p136q.H h9 = this.f3493a;
        if (h9.j()) {
            java.lang.Object[] objArr = h9.f26324c;
            long[] jArr = h9.f26322a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i9 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((255 & j) < 128) {
                                B2.a.u(objArr[(i3 << 3) + i10]);
                                throw null;
                            }
                            j >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
            h9.a();
        }
    }
}
