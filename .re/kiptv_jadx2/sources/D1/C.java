package D1;

import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import android.window.BackEvent;

public abstract class C {
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float b(VelocityTracker velocityTracker, int i3) {
        return velocityTracker.getAxisVelocity(i3);
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int e(ViewConfiguration viewConfiguration, int i3, int i9, int i10) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i3, i9, i10);
    }

    public static int f(ViewConfiguration viewConfiguration, int i3, int i9, int i10) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i3, i9, i10);
    }

    public static boolean g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean h(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static float i(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    public static void j(AccessibilityEvent accessibilityEvent, boolean z6) {
        accessibilityEvent.setAccessibilityDataSensitive(z6);
    }

    public static void k(AccessibilityNodeInfo accessibilityNodeInfo, boolean z6) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z6);
    }

    public static void l(TextView textView, int i3, float f9) {
        textView.setLineHeight(i3, f9);
    }

    public static int m(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public static float n(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static float o(BackEvent backEvent) {
        return backEvent.getTouchY();
    }
}
