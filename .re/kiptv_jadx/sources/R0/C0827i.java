package R0;

/* JADX INFO: renamed from: R0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0827i implements R0.InterfaceC0825h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.accessibility.AccessibilityManager f8923a;

    public C0827i(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f8923a = (android.view.accessibility.AccessibilityManager) systemService;
    }
}
