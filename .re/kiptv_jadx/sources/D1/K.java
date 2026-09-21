package D1;

/* JADX INFO: loaded from: classes.dex */
public final class K implements android.view.View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D1.E0 f1973a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f1974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D1.InterfaceC0233s f1975c;

    public K(android.view.View view, D1.InterfaceC0233s interfaceC0233s) {
        this.f1974b = view;
        this.f1975c = interfaceC0233s;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        D1.E0 e0C = D1.E0.c(view, windowInsets);
        int i3 = android.os.Build.VERSION.SDK_INT;
        D1.InterfaceC0233s interfaceC0233s = this.f1975c;
        if (i3 < 30) {
            D1.L.a(windowInsets, this.f1974b);
            if (e0C.equals(this.f1973a)) {
                return interfaceC0233s.z(view, e0C).b();
            }
        }
        this.f1973a = e0C;
        D1.E0 e0Z = interfaceC0233s.z(view, e0C);
        if (i3 >= 30) {
            return e0Z.b();
        }
        java.util.WeakHashMap weakHashMap = D1.U.f1980a;
        D1.J.c(view);
        return e0Z.b();
    }
}
