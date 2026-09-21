package p103m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.kiptv.tv.R;
import p095l.ViewTreeObserverOnGlobalLayoutListenerC2547d;

public final class L extends B0 implements N {

    public CharSequence f24937I;

    public I f24938J;

    public final Rect f24939K;

    public int f24940L;

    public final O f24941M;

    public L(O o8, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f24941M = o8;
        this.f24939K = new Rect();
        this.f24898v = o8;
        this.f24883E = true;
        this.f24884F.setFocusable(true);
        this.f24899w = new J(this);
    }

    @Override
    public final CharSequence d() {
        return this.f24937I;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.f24937I = charSequence;
    }

    @Override
    public final void l(int i3) {
        this.f24940L = i3;
    }

    @Override
    public final void m(int i3, int i9) {
        ViewTreeObserver viewTreeObserver;
        C2599y c2599y = this.f24884F;
        boolean zIsShowing = c2599y.isShowing();
        r();
        this.f24884F.setInputMethodMode(2);
        e();
        C2581o0 c2581o0 = this.j;
        c2581o0.setChoiceMode(1);
        c2581o0.setTextDirection(i3);
        c2581o0.setTextAlignment(i9);
        O o8 = this.f24941M;
        int selectedItemPosition = o8.getSelectedItemPosition();
        C2581o0 c2581o1 = this.j;
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
        ViewTreeObserverOnGlobalLayoutListenerC2547d viewTreeObserverOnGlobalLayoutListenerC2547d = new ViewTreeObserverOnGlobalLayoutListenerC2547d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2547d);
        this.f24884F.setOnDismissListener(new K(this, viewTreeObserverOnGlobalLayoutListenerC2547d));
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.f24938J = (I) listAdapter;
    }

    public final void r() {
        int i3;
        C2599y c2599y = this.f24884F;
        Drawable background = c2599y.getBackground();
        O o8 = this.f24941M;
        if (background != null) {
            background.getPadding(o8.f24956o);
            boolean z6 = g1.f25041a;
            int layoutDirection = o8.getLayoutDirection();
            Rect rect = o8.f24956o;
            i3 = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = o8.f24956o;
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
            Rect rect3 = o8.f24956o;
            int i11 = (i10 - rect3.left) - rect3.right;
            if (iA > i11) {
                iA = i11;
            }
            q(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i9 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i9);
        }
        boolean z9 = g1.f25041a;
        this.f24889m = o8.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f24888l) - this.f24940L) + i3 : paddingLeft + this.f24940L + i3;
    }
}
