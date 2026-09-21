package E5;

/* JADX INFO: renamed from: E5.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0313s0 extends kotlin.jvm.internal.j implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3147h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0313s0(int i3, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i9, int i10) {
        super(i3, i9, cls, obj, str, str2);
        this.f3147h = i10;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0076 A[LOOP:0: B:11:0x003f->B:21:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x012d A[LOOP:4: B:60:0x00fd->B:70:0x012d, LOOP_END] */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        android.view.contentcapture.ContentCaptureSession contentCaptureSessionA;
        Q0.C0765b0 c0765b0;
        switch (this.f3147h) {
            case 0:
                ((E5.C0310q0) this.receiver).getClass();
                E5.C0310q0.a();
                return p070h6.A.f22523a;
            case 1:
                ((E5.X0) this.receiver).g();
                return p070h6.A.f22523a;
            case 2:
                ((E5.X0) this.receiver).g();
                return p070h6.A.f22523a;
            case 3:
                ((H5.K) this.receiver).e();
                return p070h6.A.f22523a;
            case 4:
                O5.e eVar = (O5.e) this.receiver;
                eVar.f7956b.getClass();
                eVar.c(true);
                return p070h6.A.f22523a;
            case 5:
                ((O5.e) this.receiver).e();
                return p070h6.A.f22523a;
            case 6:
                ((O5.e) this.receiver).e();
                return p070h6.A.f22523a;
            case 7:
                return ((Q.e) this.receiver).L();
            case 8:
                android.view.View view = (android.view.View) this.receiver;
                int i3 = android.os.Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    D1.AbstractC0226k.f(view);
                }
                if (i3 < 29 || (contentCaptureSessionA = U0.b.a(view)) == null) {
                    return null;
                }
                return new U0.c(contentCaptureSessionA, view);
            case 9:
                ((p019c.u) this.receiver).e();
                return p070h6.A.f22523a;
            case 10:
                ((p019c.u) this.receiver).e();
                return p070h6.A.f22523a;
            case 11:
                u5.E e6 = (u5.E) this.receiver;
                u5.F f9 = (u5.F) e6.f28693e.getValue();
                com.kiptv.core.model.EnumC1937d enumC1937d = f9.f28695a;
                java.util.List listE = e6.e(enumC1937d);
                java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(listE, 10));
                java.util.Iterator it = listE.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.kiptv.core.model.XtreamCategory) it.next()).f20649a);
                }
                java.util.List listC1 = p078i6.o.c1(arrayList);
                if (!listC1.isEmpty()) {
                    S7.C.A(androidx.lifecycle.X.h(e6), null, new u5.z(e6, f9.f28702i.isEmpty(), listC1, enumC1937d, null), 3);
                }
                return p070h6.A.f22523a;
            case 12:
                u5.E e9 = (u5.E) this.receiver;
                u5.F f10 = (u5.F) e9.f28693e.getValue();
                com.kiptv.core.model.EnumC1937d enumC1937d2 = f10.f28695a;
                java.util.List listE2 = e9.e(enumC1937d2);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(listE2, 10));
                java.util.Iterator it2 = listE2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((com.kiptv.core.model.XtreamCategory) it2.next()).f20649a);
                }
                java.util.List listC2 = p078i6.o.c1(arrayList2);
                if (!listC2.isEmpty()) {
                    java.util.ArrayList arrayListA1 = p078i6.o.A1(f10.f28696b, f10.f28697c);
                    boolean z6 = true;
                    if (!arrayListA1.isEmpty()) {
                        java.util.Iterator it3 = arrayListA1.iterator();
                        while (it3.hasNext()) {
                            if (((u5.C2866b) it3.next()).f28709d) {
                                z6 = false;
                            }
                        }
                    }
                    S7.C.A(androidx.lifecycle.X.h(e9), null, new u5.y(e9, z6, listC2, enumC1937d2, null), 3);
                }
                return p070h6.A.f22523a;
            case 13:
                return java.lang.Boolean.valueOf(((v.U) this.receiver).f28900C.U0(7));
            case 14:
                p175v0.k kVar = (p175v0.k) this.receiver;
                p175v0.p pVar = kVar.f29073a;
                p175v0.F f11 = pVar.f();
                p136q.I i9 = kVar.f29075c;
                p136q.I i10 = kVar.f29076d;
                if (f11 == null) {
                    java.lang.Object[] objArr = i10.f26329b;
                    long[] jArr = i10.f26328a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j = jArr[i11];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((j & 255) < 128) {
                                        ((p175v0.InterfaceC2913h) objArr[(i11 << 3) + i13]).v0(p175v0.D.j);
                                    }
                                    j >>= 8;
                                }
                                if (i12 == 8) {
                                    if (i11 != length) {
                                        i11++;
                                    }
                                }
                            } else if (i11 != length) {
                                i11++;
                            }
                        }
                    }
                } else if (f11.f26487u) {
                    if (i9.c(f11)) {
                        f11.T0();
                    }
                    p175v0.D dS0 = f11.S0();
                    if (!f11.f26475h.f26487u) {
                        N0.a.b("visitAncestors called on an unattached node");
                    }
                    p137q0.o oVar = f11.f26475h;
                    Q0.F fT = Q0.AbstractC0777k.t(f11);
                    int i14 = 0;
                    while (fT != null) {
                        if ((fT.f8232N.f8391f.f26477k & 5120) != 0) {
                            while (oVar != null) {
                                int i15 = oVar.j;
                                if ((i15 & 5120) != 0) {
                                    if ((i15 & 1024) != 0) {
                                        i14++;
                                    }
                                    if ((oVar instanceof p175v0.InterfaceC2913h) && i10.c(oVar)) {
                                        if (i14 <= 1) {
                                            ((p175v0.InterfaceC2913h) oVar).v0(dS0);
                                        } else {
                                            ((p175v0.InterfaceC2913h) oVar).v0(p175v0.D.f29047i);
                                        }
                                        i10.l(oVar);
                                    }
                                }
                                oVar = oVar.f26478l;
                            }
                        }
                        fT = fT.x();
                        oVar = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
                    }
                    java.lang.Object[] objArr2 = i10.f26329b;
                    long[] jArr2 = i10.f26328a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i16 = 0;
                        while (true) {
                            long j9 = jArr2[i16];
                            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                for (int i18 = 0; i18 < i17; i18++) {
                                    if ((j9 & 255) < 128) {
                                        ((p175v0.InterfaceC2913h) objArr2[(i16 << 3) + i18]).v0(p175v0.D.j);
                                    }
                                    j9 >>= 8;
                                }
                                if (i17 == 8) {
                                    if (i16 != length2) {
                                        i16++;
                                    }
                                }
                            } else if (i16 != length2) {
                                i16++;
                            }
                        }
                    }
                }
                if (pVar.f() == null || pVar.f29082c.S0() == p175v0.D.j) {
                    pVar.c();
                }
                i9.b();
                i10.b();
                kVar.f29077e = false;
                return p070h6.A.f22523a;
            default:
                y5.t tVar = (y5.t) this.receiver;
                tVar.getClass();
                S7.C.A(androidx.lifecycle.X.h(tVar), null, new y5.s(tVar, null), 3);
                return p070h6.A.f22523a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0313s0(y5.t tVar) {
        super(0, 0, y5.t.class, tVar, "toggleIncognito", "toggleIncognito()V");
        this.f3147h = 15;
    }
}
