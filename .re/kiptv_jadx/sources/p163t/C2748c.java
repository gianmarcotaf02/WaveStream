package p163t;

/* JADX INFO: renamed from: t.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2748c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p163t.E0 f27549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f27550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p163t.C2768m f27551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p020c0.C1681g0 f27552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p020c0.C1681g0 f27553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p163t.Q f27554f;
    public final p163t.C2761i0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p163t.r f27555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p163t.r f27556i;
    public final p163t.r j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p163t.r f27557k;

    public C2748c(java.lang.Object obj, p163t.E0 e6, java.lang.Object obj2) {
        this.f27549a = e6;
        this.f27550b = obj2;
        p163t.C2768m c2768m = new p163t.C2768m(e6, obj, null, 60);
        this.f27551c = c2768m;
        this.f27552d = p020c0.AbstractC1703s.y(java.lang.Boolean.FALSE);
        this.f27553e = p020c0.AbstractC1703s.y(obj);
        this.f27554f = new p163t.Q();
        this.g = new p163t.C2761i0(obj2);
        p163t.r rVar = c2768m.j;
        boolean z6 = rVar instanceof p163t.C2770n;
        p163t.r rVar2 = z6 ? p163t.AbstractC2750d.f27565e : rVar instanceof p163t.C2771o ? p163t.AbstractC2750d.f27566f : rVar instanceof p163t.C2772p ? p163t.AbstractC2750d.g : p163t.AbstractC2750d.f27567h;
        this.f27555h = rVar2;
        p163t.r rVar3 = z6 ? p163t.AbstractC2750d.f27561a : rVar instanceof p163t.C2771o ? p163t.AbstractC2750d.f27562b : rVar instanceof p163t.C2772p ? p163t.AbstractC2750d.f27563c : p163t.AbstractC2750d.f27564d;
        this.f27556i = rVar3;
        this.j = rVar2;
        this.f27557k = rVar3;
    }

    public static final java.lang.Object a(p163t.C2748c c2748c, java.lang.Object obj) {
        p163t.r rVar = c2748c.f27555h;
        p163t.r rVar2 = c2748c.j;
        boolean zA = kotlin.jvm.internal.m.a(rVar2, rVar);
        p163t.r rVar3 = c2748c.f27557k;
        if (!zA || !kotlin.jvm.internal.m.a(rVar3, c2748c.f27556i)) {
            p163t.E0 e6 = c2748c.f27549a;
            p163t.r rVar4 = (p163t.r) e6.f27453a.invoke(obj);
            int iB = rVar4.b();
            boolean z6 = false;
            for (int i3 = 0; i3 < iB; i3++) {
                if (rVar4.a(i3) < rVar2.a(i3) || rVar4.a(i3) > rVar3.a(i3)) {
                    rVar4.e(O7.r.r(rVar4.a(i3), rVar2.a(i3), rVar3.a(i3)), i3);
                    z6 = true;
                }
            }
            if (z6) {
                return e6.f27454b.invoke(rVar4);
            }
        }
        return obj;
    }

    public static final void b(p163t.C2748c c2748c) {
        p163t.C2768m c2768m = c2748c.f27551c;
        c2768m.j.d();
        c2768m.f27641k = Long.MIN_VALUE;
        c2748c.f27552d.setValue(java.lang.Boolean.FALSE);
    }

    public static java.lang.Object c(p163t.C2748c c2748c, java.lang.Object obj, p163t.InterfaceC2766l interfaceC2766l, p194x6.j jVar, p100l6.c cVar, int i3) {
        if ((i3 & 2) != 0) {
            interfaceC2766l = c2748c.g;
        }
        p163t.InterfaceC2766l interfaceC2766l2 = interfaceC2766l;
        java.lang.Object objInvoke = c2748c.f27549a.f27454b.invoke(c2748c.f27551c.j);
        if ((i3 & 8) != 0) {
            jVar = null;
        }
        java.lang.Object objD = c2748c.d();
        p163t.E0 e6 = c2748c.f27549a;
        return p163t.Q.a(c2748c.f27554f, new p163t.C2744a(c2748c, objInvoke, new p163t.o0(interfaceC2766l2, e6, objD, obj, (p163t.r) e6.f27453a.invoke(objInvoke)), c2748c.f27551c.f27641k, jVar, null), cVar);
    }

    public final java.lang.Object d() {
        return this.f27551c.f27640i.getValue();
    }

    public final java.lang.Object e(java.lang.Object obj, p100l6.c cVar) {
        java.lang.Object objA = p163t.Q.a(this.f27554f, new p163t.C2746b(this, obj, null), cVar);
        return objA == p109m6.a.f25430h ? objA : p070h6.A.f22523a;
    }

    public /* synthetic */ C2748c(java.lang.Object obj, p163t.E0 e6, java.lang.Object obj2, int i3) {
        this(obj, e6, (i3 & 4) != 0 ? null : obj2);
    }
}
