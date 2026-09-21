package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements android.view.View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17165b;

    public /* synthetic */ h(int i3, java.lang.Object obj) {
        this.f17164a = i3;
        this.f17165b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i3, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        switch (this.f17164a) {
            case 0:
                ((androidx.media3.ui.PlayerControlViewLayoutManager) this.f17165b).onLayoutChange(view, i3, i9, i10, i11, i12, i13, i14, i15);
                break;
            default:
                ((androidx.media3.ui.PlayerControlView) this.f17165b).onLayoutChange(view, i3, i9, i10, i11, i12, i13, i14, i15);
                break;
        }
    }
}
