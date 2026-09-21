package p196y0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p196y0.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p196y0.q f31754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p196y0.q f31755f;
    public final float[] g;

    public f(p196y0.q qVar, p196y0.q qVar2) {
        float[] fArrG;
        super(qVar2, qVar, qVar2, null);
        this.f31754e = qVar;
        this.f31755f = qVar2;
        p196y0.s sVar = qVar2.f31779d;
        p196y0.s sVar2 = qVar.f31779d;
        boolean zD = p196y0.j.d(sVar2, sVar);
        float[] fArr = qVar.f31783i;
        float[] fArr2 = qVar2.j;
        if (zD) {
            fArrG = p196y0.j.g(fArr2, fArr);
        } else {
            float[] fArrA = sVar2.a();
            p196y0.s sVar3 = qVar2.f31779d;
            float[] fArrA2 = sVar3.a();
            p196y0.s sVar4 = p196y0.j.f31762b;
            boolean zD2 = p196y0.j.d(sVar2, sVar4);
            float[] fArr3 = p196y0.a.f31722b.f31723a;
            fArrG = p196y0.j.g(p196y0.j.d(sVar3, sVar4) ? fArr2 : p196y0.j.f(p196y0.j.g(p196y0.j.c(fArr3, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.f31783i)), zD2 ? fArr : p196y0.j.g(p196y0.j.c(fArr3, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr));
        }
        this.g = fArrG;
    }

    @Override // p196y0.g
    public final long a(long j) {
        float fI = p188x0.C3098s.i(j);
        float fH = p188x0.C3098s.h(j);
        float f9 = p188x0.C3098s.f(j);
        float fE = p188x0.C3098s.e(j);
        p196y0.m mVar = this.f31754e.f31789p;
        float fC = (float) mVar.c(fI);
        float fC2 = (float) mVar.c(fH);
        float fC3 = (float) mVar.c(f9);
        float[] fArr = this.g;
        float f10 = (fArr[6] * fC3) + (fArr[3] * fC2) + (fArr[0] * fC);
        float f11 = (fArr[7] * fC3) + (fArr[4] * fC2) + (fArr[1] * fC);
        float f12 = (fArr[8] * fC3) + (fArr[5] * fC2) + (fArr[2] * fC);
        p196y0.q qVar = this.f31755f;
        float fC4 = (float) qVar.f31786m.c(f10);
        double d4 = f11;
        p196y0.m mVar2 = qVar.f31786m;
        return p188x0.z.b(fC4, (float) mVar2.c(d4), (float) mVar2.c(f12), fE, qVar);
    }
}
