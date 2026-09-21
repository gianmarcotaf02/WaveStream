package W7;

/* JADX INFO: renamed from: W7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1009c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p100l6.c[] f10730a = new p100l6.c[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N6.A f10731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final N6.A f10732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final N6.A f10733d;

    static {
        int i3 = 2;
        f10731b = new N6.A("NULL", i3);
        f10732c = new N6.A("UNINITIALIZED", i3);
        f10733d = new N6.A("DONE", i3);
    }

    public static final java.lang.Object a(V7.InterfaceC0982h interfaceC0982h, kotlin.jvm.functions.Function0 function0, p100l6.c cVar, p194x6.n nVar, V7.InterfaceC0981g[] interfaceC0981gArr) {
        W7.s sVar = new W7.s(interfaceC0982h, function0, null, nVar, interfaceC0981gArr);
        S7.x0 x0Var = new S7.x0(cVar.getContext(), cVar, 1);
        java.lang.Object objL0 = P3.e.l0(x0Var, x0Var, sVar);
        return objL0 == p109m6.a.f25430h ? objL0 : p070h6.A.f22523a;
    }

    public static /* synthetic */ V7.InterfaceC0981g b(W7.v vVar, Z7.d dVar, int i3, U7.EnumC0955c enumC0955c, int i9) {
        p100l6.h hVar = dVar;
        if ((i9 & 1) != 0) {
            hVar = p100l6.i.f24820h;
        }
        if ((i9 & 2) != 0) {
            i3 = -3;
        }
        if ((i9 & 4) != 0) {
            enumC0955c = U7.EnumC0955c.f10175h;
        }
        return vVar.a(hVar, i3, enumC0955c);
    }

    public static final java.lang.Object c(p100l6.h hVar, java.lang.Object obj, java.lang.Object obj2, p194x6.m mVar, p100l6.c frame) {
        java.lang.Object objInvoke;
        java.lang.Object objN = X7.a.n(hVar, obj2);
        try {
            W7.C c9 = new W7.C(frame, hVar);
            if (mVar == null) {
                objInvoke = com.google.common.util.concurrent.P.w0(mVar, obj, c9);
            } else {
                kotlin.jvm.internal.E.c(2, mVar);
                objInvoke = mVar.invoke(obj, c9);
            }
            X7.a.g(hVar, objN);
            if (objInvoke == p109m6.a.f25430h) {
                kotlin.jvm.internal.m.e(frame, "frame");
            }
            return objInvoke;
        } catch (java.lang.Throwable th) {
            X7.a.g(hVar, objN);
            throw th;
        }
    }
}
