package p196y0;

import p188x0.C3098s;
import p188x0.z;

public final class f extends g {

    public final q f31754e;

    public final q f31755f;
    public final float[] g;

    public f(q qVar, q qVar2) {
        float[] fArrG;
        super(qVar2, qVar, qVar2, null);
        this.f31754e = qVar;
        this.f31755f = qVar2;
        s sVar = qVar2.f31779d;
        s sVar2 = qVar.f31779d;
        boolean zD = j.d(sVar2, sVar);
        float[] fArr = qVar.f31783i;
        float[] fArr2 = qVar2.j;
        if (zD) {
            fArrG = j.g(fArr2, fArr);
        } else {
            float[] fArrA = sVar2.a();
            s sVar3 = qVar2.f31779d;
            float[] fArrA2 = sVar3.a();
            s sVar4 = j.f31762b;
            boolean zD2 = j.d(sVar2, sVar4);
            float[] fArr3 = a.f31722b.f31723a;
            fArrG = j.g(j.d(sVar3, sVar4) ? fArr2 : j.f(j.g(j.c(fArr3, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.f31783i)), zD2 ? fArr : j.g(j.c(fArr3, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr));
        }
        this.g = fArrG;
    }

    @Override
    public final long a(long j) {
        float fI = C3098s.i(j);
        float fH = C3098s.h(j);
        float f9 = C3098s.f(j);
        float fE = C3098s.e(j);
        m mVar = this.f31754e.f31789p;
        float fC = (float) mVar.c(fI);
        float fC2 = (float) mVar.c(fH);
        float fC3 = (float) mVar.c(f9);
        float[] fArr = this.g;
        float f10 = (fArr[6] * fC3) + (fArr[3] * fC2) + (fArr[0] * fC);
        float f11 = (fArr[7] * fC3) + (fArr[4] * fC2) + (fArr[1] * fC);
        float f12 = (fArr[8] * fC3) + (fArr[5] * fC2) + (fArr[2] * fC);
        q qVar = this.f31755f;
        float fC4 = (float) qVar.f31786m.c(f10);
        double d4 = f11;
        m mVar2 = qVar.f31786m;
        return z.b(fC4, (float) mVar2.c(d4), (float) mVar2.c(f12), fE, qVar);
    }
}
