package R0;

/* JADX INFO: renamed from: R0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0831k implements R0.InterfaceC0836m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.ClipboardManager f8931a;

    public C0831k(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f8931a = (android.content.ClipboardManager) systemService;
    }
}
