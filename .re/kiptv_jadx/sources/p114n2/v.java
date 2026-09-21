package p114n2;

/* JADX INFO: loaded from: classes.dex */
public class v extends p114n2.t implements java.lang.Iterable, p201y6.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f25678n = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final F3.C0371k f25679m;

    public v(p114n2.x xVar) {
        super(xVar);
        kotlin.jvm.internal.m.e(this, "graph");
        F3.C0371k c0371k = new F3.C0371k();
        c0371k.f3601b = this;
        c0371k.f3602c = new p136q.T(0);
        this.f25679m = c0371k;
    }

    @Override // p114n2.t
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p114n2.v) || !super.equals(obj)) {
            return false;
        }
        F3.C0371k c0371k = this.f25679m;
        int iG = ((p136q.T) c0371k.f3602c).g();
        F3.C0371k c0371k2 = ((p114n2.v) obj).f25679m;
        if (iG != ((p136q.T) c0371k2.f3602c).g() || c0371k.f3600a != c0371k2.f3600a) {
            return false;
        }
        p136q.T t9 = (p136q.T) c0371k.f3602c;
        kotlin.jvm.internal.m.e(t9, "<this>");
        for (p114n2.t tVar : (N7.a) N7.o.g0(new D1.X(8, t9))) {
            if (!tVar.equals(((p136q.T) c0371k2.f3602c).d(tVar.f25671i.f8482a))) {
                return false;
            }
        }
        return true;
    }

    @Override // p114n2.t
    public final int hashCode() {
        F3.C0371k c0371k = this.f25679m;
        int iE = c0371k.f3600a;
        p136q.T t9 = (p136q.T) c0371k.f3602c;
        int iG = t9.g();
        for (int i3 = 0; i3 < iG; i3++) {
            iE = (((iE * 31) + t9.e(i3)) * 31) + ((p114n2.t) t9.h(i3)).hashCode();
        }
        return iE;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        F3.C0371k c0371k = this.f25679m;
        c0371k.getClass();
        return new q2.h(c0371k);
    }

    @Override // p114n2.t
    public final p114n2.s n(j1.l lVar) {
        p114n2.s sVarN = super.n(lVar);
        F3.C0371k c0371k = this.f25679m;
        c0371k.getClass();
        return c0371k.g(sVarN, lVar, false, (p114n2.v) c0371k.f3601b);
    }

    public final p114n2.s o(j1.l lVar, p114n2.t lastVisited) {
        kotlin.jvm.internal.m.e(lastVisited, "lastVisited");
        return this.f25679m.g(super.n(lVar), lVar, true, lastVisited);
    }

    public final p114n2.s p(java.lang.String route, boolean z6, p114n2.t lastVisited) {
        p114n2.s sVarP;
        kotlin.jvm.internal.m.e(route, "route");
        kotlin.jvm.internal.m.e(lastVisited, "lastVisited");
        F3.C0371k c0371k = this.f25679m;
        c0371k.getClass();
        p114n2.v vVar = (p114n2.v) c0371k.f3601b;
        vVar.getClass();
        p114n2.s sVarL = vVar.f25671i.l(route);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = vVar.iterator();
        while (true) {
            q2.h hVar = (q2.h) it;
            sVarP = null;
            if (!hVar.hasNext()) {
                break;
            }
            p114n2.t tVar = (p114n2.t) hVar.next();
            if (!kotlin.jvm.internal.m.a(tVar, lastVisited)) {
                if (tVar instanceof p114n2.v) {
                    sVarP = ((p114n2.v) tVar).p(route, false, vVar);
                } else {
                    tVar.getClass();
                    sVarP = tVar.f25671i.l(route);
                }
            }
            if (sVarP != null) {
                arrayList.add(sVarP);
            }
        }
        p114n2.s sVar = (p114n2.s) p078i6.o.t1(arrayList);
        p114n2.v vVar2 = vVar.j;
        if (vVar2 != null && z6 && !vVar2.equals(lastVisited)) {
            sVarP = vVar2.p(route, true, vVar);
        }
        return (p114n2.s) p078i6.o.t1(p078i6.m.l0(new p114n2.s[]{sVarL, sVar, sVarP}));
    }

    @Override // p114n2.t
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        F3.C0371k c0371k = this.f25679m;
        java.lang.String str = (java.lang.String) c0371k.f3604e;
        c0371k.getClass();
        p114n2.t tVarC = (str == null || O7.q.N0(str)) ? null : c0371k.c(str, true);
        if (tVarC == null) {
            tVarC = c0371k.b(c0371k.f3600a);
        }
        sb.append(" startDestination=");
        if (tVarC == null) {
            java.lang.String str2 = (java.lang.String) c0371k.f3604e;
            if (str2 != null) {
                sb.append(str2);
            } else {
                java.lang.String str3 = (java.lang.String) c0371k.f3603d;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + java.lang.Integer.toHexString(c0371k.f3600a));
                }
            }
        } else {
            sb.append("{");
            sb.append(tVarC.toString());
            sb.append("}");
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
