package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends D1.C0213b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.recyclerview.widget.Z f17362k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.WeakHashMap f17363l = new java.util.WeakHashMap();

    public Y(androidx.recyclerview.widget.Z z6) {
        this.f17362k = z6;
    }

    @Override // D1.C0213b
    public final boolean a(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        D1.C0213b c0213b = (D1.C0213b) this.f17363l.get(view);
        return c0213b != null ? c0213b.a(view, accessibilityEvent) : this.f1995h.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // D1.C0213b
    public final A.a b(android.view.View view) {
        D1.C0213b c0213b = (D1.C0213b) this.f17363l.get(view);
        return c0213b != null ? c0213b.b(view) : super.b(view);
    }

    @Override // D1.C0213b
    public final void c(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        D1.C0213b c0213b = (D1.C0213b) this.f17363l.get(view);
        if (c0213b != null) {
            c0213b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // D1.C0213b
    public final void d(android.view.View view, E1.f fVar) {
        androidx.recyclerview.widget.Z z6 = this.f17362k;
        boolean zI = z6.f17364k.I();
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f1995h;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = fVar.f2755a;
        if (!zI) {
            androidx.recyclerview.widget.RecyclerView recyclerView = z6.f17364k;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().Q(view, fVar);
                D1.C0213b c0213b = (D1.C0213b) this.f17363l.get(view);
                if (c0213b != null) {
                    c0213b.d(view, fVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // D1.C0213b
    public final void e(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        D1.C0213b c0213b = (D1.C0213b) this.f17363l.get(view);
        if (c0213b != null) {
            c0213b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // D1.C0213b
    public final boolean f(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        D1.C0213b c0213b = (D1.C0213b) this.f17363l.get(viewGroup);
        return c0213b != null ? c0213b.f(viewGroup, view, accessibilityEvent) : this.f1995h.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // D1.C0213b
    public final boolean g(android.view.View view, int i3, android.os.Bundle bundle) {
        androidx.recyclerview.widget.Z z6 = this.f17362k;
        if (!z6.f17364k.I()) {
            androidx.recyclerview.widget.RecyclerView recyclerView = z6.f17364k;
            if (recyclerView.getLayoutManager() != null) {
                D1.C0213b c0213b = (D1.C0213b) this.f17363l.get(view);
                if (c0213b != null) {
                    if (c0213b.g(view, i3, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i3, bundle)) {
                    return true;
                }
                androidx.recyclerview.widget.O o8 = recyclerView.getLayoutManager().f17206b.j;
                return false;
            }
        }
        return super.g(view, i3, bundle);
    }

    @Override // D1.C0213b
    public final void h(android.view.View view, int i3) {
        D1.C0213b c0213b = (D1.C0213b) this.f17363l.get(view);
        if (c0213b != null) {
            c0213b.h(view, i3);
        } else {
            super.h(view, i3);
        }
    }

    @Override // D1.C0213b
    public final void i(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        D1.C0213b c0213b = (D1.C0213b) this.f17363l.get(view);
        if (c0213b != null) {
            c0213b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
