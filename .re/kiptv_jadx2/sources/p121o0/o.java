package p121o0;

import B.Y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import p056g0.c;
import p089k0.f;
import p194x6.j;

public abstract class o {

    public static final Object f26002a = new Object();

    public static final void a(int i3, int i9) {
        if (i3 < 0 || i3 >= i9) {
            throw new IndexOutOfBoundsException("index (" + i3 + ") is out of bound of [0, " + i9 + ')');
        }
    }

    public static final boolean b(s sVar, int i3, c cVar, boolean z6) {
        boolean z9;
        synchronized (f26002a) {
            try {
                int i9 = sVar.f26023d;
                if (i9 == i3) {
                    sVar.f26022c = cVar;
                    z9 = true;
                    if (z6) {
                        sVar.f26024e++;
                    }
                    sVar.f26023d = i9 + 1;
                } else {
                    z9 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9;
    }

    public static final int c(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i3 = 0;
        while (i3 <= length) {
            int i9 = (i3 + length) >>> 1;
            long j9 = jArr[i9];
            if (j > j9) {
                i3 = i9 + 1;
            } else {
                if (j >= j9) {
                    return i9;
                }
                length = i9 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static f e() {
        return (f) k.f25992b.i();
    }

    public static final s f(n nVar) {
        s sVar = nVar.f26001h;
        m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (s) k.t(sVar, nVar);
    }

    public static final int g(n nVar) {
        s sVar = nVar.f26001h;
        m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((s) k.h(sVar)).f26024e;
    }

    public static f h(f fVar) {
        if (fVar instanceof x) {
            x xVar = (x) fVar;
            if (xVar.f26036t == f.c()) {
                xVar.f26034r = null;
                return fVar;
            }
        }
        if (fVar instanceof y) {
            y yVar = (y) fVar;
            if (yVar.f26040i == f.c()) {
                yVar.f26039h = null;
                return fVar;
            }
        }
        f fVarG = k.g(fVar, null, false);
        fVarG.j();
        return fVarG;
    }

    public static final boolean i(n nVar, j jVar) {
        int i3;
        c cVar;
        Object objInvoke;
        f fVarJ;
        boolean zB;
        do {
            synchronized (f26002a) {
                s sVar = nVar.f26001h;
                m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                s sVar2 = (s) k.h(sVar);
                i3 = sVar2.f26023d;
                cVar = sVar2.f26022c;
            }
            m.b(cVar);
            p056g0.f fVarP = cVar.p();
            objInvoke = jVar.invoke(fVarP);
            c cVarN = fVarP.n();
            if (m.a(cVarN, cVar)) {
                break;
            }
            s sVar3 = nVar.f26001h;
            m.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (k.f25993c) {
                fVarJ = k.j();
                zB = b((s) k.w(sVar3, nVar, fVarJ), i3, cVarN, true);
            }
            k.n(fVarJ, nVar);
        } while (!zB);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static Object j(Y y, Function0 function0) {
        f xVar;
        f fVar = (f) k.f25992b.i();
        if (fVar instanceof x) {
            x xVar2 = (x) fVar;
            if (xVar2.f26036t == f.c()) {
                j jVar = xVar2.f26034r;
                j jVar2 = xVar2.f26035s;
                try {
                    ((x) fVar).f26034r = k.k(true, y, jVar);
                    ((x) fVar).f26035s = jVar2;
                    return function0.invoke();
                } finally {
                    xVar2.f26034r = jVar;
                    xVar2.f26035s = jVar2;
                }
            }
        }
        if (fVar == null || (fVar instanceof b)) {
            xVar = new x(fVar instanceof b ? (b) fVar : null, y, null, true, false);
        } else {
            xVar = fVar.u(y);
        }
        try {
            f fVarJ = xVar.j();
            try {
                Object objInvoke = function0.invoke();
                f.q(fVarJ);
                xVar.c();
                return objInvoke;
            } catch (Throwable th) {
                f.q(fVarJ);
                throw th;
            }
        } catch (Throwable th2) {
            xVar.c();
            throw th2;
        }
    }

    public static void k(f fVar, f fVar2, j jVar) {
        if (fVar != fVar2) {
            fVar2.getClass();
            f.q(fVar);
            fVar2.c();
        } else if (fVar instanceof x) {
            ((x) fVar).f26034r = jVar;
        } else if (fVar instanceof y) {
            ((y) fVar).f26039h = jVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + fVar).toString());
        }
    }

    public static final void l() {
        throw new UnsupportedOperationException();
    }

    public abstract void d();
}
