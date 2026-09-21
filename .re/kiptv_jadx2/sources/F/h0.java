package F;

import O0.q0;
import android.os.Trace;
import com.google.android.gms.internal.play_billing.M0;
import java.util.ArrayList;
import java.util.List;
import p020c0.C1685i0;

public final class h0 implements M {

    public final int f3445a;

    public final android.support.v4.media.session.q f3446b;

    public final p194x6.j f3447c;

    public p113n1.a f3448d;

    public O0.o0 f3449e;

    public O0.L f3450f;
    public boolean g;

    public boolean f3451h;

    public boolean f3452i;
    public Object j;

    public boolean f3453k;

    public g0 f3454l;

    public boolean f3455m;

    public long f3456n;

    public long f3457o;

    public long f3458p = P7.e.a();

    public boolean f3459q;

    public final i0 f3460r;

    public h0(i0 i0Var, int i3, android.support.v4.media.session.q qVar, p194x6.j jVar) {
        this.f3460r = i0Var;
        this.f3445a = i3;
        this.f3446b = qVar;
        this.f3447c = jVar;
    }

    @Override
    public final void a() {
        this.f3455m = true;
    }

    public final void b() {
        O0.L l2 = this.f3450f;
        if (l2 != null) {
            switch (l2.f7590a) {
                case 0:
                    break;
                default:
                    O0.E eB = l2.b();
                    if ((eB != null ? eB.f7569f : null) != null) {
                        O0.N.a(l2.f7591b, l2.f7592c);
                    }
                    break;
            }
        }
        this.f3450f = null;
        O0.o0 o0Var = this.f3449e;
        if (o0Var != null) {
            o0Var.dispose();
        }
        this.f3449e = null;
        this.f3454l = null;
    }

    public final boolean c(C0336a c0336a) {
        boolean zD;
        if (!this.f3460r.f3464a) {
            return false;
        }
        if (this.f3455m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(c0336a);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zD = d(c0336a);
        }
        com.google.common.util.concurrent.P.v0(-1L, "compose:lazy:prefetch:execute:item");
        return zD;
    }

    @Override
    public final void cancel() {
        if (this.f3451h) {
            return;
        }
        this.f3451h = true;
        b();
    }

    public final boolean d(C0336a c0336a) {
        p113n1.a aVar;
        ?? r12;
        List list;
        O0.o0 o0VarF;
        int i3 = this.f3445a;
        long j = i3;
        com.google.common.util.concurrent.P.v0(j, "compose:lazy:prefetch:execute:item");
        InterfaceC0360z interfaceC0360z = (InterfaceC0360z) ((C0359y) this.f3460r.f3465b).f3507b.invoke();
        if (!this.f3451h) {
            int iA = interfaceC0360z.a();
            if (i3 >= 0 && i3 < iA) {
                Object objB = interfaceC0360z.b(i3);
                Object obj = this.j;
                if (obj != null && !objB.equals(obj)) {
                    b();
                    return false;
                }
                Object objC = interfaceC0360z.c(i3);
                android.support.v4.media.session.q qVar = this.f3446b;
                C0338c c0338c = (C0338c) qVar.f15618k;
                if (qVar.j != objC || c0338c == null) {
                    p136q.H h9 = (p136q.H) qVar.f15617i;
                    Object objG = h9.g(objC);
                    Object obj2 = objG;
                    if (objG == null) {
                        C0338c c0338c2 = new C0338c();
                        c0338c2.f3423e = -1;
                        h9.m(objC, c0338c2);
                        obj2 = c0338c2;
                    }
                    c0338c = (C0338c) obj2;
                    qVar.j = objC;
                    qVar.f15618k = c0338c;
                }
                e();
                long jA = c0336a.a();
                this.f3456n = jA;
                this.f3458p = P7.e.a();
                this.f3457o = 0L;
                com.google.common.util.concurrent.P.v0(jA, "compose:lazy:prefetch:available_time_nanos");
                if (!e()) {
                    if (i(this.f3456n, c0338c.f3419a + c0338c.f3420b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            g(objB, objC, c0338c);
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (!e()) {
                        return true;
                    }
                }
                if (this.f3450f != null) {
                    if (!i(this.f3456n, c0338c.f3421c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        O0.L l2 = this.f3450f;
                        if (l2 == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        switch (l2.f7590a) {
                            case 0:
                                o0VarF = l2.f7591b.f(l2.f7592c);
                                break;
                            default:
                                O0.E eB = l2.b();
                                O0.N n3 = l2.f7591b;
                                if (eB != null) {
                                    n3.c(eB, false);
                                }
                                o0VarF = n3.f(l2.f7592c);
                                break;
                        }
                        this.f3449e = o0VarF;
                        this.f3450f = null;
                        this.f3452i = true;
                        Trace.endSection();
                        j();
                        c0338c.f3421c = C0338c.a(this.f3457o, c0338c.f3421c);
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (!this.f3453k) {
                    if (this.f3456n <= r13) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.f3454l = h();
                        this.f3453k = true;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                g0 g0Var = this.f3454l;
                if (g0Var != null) {
                    int i9 = c0338c.f3423e;
                    boolean z6 = this.f3455m;
                    List[] listArr = g0Var.f3439b;
                    int i10 = g0Var.f3440c;
                    List list2 = g0Var.f3438a;
                    if (i10 < list2.size()) {
                        if (g0Var.f3443f.f3451h) {
                            A.b.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list2.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                ((N) list2.get(i11)).f3361d = i9;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (g0Var.f3440c < list2.size()) {
                                try {
                                    if (listArr[g0Var.f3440c] == null) {
                                        if (c0336a.a() <= r13) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i12 = g0Var.f3440c;
                                        N n9 = (N) list2.get(i12);
                                        p194x6.j jVar = n9.f3358a;
                                        if (jVar == null) {
                                            list = p078i6.w.f23205h;
                                        } else {
                                            L l9 = new L(n9, n9.f3361d);
                                            jVar.invoke(l9);
                                            ArrayList arrayList = l9.f3356b;
                                            n9.f3363f = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i12] = list;
                                    }
                                    List list3 = listArr[g0Var.f3440c];
                                    kotlin.jvm.internal.m.b(list3);
                                    while (g0Var.f3441d < list3.size()) {
                                        h0 h0Var = (h0) list3.get(g0Var.f3441d);
                                        if (z6) {
                                            h0 h0Var2 = h0Var != null ? h0Var : null;
                                            if (h0Var2 != null) {
                                                r12 = 1;
                                                h0Var2.f3455m = true;
                                            } else {
                                                r12 = 1;
                                            }
                                        } else {
                                            r12 = 1;
                                        }
                                        g0Var.f3442e = r12;
                                        if (h0Var.c(c0336a)) {
                                            Trace.endSection();
                                            return r12;
                                        }
                                        g0Var.f3441d += r12;
                                    }
                                    g0Var.f3441d = 0;
                                    g0Var.f3440c++;
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                            Trace.endSection();
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                }
                g0 g0Var2 = this.f3454l;
                if (g0Var2 != null && g0Var2.f3442e) {
                    j();
                    com.google.common.util.concurrent.P.v0(j, "compose:lazy:prefetch:execute:item");
                    g0 g0Var3 = this.f3454l;
                    if (g0Var3 != null) {
                        g0Var3.f3442e = false;
                    }
                }
                if (!this.g && (aVar = this.f3448d) != null) {
                    if (!i(this.f3456n, c0338c.f3422d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        f(aVar.f25547a);
                        Trace.endSection();
                        j();
                        c0338c.f3422d = C0338c.a(this.f3457o, c0338c.f3422d);
                        p194x6.j jVar2 = this.f3447c;
                        if (jVar2 != null) {
                            jVar2.invoke(this);
                        }
                    } catch (Throwable th6) {
                        Trace.endSection();
                        throw th6;
                    }
                }
                g0 g0Var4 = this.f3454l;
                if (this.g && this.f3453k && g0Var4 != null) {
                    List list4 = g0Var4.f3438a;
                    int size2 = list4.size();
                    int iMin = Integer.MAX_VALUE;
                    for (int i13 = 0; i13 < size2; i13++) {
                        iMin = Math.min(iMin, ((N) list4.get(i13)).f3362e);
                    }
                    if (iMin == Integer.MAX_VALUE) {
                        iMin = 0;
                    }
                    int i14 = c0338c.f3423e;
                    c0338c.f3423e = i14 == -1 ? iMin : ((i14 * 3) + iMin) / 4;
                    int size3 = list4.size();
                    int iMin2 = Integer.MAX_VALUE;
                    for (int i15 = 0; i15 < size3; i15++) {
                        iMin2 = Math.min(iMin2, ((N) list4.get(i15)).f3363f);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        iMin2 = 0;
                    }
                    if (iMin2 < iMin) {
                        c0338c.f3422d = 0L;
                    }
                }
                return false;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        O0.L l2;
        return this.f3452i || ((l2 = this.f3450f) != null && l2.c());
    }

    public final void f(long j) {
        if (this.f3451h) {
            A.b.a("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.g) {
            A.b.a("Request was already measured!");
        }
        this.g = true;
        O0.o0 o0Var = this.f3449e;
        if (o0Var == null) {
            A.b.b("performComposition() must be called before performMeasure()");
            throw new I3.b();
        }
        int iA = o0Var.a();
        for (int i3 = 0; i3 < iA; i3++) {
            o0Var.c(i3, j);
        }
    }

    public final void g(Object obj, Object obj2, C0338c c0338c) {
        O0.L l2;
        O0.L l9 = this.f3450f;
        if (l9 == null) {
            i0 i0Var = this.f3460r;
            p194x6.m mVarA = ((C0359y) i0Var.f3465b).a(obj, this.f3445a, obj2);
            O0.N nA = ((q0) i0Var.f3466c).a();
            if (nA.f7595h.K()) {
                nA.k(obj, mVarA, true);
                l2 = new O0.L(nA, obj, 1);
            } else {
                l2 = new O0.L(nA, obj, 0);
            }
            l9 = l2;
            this.f3450f = l9;
            this.j = obj;
        }
        this.f3459q = false;
        while (!l9.c() && !this.f3459q) {
            f0 f0Var = new f0(this, c0338c, 0);
            switch (l9.f7590a) {
                case 0:
                    break;
                default:
                    O0.E eB = l9.b();
                    C1685i0 c1685i0 = eB != null ? eB.f7569f : null;
                    if (c1685i0 != null && !c1685i0.c()) {
                        O0.N n3 = l9.f7591b;
                        p121o0.f fVarE = p121o0.o.e();
                        p194x6.j jVarE = fVarE != null ? fVarE.e() : null;
                        p121o0.f fVarH = p121o0.o.h(fVarE);
                        try {
                            Q0.F f9 = n3.f7595h;
                            f9.y = true;
                            try {
                                c1685i0.e(f0Var);
                                f9.y = false;
                                p121o0.o.k(fVarE, fVarH, jVarE);
                            } catch (Throwable th) {
                                eB.getClass();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            p121o0.o.k(fVarE, fVarH, jVarE);
                            throw th2;
                        }
                    }
                    break;
            }
        }
        j();
        if (this.f3459q) {
            c0338c.f3420b = C0338c.a(this.f3457o, c0338c.f3420b);
        } else {
            c0338c.f3419a = C0338c.a(this.f3457o, c0338c.f3419a);
        }
    }

    public final g0 h() {
        O0.o0 o0Var = this.f3449e;
        if (o0Var == null) {
            A.b.b("Should precompose before resolving nested prefetch states");
            throw new I3.b();
        }
        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
        o0Var.d(new e0(a2, 0));
        List list = (List) a2.f24539h;
        if (list != null) {
            return new g0(this, list);
        }
        return null;
    }

    public final boolean i(long j, long j9) {
        if (this.f3455m) {
            j9 = 0;
        }
        return j > j9;
    }

    public final void j() {
        long j;
        long jA = P7.e.a();
        long j9 = this.f3458p;
        int i3 = P7.e.f8180b;
        P7.d unit = P7.d.NANOSECONDS;
        kotlin.jvm.internal.m.e(unit, "unit");
        long jO = 0;
        if (((j9 - 1) | 1) == Long.MAX_VALUE) {
            if (jA == j9) {
                P7.a aVar = P7.b.f8168i;
            } else {
                jO = P7.b.k(j9 < 0 ? P7.b.f8169k : P7.b.j);
            }
        } else if (((jA - 1) | 1) == Long.MAX_VALUE) {
            jO = jA < 0 ? P7.b.f8169k : P7.b.j;
        } else {
            long j10 = jA - j9;
            if (((~(j10 ^ j9)) & (j10 ^ jA)) < 0) {
                P7.d dVar = P7.d.MILLISECONDS;
                if (unit.compareTo(dVar) < 0) {
                    long jR = N3.a.r(1L, dVar, unit);
                    P7.a aVar2 = P7.b.f8168i;
                    jO = P7.b.g(E8.l.O((jA / jR) - (j9 / jR), dVar), E8.l.O((jA % jR) - (j9 % jR), unit));
                } else {
                    jO = P7.b.k(j10 < 0 ? P7.b.f8169k : P7.b.j);
                }
            } else {
                jO = E8.l.O(j10, unit);
            }
        }
        long j11 = jO >> 1;
        P7.a aVar3 = P7.b.f8168i;
        if ((1 & ((int) jO)) == 0) {
            j = j11;
        } else if (j11 > 9223372036854L) {
            j = Long.MAX_VALUE;
        } else {
            j = j11 < -9223372036854L ? Long.MIN_VALUE : ((long) 1000000) * j11;
        }
        this.f3457o = j;
        long j12 = this.f3456n - j;
        this.f3456n = j12;
        this.f3458p = jA;
        com.google.common.util.concurrent.P.v0(j12, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.f3445a);
        sb.append(", constraints = ");
        sb.append(this.f3448d);
        sb.append(", isComposed = ");
        sb.append(e());
        sb.append(", isMeasured = ");
        sb.append(this.g);
        sb.append(", isCanceled = ");
        return M0.o(sb, this.f3451h, " }");
    }
}
