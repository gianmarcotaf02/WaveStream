package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes4.dex */
public class ScreenshotUtils {
    private static final long CAPTURE_TIMEOUT_MS = 1000;

    private static boolean isActivityValid(android.app.Activity activity) {
        return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$takeScreenshot$0(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.util.concurrent.CountDownLatch countDownLatch, int i3) {
        atomicBoolean.set(i3 == 0);
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$takeScreenshot$1(android.view.View view, android.graphics.Canvas canvas, io.sentry.ILogger iLogger, java.util.concurrent.CountDownLatch countDownLatch) {
        try {
            view.draw(canvas);
            countDownLatch.countDown();
        } catch (java.lang.Throwable th) {
            try {
                iLogger.log(io.sentry.SentryLevel.ERROR, "Taking screenshot failed (view.draw).", th);
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    public static byte[] takeScreenshot(android.app.Activity activity, io.sentry.ILogger iLogger, io.sentry.android.core.BuildInfoProvider buildInfoProvider) {
        return takeScreenshot(activity, io.sentry.android.core.internal.util.AndroidThreadChecker.getInstance(), iLogger, buildInfoProvider);
    }

    public static byte[] takeScreenshot(android.app.Activity activity, io.sentry.util.thread.IThreadChecker iThreadChecker, io.sentry.ILogger iLogger, io.sentry.android.core.BuildInfoProvider buildInfoProvider) {
        boolean z6;
        if (!isActivityValid(activity)) {
            iLogger.log(io.sentry.SentryLevel.DEBUG, "Activity isn't valid, not taking screenshot.", new java.lang.Object[0]);
            return null;
        }
        android.view.Window window = activity.getWindow();
        if (window == null) {
            iLogger.log(io.sentry.SentryLevel.DEBUG, "Activity window is null, not taking screenshot.", new java.lang.Object[0]);
            return null;
        }
        android.view.View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            iLogger.log(io.sentry.SentryLevel.DEBUG, "DecorView is null, not taking screenshot.", new java.lang.Object[0]);
            return null;
        }
        android.view.View rootView = viewPeekDecorView.getRootView();
        if (rootView == null) {
            iLogger.log(io.sentry.SentryLevel.DEBUG, "Root view is null, not taking screenshot.", new java.lang.Object[0]);
            return null;
        }
        if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
            iLogger.log(io.sentry.SentryLevel.DEBUG, "View's width and height is zeroed, not taking screenshot.", new java.lang.Object[0]);
            return null;
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                if (buildInfoProvider.getSdkInfoVersion() >= 26) {
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread("SentryScreenshot");
                    handlerThread.start();
                    try {
                        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
                        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
                        android.view.PixelCopy.request(window, bitmapCreateBitmap, new io.sentry.android.core.internal.util.b(atomicBoolean, countDownLatch, 0), handler);
                        z6 = countDownLatch.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS) && atomicBoolean.get();
                        handlerThread.quit();
                    } catch (java.lang.Throwable th) {
                        try {
                            iLogger.log(io.sentry.SentryLevel.ERROR, "Taking screenshot using PixelCopy failed.", th);
                            handlerThread.quit();
                            z6 = false;
                        } catch (java.lang.Throwable th2) {
                            handlerThread.quit();
                            throw th2;
                        }
                    }
                    if (z6) {
                    }
                    byteArrayOutputStream.close();
                    return null;
                }
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                if (iThreadChecker.isMainThread()) {
                    rootView.draw(canvas);
                    countDownLatch.countDown();
                } else {
                    activity.runOnUiThread(new androidx.media3.exoplayer.source.preload.b(rootView, canvas, iLogger, countDownLatch, 4));
                }
                if (!countDownLatch.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    byteArrayOutputStream.close();
                    return null;
                }
                bitmapCreateBitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                if (byteArrayOutputStream.size() <= 0) {
                    iLogger.log(io.sentry.SentryLevel.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new java.lang.Object[0]);
                    byteArrayOutputStream.close();
                    return null;
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (java.lang.Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                    throw th3;
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (java.lang.Throwable th5) {
            iLogger.log(io.sentry.SentryLevel.ERROR, "Taking screenshot failed.", th5);
            return null;
        }
    }
}
