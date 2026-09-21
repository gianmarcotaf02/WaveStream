package H1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends D1.C0213b {
    @Override // D1.C0213b
    public final void c(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
        accessibilityEvent.setClassName(android.widget.ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override // D1.C0213b
    public final void d(android.view.View view, E1.f fVar) {
        int scrollRange;
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f1995h;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = fVar.f2755a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
        fVar.h("android.widget.ScrollView");
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        accessibilityNodeInfo.setScrollable(true);
        if (nestedScrollView.getScrollY() > 0) {
            fVar.b(E1.d.f2749f);
            fVar.b(E1.d.g);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            fVar.b(E1.d.f2748e);
            fVar.b(E1.d.f2751i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    @Override // D1.C0213b
    public final boolean g(android.view.View view, int i3, android.os.Bundle bundle) {
        int iMin;
        if (super.g(view, i3, bundle)) {
            return true;
        }
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
        if (nestedScrollView.isEnabled()) {
            int height = nestedScrollView.getHeight();
            android.graphics.Rect rect = new android.graphics.Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i3 == 4096) {
                iMin = java.lang.Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (iMin != nestedScrollView.getScrollY()) {
                    nestedScrollView.v(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                    return true;
                }
            } else if (i3 == 8192 || i3 == 16908344) {
                int iMax = java.lang.Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (iMax != nestedScrollView.getScrollY()) {
                    nestedScrollView.v(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                    return true;
                }
            } else if (i3 == 16908346) {
                iMin = java.lang.Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (iMin != nestedScrollView.getScrollY()) {
                    nestedScrollView.v(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                    return true;
                }
            }
        }
        return false;
    }
}
