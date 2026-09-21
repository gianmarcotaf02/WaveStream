package R0;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;

public final class C0829j implements InterfaceC0834l0 {

    public final C0831k f8927a;

    public C0829j(C0831k c0831k) {
        this.f8927a = c0831k;
    }

    public final void a(C0832k0 c0832k0) {
        ClipboardManager clipboardManager = this.f8927a.f8931a;
        if (c0832k0 != null) {
            clipboardManager.setPrimaryClip(c0832k0.f8932a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            clipboardManager.clearPrimaryClip();
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
