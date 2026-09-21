package R0;

import android.content.ClipboardManager;
import android.content.Context;

public final class C0831k implements InterfaceC0836m0 {

    public final ClipboardManager f8931a;

    public C0831k(Context context) {
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f8931a = (ClipboardManager) systemService;
    }
}
