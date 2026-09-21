package p007a7;

import S4.EnumC0862a;
import S4.EnumC0868g;
import S7.C;
import V7.n0;
import Y6.f;
import androidx.lifecycle.X;
import com.kiptv.core.model.EPGProgram;
import com.kiptv.core.model.XtreamLiveStream;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import p055f8.a;
import p063g8.q;
import p063g8.r;
import p063g8.t;
import p063g8.u;
import p070h6.A;
import p078i6.o;
import p101l7.e;
import p121o0.p;
import p136q.z;
import p193x5.C3127l;
import p193x5.C3138q0;
import p193x5.InterfaceC3137q;
import p193x5.j1;
import p193x5.q1;
import p193x5.r1;
import p193x5.s1;
import p202z.k;
import p208z5.H1;
import p208z5.I1;
import p208z5.J1;
import p209z7.d;
import v.C2887i;
import v.C2889j;
import v.F;
import v5.b1;
import v5.c1;
import v5.d1;

public final class n extends j implements p194x6.j {

    public final int f15483h;

    public n(int i3, Object obj, Class cls, String str, String str2, int i9, int i10) {
        super(i3, i9, cls, obj, str, str2);
        this.f15483h = i10;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f15483h) {
            case 0:
                e p2 = (e) obj;
                m.e(p2, "p0");
                return ((o) this.receiver).N(p2);
            case 1:
                e p9 = (e) obj;
                m.e(p9, "p0");
                return ((o) this.receiver).O(p9);
            case 2:
                return (a) ((r) this.receiver).a(obj);
            case 3:
                p063g8.m mVar = (p063g8.m) this.receiver;
                u uVar = mVar.f22383a;
                int iIntValue = ((Number) uVar.f22395a.a(obj)).intValue();
                String str = (String) o.k1(iIntValue - uVar.f22396b, mVar.f22384b);
                return str == null ? f.m(p.t(iIntValue, "The value ", " of "), uVar.f22398d, " does not have a corresponding string representation") : str;
            case 4:
                return ((r) this.receiver).f22391h.get(obj);
            case 5:
                return Boolean.valueOf(((q) this.receiver).test(obj));
            case 6:
                ((t) this.receiver).getClass();
                return Boolean.TRUE;
            case 7:
                throw null;
            case 8:
                return (Integer) ((r) this.receiver).a(obj);
            case 9:
                return (Integer) ((r) this.receiver).a(obj);
            case 10:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                F f9 = (F) this.receiver;
                if (zBooleanValue) {
                    f9.V0();
                } else {
                    k kVar = f9.f28838x;
                    z zVar = f9.f28829J;
                    if (kVar != null) {
                        Object[] objArr = zVar.f26442c;
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
                                            C.A(f9.B0(), null, new C2887i(f9, (p202z.m) objArr[(i3 << 3) + i11], null), 3);
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
                            C.A(f9.B0(), null, new C2889j(f9, mVar2, null), 3);
                        }
                    }
                    zVar.a();
                    f9.f28831L = null;
                }
                return A.f22523a;
            case 11:
                String p10 = (String) obj;
                m.e(p10, "p0");
                d1 d1Var = (d1) this.receiver;
                d1Var.getClass();
                return Boolean.valueOf(d1Var.f29437e.Q(p10));
            case 12:
                String p11 = (String) obj;
                m.e(p11, "p0");
                d1 d1Var2 = (d1) this.receiver;
                d1Var2.getClass();
                return d1Var2.f29440i.j(p11);
            case 13:
                EnumC0862a p12 = (EnumC0862a) obj;
                m.e(p12, "p0");
                d1 d1Var3 = (d1) this.receiver;
                d1Var3.getClass();
                C.A(X.h(d1Var3), null, new b1(d1Var3, p12, null), 3);
                return A.f22523a;
            case 14:
                EnumC0868g p13 = (EnumC0868g) obj;
                m.e(p13, "p0");
                d1 d1Var4 = (d1) this.receiver;
                d1Var4.getClass();
                C.A(X.h(d1Var4), null, new c1(d1Var4, p13, null), 3);
                return A.f22523a;
            case 15:
                XtreamLiveStream p14 = (XtreamLiveStream) obj;
                m.e(p14, "p0");
                ((s1) this.receiver).r(p14);
                return A.f22523a;
            case 16:
                XtreamLiveStream p15 = (XtreamLiveStream) obj;
                m.e(p15, "p0");
                ((s1) this.receiver).r(p15);
                return A.f22523a;
            case 17:
                String p16 = (String) obj;
                m.e(p16, "p0");
                s1 s1Var = (s1) this.receiver;
                s1Var.getClass();
                return s1Var.f31622h.j(p16);
            case 18:
                String p17 = (String) obj;
                m.e(p17, "p0");
                s1 s1Var2 = (s1) this.receiver;
                s1Var2.getClass();
                return Boolean.valueOf(s1Var2.f31621f.Q(p17));
            case 19:
                EnumC0862a p18 = (EnumC0862a) obj;
                m.e(p18, "p0");
                s1 s1Var3 = (s1) this.receiver;
                s1Var3.getClass();
                C.A(X.h(s1Var3), null, new q1(s1Var3, p18, null), 3);
                return A.f22523a;
            case 20:
                EnumC0868g p19 = (EnumC0868g) obj;
                m.e(p19, "p0");
                s1 s1Var4 = (s1) this.receiver;
                s1Var4.getClass();
                C.A(X.h(s1Var4), null, new r1(s1Var4, p19, null), 3);
                return A.f22523a;
            case 21:
                InterfaceC3137q p20 = (InterfaceC3137q) obj;
                m.e(p20, "p0");
                s1 s1Var5 = (s1) this.receiver;
                s1Var5.getClass();
                n0 n0Var = s1Var5.f31630q;
                if (!m.a(((C3138q0) n0Var.getValue()).f31585c, p20)) {
                    C3127l c3127l = s1Var5.f31627n;
                    c3127l.getClass();
                    n0 n0Var2 = c3127l.f31524a;
                    n0Var2.getClass();
                    n0Var2.i(null, p20);
                    while (true) {
                        Object value = n0Var.getValue();
                        n0 n0Var3 = n0Var;
                        if (!n0Var3.g(value, C3138q0.a((C3138q0) value, false, null, p20, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, 0, null, null, false, null, null, null, null, null, null, null, null, null, null, null, -201331205, 3))) {
                            n0Var = n0Var3;
                        }
                    }
                }
                return A.f22523a;
            case 22:
                EnumC0862a p21 = (EnumC0862a) obj;
                m.e(p21, "p0");
                s1 s1Var6 = (s1) this.receiver;
                s1Var6.getClass();
                C.A(X.h(s1Var6), null, new q1(s1Var6, p21, null), 3);
                return A.f22523a;
            case 23:
                EnumC0868g p22 = (EnumC0868g) obj;
                m.e(p22, "p0");
                s1 s1Var7 = (s1) this.receiver;
                s1Var7.getClass();
                C.A(X.h(s1Var7), null, new r1(s1Var7, p22, null), 3);
                return A.f22523a;
            case 24:
                EPGProgram p23 = (EPGProgram) obj;
                m.e(p23, "p0");
                s1 s1Var8 = (s1) this.receiver;
                s1Var8.getClass();
                Map map = ((C3138q0) s1Var8.f31630q.getValue()).f31582G;
                String str2 = p23.f19738a;
                if (!map.containsKey(str2) && s1Var8.f31636w.add(str2)) {
                    C.A(X.h(s1Var8), null, new j1(p23, s1Var8, null), 3);
                }
                return A.f22523a;
            case 25:
                String p24 = (String) obj;
                m.e(p24, "p0");
                p208z5.X x9 = (p208z5.X) this.receiver;
                x9.getClass();
                return Boolean.valueOf(x9.j.Q(p24));
            case 26:
                String p25 = (String) obj;
                m.e(p25, "p0");
                J1 j9 = (J1) this.receiver;
                j9.getClass();
                return Boolean.valueOf(j9.g.Q(p25));
            case 27:
                EnumC0862a p26 = (EnumC0862a) obj;
                m.e(p26, "p0");
                J1 j10 = (J1) this.receiver;
                j10.getClass();
                C.A(X.h(j10), null, new H1(j10, p26, null), 3);
                return A.f22523a;
            case 28:
                EnumC0868g p27 = (EnumC0868g) obj;
                m.e(p27, "p0");
                J1 j11 = (J1) this.receiver;
                j11.getClass();
                C.A(X.h(j11), null, new I1(j11, p27, null), 3);
                return A.f22523a;
            default:
                String p28 = (String) obj;
                m.e(p28, "p0");
                ((d) this.receiver).getClass();
                return d.a(p28);
        }
    }

    public n(d1 d1Var, int i3) {
        super(1, 0, d1.class, d1Var, "verifyPin", "verifyPin(Ljava/lang/String;)Z");
        this.f15483h = i3;
        switch (i3) {
            case 12:
                super(1, 0, d1.class, d1Var, "searchGuideChannels", "searchGuideChannels(Ljava/lang/String;)Ljava/util/List;");
                break;
            default:
                break;
        }
    }

    public n(s1 s1Var, int i3) {
        super(1, 0, s1.class, s1Var, "onChannelFocused", "onChannelFocused(Lcom/kiptv/core/model/XtreamLiveStream;)V");
        this.f15483h = i3;
        switch (i3) {
            case 16:
                super(1, 0, s1.class, s1Var, "onChannelFocused", "onChannelFocused(Lcom/kiptv/core/model/XtreamLiveStream;)V");
                break;
            case 17:
                super(1, 0, s1.class, s1Var, "searchGuideChannels", "searchGuideChannels(Ljava/lang/String;)Ljava/util/List;");
                break;
            case 18:
                super(1, 0, s1.class, s1Var, "verifyPin", "verifyPin(Ljava/lang/String;)Z");
                break;
            case 19:
                super(1, 0, s1.class, s1Var, "updateCategorySortOrder", "updateCategorySortOrder(Lcom/kiptv/core/helper/CategorySortType;)V");
                break;
            case 20:
                super(1, 0, s1.class, s1Var, "updateContentSortOrder", "updateContentSortOrder(Lcom/kiptv/core/helper/ContentSortType;)V");
                break;
            case 21:
                super(1, 0, s1.class, s1Var, "selectSidebar", "selectSidebar(Lcom/kiptv/tv/ui/livetv/TvLiveSidebarSel;)V");
                break;
            case 22:
                super(1, 0, s1.class, s1Var, "updateCategorySortOrder", "updateCategorySortOrder(Lcom/kiptv/core/helper/CategorySortType;)V");
                break;
            case 23:
                super(1, 0, s1.class, s1Var, "updateContentSortOrder", "updateContentSortOrder(Lcom/kiptv/core/helper/ContentSortType;)V");
                break;
            case 24:
                super(1, 0, s1.class, s1Var, "requestProgramArtwork", "requestProgramArtwork(Lcom/kiptv/core/model/EPGProgram;)V");
                break;
            default:
                break;
        }
    }

    public n(p208z5.X x9) {
        super(1, 0, p208z5.X.class, x9, "verifyPin", "verifyPin(Ljava/lang/String;)Z");
        this.f15483h = 25;
    }

    public n(J1 j9, int i3) {
        super(1, 0, J1.class, j9, "verifyPin", "verifyPin(Ljava/lang/String;)Z");
        this.f15483h = i3;
        switch (i3) {
            case 27:
                super(1, 0, J1.class, j9, "updateCategorySortOrder", "updateCategorySortOrder(Lcom/kiptv/core/helper/CategorySortType;)V");
                break;
            case 28:
                super(1, 0, J1.class, j9, "updateContentSortOrder", "updateContentSortOrder(Lcom/kiptv/core/helper/ContentSortType;)V");
                break;
            default:
                break;
        }
    }
}
