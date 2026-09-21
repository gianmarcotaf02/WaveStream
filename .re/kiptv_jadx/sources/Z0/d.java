package Z0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F.C0339d f12618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B.K f12619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Z0.d f12620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12622f;
    public long g = Long.MIN_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Z0.e f12623h;

    public d(Z0.e eVar, int i3, F.C0339d c0339d, B.K k9) {
        this.f12623h = eVar;
        this.f12617a = i3;
        this.f12618b = c0339d;
        this.f12619c = k9;
    }

    public final void a(long j, long j9, long j10, long j11, float[] fArr) {
        Z0.c cVar;
        Z0.c cVar2;
        long j12 = this.f12623h.f12629f;
        F.C0339d c0339d = this.f12618b;
        androidx.compose.ui.node.NodeCoordinator nodeCoordinatorR = Q0.AbstractC0777k.r(c0339d, 2);
        Q0.F fT = Q0.AbstractC0777k.t(c0339d);
        if (fT.L()) {
            Q0.C0765b0 c0765b0 = fT.f8232N;
            if (c0765b0.f8389d != nodeCoordinatorR) {
                long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (java.lang.Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j13 = nodeCoordinatorR.j;
                androidx.compose.ui.node.NodeCoordinator nodeCoordinator = c0765b0.f8389d;
                nodeCoordinator.getClass();
                long jD = com.google.android.gms.internal.play_billing.V0.D(nodeCoordinator.H(nodeCoordinatorR, jFloatToRawIntBits));
                cVar = new Z0.c(jD, (4294967295L & ((long) (((int) (jD & 4294967295L)) + ((int) (j13 & 4294967295L))))) | (((long) (((int) (jD >> 32)) + ((int) (j13 >> 32)))) << 32), j10, j11, j12, fArr, c0339d);
            } else {
                cVar = new Z0.c(j, j9, j10, j11, j12, fArr, c0339d);
            }
            cVar2 = cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 == null) {
            return;
        }
        this.f12619c.invoke(cVar2);
    }

    public final void b() {
        Z0.e eVar = this.f12623h;
        p136q.w wVar = eVar.f12624a;
        int i3 = this.f12617a;
        Z0.d dVar = (Z0.d) wVar.g(i3);
        if (dVar != null) {
            if (dVar.equals(this)) {
                Z0.d dVar2 = this.f12620d;
                this.f12620d = null;
                if (dVar2 != null) {
                    int iD = wVar.d(i3);
                    java.lang.Object[] objArr = wVar.f26399c;
                    java.lang.Object obj = objArr[iD];
                    wVar.f26398b[iD] = i3;
                    objArr[iD] = dVar2;
                    return;
                }
                Q0.F fT = Q0.AbstractC0777k.t(this.f12618b.f26475h);
                if (fT.f8247o) {
                    Z0.b rectManager = Q0.I.a(fT).getRectManager();
                    rectManager.getClass();
                    rectManager.f12603a.i(fT.f8242i, false);
                    return;
                }
                return;
            }
            int iD2 = wVar.d(i3);
            java.lang.Object[] objArr2 = wVar.f26399c;
            java.lang.Object obj2 = objArr2[iD2];
            wVar.f26398b[iD2] = i3;
            objArr2[iD2] = dVar;
            while (true) {
                Z0.d dVar3 = dVar.f12620d;
                if (dVar3 == null) {
                    break;
                }
                if (dVar3 == this) {
                    dVar.f12620d = this.f12620d;
                    this.f12620d = null;
                    return;
                }
                dVar = dVar3;
            }
        }
        Z0.d dVar4 = eVar.f12625b;
        if (dVar4 == this) {
            eVar.f12625b = dVar4.f12620d;
            this.f12620d = null;
            return;
        }
        Z0.d dVar5 = dVar4 != null ? dVar4.f12620d : null;
        while (true) {
            Z0.d dVar6 = dVar4;
            dVar4 = dVar5;
            if (dVar4 == null) {
                return;
            }
            if (dVar4 == this) {
                if (dVar6 != null) {
                    dVar6.f12620d = dVar4.f12620d;
                }
                this.f12620d = null;
                return;
            }
            dVar5 = dVar4.f12620d;
        }
    }
}
