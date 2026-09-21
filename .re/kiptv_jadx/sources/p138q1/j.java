package p138q1;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends android.view.ViewGroup implements D1.InterfaceC0232q, p020c0.InterfaceC1682h, Q0.p0, D1.InterfaceC0233s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public p194x6.j f26517A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int[] f26518B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f26519C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f26520D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final D1.r f26521E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f26522F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Q0.F f26523G;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final J0.d f26524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.view.View f26525i;
    public final Q0.o0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public kotlin.jvm.functions.Function0 f26526k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f26527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public kotlin.jvm.functions.Function0 f26528m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public kotlin.jvm.functions.Function0 f26529n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p137q0.p f26530o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p194x6.j f26531p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p113n1.c f26532q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p194x6.j f26533r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public androidx.lifecycle.InterfaceC1540w f26534s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p165t2.e f26535t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f26536u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f26537v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public D1.E0 f26538w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p194x6.j f26539x;
    public final p138q1.i y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p138q1.i f26540z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, p020c0.C1696o c1696o, int i3, J0.d dVar, android.view.View view, Q0.o0 o0Var) {
        super(context);
        int i9 = 2;
        int i10 = 0;
        this.f26524h = dVar;
        this.f26525i = view;
        this.j = o0Var;
        java.util.LinkedHashMap linkedHashMap = R0.j1.f8930a;
        setTag(com.kiptv.tv.R.id.androidx_compose_ui_view_composition_context, c1696o);
        setSaveFromParentEnabled(false);
        addView(view);
        p138q1.y yVar = (p138q1.y) this;
        D1.U.l(this, new p138q1.b(yVar, i10));
        D1.L.h(this, this);
        this.f26526k = p138q1.h.f26513k;
        this.f26528m = p138q1.h.j;
        this.f26529n = p138q1.h.f26512i;
        this.f26530o = p137q0.m.f26474b;
        this.f26532q = com.google.android.gms.internal.play_billing.AbstractC1864o0.c();
        this.f26536u = new int[2];
        this.f26537v = 0L;
        this.y = new p138q1.i(yVar, 1);
        this.f26540z = new p138q1.i(yVar, i10);
        this.f26518B = new int[2];
        this.f26519C = Integer.MIN_VALUE;
        this.f26520D = Integer.MIN_VALUE;
        this.f26521E = new D1.r();
        Q0.F f9 = new Q0.F(3);
        f9.f8255w = yVar;
        p137q0.p pVarA = Y0.m.a(J0.f.a(dVar), true, p138q1.c.f26500k);
        K0.F f10 = new K0.F();
        f10.f6650b = new K0.G(yVar, 0);
        C7.C0173e c0173e = new C7.C0173e();
        C7.C0173e c0173e2 = f10.f6651c;
        if (c0173e2 != null) {
            c0173e2.f1583i = null;
        }
        f10.f6651c = c0173e;
        c0173e.f1583i = f10;
        setOnRequestDisallowInterceptTouchEvent$ui(c0173e);
        p137q0.p pVarD = O0.AbstractC0735y.m(p171u0.f.d(pVarA.d(f10), new p029d.b(yVar, f9, yVar, 2)), new p138q1.d(yVar, f9, i9)).d(new p138q1.o(new K0.G(yVar, 2)));
        f9.i0(this.f26530o.d(pVarD));
        this.f26531p = new K0.D(f9, pVarD, 10);
        f9.e0(this.f26532q);
        this.f26533r = new A0.b(21, f9);
        f9.f8239U = new p138q1.d(yVar, f9, i10);
        f9.V = new K0.G(yVar, 1);
        f9.h0(new p138q1.e(yVar, f9));
        this.f26523G = f9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Q0.q0 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            N0.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.j.getSnapshotObserver();
    }

    public static final int j(p138q1.y yVar, int i3, int i9, int i10) {
        if (i10 >= 0 || i3 == i9) {
            return android.view.View.MeasureSpec.makeMeasureSpec(O7.r.s(i10, i3, i9), 1073741824);
        }
        if (i10 != -2 || i9 == Integer.MAX_VALUE) {
            return (i10 != -1 || i9 == Integer.MAX_VALUE) ? android.view.View.MeasureSpec.makeMeasureSpec(0, 0) : android.view.View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
    }

    public static p182w1.b k(p182w1.b bVar, int i3, int i9, int i10, int i11) {
        int i12 = bVar.f29760a - i3;
        if (i12 < 0) {
            i12 = 0;
        }
        int i13 = bVar.f29761b - i9;
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = bVar.f29762c - i10;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = bVar.f29763d - i11;
        return p182w1.b.b(i12, i13, i14, i15 >= 0 ? i15 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v7 */
    @Override // D1.InterfaceC0231p
    public final void a(android.view.ViewGroup viewGroup, int i3, int i9, int i10, int i11, int i12) {
        J0.i iVar;
        Q0.C0 c9;
        Q0.C0765b0 c0765b0;
        if (this.f26525i.isNestedScrollingEnabled()) {
            float f9 = -1;
            long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(i3 * f9)) << 32) | (((long) java.lang.Float.floatToRawIntBits(i9 * f9)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) java.lang.Float.floatToRawIntBits(i10 * f9)) << 32) | (((long) java.lang.Float.floatToRawIntBits(i11 * f9)) & 4294967295L);
            int i13 = i12 == 0 ? 1 : 2;
            J0.i iVar2 = this.f26524h.f5980a;
            if (iVar2 == null || !iVar2.f26487u) {
                iVar = null;
            } else {
                if (!iVar2.f26475h.f26487u) {
                    N0.a.b("visitAncestors called on an unattached node");
                }
                p137q0.o oVar = iVar2.f26475h.f26478l;
                Q0.F fT = Q0.AbstractC0777k.t(iVar2);
                loop0: while (true) {
                    if (fT == null) {
                        c9 = null;
                        break;
                    }
                    if ((fT.f8232N.f8391f.f26477k & 262144) != 0) {
                        while (oVar != null) {
                            if ((oVar.j & 262144) != 0) {
                                ?? E9 = oVar;
                                ?? eVar = 0;
                                while (E9 != 0) {
                                    if (E9 instanceof Q0.C0) {
                                        Q0.C0 c10 = (Q0.C0) E9;
                                        if (kotlin.jvm.internal.m.a(iVar2.g(), c10.g()) && J0.i.class == c10.getClass()) {
                                            c9 = c10;
                                            break loop0;
                                        }
                                    } else if ((E9.j & 262144) != 0 && (E9 instanceof Q0.AbstractC0776j)) {
                                        p137q0.o oVar2 = ((Q0.AbstractC0776j) E9).f8443w;
                                        int i14 = 0;
                                        while (oVar2 != null) {
                                            if ((oVar2.j & 262144) != 0) {
                                                i14++;
                                                if (i14 == 1) {
                                                    E9 = E9;
                                                    eVar = eVar;
                                                    eVar = eVar;
                                                    E9 = oVar2;
                                                } else {
                                                    if (eVar == 0) {
                                                        eVar = new p038e0.e(new p137q0.o[16]);
                                                    }
                                                    if (E9 != 0) {
                                                        eVar.c(E9);
                                                        E9 = 0;
                                                    }
                                                    eVar.c(oVar2);
                                                }
                                            } else {
                                                E9 = E9;
                                                eVar = eVar;
                                            }
                                            oVar2 = oVar2.f26479m;
                                            E9 = E9;
                                            eVar = eVar;
                                        }
                                        if (i14 == 1) {
                                            E9 = E9;
                                            eVar = eVar;
                                        } else {
                                            E9 = E9;
                                            eVar = eVar;
                                        }
                                    }
                                    E9 = Q0.AbstractC0777k.e(eVar);
                                }
                            }
                            oVar = oVar.f26478l;
                        }
                    }
                    fT = fT.x();
                    oVar = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
                }
                iVar = (J0.i) c9;
            }
            if (iVar != null) {
                iVar.g0(i13, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    @Override // p020c0.InterfaceC1682h
    public final void b() {
        this.f26529n.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r24v1, types: [J0.i] */
    /* JADX WARN: Type inference failed for: r2v12 */
    @Override // D1.InterfaceC0232q
    public final void c(android.view.ViewGroup viewGroup, int i3, int i9, int i10, int i11, int i12, int[] iArr) {
        char c9;
        long j;
        char c10;
        Q0.C0765b0 c0765b0;
        ?? r18;
        ?? E9;
        if (this.f26525i.isNestedScrollingEnabled()) {
            byte b9 = -1;
            float f9 = -1;
            char c11 = ' ';
            long j9 = 4294967295L;
            long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(i3 * f9)) << 32) | (((long) java.lang.Float.floatToRawIntBits(i9 * f9)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) java.lang.Float.floatToRawIntBits(i11 * f9)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(i10 * f9)) << 32);
            int i13 = i12 == 0 ? 1 : 2;
            J0.i iVar = this.f26524h.f5980a;
            Q0.C0 c12 = null;
            if (iVar == null || !iVar.f26487u) {
                c9 = ' ';
                j = 4294967295L;
                c10 = 0;
            } else {
                if (!iVar.f26475h.f26487u) {
                    N0.a.b("visitAncestors called on an unattached node");
                }
                p137q0.o oVar = iVar.f26475h.f26478l;
                Q0.F fT = Q0.AbstractC0777k.t(iVar);
                loop0: while (true) {
                    if (fT == null) {
                        c9 = c11;
                        j = j9;
                        break;
                    }
                    c9 = c11;
                    if ((fT.f8232N.f8391f.f26477k & 262144) != 0) {
                        while (oVar != null) {
                            if ((oVar.j & 262144) != 0) {
                                ?? r19 = 0;
                                ?? r9 = oVar;
                                while (r9 != 0) {
                                    byte b10 = b9;
                                    if (r9 instanceof Q0.C0) {
                                        Q0.C0 c13 = (Q0.C0) r9;
                                        j = j9;
                                        if (kotlin.jvm.internal.m.a(iVar.g(), c13.g()) && J0.i.class == c13.getClass()) {
                                            c12 = c13;
                                            break loop0;
                                        }
                                    } else {
                                        j = j9;
                                        if ((r9.j & 262144) != 0 && (r9 instanceof Q0.AbstractC0776j)) {
                                            p137q0.o oVar2 = ((Q0.AbstractC0776j) r9).f8443w;
                                            int i14 = 0;
                                            while (oVar2 != null) {
                                                if ((oVar2.j & 262144) == 0) {
                                                    E9 = r9;
                                                    r18 = r19;
                                                    E9 = E9;
                                                } else {
                                                    i14++;
                                                    if (i14 == 1) {
                                                        E9 = r9;
                                                        r18 = r19;
                                                        E9 = E9;
                                                        E9 = oVar2;
                                                        E9 = r9;
                                                        r18 = r19;
                                                        E9 = E9;
                                                    } else {
                                                        ?? eVar = r18 == 0 ? new p038e0.e(new p137q0.o[16]) : r18;
                                                        if (E9 != 0) {
                                                            eVar.c(E9);
                                                            E9 = 0;
                                                        }
                                                        eVar.c(oVar2);
                                                        r18 = eVar;
                                                    }
                                                }
                                                oVar2 = oVar2.f26479m;
                                                E9 = E9;
                                                r18 = r18;
                                            }
                                            E9 = r9;
                                            r18 = r19;
                                            r18 = r18;
                                            if (i14 == 1) {
                                            }
                                            b9 = b10;
                                            j9 = j;
                                            r9 = E9;
                                            r19 = r18;
                                        }
                                        E9 = Q0.AbstractC0777k.e(r18);
                                        b9 = b10;
                                        j9 = j;
                                        r9 = E9;
                                        r19 = r18;
                                    }
                                    r18 = r19;
                                    E9 = Q0.AbstractC0777k.e(r18);
                                    b9 = b10;
                                    j9 = j;
                                    r9 = E9;
                                    r19 = r18;
                                }
                            }
                            oVar = oVar.f26478l;
                            b9 = b9;
                            j9 = j9;
                        }
                    }
                    byte b11 = b9;
                    long j10 = j9;
                    fT = fT.x();
                    oVar = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
                    c11 = c9;
                    b9 = b11;
                    j9 = j10;
                }
                c10 = 0;
                c12 = (J0.i) c12;
            }
            long jG0 = c12 != null ? c12.g0(i13, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[c10] = O7.r.Q(java.lang.Float.intBitsToFloat((int) (jG0 >> c9))) * (-1);
            iArr[1] = O7.r.Q(java.lang.Float.intBitsToFloat((int) (jG0 & j))) * (-1);
        }
    }

    @Override // p020c0.InterfaceC1682h
    public final void d() {
        this.f26528m.invoke();
        removeAllViewsInLayout();
    }

    @Override // D1.InterfaceC0231p
    public final void e(int i3, android.view.View view) {
        D1.r rVar = this.f26521E;
        if (i3 == 1) {
            rVar.f2054b = 0;
        } else {
            rVar.f2053a = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r7v17 */
    @Override // D1.InterfaceC0231p
    public final void f(int i3, int i9, int i10, int[] iArr) {
        char c9;
        long j;
        Q0.C0765b0 c0765b0;
        byte b9;
        ?? r16;
        ?? E9;
        long j9;
        if (this.f26525i.isNestedScrollingEnabled()) {
            byte b10 = -1;
            float f9 = -1;
            char c10 = ' ';
            long j10 = 4294967295L;
            long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(i9 * f9)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(i3 * f9)) << 32);
            int i11 = i10 == 0 ? 1 : 2;
            J0.i iVar = this.f26524h.f5980a;
            J0.i iVar2 = null;
            Q0.C0 c11 = null;
            if (iVar == null || !iVar.f26487u) {
                c9 = ' ';
                j = 4294967295L;
            } else {
                if (!iVar.f26475h.f26487u) {
                    N0.a.b("visitAncestors called on an unattached node");
                }
                p137q0.o oVar = iVar.f26475h.f26478l;
                Q0.F fT = Q0.AbstractC0777k.t(iVar);
                loop0: while (true) {
                    if (fT == null) {
                        c9 = c10;
                        break;
                    }
                    if ((fT.f8232N.f8391f.f26477k & 262144) != 0) {
                        while (oVar != null) {
                            if ((oVar.j & 262144) != 0) {
                                ?? r17 = 0;
                                ?? r14 = oVar;
                                while (r14 != 0) {
                                    c9 = c10;
                                    if (r14 instanceof Q0.C0) {
                                        Q0.C0 c12 = (Q0.C0) r14;
                                        b9 = b10;
                                        if (kotlin.jvm.internal.m.a(iVar.g(), c12.g()) && J0.i.class == c12.getClass()) {
                                            c11 = c12;
                                            break loop0;
                                        }
                                    } else {
                                        b9 = b10;
                                        if ((r14.j & 262144) != 0 && (r14 instanceof Q0.AbstractC0776j)) {
                                            p137q0.o oVar2 = ((Q0.AbstractC0776j) r14).f8443w;
                                            int i12 = 0;
                                            while (oVar2 != null) {
                                                long j11 = j10;
                                                if ((oVar2.j & 262144) != 0) {
                                                    i12++;
                                                    if (i12 == 1) {
                                                        E9 = r14;
                                                        r16 = r17;
                                                        E9 = oVar2;
                                                    } else {
                                                        ?? eVar = r16 == 0 ? new p038e0.e(new p137q0.o[16]) : r16;
                                                        if (E9 != 0) {
                                                            eVar.c(E9);
                                                            E9 = 0;
                                                        }
                                                        eVar.c(oVar2);
                                                        r16 = eVar;
                                                    }
                                                } else {
                                                    E9 = r14;
                                                    r16 = r17;
                                                }
                                                oVar2 = oVar2.f26479m;
                                                j10 = j11;
                                                E9 = E9;
                                                r16 = r16;
                                            }
                                            E9 = r14;
                                            r16 = r17;
                                            j9 = j10;
                                            r16 = r16;
                                            if (i12 == 1) {
                                            }
                                            c10 = c9;
                                            b10 = b9;
                                            j10 = j9;
                                            r14 = E9;
                                            r17 = r16;
                                        }
                                        E9 = Q0.AbstractC0777k.e(r16);
                                        c10 = c9;
                                        b10 = b9;
                                        j10 = j9;
                                        r14 = E9;
                                        r17 = r16;
                                    }
                                    j9 = j10;
                                    r16 = r17;
                                    E9 = Q0.AbstractC0777k.e(r16);
                                    c10 = c9;
                                    b10 = b9;
                                    j10 = j9;
                                    r14 = E9;
                                    r17 = r16;
                                }
                            }
                            oVar = oVar.f26478l;
                            c10 = c10;
                            b10 = b10;
                            j10 = j10;
                        }
                    }
                    char c13 = c10;
                    byte b11 = b10;
                    long j12 = j10;
                    fT = fT.x();
                    oVar = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
                    c10 = c13;
                    b10 = b11;
                    j10 = j12;
                }
                j = j10;
                iVar2 = (J0.i) c11;
            }
            long jH = iVar2 != null ? iVar2.H(i11, jFloatToRawIntBits) : 0L;
            iArr[0] = O7.r.Q(java.lang.Float.intBitsToFloat((int) (jH >> c9))) * (-1);
            iArr[1] = O7.r.Q(java.lang.Float.intBitsToFloat((int) (jH & j))) * (-1);
        }
    }

    @Override // D1.InterfaceC0231p
    public final boolean g(android.view.View view, android.view.View view2, int i3, int i9) {
        return ((i3 & 2) == 0 && (i3 & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(android.graphics.Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f26518B;
        getLocationInWindow(iArr);
        int i3 = iArr[0];
        region.op(i3, iArr[1], getWidth() + i3, getHeight() + iArr[1], android.graphics.Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final p113n1.c getDensity() {
        return this.f26532q;
    }

    public final android.view.View getInteropView() {
        return this.f26525i;
    }

    public final Q0.F getLayoutNode() {
        return this.f26523G;
    }

    @Override // android.view.View
    public android.view.ViewGroup.LayoutParams getLayoutParams() {
        android.view.ViewGroup.LayoutParams layoutParams = this.f26525i.getLayoutParams();
        return layoutParams == null ? new android.view.ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final androidx.lifecycle.InterfaceC1540w getLifecycleOwner() {
        return this.f26534s;
    }

    public final p137q0.p getModifier() {
        return this.f26530o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        D1.r rVar = this.f26521E;
        return rVar.f2054b | rVar.f2053a;
    }

    public final p194x6.j getOnDensityChanged$ui() {
        return this.f26533r;
    }

    public final p194x6.j getOnModifierChanged$ui() {
        return this.f26531p;
    }

    public final p194x6.j getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.f26517A;
    }

    public final kotlin.jvm.functions.Function0 getRelease() {
        return this.f26529n;
    }

    public final kotlin.jvm.functions.Function0 getReset() {
        return this.f26528m;
    }

    public final p165t2.e getSavedStateRegistryOwner() {
        return this.f26535t;
    }

    public final kotlin.jvm.functions.Function0 getUpdate() {
        return this.f26526k;
    }

    public final android.view.View getView() {
        return this.f26525i;
    }

    @Override // D1.InterfaceC0231p
    public final void h(android.view.View view, android.view.View view2, int i3, int i9) {
        D1.r rVar = this.f26521E;
        if (i9 == 1) {
            rVar.f2054b = i3;
        } else {
            rVar.f2053a = i3;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f26522F) {
            this.f26523G.F();
            return null;
        }
        this.f26525i.postOnAnimation(new p138q1.a(0, this.f26540z));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f26525i.isNestedScrollingEnabled();
    }

    public final D1.E0 l(D1.E0 e6) {
        D1.z0 z0Var = e6.f1967a;
        p182w1.b bVarG = z0Var.g(-1);
        p182w1.b bVar = p182w1.b.f29759e;
        if (!bVarG.equals(bVar) || !z0Var.h(-9).equals(bVar) || z0Var.f() != null) {
            androidx.compose.ui.node.a aVar = this.f26523G.f8232N.f8388c;
            if (aVar.f15866Y.f26487u) {
                long jD = com.google.android.gms.internal.play_billing.V0.D(aVar.R(0L));
                int i3 = (int) (jD >> 32);
                if (i3 < 0) {
                    i3 = 0;
                }
                int i9 = (int) (jD & 4294967295L);
                if (i9 < 0) {
                    i9 = 0;
                }
                long jK = O0.AbstractC0735y.h(aVar).k();
                int i10 = (int) (jK >> 32);
                int i11 = (int) (jK & 4294967295L);
                long j = aVar.j;
                long jD2 = com.google.android.gms.internal.play_billing.V0.D(aVar.R((((long) java.lang.Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) java.lang.Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i12 = i10 - ((int) (jD2 >> 32));
                if (i12 < 0) {
                    i12 = 0;
                }
                int i13 = i11 - ((int) (4294967295L & jD2));
                int i14 = i13 >= 0 ? i13 : 0;
                if (i3 != 0 || i9 != 0 || i12 != 0 || i14 != 0) {
                    return e6.f1967a.n(i3, i9, i12, i14);
                }
            }
        }
        return e6;
    }

    @Override // Q0.p0
    public final boolean o() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(android.view.View view, android.view.View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f26522F) {
            this.f26523G.F();
            return;
        }
        this.f26525i.postOnAnimation(new p138q1.a(0, this.f26540z));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f8460a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
        this.f26525i.layout(0, 0, i10 - i3, i11 - i9);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i9) {
        android.view.View view = this.f26525i;
        if (view.getParent() != this) {
            setMeasuredDimension(android.view.View.MeasureSpec.getSize(i3), android.view.View.MeasureSpec.getSize(i9));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i3, i9);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f26519C = i3;
        this.f26520D = i9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View view, float f9, float f10, boolean z6) {
        if (!this.f26525i.isNestedScrollingEnabled()) {
            return false;
        }
        S7.C.A(this.f26524h.c(), null, new p138q1.f(z6, this, com.google.common.util.concurrent.P.I(f9 * (-1.0f), f10 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View view, float f9, float f10) {
        if (!this.f26525i.isNestedScrollingEnabled()) {
            return false;
        }
        S7.C.A(this.f26524h.c(), null, new p138q1.g(this, com.google.common.util.concurrent.P.I(f9 * (-1.0f), f10 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z6) {
        p194x6.j jVar = this.f26539x;
        if (jVar == null) {
            return true;
        }
        jVar.invoke(rect != null ? p188x0.z.J(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        p194x6.j jVar = this.f26517A;
        if (jVar != null) {
            jVar.invoke(java.lang.Boolean.valueOf(z6));
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    public final void setDensity(p113n1.c cVar) {
        if (cVar != this.f26532q) {
            this.f26532q = cVar;
            p194x6.j jVar = this.f26533r;
            if (jVar != null) {
                jVar.invoke(cVar);
            }
        }
    }

    public final void setLifecycleOwner(androidx.lifecycle.InterfaceC1540w interfaceC1540w) {
        if (interfaceC1540w != this.f26534s) {
            this.f26534s = interfaceC1540w;
            androidx.lifecycle.X.i(this, interfaceC1540w);
        }
    }

    public final void setModifier(p137q0.p pVar) {
        if (pVar != this.f26530o) {
            this.f26530o = pVar;
            p194x6.j jVar = this.f26531p;
            if (jVar != null) {
                jVar.invoke(pVar);
            }
        }
    }

    public final void setOnDensityChanged$ui(p194x6.j jVar) {
        this.f26533r = jVar;
    }

    public final void setOnModifierChanged$ui(p194x6.j jVar) {
        this.f26531p = jVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(p194x6.j jVar) {
        this.f26517A = jVar;
    }

    public final void setRelease(kotlin.jvm.functions.Function0 function0) {
        this.f26529n = function0;
    }

    public final void setReset(kotlin.jvm.functions.Function0 function0) {
        this.f26528m = function0;
    }

    public final void setSavedStateRegistryOwner(p165t2.e eVar) {
        if (eVar != this.f26535t) {
            this.f26535t = eVar;
            com.google.common.util.concurrent.AbstractC1903s.H(this, eVar);
        }
    }

    public final void setUpdate(kotlin.jvm.functions.Function0 function0) {
        this.f26526k = function0;
        this.f26527l = true;
        this.y.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // D1.InterfaceC0233s
    public final D1.E0 z(android.view.View view, D1.E0 e6) {
        this.f26538w = new D1.E0(e6);
        return l(e6);
    }
}
