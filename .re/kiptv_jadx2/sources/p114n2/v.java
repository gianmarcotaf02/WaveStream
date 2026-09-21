package p114n2;

import D1.X;
import F3.C0371k;
import N7.o;
import O7.q;
import j1.l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import p136q.T;
import p201y6.a;
import q2.h;

public class v extends t implements Iterable, a {

    public static final int f25678n = 0;

    public final C0371k f25679m;

    public v(x xVar) {
        super(xVar);
        m.e(this, "graph");
        C0371k c0371k = new C0371k();
        c0371k.f3601b = this;
        c0371k.f3602c = new T(0);
        this.f25679m = c0371k;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v) || !super.equals(obj)) {
            return false;
        }
        C0371k c0371k = this.f25679m;
        int iG = ((T) c0371k.f3602c).g();
        C0371k c0371k2 = ((v) obj).f25679m;
        if (iG != ((T) c0371k2.f3602c).g() || c0371k.f3600a != c0371k2.f3600a) {
            return false;
        }
        T t9 = (T) c0371k.f3602c;
        m.e(t9, "<this>");
        for (t tVar : (N7.a) o.g0(new X(8, t9))) {
            if (!tVar.equals(((T) c0371k2.f3602c).d(tVar.f25671i.f8482a))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int hashCode() {
        C0371k c0371k = this.f25679m;
        int iE = c0371k.f3600a;
        T t9 = (T) c0371k.f3602c;
        int iG = t9.g();
        for (int i3 = 0; i3 < iG; i3++) {
            iE = (((iE * 31) + t9.e(i3)) * 31) + ((t) t9.h(i3)).hashCode();
        }
        return iE;
    }

    @Override
    public final Iterator iterator() {
        C0371k c0371k = this.f25679m;
        c0371k.getClass();
        return new h(c0371k);
    }

    @Override
    public final s n(l lVar) {
        s sVarN = super.n(lVar);
        C0371k c0371k = this.f25679m;
        c0371k.getClass();
        return c0371k.g(sVarN, lVar, false, (v) c0371k.f3601b);
    }

    public final s o(l lVar, t lastVisited) {
        m.e(lastVisited, "lastVisited");
        return this.f25679m.g(super.n(lVar), lVar, true, lastVisited);
    }

    public final s p(String route, boolean z6, t lastVisited) {
        s sVarP;
        m.e(route, "route");
        m.e(lastVisited, "lastVisited");
        C0371k c0371k = this.f25679m;
        c0371k.getClass();
        v vVar = (v) c0371k.f3601b;
        vVar.getClass();
        s sVarL = vVar.f25671i.l(route);
        ArrayList arrayList = new ArrayList();
        Iterator it = vVar.iterator();
        while (true) {
            h hVar = (h) it;
            sVarP = null;
            if (!hVar.hasNext()) {
                break;
            }
            t tVar = (t) hVar.next();
            if (!m.a(tVar, lastVisited)) {
                if (tVar instanceof v) {
                    sVarP = ((v) tVar).p(route, false, vVar);
                } else {
                    tVar.getClass();
                    sVarP = tVar.f25671i.l(route);
                }
            }
            if (sVarP != null) {
                arrayList.add(sVarP);
            }
        }
        s sVar = (s) p078i6.o.t1(arrayList);
        v vVar2 = vVar.j;
        if (vVar2 != null && z6 && !vVar2.equals(lastVisited)) {
            sVarP = vVar2.p(route, true, vVar);
        }
        return (s) p078i6.o.t1(p078i6.m.l0(new s[]{sVarL, sVar, sVarP}));
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        C0371k c0371k = this.f25679m;
        String str = (String) c0371k.f3604e;
        c0371k.getClass();
        t tVarC = (str == null || q.N0(str)) ? null : c0371k.c(str, true);
        if (tVarC == null) {
            tVarC = c0371k.b(c0371k.f3600a);
        }
        sb.append(" startDestination=");
        if (tVarC == null) {
            String str2 = (String) c0371k.f3604e;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = (String) c0371k.f3603d;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(c0371k.f3600a));
                }
            }
        } else {
            sb.append("{");
            sb.append(tVarC.toString());
            sb.append("}");
        }
        String string = sb.toString();
        m.d(string, "toString(...)");
        return string;
    }
}
