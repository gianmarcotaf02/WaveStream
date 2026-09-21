package N4;

import F.i0;

public final class d {

    public final M4.b f7336a;

    public final int f7337b;

    public final int f7338c;

    public final int f7339d;

    public final d f7340e;

    public final int f7341f;

    public d(i0 i0Var, M4.b bVar, int i3, int i9, int i10, d dVar, M4.c cVar) {
        this.f7336a = bVar;
        this.f7337b = i3;
        M4.b bVar2 = M4.b.BYTE;
        int i11 = (bVar == bVar2 || dVar == null) ? i9 : dVar.f7338c;
        this.f7338c = i11;
        this.f7339d = i10;
        this.f7340e = dVar;
        boolean z6 = false;
        int iA = dVar != null ? dVar.f7341f : 0;
        if ((bVar == bVar2 && dVar == null && i11 != 0) || (dVar != null && i11 != dVar.f7338c)) {
            z6 = true;
        }
        iA = (dVar == null || bVar != dVar.f7336a || z6) ? iA + bVar.a(cVar) + 4 : iA;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                iA += i10 != 1 ? 11 : 6;
            } else if (iOrdinal == 4) {
                iA += ((String) i0Var.f3465b).substring(i3, i10 + i3).getBytes(((J4.d) i0Var.f3466c).f6024a[i9].charset()).length * 8;
                if (z6) {
                    iA += 12;
                }
            } else if (iOrdinal == 6) {
                iA += 13;
            }
        } else {
            iA += i10 != 1 ? i10 == 2 ? 7 : 10 : 4;
        }
        this.f7341f = iA;
    }
}
