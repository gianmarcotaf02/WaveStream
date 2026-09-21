package p122o1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f26041a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile p136q.T f26042b = new p136q.T(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.Object[] f26043c;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        f26043c = objArr;
        synchronized (objArr) {
            f26042b.f((int) 115.0f, new p122o1.c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f26042b.f((int) 130.0f, new p122o1.c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f26042b.f((int) 150.0f, new p122o1.c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f26042b.f((int) 180.0f, new p122o1.c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f26042b.f((int) 200.0f, new p122o1.c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f26042b.e(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        p113n1.j.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static p122o1.a a(float f9) {
        float fE;
        p122o1.a cVar;
        if (f9 < 1.03f) {
            return null;
        }
        int i3 = (int) (f9 * 100.0f);
        p122o1.a aVar = (p122o1.a) f26042b.d(i3);
        if (aVar != null) {
            return aVar;
        }
        p136q.T t9 = f26042b;
        if (t9.f26355h) {
            p136q.AbstractC2674s.a(t9);
        }
        int iA = p144r.a.a(t9.f26357k, i3, t9.f26356i);
        if (iA >= 0) {
            return (p122o1.a) f26042b.h(iA);
        }
        int i9 = -(iA + 1);
        int i10 = i9 - 1;
        if (i9 >= f26042b.g()) {
            p122o1.c cVar2 = new p122o1.c(new float[]{1.0f}, new float[]{f9});
            b(f9, cVar2);
            return cVar2;
        }
        float[] fArr = f26041a;
        if (i10 < 0) {
            cVar = new p122o1.c(fArr, fArr);
            fE = 1.0f;
        } else {
            fE = f26042b.e(i10) / 100.0f;
            cVar = (p122o1.a) f26042b.h(i10);
        }
        float fE2 = f26042b.e(i9) / 100.0f;
        float fMax = (java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, fE == fE2 ? 0.0f : (f9 - fE) / (fE2 - fE))) * 1.0f) + 0.0f;
        p122o1.a aVar2 = (p122o1.a) f26042b.h(i9);
        float[] fArr2 = new float[9];
        for (int i11 = 0; i11 < 9; i11++) {
            float f10 = fArr[i11];
            float fB = cVar.b(f10);
            fArr2[i11] = ((aVar2.b(f10) - fB) * fMax) + fB;
        }
        p122o1.c cVar3 = new p122o1.c(fArr, fArr2);
        b(f9, cVar3);
        return cVar3;
    }

    public static void b(float f9, p122o1.c cVar) {
        synchronized (f26043c) {
            p136q.T tClone = f26042b.clone();
            tClone.f((int) (f9 * 100.0f), cVar);
            f26042b = tClone;
        }
    }
}
