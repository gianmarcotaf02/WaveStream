package X7;

import B.C0063a;
import N6.A;
import O7.x;
import S7.AbstractC0906w;
import S7.C;
import S7.C0889g0;
import S7.C0903t;
import S7.F0;
import S7.InterfaceC0891h0;
import S7.InterfaceC0908y;
import S7.J;
import S7.X;
import S7.z0;
import androidx.media3.common.util.Log;
import com.google.android.gms.internal.play_billing.M0;
import com.google.common.util.concurrent.AbstractC1903s;
import com.google.common.util.concurrent.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class a {

    public static final A f10898a = new A("CLOSED", 2);

    public static final A f10899b = new A("UNDEFINED", 2);

    public static final A f10900c = new A("REUSABLE_CLAIMED", 2);

    public static final A f10901d = new A("NO_THREAD_ELEMENTS", 2);

    public static final C0063a f10902e = new C0063a(28);

    public static final C0063a f10903f = new C0063a(29);
    public static final t g = new t(0);

    public static final void a(int i3) {
        if (i3 < 1) {
            throw new IllegalArgumentException(M0.l(i3, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(q qVar, long j, p194x6.m mVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (qVar.j >= j && !qVar.d()) {
                return qVar;
            }
            Object obj = b.f10904h.get(qVar);
            A a2 = f10898a;
            if (obj == a2) {
                return a2;
            }
            q qVar2 = (q) ((b) obj);
            if (qVar2 == null) {
                qVar2 = (q) mVar.invoke(Long.valueOf(qVar.j + 1), qVar);
                do {
                    atomicReferenceFieldUpdater = b.f10904h;
                    if (atomicReferenceFieldUpdater.compareAndSet(qVar, null, qVar2)) {
                        if (qVar.d()) {
                            qVar.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(qVar) == null);
            }
            qVar = qVar2;
        }
    }

    public static final q c(Object obj) {
        if (obj != f10898a) {
            return (q) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(p100l6.h hVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = d.f10907a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0908y) it.next()).handleException(hVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC1903s.j(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC1903s.j(th, new e(hVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f10898a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(p100l6.h hVar, Object obj) {
        if (obj == f10901d) {
            return;
        }
        if (!(obj instanceof v)) {
            Object objFold = hVar.fold(null, f10903f);
            kotlin.jvm.internal.m.c(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((p018b8.a) objFold).V(obj);
            return;
        }
        v vVar = (v) obj;
        p018b8.a[] aVarArr = vVar.f10941c;
        int length = aVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = length - 1;
            p018b8.a aVar = aVarArr[length];
            kotlin.jvm.internal.m.b(aVar);
            aVar.V(vVar.f10940b[length]);
            if (i3 < 0) {
                return;
            } else {
                length = i3;
            }
        }
    }

    public static final void h(Object obj, p100l6.c cVar) throws J {
        if (!(cVar instanceof f)) {
            cVar.resumeWith(obj);
            return;
        }
        f fVar = (f) cVar;
        Throwable thA = p070h6.n.a(obj);
        Object c0903t = thA == null ? obj : new C0903t(thA, false);
        AbstractC0906w abstractC0906w = fVar.f10910k;
        p117n6.c cVar2 = fVar.f10911l;
        if (j(abstractC0906w, cVar2.getContext())) {
            fVar.f10912m = c0903t;
            fVar.j = 1;
            i(abstractC0906w, cVar2.getContext(), fVar);
            return;
        }
        X xA = z0.a();
        if (xA.f9563i >= 4294967296L) {
            fVar.f10912m = c0903t;
            fVar.j = 1;
            xA.a0(fVar);
            return;
        }
        xA.c0(true);
        try {
            InterfaceC0891h0 interfaceC0891h0 = (InterfaceC0891h0) cVar2.getContext().get(C0889g0.f9584h);
            if (interfaceC0891h0 == null || interfaceC0891h0.isActive()) {
                Object obj2 = fVar.f10913n;
                p100l6.h context = cVar2.getContext();
                Object objN = n(context, obj2);
                F0 f0J = objN != f10901d ? C.J(cVar2, context, objN) : null;
                try {
                    cVar2.resumeWith(obj);
                    if (f0J == null || f0J.d0()) {
                        g(context, objN);
                    }
                } catch (Throwable th) {
                    if (f0J == null || f0J.d0()) {
                        g(context, objN);
                    }
                    throw th;
                }
            } else {
                fVar.resumeWith(P.T(interfaceC0891h0.t()));
            }
            while (xA.e0()) {
            }
        } catch (Throwable th2) {
            try {
                fVar.f(th2);
            } finally {
                xA.Z(true);
            }
        }
    }

    public static final void i(AbstractC0906w abstractC0906w, p100l6.h hVar, Runnable runnable) throws J {
        try {
            abstractC0906w.V(hVar, runnable);
        } catch (Throwable th) {
            throw new J(th, abstractC0906w, hVar);
        }
    }

    public static final boolean j(AbstractC0906w abstractC0906w, p100l6.h hVar) throws J {
        try {
            return abstractC0906w.X(hVar);
        } catch (Throwable th) {
            throw new J(th, abstractC0906w, hVar);
        }
    }

    public static final long k(String str, long j, long j9, long j10) {
        String property;
        int i3 = s.f10935a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lA0 = x.A0(property);
        if (lA0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lA0.longValue();
        if (j9 <= jLongValue && jLongValue <= j10) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j9 + ".." + j10 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int l(int i3, int i9, String str) {
        return (int) k(str, i3, 1, (i9 & 8) != 0 ? Log.LOG_LEVEL_OFF : 2097150);
    }

    public static final Object m(p100l6.h hVar) {
        Object objFold = hVar.fold(0, f10902e);
        kotlin.jvm.internal.m.b(objFold);
        return objFold;
    }

    public static final Object n(p100l6.h hVar, Object obj) {
        if (obj == null) {
            obj = m(hVar);
        }
        if (obj == 0) {
            return f10901d;
        }
        return obj instanceof Integer ? hVar.fold(new v(((Number) obj).intValue(), hVar), g) : ((p018b8.a) obj).X(hVar);
    }
}
