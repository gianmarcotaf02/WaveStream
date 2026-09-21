package p103m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

public final class RunnableC2585q0 implements Runnable {

    public final int f25105h;

    public final AbstractViewOnTouchListenerC2586r0 f25106i;

    public RunnableC2585q0(AbstractViewOnTouchListenerC2586r0 abstractViewOnTouchListenerC2586r0, int i3) {
        this.f25105h = i3;
        this.f25106i = abstractViewOnTouchListenerC2586r0;
    }

    @Override
    public final void run() {
        switch (this.f25105h) {
            case 0:
                ViewParent parent = this.f25106i.f25112k.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                AbstractViewOnTouchListenerC2586r0 abstractViewOnTouchListenerC2586r0 = this.f25106i;
                abstractViewOnTouchListenerC2586r0.a();
                View view = abstractViewOnTouchListenerC2586r0.f25112k;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC2586r0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC2586r0.f25115n = true;
                    break;
                }
                break;
        }
    }
}
