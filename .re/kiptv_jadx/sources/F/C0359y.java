package F;

/* JADX INFO: renamed from: F.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0359y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p112n0.c f3506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B5.d f3507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p136q.H f3508c;

    public C0359y(p112n0.c cVar, B5.d dVar) {
        this.f3506a = cVar;
        this.f3507b = dVar;
        long[] jArr = p136q.P.f26351a;
        this.f3508c = new p136q.H();
    }

    public final p194x6.m a(java.lang.Object obj, int i3, java.lang.Object obj2) {
        p136q.H h9 = this.f3508c;
        F.C0358x c0358x = (F.C0358x) h9.g(obj);
        if (c0358x != null && c0358x.f3503c == i3 && kotlin.jvm.internal.m.a(c0358x.f3502b, obj2)) {
            p089k0.e eVar = c0358x.f3504d;
            if (eVar != null) {
                return eVar;
            }
            p089k0.e eVar2 = new p089k0.e(818252804, new A5.e(c0358x.f3505e, c0358x, 9), true);
            c0358x.f3504d = eVar2;
            return eVar2;
        }
        F.C0358x c0358x2 = new F.C0358x(this, i3, obj, obj2);
        h9.m(obj, c0358x2);
        p089k0.e eVar3 = c0358x2.f3504d;
        if (eVar3 != null) {
            return eVar3;
        }
        p089k0.e eVar4 = new p089k0.e(818252804, new A5.e(this, c0358x2, 9), true);
        c0358x2.f3504d = eVar4;
        return eVar4;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        F.C0358x c0358x = (F.C0358x) this.f3508c.g(obj);
        if (c0358x != null) {
            return c0358x.f3502b;
        }
        F.InterfaceC0360z interfaceC0360z = (F.InterfaceC0360z) this.f3507b.invoke();
        int iD = interfaceC0360z.d(obj);
        if (iD != -1) {
            return interfaceC0360z.c(iD);
        }
        return null;
    }
}
