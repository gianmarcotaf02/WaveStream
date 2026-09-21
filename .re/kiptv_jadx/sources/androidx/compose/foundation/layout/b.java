package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.FillElement f15789a = new androidx.compose.foundation.layout.FillElement(B.A.f459i, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.FillElement f15790b = new androidx.compose.foundation.layout.FillElement(B.A.f458h, 1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.FillElement f15791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.d f15792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.d f15793e;

    static {
        B.A a2 = B.A.j;
        f15791c = new androidx.compose.foundation.layout.FillElement(a2, 1.0f);
        p137q0.h hVar = p137q0.c.f26452l;
        f15792d = new androidx.compose.foundation.layout.d(a2, new B.d0(0, hVar), hVar);
        p137q0.h hVar2 = p137q0.c.f26449h;
        f15793e = new androidx.compose.foundation.layout.d(a2, new B.d0(0, hVar2), hVar2);
    }

    public static final p137q0.p a(float f9, float f10) {
        return new androidx.compose.foundation.layout.c(f9, f10);
    }

    public static final p137q0.p b(p137q0.p pVar, float f9) {
        return pVar.d(f9 == 1.0f ? f15790b : new androidx.compose.foundation.layout.FillElement(B.A.f458h, f9));
    }

    public static p137q0.p d(p137q0.p pVar) {
        return pVar.d(f15791c);
    }

    public static final p137q0.p e(p137q0.p pVar, float f9) {
        return pVar.d(f9 == 1.0f ? f15789a : new androidx.compose.foundation.layout.FillElement(B.A.f459i, f9));
    }

    public static final p137q0.p g(p137q0.p pVar, float f9) {
        return pVar.d(new androidx.compose.foundation.layout.a(0.0f, f9, 0.0f, f9, 5));
    }

    public static final p137q0.p h(p137q0.p pVar, float f9, float f10) {
        return pVar.d(new androidx.compose.foundation.layout.a(0.0f, f9, 0.0f, f10, 5));
    }

    public static /* synthetic */ p137q0.p i(p137q0.p pVar, float f9, float f10, int i3) {
        if ((i3 & 1) != 0) {
            f9 = Float.NaN;
        }
        if ((i3 & 2) != 0) {
            f10 = Float.NaN;
        }
        return h(pVar, f9, f10);
    }

    public static final p137q0.p j(p137q0.p pVar, float f9, float f10) {
        return pVar.d(new androidx.compose.foundation.layout.a(f9, f10, f9, f10, false));
    }

    public static p137q0.p k(p137q0.p pVar, float f9, float f10, float f11, float f12, int i3) {
        return pVar.d(new androidx.compose.foundation.layout.a(f9, (i3 & 2) != 0 ? Float.NaN : f10, (i3 & 4) != 0 ? Float.NaN : f11, (i3 & 8) != 0 ? Float.NaN : f12, false));
    }

    public static final p137q0.p l(p137q0.p pVar, float f9) {
        return pVar.d(new androidx.compose.foundation.layout.a(f9, f9, f9, f9, true));
    }

    public static final p137q0.p m(p137q0.p pVar, float f9, float f10) {
        return pVar.d(new androidx.compose.foundation.layout.a(f9, f10, f9, f10, true));
    }

    public static final p137q0.p n(p137q0.p pVar, float f9, float f10, float f11, float f12) {
        return pVar.d(new androidx.compose.foundation.layout.a(f9, f10, f11, f12, true));
    }

    public static final p137q0.p o(p137q0.p pVar, float f9) {
        return pVar.d(new androidx.compose.foundation.layout.a(f9, 0.0f, f9, 0.0f, 10));
    }

    public static p137q0.p p(p137q0.p pVar, float f9, float f10, int i3) {
        return pVar.d(new androidx.compose.foundation.layout.a((i3 & 1) != 0 ? Float.NaN : f9, 0.0f, (i3 & 2) != 0 ? Float.NaN : f10, 0.0f, 10));
    }

    public static p137q0.p q(p137q0.p pVar, p137q0.h hVar) {
        androidx.compose.foundation.layout.d dVar;
        if (hVar.equals(p137q0.c.f26452l)) {
            dVar = f15792d;
        } else {
            dVar = hVar.equals(p137q0.c.f26449h) ? f15793e : new androidx.compose.foundation.layout.d(B.A.j, new B.d0(0, hVar), hVar);
        }
        return pVar.d(dVar);
    }
}
