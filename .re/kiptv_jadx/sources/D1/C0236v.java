package D1;

/* JADX INFO: renamed from: D1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0236v implements D1.InterfaceC0237w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.view.ScrollFeedbackProvider f2069h;

    public C0236v(androidx.core.widget.NestedScrollView nestedScrollView) {
        this.f2069h = android.view.ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // D1.InterfaceC0237w
    public final void a(boolean z6, int i3, int i9, int i10) {
        this.f2069h.onScrollLimit(i3, i9, i10, z6);
    }

    @Override // D1.InterfaceC0237w
    public final void b(int i3, int i9, int i10, int i11) {
        this.f2069h.onScrollProgress(i3, i9, i10, i11);
    }
}
