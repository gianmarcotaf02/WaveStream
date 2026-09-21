package p103m;

import android.os.Handler;
import android.widget.AbsListView;

public final class C2602z0 implements AbsListView.OnScrollListener {

    public final B0 f25155a;

    public C2602z0(B0 b9) {
        this.f25155a = b9;
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i3) {
        if (i3 == 1) {
            B0 b9 = this.f25155a;
            if (b9.f24884F.getInputMethodMode() == 2 || b9.f24884F.getContentView() == null) {
                return;
            }
            Handler handler = b9.f24880B;
            RunnableC2598x0 runnableC2598x0 = b9.f24900x;
            handler.removeCallbacks(runnableC2598x0);
            runnableC2598x0.run();
        }
    }

    @Override
    public final void onScroll(AbsListView absListView, int i3, int i9, int i10) {
    }
}
