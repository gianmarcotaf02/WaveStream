package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class C1622d extends AnimatorListenerAdapter {

    public final X f17387a;

    public final int f17388b;

    public final View f17389c;

    public final int f17390d;

    public final ViewPropertyAnimator f17391e;

    public final C1626h f17392f;

    public C1622d(C1626h c1626h, X x9, int i3, View view, int i9, ViewPropertyAnimator viewPropertyAnimator) {
        this.f17392f = c1626h;
        this.f17387a = x9;
        this.f17388b = i3;
        this.f17389c = view;
        this.f17390d = i9;
        this.f17391e = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        int i3 = this.f17388b;
        View view = this.f17389c;
        if (i3 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f17390d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f17391e.setListener(null);
        C1626h c1626h = this.f17392f;
        X x9 = this.f17387a;
        c1626h.c(x9);
        c1626h.f17438p.remove(x9);
        c1626h.i();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.f17392f.getClass();
    }
}
