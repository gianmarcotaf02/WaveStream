package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class C1623e extends AnimatorListenerAdapter {

    public final int f17394a;

    public final C1624f f17395b;

    public final ViewPropertyAnimator f17396c;

    public final View f17397d;

    public final C1626h f17398e;

    public C1623e(C1626h c1626h, C1624f c1624f, ViewPropertyAnimator viewPropertyAnimator, View view, int i3) {
        this.f17394a = i3;
        this.f17398e = c1626h;
        this.f17395b = c1624f;
        this.f17396c = viewPropertyAnimator;
        this.f17397d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f17394a) {
            case 0:
                this.f17396c.setListener(null);
                View view = this.f17397d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C1624f c1624f = this.f17395b;
                X x9 = c1624f.f17408a;
                C1626h c1626h = this.f17398e;
                c1626h.c(x9);
                c1626h.f17440r.remove(c1624f.f17408a);
                c1626h.i();
                break;
            default:
                this.f17396c.setListener(null);
                View view2 = this.f17397d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C1624f c1624f2 = this.f17395b;
                X x10 = c1624f2.f17409b;
                C1626h c1626h2 = this.f17398e;
                c1626h2.c(x10);
                c1626h2.f17440r.remove(c1624f2.f17409b);
                c1626h2.i();
                break;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f17394a) {
            case 0:
                X x9 = this.f17395b.f17408a;
                this.f17398e.getClass();
                break;
            default:
                X x10 = this.f17395b.f17409b;
                this.f17398e.getClass();
                break;
        }
    }
}
