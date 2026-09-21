package x;

/* JADX INFO: loaded from: classes.dex */
public abstract class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v5.C2921d f30717a = new v5.C2921d(18);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x.B0 f30718b = new x.B0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x.A0 f30719c = new x.A0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x.C0 f30720d = new x.C0();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object a(x.W0 w6, long j, p117n6.c cVar) {
        x.D0 d4;
        kotlin.jvm.internal.x xVar;
        x.W0 w9;
        if (cVar instanceof x.D0) {
            d4 = (x.D0) cVar;
            int i3 = d4.f30694k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d4.f30694k = i3 - Integer.MIN_VALUE;
            } else {
                d4 = new x.D0(cVar);
            }
        } else {
            d4 = new x.D0(cVar);
        }
        java.lang.Object obj = d4.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = d4.f30694k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            xVar = new kotlin.jvm.internal.x();
            v.n0 n0Var = v.n0.f28974h;
            x.E0 e6 = new x.E0(w6, j, xVar, null);
            d4.f30692h = w6;
            d4.f30693i = xVar;
            d4.f30694k = 1;
            if (w6.f(n0Var, e6, d4) == aVar) {
                return aVar;
            }
            w9 = w6;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.x xVar2 = d4.f30693i;
            x.W0 w10 = d4.f30692h;
            com.google.common.util.concurrent.P.u0(obj);
            xVar = xVar2;
            w9 = w10;
        }
        return new p181w0.a(w9.h(xVar.f24554h));
    }

    public static p137q0.p b(J.v0 v0Var, x.EnumC3061p0 enumC3061p0, boolean z6, boolean z9) {
        return new x.C3080z0(v0Var, enumC3061p0, z6, z9);
    }
}
