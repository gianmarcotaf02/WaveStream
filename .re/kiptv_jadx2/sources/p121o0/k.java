package p121o0;

import B8.h;
import D1.C0219e;
import H5.Z;
import j1.l;
import java.util.HashMap;
import kotlin.jvm.internal.m;
import p078i6.w;
import p089k0.a;
import p089k0.n;
import p108m5.c;
import p136q.I;
import p194x6.j;

public abstract class k {

    public static final c f25991a = new c(16);

    public static final l f25992b = new l(2);

    public static final Object f25993c = new Object();

    public static j f25994d;

    public static long f25995e;

    public static final C0219e f25996f;
    public static final h g;

    public static Object f25997h;

    public static Object f25998i;
    public static final a j;

    public static final a f25999k;

    static {
        j jVar = j.f25987l;
        f25994d = jVar;
        long j9 = 1;
        f25995e = j9 + j9;
        C0219e c0219e = new C0219e(2);
        c0219e.f2002i = new long[16];
        c0219e.f2004l = new int[16];
        ?? r9 = new int[16];
        int i3 = 0;
        while (i3 < 16) {
            int i9 = i3 + 1;
            r9[i3] = i9;
            i3 = i9;
        }
        c0219e.f2005m = r9;
        f25996f = c0219e;
        h hVar = new h((char) 0, 12);
        hVar.j = new int[16];
        hVar.f862k = new n[16];
        g = hVar;
        w wVar = w.f23205h;
        f25997h = wVar;
        f25998i = wVar;
        long j10 = f25995e;
        f25995e = j9 + j10;
        a aVar = new a(j10, jVar, null, new c(15));
        f25994d = f25994d.p(aVar.f25977b);
        j = aVar;
        f25999k = new a(0);
    }

    public static final void a() {
        e(f25991a);
    }

    public static final HashMap b(long j9, b bVar, j jVar) {
        long[] jArr;
        j jVar2;
        long[] jArr2;
        int i3;
        int i9;
        v vVarS;
        I iX = bVar.x();
        if (iX != null) {
            long jG = bVar.g();
            j jVarO = bVar.d().p(jG).o(bVar.j);
            Object[] objArr = iX.f26329b;
            long[] jArr3 = iX.f26328a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i10 = 0;
                HashMap map = null;
                while (true) {
                    long j10 = jArr3[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8;
                        int i12 = 8 - ((~(i10 - length)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j10 & 255) < 128) {
                                t tVar = (t) objArr[(i10 << 3) + i13];
                                v vVarD = tVar.d();
                                jArr2 = jArr3;
                                i3 = i11;
                                i9 = i13;
                                v vVarS2 = s(vVarD, j9, jVar);
                                if (vVarS2 != null && (vVarS = s(vVarD, jG, jVarO)) != null && !vVarS2.equals(vVarS)) {
                                    v vVarS3 = s(vVarD, jG, bVar.d());
                                    if (vVarS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    v vVarN = tVar.n(vVarS, vVarS2, vVarS3);
                                    if (vVarN == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(vVarS2, vVarN);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i3 = i11;
                                i9 = i13;
                            }
                            j10 >>= i3;
                            i13 = i9 + 1;
                            i11 = i3;
                            jArr3 = jArr2;
                            jVarO = jVarO;
                        }
                        jArr = jArr3;
                        jVar2 = jVarO;
                        if (i12 != i11) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        jVar2 = jVarO;
                    }
                    if (i10 == length) {
                        return map;
                    }
                    i10++;
                    jArr3 = jArr;
                    jVarO = jVar2;
                }
            }
        }
        return null;
    }

    public static final void c(f fVar) {
        long j9;
        if (f25994d.n(fVar.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(fVar.g());
        sb.append(", disposed=");
        sb.append(fVar.f25978c);
        sb.append(", applied=");
        b bVar = fVar instanceof b ? (b) fVar : null;
        sb.append(bVar != null ? Boolean.valueOf(bVar.f25969m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f25993c) {
            C0219e c0219e = f25996f;
            j9 = c0219e.j > 0 ? ((long[]) c0219e.f2002i)[0] : -1L;
        }
        sb.append(j9);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final j d(j jVar, long j9, long j10) {
        while (m.g(j9, j10) < 0) {
            jVar = jVar.p(j9);
            j9 += (long) 1;
        }
        return jVar;
    }

    public static final Object e(j jVar) {
        I i3;
        Object objV;
        a aVar = j;
        synchronized (f25993c) {
            try {
                i3 = aVar.f25965h;
                if (i3 != null) {
                    f25999k.addAndGet(1);
                }
                objV = v(aVar, jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i3 != null) {
            try {
                ?? r9 = f25997h;
                int size = r9.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((p194x6.m) r9.get(i9)).invoke(new p038e0.h(i3), aVar);
                }
                f25999k.addAndGet(-1);
            } catch (Throwable th2) {
                f25999k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (f25993c) {
            f();
            if (i3 != null) {
                Object[] objArr = i3.f26329b;
                long[] jArr = i3.f26328a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j9 = jArr[i10];
                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i10 != length) {
                                break;
                                break;
                            }
                            i10++;
                        } else {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j9) < 128) {
                                    q((t) objArr[(i10 << 3) + i12]);
                                }
                                j9 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                            if (i10 != length) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        return objV;
    }

    public static final void f() {
        h hVar = g;
        int i3 = hVar.f861i;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i9 >= i3) {
                break;
            }
            n nVar = ((n[]) hVar.f862k)[i9];
            Object obj = nVar != null ? nVar.get() : null;
            if (obj != null && p((t) obj)) {
                if (i10 != i9) {
                    ((n[]) hVar.f862k)[i10] = nVar;
                    int[] iArr = (int[]) hVar.j;
                    iArr[i10] = iArr[i9];
                }
                i10++;
            }
            i9++;
        }
        for (int i11 = i10; i11 < i3; i11++) {
            ((n[]) hVar.f862k)[i11] = null;
            ((int[]) hVar.j)[i11] = 0;
        }
        if (i10 != i3) {
            hVar.f861i = i10;
        }
    }

    public static final f g(f fVar, j jVar, boolean z6) {
        boolean z9 = fVar instanceof b;
        if (z9 || fVar == null) {
            return new x(z9 ? (b) fVar : null, jVar, null, false, z6);
        }
        return new y(fVar, jVar, false, z6);
    }

    public static final v h(v vVar) {
        v vVarS;
        f fVarJ = j();
        v vVarS2 = s(vVar, fVarJ.g(), fVarJ.d());
        if (vVarS2 != null) {
            return vVarS2;
        }
        synchronized (f25993c) {
            f fVarJ2 = j();
            vVarS = s(vVar, fVarJ2.g(), fVarJ2.d());
        }
        if (vVarS != null) {
            return vVarS;
        }
        r();
        throw null;
    }

    public static final v i(v vVar, f fVar) {
        v vVarS;
        v vVarS2 = s(vVar, fVar.g(), fVar.d());
        if (vVarS2 != null) {
            return vVarS2;
        }
        synchronized (f25993c) {
            vVarS = s(vVar, fVar.g(), fVar.d());
        }
        if (vVarS != null) {
            return vVarS;
        }
        r();
        throw null;
    }

    public static final f j() {
        f fVar = (f) f25992b.i();
        return fVar == null ? j : fVar;
    }

    public static final j k(boolean z6, j jVar, j jVar2) {
        if (!z6) {
            jVar2 = null;
        }
        if (jVar == null || jVar2 == null || jVar == jVar2) {
            return jVar == null ? jVar2 : jVar;
        }
        return new Z(jVar, jVar2, 6);
    }

    public static final j l(j jVar, j jVar2) {
        if (jVar == null || jVar2 == null || jVar == jVar2) {
            return jVar == null ? jVar2 : jVar;
        }
        return new Z(jVar, jVar2, 7);
    }

    public static final v m(v vVar, t tVar) {
        long j9 = f25995e;
        C0219e c0219e = f25996f;
        if (c0219e.j > 0) {
            j9 = ((long[]) c0219e.f2002i)[0];
        }
        long j10 = j9 - ((long) 1);
        j jVar = j.f25987l;
        v vVar2 = null;
        v vVar3 = null;
        for (v vVarD = tVar.d(); vVarD != null; vVarD = vVarD.f26027b) {
            long j11 = vVarD.f26026a;
            if (j11 != 0) {
                if (j11 != 0 && m.g(j11, j10) <= 0 && !jVar.n(j11)) {
                    if (vVar3 != null) {
                        if (m.g(vVarD.f26026a, vVar3.f26026a) >= 0) {
                            vVar2 = vVar3;
                            break;
                        }
                        break;
                    }
                    vVar3 = vVarD;
                }
            }
            vVar2 = vVarD;
            break;
        }
        if (vVar2 != null) {
            vVar2.f26026a = Long.MAX_VALUE;
            return vVar2;
        }
        v vVarB = vVar.b(Long.MAX_VALUE);
        vVarB.f26027b = tVar.d();
        tVar.e(vVarB);
        return vVarB;
    }

    public static final void n(f fVar, t tVar) {
        fVar.t(fVar.h() + 1);
        j jVarI = fVar.i();
        if (jVarI != null) {
            jVarI.invoke(tVar);
        }
    }

    public static final v o(v vVar, u uVar, f fVar, v vVar2) {
        v vVarM;
        if (fVar.f()) {
            fVar.n(uVar);
        }
        long jG = fVar.g();
        if (vVar2.f26026a == jG) {
            return vVar2;
        }
        synchronized (f25993c) {
            vVarM = m(vVar, uVar);
        }
        vVarM.f26026a = jG;
        if (vVar2.f26026a != 1) {
            fVar.n(uVar);
        }
        return vVarM;
    }

    public static final boolean p(t tVar) {
        v vVar;
        long j9 = f25995e;
        C0219e c0219e = f25996f;
        if (c0219e.j > 0) {
            j9 = ((long[]) c0219e.f2002i)[0];
        }
        v vVar2 = null;
        v vVarD = null;
        int i3 = 0;
        for (v vVarD2 = tVar.d(); vVarD2 != null; vVarD2 = vVarD2.f26027b) {
            long j10 = vVarD2.f26026a;
            if (j10 != 0) {
                if (m.g(j10, j9) >= 0) {
                    i3++;
                } else if (vVar2 == null) {
                    i3++;
                    vVar2 = vVarD2;
                } else {
                    if (m.g(vVarD2.f26026a, vVar2.f26026a) < 0) {
                        vVar = vVar2;
                        vVar2 = vVarD2;
                    } else {
                        vVar = vVarD2;
                    }
                    if (vVarD == null) {
                        vVarD = tVar.d();
                        v vVar3 = vVarD;
                        while (true) {
                            if (vVarD == null) {
                                vVarD = vVar3;
                                break;
                            }
                            if (m.g(vVarD.f26026a, j9) >= 0) {
                                break;
                            }
                            if (m.g(vVar3.f26026a, vVarD.f26026a) < 0) {
                                vVar3 = vVarD;
                            }
                            vVarD = vVarD.f26027b;
                        }
                    }
                    vVar2.f26026a = 0L;
                    vVar2.a(vVarD);
                    vVar2 = vVar;
                }
            }
        }
        return i3 > 1;
    }

    public static final void q(t tVar) {
        if (p(tVar)) {
            h hVar = g;
            int i3 = hVar.f861i;
            int iIdentityHashCode = System.identityHashCode(tVar);
            int i9 = -1;
            if (i3 > 0) {
                int i10 = hVar.f861i - 1;
                int i11 = 0;
                while (true) {
                    if (i11 > i10) {
                        i9 = -(i11 + 1);
                        break;
                    }
                    int i12 = (i11 + i10) >>> 1;
                    int i13 = ((int[]) hVar.j)[i12];
                    if (i13 < iIdentityHashCode) {
                        i11 = i12 + 1;
                    } else if (i13 > iIdentityHashCode) {
                        i10 = i12 - 1;
                    } else {
                        n nVar = ((n[]) hVar.f862k)[i12];
                        if (tVar == (nVar != null ? nVar.get() : null)) {
                            i9 = i12;
                            break;
                        }
                        int i14 = i12 - 1;
                        while (true) {
                            if (-1 >= i14 || ((int[]) hVar.j)[i14] != iIdentityHashCode) {
                                i12++;
                                int i15 = hVar.f861i;
                                while (true) {
                                    if (i12 >= i15) {
                                        i9 = -(hVar.f861i + 1);
                                        break;
                                    }
                                    if (((int[]) hVar.j)[i12] != iIdentityHashCode) {
                                        i9 = -(i12 + 1);
                                        break;
                                    }
                                    n nVar2 = ((n[]) hVar.f862k)[i12];
                                    if ((nVar2 != null ? nVar2.get() : null) == tVar) {
                                        i9 = i12;
                                        break;
                                    }
                                    i12++;
                                }
                            } else {
                                n nVar3 = ((n[]) hVar.f862k)[i14];
                                if ((nVar3 != null ? nVar3.get() : null) == tVar) {
                                    i9 = i14;
                                    break;
                                }
                                i14--;
                            }
                        }
                    }
                }
                if (i9 >= 0) {
                    return;
                }
            }
            int i16 = -(i9 + 1);
            n[] nVarArr = (n[]) hVar.f862k;
            int length = nVarArr.length;
            if (i3 == length) {
                int i17 = length * 2;
                n[] nVarArr2 = new n[i17];
                int[] iArr = new int[i17];
                int i18 = i16 + 1;
                System.arraycopy(nVarArr, i16, nVarArr2, i18, i3 - i16);
                System.arraycopy((n[]) hVar.f862k, 0, nVarArr2, 0, i16);
                p078i6.m.Y(i18, i16, i3, (int[]) hVar.j, iArr);
                p078i6.m.d0(0, i16, 6, (int[]) hVar.j, iArr);
                hVar.f862k = nVarArr2;
                hVar.j = iArr;
            } else {
                int i19 = i16 + 1;
                System.arraycopy(nVarArr, i16, nVarArr, i19, i3 - i16);
                int[] iArr2 = (int[]) hVar.j;
                p078i6.m.Y(i19, i16, i3, iArr2, iArr2);
            }
            ((n[]) hVar.f862k)[i16] = new n(tVar);
            ((int[]) hVar.j)[i16] = iIdentityHashCode;
            hVar.f861i++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final v s(v vVar, long j9, j jVar) {
        v vVar2 = null;
        while (vVar != null) {
            long j10 = vVar.f26026a;
            if (j10 != 0 && m.g(j10, j9) <= 0 && !jVar.n(j10) && (vVar2 == null || m.g(vVar2.f26026a, vVar.f26026a) < 0)) {
                vVar2 = vVar;
            }
            vVar = vVar.f26027b;
        }
        if (vVar2 != null) {
            return vVar2;
        }
        return null;
    }

    public static final v t(v vVar, t tVar) {
        v vVarS;
        f fVarJ = j();
        j jVarE = fVarJ.e();
        if (jVarE != null) {
            jVarE.invoke(tVar);
        }
        v vVarS2 = s(vVar, fVarJ.g(), fVarJ.d());
        if (vVarS2 != null) {
            return vVarS2;
        }
        synchronized (f25993c) {
            f fVarJ2 = j();
            v vVarD = tVar.d();
            m.c(vVarD, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            vVarS = s(vVarD, fVarJ2.g(), fVarJ2.d());
            if (vVarS == null) {
                r();
                throw null;
            }
        }
        return vVarS;
    }

    public static final void u(int i3) {
        C0219e c0219e = f25996f;
        int i9 = ((int[]) c0219e.f2005m)[i3];
        c0219e.b(i9, c0219e.j - 1);
        c0219e.j--;
        long[] jArr = (long[]) c0219e.f2002i;
        long j9 = jArr[i9];
        int i10 = i9;
        while (i10 > 0) {
            int i11 = ((i10 + 1) >> 1) - 1;
            if (m.g(jArr[i11], j9) <= 0) {
                break;
            }
            c0219e.b(i11, i10);
            i10 = i11;
        }
        long[] jArr2 = (long[]) c0219e.f2002i;
        int i12 = c0219e.j >> 1;
        while (i9 < i12) {
            int i13 = (i9 + 1) << 1;
            int i14 = i13 - 1;
            if (i13 < c0219e.j && m.g(jArr2[i13], jArr2[i14]) < 0) {
                if (m.g(jArr2[i13], jArr2[i9]) >= 0) {
                    break;
                }
                c0219e.b(i13, i9);
                i9 = i13;
            } else {
                if (m.g(jArr2[i14], jArr2[i9]) >= 0) {
                    break;
                }
                c0219e.b(i14, i9);
                i9 = i14;
            }
        }
        ((int[]) c0219e.f2005m)[i3] = c0219e.f2003k;
        c0219e.f2003k = i3;
    }

    public static final Object v(a aVar, j jVar) {
        long j9 = aVar.f25977b;
        Object objInvoke = jVar.invoke(f25994d.e(j9));
        long j10 = f25995e;
        f25995e = ((long) 1) + j10;
        j jVarE = f25994d.e(j9);
        f25994d = jVarE;
        aVar.f25977b = j10;
        aVar.f25976a = jVarE;
        aVar.g = 0;
        aVar.f25965h = null;
        aVar.o();
        f25994d = f25994d.p(j10);
        return objInvoke;
    }

    public static final v w(v vVar, t tVar, f fVar) {
        v vVarS;
        if (fVar.f()) {
            fVar.n(tVar);
        }
        long jG = fVar.g();
        v vVarS2 = s(vVar, jG, fVar.d());
        if (vVarS2 == null) {
            r();
            throw null;
        }
        if (vVarS2.f26026a == fVar.g()) {
            return vVarS2;
        }
        synchronized (f25993c) {
            vVarS = s(tVar.d(), jG, fVar.d());
            if (vVarS == null) {
                r();
                throw null;
            }
            if (vVarS.f26026a != jG) {
                v vVarM = m(vVarS, tVar);
                vVarM.a(vVarS);
                vVarM.f26026a = fVar.g();
                vVarS = vVarM;
            }
        }
        if (vVarS2.f26026a != 1) {
            fVar.n(tVar);
        }
        return vVarS;
    }
}
