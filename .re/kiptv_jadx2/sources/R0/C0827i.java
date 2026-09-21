package R0;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

public final class C0827i implements InterfaceC0825h {

    public final AccessibilityManager f8923a;

    public C0827i(Context context) {
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f8923a = (AccessibilityManager) systemService;
    }
}
