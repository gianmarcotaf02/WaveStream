package p103m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;

public final class C2552a extends AnimatorListenerAdapter {

    public final ActionBarOverlayLayout f25002a;

    public C2552a(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f25002a = actionBarOverlayLayout;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f25002a;
        actionBarOverlayLayout.f15694D = null;
        actionBarOverlayLayout.f15707q = false;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f25002a;
        actionBarOverlayLayout.f15694D = null;
        actionBarOverlayLayout.f15707q = false;
    }
}
