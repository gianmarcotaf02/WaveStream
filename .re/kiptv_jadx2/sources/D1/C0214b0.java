package D1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class C0214b0 extends AnimatorListenerAdapter {

    public final int f1997a;

    public final View f1998b;

    public final Object f1999c;

    public C0214b0(Object obj, View view, int i3) {
        this.f1997a = i3;
        this.f1999c = obj;
        this.f1998b = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f1997a) {
            case 0:
                ((InterfaceC0218d0) this.f1999c).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1997a) {
            case 0:
                ((InterfaceC0218d0) this.f1999c).c();
                break;
            default:
                m0 m0Var = (m0) this.f1999c;
                m0Var.f2041a.e(1.0f);
                i0.f(this.f1998b, m0Var);
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1997a) {
            case 0:
                ((InterfaceC0218d0) this.f1999c).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
