package V4;

/* JADX INFO: renamed from: V4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0967j {
    private static final V4.C0958a Companion = new V4.C0958a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S1.e f10312c = E6.G.Q("epg_reminders_v1");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f10313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p162s8.d f10314b;

    public C0967j(android.content.Context context, p162s8.d json) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(json, "json");
        this.f10313a = context;
        this.f10314b = json;
    }

    public static final java.util.List a(V4.C0967j c0967j, java.lang.String str) {
        c0967j.getClass();
        p078i6.w wVar = p078i6.w.f23205h;
        if (str != null && str.length() != 0) {
            try {
                return (java.util.List) c0967j.f10314b.b(str, new p153r8.C2691d(com.kiptv.core.model.EPGReminder.INSTANCE.serializer(), 0));
            } catch (java.lang.Exception unused) {
            }
        }
        return wVar;
    }

    public static final java.lang.String b(V4.C0967j c0967j, java.util.List list) {
        c0967j.getClass();
        return c0967j.f10314b.d(new p153r8.C2691d(com.kiptv.core.model.EPGReminder.INSTANCE.serializer(), 0), list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(p117n6.c cVar) {
        V4.C0960c c0960c;
        kotlin.jvm.internal.A a2;
        if (cVar instanceof V4.C0960c) {
            c0960c = (V4.C0960c) cVar;
            int i3 = c0960c.f10298k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0960c.f10298k = i3 - Integer.MIN_VALUE;
            } else {
                c0960c = new V4.C0960c(this, cVar);
            }
        } else {
            c0960c = new V4.C0960c(this, cVar);
        }
        java.lang.Object obj = c0960c.f10297i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c0960c.f10298k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            kotlin.jvm.internal.A a9 = new kotlin.jvm.internal.A();
            a9.f24539h = p078i6.w.f23205h;
            O1.InterfaceC0744h interfaceC0744hA = V4.AbstractC0968k.a(this.f10313a);
            V4.C0961d c0961d = new V4.C0961d(this, a9, null);
            c0960c.f10296h = a9;
            c0960c.f10298k = 1;
            if (E8.d.M(interfaceC0744hA, c0961d, c0960c) == aVar) {
                return aVar;
            }
            a2 = a9;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a2 = c0960c.f10296h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        return a2.f24539h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(p117n6.c cVar) {
        V4.C0964g c0964g;
        kotlin.jvm.internal.A a2;
        if (cVar instanceof V4.C0964g) {
            c0964g = (V4.C0964g) cVar;
            int i3 = c0964g.f10307k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0964g.f10307k = i3 - Integer.MIN_VALUE;
            } else {
                c0964g = new V4.C0964g(this, cVar);
            }
        } else {
            c0964g = new V4.C0964g(this, cVar);
        }
        java.lang.Object obj = c0964g.f10306i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c0964g.f10307k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            kotlin.jvm.internal.A a9 = new kotlin.jvm.internal.A();
            a9.f24539h = p078i6.w.f23205h;
            O1.InterfaceC0744h interfaceC0744hA = V4.AbstractC0968k.a(this.f10313a);
            V4.C0965h c0965h = new V4.C0965h(this, a9, null);
            c0964g.f10305h = a9;
            c0964g.f10307k = 1;
            if (E8.d.M(interfaceC0744hA, c0965h, c0964g) == aVar) {
                return aVar;
            }
            a2 = a9;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a2 = c0964g.f10305h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        return a2.f24539h;
    }
}
