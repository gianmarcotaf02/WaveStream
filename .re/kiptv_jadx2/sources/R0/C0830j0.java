package R0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

public final class C0830j0 implements InterfaceC0826h0 {

    public final Matrix f8928a = new Matrix();

    public final int[] f8929b = new int[2];

    @Override
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f8928a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
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
