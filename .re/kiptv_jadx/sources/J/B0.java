package J;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B0 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5630i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5631k;

    public /* synthetic */ B0(J.C0 c9, O0.g0 g0Var, int i3) {
        this.f5629h = 0;
        this.j = c9;
        this.f5631k = g0Var;
        this.f5630i = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        p020c0.InterfaceC1707u interfaceC1707u;
        long[] jArr;
        p020c0.InterfaceC1707u interfaceC1707u2;
        long[] jArr2;
        int i3;
        switch (this.f5629h) {
            case 0:
                O0.f0 f0Var = (O0.f0) obj;
                J.C0 c9 = (J.C0) this.j;
                J.y0 y0Var = (J.y0) c9.f5635e.invoke();
                p011b1.J j = y0Var != null ? y0Var.f5963a : null;
                O0.g0 g0Var = (O0.g0) this.f5631k;
                p181w0.b bVarI = J.AbstractC0549n.i(f0Var, c9.f5633c, c9.f5634d, j, false, g0Var.f7639h);
                x.EnumC3061p0 enumC3061p0 = x.EnumC3061p0.f30978h;
                int i9 = g0Var.f7640i;
                J.w0 w0Var = c9.f5632b;
                w0Var.a(enumC3061p0, bVarI, this.f5630i, i9);
                O0.f0.j(f0Var, g0Var, 0, java.lang.Math.round(-w0Var.f5945a.g()));
                break;
            case 1:
                p020c0.InterfaceC1707u interfaceC1707u3 = (p020c0.InterfaceC1707u) obj;
                p020c0.C1701q0 c1701q0 = (p020c0.C1701q0) this.j;
                int i10 = c1701q0.f18352e;
                int i11 = this.f5630i;
                if (i10 == i11) {
                    p136q.C c10 = c1701q0.f18353f;
                    p136q.C c11 = (p136q.C) this.f5631k;
                    if (kotlin.jvm.internal.m.a(c11, c10) && (interfaceC1707u3 instanceof p020c0.C1715y)) {
                        long[] jArr3 = c11.f26297a;
                        int length = jArr3.length - 2;
                        if (length >= 0) {
                            int i12 = 0;
                            while (true) {
                                long j9 = jArr3[i12];
                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i13 = 8;
                                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                                    int i15 = 0;
                                    while (i15 < i14) {
                                        if ((255 & j9) < 128) {
                                            int i16 = (i12 << 3) + i15;
                                            java.lang.Object obj2 = c11.f26298b[i16];
                                            boolean z6 = c11.f26299c[i16] != i11;
                                            if (z6) {
                                                i3 = i13;
                                                p020c0.C1715y c1715y = (p020c0.C1715y) interfaceC1707u3;
                                                interfaceC1707u2 = interfaceC1707u3;
                                                com.google.android.gms.internal.play_billing.V0.B(c1715y.f18403n, obj2, c1701q0);
                                                if (obj2 instanceof p020c0.F) {
                                                    p020c0.F f9 = (p020c0.F) obj2;
                                                    jArr2 = jArr3;
                                                    if (!c1715y.f18403n.c(f9)) {
                                                        com.google.android.gms.internal.play_billing.V0.C(c1715y.f18406q, f9);
                                                    }
                                                    p136q.H h9 = c1701q0.g;
                                                    if (h9 != null) {
                                                        h9.k(obj2);
                                                    }
                                                } else {
                                                    jArr2 = jArr3;
                                                }
                                            } else {
                                                interfaceC1707u2 = interfaceC1707u3;
                                                jArr2 = jArr3;
                                                i3 = i13;
                                            }
                                            if (z6) {
                                                c11.f(i16);
                                            }
                                        } else {
                                            interfaceC1707u2 = interfaceC1707u3;
                                            jArr2 = jArr3;
                                            i3 = i13;
                                        }
                                        j9 >>= i3;
                                        i15++;
                                        i13 = i3;
                                        interfaceC1707u3 = interfaceC1707u2;
                                        jArr3 = jArr2;
                                    }
                                    interfaceC1707u = interfaceC1707u3;
                                    jArr = jArr3;
                                    if (i14 == i13) {
                                    }
                                } else {
                                    interfaceC1707u = interfaceC1707u3;
                                    jArr = jArr3;
                                }
                                if (i12 != length) {
                                    i12++;
                                    interfaceC1707u3 = interfaceC1707u;
                                    jArr3 = jArr;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                O0.f0 f0Var2 = (O0.f0) obj;
                v.D0 d4 = (v.D0) this.j;
                int iG = d4.f28813v.f28843a.g();
                if (iG < 0) {
                    iG = 0;
                }
                int i17 = this.f5630i;
                if (iG > i17) {
                    iG = i17;
                }
                int i18 = -iG;
                boolean z9 = d4.f28814w;
                int i19 = z9 ? 0 : i18;
                if (!z9) {
                    i18 = 0;
                }
                O0.g0 g0Var2 = (O0.g0) this.f5631k;
                f0Var2.f7634h = true;
                O0.f0.k(f0Var2, g0Var2, i19, i18);
                f0Var2.f7634h = false;
                break;
        }
        return p070h6.A.f22523a;
    }

    public /* synthetic */ B0(java.lang.Object obj, int i3, java.lang.Object obj2, int i9) {
        this.f5629h = i9;
        this.j = obj;
        this.f5630i = i3;
        this.f5631k = obj2;
    }
}
