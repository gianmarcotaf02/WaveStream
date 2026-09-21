package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class C1621c extends AnimatorListenerAdapter {

    public final int f17379a = 1;

    public final X f17380b;

    public final View f17381c;

    public final ViewPropertyAnimator f17382d;

    public final C1626h f17383e;

    public C1621c(C1626h c1626h, X x9, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f17383e = c1626h;
        this.f17380b = x9;
        this.f17382d = viewPropertyAnimator;
        this.f17381c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f17379a) {
            case 1:
                this.f17381c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f17379a) {
            case 0:
                this.f17382d.setListener(null);
                this.f17381c.setAlpha(1.0f);
                C1626h c1626h = this.f17383e;
                X x9 = this.f17380b;
                c1626h.c(x9);
                c1626h.f17439q.remove(x9);
                c1626h.i();
                break;
            default:
                this.f17382d.setListener(null);
                C1626h c1626h2 = this.f17383e;
                X x10 = this.f17380b;
                c1626h2.c(x10);
                c1626h2.f17437o.remove(x10);
                c1626h2.i();
                break;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f17379a) {
            case 0:
                this.f17383e.getClass();
                break;
            default:
                this.f17383e.getClass();
                break;
        }
    }

    public C1621c(C1626h c1626h, X x9, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f17383e = c1626h;
        this.f17380b = x9;
        this.f17381c = view;
        this.f17382d = viewPropertyAnimator;
    }
}
