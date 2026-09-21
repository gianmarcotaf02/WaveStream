package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final class F extends p121o0.u implements p020c0.e1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kotlin.jvm.functions.Function0 f18113i;
    public final p020c0.C1676e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p020c0.E f18114k = new p020c0.E(p121o0.k.j().g());

    public F(kotlin.jvm.functions.Function0 function0, p020c0.C1676e c1676e) {
        this.f18113i = function0;
        this.j = c1676e;
    }

    @Override // p121o0.t
    public final p121o0.v d() {
        return this.f18114k;
    }

    @Override // p121o0.t
    public final void e(p121o0.v vVar) {
        kotlin.jvm.internal.m.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f18114k = (p020c0.E) vVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00a3 A[EDGE_INSN: B:104:0x00a3->B:31:0x00a3 BREAK  A[LOOP:1: B:16:0x0049->B:30:0x009e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009e A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x009e, LOOP_END, TryCatch #2 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x005c, B:20:0x0068, B:22:0x0072, B:24:0x008a, B:26:0x0090, B:30:0x009e, B:31:0x00a3), top: B:98:0x0023 }] */
    public final p020c0.E g(p020c0.E e6, p121o0.f fVar, boolean z6, kotlin.jvm.functions.Function0 function0) {
        p020c0.E e9;
        int i3;
        if (e6.c(this, fVar)) {
            if (z6) {
                p038e0.e eVarQ = p020c0.AbstractC1703s.q();
                java.lang.Object[] objArr = eVarQ.f21324h;
                int i9 = eVarQ.j;
                for (int i10 = 0; i10 < i9; i10++) {
                    ((p020c0.C1698p) objArr[i10]).b();
                }
                try {
                    p136q.C c9 = e6.f18109e;
                    j1.l lVar = p020c0.T0.f18195a;
                    p089k0.g gVar = (p089k0.g) lVar.i();
                    if (gVar == null) {
                        gVar = new p089k0.g();
                        lVar.v(gVar);
                    }
                    int i11 = gVar.f24414a;
                    java.lang.Object[] objArr2 = c9.f26298b;
                    int[] iArr = c9.f26299c;
                    long[] jArr = c9.f26297a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j = jArr[i12];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i12 != length) {
                                    break;
                                    break;
                                }
                                i12++;
                            } else {
                                int i13 = 8;
                                int i14 = 8 - ((~(i12 - length)) >>> 31);
                                int i15 = 0;
                                while (i15 < i14) {
                                    if ((j & 255) < 128) {
                                        int i16 = (i12 << 3) + i15;
                                        i3 = i13;
                                        p121o0.t tVar = (p121o0.t) objArr2[i16];
                                        gVar.f24414a = i11 + iArr[i16];
                                        p194x6.j jVarE = fVar.e();
                                        if (jVarE != null) {
                                            jVarE.invoke(tVar);
                                        }
                                    } else {
                                        i3 = i13;
                                    }
                                    j >>= i3;
                                    i15++;
                                    i13 = i3;
                                }
                                if (i14 != i13) {
                                    break;
                                }
                                if (i12 != length) {
                                    break;
                                }
                                i12++;
                            }
                        }
                    }
                    gVar.f24414a = i11;
                } finally {
                    java.lang.Object[] objArr3 = eVarQ.f21324h;
                    int i17 = eVarQ.j;
                    for (int i18 = 0; i18 < i17; i18++) {
                        ((p020c0.C1698p) objArr3[i18]).a();
                    }
                }
            }
            return e6;
        }
        p136q.C c10 = new p136q.C();
        j1.l lVar2 = p020c0.T0.f18195a;
        p089k0.g gVar2 = (p089k0.g) lVar2.i();
        if (gVar2 == null) {
            gVar2 = new p089k0.g();
            lVar2.v(gVar2);
        }
        p089k0.g gVar3 = gVar2;
        int i19 = gVar3.f24414a;
        p038e0.e eVarQ2 = p020c0.AbstractC1703s.q();
        java.lang.Object[] objArr4 = eVarQ2.f21324h;
        int i20 = eVarQ2.j;
        for (int i21 = 0; i21 < i20; i21++) {
            ((p020c0.C1698p) objArr4[i21]).b();
        }
        try {
            gVar3.f24414a = i19 + 1;
            java.lang.Object objJ = p121o0.o.j(new B.Y(i19, 2, this, gVar3, c10), function0);
            gVar3.f24414a = i19;
            java.lang.Object[] objArr5 = eVarQ2.f21324h;
            int i22 = eVarQ2.j;
            for (int i23 = 0; i23 < i22; i23++) {
                ((p020c0.C1698p) objArr5[i23]).a();
            }
            java.lang.Object obj = p121o0.k.f25993c;
            synchronized (obj) {
                p121o0.f fVarJ = p121o0.k.j();
                java.lang.Object obj2 = e6.f18110f;
                if (obj2 != p020c0.E.f18106h && this.j != null) {
                    if (objJ == obj2) {
                        e6.f18109e = c10;
                        e6.g = e6.d(this, fVarJ);
                        e9 = e6;
                    }
                }
                p020c0.E e10 = this.f18114k;
                synchronized (obj) {
                    p121o0.v vVarM = p121o0.k.m(e10, this);
                    vVarM.a(e10);
                    vVarM.f26026a = fVarJ.g();
                    e9 = (p020c0.E) vVarM;
                    e9.f18109e = c10;
                    e9.g = e9.d(this, fVarJ);
                    e9.f18110f = objJ;
                }
                return e9;
            }
            p089k0.g gVar4 = (p089k0.g) p020c0.T0.f18195a.i();
            if (gVar4 == null || gVar4.f24414a != 0) {
                return e9;
            }
            p121o0.k.j().m();
            synchronized (obj) {
                p121o0.f fVarJ2 = p121o0.k.j();
                e9.f18107c = fVarJ2.g();
                e9.f18108d = fVarJ2.h();
                return e9;
            }
        } catch (java.lang.Throwable th) {
            java.lang.Object[] objArr6 = eVarQ2.f21324h;
            int i24 = eVarQ2.j;
            for (int i25 = 0; i25 < i24; i25++) {
                ((p020c0.C1698p) objArr6[i25]).a();
            }
            throw th;
        }
    }

    @Override // p020c0.e1
    public final java.lang.Object getValue() {
        p194x6.j jVarE = p121o0.k.j().e();
        if (jVarE != null) {
            jVarE.invoke(this);
        }
        p121o0.f fVarJ = p121o0.k.j();
        return g((p020c0.E) p121o0.k.i(this.f18114k, fVarJ), fVarJ, true, this.f18113i).f18110f;
    }

    public final p020c0.E h() {
        p121o0.f fVarJ = p121o0.k.j();
        return g((p020c0.E) p121o0.k.i(this.f18114k, fVarJ), fVarJ, false, this.f18113i);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DerivedState(value=");
        p020c0.E e6 = (p020c0.E) p121o0.k.h(this.f18114k);
        sb.append(e6.c(this, p121o0.k.j()) ? java.lang.String.valueOf(e6.f18110f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
