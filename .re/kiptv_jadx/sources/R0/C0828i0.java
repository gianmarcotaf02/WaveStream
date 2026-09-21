package R0;

/* JADX INFO: renamed from: R0.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0828i0 implements R0.InterfaceC0826h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f8924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f8925b;

    public C0828i0(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        int size = arrayList.size();
        this.f8924a = new int[size];
        this.f8925b = new float[size];
        for (int i3 = 0; i3 < size; i3++) {
            this.f8924a[i3] = ((java.lang.Integer) arrayList.get(i3)).intValue();
            this.f8925b[i3] = ((java.lang.Float) arrayList2.get(i3)).floatValue();
        }
    }

    @Override // R0.InterfaceC0826h0
    public void a(android.view.View view, float[] fArr) {
        p188x0.E.d(fArr);
        b(view, fArr);
    }

    public void b(android.view.View view, float[] fArr) {
        java.lang.Object parent = view.getParent();
        boolean z6 = parent instanceof android.view.View;
        float[] fArr2 = this.f8925b;
        if (z6) {
            b((android.view.View) parent, fArr);
            float f9 = -view.getScrollX();
            float f10 = -view.getScrollY();
            p188x0.E.d(fArr2);
            p188x0.E.f(fArr2, f9, f10);
            R0.L.p(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            p188x0.E.d(fArr2);
            p188x0.E.f(fArr2, left, top);
            R0.L.p(fArr, fArr2);
        } else {
            int[] iArr = this.f8924a;
            view.getLocationInWindow(iArr);
            float f11 = -view.getScrollX();
            float f12 = -view.getScrollY();
            p188x0.E.d(fArr2);
            p188x0.E.f(fArr2, f11, f12);
            R0.L.p(fArr, fArr2);
            float f13 = iArr[0];
            float f14 = iArr[1];
            p188x0.E.d(fArr2);
            p188x0.E.f(fArr2, f13, f14);
            R0.L.p(fArr, fArr2);
        }
        android.graphics.Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        p188x0.z.C(matrix, fArr2);
        R0.L.p(fArr, fArr2);
    }

    public C0828i0(int i3, int i9) {
        this.f8924a = new int[]{i3, i9};
        this.f8925b = new float[]{0.0f, 1.0f};
    }

    public C0828i0(int i3, int i9, int i10) {
        this.f8924a = new int[]{i3, i9, i10};
        this.f8925b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0828i0(float[] fArr) {
        this.f8925b = fArr;
        this.f8924a = new int[2];
    }
}
