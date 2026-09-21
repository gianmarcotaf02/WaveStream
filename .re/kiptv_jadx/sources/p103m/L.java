package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class L extends p103m.B0 implements p103m.N {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public java.lang.CharSequence f24937I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public p103m.I f24938J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final android.graphics.Rect f24939K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f24940L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final /* synthetic */ p103m.O f24941M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(p103m.O o8, android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.kiptv.tv.R.attr.spinnerStyle);
        this.f24941M = o8;
        this.f24939K = new android.graphics.Rect();
        this.f24898v = o8;
        this.f24883E = true;
        this.f24884F.setFocusable(true);
        this.f24899w = new p103m.J(this);
    }

    @Override // p103m.N
    public final java.lang.CharSequence d() {
        return this.f24937I;
    }

    @Override // p103m.N
    public final void i(java.lang.CharSequence charSequence) {
        this.f24937I = charSequence;
    }

    @Override // p103m.N
    public final void l(int i3) {
        this.f24940L = i3;
    }

    @Override // p103m.N
    public final void m(int i3, int i9) {
        android.view.ViewTreeObserver viewTreeObserver;
        p103m.C2599y c2599y = this.f24884F;
        boolean zIsShowing = c2599y.isShowing();
        r();
        this.f24884F.setInputMethodMode(2);
        e();
        p103m.C2581o0 c2581o0 = this.j;
        c2581o0.setChoiceMode(1);
        c2581o0.setTextDirection(i3);
        c2581o0.setTextAlignment(i9);
        p103m.O o8 = this.f24941M;
        int selectedItemPosition = o8.getSelectedItemPosition();
        p103m.C2581o0 c2581o1 = this.j;
        if (c2599y.isShowing() && c2581o1 != null) {
            c2581o1.setListSelectionHidden(false);
            c2581o1.setSelection(selectedItemPosition);
            if (c2581o1.getChoiceMode() != 0) {
                c2581o1.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = o8.getViewTreeObserver()) == null) {
            return;
        }
        p095l.ViewTreeObserverOnGlobalLayoutListenerC2547d viewTreeObserverOnGlobalLayoutListenerC2547d = new p095l.ViewTreeObserverOnGlobalLayoutListenerC2547d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2547d);
        this.f24884F.setOnDismissListener(new p103m.K(this, viewTreeObserverOnGlobalLayoutListenerC2547d));
    }

    @Override // p103m.B0, p103m.N
    public final void o(android.widget.ListAdapter listAdapter) {
        super.o(listAdapter);
        this.f24938J = (p103m.I) listAdapter;
    }

    public final void r() {
        int i3;
        p103m.C2599y c2599y = this.f24884F;
        android.graphics.drawable.Drawable background = c2599y.getBackground();
        p103m.O o8 = this.f24941M;
        if (background != null) {
            background.getPadding(o8.f24956o);
            boolean z6 = p103m.g1.f25041a;
            int layoutDirection = o8.getLayoutDirection();
            android.graphics.Rect rect = o8.f24956o;
            i3 = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            android.graphics.Rect rect2 = o8.f24956o;
            rect2.right = 0;
            rect2.left = 0;
            i3 = 0;
        }
        int paddingLeft = o8.getPaddingLeft();
        int paddingRight = o8.getPaddingRight();
        int width = o8.getWidth();
        int i9 = o8.f24955n;
        if (i9 == -2) {
            int iA = o8.a(this.f24938J, c2599y.getBackground());
            int i10 = o8.getContext().getResources().getDisplayMetrics().widthPixels;
            android.graphics.Rect rect3 = o8.f24956o;
            int i11 = (i10 - rect3.left) - rect3.right;
            if (iA > i11) {
                iA = i11;
            }
            q(java.lang.Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i9 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i9);
        }
        boolean z9 = p103m.g1.f25041a;
        this.f24889m = o8.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f24888l) - this.f24940L) + i3 : paddingLeft + this.f24940L + i3;
    }
}
