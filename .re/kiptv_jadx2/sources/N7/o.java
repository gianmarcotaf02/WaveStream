package N7;

import D5.C0261o;
import E5.c1;
import J5.t2;
import com.google.common.util.concurrent.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import p078i6.w;

public abstract class o extends q {
    public static m g0(Iterator it) {
        kotlin.jvm.internal.m.e(it, "<this>");
        return h0(new p(1, it));
    }

    public static m h0(m mVar) {
        return mVar instanceof a ? mVar : new a(mVar);
    }

    public static int i0(m mVar) {
        kotlin.jvm.internal.m.e(mVar, "<this>");
        Iterator it = mVar.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            it.next();
            i3++;
            if (i3 < 0) {
                p078i6.p.G0();
                throw null;
            }
        }
        return i3;
    }

    public static m j0(m mVar, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(Y6.f.f(i3, "Requested element count ", " is less than zero.").toString());
        }
        if (i3 == 0) {
            return mVar;
        }
        return mVar instanceof f ? ((f) mVar).b(i3) : new e(mVar, i3, 0);
    }

    public static i k0(m mVar, p194x6.j predicate) {
        kotlin.jvm.internal.m.e(predicate, "predicate");
        return new i(mVar, true, predicate);
    }

    public static final j l0(m mVar, p194x6.j jVar) {
        if (!(mVar instanceof u)) {
            return new j(mVar, new p108m5.c(5), jVar);
        }
        u uVar = (u) mVar;
        return new j(uVar.f7470a, uVar.f7471b, jVar);
    }

    public static m m0(Object obj, p194x6.j jVar) {
        return obj == null ? g.f7442a : new l(new C0261o(11, obj), jVar, 0);
    }

    public static m n0(Function0 function0) {
        return h0(new l(function0, new c1(2, function0), 0));
    }

    public static Object o0(m mVar) {
        Iterator it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static u p0(m mVar, p194x6.j transform) {
        kotlin.jvm.internal.m.e(mVar, "<this>");
        kotlin.jvm.internal.m.e(transform, "transform");
        return new u(mVar, transform);
    }

    public static i q0(m mVar, p194x6.j jVar) {
        return new i(new u(mVar, jVar), false, new t2(4));
    }

    public static m r0(m mVar, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(Y6.f.f(i3, "Requested element count ", " is less than zero.").toString());
        }
        if (i3 == 0) {
            return g.f7442a;
        }
        return mVar instanceof f ? ((f) mVar).a(i3) : new e(mVar, i3, 1);
    }

    public static List s0(m mVar) {
        kotlin.jvm.internal.m.e(mVar, "<this>");
        Iterator it = mVar.iterator();
        if (!it.hasNext()) {
            return w.f23205h;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return P.i0(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
