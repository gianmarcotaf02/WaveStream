package R0;

/* JADX INFO: renamed from: R0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0829j implements R0.InterfaceC0834l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R0.C0831k f8927a;

    public C0829j(R0.C0831k c0831k) {
        this.f8927a = c0831k;
    }

    public final void a(R0.C0832k0 c0832k0) {
        android.content.ClipboardManager clipboardManager = this.f8927a.f8931a;
        if (c0832k0 != null) {
            clipboardManager.setPrimaryClip(c0832k0.f8932a);
        } else if (android.os.Build.VERSION.SDK_INT >= 28) {
            clipboardManager.clearPrimaryClip();
        } else {
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText("", ""));
        }
    }
}
