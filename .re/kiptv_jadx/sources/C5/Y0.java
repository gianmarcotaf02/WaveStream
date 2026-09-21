package C5;

/* JADX INFO: loaded from: classes4.dex */
public final class Y0 implements V7.InterfaceC0982h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C5.c2 f1180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1181i;
    public final /* synthetic */ p077i5.P j;

    public Y0(C5.c2 c2Var, int i3, p077i5.P p2) {
        this.f1180h = c2Var;
        this.f1181i = i3;
        this.j = p2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02d8, code lost:
    
        if (r0.emit(r2, r3) == r4) goto L135;
     */
    @Override // V7.InterfaceC0982h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(p099l5.m mVar, p100l6.c cVar) {
        C5.X0 x9;
        java.lang.Object value;
        C5.I0 i3;
        boolean z6;
        C5.Y0 y9;
        p077i5.P p2;
        if (cVar instanceof C5.X0) {
            x9 = (C5.X0) cVar;
            int i9 = x9.f1170k;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                x9.f1170k = i9 - Integer.MIN_VALUE;
            } else {
                x9 = new C5.X0(this, cVar);
            }
        } else {
            x9 = new C5.X0(this, cVar);
        }
        java.lang.Object obj = x9.f1169i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = x9.f1170k;
        if (i10 != 0) {
            if (i10 == 1) {
                y9 = x9.f1168h;
                com.google.common.util.concurrent.P.u0(obj);
            } else {
                if (i10 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
            return p070h6.A.f22523a;
        }
        com.google.common.util.concurrent.P.u0(obj);
        int iIdentityHashCode = java.lang.System.identityHashCode(this.f1180h.f1296z.getValue());
        int i11 = this.f1181i;
        if (iIdentityHashCode != i11) {
            android.util.Log.w("TvZapDiag", "STALE state da coord=" + i11 + " -> " + kotlin.jvm.internal.B.f24540a.b(mVar.getClass()).h());
        }
        boolean z9 = ((C5.I0) this.f1180h.f1295x.getValue()).f1016k;
        V7.n0 n0Var = this.f1180h.f1295x;
        do {
            value = n0Var.getValue();
            i3 = (C5.I0) value;
            z6 = mVar instanceof p099l5.k;
        } while (!n0Var.g(value, C5.I0.a(i3, false, false, null, null, null, null, 0L, 0L, null, false, z6, (mVar instanceof p099l5.e) || (mVar instanceof p099l5.i) || ((mVar instanceof p099l5.g) && i3.f1045z == null), false, null, null, null, 0, 0, 0L, 0L, false, null, null, null, (z6 || (mVar instanceof p099l5.l)) ? null : i3.f1045z, (z6 || (mVar instanceof p099l5.l)) ? null : i3.f972A, false, null, false, false, 0, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, 0L, false, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, false, null, -100666369, -1, 262143)));
        C5.c2 c2Var = this.f1180h;
        com.kiptv.core.model.TraktMediaRef traktMediaRefF0 = c2Var.f0();
        if (traktMediaRefF0 != null) {
            if (z6) {
                if (!z9) {
                    p005a5.U6 u6 = c2Var.f1291t;
                    double dE0 = c2Var.e0(null);
                    synchronized (u6) {
                        try {
                            if (u6.b()) {
                                if (!kotlin.jvm.internal.m.a(u6.f13979h, traktMediaRefF0)) {
                                    u6.f13979h = traktMediaRefF0;
                                    u6.f13980i = null;
                                }
                                if (!u6.j.contains(traktMediaRefF0) && !kotlin.jvm.internal.m.a(u6.f13980i, androidx.media3.extractor.text.ttml.TtmlNode.START)) {
                                    u6.f13980i = androidx.media3.extractor.text.ttml.TtmlNode.START;
                                    u6.e(androidx.media3.extractor.text.ttml.TtmlNode.START, traktMediaRefF0, dE0, false);
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                    if (!c2Var.f1287q0 && (p2 = (p077i5.P) c2Var.f1296z.getValue()) != null) {
                        long jLongValue = ((java.lang.Number) ((V7.n0) p2.f23075w.f10419h).getValue()).longValue();
                        if (jLongValue > 0) {
                            c2Var.f1287q0 = true;
                            java.lang.String str = c2Var.f1244K;
                            if (str != null) {
                                S7.C.A(androidx.lifecycle.X.h(c2Var), null, new C5.C0144r1(c2Var, traktMediaRefF0, str, p2.f23035b.f23085a, jLongValue, 1000 * ((long) c2Var.f1267f0), null), 3);
                            }
                        }
                    }
                }
            } else if (mVar instanceof p099l5.j) {
                if (z9) {
                    p005a5.U6 u7 = c2Var.f1291t;
                    double dE1 = c2Var.e0(null);
                    synchronized (u7) {
                        if (u7.b() && kotlin.jvm.internal.m.a(u7.f13979h, traktMediaRefF0) && kotlin.jvm.internal.m.a(u7.f13980i, androidx.media3.extractor.text.ttml.TtmlNode.START) && !u7.j.contains(traktMediaRefF0)) {
                            u7.f13980i = "pause";
                            u7.e("pause", traktMediaRefF0, dE1, false);
                        }
                    }
                }
            } else if (mVar instanceof p099l5.f) {
                c2Var.f1291t.c(traktMediaRefF0, 100.0d);
                c2Var.W(traktMediaRefF0);
            }
        }
        if ((mVar instanceof p099l5.l) || z6) {
            C5.c2 c2Var2 = this.f1180h;
            p077i5.P p9 = this.j;
            S7.w0 w0Var = c2Var2.H;
            if (w0Var != null) {
                w0Var.e(null);
            }
            c2Var2.H = S7.C.A(androidx.lifecycle.X.h(c2Var2), null, new C5.N1(c2Var2, p9, null), 3);
        }
        if (mVar instanceof p099l5.f) {
            if (((com.kiptv.core.model.UserSettings) ((V7.n0) this.f1180h.f1274k.g.f10419h).getValue()).f20583f && ((V7.n0) this.j.X.f10419h).getValue() != null) {
                this.f1180h.D();
            } else if (!((C5.I0) this.f1180h.f1295x.getValue()).f1020m || (this.f1180h.f1294w instanceof C5.C0093a0)) {
                C5.c2 c2Var3 = this.f1180h;
                x9.f1168h = this;
                x9.f1170k = 1;
                if (c2Var3.Z(true, true, x9) != aVar) {
                    y9 = this;
                }
                return aVar;
            }
        }
        return p070h6.A.f22523a;
        V7.a0 a0Var = y9.f1180h.f1236B;
        C5.C0111g0 c0111g0 = C5.C0111g0.f1333a;
        x9.f1168h = null;
        x9.f1170k = 2;
    }
}
