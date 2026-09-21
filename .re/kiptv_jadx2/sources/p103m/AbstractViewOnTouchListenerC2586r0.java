package p103m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import p095l.B;

public abstract class AbstractViewOnTouchListenerC2586r0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    public final float f25110h;

    public final int f25111i;
    public final int j;

    public final View f25112k;

    public RunnableC2585q0 f25113l;

    public RunnableC2585q0 f25114m;

    public boolean f25115n;

    public int f25116o;

    public final int[] f25117p = new int[2];

    public AbstractViewOnTouchListenerC2586r0(View view) {
        this.f25112k = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f25110h = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f25111i = tapTimeout;
        this.j = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC2585q0 runnableC2585q0 = this.f25114m;
        View view = this.f25112k;
        if (runnableC2585q0 != null) {
            view.removeCallbacks(runnableC2585q0);
        }
        RunnableC2585q0 runnableC2585q1 = this.f25113l;
        if (runnableC2585q1 != null) {
            view.removeCallbacks(runnableC2585q1);
        }
    }

    public abstract B b();

    public abstract boolean c();

    public boolean d() {
        B b9 = b();
        if (b9 == null || !b9.a()) {
            return true;
        }
        b9.dismiss();
        return true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z6;
        C2581o0 c2581o0H;
        boolean z9 = this.f25115n;
        View view2 = this.f25112k;
        if (z9) {
            B b9 = b();
            if (b9 != null && b9.a() && (c2581o0H = b9.h()) != null && c2581o0H.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f25117p;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c2581o0H.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = c2581o0H.b(motionEventObtainNoHistory, this.f25116o);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z10 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z10) {
                    z6 = true;
                } else if (d()) {
                    z6 = false;
                } else {
                    z6 = true;
                }
            } else if (d()) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f25116o = motionEvent.getPointerId(0);
                    if (this.f25113l == null) {
                        this.f25113l = new RunnableC2585q0(this, 0);
                    }
                    view2.postDelayed(this.f25113l, this.f25111i);
                    if (this.f25114m == null) {
                        this.f25114m = new RunnableC2585q0(this, 1);
                    }
                    view2.postDelayed(this.f25114m, this.j);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f25116o);
                    if (iFindPointerIndex >= 0) {
                        float x9 = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f9 = this.f25110h;
                        float f10 = -f9;
                        if (x9 < f10 || y < f10 || x9 >= (view2.getRight() - view2.getLeft()) + f9 || y >= (view2.getBottom() - view2.getTop()) + f9) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z6 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z6 = false;
            } else {
                z6 = false;
            }
            if (z6) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f25115n = z6;
        return z6 || z9;
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f25115n = false;
        this.f25116o = -1;
        RunnableC2585q0 runnableC2585q0 = this.f25113l;
        if (runnableC2585q0 != null) {
            this.f25112k.removeCallbacks(runnableC2585q0);
        }
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
    }
}
