package R0;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R0.J f8790a = new R0.J();

    public final void a(android.view.View view, K0.InterfaceC0672u interfaceC0672u) {
        android.content.Context context = view.getContext();
        android.view.PointerIcon systemIcon = interfaceC0672u instanceof K0.C0653a ? android.view.PointerIcon.getSystemIcon(context, ((K0.C0653a) interfaceC0672u).f6686b) : android.view.PointerIcon.getSystemIcon(context, 1000);
        if (kotlin.jvm.internal.m.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
