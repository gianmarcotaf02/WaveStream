package B0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import p188x0.AbstractC3083c;
import p188x0.InterfaceC3097q;

public abstract class a extends ViewGroup {
    public final void a(InterfaceC3097q interfaceC3097q, View view, long j) {
        super.drawChild(AbstractC3083c.a(interfaceC3097q), view, j);
    }

    @Override
    public int getChildCount() {
        return 0;
    }

    @Override
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override
    public final void onMeasure(int i3, int i9) {
        setMeasuredDimension(0, 0);
    }

    @Override
    public final void forceLayout() {
    }

    @Override
    public final void requestLayout() {
    }

    @Override
    public final void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
    }
}
