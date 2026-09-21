package p005a5;

import E6.G;
import E8.d;
import O1.InterfaceC0744h;
import S1.b;
import S1.e;
import S7.C;
import S7.M;
import U4.h;
import V7.InterfaceC0981g;
import V7.W;
import V7.n0;
import V7.r;
import X7.c;
import android.content.Context;
import com.google.android.gms.internal.play_billing.V0;
import com.google.common.util.concurrent.P;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import java.util.List;
import kotlin.jvm.internal.m;
import p070h6.A;
import p078i6.w;
import p109m6.a;
import p153r8.C2691d;
import p153r8.p0;
import p162s8.q;

public final class J2 {
    private static final D2 Companion = new D2();
    public static final e g = G.Q("search_history_v1");

    public final Context f13535a;

    public final q f13536b;

    public final C2691d f13537c;

    public final c f13538d;

    public final n0 f13539e;

    public final W f13540f;

    public J2(Context context) {
        m.e(context, "context");
        this.f13535a = context;
        this.f13536b = AbstractC1909d.e(new h(11));
        this.f13537c = V0.a(p0.f26988a);
        c cVarC = C.c(M.f9549a.plus(C.e()));
        this.f13538d = cVarC;
        n0 n0VarB = r.b(w.f23205h);
        this.f13539e = n0VarB;
        this.f13540f = new W(n0VarB);
        C.A(cVarC, null, new C2(this, null), 3);
    }

    public static final Object b(J2 j9, p117n6.c cVar) {
        E2 e6;
        j9.getClass();
        if (cVar instanceof E2) {
            e6 = (E2) cVar;
            int i3 = e6.f13339k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e6.f13339k = i3 - Integer.MIN_VALUE;
            } else {
                e6 = new E2(j9, cVar);
            }
        } else {
            e6 = new E2(j9, cVar);
        }
        Object objO = e6.f13338i;
        a aVar = a.f25430h;
        int i9 = e6.f13339k;
        w wVar = w.f23205h;
        try {
            if (i9 == 0) {
                P.u0(objO);
                InterfaceC0981g data = ((InterfaceC0744h) K2.f13576b.getValue(j9.f13535a, K2.f13575a[0])).getData();
                e6.f13337h = j9;
                e6.f13339k = 1;
                objO = r.o(data, e6);
                if (objO == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j9 = e6.f13337h;
                P.u0(objO);
            }
            String str = (String) ((b) objO).c(g);
            if (str != null) {
                return (List) j9.f13536b.b(str, j9.f13537c);
            }
        } catch (Exception unused) {
        }
        return wVar;
    }

    public static final Object c(J2 j9, List list, p117n6.c cVar) {
        F2 f9;
        j9.getClass();
        if (cVar instanceof F2) {
            f9 = (F2) cVar;
            int i3 = f9.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f9.j = i3 - Integer.MIN_VALUE;
            } else {
                f9 = new F2(j9, cVar);
            }
        } else {
            f9 = new F2(j9, cVar);
        }
        Object obj = f9.f13386h;
        a aVar = a.f25430h;
        int i9 = f9.j;
        try {
            if (i9 == 0) {
                P.u0(obj);
                InterfaceC0744h interfaceC0744h = (InterfaceC0744h) K2.f13576b.getValue(j9.f13535a, K2.f13575a[0]);
                G2 g9 = new G2(j9, list, null);
                f9.j = 1;
                if (d.M(interfaceC0744h, g9, f9) == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P.u0(obj);
            }
        } catch (Exception unused) {
        }
        return A.f22523a;
    }
}
