package p196y0;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p196y0.c f31756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p196y0.c f31757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p196y0.c f31758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f31759d;

    public g(p196y0.c cVar, p196y0.c cVar2, p196y0.c cVar3, float[] fArr) {
        this.f31756a = cVar;
        this.f31757b = cVar2;
        this.f31758c = cVar3;
        this.f31759d = fArr;
    }

    public long a(long j) {
        float fI = p188x0.C3098s.i(j);
        float fH = p188x0.C3098s.h(j);
        float f9 = p188x0.C3098s.f(j);
        float fE = p188x0.C3098s.e(j);
        p196y0.c cVar = this.f31757b;
        long jD = cVar.d(fI, fH, f9);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (jD & 4294967295L));
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

    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Illegal instructions before constructor call */
    public g(p196y0.c cVar, p196y0.c cVar2, int i3) {
        float[] fArr;
        long j = cVar.f31730b;
        long j9 = p196y0.b.f31724a;
        p196y0.c cVarA = p196y0.b.a(j, j9) ? p196y0.j.a(cVar) : cVar;
        p196y0.c cVarA2 = p196y0.b.a(cVar2.f31730b, j9) ? p196y0.j.a(cVar2) : cVar2;
        if (i3 == 3) {
            boolean zA = p196y0.b.a(cVar.f31730b, j9);
            boolean zA2 = p196y0.b.a(cVar2.f31730b, j9);
            if (!(zA && zA2) && (zA || zA2)) {
                cVar = zA ? cVar : cVar2;
                float[] fArrA = p196y0.j.f31765e;
                p196y0.s sVar = ((p196y0.q) cVar).f31779d;
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
