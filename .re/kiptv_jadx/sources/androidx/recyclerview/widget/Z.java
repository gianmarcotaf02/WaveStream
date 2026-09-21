package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends D1.C0213b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f17364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.recyclerview.widget.Y f17365l;

    public Z(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f17364k = recyclerView;
        androidx.recyclerview.widget.Y y = this.f17365l;
        if (y != null) {
            this.f17365l = y;
        } else {
            this.f17365l = new androidx.recyclerview.widget.Y(this);
        }
    }

    @Override // D1.C0213b
    public final void c(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof androidx.recyclerview.widget.RecyclerView) || this.f17364k.I()) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().O(accessibilityEvent);
        }
    }

    @Override // D1.C0213b
    public final void d(android.view.View view, E1.f fVar) {
        this.f1995h.onInitializeAccessibilityNodeInfo(view, fVar.f2755a);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17364k;
        if (recyclerView.I() || recyclerView.getLayoutManager() == null) {
            return;
        }
        androidx.recyclerview.widget.I layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.RecyclerView recyclerView2 = layoutManager.f17206b;
        layoutManager.P(recyclerView2.j, recyclerView2.f17299m0, fVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[PHI: r7
  0x0079: PHI (r7v8 int) = (r7v4 int), (r7v13 int) binds: [B:32:0x0096, B:24:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // D1.C0213b
    public final boolean g(android.view.View view, int i3, android.os.Bundle bundle) {
        int iB;
        int iZ;
        if (super.g(view, i3, bundle)) {
            return true;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17364k;
        if (!recyclerView.I() && recyclerView.getLayoutManager() != null) {
            androidx.recyclerview.widget.I layoutManager = recyclerView.getLayoutManager();
            androidx.recyclerview.widget.O o8 = layoutManager.f17206b.j;
            int iHeight = layoutManager.f17216n;
            int iWidth = layoutManager.f17215m;
            android.graphics.Rect rect = new android.graphics.Rect();
            if (layoutManager.f17206b.getMatrix().isIdentity() && layoutManager.f17206b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i3 == 4096) {
                iB = layoutManager.f17206b.canScrollVertically(1) ? (iHeight - layoutManager.B()) - layoutManager.y() : 0;
                if (layoutManager.f17206b.canScrollHorizontally(1)) {
                    iZ = (iWidth - layoutManager.z()) - layoutManager.A();
                } else {
                    iZ = 0;
                }
            } else if (i3 != 8192) {
                iB = 0;
                iZ = 0;
            } else {
                iB = layoutManager.f17206b.canScrollVertically(-1) ? -((iHeight - layoutManager.B()) - layoutManager.y()) : 0;
                if (layoutManager.f17206b.canScrollHorizontally(-1)) {
                    iZ = -((iWidth - layoutManager.z()) - layoutManager.A());
                } else {
                    iZ = 0;
                }
            }
            if (iB != 0 || iZ != 0) {
                layoutManager.f17206b.a0(iZ, iB, true);
                return true;
            }
        }
        return false;
    }
}
