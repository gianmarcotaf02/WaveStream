package p116n5;

import B.AbstractC0079q;
import C5.AbstractC0113h;
import C5.Q;
import C5.S;
import O1.C0754s;
import O7.q;
import O7.r;
import Q0.C0772f;
import Q0.C0790y;
import Q0.InterfaceC0773g;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.common.util.concurrent.AbstractC1903s;
import com.kiptv.tv.TvActivity;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import p005a5.AbstractC1346n;
import p005a5.C1291h4;
import p005a5.C1296i;
import p005a5.C1316k;
import p005a5.C1326l;
import p005a5.I5;
import p015b5.t;
import p020c0.AbstractC1703s;
import p020c0.C1676e;
import p020c0.C1690l;
import p020c0.C1700q;
import p020c0.InterfaceC1691l0;
import p020c0.X;
import p070h6.A;
import p077i5.C2237d;
import p078i6.C2255f;
import p079i7.f;
import p112n0.l;
import p114n2.K;
import p125o5.d;
import p137q0.a;
import p137q0.c;
import p137q0.p;
import p194x6.m;

/* JADX INFO: loaded from: classes.dex */
public final class y implements m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f25827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TvActivity f25828i;

    public /* synthetic */ y(TvActivity tvActivity, int i3) {
        this.f25827h = i3;
        this.f25828i = tvActivity;
    }

    @Override // p194x6.m
    public final Object invoke(Object obj, Object obj2) {
        String str;
        switch (this.f25827h) {
            case 0:
                C1700q c1700q = (C1700q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c1700q.F()) {
                    c1700q.W();
                } else {
                    TvActivity tvActivity = this.f25828i;
                    C1296i c1296i = tvActivity.f21010J;
                    if (c1296i == null) {
                        kotlin.jvm.internal.m.k("authRepository");
                        throw null;
                    }
                    X xY = r.y(c1296i.f14592c, c1700q);
                    d dVar = tvActivity.f21011K;
                    if (dVar == null) {
                        kotlin.jvm.internal.m.k("onboardingPreferences");
                        throw null;
                    }
                    X x9 = r.x(dVar.f26141b, null, c1700q);
                    if (((Boolean) x9.getValue()) == null || (((AbstractC1346n) xY.getValue()) instanceof C1316k)) {
                        str = null;
                    } else if (((AbstractC1346n) xY.getValue()) instanceof C1326l) {
                        str = kotlin.jvm.internal.m.a((Boolean) x9.getValue(), Boolean.FALSE) ? "onboarding" : "playlist";
                    } else {
                        str = "pairing";
                    }
                    AbstractC1346n abstractC1346n = (AbstractC1346n) xY.getValue();
                    c1700q.c0(1961935049);
                    boolean zF = c1700q.f(xY) | c1700q.h(tvActivity);
                    Object objQ = c1700q.Q();
                    C1676e c1676e = C1690l.f18284a;
                    if (zF || objQ == c1676e) {
                        objQ = new u(tvActivity, xY, null);
                        c1700q.n0(objQ);
                    }
                    c1700q.p(false);
                    AbstractC1703s.e(c1700q, abstractC1346n, (m) objQ);
                    if (str != null) {
                        Context context = (Context) c1700q.j(AndroidCompositionLocals_androidKt.f15955b);
                        Object[] objArrCopyOf = Arrays.copyOf(new K[0], 0);
                        f fVar = new f(new p011b1.y(27), new C2255f(18, context), 2);
                        boolean zH = c1700q.h(context);
                        Object objQ2 = c1700q.Q();
                        if (zH || objQ2 == c1676e) {
                            objQ2 = new U4.r(context, 2);
                            c1700q.n0(objQ2);
                        }
                        p114n2.y yVar = (p114n2.y) l.d(objArrCopyOf, fVar, (Function0) objQ2, c1700q, 0, 4);
                        c1700q.c0(1962017024);
                        boolean zH2 = c1700q.h(yVar) | c1700q.h(tvActivity);
                        Object objQ3 = c1700q.Q();
                        if (zH2 || objQ3 == c1676e) {
                            objQ3 = new v(tvActivity, null, yVar);
                            c1700q.n0(objQ3);
                        }
                        c1700q.p(false);
                        AbstractC1703s.e(c1700q, yVar, (m) objQ3);
                        X xY2 = r.y(AbstractC0113h.f1339b, c1700q);
                        c1700q.c0(1962040717);
                        boolean zH3 = c1700q.h(yVar);
                        Object objQ4 = c1700q.Q();
                        if (zH3 || objQ4 == c1676e) {
                            objQ4 = new w(yVar, null);
                            c1700q.n0(objQ4);
                        }
                        c1700q.p(false);
                        AbstractC1703s.e(c1700q, yVar, (m) objQ4);
                        Boolean boolValueOf = Boolean.valueOf(((S) xY2.getValue()) != null);
                        c1700q.c0(1962055575);
                        boolean zH4 = c1700q.h(tvActivity) | c1700q.h(yVar);
                        Object objQ5 = c1700q.Q();
                        if (zH4 || objQ5 == c1676e) {
                            objQ5 = new x(tvActivity, null, yVar);
                            c1700q.n0(objQ5);
                        }
                        c1700q.p(false);
                        AbstractC1703s.e(c1700q, boolValueOf, (m) objQ5);
                        FillElement fillElement = b.f15791c;
                        O0.S sD = AbstractC0079q.d(c.f26449h, false);
                        int iHashCode = Long.hashCode(c1700q.f18323T);
                        InterfaceC1691l0 interfaceC1691l0L = c1700q.l();
                        p pVarC = a.c(c1700q, fillElement);
                        InterfaceC0773g.f8436c.getClass();
                        C0790y c0790y = C0772f.f8424b;
                        c1700q.g0();
                        if (c1700q.f18322S) {
                            c1700q.k(c0790y);
                        } else {
                            c1700q.q0();
                        }
                        AbstractC1703s.H(c1700q, sD, C0772f.f8427e);
                        AbstractC1703s.H(c1700q, interfaceC1691l0L, C0772f.f8426d);
                        AbstractC1703s.w(c1700q, Integer.valueOf(iHashCode), C0772f.f8428f);
                        AbstractC1703s.D(c1700q, C0772f.g);
                        AbstractC1703s.H(c1700q, pVarC, C0772f.f8425c);
                        c1700q.c0(1712865648);
                        boolean zH5 = c1700q.h(tvActivity);
                        Object objQ6 = c1700q.Q();
                        if (zH5 || objQ6 == c1676e) {
                            objQ6 = new C2237d(14, tvActivity);
                            c1700q.n0(objQ6);
                        }
                        c1700q.p(false);
                        AbstractC1903s.f(yVar, str, (Function0) objQ6, c1700q, 0);
                        Q.f(0, c1700q);
                        c1700q.p(true);
                    }
                }
                return A.f22523a;
            default:
                C1700q c1700q2 = (C1700q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c1700q2.F()) {
                    c1700q2.W();
                } else {
                    TvActivity tvActivity2 = this.f25828i;
                    I5 i9 = tvActivity2.f21015O;
                    if (i9 == null) {
                        kotlin.jvm.internal.m.k("themeRepository");
                        throw null;
                    }
                    X xY3 = r.y(i9.f13517e, c1700q2);
                    String str2 = (String) xY3.getValue();
                    c1700q2.c0(649410762);
                    boolean zF2 = c1700q2.f(xY3);
                    Object objQ7 = c1700q2.Q();
                    C1676e c1676e2 = C1690l.f18284a;
                    if (zF2 || objQ7 == c1676e2) {
                        objQ7 = new r(xY3, null);
                        c1700q2.n0(objQ7);
                    }
                    c1700q2.p(false);
                    AbstractC1703s.e(c1700q2, str2, (m) objQ7);
                    C1291h4 c1291h4 = tvActivity2.f21013M;
                    if (c1291h4 == null) {
                        kotlin.jvm.internal.m.k("settingsRepository");
                        throw null;
                    }
                    X x10 = r.x(new C0754s(4, c1291h4.g), "black", c1700q2);
                    String str3 = (String) x10.getValue();
                    c1700q2.c0(649431896);
                    boolean zF3 = c1700q2.f(x10);
                    Object objQ8 = c1700q2.Q();
                    if (zF3 || objQ8 == c1676e2) {
                        objQ8 = new s(x10, null);
                        c1700q2.n0(objQ8);
                    }
                    c1700q2.p(false);
                    AbstractC1703s.e(c1700q2, str3, (m) objQ8);
                    t tVar = tvActivity2.f21017Q;
                    if (tVar == null) {
                        kotlin.jvm.internal.m.k("localizationService");
                        throw null;
                    }
                    X xY4 = r.y(tVar.f17998d, c1700q2);
                    p015b5.p pVar = t.Companion;
                    String language = (String) xY4.getValue();
                    pVar.getClass();
                    kotlin.jvm.internal.m.e(language, "language");
                    Set set = t.f17993l;
                    String lowerCase = q.m1(language, "-").toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                    p060g5.c.a(set.contains(lowerCase), p089k0.f.d(-2128649478, new y(tvActivity2, 0), c1700q2), c1700q2, 48);
                }
                return A.f22523a;
        }
    }
}
