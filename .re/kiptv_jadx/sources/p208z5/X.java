package p208z5;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz5/X;", "Landroidx/lifecycle/e0;", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class X extends androidx.lifecycle.e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.x9 f32585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.C1451x5 f32586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.kiptv.core.repository.b f32587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p005a5.C1263e6 f32588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p005a5.i9 f32589f;
    public final p005a5.D0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p005a5.C1434v8 f32590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p005a5.C1366p f32591i;
    public final p005a5.C1291h4 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p005a5.C1379q2 f32592k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p132p5.a f32593l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final E2.d f32594m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f32595n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.Integer f32596o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final V7.n0 f32597p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final V7.W f32598q;

    public X(androidx.lifecycle.U savedStateHandle, p005a5.x9 xtreamRepository, p005a5.C1451x5 tmdbRepository, com.kiptv.core.repository.b traktRatingsRepository, p005a5.C1263e6 traktAccountRepository, p005a5.i9 watchProgressRepository, p005a5.D0 myListRepository, p005a5.C1434v8 trendingRepository, p005a5.C1366p contentCacheRepository, p005a5.C1291h4 settingsRepository, p005a5.C1379q2 purchaseRepository, p132p5.a appConfig, E2.d dVar) {
        kotlin.jvm.internal.m.e(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.m.e(xtreamRepository, "xtreamRepository");
        kotlin.jvm.internal.m.e(tmdbRepository, "tmdbRepository");
        kotlin.jvm.internal.m.e(traktRatingsRepository, "traktRatingsRepository");
        kotlin.jvm.internal.m.e(traktAccountRepository, "traktAccountRepository");
        kotlin.jvm.internal.m.e(watchProgressRepository, "watchProgressRepository");
        kotlin.jvm.internal.m.e(myListRepository, "myListRepository");
        kotlin.jvm.internal.m.e(trendingRepository, "trendingRepository");
        kotlin.jvm.internal.m.e(contentCacheRepository, "contentCacheRepository");
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.m.e(purchaseRepository, "purchaseRepository");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
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
        java.lang.Integer num = (java.lang.Integer) savedStateHandle.a("streamId");
        int iIntValue = num != null ? num.intValue() : 0;
        this.f32595n = iIntValue;
        java.lang.Integer numValueOf = iIntValue < 0 ? java.lang.Integer.valueOf(iIntValue) : null;
        java.lang.Integer numValueOf2 = numValueOf != null ? java.lang.Integer.valueOf(-numValueOf.intValue()) : null;
        this.f32596o = numValueOf2;
        p078i6.w wVar = p078i6.w.f23205h;
        V7.n0 n0VarB = V7.r.b(new p208z5.C3224q(true, iIntValue, null, null, wVar, wVar, wVar, wVar, wVar, null, false, "https://image.tmdb.org/t/p", p208z5.EnumC3182a.f32609h, wVar, null));
        this.f32597p = n0VarB;
        this.f32598q = new V7.W(n0VarB);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.C3229t(this, null), 3);
        if (numValueOf2 != null) {
            S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.H(numValueOf2.intValue(), null, this), 3);
        }
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.I(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.K(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.L(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.N(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final java.lang.Object e(p208z5.X x9, int i3, p117n6.c cVar) {
        p208z5.C3235w c3235w;
        java.lang.Object value;
        java.lang.Object value2;
        java.lang.Object value3;
        p208z5.X x10 = x9;
        x10.getClass();
        if (cVar instanceof p208z5.C3235w) {
            c3235w = (p208z5.C3235w) cVar;
            int i9 = c3235w.f32870k;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c3235w.f32870k = i9 - Integer.MIN_VALUE;
            } else {
                c3235w = new p208z5.C3235w(x10, cVar);
            }
        } else {
            c3235w = new p208z5.C3235w(x10, cVar);
        }
        java.lang.Object objM = c3235w.f32869i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c3235w.f32870k;
        try {
            if (i10 == 0) {
                com.google.common.util.concurrent.P.u0(objM);
                p208z5.E e6 = new p208z5.E(i3, null, x10);
                c3235w.f32868h = x10;
                c3235w.f32870k = 1;
                objM = S7.C.m(e6, c3235w);
                if (objM == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x10 = c3235w.f32868h;
                com.google.common.util.concurrent.P.u0(objM);
            }
            V7.n0 n0Var = x10.f32597p;
            do {
                value3 = n0Var.getValue();
            } while (!n0Var.g(value3, p208z5.C3224q.a((p208z5.C3224q) value3, 0, null, null, null, null, null, null, null, null, false, null, null, null, 32766)));
        } catch (java.lang.Exception unused) {
            V7.n0 n0Var2 = x10.f32597p;
            do {
                value2 = n0Var2.getValue();
            } while (!n0Var2.g(value2, p208z5.C3224q.a((p208z5.C3224q) value2, 0, null, null, null, null, null, null, null, null, false, null, null, null, 32766)));
        } catch (java.lang.Throwable th) {
            V7.n0 n0Var3 = x10.f32597p;
            do {
                value = n0Var3.getValue();
            } while (!n0Var3.g(value, p208z5.C3224q.a((p208z5.C3224q) value, 0, null, null, null, null, null, null, null, null, false, null, null, null, 32766)));
            throw th;
        }
        return p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public static final java.lang.Object f(p208z5.X x9, p100l6.c cVar) {
        p208z5.O o8;
        boolean zF;
        com.kiptv.core.model.WatchProgress watchProgress;
        java.lang.Object objL;
        boolean z6;
        com.kiptv.core.model.WatchProgress watchProgress2;
        V7.n0 n0Var;
        java.lang.Object value;
        p208z5.X x10 = x9;
        x10.getClass();
        if (cVar instanceof p208z5.O) {
            o8 = (p208z5.O) cVar;
            int i3 = o8.f32544l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o8.f32544l = i3 - Integer.MIN_VALUE;
            } else {
                o8 = new p208z5.O(x10, cVar);
            }
        } else {
            o8 = new p208z5.O(x10, cVar);
        }
        p208z5.O o9 = o8;
        java.lang.Object obj = o9.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = o9.f32544l;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            zF = x10.g.f(x10.o(), com.kiptv.core.model.z0.f20885i);
            java.lang.String strQ = x10.q();
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
            } while (!n0Var.g(value, p208z5.C3224q.a((p208z5.C3224q) value, 0, null, null, null, null, null, null, null, watchProgress2, z6, null, null, null, 31231)));
            return p070h6.A.f22523a;
        }
        if (i9 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean z9 = o9.f32542i;
        p208z5.X x11 = o9.f32541h;
        com.google.common.util.concurrent.P.u0(obj);
        objL = obj;
        zF = z9;
        x10 = x11;
        watchProgress = (com.kiptv.core.model.WatchProgress) objL;
        z6 = zF;
        watchProgress2 = watchProgress;
        n0Var = x10.f32597p;
        do {
            value = n0Var.getValue();
        } while (!n0Var.g(value, p208z5.C3224q.a((p208z5.C3224q) value, 0, null, null, null, null, null, null, null, watchProgress2, z6, null, null, null, 31231)));
        return p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final java.lang.Object g(p208z5.X x9, com.kiptv.core.model.XtreamVODStream xtreamVODStream, p117n6.c cVar) {
        p208z5.Q q9;
        java.lang.Object objT;
        java.lang.Integer numC;
        x9.getClass();
        if (cVar instanceof p208z5.Q) {
            q9 = (p208z5.Q) cVar;
            int i3 = q9.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q9.j = i3 - Integer.MIN_VALUE;
            } else {
                q9 = new p208z5.Q(x9, cVar);
            }
        } else {
            q9 = new p208z5.Q(x9, cVar);
        }
        p208z5.Q q10 = q9;
        java.lang.Object objH = q10.f32554h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = q10.j;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objH);
                java.lang.Integer numO = x9.j.o(x9.f32595n);
                if (numO != null) {
                    java.lang.Integer num = new java.lang.Integer(numO.intValue());
                    if (num.intValue() > 0) {
                        return num;
                    }
                } else {
                    if (xtreamVODStream != null && (numC = xtreamVODStream.c()) != null) {
                        return new java.lang.Integer(numC.intValue());
                    }
                    if (xtreamVODStream != null) {
                        p005a5.C1451x5 c1451x5 = x9.f32586c;
                        java.lang.String str = xtreamVODStream.f20723b;
                        java.lang.String str2 = xtreamVODStream.f20732m;
                        q10.j = 1;
                        objH = p005a5.C1451x5.h(c1451x5, str, null, str2, false, q10, 10);
                        if (objH == aVar) {
                            return aVar;
                        }
                    }
                }
                return null;
            }
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objH);
            objT = (com.kiptv.core.model.p0) objH;
        } catch (java.lang.Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
        if (objT instanceof p070h6.m) {
            objT = null;
        }
        com.kiptv.core.model.p0 p0Var = (com.kiptv.core.model.p0) objT;
        if (p0Var != null) {
            return new java.lang.Integer(p0Var.f20815a);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object h(java.lang.String str, p117n6.c cVar) {
        p208z5.r rVar;
        p208z5.X x9;
        java.lang.Integer num;
        if (cVar instanceof p208z5.r) {
            rVar = (p208z5.r) cVar;
            int i3 = rVar.f32807k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rVar.f32807k = i3 - Integer.MIN_VALUE;
            } else {
                rVar = new p208z5.r(this, cVar);
            }
        } else {
            rVar = new p208z5.r(this, cVar);
        }
        p208z5.r rVar2 = rVar;
        java.lang.Object objC = rVar2.f32806i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = rVar2.f32807k;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objC);
            com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.f20885i;
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
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objC);
            return a2;
        }
        x9 = rVar2.f32805h;
        com.google.common.util.concurrent.P.u0(objC);
        java.lang.String str2 = (java.lang.String) objC;
        if (str2 != null) {
            p005a5.D0 d4 = x9.g;
            java.lang.String strO = x9.o();
            com.kiptv.core.model.z0 z0Var2 = com.kiptv.core.model.z0.f20885i;
            V7.n0 n0Var = x9.f32597p;
            java.lang.String strJ = ((p208z5.C3224q) n0Var.getValue()).j();
            java.lang.String strP = x9.p();
            java.lang.Integer numC = x9.f32596o;
            if (numC != null) {
                num = numC;
            } else {
                com.kiptv.core.model.XtreamVODStream xtreamVODStream = ((p208z5.C3224q) n0Var.getValue()).f32789c;
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

    public final java.lang.Integer i() {
        int i3 = ((p208z5.C3224q) this.f32597p.getValue()).f32788b;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i3);
        if (i3 <= 0) {
            numValueOf = null;
        }
        return this.j.o(numValueOf != null ? numValueOf.intValue() : this.f32595n);
    }

    public final V7.l0 j() {
        return this.f32598q;
    }

    public final boolean k() {
        java.lang.String str;
        com.kiptv.core.model.XtreamVODStream xtreamVODStream = ((p208z5.C3224q) this.f32597p.getValue()).f32789c;
        if (xtreamVODStream == null || (str = xtreamVODStream.f20731l) == null) {
            return false;
        }
        return ((com.kiptv.core.model.ParentalControlSettings) ((V7.n0) this.j.f14559m.f10419h).getValue()).f20019f.b(str, com.kiptv.core.model.EnumC1937d.MOVIES);
    }

    public final boolean l() {
        java.lang.String string;
        com.kiptv.core.model.XtreamVODStream xtreamVODStream = ((p208z5.C3224q) this.f32597p.getValue()).f32789c;
        if (xtreamVODStream == null || (string = java.lang.Integer.valueOf(xtreamVODStream.f20725d).toString()) == null) {
            return false;
        }
        return ((com.kiptv.core.model.ParentalControlSettings) ((V7.n0) this.j.f14559m.f10419h).getValue()).g.b(string, com.kiptv.core.model.EnumC1937d.MOVIES);
    }

    public final boolean m() {
        return this.j.h();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(java.lang.String str, boolean z6, p117n6.c cVar) {
        p208z5.F f9;
        p208z5.X x9;
        if (cVar instanceof p208z5.F) {
            f9 = (p208z5.F) cVar;
            int i3 = f9.f32457m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f9.f32457m = i3 - Integer.MIN_VALUE;
            } else {
                f9 = new p208z5.F(this, cVar);
            }
        } else {
            f9 = new p208z5.F(this, cVar);
        }
        java.lang.Object objH = f9.f32455k;
        java.lang.Object obj = p109m6.a.f25430h;
        int i9 = f9.f32457m;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objH);
            com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.f20885i;
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
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objH);
            return a2;
        }
        z6 = f9.j;
        str = f9.f32454i;
        x9 = f9.f32453h;
        com.google.common.util.concurrent.P.u0(objH);
        java.lang.Iterable iterable = (java.lang.Iterable) objH;
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) ((p070h6.k) it.next()).f22539h);
        }
        java.util.ArrayList arrayListO1 = p078i6.o.O1(arrayList);
        int iIndexOf = arrayListO1.indexOf(str);
        int i10 = z6 ? iIndexOf - 1 : iIndexOf + 1;
        if (iIndexOf >= 0 && i10 >= 0 && i10 < arrayListO1.size()) {
            java.lang.Object obj2 = arrayListO1.get(i10);
            arrayListO1.set(i10, str);
            arrayListO1.set(iIndexOf, obj2);
            p005a5.D0 d4 = x9.g;
            com.kiptv.core.model.z0 z0Var2 = com.kiptv.core.model.z0.f20885i;
            f9.f32453h = null;
            f9.f32454i = null;
            f9.f32457m = 2;
            if (d4.l(arrayListO1, z0Var2, f9) == obj) {
                return obj;
            }
        }
        return a2;
    }

    public final java.lang.String o() {
        java.lang.String strL;
        java.lang.Integer num = this.f32596o;
        if (num != null && (strL = com.google.android.gms.internal.play_billing.M0.l(num.intValue(), "tmdb:")) != null) {
            return strL;
        }
        java.lang.String strQ = q();
        return strQ == null ? java.lang.String.valueOf(this.f32595n) : strQ;
    }

    public final java.lang.String p() {
        java.lang.String strA;
        V7.n0 n0Var = this.f32597p;
        com.kiptv.core.model.XtreamVODStream xtreamVODStream = ((p208z5.C3224q) n0Var.getValue()).f32789c;
        if (xtreamVODStream != null && (strA = xtreamVODStream.a()) != null) {
            return strA;
        }
        Y4.A a2 = Y4.Q0.Companion;
        com.kiptv.core.model.TMDBMovieDetail tMDBMovieDetail = ((p208z5.C3224q) n0Var.getValue()).f32790d;
        java.lang.String str = tMDBMovieDetail != null ? tMDBMovieDetail.f20200f : null;
        this.f32593l.getClass();
        a2.getClass();
        return Y4.A.b(str, "w500", "https://image.tmdb.org/t/p");
    }

    public final java.lang.String q() {
        int i3 = ((p208z5.C3224q) this.f32597p.getValue()).f32788b;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i3);
        if (i3 <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.toString();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.io.Serializable r(java.lang.String str, p117n6.c cVar) {
        p208z5.S s9;
        if (cVar instanceof p208z5.S) {
            s9 = (p208z5.S) cVar;
            int i3 = s9.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                s9.j = i3 - Integer.MIN_VALUE;
            } else {
                s9 = new p208z5.S(this, cVar);
            }
        } else {
            s9 = new p208z5.S(this, cVar);
        }
        java.lang.Object objG = s9.f32561h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = s9.j;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objG);
            s9.j = 1;
            objG = this.f32586c.G(str, true, s9);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objG);
        }
        java.lang.Iterable<com.kiptv.core.model.TMDBSearchResult> iterable = (java.lang.Iterable) objG;
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(iterable, 10));
        for (com.kiptv.core.model.TMDBSearchResult tMDBSearchResult : iterable) {
            java.lang.String strL = tMDBSearchResult.f20293b;
            int i10 = tMDBSearchResult.f20292a;
            if (strL == null && (strL = tMDBSearchResult.f20294c) == null && (strL = tMDBSearchResult.f20295d) == null) {
                strL = com.google.android.gms.internal.play_billing.M0.l(i10, "#");
            }
            java.lang.String str2 = tMDBSearchResult.f20299i;
            if (str2 == null) {
                str2 = tMDBSearchResult.j;
            }
            java.lang.String strP1 = str2 != null ? O7.q.p1(4, str2) : null;
            java.lang.Integer num = new java.lang.Integer(i10);
            if (strP1 != null && !O7.q.N0(strP1)) {
                strL = strL + " (" + strP1 + ")";
            }
            arrayList.add(new p070h6.k(num, strL));
        }
        return arrayList;
    }

    public final void s() {
        com.kiptv.core.model.XtreamVODStream xtreamVODStream = ((p208z5.C3224q) this.f32597p.getValue()).f32789c;
        if (xtreamVODStream == null) {
            return;
        }
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.W(this, xtreamVODStream, null), 3);
    }
}
