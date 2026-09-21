package p121o0;

import B.d0;
import I3.b;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k3.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.m;
import p020c0.AbstractC1693m0;
import p020c0.AbstractC1703s;
import p020c0.AbstractC1705t;
import p020c0.C1698p;
import p038e0.e;
import p078i6.C2255f;
import p078i6.o;
import p089k0.f;
import p136q.C;
import p194x6.j;

public final class r {

    public final j f26014a;

    public boolean f26016c;

    public h f26020h;

    public q f26021i;

    public final AtomicReference f26015b = new AtomicReference(null);

    public final d0 f26017d = new d0(21, this);

    public final C2255f f26018e = new C2255f(17, this);

    public final e f26019f = new e(new q[16]);
    public final Object g = new Object();
    public long j = -1;

    public r(j jVar) {
        this.f26014a = jVar;
    }

    public final void a() {
        synchronized (this.g) {
            e eVar = this.f26019f;
            Object[] objArr = eVar.f21324h;
            int i3 = eVar.j;
            for (int i9 = 0; i9 < i3; i9++) {
                q qVar = (q) objArr[i9];
                qVar.f26007e.a();
                qVar.f26008f.a();
                qVar.f26012l.a();
                qVar.f26013m.clear();
            }
        }
    }

    public final void b(Object obj) {
        int i3;
        synchronized (this.g) {
            try {
                e eVar = this.f26019f;
                int i9 = eVar.j;
                int i10 = 0;
                int i11 = 0;
                while (i10 < i9) {
                    q qVar = (q) eVar.f21324h[i10];
                    C c9 = (C) qVar.f26008f.k(obj);
                    if (c9 == null) {
                        i3 = i10;
                    } else {
                        Object[] objArr = c9.f26298b;
                        int[] iArr = c9.f26299c;
                        long[] jArr = c9.f26297a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i12 = 0;
                            while (true) {
                                long j = jArr[i12];
                                i3 = i10;
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        if ((j & 255) < 128) {
                                            int i15 = (i12 << 3) + i14;
                                            Object obj2 = objArr[i15];
                                            int i16 = iArr[i15];
                                            qVar.c(obj, obj2);
                                        }
                                        j >>= 8;
                                    }
                                    if (i13 != 8) {
                                        break;
                                    }
                                    if (i12 != length) {
                                        break;
                                    }
                                    i12++;
                                    i10 = i3;
                                } else if (i12 != length) {
                                    break;
                                    break;
                                } else {
                                    i12++;
                                    i10 = i3;
                                }
                            }
                        } else {
                            i3 = i10;
                        }
                    }
                    if (!qVar.f26008f.j()) {
                        i11++;
                    } else if (i11 > 0) {
                        Object[] objArr2 = eVar.f21324h;
                        objArr2[i3 - i11] = objArr2[i3];
                    }
                    i10 = i3 + 1;
                }
                int i17 = i9 - i11;
                Arrays.fill(eVar.f21324h, i17, i9, (Object) null);
                eVar.j = i17;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z6;
        Set set;
        synchronized (this.g) {
            z6 = this.f26016c;
        }
        if (z6) {
            return false;
        }
        boolean z9 = false;
        while (true) {
            AtomicReference atomicReference = this.f26015b;
            Object obj = atomicReference.get();
            Set set2 = null;
            Object obj2 = null;
            Object objSubList = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        AbstractC1705t.b("Unexpected notification");
                        throw new b();
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set = set3;
                    obj2 = objSubList;
                }
                while (true) {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set2 = set;
                    } else if (atomicReference.get() != obj) {
                    }
                }
            }
            if (set2 == null) {
                return z9;
            }
            synchronized (this.g) {
                e eVar = this.f26019f;
                Object[] objArr = eVar.f21324h;
                int i3 = eVar.j;
                for (int i9 = 0; i9 < i3; i9++) {
                    z9 = ((q) objArr[i9]).a(set2) || z9;
                }
            }
        }
    }

    public final void d(Object obj, j jVar, Function0 function0) {
        Object obj2;
        q qVar;
        boolean z6;
        C c9;
        f xVar;
        Object obj3;
        Object obj4;
        long[] jArr;
        int i3;
        long[] jArr2;
        long j;
        synchronized (this.g) {
            e eVar = this.f26019f;
            Object[] objArr = eVar.f21324h;
            int i9 = eVar.j;
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i10];
                if (((q) obj2).f26003a == jVar) {
                    break;
                } else {
                    i10++;
                }
            }
            qVar = (q) obj2;
            z6 = true;
            if (qVar == null) {
                m.c(jVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                E.c(1, jVar);
                qVar = new q(jVar);
                eVar.c(qVar);
            }
        }
        q qVar2 = this.f26021i;
        long j9 = this.j;
        if (j9 != -1 && j9 != f.c()) {
            StringBuilder sbU = p.u(j9, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
            sbU.append(f.c());
            sbU.append(", name=");
            sbU.append(Thread.currentThread().getName());
            sbU.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            AbstractC1693m0.a(sbU.toString());
        }
        try {
            this.f26021i = qVar;
            this.j = f.c();
            C2255f c2255f = this.f26018e;
            Object obj5 = qVar.f26004b;
            C c10 = qVar.f26005c;
            int i11 = qVar.f26006d;
            qVar.f26004b = obj;
            qVar.f26005c = (C) qVar.f26008f.g(obj);
            if (qVar.f26006d == -1) {
                qVar.f26006d = Long.hashCode(k.j().g());
            }
            C1698p c1698p = qVar.f26010i;
            e eVarQ = AbstractC1703s.q();
            try {
                eVarQ.c(c1698p);
                if (c2255f == null) {
                    function0.invoke();
                    c9 = c10;
                } else {
                    f fVar = (f) k.f25992b.i();
                    if (fVar instanceof x) {
                        c9 = c10;
                        if (((x) fVar).f26036t == f.c()) {
                            j jVar2 = ((x) fVar).f26034r;
                            j jVar3 = ((x) fVar).f26035s;
                            try {
                                ((x) fVar).f26034r = k.k(true, c2255f, jVar2);
                                ((x) fVar).f26035s = jVar3;
                                function0.invoke();
                                ((x) fVar).f26034r = jVar2;
                                ((x) fVar).f26035s = jVar3;
                            } catch (Throwable th) {
                                ((x) fVar).f26034r = jVar2;
                                ((x) fVar).f26035s = jVar3;
                                throw th;
                            }
                        }
                    } else {
                        c9 = c10;
                    }
                    if (fVar == null || (fVar instanceof b)) {
                        xVar = new x(fVar instanceof b ? (b) fVar : null, c2255f, null, true, false);
                    } else {
                        xVar = fVar.u(c2255f);
                    }
                    try {
                        f fVarJ = xVar.j();
                        try {
                            function0.invoke();
                            f.q(fVarJ);
                            xVar.c();
                        } catch (Throwable th2) {
                            try {
                                f.q(fVarJ);
                                throw th2;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    xVar.c();
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                    eVarQ.m(eVarQ.j - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                eVarQ.m(eVarQ.j - 1);
                Object obj6 = qVar.f26004b;
                m.b(obj6);
                int i12 = qVar.f26006d;
                C c11 = qVar.f26005c;
                if (c11 != null) {
                    long[] jArr3 = c11.f26297a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j10 = jArr3[i13];
                            boolean z9 = z6;
                            obj4 = obj5;
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i14 = 8 - ((~(i13 - length)) >>> 31);
                                int i15 = 0;
                                while (i15 < i14) {
                                    if ((j10 & 255) < 128) {
                                        i3 = i15;
                                        int i16 = (i13 << 3) + i3;
                                        jArr2 = jArr3;
                                        Object obj7 = c11.f26298b[i16];
                                        j = j10;
                                        boolean z10 = c11.f26299c[i16] != i12 ? z9 : false;
                                        if (z10) {
                                            qVar.c(obj6, obj7);
                                        }
                                        if (z10) {
                                            c11.f(i16);
                                        }
                                    } else {
                                        i3 = i15;
                                        jArr2 = jArr3;
                                        j = j10;
                                    }
                                    j10 = j >> 8;
                                    i15 = i3 + 1;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                if (i14 != 8) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                            }
                            if (i13 == length) {
                                break;
                            }
                            i13++;
                            z6 = z9;
                            obj5 = obj4;
                            jArr3 = jArr;
                        }
                        obj3 = obj4;
                    } else {
                        obj3 = obj5;
                    }
                } else {
                    obj3 = obj5;
                }
                qVar.f26004b = obj3;
                qVar.f26005c = c9;
                qVar.f26006d = i11;
                this.f26021i = qVar2;
                this.j = j9;
            } catch (Throwable th6) {
                th = th6;
                eVarQ.m(eVarQ.j - 1);
                throw th;
            }
        } catch (Throwable th7) {
            this.f26021i = qVar2;
            this.j = j9;
            throw th7;
        }
    }

    public final void e() {
        d0 d0Var = this.f26017d;
        k.e(k.f25991a);
        synchronized (k.f25993c) {
            k.f25997h = o.z1(d0Var, k.f25997h);
        }
        this.f26020h = new h(3, d0Var);
    }
}
