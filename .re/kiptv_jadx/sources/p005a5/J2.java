package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class J2 {
    private static final p005a5.D2 Companion = new p005a5.D2();
    public static final S1.e g = E6.G.Q("search_history_v1");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f13535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p162s8.q f13536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p153r8.C2691d f13537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X7.c f13538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V7.n0 f13539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final V7.W f13540f;

    public J2(android.content.Context context) {
        kotlin.jvm.internal.m.e(context, "context");
        this.f13535a = context;
        this.f13536b = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.e(new U4.h(11));
        this.f13537c = com.google.android.gms.internal.play_billing.V0.a(p153r8.p0.f26988a);
        X7.c cVarC = S7.C.c(S7.M.f9549a.plus(S7.C.e()));
        this.f13538d = cVarC;
        V7.n0 n0VarB = V7.r.b(p078i6.w.f23205h);
        this.f13539e = n0VarB;
        this.f13540f = new V7.W(n0VarB);
        S7.C.A(cVarC, null, new p005a5.C2(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final java.lang.Object b(p005a5.J2 j9, p117n6.c cVar) {
        p005a5.E2 e6;
        j9.getClass();
        if (cVar instanceof p005a5.E2) {
            e6 = (p005a5.E2) cVar;
            int i3 = e6.f13339k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e6.f13339k = i3 - Integer.MIN_VALUE;
            } else {
                e6 = new p005a5.E2(j9, cVar);
            }
        } else {
            e6 = new p005a5.E2(j9, cVar);
        }
        java.lang.Object objO = e6.f13338i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = e6.f13339k;
        p078i6.w wVar = p078i6.w.f23205h;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objO);
                V7.InterfaceC0981g data = ((O1.InterfaceC0744h) p005a5.K2.f13576b.getValue(j9.f13535a, p005a5.K2.f13575a[0])).getData();
                e6.f13337h = j9;
                e6.f13339k = 1;
                objO = V7.r.o(data, e6);
                if (objO == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j9 = e6.f13337h;
                com.google.common.util.concurrent.P.u0(objO);
            }
            java.lang.String str = (java.lang.String) ((S1.b) objO).c(g);
            if (str != null) {
                return (java.util.List) j9.f13536b.b(str, j9.f13537c);
            }
        } catch (java.lang.Exception unused) {
        }
        return wVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final java.lang.Object c(p005a5.J2 j9, java.util.List list, p117n6.c cVar) {
        p005a5.F2 f9;
        j9.getClass();
        if (cVar instanceof p005a5.F2) {
            f9 = (p005a5.F2) cVar;
            int i3 = f9.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f9.j = i3 - Integer.MIN_VALUE;
            } else {
                f9 = new p005a5.F2(j9, cVar);
            }
        } else {
            f9 = new p005a5.F2(j9, cVar);
        }
        java.lang.Object obj = f9.f13386h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = f9.j;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                O1.InterfaceC0744h interfaceC0744h = (O1.InterfaceC0744h) p005a5.K2.f13576b.getValue(j9.f13535a, p005a5.K2.f13575a[0]);
                p005a5.G2 g9 = new p005a5.G2(j9, list, null);
                f9.j = 1;
                if (E8.d.M(interfaceC0744h, g9, f9) == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
        } catch (java.lang.Exception unused) {
        }
        return p070h6.A.f22523a;
    }
}
