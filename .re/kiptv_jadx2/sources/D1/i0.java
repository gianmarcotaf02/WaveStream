package D1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.kiptv.tv.R;
import java.util.List;

public final class i0 extends l0 {

    public static final PathInterpolator f2028e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    public static final p012b2.a f2029f = new p012b2.a(p012b2.a.f17862c);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);

    public static final AccelerateInterpolator f2030h = new AccelerateInterpolator(1.5f);

    public static void f(View view, m0 m0Var) {
        AbstractC0220e0 abstractC0220e0K = k(view);
        if (abstractC0220e0K != null) {
            abstractC0220e0K.v0(m0Var);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                f(viewGroup.getChildAt(i3), m0Var);
            }
        }
    }

    public static void g(View view, m0 m0Var, E0 e6, boolean z6) {
        AbstractC0220e0 abstractC0220e0K = k(view);
        if (abstractC0220e0K != null) {
            abstractC0220e0K.f2006h = e6;
            if (!z6) {
                abstractC0220e0K.w0();
                z6 = false;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                g(viewGroup.getChildAt(i3), m0Var, e6, z6);
            }
        }
    }

    public static void h(View view, E0 e6, List list) {
        AbstractC0220e0 abstractC0220e0K = k(view);
        if (abstractC0220e0K != null) {
            e6 = abstractC0220e0K.x0(e6, list);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                h(viewGroup.getChildAt(i3), e6, list);
            }
        }
    }

    public static void i(View view, m0 m0Var, S.p pVar) {
        AbstractC0220e0 abstractC0220e0K = k(view);
        if (abstractC0220e0K != null) {
            abstractC0220e0K.y0(m0Var, pVar);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                i(viewGroup.getChildAt(i3), m0Var, pVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static AbstractC0220e0 k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof h0) {
            return ((h0) tag).f2019a;
        }
        return null;
    }
}
