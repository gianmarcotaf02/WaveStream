package D1;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends D1.l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final android.view.animation.PathInterpolator f2028e = new android.view.animation.PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p012b2.a f2029f = new p012b2.a(p012b2.a.f17862c);
    public static final android.view.animation.DecelerateInterpolator g = new android.view.animation.DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final android.view.animation.AccelerateInterpolator f2030h = new android.view.animation.AccelerateInterpolator(1.5f);

    public static void f(android.view.View view, D1.m0 m0Var) {
        D1.AbstractC0220e0 abstractC0220e0K = k(view);
        if (abstractC0220e0K != null) {
            abstractC0220e0K.v0(m0Var);
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                f(viewGroup.getChildAt(i3), m0Var);
            }
        }
    }

    public static void g(android.view.View view, D1.m0 m0Var, D1.E0 e6, boolean z6) {
        D1.AbstractC0220e0 abstractC0220e0K = k(view);
        if (abstractC0220e0K != null) {
            abstractC0220e0K.f2006h = e6;
            if (!z6) {
                abstractC0220e0K.w0();
                z6 = false;
            }
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                g(viewGroup.getChildAt(i3), m0Var, e6, z6);
            }
        }
    }

    public static void h(android.view.View view, D1.E0 e6, java.util.List list) {
        D1.AbstractC0220e0 abstractC0220e0K = k(view);
        if (abstractC0220e0K != null) {
            e6 = abstractC0220e0K.x0(e6, list);
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                h(viewGroup.getChildAt(i3), e6, list);
            }
        }
    }

    public static void i(android.view.View view, D1.m0 m0Var, S.p pVar) {
        D1.AbstractC0220e0 abstractC0220e0K = k(view);
        if (abstractC0220e0K != null) {
            abstractC0220e0K.y0(m0Var, pVar);
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                i(viewGroup.getChildAt(i3), m0Var, pVar);
            }
        }
    }

    public static android.view.WindowInsets j(android.view.View view, android.view.WindowInsets windowInsets) {
        return view.getTag(com.kiptv.tv.R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static D1.AbstractC0220e0 k(android.view.View view) {
        java.lang.Object tag = view.getTag(com.kiptv.tv.R.id.tag_window_insets_animation_callback);
        if (tag instanceof D1.h0) {
            return ((D1.h0) tag).f2019a;
        }
        return null;
    }
}
