package R0;

import K0.C0653a;
import K0.InterfaceC0672u;
import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

public final class J {

    public static final J f8790a = new J();

    public final void a(View view, InterfaceC0672u interfaceC0672u) {
        Context context = view.getContext();
        PointerIcon systemIcon = interfaceC0672u instanceof C0653a ? PointerIcon.getSystemIcon(context, ((C0653a) interfaceC0672u).f6686b) : PointerIcon.getSystemIcon(context, 1000);
        if (kotlin.jvm.internal.m.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
