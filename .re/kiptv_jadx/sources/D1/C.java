package D1;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {
    public static android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction a() {
        return android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float b(android.view.VelocityTracker velocityTracker, int i3) {
        return velocityTracker.getAxisVelocity(i3);
    }

    public static void c(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.graphics.Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static java.lang.CharSequence d(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int e(android.view.ViewConfiguration viewConfiguration, int i3, int i9, int i10) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i3, i9, i10);
    }

    public static int f(android.view.ViewConfiguration viewConfiguration, int i3, int i9, int i10) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i3, i9, i10);
    }

    public static boolean g(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean h(android.view.accessibility.AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static float i(android.window.BackEvent backEvent) {
        return backEvent.getProgress();
    }

    public static void j(android.view.accessibility.AccessibilityEvent accessibilityEvent, boolean z6) {
        accessibilityEvent.setAccessibilityDataSensitive(z6);
    }

    public static void k(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, boolean z6) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z6);
    }

    public static void l(android.widget.TextView textView, int i3, float f9) {
        textView.setLineHeight(i3, f9);
    }

    public static int m(android.window.BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public static float n(android.window.BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static float o(android.window.BackEvent backEvent) {
        return backEvent.getTouchY();
    }
}
