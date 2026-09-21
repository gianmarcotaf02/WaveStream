package B0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends android.view.ViewGroup {
    public final void a(p188x0.InterfaceC3097q interfaceC3097q, android.view.View view, long j) {
        super.drawChild(p188x0.AbstractC3083c.a(interfaceC3097q), view, j);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        return null;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i9) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
    }
}
