package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class A0 implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p103m.B0 f24876h;

    public A0(p103m.B0 b9) {
        this.f24876h = b9;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        p103m.C2599y c2599y;
        int action = motionEvent.getAction();
        int x9 = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        p103m.B0 b9 = this.f24876h;
        if (action == 0 && (c2599y = b9.f24884F) != null && c2599y.isShowing() && x9 >= 0 && x9 < b9.f24884F.getWidth() && y >= 0 && y < b9.f24884F.getHeight()) {
            b9.f24880B.postDelayed(b9.f24900x, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        b9.f24880B.removeCallbacks(b9.f24900x);
        return false;
    }
}
