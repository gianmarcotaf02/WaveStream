package F0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements F0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.view.View f3510b;

    public /* synthetic */ b(android.view.View view, int i3) {
        this.f3509a = i3;
        this.f3510b = view;
    }

    @Override // F0.a
    public final void a() {
        switch (this.f3509a) {
            case 0:
                D1.U.g(9, (androidx.compose.ui.platform.AndroidComposeView) this.f3510b);
                break;
            default:
                D1.U.g(9, this.f3510b);
                break;
        }
    }
}
