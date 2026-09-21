package p007a7;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.j implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15483h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i3, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i9, int i10) {
        super(i3, i9, cls, obj, str, str2);
        this.f15483h = i10;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x033d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x033f A[LOOP:1: B:64:0x02f6->B:76:0x033f, LOOP_END] */
    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f15483h) {
            case 0:
                p101l7.e p2 = (p101l7.e) obj;
                kotlin.jvm.internal.m.e(p2, "p0");
                return ((p007a7.o) this.receiver).N(p2);
            case 1:
                p101l7.e p9 = (p101l7.e) obj;
                kotlin.jvm.internal.m.e(p9, "p0");
                return ((p007a7.o) this.receiver).O(p9);
            case 2:
                return (p055f8.a) ((p063g8.r) this.receiver).a(obj);
            case 3:
                p063g8.m mVar = (p063g8.m) this.receiver;
                p063g8.u uVar = mVar.f22383a;
                int iIntValue = ((java.lang.Number) uVar.f22395a.a(obj)).intValue();
                java.lang.String str = (java.lang.String) p078i6.o.k1(iIntValue - uVar.f22396b, mVar.f22384b);
                return str == null ? Y6.f.m(p121o0.p.t(iIntValue, "The value ", " of "), uVar.f22398d, " does not have a corresponding string representation") : str;
            case 4:
                return ((p063g8.r) this.receiver).f22391h.get(obj);
            case 5:
                return java.lang.Boolean.valueOf(((p063g8.q) this.receiver).test(obj));
            case 6:
                ((p063g8.t) this.receiver).getClass();
                return java.lang.Boolean.TRUE;
            case 7:
                throw null;
            case 8:
                return (java.lang.Integer) ((p063g8.r) this.receiver).a(obj);
            case 9:
                return (java.lang.Integer) ((p063g8.r) this.receiver).a(obj);
            case 10:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                v.F f9 = (v.F) this.receiver;
                if (zBooleanValue) {
                    f9.V0();
                } else {
                    p202z.k kVar = f9.f28838x;
                    p136q.z zVar = f9.f28829J;
                    if (kVar != null) {
                        java.lang.Object[] objArr = zVar.f26442c;
                        long[] jArr = zVar.f26440a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j = jArr[i3];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i9 = 8;
                                    int i10 = 8 - ((~(i3 - length)) >>> 31);
                                    int i11 = 0;
                                    while (i11 < i10) {
                                        if ((255 & j) < 128) {
                                            S7.C.A(f9.B0(), null, new v.C2887i(f9, (p202z.m) objArr[(i3 << 3) + i11], null), 3);
                                        }
                                        j >>= i9;
                                        i11++;
                                        i9 = i9;
                                    }
                                    if (i10 == i9) {
                                        if (i3 != length) {
                                            i3++;
                                        }
                                    }
                                } else if (i3 != length) {
                                    i3++;
                                }
                            }
                        }
                        p202z.m mVar2 = f9.f28831L;
                        if (mVar2 != null) {
                            S7.C.A(f9.B0(), null, new v.C2889j(f9, mVar2, null), 3);
                        }
                    }
                    zVar.a();
                    f9.f28831L = null;
                }
                return p070h6.A.f22523a;
            case 11:
                java.lang.String p10 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(p10, "p0");
                v5.d1 d1Var = (v5.d1) this.receiver;
                d1Var.getClass();
                return java.lang.Boolean.valueOf(d1Var.f29437e.Q(p10));
            case 12:
                java.lang.String p11 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(p11, "p0");
                v5.d1 d1Var2 = (v5.d1) this.receiver;
                d1Var2.getClass();
                return d1Var2.f29440i.j(p11);
            case 13:
                S4.EnumC0862a p12 = (S4.EnumC0862a) obj;
                kotlin.jvm.internal.m.e(p12, "p0");
                v5.d1 d1Var3 = (v5.d1) this.receiver;
                d1Var3.getClass();
                S7.C.A(androidx.lifecycle.X.h(d1Var3), null, new v5.b1(d1Var3, p12, null), 3);
                return p070h6.A.f22523a;
            case 14:
                S4.EnumC0868g p13 = (S4.EnumC0868g) obj;
                kotlin.jvm.internal.m.e(p13, "p0");
                v5.d1 d1Var4 = (v5.d1) this.receiver;
                d1Var4.getClass();
                S7.C.A(androidx.lifecycle.X.h(d1Var4), null, new v5.c1(d1Var4, p13, null), 3);
                return p070h6.A.f22523a;
            case 15:
                com.kiptv.core.model.XtreamLiveStream p14 = (com.kiptv.core.model.XtreamLiveStream) obj;
                kotlin.jvm.internal.m.e(p14, "p0");
                ((p193x5.s1) this.receiver).r(p14);
                return p070h6.A.f22523a;
            case 16:
                com.kiptv.core.model.XtreamLiveStream p15 = (com.kiptv.core.model.XtreamLiveStream) obj;
                kotlin.jvm.internal.m.e(p15, "p0");
                ((p193x5.s1) this.receiver).r(p15);
                return p070h6.A.f22523a;
            case 17:
                java.lang.String p16 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(p16, "p0");
                p193x5.s1 s1Var = (p193x5.s1) this.receiver;
                s1Var.getClass();
                return s1Var.f31622h.j(p16);
            case 18:
                java.lang.String p17 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(p17, "p0");
                p193x5.s1 s1Var2 = (p193x5.s1) this.receiver;
                s1Var2.getClass();
                return java.lang.Boolean.valueOf(s1Var2.f31621f.Q(p17));
            case 19:
                S4.EnumC0862a p18 = (S4.EnumC0862a) obj;
                kotlin.jvm.internal.m.e(p18, "p0");
                p193x5.s1 s1Var3 = (p193x5.s1) this.receiver;
                s1Var3.getClass();
                S7.C.A(androidx.lifecycle.X.h(s1Var3), null, new p193x5.q1(s1Var3, p18, null), 3);
                return p070h6.A.f22523a;
            case 20:
                S4.EnumC0868g p19 = (S4.EnumC0868g) obj;
                kotlin.jvm.internal.m.e(p19, "p0");
                p193x5.s1 s1Var4 = (p193x5.s1) this.receiver;
                s1Var4.getClass();
                S7.C.A(androidx.lifecycle.X.h(s1Var4), null, new p193x5.r1(s1Var4, p19, null), 3);
                return p070h6.A.f22523a;
            case 21:
                p193x5.InterfaceC3137q p20 = (p193x5.InterfaceC3137q) obj;
                kotlin.jvm.internal.m.e(p20, "p0");
                p193x5.s1 s1Var5 = (p193x5.s1) this.receiver;
                s1Var5.getClass();
                V7.n0 n0Var = s1Var5.f31630q;
                if (!kotlin.jvm.internal.m.a(((p193x5.C3138q0) n0Var.getValue()).f31585c, p20)) {
                    p193x5.C3127l c3127l = s1Var5.f31627n;
                    c3127l.getClass();
                    V7.n0 n0Var2 = c3127l.f31524a;
                    n0Var2.getClass();
                    n0Var2.i(null, p20);
                    while (true) {
                        java.lang.Object value = n0Var.getValue();
                        V7.n0 n0Var3 = n0Var;
                        if (!n0Var3.g(value, p193x5.C3138q0.a((p193x5.C3138q0) value, false, null, p20, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, 0, null, null, false, null, null, null, null, null, null, null, null, null, null, null, -201331205, 3))) {
                            n0Var = n0Var3;
                        }
                    }
                }
                return p070h6.A.f22523a;
            case 22:
                S4.EnumC0862a p21 = (S4.EnumC0862a) obj;
                kotlin.jvm.internal.m.e(p21, "p0");
                p193x5.s1 s1Var6 = (p193x5.s1) this.receiver;
                s1Var6.getClass();
                S7.C.A(androidx.lifecycle.X.h(s1Var6), null, new p193x5.q1(s1Var6, p21, null), 3);
                return p070h6.A.f22523a;
            case 23:
                S4.EnumC0868g p22 = (S4.EnumC0868g) obj;
                kotlin.jvm.internal.m.e(p22, "p0");
                p193x5.s1 s1Var7 = (p193x5.s1) this.receiver;
                s1Var7.getClass();
                S7.C.A(androidx.lifecycle.X.h(s1Var7), null, new p193x5.r1(s1Var7, p22, null), 3);
                return p070h6.A.f22523a;
            case 24:
                com.kiptv.core.model.EPGProgram p23 = (com.kiptv.core.model.EPGProgram) obj;
                kotlin.jvm.internal.m.e(p23, "p0");
                p193x5.s1 s1Var8 = (p193x5.s1) this.receiver;
                s1Var8.getClass();
                java.util.Map map = ((p193x5.C3138q0) s1Var8.f31630q.getValue()).f31582G;
                java.lang.String str2 = p23.f19738a;
                if (!map.containsKey(str2) && s1Var8.f31636w.add(str2)) {
                    S7.C.A(androidx.lifecycle.X.h(s1Var8), null, new p193x5.j1(p23, s1Var8, null), 3);
                }
                return p070h6.A.f22523a;
            case 25:
                java.lang.String p24 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(p24, "p0");
                p208z5.X x9 = (p208z5.X) this.receiver;
                x9.getClass();
                return java.lang.Boolean.valueOf(x9.j.Q(p24));
            case 26:
                java.lang.String p25 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(p25, "p0");
                p208z5.J1 j9 = (p208z5.J1) this.receiver;
                j9.getClass();
                return java.lang.Boolean.valueOf(j9.g.Q(p25));
            case 27:
                S4.EnumC0862a p26 = (S4.EnumC0862a) obj;
                kotlin.jvm.internal.m.e(p26, "p0");
                p208z5.J1 j10 = (p208z5.J1) this.receiver;
                j10.getClass();
                S7.C.A(androidx.lifecycle.X.h(j10), null, new p208z5.H1(j10, p26, null), 3);
                return p070h6.A.f22523a;
            case 28:
                S4.EnumC0868g p27 = (S4.EnumC0868g) obj;
                kotlin.jvm.internal.m.e(p27, "p0");
                p208z5.J1 j11 = (p208z5.J1) this.receiver;
                j11.getClass();
                S7.C.A(androidx.lifecycle.X.h(j11), null, new p208z5.I1(j11, p27, null), 3);
                return p070h6.A.f22523a;
            default:
                java.lang.String p28 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(p28, "p0");
                ((p209z7.d) this.receiver).getClass();
                return p209z7.d.a(p28);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(v5.d1 d1Var, int i3) {
        super(1, 0, v5.d1.class, d1Var, "verifyPin", "verifyPin(Ljava/lang/String;)Z");
        this.f15483h = i3;
        switch (i3) {
            case 12:
                super(1, 0, v5.d1.class, d1Var, "searchGuideChannels", "searchGuideChannels(Ljava/lang/String;)Ljava/util/List;");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p193x5.s1 s1Var, int i3) {
        super(1, 0, p193x5.s1.class, s1Var, "onChannelFocused", "onChannelFocused(Lcom/kiptv/core/model/XtreamLiveStream;)V");
        this.f15483h = i3;
        switch (i3) {
            case 16:
                super(1, 0, p193x5.s1.class, s1Var, "onChannelFocused", "onChannelFocused(Lcom/kiptv/core/model/XtreamLiveStream;)V");
                break;
            case 17:
                super(1, 0, p193x5.s1.class, s1Var, "searchGuideChannels", "searchGuideChannels(Ljava/lang/String;)Ljava/util/List;");
                break;
            case 18:
                super(1, 0, p193x5.s1.class, s1Var, "verifyPin", "verifyPin(Ljava/lang/String;)Z");
                break;
            case 19:
                super(1, 0, p193x5.s1.class, s1Var, "updateCategorySortOrder", "updateCategorySortOrder(Lcom/kiptv/core/helper/CategorySortType;)V");
                break;
            case 20:
                super(1, 0, p193x5.s1.class, s1Var, "updateContentSortOrder", "updateContentSortOrder(Lcom/kiptv/core/helper/ContentSortType;)V");
                break;
            case 21:
                super(1, 0, p193x5.s1.class, s1Var, "selectSidebar", "selectSidebar(Lcom/kiptv/tv/ui/livetv/TvLiveSidebarSel;)V");
                break;
            case 22:
                super(1, 0, p193x5.s1.class, s1Var, "updateCategorySortOrder", "updateCategorySortOrder(Lcom/kiptv/core/helper/CategorySortType;)V");
                break;
            case 23:
                super(1, 0, p193x5.s1.class, s1Var, "updateContentSortOrder", "updateContentSortOrder(Lcom/kiptv/core/helper/ContentSortType;)V");
                break;
            case 24:
                super(1, 0, p193x5.s1.class, s1Var, "requestProgramArtwork", "requestProgramArtwork(Lcom/kiptv/core/model/EPGProgram;)V");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p208z5.X x9) {
        super(1, 0, p208z5.X.class, x9, "verifyPin", "verifyPin(Ljava/lang/String;)Z");
        this.f15483h = 25;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p208z5.J1 j9, int i3) {
        super(1, 0, p208z5.J1.class, j9, "verifyPin", "verifyPin(Ljava/lang/String;)Z");
        this.f15483h = i3;
        switch (i3) {
            case 27:
                super(1, 0, p208z5.J1.class, j9, "updateCategorySortOrder", "updateCategorySortOrder(Lcom/kiptv/core/helper/CategorySortType;)V");
                break;
            case 28:
                super(1, 0, p208z5.J1.class, j9, "updateContentSortOrder", "updateContentSortOrder(Lcom/kiptv/core/helper/ContentSortType;)V");
                break;
            default:
                break;
        }
    }
}
