package p011b1;

import p104m1.i;
import p104m1.s;
import p113n1.p;
import p113n1.q;

public abstract class u {

    public static final long f17854a;

    public static final int f17855b = 0;

    static {
        q[] qVarArr = p.f25569b;
        f17854a = p.f25570c;
    }

    public static final t a(t tVar, int i3, int i9, long j, p104m1.q qVar, v vVar, i iVar, int i10, int i11, s sVar) {
        long j9;
        int i12 = i3;
        int i13 = i9;
        long j10 = j;
        p104m1.q qVar2 = qVar;
        v vVar2 = vVar;
        i iVar2 = iVar;
        int i14 = i10;
        int i15 = i11;
        s sVar2 = sVar;
        if (i12 == 0 || i12 == tVar.f17846a) {
            q[] qVarArr = p.f25569b;
            if ((j10 & 1095216660480L) == 0) {
                j9 = 0;
            } else {
                j9 = 0;
                if (p.a(j10, tVar.f17848c)) {
                }
            }
            if ((qVar2 == null || qVar2.equals(tVar.f17849d)) && ((i13 == 0 || i13 == tVar.f17847b) && ((vVar2 == null || vVar2.equals(tVar.f17850e)) && ((iVar2 == null || iVar2.equals(tVar.f17851f)) && ((i14 == 0 || i14 == tVar.g) && ((i15 == 0 || i15 == tVar.f17852h) && (sVar2 == null || sVar2.equals(tVar.f17853i)))))))) {
                return tVar;
            }
        } else {
            j9 = 0;
        }
        q[] qVarArr2 = p.f25569b;
        if ((j10 & 1095216660480L) == j9) {
            j10 = tVar.f17848c;
        }
        if (qVar2 == null) {
            qVar2 = tVar.f17849d;
        }
        if (i12 == 0) {
            i12 = tVar.f17846a;
        }
        if (i13 == 0) {
            i13 = tVar.f17847b;
        }
        v vVar3 = tVar.f17850e;
        if (vVar3 != null && vVar2 == null) {
            vVar2 = vVar3;
        }
        if (iVar2 == null) {
            iVar2 = tVar.f17851f;
        }
        if (i14 == 0) {
            i14 = tVar.g;
        }
        if (i15 == 0) {
            i15 = tVar.f17852h;
        }
        if (sVar2 == null) {
            sVar2 = tVar.f17853i;
        }
        return new t(i12, i13, j10, qVar2, vVar2, iVar2, i14, i15, sVar2);
    }
}
