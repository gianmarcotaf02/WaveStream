package p208z5;

import E2.d;
import S7.C;
import V7.W;
import V7.l0;
import V7.n0;
import V7.r;
import Y4.Q0;
import androidx.lifecycle.U;
import androidx.lifecycle.e0;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.M0;
import com.google.common.util.concurrent.P;
import com.kiptv.core.model.EnumC1937d;
import com.kiptv.core.model.ParentalControlSettings;
import com.kiptv.core.model.TMDBMovieDetail;
import com.kiptv.core.model.TMDBSearchResult;
import com.kiptv.core.model.WatchProgress;
import com.kiptv.core.model.XtreamVODStream;
import com.kiptv.core.model.p0;
import com.kiptv.core.model.z0;
import com.kiptv.core.repository.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p005a5.C1263e6;
import p005a5.C1291h4;
import p005a5.C1366p;
import p005a5.C1379q2;
import p005a5.C1434v8;
import p005a5.C1451x5;
import p005a5.D0;
import p005a5.i9;
import p005a5.x9;
import p070h6.A;
import p070h6.k;
import p078i6.o;
import p078i6.q;
import p078i6.w;
import p117n6.c;
import p132p5.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz5/X;", "Landroidx/lifecycle/e0;", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class X extends e0 {

    public final x9 f32585b;

    public final C1451x5 f32586c;

    public final b f32587d;

    public final C1263e6 f32588e;

    public final i9 f32589f;
    public final D0 g;

    public final C1434v8 f32590h;

    public final C1366p f32591i;
    public final C1291h4 j;

    public final C1379q2 f32592k;

    public final a f32593l;

    public final d f32594m;

    public final int f32595n;

    public final Integer f32596o;

    public final n0 f32597p;

    public final W f32598q;

    public X(U savedStateHandle, x9 xtreamRepository, C1451x5 tmdbRepository, b traktRatingsRepository, C1263e6 traktAccountRepository, i9 watchProgressRepository, D0 myListRepository, C1434v8 trendingRepository, C1366p contentCacheRepository, C1291h4 settingsRepository, C1379q2 purchaseRepository, a appConfig, d dVar) {
        m.e(savedStateHandle, "savedStateHandle");
        m.e(xtreamRepository, "xtreamRepository");
        m.e(tmdbRepository, "tmdbRepository");
        m.e(traktRatingsRepository, "traktRatingsRepository");
        m.e(traktAccountRepository, "traktAccountRepository");
        m.e(watchProgressRepository, "watchProgressRepository");
        m.e(myListRepository, "myListRepository");
        m.e(trendingRepository, "trendingRepository");
        m.e(contentCacheRepository, "contentCacheRepository");
        m.e(settingsRepository, "settingsRepository");
        m.e(purchaseRepository, "purchaseRepository");
        m.e(appConfig, "appConfig");
        this.f32585b = xtreamRepository;
        this.f32586c = tmdbRepository;
        this.f32587d = traktRatingsRepository;
        this.f32588e = traktAccountRepository;
        this.f32589f = watchProgressRepository;
        this.g = myListRepository;
        this.f32590h = trendingRepository;
        this.f32591i = contentCacheRepository;
        this.j = settingsRepository;
        this.f32592k = purchaseRepository;
        this.f32593l = appConfig;
        this.f32594m = dVar;
        Integer num = (Integer) savedStateHandle.a("streamId");
        int iIntValue = num != null ? num.intValue() : 0;
        this.f32595n = iIntValue;
        Integer numValueOf = iIntValue < 0 ? Integer.valueOf(iIntValue) : null;
        Integer numValueOf2 = numValueOf != null ? Integer.valueOf(-numValueOf.intValue()) : null;
        this.f32596o = numValueOf2;
        w wVar = w.f23205h;
        n0 n0VarB = r.b(new C3224q(true, iIntValue, null, null, wVar, wVar, wVar, wVar, wVar, null, false, "https://image.tmdb.org/t/p", EnumC3182a.f32609h, wVar, null));
        this.f32597p = n0VarB;
        this.f32598q = new W(n0VarB);
        C.A(androidx.lifecycle.X.h(this), null, new C3229t(this, null), 3);
        if (numValueOf2 != null) {
            C.A(androidx.lifecycle.X.h(this), null, new H(numValueOf2.intValue(), null, this), 3);
        }
        C.A(androidx.lifecycle.X.h(this), null, new I(this, null), 3);
        C.A(androidx.lifecycle.X.h(this), null, new K(this, null), 3);
        C.A(androidx.lifecycle.X.h(this), null, new L(this, null), 3);
        C.A(androidx.lifecycle.X.h(this), null, new N(this, null), 3);
    }

    public static final Object e(X x9, int i3, c cVar) {
        C3235w c3235w;
        Object value;
        Object value2;
        Object value3;
        X x10 = x9;
        x10.getClass();
        if (cVar instanceof C3235w) {
            c3235w = (C3235w) cVar;
            int i9 = c3235w.f32870k;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c3235w.f32870k = i9 - Integer.MIN_VALUE;
            } else {
                c3235w = new C3235w(x10, cVar);
            }
        } else {
            c3235w = new C3235w(x10, cVar);
        }
        Object objM = c3235w.f32869i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c3235w.f32870k;
        try {
            if (i10 == 0) {
                P.u0(objM);
                E e6 = new E(i3, null, x10);
                c3235w.f32868h = x10;
                c3235w.f32870k = 1;
                objM = C.m(e6, c3235w);
                if (objM == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x10 = c3235w.f32868h;
                P.u0(objM);
            }
            n0 n0Var = x10.f32597p;
            do {
                value3 = n0Var.getValue();
            } while (!n0Var.g(value3, C3224q.a((C3224q) value3, 0, null, null, null, null, null, null, null, null, false, null, null, null, 32766)));
        } catch (Exception unused) {
            n0 n0Var2 = x10.f32597p;
            do {
                value2 = n0Var2.getValue();
            } while (!n0Var2.g(value2, C3224q.a((C3224q) value2, 0, null, null, null, null, null, null, null, null, false, null, null, null, 32766)));
        } catch (Throwable th) {
            n0 n0Var3 = x10.f32597p;
            do {
                value = n0Var3.getValue();
            } while (!n0Var3.g(value, C3224q.a((C3224q) value, 0, null, null, null, null, null, null, null, null, false, null, null, null, 32766)));
            throw th;
        }
        return A.f22523a;
    }

    public static final Object f(X x9, p100l6.c cVar) {
        O o8;
        boolean zF;
        WatchProgress watchProgress;
        Object objL;
        boolean z6;
        WatchProgress watchProgress2;
        n0 n0Var;
        Object value;
        X x10 = x9;
        x10.getClass();
        if (cVar instanceof O) {
            o8 = (O) cVar;
            int i3 = o8.f32544l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o8.f32544l = i3 - Integer.MIN_VALUE;
            } else {
                o8 = new O(x10, cVar);
            }
        } else {
            o8 = new O(x10, cVar);
        }
        O o9 = o8;
        Object obj = o9.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = o9.f32544l;
        if (i9 == 0) {
            P.u0(obj);
            zF = x10.g.f(x10.o(), z0.f20885i);
            String strQ = x10.q();
            if (strQ != null) {
                o9.f32541h = x10;
                o9.f32542i = zF;
                o9.f32544l = 1;
                objL = x10.f32589f.l(null, null, strQ, null, o9);
                if (objL == aVar) {
                    return aVar;
                }
            } else {
                watchProgress = null;
            }
            z6 = zF;
            watchProgress2 = watchProgress;
            n0Var = x10.f32597p;
            do {
                value = n0Var.getValue();
            } while (!n0Var.g(value, C3224q.a((C3224q) value, 0, null, null, null, null, null, null, null, watchProgress2, z6, null, null, null, 31231)));
            return A.f22523a;
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean z9 = o9.f32542i;
        X x11 = o9.f32541h;
        P.u0(obj);
        objL = obj;
        zF = z9;
        x10 = x11;
        watchProgress = (WatchProgress) objL;
        z6 = zF;
        watchProgress2 = watchProgress;
        n0Var = x10.f32597p;
        do {
            value = n0Var.getValue();
        } while (!n0Var.g(value, C3224q.a((C3224q) value, 0, null, null, null, null, null, null, null, watchProgress2, z6, null, null, null, 31231)));
        return A.f22523a;
    }

    public static final Object g(X x9, XtreamVODStream xtreamVODStream, c cVar) {
        Q q9;
        Object objT;
        Integer numC;
        x9.getClass();
        if (cVar instanceof Q) {
            q9 = (Q) cVar;
            int i3 = q9.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q9.j = i3 - Integer.MIN_VALUE;
            } else {
                q9 = new Q(x9, cVar);
            }
        } else {
            q9 = new Q(x9, cVar);
        }
        Q q10 = q9;
        Object objH = q10.f32554h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = q10.j;
        try {
            if (i9 == 0) {
                P.u0(objH);
                Integer numO = x9.j.o(x9.f32595n);
                if (numO != null) {
                    Integer num = new Integer(numO.intValue());
                    if (num.intValue() > 0) {
                        return num;
                    }
                } else {
                    if (xtreamVODStream != null && (numC = xtreamVODStream.c()) != null) {
                        return new Integer(numC.intValue());
                    }
                    if (xtreamVODStream != null) {
                        C1451x5 c1451x5 = x9.f32586c;
                        String str = xtreamVODStream.f20723b;
                        String str2 = xtreamVODStream.f20732m;
                        q10.j = 1;
                        objH = C1451x5.h(c1451x5, str, null, str2, false, q10, 10);
                        if (objH == aVar) {
                            return aVar;
                        }
                    }
                }
                return null;
            }
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(objH);
            objT = (p0) objH;
        } catch (Throwable th) {
            objT = P.T(th);
        }
        if (objT instanceof p070h6.m) {
            objT = null;
        }
        p0 p0Var = (p0) objT;
        if (p0Var != null) {
            return new Integer(p0Var.f20815a);
        }
        return null;
    }

    public final Object h(String str, c cVar) {
        r rVar;
        X x9;
        Integer num;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i3 = rVar.f32807k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rVar.f32807k = i3 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        r rVar2 = rVar;
        Object objC = rVar2.f32806i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = rVar2.f32807k;
        A a2 = A.f22523a;
        if (i9 == 0) {
            P.u0(objC);
            z0 z0Var = z0.f20885i;
            rVar2.f32805h = this;
            rVar2.f32807k = 1;
            objC = this.g.c(str, z0Var, rVar2);
            if (objC != aVar) {
                x9 = this;
            }
            return aVar;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(objC);
            return a2;
        }
        x9 = rVar2.f32805h;
        P.u0(objC);
        String str2 = (String) objC;
        if (str2 != null) {
            D0 d4 = x9.g;
            String strO = x9.o();
            z0 z0Var2 = z0.f20885i;
            n0 n0Var = x9.f32597p;
            String strJ = ((C3224q) n0Var.getValue()).j();
            String strP = x9.p();
            Integer numC = x9.f32596o;
            if (numC != null) {
                num = numC;
            } else {
                XtreamVODStream xtreamVODStream = ((C3224q) n0Var.getValue()).f32789c;
                if (xtreamVODStream != null) {
                    numC = xtreamVODStream.c();
                    num = numC;
                } else {
                    num = null;
                }
            }
            rVar2.f32805h = null;
            rVar2.f32807k = 2;
            if (d4.m(strO, z0Var2, str2, strJ, strP, num, rVar2) == aVar) {
                return aVar;
            }
        }
        return a2;
    }

    public final Integer i() {
        int i3 = ((C3224q) this.f32597p.getValue()).f32788b;
        Integer numValueOf = Integer.valueOf(i3);
        if (i3 <= 0) {
            numValueOf = null;
        }
        return this.j.o(numValueOf != null ? numValueOf.intValue() : this.f32595n);
    }

    public final l0 j() {
        return this.f32598q;
    }

    public final boolean k() {
        String str;
        XtreamVODStream xtreamVODStream = ((C3224q) this.f32597p.getValue()).f32789c;
        if (xtreamVODStream == null || (str = xtreamVODStream.f20731l) == null) {
            return false;
        }
        return ((ParentalControlSettings) ((n0) this.j.f14559m.f10419h).getValue()).f20019f.b(str, EnumC1937d.MOVIES);
    }

    public final boolean l() {
        String string;
        XtreamVODStream xtreamVODStream = ((C3224q) this.f32597p.getValue()).f32789c;
        if (xtreamVODStream == null || (string = Integer.valueOf(xtreamVODStream.f20725d).toString()) == null) {
            return false;
        }
        return ((ParentalControlSettings) ((n0) this.j.f14559m.f10419h).getValue()).g.b(string, EnumC1937d.MOVIES);
    }

    public final boolean m() {
        return this.j.h();
    }

    public final Object n(String str, boolean z6, c cVar) {
        F f9;
        X x9;
        if (cVar instanceof F) {
            f9 = (F) cVar;
            int i3 = f9.f32457m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f9.f32457m = i3 - Integer.MIN_VALUE;
            } else {
                f9 = new F(this, cVar);
            }
        } else {
            f9 = new F(this, cVar);
        }
        Object objH = f9.f32455k;
        Object obj = p109m6.a.f25430h;
        int i9 = f9.f32457m;
        A a2 = A.f22523a;
        if (i9 == 0) {
            P.u0(objH);
            z0 z0Var = z0.f20885i;
            f9.f32453h = this;
            f9.f32454i = str;
            f9.j = z6;
            f9.f32457m = 1;
            objH = this.g.h(z0Var, f9);
            if (objH != obj) {
                x9 = this;
            }
            return obj;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(objH);
            return a2;
        }
        z6 = f9.j;
        str = f9.f32454i;
        x9 = f9.f32453h;
        P.u0(objH);
        Iterable iterable = (Iterable) objH;
        ArrayList arrayList = new ArrayList(q.I0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((k) it.next()).f22539h);
        }
        ArrayList arrayListO1 = o.O1(arrayList);
        int iIndexOf = arrayListO1.indexOf(str);
        int i10 = z6 ? iIndexOf - 1 : iIndexOf + 1;
        if (iIndexOf >= 0 && i10 >= 0 && i10 < arrayListO1.size()) {
            Object obj2 = arrayListO1.get(i10);
            arrayListO1.set(i10, str);
            arrayListO1.set(iIndexOf, obj2);
            D0 d4 = x9.g;
            z0 z0Var2 = z0.f20885i;
            f9.f32453h = null;
            f9.f32454i = null;
            f9.f32457m = 2;
            if (d4.l(arrayListO1, z0Var2, f9) == obj) {
                return obj;
            }
        }
        return a2;
    }

    public final String o() {
        String strL;
        Integer num = this.f32596o;
        if (num != null && (strL = M0.l(num.intValue(), "tmdb:")) != null) {
            return strL;
        }
        String strQ = q();
        return strQ == null ? String.valueOf(this.f32595n) : strQ;
    }

    public final String p() {
        String strA;
        n0 n0Var = this.f32597p;
        XtreamVODStream xtreamVODStream = ((C3224q) n0Var.getValue()).f32789c;
        if (xtreamVODStream != null && (strA = xtreamVODStream.a()) != null) {
            return strA;
        }
        Y4.A a2 = Q0.Companion;
        TMDBMovieDetail tMDBMovieDetail = ((C3224q) n0Var.getValue()).f32790d;
        String str = tMDBMovieDetail != null ? tMDBMovieDetail.f20200f : null;
        this.f32593l.getClass();
        a2.getClass();
        return Y4.A.b(str, "w500", "https://image.tmdb.org/t/p");
    }

    public final String q() {
        int i3 = ((C3224q) this.f32597p.getValue()).f32788b;
        Integer numValueOf = Integer.valueOf(i3);
        if (i3 <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.toString();
        }
        return null;
    }

    public final Serializable r(String str, c cVar) {
        S s9;
        if (cVar instanceof S) {
            s9 = (S) cVar;
            int i3 = s9.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                s9.j = i3 - Integer.MIN_VALUE;
            } else {
                s9 = new S(this, cVar);
            }
        } else {
            s9 = new S(this, cVar);
        }
        Object objG = s9.f32561h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = s9.j;
        if (i9 == 0) {
            P.u0(objG);
            s9.j = 1;
            objG = this.f32586c.G(str, true, s9);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(objG);
        }
        Iterable<TMDBSearchResult> iterable = (Iterable) objG;
        ArrayList arrayList = new ArrayList(q.I0(iterable, 10));
        for (TMDBSearchResult tMDBSearchResult : iterable) {
            String strL = tMDBSearchResult.f20293b;
            int i10 = tMDBSearchResult.f20292a;
            if (strL == null && (strL = tMDBSearchResult.f20294c) == null && (strL = tMDBSearchResult.f20295d) == null) {
                strL = M0.l(i10, "#");
            }
            String str2 = tMDBSearchResult.f20299i;
            if (str2 == null) {
                str2 = tMDBSearchResult.j;
            }
            String strP1 = str2 != null ? O7.q.p1(4, str2) : null;
            Integer num = new Integer(i10);
            if (strP1 != null && !O7.q.N0(strP1)) {
                strL = strL + " (" + strP1 + ")";
            }
            arrayList.add(new k(num, strL));
        }
        return arrayList;
    }

    public final void s() {
        XtreamVODStream xtreamVODStream = ((C3224q) this.f32597p.getValue()).f32789c;
        if (xtreamVODStream == null) {
            return;
        }
        C.A(androidx.lifecycle.X.h(this), null, new W(this, xtreamVODStream, null), 3);
    }
}
