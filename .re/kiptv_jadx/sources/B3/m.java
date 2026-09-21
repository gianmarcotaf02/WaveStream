package B3;

/* JADX INFO: loaded from: classes.dex */
public final class m implements B3.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B3.q f638i;
    public final /* synthetic */ B3.p j;

    public /* synthetic */ m(B3.p pVar, B3.q qVar, int i3) {
        this.f637h = i3;
        this.f638i = qVar;
        this.j = pVar;
    }

    @Override // B3.q
    public final void i(java.lang.String str, long j, int i3, B3.o oVar, long j9, long j10) {
        int i9;
        switch (this.f637h) {
            case 0:
                this.j.g = null;
                B3.q qVar = this.f638i;
                if (qVar != null) {
                    qVar.i(str, j, i3, oVar, j9, j10);
                }
                break;
            default:
                if (this.f638i != null) {
                    if (i3 == 2001) {
                        B3.p pVar = this.j;
                        java.lang.Object[] objArr = {java.lang.Integer.valueOf(pVar.f645i)};
                        B3.C0089b c0089b = pVar.f666a;
                        android.util.Log.w(c0089b.f617a, c0089b.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                        for (p191x3.B b9 : ((p199y3.g) pVar.f644h.f31153h).f31869i) {
                            switch (b9.f31151a) {
                                case 1:
                                    ((p199y3.c) b9.f31152b).d();
                                    break;
                            }
                        }
                        i9 = 2001;
                    } else {
                        i9 = i3;
                    }
                    this.f638i.i(str, j, i9, oVar, j9, j10);
                }
                break;
        }
    }

    @Override // B3.q
    public final void o(java.lang.String str, long j, long j9, long j10) {
        switch (this.f637h) {
            case 0:
                B3.q qVar = this.f638i;
                if (qVar != null) {
                    qVar.o(str, j, j9, j10);
                }
                break;
            default:
                B3.q qVar2 = this.f638i;
                if (qVar2 != null) {
                    qVar2.o(str, j, j9, j10);
                }
                break;
        }
    }
}
