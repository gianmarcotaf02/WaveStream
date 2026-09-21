package Z0;

import B.K;
import F.C0339d;
import Q0.AbstractC0777k;
import Q0.C0765b0;
import Q0.F;
import Q0.I;
import androidx.compose.ui.node.NodeCoordinator;
import com.google.android.gms.internal.play_billing.V0;
import p136q.w;

public final class d {

    public final int f12617a;

    public final C0339d f12618b;

    public final K f12619c;

    public d f12620d;

    public long f12621e;

    public long f12622f;
    public long g = Long.MIN_VALUE;

    public final e f12623h;

    public d(e eVar, int i3, C0339d c0339d, K k9) {
        this.f12623h = eVar;
        this.f12617a = i3;
        this.f12618b = c0339d;
        this.f12619c = k9;
    }

    public final void a(long j, long j9, long j10, long j11, float[] fArr) {
        c cVar;
        c cVar2;
        long j12 = this.f12623h.f12629f;
        C0339d c0339d = this.f12618b;
        NodeCoordinator nodeCoordinatorR = AbstractC0777k.r(c0339d, 2);
        F fT = AbstractC0777k.t(c0339d);
        if (fT.L()) {
            C0765b0 c0765b0 = fT.f8232N;
            if (c0765b0.f8389d != nodeCoordinatorR) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j13 = nodeCoordinatorR.j;
                NodeCoordinator nodeCoordinator = c0765b0.f8389d;
                nodeCoordinator.getClass();
                long jD = V0.D(nodeCoordinator.H(nodeCoordinatorR, jFloatToRawIntBits));
                cVar = new c(jD, (4294967295L & ((long) (((int) (jD & 4294967295L)) + ((int) (j13 & 4294967295L))))) | (((long) (((int) (jD >> 32)) + ((int) (j13 >> 32)))) << 32), j10, j11, j12, fArr, c0339d);
            } else {
                cVar = new c(j, j9, j10, j11, j12, fArr, c0339d);
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
        e eVar = this.f12623h;
        w wVar = eVar.f12624a;
        int i3 = this.f12617a;
        d dVar = (d) wVar.g(i3);
        if (dVar != null) {
            if (dVar.equals(this)) {
                d dVar2 = this.f12620d;
                this.f12620d = null;
                if (dVar2 != null) {
                    int iD = wVar.d(i3);
                    Object[] objArr = wVar.f26399c;
                    Object obj = objArr[iD];
                    wVar.f26398b[iD] = i3;
                    objArr[iD] = dVar2;
                    return;
                }
                F fT = AbstractC0777k.t(this.f12618b.f26475h);
                if (fT.f8247o) {
                    b rectManager = I.a(fT).getRectManager();
                    rectManager.getClass();
                    rectManager.f12603a.i(fT.f8242i, false);
                    return;
                }
                return;
            }
            int iD2 = wVar.d(i3);
            Object[] objArr2 = wVar.f26399c;
            Object obj2 = objArr2[iD2];
            wVar.f26398b[iD2] = i3;
            objArr2[iD2] = dVar;
            while (true) {
                d dVar3 = dVar.f12620d;
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
        d dVar4 = eVar.f12625b;
        if (dVar4 == this) {
            eVar.f12625b = dVar4.f12620d;
            this.f12620d = null;
            return;
        }
        d dVar5 = dVar4 != null ? dVar4.f12620d : null;
        while (true) {
            d dVar6 = dVar4;
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
