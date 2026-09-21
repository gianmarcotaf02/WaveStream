package V4;

/* JADX INFO: loaded from: classes.dex */
public final class P {
    private static final V4.y Companion = new V4.y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S1.e f10287c = E6.G.Q("offline_progress_queue");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final S1.e f10288d = E6.G.Q("subscription_cache");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final S1.e f10289e = new S1.e("watch_progress_migrated_v1");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f10290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p162s8.d f10291b;

    public P(android.content.Context context, p162s8.d json) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(json, "json");
        this.f10290a = context;
        this.f10291b = json;
    }

    public static final java.util.Map a(V4.P p2, java.lang.String str) {
        p2.getClass();
        p078i6.x xVar = p078i6.x.f23206h;
        if (str != null && str.length() != 0) {
            try {
                p162s8.d dVar = p2.f10291b;
                dVar.getClass();
                return (java.util.Map) dVar.b(str, new p153r8.F(p153r8.p0.f26988a, com.kiptv.core.local.datastore.LocalProgressEntry.INSTANCE.serializer(), 1));
            } catch (java.lang.Exception unused) {
            }
        }
        return xVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(p117n6.c cVar) {
        V4.C c9;
        kotlin.jvm.internal.A a2;
        if (cVar instanceof V4.C) {
            c9 = (V4.C) cVar;
            int i3 = c9.f10259k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c9.f10259k = i3 - Integer.MIN_VALUE;
            } else {
                c9 = new V4.C(this, cVar);
            }
        } else {
            c9 = new V4.C(this, cVar);
        }
        java.lang.Object obj = c9.f10258i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c9.f10259k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            kotlin.jvm.internal.A a9 = new kotlin.jvm.internal.A();
            a9.f24539h = p078i6.w.f23205h;
            O1.InterfaceC0744h interfaceC0744hA = V4.Q.a(this.f10290a);
            V4.D d4 = new V4.D(a9, this, null);
            c9.f10257h = a9;
            c9.f10259k = 1;
            if (E8.d.M(interfaceC0744hA, d4, c9) == aVar) {
                return aVar;
            }
            a2 = a9;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a2 = c9.f10257h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        return a2.f24539h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(p117n6.c cVar) {
        V4.E e6;
        kotlin.jvm.internal.w wVar;
        if (cVar instanceof V4.E) {
            e6 = (V4.E) cVar;
            int i3 = e6.f10264k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e6.f10264k = i3 - Integer.MIN_VALUE;
            } else {
                e6 = new V4.E(this, cVar);
            }
        } else {
            e6 = new V4.E(this, cVar);
        }
        java.lang.Object obj = e6.f10263i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = e6.f10264k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
            O1.InterfaceC0744h interfaceC0744hA = V4.Q.a(this.f10290a);
            V4.F f9 = new V4.F(wVar2, null);
            e6.f10262h = wVar2;
            e6.f10264k = 1;
            if (E8.d.M(interfaceC0744hA, f9, e6) == aVar) {
                return aVar;
            }
            wVar = wVar2;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = e6.f10262h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        return java.lang.Boolean.valueOf(wVar.f24553h);
    }

    public final java.lang.Object e(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, p015b5.C c9) {
        java.lang.Object objM = E8.d.M(V4.Q.a(this.f10290a), new V4.K(this, str + "-" + (num != null ? num.intValue() : 0) + "-" + (num2 != null ? num2.intValue() : 0), null), c9);
        return objM == p109m6.a.f25430h ? objM : p070h6.A.f22523a;
    }
}
