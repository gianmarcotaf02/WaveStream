package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u0016J\r\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u0016J\r\u0010\u001f\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00105\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u00104R\u0014\u00106\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010.\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010.\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010F\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010D¨\u0006G"}, d2 = {"Lio/sentry/android/replay/ScreenshotRecorder;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "config", "Lio/sentry/SentryOptions;", io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/android/replay/util/MainLooperHandler;", "mainLooperHandler", "Ljava/util/concurrent/ScheduledExecutorService;", "recorder", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "screenshotRecorderCallback", "<init>", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;Lio/sentry/SentryOptions;Lio/sentry/android/replay/util/MainLooperHandler;Ljava/util/concurrent/ScheduledExecutorService;Lio/sentry/android/replay/ScreenshotRecorderCallback;)V", "Landroid/graphics/Bitmap;", "Landroid/graphics/Rect;", "rect", "", "dominantColorForRect", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)I", "Lh6/A;", "capture", "()V", "onDraw", "Landroid/view/View;", "root", "bind", "(Landroid/view/View;)V", "unbind", "pause", "resume", "close", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "getConfig", "()Lio/sentry/android/replay/ScreenshotRecorderConfig;", "Lio/sentry/SentryOptions;", "getOptions", "()Lio/sentry/SentryOptions;", "Lio/sentry/android/replay/util/MainLooperHandler;", "Ljava/util/concurrent/ScheduledExecutorService;", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "Ljava/lang/ref/WeakReference;", "rootView", "Ljava/lang/ref/WeakReference;", "Landroid/graphics/Paint;", "maskingPaint$delegate", "Lh6/h;", "getMaskingPaint", "()Landroid/graphics/Paint;", "maskingPaint", "singlePixelBitmap$delegate", "getSinglePixelBitmap", "()Landroid/graphics/Bitmap;", "singlePixelBitmap", "screenshot", "Landroid/graphics/Bitmap;", "Landroid/graphics/Canvas;", "singlePixelBitmapCanvas$delegate", "getSinglePixelBitmapCanvas", "()Landroid/graphics/Canvas;", "singlePixelBitmapCanvas", "Landroid/graphics/Matrix;", "prescaledMatrix$delegate", "getPrescaledMatrix", "()Landroid/graphics/Matrix;", "prescaledMatrix", "Ljava/util/concurrent/atomic/AtomicBoolean;", "contentChanged", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCapturing", "lastCaptureSuccessful", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ScreenshotRecorder implements android.view.ViewTreeObserver.OnDrawListener {
    public static final int $stable = 8;
    private final io.sentry.android.replay.ScreenshotRecorderConfig config;
    private final java.util.concurrent.atomic.AtomicBoolean contentChanged;
    private final java.util.concurrent.atomic.AtomicBoolean isCapturing;
    private final java.util.concurrent.atomic.AtomicBoolean lastCaptureSuccessful;
    private final io.sentry.android.replay.util.MainLooperHandler mainLooperHandler;

    /* JADX INFO: renamed from: maskingPaint$delegate, reason: from kotlin metadata */
    private final p070h6.h maskingPaint;
    private final io.sentry.SentryOptions options;

    /* JADX INFO: renamed from: prescaledMatrix$delegate, reason: from kotlin metadata */
    private final p070h6.h prescaledMatrix;
    private final java.util.concurrent.ScheduledExecutorService recorder;
    private java.lang.ref.WeakReference<android.view.View> rootView;
    private final android.graphics.Bitmap screenshot;
    private final io.sentry.android.replay.ScreenshotRecorderCallback screenshotRecorderCallback;

    /* JADX INFO: renamed from: singlePixelBitmap$delegate, reason: from kotlin metadata */
    private final p070h6.h singlePixelBitmap;

    /* JADX INFO: renamed from: singlePixelBitmapCanvas$delegate, reason: from kotlin metadata */
    private final p070h6.h singlePixelBitmapCanvas;

    public ScreenshotRecorder(io.sentry.android.replay.ScreenshotRecorderConfig config, io.sentry.SentryOptions options, io.sentry.android.replay.util.MainLooperHandler mainLooperHandler, java.util.concurrent.ScheduledExecutorService recorder, io.sentry.android.replay.ScreenshotRecorderCallback screenshotRecorderCallback) {
        kotlin.jvm.internal.m.e(config, "config");
        kotlin.jvm.internal.m.e(options, "options");
        kotlin.jvm.internal.m.e(mainLooperHandler, "mainLooperHandler");
        kotlin.jvm.internal.m.e(recorder, "recorder");
        this.config = config;
        this.options = options;
        this.mainLooperHandler = mainLooperHandler;
        this.recorder = recorder;
        this.screenshotRecorderCallback = screenshotRecorderCallback;
        p070h6.i iVar = p070h6.i.j;
        this.maskingPaint = com.google.common.util.concurrent.D.A(iVar, io.sentry.android.replay.ScreenshotRecorder$maskingPaint$2.INSTANCE);
        this.singlePixelBitmap = com.google.common.util.concurrent.D.A(iVar, io.sentry.android.replay.ScreenshotRecorder$singlePixelBitmap$2.INSTANCE);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(config.getRecordingWidth(), config.getRecordingHeight(), android.graphics.Bitmap.Config.RGB_565);
        kotlin.jvm.internal.m.d(bitmapCreateBitmap, "createBitmap(\n        co…tmap.Config.RGB_565\n    )");
        this.screenshot = bitmapCreateBitmap;
        this.singlePixelBitmapCanvas = com.google.common.util.concurrent.D.A(iVar, new io.sentry.android.replay.ScreenshotRecorder$singlePixelBitmapCanvas$2(this));
        this.prescaledMatrix = com.google.common.util.concurrent.D.A(iVar, new io.sentry.android.replay.ScreenshotRecorder$prescaledMatrix$2(this));
        this.contentChanged = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.isCapturing = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.lastCaptureSuccessful = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$2(io.sentry.android.replay.ScreenshotRecorder this$0, android.view.Window window, android.view.View view) {
        kotlin.jvm.internal.m.e(this$0, "this$0");
        try {
            this$0.contentChanged.set(false);
            android.view.PixelCopy.request(window, this$0.screenshot, new io.sentry.android.core.internal.util.b(this$0, view, 1), this$0.mainLooperHandler.getHandler());
        } catch (java.lang.Throwable th) {
            this$0.options.getLogger().log(io.sentry.SentryLevel.WARNING, "Failed to capture replay recording", th);
            this$0.lastCaptureSuccessful.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$2$lambda$1(io.sentry.android.replay.ScreenshotRecorder this$0, android.view.View view, int i3) {
        kotlin.jvm.internal.m.e(this$0, "this$0");
        if (i3 != 0) {
            this$0.options.getLogger().log(io.sentry.SentryLevel.INFO, "Failed to capture replay recording: %d", java.lang.Integer.valueOf(i3));
            this$0.lastCaptureSuccessful.set(false);
        } else if (this$0.contentChanged.get()) {
            this$0.options.getLogger().log(io.sentry.SentryLevel.INFO, "Failed to determine view hierarchy, not capturing", new java.lang.Object[0]);
            this$0.lastCaptureSuccessful.set(false);
        } else {
            io.sentry.android.replay.viewhierarchy.ViewHierarchyNode viewHierarchyNodeFromView = io.sentry.android.replay.viewhierarchy.ViewHierarchyNode.INSTANCE.fromView(view, null, 0, this$0.options);
            io.sentry.android.replay.util.ViewsKt.traverse(view, viewHierarchyNodeFromView, this$0.options);
            io.sentry.android.replay.util.ExecutorsKt.submitSafely(this$0.recorder, this$0.options, "screenshot_recorder.mask", new T7.d(this$0, viewHierarchyNodeFromView, 20));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$2$lambda$1$lambda$0(io.sentry.android.replay.ScreenshotRecorder this$0, io.sentry.android.replay.viewhierarchy.ViewHierarchyNode viewHierarchy) {
        kotlin.jvm.internal.m.e(this$0, "this$0");
        kotlin.jvm.internal.m.e(viewHierarchy, "$viewHierarchy");
        android.graphics.Canvas canvas = new android.graphics.Canvas(this$0.screenshot);
        canvas.setMatrix(this$0.getPrescaledMatrix());
        viewHierarchy.traverse(new io.sentry.android.replay.ScreenshotRecorder$capture$1$1$1$1(this$0, canvas));
        io.sentry.android.replay.ScreenshotRecorderCallback screenshotRecorderCallback = this$0.screenshotRecorderCallback;
        if (screenshotRecorderCallback != null) {
            screenshotRecorderCallback.onScreenshotRecorded(this$0.screenshot);
        }
        this$0.lastCaptureSuccessful.set(true);
        this$0.contentChanged.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dominantColorForRect(android.graphics.Bitmap bitmap, android.graphics.Rect rect) {
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        android.graphics.RectF rectF = new android.graphics.RectF(rect2);
        getPrescaledMatrix().mapRect(rectF);
        rectF.round(rect2);
        getSinglePixelBitmapCanvas().drawBitmap(bitmap, rect2, new android.graphics.Rect(0, 0, 1, 1), (android.graphics.Paint) null);
        return getSinglePixelBitmap().getPixel(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.graphics.Paint getMaskingPaint() {
        return (android.graphics.Paint) this.maskingPaint.getValue();
    }

    private final android.graphics.Matrix getPrescaledMatrix() {
        return (android.graphics.Matrix) this.prescaledMatrix.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.graphics.Bitmap getSinglePixelBitmap() {
        return (android.graphics.Bitmap) this.singlePixelBitmap.getValue();
    }

    private final android.graphics.Canvas getSinglePixelBitmapCanvas() {
        return (android.graphics.Canvas) this.singlePixelBitmapCanvas.getValue();
    }

    public final void bind(android.view.View root) {
        kotlin.jvm.internal.m.e(root, "root");
        java.lang.ref.WeakReference<android.view.View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
        java.lang.ref.WeakReference<android.view.View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.rootView = new java.lang.ref.WeakReference<>(root);
        io.sentry.android.replay.util.ViewsKt.addOnDrawListenerSafe(root, this);
        this.contentChanged.set(true);
    }

    public final void capture() {
        if (!this.isCapturing.get()) {
            this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new java.lang.Object[0]);
            return;
        }
        if (!this.contentChanged.get() && this.lastCaptureSuccessful.get()) {
            this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Content hasn't changed, repeating last known frame", new java.lang.Object[0]);
            io.sentry.android.replay.ScreenshotRecorderCallback screenshotRecorderCallback = this.screenshotRecorderCallback;
            if (screenshotRecorderCallback != null) {
                screenshotRecorderCallback.onScreenshotRecorded(this.screenshot);
                return;
            }
            return;
        }
        java.lang.ref.WeakReference<android.view.View> weakReference = this.rootView;
        android.view.View view = weakReference != null ? weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Root view is invalid, not capturing screenshot", new java.lang.Object[0]);
            return;
        }
        android.view.Window phoneWindow = io.sentry.android.replay.WindowsKt.getPhoneWindow(view);
        if (phoneWindow == null) {
            this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Window is invalid, not capturing screenshot", new java.lang.Object[0]);
        } else {
            this.mainLooperHandler.post(new O.g(this, phoneWindow, view, 10));
        }
    }

    public final void close() {
        java.lang.ref.WeakReference<android.view.View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
        java.lang.ref.WeakReference<android.view.View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.screenshot.recycle();
        this.isCapturing.set(false);
    }

    public final io.sentry.android.replay.ScreenshotRecorderConfig getConfig() {
        return this.config;
    }

    public final io.sentry.SentryOptions getOptions() {
        return this.options;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        java.lang.ref.WeakReference<android.view.View> weakReference = this.rootView;
        android.view.View view = weakReference != null ? weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Root view is invalid, not capturing screenshot", new java.lang.Object[0]);
        } else {
            this.contentChanged.set(true);
        }
    }

    public final void pause() {
        this.isCapturing.set(false);
        java.lang.ref.WeakReference<android.view.View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
    }

    public final void resume() {
        android.view.View view;
        java.lang.ref.WeakReference<android.view.View> weakReference = this.rootView;
        if (weakReference != null && (view = weakReference.get()) != null) {
            io.sentry.android.replay.util.ViewsKt.addOnDrawListenerSafe(view, this);
        }
        this.isCapturing.set(true);
    }

    public final void unbind(android.view.View root) {
        if (root != null) {
            io.sentry.android.replay.util.ViewsKt.removeOnDrawListenerSafe(root, this);
        }
    }
}
