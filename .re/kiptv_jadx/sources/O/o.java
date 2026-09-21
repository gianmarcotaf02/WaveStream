package O;

/* JADX INFO: loaded from: classes.dex */
public final class o implements p146r1.E {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p020c0.C1704s0 f7551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p113n1.m f7552i;
    public p113n1.n j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p113n1.m f7553k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p113n1.k f7554l;

    public o(p020c0.C1704s0 c1704s0) {
        this.f7551h = c1704s0;
    }

    @Override // p146r1.E
    public final long b(p113n1.l lVar, long j, p113n1.n nVar, long j9) {
        p113n1.k kVar = this.f7554l;
        if (kVar != null) {
            p113n1.m mVar = this.f7552i;
            if ((mVar == null ? false : p113n1.m.a(mVar.f25565a, j)) && this.j == nVar) {
                p113n1.m mVar2 = this.f7553k;
                if (mVar2 != null ? p113n1.m.a(mVar2.f25565a, j9) : false) {
                    return kVar.f25559a;
                }
            }
        }
        long jB = this.f7551h.b(lVar, j, nVar, j9);
        this.f7552i = new p113n1.m(j);
        this.j = nVar;
        this.f7553k = new p113n1.m(j9);
        this.f7554l = new p113n1.k(jB);
        return jB;
    }
}
