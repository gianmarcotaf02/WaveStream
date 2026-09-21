package androidx.media3.exoplayer.video.spherical;

/* JADX INFO: loaded from: classes.dex */
final class TouchTracker extends android.view.GestureDetector.SimpleOnGestureListener implements android.view.View.OnTouchListener, androidx.media3.exoplayer.video.spherical.OrientationListener.Listener {
    static final float MAX_PITCH_DEGREES = 45.0f;
    private final android.view.GestureDetector gestureDetector;
    private final androidx.media3.exoplayer.video.spherical.TouchTracker.Listener listener;
    private final float pxPerDegrees;
    private final android.graphics.PointF previousTouchPointPx = new android.graphics.PointF();
    private final android.graphics.PointF accumulatedTouchOffsetDegrees = new android.graphics.PointF();
    private volatile float roll = 3.1415927f;

    public interface Listener {
        void onScrollChange(android.graphics.PointF pointF);

        default boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
            return false;
        }
    }

    public TouchTracker(android.content.Context context, androidx.media3.exoplayer.video.spherical.TouchTracker.Listener listener, float f9) {
        this.listener = listener;
        this.pxPerDegrees = f9;
        this.gestureDetector = new android.view.GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        this.previousTouchPointPx.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // androidx.media3.exoplayer.video.spherical.OrientationListener.Listener
    public void onOrientationChange(float[] fArr, float f9) {
        this.roll = -f9;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f9, float f10) {
        float x9 = (motionEvent2.getX() - this.previousTouchPointPx.x) / this.pxPerDegrees;
        float y = motionEvent2.getY();
        android.graphics.PointF pointF = this.previousTouchPointPx;
        float f11 = (y - pointF.y) / this.pxPerDegrees;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d4 = this.roll;
        float fCos = (float) java.lang.Math.cos(d4);
        float fSin = (float) java.lang.Math.sin(d4);
        android.graphics.PointF pointF2 = this.accumulatedTouchOffsetDegrees;
        pointF2.x -= (fCos * x9) - (fSin * f11);
        float f12 = (fCos * f11) + (fSin * x9) + pointF2.y;
        pointF2.y = f12;
        pointF2.y = java.lang.Math.max(-45.0f, java.lang.Math.min(MAX_PITCH_DEGREES, f12));
        this.listener.onScrollChange(this.accumulatedTouchOffsetDegrees);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        return this.listener.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        return this.gestureDetector.onTouchEvent(motionEvent);
    }
}
