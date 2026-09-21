package D1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

public final class f0 implements ValueAnimator.AnimatorUpdateListener {

    public final m0 f2007a;

    public final E0 f2008b;

    public final E0 f2009c;

    public final int f2010d;

    public final View f2011e;

    public f0(m0 m0Var, E0 e6, E0 e9, int i3, View view) {
        this.f2007a = m0Var;
        this.f2008b = e6;
        this.f2009c = e9;
        this.f2010d = i3;
        this.f2011e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        s0 p0Var;
        int i3;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        m0 m0Var = this.f2007a;
        m0Var.f2041a.e(animatedFraction);
        float fC = m0Var.f2041a.c();
        PathInterpolator pathInterpolator = i0.f2028e;
        int i9 = Build.VERSION.SDK_INT;
        E0 e6 = this.f2008b;
        if (i9 >= 34) {
            p0Var = new r0(e6);
        } else if (i9 >= 30) {
            p0Var = new q0(e6);
        } else {
            p0Var = i9 >= 29 ? new p0(e6) : new n0(e6);
        }
        int i10 = 1;
        while (i10 <= 512) {
            int i11 = this.f2010d & i10;
            z0 z0Var = e6.f1967a;
            if (i11 == 0) {
                p0Var.c(i10, z0Var.g(i10));
                i3 = 1;
            } else {
                p182w1.b bVarG = z0Var.g(i10);
                p182w1.b bVarG2 = this.f2009c.f1967a.g(i10);
                float f9 = 1.0f - fC;
                i3 = 1;
                p0Var.c(i10, E0.a(bVarG, (int) (((double) ((bVarG.f29760a - bVarG2.f29760a) * f9)) + 0.5d), (int) (((double) ((bVarG.f29761b - bVarG2.f29761b) * f9)) + 0.5d), (int) (((double) ((bVarG.f29762c - bVarG2.f29762c) * f9)) + 0.5d), (int) (((double) ((bVarG.f29763d - bVarG2.f29763d) * f9)) + 0.5d)));
            }
            i10 <<= i3;
            fC = fC;
        }
        i0.h(this.f2011e, p0Var.b(), Collections.singletonList(m0Var));
    }
}
