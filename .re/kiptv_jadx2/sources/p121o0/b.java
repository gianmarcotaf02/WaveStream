package p121o0;

import java.util.ArrayList;
import java.util.HashMap;
import p020c0.AbstractC1693m0;
import p038e0.h;
import p070h6.k;
import p078i6.o;
import p078i6.w;
import p108m5.c;
import p136q.I;
import p136q.Q;
import p194x6.j;
import p194x6.m;

public class b extends f {

    public static final int[] f25962n = new int[0];

    public final j f25963e;

    public final j f25964f;
    public int g;

    public I f25965h;

    public ArrayList f25966i;
    public j j;

    public int[] f25967k;

    public int f25968l;

    public boolean f25969m;

    public b(long j, j jVar, j jVar2, j jVar3) {
        super(j, jVar);
        this.f25963e = jVar2;
        this.f25964f = jVar3;
        this.j = j.f25987l;
        this.f25967k = f25962n;
        this.f25968l = 1;
    }

    public final void A(long j) {
        synchronized (k.f25993c) {
            this.j = this.j.p(j);
        }
    }

    public void B(I i3) {
        this.f25965h = i3;
    }

    public b C(j jVar, j jVar2) throws Throwable {
        if (this.f25978c) {
            AbstractC1693m0.a("Cannot use a disposed snapshot");
        }
        if (this.f25969m && this.f25979d < 0) {
            AbstractC1693m0.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = k.f25993c;
        synchronized (obj) {
            try {
                long j = k.f25995e;
                long j9 = 1;
                k.f25995e = j + j9;
                k.f25994d = k.f25994d.p(j);
                j jVarD = d();
                r(jVarD.p(j));
                try {
                    c cVar = new c(j, k.d(jVarD, g() + j9, j), k.k(true, jVar, e()), k.l(jVar2, i()), this);
                    if (this.f25969m || this.f25978c) {
                        return cVar;
                    }
                    long jG = g();
                    synchronized (obj) {
                        long j10 = k.f25995e;
                        k.f25995e = j10 + j9;
                        s(j10);
                        k.f25994d = k.f25994d.p(g());
                    }
                    r(k.d(d(), jG + j9, g()));
                    return cVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override
    public final void b() {
        k.f25994d = k.f25994d.e(g()).d(this.j);
    }

    @Override
    public void c() {
        if (this.f25978c) {
            return;
        }
        this.f25978c = true;
        synchronized (k.f25993c) {
            o();
        }
        l();
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public int h() {
        return this.g;
    }

    @Override
    public j i() {
        return this.f25964f;
    }

    @Override
    public void k() {
        this.f25968l++;
    }

    @Override
    public void l() {
        if (this.f25968l <= 0) {
            AbstractC1693m0.a("no pending nested snapshots");
        }
        int i3 = this.f25968l - 1;
        this.f25968l = i3;
        if (i3 != 0 || this.f25969m) {
            return;
        }
        I iX = x();
        if (iX != null) {
            if (this.f25969m) {
                AbstractC1693m0.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = iX.f26329b;
            long[] jArr = iX.f26328a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i9 = 0;
                while (true) {
                    long j = jArr[i9];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i9 != length) {
                            break;
                            break;
                        }
                        i9++;
                    } else {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j) < 128) {
                                for (v vVarD = ((t) objArr[(i9 << 3) + i11]).d(); vVarD != null; vVarD = vVarD.f26027b) {
                                    long j9 = vVarD.f26026a;
                                    if (j9 == jG || o.b1(this.j, Long.valueOf(j9))) {
                                        c cVar = k.f25991a;
                                        vVarD.f26026a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        } else if (i9 != length) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override
    public void m() {
        if (this.f25969m || this.f25978c) {
            return;
        }
        v();
    }

    @Override
    public void n(t tVar) {
        I iX = x();
        if (iX == null) {
            I i3 = Q.f26352a;
            iX = new I();
            B(iX);
        }
        iX.a(tVar);
    }

    @Override
    public final void p() {
        int length = this.f25967k.length;
        for (int i3 = 0; i3 < length; i3++) {
            k.u(this.f25967k[i3]);
        }
        o();
    }

    @Override
    public void t(int i3) {
        this.g = i3;
    }

    @Override
    public f u(j jVar) throws Throwable {
        if (this.f25978c) {
            AbstractC1693m0.a("Cannot use a disposed snapshot");
        }
        if (this.f25969m && this.f25979d < 0) {
            AbstractC1693m0.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        boolean z6 = this instanceof a;
        A(g());
        Object obj = k.f25993c;
        synchronized (obj) {
            try {
                long j = k.f25995e;
                long j9 = 1;
                k.f25995e = j + j9;
                k.f25994d = k.f25994d.p(j);
                try {
                    d dVar = new d(j, k.d(d(), jG + j9, j), k.k(true, jVar, e()), this);
                    if (this.f25969m || this.f25978c) {
                        return dVar;
                    }
                    long jG2 = g();
                    synchronized (obj) {
                        long j10 = k.f25995e;
                        k.f25995e = j10 + j9;
                        s(j10);
                        k.f25994d = k.f25994d.p(g());
                    }
                    r(k.d(d(), jG2 + j9, g()));
                    return dVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void v() {
        long j;
        A(g());
        if (this.f25969m || this.f25978c) {
            return;
        }
        long jG = g();
        synchronized (k.f25993c) {
            long j9 = k.f25995e;
            j = 1;
            k.f25995e = j9 + j;
            s(j9);
            k.f25994d = k.f25994d.p(g());
        }
        r(k.d(d(), jG + j, g()));
    }

    public o w() {
        HashMap mapB;
        ?? r9;
        I i3;
        long j;
        long j9;
        I iX = x();
        if (iX != null) {
            long j10 = k.j.f25977b;
            mapB = k.b(j10, this, k.f25994d.e(j10));
        } else {
            mapB = null;
        }
        w wVar = w.f23205h;
        synchronized (k.f25993c) {
            try {
                k.c(this);
                if (iX == null || iX.f26331d == 0) {
                    b();
                    a aVar = k.j;
                    I i9 = aVar.f25965h;
                    k.v(aVar, k.f25991a);
                    if (i9 == null || !i9.h()) {
                        r9 = wVar;
                        i3 = null;
                    } else {
                        r9 = k.f25997h;
                        i3 = i9;
                    }
                } else {
                    a aVar2 = k.j;
                    o oVarZ = z(k.f25995e, iX, mapB, k.f25994d.e(aVar2.f25977b));
                    if (!oVarZ.equals(h.f25981b)) {
                        return oVarZ;
                    }
                    b();
                    i3 = aVar2.f25965h;
                    k.v(aVar2, k.f25991a);
                    B(null);
                    aVar2.f25965h = null;
                    r9 = k.f25997h;
                }
                this.f25969m = true;
                if (i3 != null) {
                    h hVar = new h(i3);
                    if (!i3.g()) {
                        int size = r9.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ((m) r9.get(i10)).invoke(hVar, this);
                        }
                    }
                }
                if (iX != null && iX.h()) {
                    h hVar2 = new h(iX);
                    int size2 = r9.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((m) r9.get(i11)).invoke(hVar2, this);
                    }
                }
                synchronized (k.f25993c) {
                    try {
                        p();
                        k.f();
                        if (i3 != null) {
                            Object[] objArr = i3.f26329b;
                            long[] jArr = i3.f26328a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i12 = 0;
                                j = 128;
                                while (true) {
                                    long j11 = jArr[i12];
                                    j9 = 255;
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                k.q((t) objArr[(i12 << 3) + i14]);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                        if (i12 != length) {
                                            break;
                                        }
                                        i12++;
                                    }
                                }
                            } else {
                                j = 128;
                                j9 = 255;
                            }
                        } else {
                            j = 128;
                            j9 = 255;
                        }
                        if (iX != null) {
                            Object[] objArr2 = iX.f26329b;
                            long[] jArr2 = iX.f26328a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j12 = jArr2[i15];
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i15 != length2) {
                                            break;
                                            break;
                                        }
                                        i15++;
                                    } else {
                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            if ((j12 & j9) < j) {
                                                k.q((t) objArr2[(i15 << 3) + i17]);
                                            }
                                            j12 >>= 8;
                                        }
                                        if (i16 != 8) {
                                            break;
                                        }
                                        if (i15 != length2) {
                                            break;
                                        }
                                        i15++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.f25966i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i18 = 0; i18 < size3; i18++) {
                                k.q((t) arrayList.get(i18));
                            }
                        }
                        this.f25966i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return h.f25981b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public I x() {
        return this.f25965h;
    }

    @Override
    public j e() {
        return this.f25963e;
    }

    public final o z(long j, I i3, HashMap map, j jVar) {
        ArrayList arrayList;
        ArrayList arrayListA1;
        ArrayList arrayList2;
        int size;
        int i9;
        ArrayList arrayList3;
        int size2;
        int i10;
        t tVar;
        v vVar;
        j jVar2;
        Object[] objArr;
        long[] jArr;
        j jVar3;
        Object[] objArr2;
        long[] jArr2;
        int i11;
        long j9;
        ArrayList arrayList4;
        v vVarN;
        j jVarO = d().p(g()).o(this.j);
        Object[] objArr3 = i3.f26329b;
        long[] jArr3 = i3.f26328a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i12 = 0;
            arrayList2 = null;
            arrayListA1 = null;
            while (true) {
                long j10 = jArr3[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j10 & 255) < 128) {
                            objArr2 = objArr3;
                            t tVar2 = (t) objArr3[(i12 << 3) + i14];
                            jArr2 = jArr3;
                            v vVarD = tVar2.d();
                            i11 = i14;
                            ArrayList arrayList5 = arrayList2;
                            v vVarS = k.s(vVarD, j, jVar);
                            if (vVarS == null) {
                                jVar3 = jVarO;
                                arrayList4 = arrayListA1;
                                j9 = j10;
                            } else {
                                arrayList4 = arrayListA1;
                                j9 = j10;
                                v vVarS2 = k.s(vVarD, g(), jVarO);
                                if (vVarS2 == null) {
                                    jVar3 = jVarO;
                                } else {
                                    jVar3 = jVarO;
                                    if (vVarS2.f26026a != 1 && !vVarS.equals(vVarS2)) {
                                        v vVarS3 = k.s(vVarD, g(), d());
                                        if (vVarS3 == null) {
                                            k.r();
                                            throw null;
                                        }
                                        if (map == null || (vVarN = (v) map.get(vVarS)) == null) {
                                            vVarN = tVar2.n(vVarS2, vVarS, vVarS3);
                                        }
                                        if (vVarN == null) {
                                            return new g(this);
                                        }
                                        if (!vVarN.equals(vVarS3)) {
                                            if (vVarN.equals(vVarS)) {
                                                ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList6.add(new k(tVar2, vVarS.b(g())));
                                                arrayListA1 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayListA1.add(tVar2);
                                                arrayList2 = arrayList6;
                                            } else {
                                                arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList2.add(!vVarN.equals(vVarS2) ? new k(tVar2, vVarN) : new k(tVar2, vVarS2.b(g())));
                                            }
                                        }
                                        arrayListA1 = arrayList4;
                                    }
                                }
                            }
                            arrayList2 = arrayList5;
                            arrayListA1 = arrayList4;
                        } else {
                            jVar3 = jVarO;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i11 = i14;
                            j9 = j10;
                        }
                        j10 = j9 >> 8;
                        i14 = i11 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        jVarO = jVar3;
                    }
                    jVar2 = jVarO;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i13 != 8) {
                        break;
                    }
                } else {
                    jVar2 = jVarO;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i12 != length) {
                    i12++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    jVarO = jVar2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i10 = 0; i10 < size2; i10++) {
                    k kVar = (k) arrayList2.get(i10);
                    tVar = (t) kVar.f22539h;
                    vVar = (v) kVar.f22540i;
                    vVar.f26026a = j;
                    synchronized (k.f25993c) {
                        vVar.f26027b = tVar.d();
                        tVar.e(vVar);
                    }
                }
            }
            if (arrayListA1 != null) {
                size = arrayListA1.size();
                for (i9 = 0; i9 < size; i9++) {
                    i3.l((t) arrayListA1.get(i9));
                }
                arrayList3 = this.f25966i;
                if (arrayList3 != null) {
                    arrayListA1 = o.A1(arrayList3, arrayListA1);
                }
                this.f25966i = arrayListA1;
            }
            return h.f25981b;
        }
        arrayList = null;
        arrayListA1 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i10 < size2) {
                k kVar2 = (k) arrayList2.get(i10);
                tVar = (t) kVar2.f22539h;
                vVar = (v) kVar2.f22540i;
                vVar.f26026a = j;
                synchronized (k.f25993c) {
                    vVar.f26027b = tVar.d();
                    tVar.e(vVar);
                }
            }
        }
        if (arrayListA1 != null) {
            size = arrayListA1.size();
            while (i9 < size) {
                i3.l((t) arrayListA1.get(i9));
            }
            arrayList3 = this.f25966i;
            if (arrayList3 != null) {
                arrayListA1 = o.A1(arrayList3, arrayListA1);
            }
            this.f25966i = arrayListA1;
        }
        return h.f25981b;
    }
}
