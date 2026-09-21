package p011b1;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f17854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f17855b = 0;

    static {
        p113n1.q[] qVarArr = p113n1.p.f25569b;
        f17854a = p113n1.p.f25570c;
    }

    public static final p011b1.t a(p011b1.t tVar, int i3, int i9, long j, p104m1.q qVar, p011b1.v vVar, p104m1.i iVar, int i10, int i11, p104m1.s sVar) {
        long j9;
        int i12 = i3;
        int i13 = i9;
        long j10 = j;
        p104m1.q qVar2 = qVar;
        p011b1.v vVar2 = vVar;
        p104m1.i iVar2 = iVar;
        int i14 = i10;
        int i15 = i11;
        p104m1.s sVar2 = sVar;
        if (i12 == 0 || i12 == tVar.f17846a) {
            p113n1.q[] qVarArr = p113n1.p.f25569b;
            if ((j10 & 1095216660480L) == 0) {
                j9 = 0;
            } else {
                j9 = 0;
                if (p113n1.p.a(j10, tVar.f17848c)) {
                }
            }
            if ((qVar2 == null || qVar2.equals(tVar.f17849d)) && ((i13 == 0 || i13 == tVar.f17847b) && ((vVar2 == null || vVar2.equals(tVar.f17850e)) && ((iVar2 == null || iVar2.equals(tVar.f17851f)) && ((i14 == 0 || i14 == tVar.g) && ((i15 == 0 || i15 == tVar.f17852h) && (sVar2 == null || sVar2.equals(tVar.f17853i)))))))) {
                return tVar;
            }
        } else {
            j9 = 0;
        }
        p113n1.q[] qVarArr2 = p113n1.p.f25569b;
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
        p011b1.v vVar3 = tVar.f17850e;
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
        return new p011b1.t(i12, i13, j10, qVar2, vVar2, iVar2, i14, i15, sVar2);
    }
}
