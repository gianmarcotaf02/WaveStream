package V4;

import O1.InterfaceC0744h;
import android.content.Context;
import com.kiptv.core.local.datastore.LocalProgressEntry;
import java.util.Map;
import p153r8.p0;

public final class P {
    private static final y Companion = new y();

    public static final S1.e f10287c = E6.G.Q("offline_progress_queue");

    public static final S1.e f10288d = E6.G.Q("subscription_cache");

    public static final S1.e f10289e = new S1.e("watch_progress_migrated_v1");

    public final Context f10290a;

    public final p162s8.d f10291b;

    public P(Context context, p162s8.d json) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(json, "json");
        this.f10290a = context;
        this.f10291b = json;
    }

    public static final Map a(P p2, String str) {
        p2.getClass();
        p078i6.x xVar = p078i6.x.f23206h;
        if (str != null && str.length() != 0) {
            try {
                p162s8.d dVar = p2.f10291b;
                dVar.getClass();
                return (Map) dVar.b(str, new p153r8.F(p0.f26988a, LocalProgressEntry.INSTANCE.serializer(), 1));
            } catch (Exception unused) {
            }
        }
        return xVar;
    }

    public final Object c(p117n6.c cVar) {
        C c9;
        kotlin.jvm.internal.A a2;
        if (cVar instanceof C) {
            c9 = (C) cVar;
            int i3 = c9.f10259k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c9.f10259k = i3 - Integer.MIN_VALUE;
            } else {
                c9 = new C(this, cVar);
            }
        } else {
            c9 = new C(this, cVar);
        }
        Object obj = c9.f10258i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c9.f10259k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            kotlin.jvm.internal.A a9 = new kotlin.jvm.internal.A();
            a9.f24539h = p078i6.w.f23205h;
            InterfaceC0744h interfaceC0744hA = Q.a(this.f10290a);
            D d4 = new D(a9, this, null);
            c9.f10257h = a9;
            c9.f10259k = 1;
            if (E8.d.M(interfaceC0744hA, d4, c9) == aVar) {
                return aVar;
            }
            a2 = a9;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a2 = c9.f10257h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        return a2.f24539h;
    }

    public final Object d(p117n6.c cVar) {
        E e6;
        kotlin.jvm.internal.w wVar;
        if (cVar instanceof E) {
            e6 = (E) cVar;
            int i3 = e6.f10264k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e6.f10264k = i3 - Integer.MIN_VALUE;
            } else {
                e6 = new E(this, cVar);
            }
        } else {
            e6 = new E(this, cVar);
        }
        Object obj = e6.f10263i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = e6.f10264k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
            InterfaceC0744h interfaceC0744hA = Q.a(this.f10290a);
            F f9 = new F(wVar2, null);
            e6.f10262h = wVar2;
            e6.f10264k = 1;
            if (E8.d.M(interfaceC0744hA, f9, e6) == aVar) {
                return aVar;
            }
            wVar = wVar2;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = e6.f10262h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        return Boolean.valueOf(wVar.f24553h);
    }

    public final Object e(String str, Integer num, Integer num2, p015b5.C c9) {
        Object objM = E8.d.M(Q.a(this.f10290a), new K(this, str + "-" + (num != null ? num.intValue() : 0) + "-" + (num2 != null ? num2.intValue() : 0), null), c9);
        return objM == p109m6.a.f25430h ? objM : p070h6.A.f22523a;
    }
}
