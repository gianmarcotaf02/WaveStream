package p089k0;

import C5.C0134o;
import D5.C0258l;
import D5.o0;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.E;
import p020c0.AbstractC1703s;
import p020c0.C1700q;
import p020c0.C1701q0;
import p020c0.C1715y;
import p070h6.A;
import p194x6.a;
import p194x6.b;
import p194x6.c;
import p194x6.d;
import p194x6.f;
import p194x6.g;
import p194x6.h;
import p194x6.i;
import p194x6.k;
import p194x6.l;
import p194x6.m;
import p194x6.n;
import p194x6.o;
import p194x6.p;
import p194x6.q;
import p194x6.r;
import p194x6.s;
import p194x6.t;

public final class e implements m, n, o, p, q, r, s, t, a, b, c, d, p194x6.e, f, g, h, i, k, l {

    public final int f24407h;

    public final boolean f24408i;
    public Object j;

    public C1701q0 f24409k;

    public ArrayList f24410l;

    public e(int i3, Object obj, boolean z6) {
        this.f24407h = i3;
        this.f24408i = z6;
        this.j = obj;
    }

    public final Object a(int i3, C1700q c1700q) {
        c1700q.e0(this.f24407h);
        i(c1700q);
        int iA = i3 | (c1700q.f(this) ? f.a(2, 0) : f.a(1, 0));
        Object obj = this.j;
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        E.c(2, obj);
        Object objInvoke = ((m) obj).invoke(c1700q, Integer.valueOf(iA));
        C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new d(2, this, e.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objInvoke;
    }

    @Override
    public final Object b(String str, Boolean bool, w.c cVar, Object obj, Object obj2, C1700q c1700q, Integer num) {
        return h(str, bool, cVar, obj, obj2, c1700q, num.intValue());
    }

    public final Object c(Object obj, C1700q c1700q, int i3) {
        c1700q.e0(this.f24407h);
        i(c1700q);
        int iA = c1700q.f(this) ? f.a(2, 1) : f.a(1, 1);
        Object obj2 = this.j;
        kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        E.c(3, obj2);
        Object objInvoke = ((n) obj2).invoke(obj, c1700q, Integer.valueOf(iA | i3));
        C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new D.l(this, obj, i3, 9);
        }
        return objInvoke;
    }

    public final Object d(Object obj, Object obj2, C1700q c1700q, int i3) {
        c1700q.e0(this.f24407h);
        i(c1700q);
        int iA = c1700q.f(this) ? f.a(2, 2) : f.a(1, 2);
        Object obj3 = this.j;
        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        E.c(4, obj3);
        Object objInvoke = ((o) obj3).invoke(obj, obj2, c1700q, Integer.valueOf(iA | i3));
        C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new o0(i3, 9, this, obj, obj2);
        }
        return objInvoke;
    }

    @Override
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
        return g(obj, obj2, obj3, obj4, (C1700q) obj5, ((Number) serializable).intValue());
    }

    public final Object f(Object obj, Object obj2, Object obj3, C1700q c1700q, int i3) {
        c1700q.e0(this.f24407h);
        i(c1700q);
        int iA = c1700q.f(this) ? f.a(2, 3) : f.a(1, 3);
        Object obj4 = this.j;
        kotlin.jvm.internal.m.c(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        E.c(5, obj4);
        Object objInvoke = ((p) obj4).invoke(obj, obj2, obj3, c1700q, Integer.valueOf(iA | i3));
        C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new C0134o(i3, 4, this, obj, obj2, obj3);
        }
        return objInvoke;
    }

    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, C1700q c1700q, int i3) {
        c1700q.e0(this.f24407h);
        i(c1700q);
        int iA = c1700q.f(this) ? f.a(2, 4) : f.a(1, 4);
        Object obj5 = this.j;
        kotlin.jvm.internal.m.c(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        E.c(6, obj5);
        Object objE = ((q) obj5).e(obj, obj2, obj3, obj4, c1700q, Integer.valueOf(i3 | iA));
        C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new C0258l(this, obj, obj2, obj3, obj4, i3, 3);
        }
        return objE;
    }

    public final Object h(final String str, final Boolean bool, final w.c cVar, final Object obj, final Object obj2, C1700q c1700q, final int i3) {
        c1700q.e0(this.f24407h);
        i(c1700q);
        int iA = c1700q.f(this) ? f.a(2, 6) : f.a(1, 6);
        Object obj3 = this.j;
        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        E.c(8, obj3);
        Object objB = ((s) obj3).b(str, bool, cVar, obj, obj2, c1700q, Integer.valueOf(i3 | iA));
        C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new m() {
                @Override
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iK = AbstractC1703s.K(i3) | 1;
                    Boolean bool2 = bool;
                    Object obj6 = obj2;
                    this.f24400h.h(str, bool2, cVar, obj, obj6, (C1700q) obj4, iK);
                    return A.f22523a;
                }
            };
        }
        return objB;
    }

    public final void i(C1700q c1700q) {
        C1701q0 c1701q0B;
        if (!this.f24408i || (c1701q0B = c1700q.B()) == null) {
            return;
        }
        c1700q.getClass();
        c1701q0B.f18349b |= 1;
        if (f.e(this.f24409k, c1701q0B)) {
            this.f24409k = c1701q0B;
            return;
        }
        ArrayList arrayList = this.f24410l;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f24410l = arrayList2;
            arrayList2.add(c1701q0B);
            return;
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (f.e((C1701q0) arrayList.get(i3), c1701q0B)) {
                arrayList.set(i3, c1701q0B);
                return;
            }
        }
        arrayList.add(c1701q0B);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return a(((Number) obj2).intValue(), (C1700q) obj);
    }

    public final void j(p070h6.e eVar) {
        if (kotlin.jvm.internal.m.a(this.j, eVar)) {
            return;
        }
        boolean z6 = this.j == null;
        this.j = eVar;
        if (z6 || !this.f24408i) {
            return;
        }
        C1701q0 c1701q0 = this.f24409k;
        if (c1701q0 != null) {
            C1715y c1715y = c1701q0.f18348a;
            if (c1715y != null) {
                c1715y.s(c1701q0, null);
            }
            this.f24409k = null;
        }
        ArrayList arrayList = this.f24410l;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1701q0 c1701q1 = (C1701q0) arrayList.get(i3);
                C1715y c1715y2 = c1701q1.f18348a;
                if (c1715y2 != null) {
                    c1715y2.s(c1701q1, null);
                }
            }
            arrayList.clear();
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return c(obj, (C1700q) obj2, ((Number) obj3).intValue());
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, (C1700q) obj3, ((Number) obj4).intValue());
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return f(obj, obj2, obj3, (C1700q) obj4, ((Number) obj5).intValue());
    }
}
