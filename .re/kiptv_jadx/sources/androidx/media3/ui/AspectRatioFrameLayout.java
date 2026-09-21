package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioFrameLayout extends android.widget.FrameLayout {
    private static final float MAX_ASPECT_RATIO_DEFORMATION_FRACTION = 0.01f;
    public static final int RESIZE_MODE_FILL = 3;
    public static final int RESIZE_MODE_FIT = 0;
    public static final int RESIZE_MODE_FIXED_HEIGHT = 2;
    public static final int RESIZE_MODE_FIXED_WIDTH = 1;
    public static final int RESIZE_MODE_ZOOM = 4;
    private androidx.media3.ui.AspectRatioFrameLayout.AspectRatioListener aspectRatioListener;
    private final androidx.media3.ui.AspectRatioFrameLayout.AspectRatioUpdateDispatcher aspectRatioUpdateDispatcher;
    private int resizeMode;
    private float videoAspectRatio;

    public interface AspectRatioListener {
        void onAspectRatioUpdated(float f9, float f10, boolean z6);
    }

    public final class AspectRatioUpdateDispatcher implements java.lang.Runnable {
        private boolean aspectRatioMismatch;
        private boolean isScheduled;
        private float naturalAspectRatio;
        private float targetAspectRatio;

        private AspectRatioUpdateDispatcher() {
        }

        @Override // java.lang.Runnable
        public void run() {
            this.isScheduled = false;
            if (androidx.media3.ui.AspectRatioFrameLayout.this.aspectRatioListener == null) {
                return;
            }
            androidx.media3.ui.AspectRatioFrameLayout.this.aspectRatioListener.onAspectRatioUpdated(this.targetAspectRatio, this.naturalAspectRatio, this.aspectRatioMismatch);
        }

        public void scheduleUpdate(float f9, float f10, boolean z6) {
            this.targetAspectRatio = f9;
            this.naturalAspectRatio = f10;
            this.aspectRatioMismatch = z6;
            if (this.isScheduled) {
                return;
            }
            this.isScheduled = true;
            androidx.media3.ui.AspectRatioFrameLayout.this.post(this);
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ResizeMode {
    }

    public AspectRatioFrameLayout(android.content.Context context) {
        this(context, null);
    }

    public int getResizeMode() {
        return this.resizeMode;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i9) {
        float f9;
        float f10;
        super.onMeasure(i3, i9);
        if (this.videoAspectRatio <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f11 = measuredWidth;
        float f12 = measuredHeight;
        float f13 = f11 / f12;
        float f14 = (this.videoAspectRatio / f13) - 1.0f;
        if (java.lang.Math.abs(f14) <= MAX_ASPECT_RATIO_DEFORMATION_FRACTION) {
            this.aspectRatioUpdateDispatcher.scheduleUpdate(this.videoAspectRatio, f13, false);
            return;
        }
        int i10 = this.resizeMode;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    f9 = this.videoAspectRatio;
                } else if (i10 == 4) {
                    if (f14 > 0.0f) {
                        f9 = this.videoAspectRatio;
                    } else {
                        f10 = this.videoAspectRatio;
                    }
                }
                measuredWidth = (int) (f12 * f9);
            } else {
                f10 = this.videoAspectRatio;
            }
            measuredHeight = (int) (f11 / f10);
        } else if (f14 > 0.0f) {
            f10 = this.videoAspectRatio;
            measuredHeight = (int) (f11 / f10);
        } else {
            f9 = this.videoAspectRatio;
            measuredWidth = (int) (f12 * f9);
        }
        this.aspectRatioUpdateDispatcher.scheduleUpdate(this.videoAspectRatio, f13, true);
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f9) {
        if (this.videoAspectRatio != f9) {
            this.videoAspectRatio = f9;
            requestLayout();
        }
    }

    public void setAspectRatioListener(androidx.media3.ui.AspectRatioFrameLayout.AspectRatioListener aspectRatioListener) {
        this.aspectRatioListener = aspectRatioListener;
    }

    public void setResizeMode(int i3) {
        if (this.resizeMode != i3) {
            this.resizeMode = i3;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.resizeMode = 0;
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, androidx.media3.ui.R.styleable.AspectRatioFrameLayout, 0, 0);
            try {
                this.resizeMode = typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.AspectRatioFrameLayout_resize_mode, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (java.lang.Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.aspectRatioUpdateDispatcher = new androidx.media3.ui.AspectRatioFrameLayout.AspectRatioUpdateDispatcher();
    }
}
