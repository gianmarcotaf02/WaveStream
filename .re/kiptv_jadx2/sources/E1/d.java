package E1;

import D1.C;
import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

public final class d {

    public static final d f2746c;

    public static final d f2747d;

    public static final d f2748e;

    public static final d f2749f;
    public static final d g;

    public static final d f2750h;

    public static final d f2751i;
    public static final d j;

    public final Object f2752a;

    public final int f2753b;

    static {
        new d(null, 1, null, null);
        new d(null, 2, null, null);
        new d(null, 4, null, null);
        new d(null, 8, null, null);
        new d(null, 16, null, null);
        new d(null, 32, null, null);
        f2746c = new d(null, 64, null, null);
        f2747d = new d(null, 128, null, null);
        new d(null, 256, null, i.class);
        new d(null, 512, null, i.class);
        new d(null, 1024, null, j.class);
        new d(null, 2048, null, j.class);
        f2748e = new d(null, 4096, null, null);
        f2749f = new d(null, 8192, null, null);
        new d(null, 16384, null, null);
        new d(null, 32768, null, null);
        new d(null, 65536, null, null);
        new d(null, 131072, null, n.class);
        new d(null, 262144, null, null);
        new d(null, 524288, null, null);
        new d(null, 1048576, null, null);
        new d(null, 2097152, null, o.class);
        int i3 = Build.VERSION.SDK_INT;
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, l.class);
        g = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        f2750h = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        f2751i = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        j = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        new d(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null);
        new d(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null);
        new d(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null);
        new d(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, m.class);
        new d(i3 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, k.class);
        new d(i3 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null);
        new d(i3 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null);
        new d(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null);
        new d(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null);
        new d(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null);
        new d(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null);
        new d(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null);
        new d(i3 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null);
        new d(i3 >= 34 ? C.a() : null, R.id.accessibilityActionScrollInDirection, null, null);
    }

    public d(int i3, String str) {
        this(null, i3, str, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f2752a;
        Object obj3 = this.f2752a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f2752a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strD = f.d(this.f2753b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.f2752a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strD);
        return sb.toString();
    }

    public d(Object obj, int i3, String str, Class cls) {
        this.f2753b = i3;
        if (obj == null) {
            this.f2752a = new AccessibilityNodeInfo.AccessibilityAction(i3, str);
        } else {
            this.f2752a = obj;
        }
    }
}
