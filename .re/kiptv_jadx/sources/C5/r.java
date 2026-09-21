package C5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1431h;

    public /* synthetic */ r(int i3) {
        this.f1431h = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        java.util.List listB0;
        p070h6.A a2 = p070h6.A.f22523a;
        switch (this.f1431h) {
            case 0:
                java.util.Set set = C5.Q.f1105a;
                return a2;
            case 1:
                V7.n0 n0Var = C5.AbstractC0113h.f1338a;
                C5.S s9 = (C5.S) n0Var.getValue();
                if (s9 != null) {
                    if (s9.f1116b.size() >= 4) {
                        n0Var.i(null, C5.S.a(s9, null, null, null, null, null, false, 0, s9.f1121h + 1, 0, 383));
                    } else {
                        n0Var.i(null, C5.S.a(s9, C5.EnumC0107f.f1320i, null, null, null, null, false, C5.AbstractC0113h.e(), 0, 0, 414));
                    }
                }
                return a2;
            case 2:
                V7.n0 n0Var2 = C5.AbstractC0113h.f1338a;
                C5.S s10 = (C5.S) n0Var2.getValue();
                if (s10 != null) {
                    java.util.List list = s10.f1116b;
                    int size = list.size();
                    if (size == 2) {
                        listB0 = p078i6.p.B0(C5.W.j, C5.W.f1158k);
                    } else if (size == 3 || size == 4) {
                        listB0 = p078i6.p.B0(C5.W.f1157i, C5.W.f1158k);
                    }
                    C5.W w6 = C5.W.f1156h;
                    C5.W w9 = s10.f1119e;
                    if (w9 == w6) {
                        w9 = list.size() == 2 ? C5.W.j : C5.W.f1157i;
                    }
                    int iIndexOf = listB0.indexOf(w9);
                    n0Var2.i(null, C5.S.a(s10, null, null, null, null, (C5.W) listB0.get(((iIndexOf >= 0 ? iIndexOf : 0) + 1) % listB0.size()), false, 0, 0, 0, 495));
                }
                return a2;
            case 3:
                return new D.D(0, 0);
            case 4:
                float f9 = D5.t0.f2411a;
                return a2;
            case 5:
                return new E.w(0, 0);
            case 6:
                float f10 = E5.I0.f2890a;
                return a2;
            case 7:
                p020c0.f1 f1Var = F2.m.f3545a;
                return F2.b.f3526a;
            case 8:
                return F2.j.f3538a;
            case 9:
                java.util.List list2 = F5.j.f3691a;
                return a2;
            case 10:
                M8.w wVar = M8.q.f7275h;
                M8.A aE = M8.q.f7276i.e("coil3_disk_cache");
                long jT = io.sentry.SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE;
                try {
                    java.io.File fileF = aE.f();
                    fileF.mkdir();
                    android.os.StatFs statFs = new android.os.StatFs(fileF.getAbsolutePath());
                    jT = O7.r.t((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), io.sentry.SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE, 262144000L);
                    break;
                } catch (java.lang.Exception unused) {
                }
                return new I2.h(jT, wVar, aE);
            case 11:
                return new p188x0.S(p188x0.z.c(1308617531));
            case 12:
                p020c0.f1 f1Var2 = J.AbstractC0547l.f5824a;
                return null;
            case 13:
                return p020c0.AbstractC1703s.y(java.lang.Boolean.FALSE);
            case 14:
                return p020c0.AbstractC1703s.y("");
            case 15:
                return p020c0.AbstractC1703s.y("");
            case 16:
                return p020c0.AbstractC1703s.y(java.lang.Boolean.FALSE);
            case 17:
                return p020c0.AbstractC1703s.y("");
            case 18:
                return p020c0.AbstractC1703s.y("");
            case 19:
                return O2.c.f7887a;
            case 20:
                p020c0.C c9 = Q.g.f8198a;
                return null;
            case 21:
                return new R2.b(new w8.s(new w8.r()));
            case 22:
                return new S4.J();
            case 23:
                Z7.e eVar = S7.M.f9549a;
                return Z7.d.f13044i;
            case 24:
                p020c0.C c10 = U.S.f9937a;
                return null;
            case 25:
                return U.t0.f10082b;
            case 26:
                try {
                    return P3.e.m0(N7.o.s0(N7.o.g0(java.util.Arrays.asList(new R2.c()).iterator())));
                } catch (java.lang.Throwable th) {
                    throw new java.util.ServiceConfigurationError(th.getMessage(), th);
                }
            case 27:
                try {
                    return P3.e.m0(N7.o.s0(N7.o.g0(java.util.Arrays.asList(new V2.a()).iterator())));
                } catch (java.lang.Throwable th2) {
                    throw new java.util.ServiceConfigurationError(th2.getMessage(), th2);
                }
            case 28:
                p020c0.AbstractC1705t.b("Unexpected call to default provider");
                throw new I3.b();
            default:
                throw new java.lang.IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
        }
    }
}
