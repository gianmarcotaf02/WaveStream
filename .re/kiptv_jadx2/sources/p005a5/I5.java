package p005a5;

import O7.q;
import S7.C;
import S7.M;
import V4.C0971n;
import V4.C0974q;
import V7.W;
import V7.n0;
import V7.r;
import X7.c;
import Z7.d;
import Z7.e;
import com.google.common.util.concurrent.P;
import kotlin.jvm.internal.m;
import p070h6.A;
import p109m6.a;

public final class I5 {
    public static final F5 Companion = new F5();

    public final C1291h4 f13513a;

    public final C0974q f13514b;

    public final c f13515c;

    public final n0 f13516d;

    public final W f13517e;

    public I5(C1291h4 settingsRepository, C0974q settingsDataStore) {
        m.e(settingsRepository, "settingsRepository");
        m.e(settingsDataStore, "settingsDataStore");
        this.f13513a = settingsRepository;
        this.f13514b = settingsDataStore;
        e eVar = M.f9549a;
        c cVarC = C.c(d.f13044i.plus(C.e()));
        this.f13515c = cVarC;
        n0 n0VarB = r.b("red");
        this.f13516d = n0VarB;
        this.f13517e = new W(n0VarB);
        C.A(cVarC, null, new D5(this, null), 3);
        C.A(cVarC, null, new E5(this, null), 3);
    }

    public static final Object a(I5 i9, String str, p100l6.c cVar) {
        G5 g9;
        i9.getClass();
        if (cVar instanceof G5) {
            g9 = (G5) cVar;
            int i3 = g9.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g9.j = i3 - Integer.MIN_VALUE;
            } else {
                g9 = new G5(i9, cVar);
            }
        } else {
            g9 = new G5(i9, cVar);
        }
        Object obj = g9.f13435h;
        a aVar = a.f25430h;
        int i10 = g9.j;
        A a2 = A.f22523a;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P.u0(obj);
                return a2;
            }
            P.u0(obj);
            if (q.N0(str)) {
                str = "red";
            }
            n0 n0Var = i9.f13516d;
            if (!str.equals(n0Var.getValue())) {
                n0Var.i(null, str);
                C0974q c0974q = i9.f13514b;
                g9.j = 1;
                Object objM = E8.d.M(V4.r.a(c0974q.f10327a), new C0971n(str, null), g9);
                if (objM != aVar) {
                    objM = a2;
                }
                if (objM == aVar) {
                    return aVar;
                }
            }
            return a2;
        } catch (Throwable th) {
            P.T(th);
        }
    }
}
