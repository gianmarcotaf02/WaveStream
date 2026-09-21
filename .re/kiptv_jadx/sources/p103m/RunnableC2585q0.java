package p103m;

/* JADX INFO: renamed from: m.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2585q0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f25105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p103m.AbstractViewOnTouchListenerC2586r0 f25106i;

    public /* synthetic */ RunnableC2585q0(p103m.AbstractViewOnTouchListenerC2586r0 abstractViewOnTouchListenerC2586r0, int i3) {
        this.f25105h = i3;
        this.f25106i = abstractViewOnTouchListenerC2586r0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25105h) {
            case 0:
                android.view.ViewParent parent = this.f25106i.f25112k.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                p103m.AbstractViewOnTouchListenerC2586r0 abstractViewOnTouchListenerC2586r0 = this.f25106i;
                abstractViewOnTouchListenerC2586r0.a();
                android.view.View view = abstractViewOnTouchListenerC2586r0.f25112k;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC2586r0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                    android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC2586r0.f25115n = true;
                    break;
                }
                break;
        }
    }
}
