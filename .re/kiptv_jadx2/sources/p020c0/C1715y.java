package p020c0;

import B.d0;
import I3.b;
import Q0.D0;
import android.os.Trace;
import com.google.android.gms.internal.play_billing.V0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p008a8.c;
import p030d0.C2106a;
import p030d0.L;
import p038e0.h;
import p078i6.y;
import p089k0.f;
import p089k0.k;
import p121o0.t;
import p121o0.u;
import p129p0.d;
import p136q.C;
import p136q.H;
import p136q.I;
import p136q.K;
import p136q.w;
import p194x6.m;

public final class C1715y implements InterfaceC1707u {

    public final c f18394A;

    public final k f18395B;

    public final C1700q f18396C;

    public int f18397D;

    public final AbstractC1709v f18398h;

    public final D0 f18399i;
    public final AtomicReference j = new AtomicReference(null);

    public final Object f18400k = new Object();

    public final K f18401l;

    public final K0 f18402m;

    public final H f18403n;

    public final I f18404o;

    public final I f18405p;

    public final H f18406q;

    public final C2106a f18407r;

    public final C2106a f18408s;

    public final H f18409t;

    public H f18410u;

    public boolean f18411v;

    public H0 f18412w;

    public C1685i0 f18413x;
    public C1715y y;

    public int f18414z;

    public C1715y(AbstractC1709v abstractC1709v, D0 d4) {
        this.f18398h = abstractC1709v;
        this.f18399i = d4;
        K k9 = new K(new I());
        this.f18401l = k9;
        K0 k1 = new K0();
        if (abstractC1709v.d()) {
            k1.f18143r = new w();
        }
        if (abstractC1709v.f()) {
            k1.e();
        }
        this.f18402m = k1;
        this.f18403n = V0.o();
        this.f18404o = new I();
        this.f18405p = new I();
        this.f18406q = V0.o();
        C2106a c2106a = new C2106a();
        this.f18407r = c2106a;
        C2106a c2106a2 = new C2106a();
        this.f18408s = c2106a2;
        this.f18409t = V0.o();
        this.f18410u = V0.o();
        c cVar = new c(2, abstractC1709v);
        this.f18394A = cVar;
        this.f18395B = new k();
        C1700q c1700q = new C1700q(d4, abstractC1709v, k1, k9, c2106a, c2106a2, cVar, this);
        abstractC1709v.p(c1700q);
        this.f18396C = c1700q;
        boolean z6 = abstractC1709v instanceof C1718z0;
    }

    public final void A(Object obj) {
        synchronized (this.f18400k) {
            try {
                v(obj);
                Object objG = this.f18406q.g(obj);
                if (objG != null) {
                    if (objG instanceof I) {
                        I i3 = (I) objG;
                        Object[] objArr = i3.f26329b;
                        long[] jArr = i3.f26328a;
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
                                            v((F) objArr[(i9 << 3) + i11]);
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
                    } else {
                        v((F) objG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(m mVar) {
        boolean zI = i();
        q();
        AbstractC1709v abstractC1709v = this.f18398h;
        if (!zI) {
            abstractC1709v.a(this, mVar);
            return;
        }
        C1700q c1700q = this.f18396C;
        c1700q.f18347z = 100;
        c1700q.y = true;
        abstractC1709v.a(this, mVar);
        c1700q.v();
    }

    public final void a() {
        this.j.set(null);
        this.f18407r.f21118d.F();
        this.f18408s.f21118d.F();
        K k9 = this.f18401l;
        if (k9.f26344h.g()) {
            return;
        }
        k kVar = this.f18395B;
        try {
            kVar.g(k9, this.f18396C.D());
            kVar.b();
        } finally {
            kVar.a();
        }
    }

    public final void b(Object obj, boolean z6) {
        int i3;
        Object objG = this.f18403n.g(obj);
        if (objG == null) {
            return;
        }
        boolean z9 = objG instanceof I;
        I i9 = this.f18404o;
        I i10 = this.f18405p;
        H h9 = this.f18409t;
        if (!z9) {
            C1701q0 c1701q0 = (C1701q0) objG;
            if (V0.B(h9, obj, c1701q0) || c1701q0.c(obj) == P.f18179h) {
                return;
            }
            if (c1701q0.g == null || z6) {
                i9.a(c1701q0);
                return;
            } else {
                i10.a(c1701q0);
                return;
            }
        }
        I i11 = (I) objG;
        Object[] objArr = i11.f26329b;
        long[] jArr = i11.f26328a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j = jArr[i12];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((255 & j) < 128) {
                        C1701q0 c1701q1 = (C1701q0) objArr[(i12 << 3) + i15];
                        if (V0.B(h9, obj, c1701q1)) {
                            i3 = i13;
                        } else {
                            i3 = i13;
                            if (c1701q1.c(obj) != P.f18179h) {
                                if (c1701q1.g == null || z6) {
                                    i9.a(c1701q1);
                                } else {
                                    i10.a(c1701q1);
                                }
                            }
                        }
                    } else {
                        i3 = i13;
                    }
                    j >>= i3;
                    i15++;
                    i13 = i3;
                }
                if (i14 != i13) {
                    return;
                }
            }
            if (i12 == length) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void c(Set set, boolean z6) {
        long j;
        long j9;
        long j10;
        char c9;
        long[] jArr;
        String str;
        String str2;
        long j11;
        boolean zC;
        String str3;
        long j12;
        long[] jArr2;
        long[] jArr3;
        int i3;
        long j13;
        boolean zG;
        int i9;
        long j14;
        long[] jArr4;
        long[] jArr5;
        char c10;
        long j15;
        int i10;
        int i11;
        boolean z9 = set instanceof h;
        H h9 = this.f18406q;
        Object obj = null;
        int i12 = 8;
        if (z9) {
            I i13 = ((h) set).f21335h;
            Object[] objArr = i13.f26329b;
            long[] jArr6 = i13.f26328a;
            int length = jArr6.length - 2;
            if (length >= 0) {
                int i14 = 0;
                j = 128;
                j9 = 255;
                while (true) {
                    long j16 = jArr6[i14];
                    char c11 = 7;
                    j10 = -9187201950435737472L;
                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j16 & 255) < 128) {
                                Object obj2 = objArr[(i14 << 3) + i16];
                                c10 = c11;
                                if (obj2 instanceof C1701q0) {
                                    ((C1701q0) obj2).c(obj);
                                } else {
                                    b(obj2, z6);
                                    Object objG = h9.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof I) {
                                            I i17 = (I) objG;
                                            Object[] objArr2 = i17.f26329b;
                                            long[] jArr7 = i17.f26328a;
                                            int length2 = jArr7.length - 2;
                                            if (length2 >= 0) {
                                                int i18 = i12;
                                                i10 = length;
                                                int i19 = 0;
                                                while (true) {
                                                    long j17 = jArr7[i19];
                                                    j15 = j16;
                                                    long[] jArr8 = jArr7;
                                                    if ((((~j17) << c10) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                                        int i21 = 0;
                                                        while (i21 < i20) {
                                                            if ((j17 & 255) < 128) {
                                                                b((F) objArr2[(i19 << 3) + i21], z6);
                                                            }
                                                            j17 >>= i18;
                                                            i21++;
                                                            jArr6 = jArr6;
                                                        }
                                                        jArr5 = jArr6;
                                                        if (i20 != i18) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr5 = jArr6;
                                                    }
                                                    if (i19 == length2) {
                                                        break;
                                                    }
                                                    i19++;
                                                    jArr7 = jArr8;
                                                    j16 = j15;
                                                    jArr6 = jArr5;
                                                    i18 = 8;
                                                }
                                            }
                                        } else {
                                            jArr5 = jArr6;
                                            j15 = j16;
                                            i10 = length;
                                            b((F) objG, z6);
                                        }
                                    }
                                    i11 = 8;
                                }
                                jArr5 = jArr6;
                                j15 = j16;
                                i10 = length;
                                i11 = 8;
                            } else {
                                jArr5 = jArr6;
                                c10 = c11;
                                j15 = j16;
                                i10 = length;
                                i11 = i12;
                            }
                            j16 = j15 >> i11;
                            i16++;
                            length = i10;
                            i12 = i11;
                            c11 = c10;
                            jArr6 = jArr5;
                            obj = null;
                        }
                        jArr4 = jArr6;
                        c9 = c11;
                        int i22 = length;
                        if (i15 != i12) {
                            break;
                        } else {
                            length = i22;
                        }
                    } else {
                        jArr4 = jArr6;
                        c9 = 7;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    jArr6 = jArr4;
                    obj = null;
                    i12 = 8;
                }
            } else {
                j = 128;
                j9 = 255;
                j10 = -9187201950435737472L;
                c9 = 7;
            }
        } else {
            j = 128;
            j9 = 255;
            j10 = -9187201950435737472L;
            c9 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof C1701q0) {
                    ((C1701q0) obj3).c(null);
                } else {
                    b(obj3, z6);
                    Object objG2 = h9.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof I) {
                            I i23 = (I) objG2;
                            Object[] objArr3 = i23.f26329b;
                            long[] jArr9 = i23.f26328a;
                            int length3 = jArr9.length - 2;
                            if (length3 >= 0) {
                                int i24 = 0;
                                while (true) {
                                    long j18 = jArr9[i24];
                                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i24 != length3) {
                                            break;
                                            break;
                                        }
                                        i24++;
                                    } else {
                                        int i25 = 8 - ((~(i24 - length3)) >>> 31);
                                        for (int i26 = 0; i26 < i25; i26++) {
                                            if ((j18 & 255) < 128) {
                                                b((F) objArr3[(i24 << 3) + i26], z6);
                                            }
                                            j18 >>= 8;
                                        }
                                        if (i25 != 8) {
                                            break;
                                        } else if (i24 != length3) {
                                            break;
                                        } else {
                                            i24++;
                                        }
                                    }
                                }
                            }
                        } else {
                            b((F) objG2, z6);
                        }
                    }
                }
            }
        }
        String str4 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        H h10 = this.f18403n;
        I i27 = this.f18404o;
        if (z6) {
            I i28 = this.f18405p;
            if (i28.h()) {
                long[] jArr10 = h10.f26322a;
                int length4 = jArr10.length - 2;
                if (length4 >= 0) {
                    int i29 = 0;
                    while (true) {
                        long j19 = jArr10[i29];
                        if ((((~j19) << c9) & j19 & j10) != j10) {
                            int i30 = 8 - ((~(i29 - length4)) >>> 31);
                            int i31 = 0;
                            while (i31 < i30) {
                                if ((j19 & j9) < j) {
                                    int i32 = (i29 << 3) + i31;
                                    Object obj4 = h10.f26323b[i32];
                                    Object obj5 = h10.f26324c[i32];
                                    if (obj5 instanceof I) {
                                        kotlin.jvm.internal.m.c(obj5, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                        I i33 = (I) obj5;
                                        Object[] objArr4 = i33.f26329b;
                                        long[] jArr11 = i33.f26328a;
                                        int length5 = jArr11.length - 2;
                                        if (length5 >= 0) {
                                            j13 = j19;
                                            int i34 = 0;
                                            while (true) {
                                                long j20 = jArr11[i34];
                                                jArr3 = jArr10;
                                                i3 = length4;
                                                if ((((~j20) << c9) & j20 & j10) != j10) {
                                                    int i35 = 8 - ((~(i34 - length5)) >>> 31);
                                                    for (int i36 = 0; i36 < i35; i36 = i9 + 1) {
                                                        if ((j20 & j9) < j) {
                                                            i9 = i36;
                                                            int i37 = (i34 << 3) + i9;
                                                            j14 = j20;
                                                            C1701q0 c1701q0 = (C1701q0) objArr4[i37];
                                                            if (i28.c(c1701q0) || i27.c(c1701q0)) {
                                                                i33.m(i37);
                                                            }
                                                        } else {
                                                            i9 = i36;
                                                            j14 = j20;
                                                        }
                                                        j20 = j14 >> 8;
                                                    }
                                                    if (i35 != 8) {
                                                        break;
                                                    }
                                                    if (i34 != length5) {
                                                        break;
                                                    }
                                                    i34++;
                                                    length4 = i3;
                                                    jArr10 = jArr3;
                                                } else if (i34 != length5) {
                                                    break;
                                                    break;
                                                } else {
                                                    i34++;
                                                    length4 = i3;
                                                    jArr10 = jArr3;
                                                }
                                            }
                                        } else {
                                            jArr3 = jArr10;
                                            i3 = length4;
                                            j13 = j19;
                                        }
                                        zG = i33.g();
                                    } else {
                                        jArr3 = jArr10;
                                        i3 = length4;
                                        j13 = j19;
                                        kotlin.jvm.internal.m.c(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        C1701q0 c1701q1 = (C1701q0) obj5;
                                        zG = i28.c(c1701q1) || i27.c(c1701q1);
                                    }
                                    if (zG) {
                                        h10.l(i32);
                                    }
                                } else {
                                    jArr3 = jArr10;
                                    i3 = length4;
                                    j13 = j19;
                                }
                                j19 = j13 >> 8;
                                i31++;
                                length4 = i3;
                                jArr10 = jArr3;
                            }
                            jArr2 = jArr10;
                            int i38 = length4;
                            if (i30 != 8) {
                                break;
                            } else {
                                length4 = i38;
                            }
                        } else {
                            jArr2 = jArr10;
                        }
                        if (i29 == length4) {
                            break;
                        }
                        i29++;
                        jArr10 = jArr2;
                    }
                }
                i28.b();
                h();
                return;
            }
        }
        if (i27.h()) {
            long[] jArr12 = h10.f26322a;
            int length6 = jArr12.length - 2;
            if (length6 >= 0) {
                int i39 = 0;
                while (true) {
                    long j21 = jArr12[i39];
                    if ((((~j21) << c9) & j21 & j10) != j10) {
                        int i40 = 8 - ((~(i39 - length6)) >>> 31);
                        int i41 = 0;
                        while (i41 < i40) {
                            if ((j21 & j9) < j) {
                                int i42 = (i39 << 3) + i41;
                                Object obj6 = h10.f26323b[i42];
                                Object obj7 = h10.f26324c[i42];
                                if (obj7 instanceof I) {
                                    kotlin.jvm.internal.m.c(obj7, str4);
                                    I i43 = (I) obj7;
                                    Object[] objArr5 = i43.f26329b;
                                    long[] jArr13 = i43.f26328a;
                                    int length7 = jArr13.length - 2;
                                    if (length7 >= 0) {
                                        j11 = j21;
                                        int i44 = 0;
                                        while (true) {
                                            long j22 = jArr13[i44];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr14 = jArr13;
                                            if ((((~j22) << c9) & j22 & j10) != j10) {
                                                int i45 = 8 - ((~(i44 - length7)) >>> 31);
                                                int i46 = 0;
                                                while (i46 < i45) {
                                                    if ((j22 & j9) < j) {
                                                        str3 = str4;
                                                        int i47 = (i44 << 3) + i46;
                                                        j12 = j22;
                                                        if (i27.c((C1701q0) objArr6[i47])) {
                                                            i43.m(i47);
                                                        }
                                                    } else {
                                                        str3 = str4;
                                                        j12 = j22;
                                                    }
                                                    i46++;
                                                    str4 = str3;
                                                    j22 = j12 >> 8;
                                                }
                                                str2 = str4;
                                                if (i45 != 8) {
                                                    break;
                                                }
                                            } else {
                                                str2 = str4;
                                            }
                                            if (i44 == length7) {
                                                break;
                                            }
                                            i44++;
                                            objArr5 = objArr6;
                                            jArr13 = jArr14;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = str4;
                                        j11 = j21;
                                    }
                                    zC = i43.g();
                                } else {
                                    str2 = str4;
                                    j11 = j21;
                                    kotlin.jvm.internal.m.c(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    zC = i27.c((C1701q0) obj7);
                                }
                                if (zC) {
                                    h10.l(i42);
                                }
                            } else {
                                jArr12 = jArr12;
                                str2 = str4;
                                j11 = j21;
                            }
                            i41++;
                            j21 = j11 >> 8;
                            jArr12 = jArr12;
                            str4 = str2;
                        }
                        jArr = jArr12;
                        str = str4;
                        if (i40 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr12;
                        str = str4;
                    }
                    if (i39 == length6) {
                        break;
                    }
                    i39++;
                    jArr12 = jArr;
                    str4 = str;
                }
            }
            h();
            i27.b();
        }
    }

    public final void d() {
        synchronized (this.f18400k) {
            try {
                e(this.f18407r);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.f18401l.f26344h.g()) {
                        k kVar = this.f18395B;
                        try {
                            kVar.g(this.f18401l, this.f18396C.D());
                            kVar.b();
                        } finally {
                            kVar.a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void e(C2106a c2106a) throws Throwable {
        InterfaceC1672c interfaceC1672c;
        k kVar;
        k kVar2;
        long[] jArr;
        int i3;
        long[] jArr2;
        k kVar3;
        long j;
        char c9;
        long j9;
        int i9;
        boolean zG;
        long j10;
        C2106a c2106a2 = this.f18408s;
        C1700q c1700q = this.f18396C;
        d dVarD = c1700q.D();
        k kVar4 = this.f18395B;
        kVar4.g(this.f18401l, dVarD);
        try {
            if (c2106a.f21118d.H()) {
                try {
                    if (c2106a2.f21118d.H() && this.f18413x == null) {
                        kVar4.b();
                    }
                    return;
                } finally {
                    kVar4.a();
                }
            }
            C1685i0 c1685i0 = this.f18413x;
            if (c1685i0 == null || (interfaceC1672c = c1685i0.f18266l) == null) {
                interfaceC1672c = this.f18399i;
            }
            try {
                Trace.beginSection(interfaceC1672c.equals(c1685i0 != null ? c1685i0.f18266l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    C1685i0 c1685i1 = this.f18413x;
                    if (c1685i1 == null || (kVar = c1685i1.f18265k) == null) {
                        kVar = kVar4;
                    }
                    N0 n0O = this.f18402m.o();
                    int i10 = 0;
                    try {
                        c2106a.F(interfaceC1672c, n0O, kVar, c1700q.D());
                        n0O.e(true);
                        interfaceC1672c.l();
                        Trace.endSection();
                        kVar4.c();
                        kVar4.d();
                        if (this.f18411v) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f18411v = false;
                                H h9 = this.f18403n;
                                long[] jArr3 = h9.f26322a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i11 = 0;
                                    while (true) {
                                        long j11 = jArr3[i11];
                                        char c10 = 7;
                                        long j12 = -9187201950435737472L;
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i12 = 8;
                                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                                            int i14 = i10;
                                            while (i14 < i13) {
                                                if ((j11 & 255) < 128) {
                                                    c9 = c10;
                                                    int i15 = (i11 << 3) + i14;
                                                    j9 = j12;
                                                    Object obj = h9.f26323b[i15];
                                                    Object obj2 = h9.f26324c[i15];
                                                    if (obj2 instanceof I) {
                                                        kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                                        I i16 = (I) obj2;
                                                        Object[] objArr = i16.f26329b;
                                                        long[] jArr4 = i16.f26328a;
                                                        int i17 = i12;
                                                        int length2 = jArr4.length - 2;
                                                        i3 = i14;
                                                        jArr2 = jArr3;
                                                        kVar3 = kVar4;
                                                        if (length2 >= 0) {
                                                            int i18 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j13 = jArr4[i18];
                                                                    j = j11;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j13) << c9) & j13 & j9) == j9) {
                                                                        if (i18 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i18++;
                                                                        jArr4 = jArr5;
                                                                        j11 = j;
                                                                        i17 = 8;
                                                                    } else {
                                                                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                                                        for (int i20 = 0; i20 < i19; i20++) {
                                                                            if ((j13 & 255) < 128) {
                                                                                j10 = j13;
                                                                                int i21 = (i18 << 3) + i20;
                                                                                if (!((C1701q0) objArr[i21]).b()) {
                                                                                    i16.m(i21);
                                                                                }
                                                                            } else {
                                                                                j10 = j13;
                                                                            }
                                                                            j13 = j10 >> i17;
                                                                        }
                                                                        if (i19 != i17) {
                                                                            break;
                                                                        }
                                                                        if (i18 != length2) {
                                                                            break;
                                                                        }
                                                                        i18++;
                                                                        jArr4 = jArr5;
                                                                        j11 = j;
                                                                        i17 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j11;
                                                        }
                                                        zG = i16.g();
                                                    } else {
                                                        i3 = i14;
                                                        jArr2 = jArr3;
                                                        kVar3 = kVar4;
                                                        j = j11;
                                                        kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                        zG = !((C1701q0) obj2).b();
                                                    }
                                                    if (zG) {
                                                        h9.l(i15);
                                                    }
                                                    i9 = 8;
                                                } else {
                                                    i3 = i14;
                                                    jArr2 = jArr3;
                                                    kVar3 = kVar4;
                                                    j = j11;
                                                    c9 = c10;
                                                    j9 = j12;
                                                    i9 = i12;
                                                }
                                                j11 = j >> i9;
                                                i14 = i3 + 1;
                                                i12 = i9;
                                                c10 = c9;
                                                j12 = j9;
                                                kVar4 = kVar3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            kVar2 = kVar4;
                                            if (i13 != i12) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            kVar2 = kVar4;
                                        }
                                        if (i11 == length) {
                                            break;
                                        }
                                        i11++;
                                        kVar4 = kVar2;
                                        jArr3 = jArr;
                                        i10 = 0;
                                    }
                                } else {
                                    kVar2 = kVar4;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            kVar2 = kVar4;
                        }
                        try {
                            if (c2106a2.f21118d.H() && this.f18413x == null) {
                                kVar2.b();
                            }
                            return;
                        } finally {
                            kVar2.a();
                        }
                    } catch (Throwable th3) {
                        try {
                            n0O.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (c2106a2.f21118d.H() && this.f18413x == null) {
                kVar4.b();
            }
            throw th;
        } finally {
            kVar4.a();
        }
    }

    public final void f() {
        synchronized (this.f18400k) {
            try {
                if (this.f18408s.f21118d.I()) {
                    e(this.f18408s);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f18401l.f26344h.g()) {
                        k kVar = this.f18395B;
                        try {
                            kVar.g(this.f18401l, this.f18396C.D());
                            kVar.b();
                        } finally {
                            kVar.a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f18400k) {
            try {
                this.f18396C.f18344v = null;
                if (!this.f18401l.f26344h.g()) {
                    k kVar = this.f18395B;
                    try {
                        kVar.g(this.f18401l, this.f18396C.D());
                        kVar.b();
                        kVar.a();
                    } catch (Throwable th) {
                        kVar.a();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f18401l.f26344h.g()) {
                        k kVar2 = this.f18395B;
                        try {
                            kVar2.g(this.f18401l, this.f18396C.D());
                            kVar2.b();
                        } finally {
                            kVar2.a();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    public final void h() {
        char c9;
        long j;
        long j9;
        long j10;
        long[] jArr;
        long[] jArr2;
        int i3;
        long j11;
        char c10;
        long j12;
        long j13;
        int i9;
        boolean zG;
        int i10;
        long j14;
        H h9 = this.f18406q;
        long[] jArr3 = h9.f26322a;
        int length = jArr3.length - 2;
        char c11 = 7;
        long j15 = -9187201950435737472L;
        int i11 = 8;
        if (length >= 0) {
            int i12 = 0;
            long j16 = 128;
            while (true) {
                long j17 = jArr3[i12];
                j9 = 255;
                if ((((~j17) << c11) & j17 & j15) != j15) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j17 & 255) < j16) {
                            c10 = c11;
                            int i15 = (i12 << 3) + i14;
                            j12 = j15;
                            Object obj = h9.f26323b[i15];
                            Object obj2 = h9.f26324c[i15];
                            boolean z6 = obj2 instanceof I;
                            H h10 = this.f18403n;
                            if (z6) {
                                kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                I i16 = (I) obj2;
                                Object[] objArr = i16.f26329b;
                                long[] jArr4 = i16.f26328a;
                                j13 = j16;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j11 = j17;
                                    int i17 = i11;
                                    int i18 = 0;
                                    while (true) {
                                        long j18 = jArr4[i18];
                                        jArr2 = jArr3;
                                        i3 = length;
                                        if ((((~j18) << c10) & j18 & j12) == j12) {
                                            if (i18 != length2) {
                                                break;
                                                break;
                                            }
                                            i18++;
                                            jArr3 = jArr2;
                                            length = i3;
                                            i17 = 8;
                                        } else {
                                            int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                            int i20 = 0;
                                            while (i20 < i19) {
                                                if ((j18 & 255) < j13) {
                                                    i10 = i20;
                                                    int i21 = (i18 << 3) + i10;
                                                    j14 = j18;
                                                    if (!h10.c((F) objArr[i21])) {
                                                        i16.m(i21);
                                                    }
                                                } else {
                                                    i10 = i20;
                                                    j14 = j18;
                                                }
                                                j18 = j14 >> i17;
                                                i20 = i10 + 1;
                                            }
                                            if (i19 != i17) {
                                                break;
                                            }
                                            if (i18 != length2) {
                                                break;
                                            }
                                            i18++;
                                            jArr3 = jArr2;
                                            length = i3;
                                            i17 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i3 = length;
                                    j11 = j17;
                                }
                                zG = i16.g();
                            } else {
                                jArr2 = jArr3;
                                i3 = length;
                                j11 = j17;
                                j13 = j16;
                                kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zG = !h10.c((F) obj2);
                            }
                            if (zG) {
                                h9.l(i15);
                            }
                            i9 = 8;
                        } else {
                            jArr2 = jArr3;
                            i3 = length;
                            j11 = j17;
                            c10 = c11;
                            j12 = j15;
                            j13 = j16;
                            i9 = i11;
                        }
                        j17 = j11 >> i9;
                        i14++;
                        i11 = i9;
                        c11 = c10;
                        j15 = j12;
                        j16 = j13;
                        jArr3 = jArr2;
                        length = i3;
                    }
                    jArr = jArr3;
                    int i22 = length;
                    c9 = c11;
                    j = j15;
                    j10 = j16;
                    if (i13 != i11) {
                        break;
                    } else {
                        length = i22;
                    }
                } else {
                    jArr = jArr3;
                    c9 = c11;
                    j = j15;
                    j10 = j16;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                c11 = c9;
                j15 = j;
                j16 = j10;
                jArr3 = jArr;
                i11 = 8;
            }
        } else {
            c9 = 7;
            j = -9187201950435737472L;
            j9 = 255;
            j10 = 128;
        }
        I i23 = this.f18405p;
        if (!i23.h()) {
            return;
        }
        Object[] objArr2 = i23.f26329b;
        long[] jArr5 = i23.f26328a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i24 = 0;
        while (true) {
            long j19 = jArr5[i24];
            if ((((~j19) << c9) & j19 & j) != j) {
                int i25 = 8 - ((~(i24 - length3)) >>> 31);
                for (int i26 = 0; i26 < i25; i26++) {
                    if ((j19 & j9) < j10) {
                        int i27 = (i24 << 3) + i26;
                        if (!(((C1701q0) objArr2[i27]).g != null)) {
                            i23.m(i27);
                        }
                    }
                    j19 >>= 8;
                }
                if (i25 != 8) {
                    return;
                }
            }
            if (i24 == length3) {
                return;
            } else {
                i24++;
            }
        }
    }

    public final boolean i() {
        boolean z6;
        synchronized (this.f18400k) {
            z6 = true;
            if (this.f18397D != 1) {
                z6 = false;
            }
            if (z6) {
                this.f18397D = 0;
            }
        }
        return z6;
    }

    public final void j(m mVar) {
        try {
            synchronized (this.f18400k) {
                n();
                H h9 = this.f18410u;
                this.f18410u = V0.o();
                try {
                    C1700q c1700q = this.f18396C;
                    H0 h10 = this.f18412w;
                    if (!c1700q.f18329e.f21118d.H()) {
                        AbstractC1705t.a("Expected applyChanges() to have been called");
                    }
                    c1700q.f18319P = h10;
                    try {
                        c1700q.n(h9, mVar);
                        c1700q.f18319P = null;
                    } catch (Throwable th) {
                        c1700q.f18319P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.f18410u = h9;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.f18401l.f26344h.g()) {
                    k kVar = this.f18395B;
                    try {
                        kVar.g(this.f18401l, this.f18396C.D());
                        kVar.b();
                    } finally {
                        kVar.a();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final C1685i0 k(boolean z6, m mVar) {
        if (this.f18413x != null) {
            AbstractC1693m0.b("A pausable composition is in progress");
        }
        Object obj = this.f18400k;
        C1685i0 c1685i0 = new C1685i0(this, this.f18398h, this.f18396C, this.f18401l, mVar, z6, this.f18399i, obj);
        this.f18413x = c1685i0;
        return c1685i0;
    }

    public final void l() {
        synchronized (this.f18400k) {
            try {
                if (this.f18413x != null) {
                    AbstractC1693m0.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z6 = this.f18402m.f18135i > 0;
                if (z6 || !this.f18401l.f26344h.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        k kVar = this.f18395B;
                        try {
                            kVar.g(this.f18401l, this.f18396C.D());
                            if (z6) {
                                N0 n0O = this.f18402m.o();
                                try {
                                    n0O.n(n0O.f18170t, new r(this.f18395B, n0O, 0));
                                    n0O.e(true);
                                    this.f18399i.l();
                                    kVar.c();
                                } catch (Throwable th) {
                                    n0O.e(false);
                                    throw th;
                                }
                            }
                            kVar.b();
                            kVar.a();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            kVar.a();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.f18403n.a();
                this.f18406q.a();
                this.f18410u.a();
                this.f18407r.f21118d.F();
                this.f18408s.f21118d.F();
                C1700q c1700q = this.f18396C;
                c1700q.f18309E.clear();
                c1700q.f18341s.clear();
                c1700q.f18329e.f21118d.F();
                c1700q.f18344v = null;
                this.f18397D = 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void m() {
        synchronized (this.f18400k) {
            try {
                if (this.f18396C.f18310F) {
                    AbstractC1693m0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f18397D != 3) {
                    this.f18397D = 3;
                    C2106a c2106a = this.f18396C.f18315L;
                    if (c2106a != null) {
                        e(c2106a);
                    }
                    boolean z6 = this.f18402m.f18135i > 0;
                    if (z6 || !this.f18401l.f26344h.g()) {
                        k kVar = this.f18395B;
                        try {
                            kVar.g(this.f18401l, this.f18396C.D());
                            if (z6) {
                                N0 n0O = this.f18402m.o();
                                try {
                                    n0O.n(n0O.f18170t, new d0(15, this.f18395B));
                                    n0O.H();
                                    n0O.e(true);
                                    this.f18399i.a();
                                    this.f18399i.l();
                                    kVar.c();
                                } catch (Throwable th) {
                                    n0O.e(false);
                                    throw th;
                                }
                            }
                            kVar.b();
                            kVar.a();
                        } catch (Throwable th2) {
                            kVar.a();
                            throw th2;
                        }
                    }
                    C1700q c1700q = this.f18396C;
                    c1700q.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c1700q.f18326b.u(c1700q);
                        c1700q.f18309E.clear();
                        c1700q.f18341s.clear();
                        c1700q.f18329e.f21118d.F();
                        c1700q.f18344v = null;
                        c1700q.f18325a.a();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f18398h.v(this);
    }

    public final void n() {
        AtomicReference atomicReference = this.j;
        Object obj = AbstractC1703s.f18359b;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC1705t.b("pending composition has not been applied");
                throw new b();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC1705t.b("corrupt pendingModifications drain: " + atomicReference);
                throw new b();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.j;
        Object andSet = atomicReference.getAndSet(null);
        if (kotlin.jvm.internal.m.a(andSet, AbstractC1703s.f18359b)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet != null) {
            AbstractC1705t.b("corrupt pendingModifications drain: " + atomicReference);
            throw new b();
        }
        if (this.f18413x == null) {
            AbstractC1705t.a("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    public final void p() {
        AtomicReference atomicReference = this.j;
        Object andSet = atomicReference.getAndSet(y.f23207h);
        if (kotlin.jvm.internal.m.a(andSet, AbstractC1703s.f18359b) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC1705t.b("corrupt pendingModifications drain: " + atomicReference);
            throw new b();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void q() {
        String str;
        int i3 = this.f18397D;
        if (i3 != 0) {
            if (i3 == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i3 != 2) {
                str = i3 != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            AbstractC1693m0.b(str);
        }
        if (this.f18413x == null) {
            return;
        }
        AbstractC1693m0.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        C1700q c1700q = this.f18396C;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((W) ((p070h6.k) arrayList.get(i3)).f22539h).getClass();
            if (!kotlin.jvm.internal.m.a(null, this)) {
                AbstractC1705t.a("Check failed");
                break;
            }
        }
        try {
            c1700q.getClass();
            try {
                c1700q.G(arrayList);
                c1700q.i();
            } catch (Throwable th) {
                c1700q.a();
                throw th;
            }
        } catch (Throwable th2) {
            K k9 = this.f18401l;
            try {
                if (!k9.f26344h.g()) {
                    k kVar = this.f18395B;
                    try {
                        kVar.g(k9, c1700q.D());
                        kVar.b();
                    } finally {
                        kVar.a();
                    }
                }
                throw th2;
            } catch (Throwable th3) {
                a();
                throw th3;
            }
        }
    }

    public final P s(C1701q0 c1701q0, Object obj) {
        C1715y c1715y;
        int i3 = c1701q0.f18349b;
        if ((i3 & 2) != 0) {
            c1701q0.f18349b = i3 | 4;
        }
        C1668a c1668a = c1701q0.f18350c;
        if (c1668a == null || !c1668a.a()) {
            return P.f18179h;
        }
        if (this.f18402m.p(c1668a)) {
            if (c1701q0.f18351d == null) {
                return P.f18179h;
            }
            P pU = u(c1701q0, c1668a, obj);
            if (pU != P.f18179h) {
                this.f18394A.O();
            }
            return pU;
        }
        synchronized (this.f18400k) {
            c1715y = this.y;
        }
        if (c1715y != null) {
            C1700q c1700q = c1715y.f18396C;
            if (c1700q.f18310F && c1700q.i0(c1701q0, obj)) {
                return P.f18181k;
            }
        }
        return P.f18179h;
    }

    public final void t() {
        C1715y c1715y;
        synchronized (this.f18400k) {
            try {
                for (Object obj : this.f18402m.j) {
                    C1701q0 c1701q0 = obj instanceof C1701q0 ? (C1701q0) obj : null;
                    if (c1701q0 != null && (c1715y = c1701q0.f18348a) != null) {
                        c1715y.s(c1701q0, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final P u(C1701q0 c1701q0, C1668a c1668a, Object obj) {
        synchronized (this.f18400k) {
            try {
                C1715y c1715y = this.y;
                C1715y c1715y2 = null;
                if (c1715y != null) {
                    K0 k1 = this.f18402m;
                    int i3 = this.f18414z;
                    if (k1.f18139n) {
                        AbstractC1705t.a("Writer is active");
                    }
                    if (i3 < 0 || i3 >= k1.f18135i) {
                        AbstractC1705t.a("Invalid group index");
                    }
                    if (k1.p(c1668a)) {
                        int i9 = k1.f18134h[(i3 * 5) + 3] + i3;
                        int i10 = c1668a.f18215a;
                        if (i3 > i10 || i10 >= i9) {
                            c1715y = null;
                        }
                    } else {
                        c1715y = null;
                    }
                    c1715y2 = c1715y;
                }
                if (c1715y2 == null) {
                    C1700q c1700q = this.f18396C;
                    if (c1700q.f18310F && c1700q.i0(c1701q0, obj)) {
                        return P.f18181k;
                    }
                    if (obj != null && (obj instanceof F)) {
                        Object objG = this.f18410u.g(c1701q0);
                        if (objG != null) {
                            if (!(objG instanceof I)) {
                                if (objG != C1676e.f18242m) {
                                    V0.d(this.f18410u, c1701q0, obj);
                                    break;
                                }
                            } else {
                                I i11 = (I) objG;
                                Object[] objArr = i11.f26329b;
                                long[] jArr = i11.f26328a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    V0.d(this.f18410u, c1701q0, obj);
                                    break;
                                }
                                int i12 = 0;
                                loop0: while (true) {
                                    long j = jArr[i12];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 == length) {
                                            V0.d(this.f18410u, c1701q0, obj);
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8;
                                        int i14 = 8 - ((~(i12 - length)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j & 255) < 128 && objArr[(i12 << 3) + i15] == C1676e.f18242m) {
                                                break loop0;
                                            }
                                            j >>= i13;
                                            i15++;
                                            i13 = i13;
                                        }
                                        if (i14 == i13) {
                                            if (i12 == length) {
                                                i12++;
                                            }
                                        }
                                        V0.d(this.f18410u, c1701q0, obj);
                                        break;
                                    }
                                }
                            }
                        } else {
                            V0.d(this.f18410u, c1701q0, obj);
                            break;
                        }
                    } else {
                        this.f18410u.m(c1701q0, C1676e.f18242m);
                    }
                }
                if (c1715y2 != null) {
                    return c1715y2.u(c1701q0, c1668a, obj);
                }
                this.f18398h.l(this);
                return this.f18396C.f18310F ? P.j : P.f18180i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(Object obj) {
        Object objG = this.f18403n.g(obj);
        if (objG == null) {
            return;
        }
        boolean z6 = objG instanceof I;
        H h9 = this.f18409t;
        if (!z6) {
            C1701q0 c1701q0 = (C1701q0) objG;
            if (c1701q0.c(obj) == P.f18181k) {
                V0.d(h9, obj, c1701q0);
                return;
            }
            return;
        }
        I i3 = (I) objG;
        Object[] objArr = i3.f26329b;
        long[] jArr = i3.f26328a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j = jArr[i9];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        C1701q0 c1701q1 = (C1701q0) objArr[(i9 << 3) + i11];
                        if (c1701q1.c(obj) == P.f18181k) {
                            V0.d(h9, obj, c1701q1);
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i9 == length) {
                return;
            } else {
                i9++;
            }
        }
    }

    public final boolean w(Set set) {
        boolean z6 = set instanceof h;
        H h9 = this.f18406q;
        H h10 = this.f18403n;
        if (z6) {
            I i3 = ((h) set).f21335h;
            Object[] objArr = i3.f26329b;
            long[] jArr = i3.f26328a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i9 = 0;
                loop0: while (true) {
                    long j = jArr[i9];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i9 << 3) + i11];
                                if (h10.c(obj) || h9.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i10 == 8) {
                            if (i9 != length) {
                                i9++;
                            }
                        }
                    } else if (i9 != length) {
                        i9++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (h10.c(obj2) || h9.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean x() {
        synchronized (this.f18400k) {
            C1685i0 c1685i0 = this.f18413x;
            boolean zI = false;
            if (c1685i0 != null && (c1685i0.f18263h.get() != EnumC1687j0.f18273l || c1685i0.f18264i != f.c())) {
                AtomicReference atomicReference = c1685i0.f18263h;
                EnumC1687j0 enumC1687j0 = EnumC1687j0.f18274m;
                EnumC1687j0 enumC1687j1 = EnumC1687j0.f18272k;
                while (!atomicReference.compareAndSet(enumC1687j0, enumC1687j1) && atomicReference.get() == enumC1687j0) {
                }
                c1685i0.f18266l.f18096h.a(9);
                return false;
            }
            n();
            try {
                H h9 = this.f18410u;
                this.f18410u = V0.o();
                try {
                    C1700q c1700q = this.f18396C;
                    H0 h10 = this.f18412w;
                    L l2 = c1700q.f18329e.f21118d;
                    if (!l2.H()) {
                        AbstractC1705t.a("Expected applyChanges() to have been called");
                    }
                    if (h9.f26326e > 0 || !c1700q.f18341s.isEmpty()) {
                        c1700q.f18319P = h10;
                        try {
                            c1700q.n(h9, null);
                            c1700q.f18319P = null;
                            zI = l2.I();
                        } catch (Throwable th) {
                            c1700q.f18319P = null;
                            throw th;
                        }
                    }
                    if (!zI) {
                        o();
                    }
                    return zI;
                } catch (Throwable th2) {
                    this.f18410u = h9;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f18401l.f26344h.g()) {
                        k kVar = this.f18395B;
                        try {
                            kVar.g(this.f18401l, this.f18396C.D());
                            kVar.b();
                        } finally {
                            kVar.a();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
    }

    public final void y(h hVar) {
        Object obj;
        while (true) {
            Object obj2 = this.j.get();
            if (obj2 == null || obj2.equals(AbstractC1703s.f18359b)) {
                obj = hVar;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, hVar};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.j).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = hVar;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.j;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.f18400k) {
                            o();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    public final void z(Object obj) {
        C1701q0 c1701q0B;
        int i3;
        boolean z6;
        boolean z9;
        boolean z10;
        C1700q c1700q = this.f18396C;
        if (c1700q.f18305A <= 0 && (c1701q0B = c1700q.B()) != null) {
            boolean z11 = true;
            int i9 = c1701q0B.f18349b | 1;
            c1701q0B.f18349b = i9;
            if ((i9 & 32) == 0) {
                C c9 = c1701q0B.f18353f;
                if (c9 == null) {
                    c9 = new C();
                    c1701q0B.f18353f = c9;
                }
                int i10 = c1701q0B.f18352e;
                int iC = c9.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i3 = -1;
                } else {
                    i3 = c9.f26299c[iC];
                }
                c9.f26298b[iC] = obj;
                c9.f26299c[iC] = i10;
                if (i3 == c1701q0B.f18352e) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            this.f18394A.O();
            if (z6) {
                return;
            }
            if (obj instanceof u) {
                ((u) obj).f(1);
            }
            V0.d(this.f18403n, obj, c1701q0B);
            if (obj instanceof F) {
                F f9 = (F) obj;
                E eH = f9.h();
                H h9 = this.f18406q;
                V0.C(h9, obj);
                C c10 = eH.f18109e;
                Object[] objArr = c10.f26298b;
                long[] jArr = c10.f26297a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j = jArr[i11];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j & 255) < 128) {
                                    t tVar = (t) objArr[(i11 << 3) + i14];
                                    if (tVar instanceof u) {
                                        z10 = true;
                                        ((u) tVar).f(1);
                                    } else {
                                        z10 = true;
                                    }
                                    V0.d(h9, tVar, obj);
                                } else {
                                    z10 = z11;
                                }
                                j >>= i12;
                                i14++;
                                z11 = z10;
                                i12 = i12;
                            }
                            z9 = z11;
                            if (i13 != i12) {
                                break;
                            }
                        } else {
                            z9 = z11;
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                        z11 = z9;
                    }
                }
                Object obj2 = eH.f18110f;
                H h10 = c1701q0B.g;
                if (h10 == null) {
                    h10 = new H();
                    c1701q0B.g = h10;
                }
                h10.m(f9, obj2);
            }
        }
    }
}
