package D1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

public final class K implements View.OnApplyWindowInsetsListener {

    public E0 f1973a = null;

    public final View f1974b;

    public final InterfaceC0233s f1975c;

    public K(View view, InterfaceC0233s interfaceC0233s) {
        this.f1974b = view;
        this.f1975c = interfaceC0233s;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        E0 e0C = E0.c(view, windowInsets);
        int i3 = Build.VERSION.SDK_INT;
        InterfaceC0233s interfaceC0233s = this.f1975c;
        if (i3 < 30) {
            L.a(windowInsets, this.f1974b);
            if (e0C.equals(this.f1973a)) {
                return interfaceC0233s.z(view, e0C).b();
            }
        }
        this.f1973a = e0C;
        E0 e0Z = interfaceC0233s.z(view, e0C);
        if (i3 >= 30) {
            return e0Z.b();
        }
        WeakHashMap weakHashMap = U.f1980a;
        J.c(view);
        return e0Z.b();
    }
}
