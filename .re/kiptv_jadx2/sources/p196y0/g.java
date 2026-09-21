package p196y0;

import p188x0.C3098s;

public class g {

    public final c f31756a;

    public final c f31757b;

    public final c f31758c;

    public final float[] f31759d;

    public g(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f31756a = cVar;
        this.f31757b = cVar2;
        this.f31758c = cVar3;
        this.f31759d = fArr;
    }

    public long a(long j) {
        float fI = C3098s.i(j);
        float fH = C3098s.h(j);
        float f9 = C3098s.f(j);
        float fE = C3098s.e(j);
        c cVar = this.f31757b;
        long jD = cVar.d(fI, fH, f9);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = cVar.e(fI, fH, f9);
        float[] fArr = this.f31759d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f10 = fIntBitsToFloat;
        float f11 = fIntBitsToFloat2;
        return this.f31758c.f(f10, f11, fE2, fE, this.f31756a);
    }

    public g(c cVar, c cVar2, int i3) {
        float[] fArr;
        long j = cVar.f31730b;
        long j9 = b.f31724a;
        c cVarA = b.a(j, j9) ? j.a(cVar) : cVar;
        c cVarA2 = b.a(cVar2.f31730b, j9) ? j.a(cVar2) : cVar2;
        if (i3 == 3) {
            boolean zA = b.a(cVar.f31730b, j9);
            boolean zA2 = b.a(cVar2.f31730b, j9);
            if (!(zA && zA2) && (zA || zA2)) {
                cVar = zA ? cVar : cVar2;
                float[] fArrA = j.f31765e;
                s sVar = ((q) cVar).f31779d;
                float[] fArrA2 = zA ? sVar.a() : fArrA;
                fArrA = zA2 ? sVar.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this(cVar2, cVarA, cVarA2, fArr);
    }
}
