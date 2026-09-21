package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.common.C;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

public class DefaultTimeBar extends View implements TimeBar {
    private static final String ACCESSIBILITY_CLASS_NAME = "android.widget.SeekBar";
    public static final int BAR_GRAVITY_BOTTOM = 1;
    public static final int BAR_GRAVITY_CENTER = 0;
    public static final int DEFAULT_AD_MARKER_COLOR = -1291845888;
    public static final int DEFAULT_AD_MARKER_WIDTH_DP = 4;
    public static final int DEFAULT_BAR_HEIGHT_DP = 4;
    public static final int DEFAULT_BUFFERED_COLOR = -855638017;
    private static final int DEFAULT_INCREMENT_COUNT = 20;
    public static final int DEFAULT_PLAYED_AD_MARKER_COLOR = 872414976;
    public static final int DEFAULT_PLAYED_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_DISABLED_SIZE_DP = 0;
    public static final int DEFAULT_SCRUBBER_DRAGGED_SIZE_DP = 16;
    public static final int DEFAULT_SCRUBBER_ENABLED_SIZE_DP = 12;
    public static final int DEFAULT_TOUCH_TARGET_HEIGHT_DP = 26;
    public static final int DEFAULT_UNPLAYED_COLOR = 872415231;
    private static final int FINE_SCRUB_RATIO = 3;
    private static final int FINE_SCRUB_Y_THRESHOLD_DP = -50;
    private static final float HIDDEN_SCRUBBER_SCALE = 0.0f;
    private static final float SHOWN_SCRUBBER_SCALE = 1.0f;
    private static final long STOP_SCRUBBING_TIMEOUT_MS = 1000;
    private int adGroupCount;
    private long[] adGroupTimesMs;
    private final Paint adMarkerPaint;
    private final int adMarkerWidth;
    private final int barGravity;
    private final int barHeight;
    private final Rect bufferedBar;
    private final Paint bufferedPaint;
    private long bufferedPosition;
    private final float density;
    private long duration;
    private final int fineScrubYThreshold;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private int keyCountIncrement;
    private long keyTimeIncrement;
    private int lastCoarseScrubXPosition;
    private Rect lastExclusionRectangle;
    private final CopyOnWriteArraySet<TimeBar.OnScrubListener> listeners;
    private boolean[] playedAdGroups;
    private final Paint playedAdMarkerPaint;
    private final Paint playedPaint;
    private long position;
    private final Rect progressBar;
    private long scrubPosition;
    private final Rect scrubberBar;
    private final int scrubberDisabledSize;
    private final int scrubberDraggedSize;
    private final Drawable scrubberDrawable;
    private final int scrubberEnabledSize;
    private final int scrubberPadding;
    private boolean scrubberPaddingDisabled;
    private final Paint scrubberPaint;
    private float scrubberScale;
    private ValueAnimator scrubberScalingAnimator;
    private boolean scrubbing;
    private final Rect seekBounds;
    private final Runnable stopScrubbingRunnable;
    private final Point touchPosition;
    private final int touchTargetHeight;
    private final Paint unplayedPaint;

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    private static int dpToPx(float f9, int i3) {
        return (int) ((i3 * f9) + 0.5f);
    }

    private void drawPlayhead(Canvas canvas) {
        int i3;
        if (this.duration <= 0) {
            return;
        }
        Rect rect = this.scrubberBar;
        int iConstrainValue = Util.constrainValue(rect.right, rect.left, this.progressBar.right);
        int iCenterY = this.scrubberBar.centerY();
        Drawable drawable = this.scrubberDrawable;
        if (drawable == null) {
            if (this.scrubbing || isFocused()) {
                i3 = this.scrubberDraggedSize;
            } else {
                i3 = isEnabled() ? this.scrubberEnabledSize : this.scrubberDisabledSize;
            }
            canvas.drawCircle(iConstrainValue, iCenterY, (int) ((i3 * this.scrubberScale) / 2.0f), this.scrubberPaint);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.scrubberScale)) / 2;
        int intrinsicHeight = ((int) (this.scrubberDrawable.getIntrinsicHeight() * this.scrubberScale)) / 2;
        this.scrubberDrawable.setBounds(iConstrainValue - intrinsicWidth, iCenterY - intrinsicHeight, iConstrainValue + intrinsicWidth, iCenterY + intrinsicHeight);
        this.scrubberDrawable.draw(canvas);
    }

    private void drawTimeBar(Canvas canvas) {
        int iHeight = this.progressBar.height();
        int iCenterY = this.progressBar.centerY() - (iHeight / 2);
        int i3 = iHeight + iCenterY;
        if (this.duration <= 0) {
            Rect rect = this.progressBar;
            canvas.drawRect(rect.left, iCenterY, rect.right, i3, this.unplayedPaint);
            return;
        }
        Rect rect2 = this.bufferedBar;
        int i9 = rect2.left;
        int i10 = rect2.right;
        int iMax = Math.max(Math.max(this.progressBar.left, i10), this.scrubberBar.right);
        int i11 = this.progressBar.right;
        if (iMax < i11) {
            canvas.drawRect(iMax, iCenterY, i11, i3, this.unplayedPaint);
        }
        int iMax2 = Math.max(i9, this.scrubberBar.right);
        if (i10 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i10, i3, this.bufferedPaint);
        }
        if (this.scrubberBar.width() > 0) {
            Rect rect3 = this.scrubberBar;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i3, this.playedPaint);
        }
        if (this.adGroupCount == 0) {
            return;
        }
        long[] jArr = this.adGroupTimesMs;
        jArr.getClass();
        boolean[] zArr = this.playedAdGroups;
        zArr.getClass();
        int i12 = this.adMarkerWidth / 2;
        for (int i13 = 0; i13 < this.adGroupCount; i13++) {
            int iWidth = ((int) ((((long) this.progressBar.width()) * Util.constrainValue(jArr[i13], 0L, this.duration)) / this.duration)) - i12;
            Rect rect4 = this.progressBar;
            int iMin = Math.min(rect4.width() - this.adMarkerWidth, Math.max(0, iWidth)) + rect4.left;
            canvas.drawRect(iMin, iCenterY, iMin + this.adMarkerWidth, i3, zArr[i13] ? this.playedAdMarkerPaint : this.adMarkerPaint);
        }
    }

    private long getPositionIncrement() {
        long j = this.keyTimeIncrement;
        if (j != C.TIME_UNSET) {
            return j;
        }
        long j9 = this.duration;
        if (j9 == C.TIME_UNSET) {
            return 0L;
        }
        return j9 / ((long) this.keyCountIncrement);
    }

    private String getProgressText() {
        return Util.getStringForTime(this.formatBuilder, this.formatter, this.position);
    }

    private long getScrubberPosition() {
        if (this.progressBar.width() <= 0 || this.duration == C.TIME_UNSET) {
            return 0L;
        }
        return (((long) this.scrubberBar.width()) * this.duration) / ((long) this.progressBar.width());
    }

    private boolean isInSeekBar(float f9, float f10) {
        return this.seekBounds.contains((int) f9, (int) f10);
    }

    public void lambda$new$0() {
        stopScrubbing(false);
    }

    public void lambda$new$1(ValueAnimator valueAnimator) {
        this.scrubberScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.seekBounds);
    }

    private void positionScrubber(float f9) {
        Rect rect = this.scrubberBar;
        Rect rect2 = this.progressBar;
        rect.right = Util.constrainValue((int) f9, rect2.left, rect2.right);
    }

    private static int pxToDp(float f9, int i3) {
        return (int) (i3 / f9);
    }

    private Point resolveRelativeTouchPosition(MotionEvent motionEvent) {
        this.touchPosition.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.touchPosition;
    }

    private boolean scrubIncrementally(long j) {
        long j9 = this.duration;
        if (j9 <= 0) {
            return false;
        }
        long j10 = this.scrubbing ? this.scrubPosition : this.position;
        long jConstrainValue = Util.constrainValue(j10 + j, 0L, j9);
        if (jConstrainValue == j10) {
            return false;
        }
        if (this.scrubbing) {
            updateScrubbing(jConstrainValue);
        } else {
            startScrubbing(jConstrainValue);
        }
        update();
        return true;
    }

    private void setSystemGestureExclusionRectsV29(int i3, int i9) {
        Rect rect = this.lastExclusionRectangle;
        if (rect != null && rect.width() == i3 && this.lastExclusionRectangle.height() == i9) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i3, i9);
        this.lastExclusionRectangle = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private void startScrubbing(long j) {
        this.scrubPosition = j;
        this.scrubbing = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<TimeBar.OnScrubListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onScrubStart(this, j);
        }
    }

    private void stopScrubbing(boolean z6) {
        removeCallbacks(this.stopScrubbingRunnable);
        this.scrubbing = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<TimeBar.OnScrubListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onScrubStop(this, this.scrubPosition, z6);
        }
    }

    private void update() {
        this.bufferedBar.set(this.progressBar);
        this.scrubberBar.set(this.progressBar);
        long j = this.scrubbing ? this.scrubPosition : this.position;
        if (this.duration > 0) {
            int iWidth = (int) ((((long) this.progressBar.width()) * this.bufferedPosition) / this.duration);
            Rect rect = this.bufferedBar;
            Rect rect2 = this.progressBar;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.progressBar.width()) * j) / this.duration);
            Rect rect3 = this.scrubberBar;
            Rect rect4 = this.progressBar;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.bufferedBar;
            int i3 = this.progressBar.left;
            rect5.right = i3;
            this.scrubberBar.right = i3;
        }
        invalidate(this.seekBounds);
    }

    private void updateDrawableState() {
        Drawable drawable = this.scrubberDrawable;
        if (drawable != null && drawable.isStateful() && this.scrubberDrawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void updateScrubbing(long j) {
        if (this.scrubPosition == j) {
            return;
        }
        this.scrubPosition = j;
        Iterator<TimeBar.OnScrubListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onScrubMove(this, j);
        }
    }

    @Override
    public void addListener(TimeBar.OnScrubListener onScrubListener) {
        onScrubListener.getClass();
        this.listeners.add(onScrubListener);
    }

    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();
        updateDrawableState();
    }

    @Override
    public long getPreferredUpdateDelay() {
        int iPxToDp = pxToDp(this.density, this.progressBar.width());
        if (iPxToDp == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.duration;
        if (j == 0 || j == C.TIME_UNSET) {
            return Long.MAX_VALUE;
        }
        return j / ((long) iPxToDp);
    }

    public void hideScrubber(boolean z6) {
        if (this.scrubberScalingAnimator.isStarted()) {
            this.scrubberScalingAnimator.cancel();
        }
        this.scrubberPaddingDisabled = z6;
        this.scrubberScale = HIDDEN_SCRUBBER_SCALE;
        invalidate(this.seekBounds);
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.scrubberDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.save();
        drawTimeBar(canvas);
        drawPlayhead(canvas);
        canvas.restore();
    }

    @Override
    public void onFocusChanged(boolean z6, int i3, Rect rect) {
        super.onFocusChanged(z6, i3, rect);
        if (!this.scrubbing || z6) {
            return;
        }
        stopScrubbing(false);
    }

    @Override
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.duration <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    @Override
    public boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i3 != 66) {
                switch (i3) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (scrubIncrementally(positionIncrement)) {
                            removeCallbacks(this.stopScrubbingRunnable);
                            postDelayed(this.stopScrubbingRunnable, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (scrubIncrementally(positionIncrement)) {
                            removeCallbacks(this.stopScrubbingRunnable);
                            postDelayed(this.stopScrubbingRunnable, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.scrubbing) {
                            stopScrubbing(false);
                            return true;
                        }
                        break;
                }
            } else if (this.scrubbing) {
                stopScrubbing(false);
                return true;
            }
        }
        return super.onKeyDown(i3, keyEvent);
    }

    @Override
    public void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
        int paddingBottom;
        int iMax;
        int i12 = i10 - i3;
        int i13 = i11 - i9;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i12 - getPaddingRight();
        int i14 = this.scrubberPaddingDisabled ? 0 : this.scrubberPadding;
        if (this.barGravity == 1) {
            paddingBottom = (i13 - getPaddingBottom()) - this.touchTargetHeight;
            int paddingBottom2 = i13 - getPaddingBottom();
            int i15 = this.barHeight;
            iMax = (paddingBottom2 - i15) - Math.max(i14 - (i15 / 2), 0);
        } else {
            paddingBottom = (i13 - this.touchTargetHeight) / 2;
            iMax = (i13 - this.barHeight) / 2;
        }
        this.seekBounds.set(paddingLeft, paddingBottom, paddingRight, this.touchTargetHeight + paddingBottom);
        Rect rect = this.progressBar;
        Rect rect2 = this.seekBounds;
        rect.set(rect2.left + i14, iMax, rect2.right - i14, this.barHeight + iMax);
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRectsV29(i12, i13);
        }
        update();
    }

    @Override
    public void onMeasure(int i3, int i9) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        if (mode == 0) {
            size = this.touchTargetHeight;
        } else if (mode != 1073741824) {
            size = Math.min(this.touchTargetHeight, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i3), size);
        updateDrawableState();
    }

    @Override
    public void onRtlPropertiesChanged(int i3) {
        Drawable drawable = this.scrubberDrawable;
        if (drawable == null || !drawable.setLayoutDirection(i3)) {
            return;
        }
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.duration > 0) {
            Point pointResolveRelativeTouchPosition = resolveRelativeTouchPosition(motionEvent);
            int i3 = pointResolveRelativeTouchPosition.x;
            int i9 = pointResolveRelativeTouchPosition.y;
            int action = motionEvent.getAction();
            if (action == 0) {
                float f9 = i3;
                if (isInSeekBar(f9, i9)) {
                    positionScrubber(f9);
                    startScrubbing(getScrubberPosition());
                    update();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.scrubbing) {
                    stopScrubbing(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.scrubbing) {
                        stopScrubbing(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.scrubbing) {
                if (i9 < this.fineScrubYThreshold) {
                    int i10 = this.lastCoarseScrubXPosition;
                    positionScrubber(((i3 - i10) / 3) + i10);
                } else {
                    this.lastCoarseScrubXPosition = i3;
                    positionScrubber(i3);
                }
                updateScrubbing(getScrubberPosition());
                update();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean performAccessibilityAction(int i3, Bundle bundle) {
        if (super.performAccessibilityAction(i3, bundle)) {
            return true;
        }
        if (this.duration <= 0) {
            return false;
        }
        if (i3 == 8192) {
            if (scrubIncrementally(-getPositionIncrement())) {
                stopScrubbing(false);
            }
        } else {
            if (i3 != 4096) {
                return false;
            }
            if (scrubIncrementally(getPositionIncrement())) {
                stopScrubbing(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override
    public void removeListener(TimeBar.OnScrubListener onScrubListener) {
        this.listeners.remove(onScrubListener);
    }

    @Override
    public void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i3) {
        AbstractC1864o0.L(i3 == 0 || !(jArr == null || zArr == null));
        this.adGroupCount = i3;
        this.adGroupTimesMs = jArr;
        this.playedAdGroups = zArr;
        update();
    }

    public void setAdMarkerColor(int i3) {
        this.adMarkerPaint.setColor(i3);
        invalidate(this.seekBounds);
    }

    public void setBufferedColor(int i3) {
        this.bufferedPaint.setColor(i3);
        invalidate(this.seekBounds);
    }

    @Override
    public void setBufferedPosition(long j) {
        if (this.bufferedPosition == j) {
            return;
        }
        this.bufferedPosition = j;
        update();
    }

    @Override
    public void setDuration(long j) {
        if (this.duration == j) {
            return;
        }
        this.duration = j;
        if (this.scrubbing && j == C.TIME_UNSET) {
            stopScrubbing(true);
        }
        update();
    }

    @Override
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        if (!this.scrubbing || z6) {
            return;
        }
        stopScrubbing(true);
    }

    @Override
    public void setKeyCountIncrement(int i3) {
        AbstractC1864o0.L(i3 > 0);
        this.keyCountIncrement = i3;
        this.keyTimeIncrement = C.TIME_UNSET;
    }

    @Override
    public void setKeyTimeIncrement(long j) {
        AbstractC1864o0.L(j > 0);
        this.keyCountIncrement = -1;
        this.keyTimeIncrement = j;
    }

    public void setPlayedAdMarkerColor(int i3) {
        this.playedAdMarkerPaint.setColor(i3);
        invalidate(this.seekBounds);
    }

    public void setPlayedColor(int i3) {
        this.playedPaint.setColor(i3);
        invalidate(this.seekBounds);
    }

    @Override
    public void setPosition(long j) {
        if (this.position == j) {
            return;
        }
        this.position = j;
        setContentDescription(getProgressText());
        update();
    }

    public void setScrubberColor(int i3) {
        this.scrubberPaint.setColor(i3);
        invalidate(this.seekBounds);
    }

    public void setUnplayedColor(int i3) {
        this.unplayedPaint.setColor(i3);
        invalidate(this.seekBounds);
    }

    public void showScrubber() {
        if (this.scrubberScalingAnimator.isStarted()) {
            this.scrubberScalingAnimator.cancel();
        }
        this.scrubberPaddingDisabled = false;
        this.scrubberScale = 1.0f;
        invalidate(this.seekBounds);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, attributeSet);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i3, AttributeSet attributeSet2) {
        this(context, attributeSet, i3, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i3, AttributeSet attributeSet2, int i9) {
        super(context, attributeSet, i3);
        this.seekBounds = new Rect();
        this.progressBar = new Rect();
        this.bufferedBar = new Rect();
        this.scrubberBar = new Rect();
        Paint paint = new Paint();
        this.playedPaint = paint;
        Paint paint2 = new Paint();
        this.bufferedPaint = paint2;
        Paint paint3 = new Paint();
        this.unplayedPaint = paint3;
        Paint paint4 = new Paint();
        this.adMarkerPaint = paint4;
        Paint paint5 = new Paint();
        this.playedAdMarkerPaint = paint5;
        Paint paint6 = new Paint();
        this.scrubberPaint = paint6;
        paint6.setAntiAlias(true);
        this.listeners = new CopyOnWriteArraySet<>();
        this.touchPosition = new Point();
        float f9 = context.getResources().getDisplayMetrics().density;
        this.density = f9;
        this.fineScrubYThreshold = dpToPx(f9, FINE_SCRUB_Y_THRESHOLD_DP);
        int iDpToPx = dpToPx(f9, 4);
        int iDpToPx2 = dpToPx(f9, 26);
        int iDpToPx3 = dpToPx(f9, 4);
        int iDpToPx4 = dpToPx(f9, 12);
        int iDpToPx5 = dpToPx(f9, 0);
        int iDpToPx6 = dpToPx(f9, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.DefaultTimeBar, i3, i9);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.DefaultTimeBar_scrubber_drawable);
                this.scrubberDrawable = drawable;
                if (drawable != null) {
                    drawable.setLayoutDirection(getLayoutDirection());
                    iDpToPx2 = Math.max(drawable.getMinimumHeight(), iDpToPx2);
                }
                this.barHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_bar_height, iDpToPx);
                this.touchTargetHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_touch_target_height, iDpToPx2);
                this.barGravity = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_bar_gravity, 0);
                this.adMarkerWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_ad_marker_width, iDpToPx3);
                this.scrubberEnabledSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_scrubber_enabled_size, iDpToPx4);
                this.scrubberDisabledSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_scrubber_disabled_size, iDpToPx5);
                this.scrubberDraggedSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_scrubber_dragged_size, iDpToPx6);
                int i10 = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_played_color, -1);
                int i11 = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_scrubber_color, -1);
                int i12 = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_buffered_color, DEFAULT_BUFFERED_COLOR);
                int i13 = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_unplayed_color, DEFAULT_UNPLAYED_COLOR);
                int i14 = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_ad_marker_color, DEFAULT_AD_MARKER_COLOR);
                int i15 = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_played_ad_marker_color, DEFAULT_PLAYED_AD_MARKER_COLOR);
                paint.setColor(i10);
                paint6.setColor(i11);
                paint2.setColor(i12);
                paint3.setColor(i13);
                paint4.setColor(i14);
                paint5.setColor(i15);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.barHeight = iDpToPx;
            this.touchTargetHeight = iDpToPx2;
            this.barGravity = 0;
            this.adMarkerWidth = iDpToPx3;
            this.scrubberEnabledSize = iDpToPx4;
            this.scrubberDisabledSize = iDpToPx5;
            this.scrubberDraggedSize = iDpToPx6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(DEFAULT_BUFFERED_COLOR);
            paint3.setColor(DEFAULT_UNPLAYED_COLOR);
            paint4.setColor(DEFAULT_AD_MARKER_COLOR);
            paint5.setColor(DEFAULT_PLAYED_AD_MARKER_COLOR);
            this.scrubberDrawable = null;
        }
        StringBuilder sb = new StringBuilder();
        this.formatBuilder = sb;
        this.formatter = new Formatter(sb, Locale.getDefault());
        this.stopScrubbingRunnable = new a(this, 0);
        Drawable drawable2 = this.scrubberDrawable;
        if (drawable2 != null) {
            this.scrubberPadding = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.scrubberPadding = (Math.max(this.scrubberDisabledSize, Math.max(this.scrubberEnabledSize, this.scrubberDraggedSize)) + 1) / 2;
        }
        this.scrubberScale = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.scrubberScalingAnimator = valueAnimator;
        valueAnimator.addUpdateListener(new g(4, this));
        this.duration = C.TIME_UNSET;
        this.keyTimeIncrement = C.TIME_UNSET;
        this.keyCountIncrement = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public void hideScrubber(long j) {
        if (this.scrubberScalingAnimator.isStarted()) {
            this.scrubberScalingAnimator.cancel();
        }
        this.scrubberScalingAnimator.setFloatValues(this.scrubberScale, HIDDEN_SCRUBBER_SCALE);
        this.scrubberScalingAnimator.setDuration(j);
        this.scrubberScalingAnimator.start();
    }

    public void showScrubber(long j) {
        if (this.scrubberScalingAnimator.isStarted()) {
            this.scrubberScalingAnimator.cancel();
        }
        this.scrubberPaddingDisabled = false;
        this.scrubberScalingAnimator.setFloatValues(this.scrubberScale, 1.0f);
        this.scrubberScalingAnimator.setDuration(j);
        this.scrubberScalingAnimator.start();
    }
}
