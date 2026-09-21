package p121o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f26002a = new java.lang.Object();

    public static final void a(int i3, int i9) {
        if (i3 < 0 || i3 >= i9) {
            throw new java.lang.IndexOutOfBoundsException("index (" + i3 + ") is out of bound of [0, " + i9 + ')');
        }
    }

    public static final boolean b(p121o0.s sVar, int i3, p056g0.c cVar, boolean z6) {
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
            } catch (java.lang.Throwable th) {
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

    public static p121o0.f e() {
        return (p121o0.f) p121o0.k.f25992b.i();
    }

    public static final p121o0.s f(p121o0.n nVar) {
        p121o0.s sVar = nVar.f26001h;
        kotlin.jvm.internal.m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (p121o0.s) p121o0.k.t(sVar, nVar);
    }

    public static final int g(p121o0.n nVar) {
        p121o0.s sVar = nVar.f26001h;
        kotlin.jvm.internal.m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((p121o0.s) p121o0.k.h(sVar)).f26024e;
    }

    public static p121o0.f h(p121o0.f fVar) {
        if (fVar instanceof p121o0.x) {
            p121o0.x xVar = (p121o0.x) fVar;
            if (xVar.f26036t == p089k0.f.c()) {
                xVar.f26034r = null;
                return fVar;
            }
        }
        if (fVar instanceof p121o0.y) {
            p121o0.y yVar = (p121o0.y) fVar;
            if (yVar.f26040i == p089k0.f.c()) {
                yVar.f26039h = null;
                return fVar;
            }
        }
        p121o0.f fVarG = p121o0.k.g(fVar, null, false);
        fVarG.j();
        return fVarG;
    }

    public static final boolean i(p121o0.n nVar, p194x6.j jVar) {
        int i3;
        p056g0.c cVar;
        java.lang.Object objInvoke;
        p121o0.f fVarJ;
        boolean zB;
        do {
            synchronized (f26002a) {
                p121o0.s sVar = nVar.f26001h;
                kotlin.jvm.internal.m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                p121o0.s sVar2 = (p121o0.s) p121o0.k.h(sVar);
                i3 = sVar2.f26023d;
                cVar = sVar2.f26022c;
            }
            kotlin.jvm.internal.m.b(cVar);
            p056g0.f fVarP = cVar.p();
            objInvoke = jVar.invoke(fVarP);
            p056g0.c cVarN = fVarP.n();
            if (kotlin.jvm.internal.m.a(cVarN, cVar)) {
                break;
            }
            p121o0.s sVar3 = nVar.f26001h;
            kotlin.jvm.internal.m.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (p121o0.k.f25993c) {
                fVarJ = p121o0.k.j();
                zB = b((p121o0.s) p121o0.k.w(sVar3, nVar, fVarJ), i3, cVarN, true);
            }
            p121o0.k.n(fVarJ, nVar);
        } while (!zB);
        return ((java.lang.Boolean) objInvoke).booleanValue();
    }

    public static java.lang.Object j(B.Y y, kotlin.jvm.functions.Function0 function0) {
        p121o0.f xVar;
        p121o0.f fVar = (p121o0.f) p121o0.k.f25992b.i();
        if (fVar instanceof p121o0.x) {
            p121o0.x xVar2 = (p121o0.x) fVar;
            if (xVar2.f26036t == p089k0.f.c()) {
                p194x6.j jVar = xVar2.f26034r;
                p194x6.j jVar2 = xVar2.f26035s;
                try {
                    ((p121o0.x) fVar).f26034r = p121o0.k.k(true, y, jVar);
                    ((p121o0.x) fVar).f26035s = jVar2;
                    return function0.invoke();
                } finally {
                    xVar2.f26034r = jVar;
                    xVar2.f26035s = jVar2;
                }
            }
        }
        if (fVar == null || (fVar instanceof p121o0.b)) {
            xVar = new p121o0.x(fVar instanceof p121o0.b ? (p121o0.b) fVar : null, y, null, true, false);
        } else {
            xVar = fVar.u(y);
        }
        try {
            p121o0.f fVarJ = xVar.j();
            try {
                java.lang.Object objInvoke = function0.invoke();
                p121o0.f.q(fVarJ);
                xVar.c();
                return objInvoke;
            } catch (java.lang.Throwable th) {
                p121o0.f.q(fVarJ);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            xVar.c();
            throw th2;
        }
    }

    public static void k(p121o0.f fVar, p121o0.f fVar2, p194x6.j jVar) {
        if (fVar != fVar2) {
            fVar2.getClass();
            p121o0.f.q(fVar);
            fVar2.c();
        } else if (fVar instanceof p121o0.x) {
            ((p121o0.x) fVar).f26034r = jVar;
        } else if (fVar instanceof p121o0.y) {
            ((p121o0.y) fVar).f26039h = jVar;
        } else {
            throw new java.lang.IllegalStateException(("Non-transparent snapshot was reused: " + fVar).toString());
        }
    }

    public static final void l() {
        throw new java.lang.UnsupportedOperationException();
    }

    public abstract void d();
}
