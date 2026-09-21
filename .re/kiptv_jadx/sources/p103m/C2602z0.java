package p103m;

/* JADX INFO: renamed from: m.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2602z0 implements android.widget.AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p103m.B0 f25155a;

    public C2602z0(p103m.B0 b9) {
        this.f25155a = b9;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(android.widget.AbsListView absListView, int i3) {
        if (i3 == 1) {
            p103m.B0 b9 = this.f25155a;
            if (b9.f24884F.getInputMethodMode() == 2 || b9.f24884F.getContentView() == null) {
                return;
            }
            android.os.Handler handler = b9.f24880B;
            p103m.RunnableC2598x0 runnableC2598x0 = b9.f24900x;
            handler.removeCallbacks(runnableC2598x0);
            runnableC2598x0.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(android.widget.AbsListView absListView, int i3, int i9, int i10) {
    }
}
