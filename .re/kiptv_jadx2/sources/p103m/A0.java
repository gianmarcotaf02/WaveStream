package p103m;

import android.view.MotionEvent;
import android.view.View;

public final class A0 implements View.OnTouchListener {

    public final B0 f24876h;

    public A0(B0 b9) {
        this.f24876h = b9;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C2599y c2599y;
        int action = motionEvent.getAction();
        int x9 = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        B0 b9 = this.f24876h;
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
