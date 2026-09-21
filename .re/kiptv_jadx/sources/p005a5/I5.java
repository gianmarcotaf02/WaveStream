package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class I5 {
    public static final p005a5.F5 Companion = new p005a5.F5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p005a5.C1291h4 f13513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V4.C0974q f13514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X7.c f13515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V7.n0 f13516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V7.W f13517e;

    public I5(p005a5.C1291h4 settingsRepository, V4.C0974q settingsDataStore) {
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.m.e(settingsDataStore, "settingsDataStore");
        this.f13513a = settingsRepository;
        this.f13514b = settingsDataStore;
        Z7.e eVar = S7.M.f9549a;
        X7.c cVarC = S7.C.c(Z7.d.f13044i.plus(S7.C.e()));
        this.f13515c = cVarC;
        V7.n0 n0VarB = V7.r.b("red");
        this.f13516d = n0VarB;
        this.f13517e = new V7.W(n0VarB);
        S7.C.A(cVarC, null, new p005a5.D5(this, null), 3);
        S7.C.A(cVarC, null, new p005a5.E5(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final java.lang.Object a(p005a5.I5 i9, java.lang.String str, p100l6.c cVar) {
        p005a5.G5 g9;
        i9.getClass();
        if (cVar instanceof p005a5.G5) {
            g9 = (p005a5.G5) cVar;
            int i3 = g9.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g9.j = i3 - Integer.MIN_VALUE;
            } else {
                g9 = new p005a5.G5(i9, cVar);
            }
        } else {
            g9 = new p005a5.G5(i9, cVar);
        }
        java.lang.Object obj = g9.f13435h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = g9.j;
        p070h6.A a2 = p070h6.A.f22523a;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
                return a2;
            }
            com.google.common.util.concurrent.P.u0(obj);
            if (O7.q.N0(str)) {
                str = "red";
            }
            V7.n0 n0Var = i9.f13516d;
            if (!str.equals(n0Var.getValue())) {
                n0Var.i(null, str);
                V4.C0974q c0974q = i9.f13514b;
                g9.j = 1;
                java.lang.Object objM = E8.d.M(V4.r.a(c0974q.f10327a), new V4.C0971n(str, null), g9);
                if (objM != aVar) {
                    objM = a2;
                }
                if (objM == aVar) {
                    return aVar;
                }
            }
            return a2;
        } catch (java.lang.Throwable th) {
            com.google.common.util.concurrent.P.T(th);
        }
    }
}
