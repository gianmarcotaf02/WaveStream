package D1;

/* JADX INFO: renamed from: D1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0213b {
    public static final android.view.View.AccessibilityDelegate j = new android.view.View.AccessibilityDelegate();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.view.View.AccessibilityDelegate f1995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final D1.C0211a f1996i;

    public C0213b() {
        this(j);
    }

    public boolean a(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f1995h.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public A.a b(android.view.View view) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider = this.f1995h.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new A.a(7, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f1995h.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(android.view.View view, E1.f fVar) {
        this.f1995h.onInitializeAccessibilityNodeInfo(view, fVar.f2755a);
    }

    public void e(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f1995h.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f1995h.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(android.view.View view, int i3, android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference;
        android.text.style.ClickableSpan clickableSpan;
        java.util.List list = (java.util.List) view.getTag(com.kiptv.tv.R.id.tag_accessibility_actions);
        if (list == null) {
            list = java.util.Collections.EMPTY_LIST;
        }
        for (int i9 = 0; i9 < list.size() && ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) ((E1.d) list.get(i9)).f2752a).getId() != i3; i9++) {
        }
        boolean zPerformAccessibilityAction = this.f1995h.performAccessibilityAction(view, i3, bundle);
        if (zPerformAccessibilityAction || i3 != com.kiptv.tv.R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i10 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        android.util.SparseArray sparseArray = (android.util.SparseArray) view.getTag(com.kiptv.tv.R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (java.lang.ref.WeakReference) sparseArray.get(i10)) != null && (clickableSpan = (android.text.style.ClickableSpan) weakReference.get()) != null) {
            java.lang.CharSequence text = view.createAccessibilityNodeInfo().getText();
            android.text.style.ClickableSpan[] clickableSpanArr = text instanceof android.text.Spanned ? (android.text.style.ClickableSpan[]) ((android.text.Spanned) text).getSpans(0, text.length(), android.text.style.ClickableSpan.class) : null;
            for (int i11 = 0; clickableSpanArr != null && i11 < clickableSpanArr.length; i11++) {
                if (clickableSpan.equals(clickableSpanArr[i11])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    public void h(android.view.View view, int i3) {
        this.f1995h.sendAccessibilityEvent(view, i3);
    }

    public void i(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f1995h.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0213b(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        this.f1995h = accessibilityDelegate;
        this.f1996i = new D1.C0211a(this);
    }
}
