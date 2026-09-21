package D1;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {
    public static void a(android.view.WindowInsets windowInsets, android.view.View view) {
        android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (android.view.View.OnApplyWindowInsetsListener) view.getTag(com.kiptv.tv.R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static D1.E0 b(android.view.View view, D1.E0 e6, android.graphics.Rect rect) {
        android.view.WindowInsets windowInsetsB = e6.b();
        if (windowInsetsB != null) {
            return D1.E0.c(view, view.computeSystemWindowInsets(windowInsetsB, rect));
        }
        rect.setEmpty();
        return e6;
    }

    public static android.content.res.ColorStateList c(android.view.View view) {
        return view.getBackgroundTintList();
    }

    public static android.graphics.PorterDuff.Mode d(android.view.View view) {
        return view.getBackgroundTintMode();
    }

    public static void e(android.view.View view, android.content.res.ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void f(android.view.View view, android.graphics.PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void g(android.view.View view, float f9) {
        view.setElevation(f9);
    }

    public static void h(android.view.View view, D1.InterfaceC0233s interfaceC0233s) {
        D1.K k9 = interfaceC0233s != null ? new D1.K(view, interfaceC0233s) : null;
        if (android.os.Build.VERSION.SDK_INT < 30) {
            view.setTag(com.kiptv.tv.R.id.tag_on_apply_window_listener, k9);
        }
        if (view.getTag(com.kiptv.tv.R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (k9 != null) {
            view.setOnApplyWindowInsetsListener(k9);
        } else {
            view.setOnApplyWindowInsetsListener((android.view.View.OnApplyWindowInsetsListener) view.getTag(com.kiptv.tv.R.id.tag_window_insets_animation_callback));
        }
    }

    public static void i(android.view.View view) {
        view.stopNestedScroll();
    }
}
