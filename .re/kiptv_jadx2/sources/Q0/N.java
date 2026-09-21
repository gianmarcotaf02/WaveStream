package Q0;

import O0.C0723l;
import O0.C0725n;
import O0.InterfaceC0732v;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.gms.internal.play_billing.V0;
import java.util.Map;

public abstract class N extends O0.g0 implements O0.U, Y {

    public K f8296m;

    public p194x6.j f8297n;

    public s0 f8298o;

    public boolean f8299p;

    public boolean f8300q;

    public boolean f8301r;

    public final O0.O f8302s = new O0.O(0, this);

    public w0 f8303t;

    public p136q.H f8304u;

    public static void G0(NodeCoordinator nodeCoordinator) {
        G g;
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.f15862w;
        F f9 = nodeCoordinator2 != null ? nodeCoordinator2.f15861v : null;
        F f10 = nodeCoordinator.f15861v;
        if (!kotlin.jvm.internal.m.a(f9, f10)) {
            f10.f8233O.f8282p.f8353E.f();
            return;
        }
        InterfaceC0762a interfaceC0762aH = f10.f8233O.f8282p.h();
        if (interfaceC0762aH == null || (g = ((W) interfaceC0762aH).f8353E) == null) {
            return;
        }
        g.f();
    }

    public abstract F B0();

    public abstract O0.T C0();

    public abstract N D0();

    public abstract long E0();

    public final K F0() {
        K k9 = this.f8296m;
        if (k9 != null) {
            return k9;
        }
        K k10 = new K(this);
        this.f8296m = k10;
        return k10;
    }

    public final void H0(p136q.I i3) {
        F f9;
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
                    if ((255 & j) < 128 && (f9 = (F) ((E0) objArr[(i9 << 3) + i11]).get()) != null) {
                        if (V()) {
                            f9.X(false);
                        } else {
                            f9.Z(false);
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

    @Override
    public final void I(boolean z6) {
        N nD0 = D0();
        F fB0 = nD0 != null ? nD0.B0() : null;
        if (kotlin.jvm.internal.m.a(fB0, B0())) {
            this.f8299p = z6;
            return;
        }
        if ((fB0 != null ? fB0.f8233O.f8272d : null) != B.j) {
            if ((fB0 != null ? fB0.f8233O.f8272d : null) != B.f8204k) {
                return;
            }
        }
        this.f8299p = z6;
    }

    public abstract void I0();

    @Override
    public boolean V() {
        return false;
    }

    @Override
    public final int b0(C0723l c0723l) {
        int iR0;
        if (z0() && (iR0 = r0(c0723l)) != Integer.MIN_VALUE) {
            return iR0 + ((int) (this.f7642l & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public final void n0(F f9, C0725n c0725n) {
        char c9;
        long j;
        long j9;
        long j10;
        long[] jArr;
        long[] jArr2;
        long j11;
        int i3;
        char c10;
        long j12;
        long j13;
        int i9;
        int i10;
        int i11;
        p136q.H h9 = this.f8304u;
        char c11 = 7;
        long j14 = -9187201950435737472L;
        int i12 = 8;
        if (h9 != null) {
            Object[] objArr = h9.f26324c;
            long[] jArr3 = h9.f26322a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i13 = 0;
                long j15 = 128;
                while (true) {
                    long j16 = jArr3[i13];
                    j9 = 255;
                    if ((((~j16) << c11) & j16 & j14) != j14) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j16 & 255) < j15) {
                                c10 = c11;
                                p136q.I i16 = (p136q.I) objArr[(i13 << 3) + i15];
                                j12 = j14;
                                Object[] objArr2 = i16.f26329b;
                                long[] jArr4 = i16.f26328a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j13 = j15;
                                    int i17 = 0;
                                    int i18 = i12;
                                    while (true) {
                                        int i19 = length2;
                                        long j17 = jArr4[i17];
                                        jArr2 = jArr3;
                                        j11 = j16;
                                        if ((((~j17) << c10) & j17 & j12) != j12) {
                                            int i20 = 8 - ((~(i17 - i19)) >>> 31);
                                            int i21 = 0;
                                            while (i21 < i20) {
                                                if ((j17 & 255) < j13) {
                                                    int i22 = (i17 << 3) + i21;
                                                    F f10 = (F) ((E0) objArr2[i22]).get();
                                                    i10 = i21;
                                                    if (f10 != null) {
                                                        boolean zK = f10.K();
                                                        i11 = i15;
                                                        if (zK) {
                                                        }
                                                    } else {
                                                        i11 = i15;
                                                    }
                                                    i16.m(i22);
                                                } else {
                                                    i10 = i21;
                                                    i11 = i15;
                                                }
                                                j17 >>= i18;
                                                i21 = i10 + 1;
                                                i15 = i11;
                                            }
                                            i3 = i15;
                                            if (i20 != i18) {
                                                break;
                                            }
                                        } else {
                                            i3 = i15;
                                        }
                                        length2 = i19;
                                        if (i17 == length2) {
                                            break;
                                        }
                                        i17++;
                                        jArr3 = jArr2;
                                        j16 = j11;
                                        i15 = i3;
                                        i18 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j11 = j16;
                                    i3 = i15;
                                    j13 = j15;
                                }
                                i9 = 8;
                            } else {
                                jArr2 = jArr3;
                                j11 = j16;
                                i3 = i15;
                                c10 = c11;
                                j12 = j14;
                                j13 = j15;
                                i9 = i12;
                            }
                            i12 = i9;
                            j16 = j11 >> i9;
                            c11 = c10;
                            j14 = j12;
                            j15 = j13;
                            i15 = i3 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c9 = c11;
                        j = j14;
                        j10 = j15;
                        if (i14 != i12) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c9 = c11;
                        j = j14;
                        j10 = j15;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                    c11 = c9;
                    j14 = j;
                    j15 = j10;
                    jArr3 = jArr;
                    i12 = 8;
                }
            } else {
                c9 = 7;
                j = -9187201950435737472L;
                j9 = 255;
                j10 = 128;
            }
        } else {
            c9 = 7;
            j = -9187201950435737472L;
            j9 = 255;
            j10 = 128;
        }
        p136q.H h10 = this.f8304u;
        if (h10 != null) {
            long[] jArr5 = h10.f26322a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i23 = 0;
                while (true) {
                    long j18 = jArr5[i23];
                    if ((((~j18) << c9) & j18 & j) != j) {
                        int i24 = 8 - ((~(i23 - length3)) >>> 31);
                        for (int i25 = 0; i25 < i24; i25++) {
                            if ((j18 & j9) < j10) {
                                int i26 = (i23 << 3) + i25;
                                if (((p136q.I) h10.f26324c[i26]).g()) {
                                    h10.l(i26);
                                }
                            }
                            j18 >>= 8;
                        }
                        if (i24 != 8) {
                            break;
                        }
                    }
                    if (i23 == length3) {
                        break;
                    } else {
                        i23++;
                    }
                }
            }
        }
        p136q.H h11 = this.f8304u;
        if (h11 == null) {
            h11 = new p136q.H();
            this.f8304u = h11;
        }
        Object objG = h11.g(c0725n);
        if (objG == null) {
            objG = new p136q.I();
            h11.m(c0725n, objG);
        }
        ((p136q.I) objG).j(new E0(f9));
    }

    public abstract int r0(C0723l c0723l);

    public final void t0(s0 s0Var, long j, long j9) {
        p136q.I i3;
        p136q.I i9;
        boolean z6;
        char c9;
        long j10;
        long j11;
        long j12;
        F f9;
        boolean z9;
        int i10;
        char c10;
        long j13;
        q0 snapshotObserver;
        p136q.H h9 = this.f8304u;
        w0 w0Var = this.f8303t;
        if (w0Var == null) {
            w0Var = new w0();
            this.f8303t = w0Var;
        }
        w0 w0Var2 = w0Var;
        AndroidComposeView androidComposeView = B0().f8254v;
        if (androidComposeView != null && (snapshotObserver = androidComposeView.getSnapshotObserver()) != null) {
            snapshotObserver.f8460a.d(s0Var, C0768d.j, new L(this, j, j9, s0Var));
        }
        boolean zV = V();
        int i11 = w0Var2.f8482a;
        int i12 = 0;
        while (true) {
            i3 = (p136q.I) w0Var2.f8486e;
            i9 = (p136q.I) w0Var2.f8487f;
            if (i12 >= i11) {
                break;
            }
            byte b9 = ((byte[]) w0Var2.f8485d)[i12];
            if (b9 == 3) {
                C0725n c0725n = ((C0725n[]) w0Var2.f8483b)[i12];
                kotlin.jvm.internal.m.b(c0725n);
                i9.j(c0725n);
            } else if (b9 != 0 && h9 != null) {
                C0725n c0725n2 = ((C0725n[]) w0Var2.f8483b)[i12];
                kotlin.jvm.internal.m.b(c0725n2);
                p136q.I i13 = (p136q.I) h9.k(c0725n2);
                if (i13 != null) {
                    i3.k(i13);
                }
            }
            i12++;
        }
        int i14 = w0Var2.f8482a;
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            byte[] bArr = (byte[]) w0Var2.f8485d;
            if (bArr[i16] == 2) {
                i15++;
            } else if (i15 > 0) {
                C0725n[] c0725nArr = (C0725n[]) w0Var2.f8483b;
                c0725nArr[i16 - i15] = c0725nArr[i16];
            }
            bArr[i16] = 2;
        }
        int i17 = w0Var2.f8482a;
        for (int i18 = i17 - i15; i18 < i17; i18++) {
            ((C0725n[]) w0Var2.f8483b)[i18] = null;
        }
        w0Var2.f8482a -= i15;
        N nD0 = D0();
        Object[] objArr = i9.f26329b;
        long[] jArr = i9.f26328a;
        int length = jArr.length - 2;
        char c11 = 7;
        long j14 = -9187201950435737472L;
        int i19 = 8;
        if (length >= 0) {
            j11 = 128;
            int i20 = 0;
            while (true) {
                long j15 = jArr[i20];
                j12 = 255;
                if ((((~j15) << c11) & j15 & j14) != j14) {
                    int i21 = 8 - ((~(i20 - length)) >>> 31);
                    int i22 = 0;
                    while (i22 < i21) {
                        if ((j15 & 255) < 128) {
                            c10 = c11;
                            C0725n c0725n3 = (C0725n) objArr[(i20 << 3) + i22];
                            j13 = j14;
                            N n3 = nD0 == null ? this : nD0;
                            i10 = i19;
                            N n9 = n3;
                            while (true) {
                                w0 w0Var3 = n9.f8303t;
                                if (w0Var3 != null) {
                                    z9 = zV;
                                    if (p078i6.m.W((C0725n[]) w0Var3.f8483b, c0725n3)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z9 = zV;
                                N nD1 = n9.D0();
                                if (nD1 == null) {
                                    break;
                                }
                                n9 = nD1;
                                zV = z9;
                            }
                            p136q.H h10 = n9.f8304u;
                            p136q.I i23 = h10 != null ? (p136q.I) h10.k(c0725n3) : null;
                            if (i23 != null) {
                                n3.H0(i23);
                            }
                        } else {
                            z9 = zV;
                            i10 = i19;
                            c10 = c11;
                            j13 = j14;
                        }
                        j15 >>= i10;
                        i22++;
                        c11 = c10;
                        j14 = j13;
                        i19 = i10;
                        zV = z9;
                    }
                    z6 = zV;
                    c9 = c11;
                    j10 = j14;
                    if (i21 != i19) {
                        break;
                    }
                } else {
                    z6 = zV;
                    c9 = c11;
                    j10 = j14;
                }
                if (i20 == length) {
                    break;
                }
                i20++;
                c11 = c9;
                j14 = j10;
                zV = z6;
                i19 = 8;
            }
        } else {
            z6 = zV;
            c9 = 7;
            j10 = -9187201950435737472L;
            j11 = 128;
            j12 = 255;
        }
        i9.b();
        Object[] objArr2 = i3.f26329b;
        long[] jArr2 = i3.f26328a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i24 = 0;
            while (true) {
                long j16 = jArr2[i24];
                if ((((~j16) << c9) & j16 & j10) != j10) {
                    int i25 = 8 - ((~(i24 - length2)) >>> 31);
                    for (int i26 = 0; i26 < i25; i26++) {
                        if ((j16 & j12) < j11 && (f9 = (F) ((E0) objArr2[(i24 << 3) + i26]).get()) != null) {
                            if (z6) {
                                f9.X(false);
                            } else {
                                f9.Z(false);
                            }
                        }
                        j16 >>= 8;
                    }
                    if (i25 != 8) {
                        break;
                    }
                }
                if (i24 == length2) {
                    break;
                } else {
                    i24++;
                }
            }
        }
        i3.b();
    }

    public final void v0(O0.T t9) {
        long j;
        long j9;
        p136q.H h9 = this.f8304u;
        if (!this.f8301r) {
            p194x6.j jVarE = t9.e();
            if (jVarE != null) {
                boolean z6 = this.f8297n != jVarE;
                if (z6 || !F0().f8284h) {
                    j = 0;
                    j9 = 9223372034707292159L;
                } else {
                    InterfaceC0732v interfaceC0732vY0 = y0();
                    long jD = V0.D(interfaceC0732vY0.A(0L));
                    long jK = interfaceC0732vY0.k();
                    j9 = jD;
                    j = jK;
                    z6 = (p113n1.k.a(jD, F0().f8285i) && p113n1.m.a(jK, F0().j)) ? false : true;
                }
                if (z6) {
                    s0 s0Var = this.f8298o;
                    if (s0Var != null) {
                        s0Var.f8469h = t9;
                    } else {
                        s0Var = new s0(t9, this);
                        this.f8298o = s0Var;
                    }
                    t0(s0Var, j9, j);
                    this.f8297n = t9.e();
                }
            } else if (h9 != null) {
                Object[] objArr = h9.f26324c;
                long[] jArr = h9.f26322a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j10 = jArr[i3];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            int i9 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((255 & j10) < 128) {
                                    H0((p136q.I) objArr[(i3 << 3) + i10]);
                                }
                                j10 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            } else if (i3 != length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                h9.a();
            }
        }
    }

    @Override
    public final O0.T w(int i3, int i9, Map map, A0.b bVar, p194x6.j jVar) {
        if ((i3 & (-16777216)) != 0 || ((-16777216) & i9) != 0) {
            N0.a.b("Size(" + i3 + " x " + i9 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new M(i3, i9, map, bVar, jVar, this);
    }

    public abstract N x0();

    public abstract InterfaceC0732v y0();

    public abstract boolean z0();
}
