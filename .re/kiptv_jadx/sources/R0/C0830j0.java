package R0;

/* JADX INFO: renamed from: R0.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0830j0 implements R0.InterfaceC0826h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.Matrix f8928a = new android.graphics.Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f8929b = new int[2];

    @Override // R0.InterfaceC0826h0
    public void a(android.view.View view, float[] fArr) {
        android.graphics.Matrix matrix = this.f8928a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        android.view.ViewParent parent = view.getParent();
        while (parent instanceof android.view.View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f8929b;
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i9 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i3, iArr[1] - i9);
        p188x0.z.C(matrix, fArr);
    }
}
