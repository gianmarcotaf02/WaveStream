package D1;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.kiptv.tv.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class C0213b {
    public static final View.AccessibilityDelegate j = new View.AccessibilityDelegate();

    public final View.AccessibilityDelegate f1995h;

    public final C0211a f1996i;

    public C0213b() {
        this(j);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1995h.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public A.a b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f1995h.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new A.a(7, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f1995h.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, E1.f fVar) {
        this.f1995h.onInitializeAccessibilityNodeInfo(view, fVar.f2755a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f1995h.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1995h.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i3, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i9 = 0; i9 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((E1.d) list.get(i9)).f2752a).getId() != i3; i9++) {
        }
        boolean zPerformAccessibilityAction = this.f1995h.performAccessibilityAction(view, i3, bundle);
        if (zPerformAccessibilityAction || i3 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i10 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i10)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i11 = 0; clickableSpanArr != null && i11 < clickableSpanArr.length; i11++) {
                if (clickableSpan.equals(clickableSpanArr[i11])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    public void h(View view, int i3) {
        this.f1995h.sendAccessibilityEvent(view, i3);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f1995h.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0213b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1995h = accessibilityDelegate;
        this.f1996i = new C0211a(this);
    }
}
