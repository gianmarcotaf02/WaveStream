package io.sentry.android.core.internal.gestures;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryWindowCallback extends io.sentry.android.core.internal.gestures.WindowCallbackAdapter {
    private final android.view.Window.Callback delegate;
    private final androidx.core.view.GestureDetectorCompat gestureDetector;
    private final io.sentry.android.core.internal.gestures.SentryGestureListener gestureListener;
    private final io.sentry.android.core.internal.gestures.SentryWindowCallback.MotionEventObtainer motionEventObtainer;
    private final io.sentry.SentryOptions options;

    public interface MotionEventObtainer {
        default android.view.MotionEvent obtain(android.view.MotionEvent motionEvent) {
            return android.view.MotionEvent.obtain(motionEvent);
        }
    }

    public SentryWindowCallback(android.view.Window.Callback callback, android.content.Context context, io.sentry.android.core.internal.gestures.SentryGestureListener sentryGestureListener, io.sentry.SentryOptions sentryOptions) {
        this(callback, new androidx.core.view.GestureDetectorCompat(context, sentryGestureListener), sentryGestureListener, sentryOptions, new io.sentry.android.core.internal.gestures.SentryWindowCallback.MotionEventObtainer() { // from class: io.sentry.android.core.internal.gestures.SentryWindowCallback.1
        });
    }

    private void handleTouchEvent(android.view.MotionEvent motionEvent) {
        this.gestureDetector.f16085a.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            this.gestureListener.onUp(motionEvent);
        }
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            android.view.MotionEvent motionEventObtain = this.motionEventObtainer.obtain(motionEvent);
            try {
                handleTouchEvent(motionEventObtain);
            } catch (java.lang.Throwable th) {
                try {
                    if (this.options != null) {
                        this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Error dispatching touch event", th);
                    }
                } finally {
                    motionEventObtain.recycle();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public android.view.Window.Callback getDelegate() {
        return this.delegate;
    }

    public void stopTracking() {
        this.gestureListener.stopTracing(io.sentry.SpanStatus.CANCELLED);
    }

    public SentryWindowCallback(android.view.Window.Callback callback, androidx.core.view.GestureDetectorCompat gestureDetectorCompat, io.sentry.android.core.internal.gestures.SentryGestureListener sentryGestureListener, io.sentry.SentryOptions sentryOptions, io.sentry.android.core.internal.gestures.SentryWindowCallback.MotionEventObtainer motionEventObtainer) {
        super(callback);
        this.delegate = callback;
        this.gestureListener = sentryGestureListener;
        this.options = sentryOptions;
        this.gestureDetector = gestureDetectorCompat;
        this.motionEventObtainer = motionEventObtainer;
    }
}
