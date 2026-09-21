package p103m;

/* JADX INFO: renamed from: m.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC2586r0 implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f25110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f25111i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final android.view.View f25112k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p103m.RunnableC2585q0 f25113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p103m.RunnableC2585q0 f25114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f25115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f25116o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int[] f25117p = new int[2];

    public AbstractViewOnTouchListenerC2586r0(android.view.View view) {
        this.f25112k = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f25110h = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
        this.f25111i = tapTimeout;
        this.j = (android.view.ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        p103m.RunnableC2585q0 runnableC2585q0 = this.f25114m;
        android.view.View view = this.f25112k;
        if (runnableC2585q0 != null) {
            view.removeCallbacks(runnableC2585q0);
        }
        p103m.RunnableC2585q0 runnableC2585q1 = this.f25113l;
        if (runnableC2585q1 != null) {
            view.removeCallbacks(runnableC2585q1);
        }
    }

    public abstract p095l.B b();

    public abstract boolean c();

    public boolean d() {
        p095l.B b9 = b();
        if (b9 == null || !b9.a()) {
            return true;
        }
        b9.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z6;
        p103m.C2581o0 c2581o0H;
        boolean z9 = this.f25115n;
        android.view.View view2 = this.f25112k;
        if (z9) {
            p095l.B b9 = b();
            if (b9 != null && b9.a() && (c2581o0H = b9.h()) != null && c2581o0H.isShown()) {
                android.view.MotionEvent motionEventObtainNoHistory = android.view.MotionEvent.obtainNoHistory(motionEvent);
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
                        this.f25113l = new p103m.RunnableC2585q0(this, 0);
                    }
                    view2.postDelayed(this.f25113l, this.f25111i);
                    if (this.f25114m == null) {
                        this.f25114m = new p103m.RunnableC2585q0(this, 1);
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
                long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f25115n = z6;
        return z6 || z9;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.f25115n = false;
        this.f25116o = -1;
        p103m.RunnableC2585q0 runnableC2585q0 = this.f25113l;
        if (runnableC2585q0 != null) {
            this.f25112k.removeCallbacks(runnableC2585q0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }
}
