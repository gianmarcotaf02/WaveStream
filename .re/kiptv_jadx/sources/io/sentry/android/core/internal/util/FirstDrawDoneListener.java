package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes4.dex */
public class FirstDrawDoneListener implements android.view.ViewTreeObserver.OnDrawListener {
    private final java.lang.Runnable callback;
    private final android.os.Handler mainThreadHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private final java.util.concurrent.atomic.AtomicReference<android.view.View> viewReference;

    private FirstDrawDoneListener(android.view.View view, java.lang.Runnable runnable) {
        this.viewReference = new java.util.concurrent.atomic.AtomicReference<>(view);
        this.callback = runnable;
    }

    private static boolean isAliveAndAttached(android.view.View view) {
        return view.getViewTreeObserver().isAlive() && view.isAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDraw$1(android.view.View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$registerForNextDraw$0(android.view.Window window, android.view.Window.Callback callback, java.lang.Runnable runnable, io.sentry.android.core.BuildInfoProvider buildInfoProvider) {
        android.view.View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            window.setCallback(callback);
            registerForNextDraw(viewPeekDecorView, runnable, buildInfoProvider);
        }
    }

    public static void registerForNextDraw(android.app.Activity activity, java.lang.Runnable runnable, io.sentry.android.core.BuildInfoProvider buildInfoProvider) {
        android.view.Window window = activity.getWindow();
        if (window != null) {
            android.view.View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                registerForNextDraw(viewPeekDecorView, runnable, buildInfoProvider);
            } else {
                android.view.Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.WindowContentChangedCallback(callback != null ? callback : new io.sentry.android.core.internal.gestures.NoOpWindowCallback(), new androidx.media3.exoplayer.source.preload.b(window, callback, runnable, buildInfoProvider, 3)));
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final android.view.View andSet = this.viewReference.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f23434h.lambda$onDraw$1(andSet);
            }
        });
        this.mainThreadHandler.postAtFrontOfQueue(this.callback);
    }

    public static void registerForNextDraw(android.view.View view, java.lang.Runnable runnable, io.sentry.android.core.BuildInfoProvider buildInfoProvider) {
        io.sentry.android.core.internal.util.FirstDrawDoneListener firstDrawDoneListener = new io.sentry.android.core.internal.util.FirstDrawDoneListener(view, runnable);
        if (buildInfoProvider.getSdkInfoVersion() < 26 && !isAliveAndAttached(view)) {
            view.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: io.sentry.android.core.internal.util.FirstDrawDoneListener.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(android.view.View view2) {
                    view2.getViewTreeObserver().addOnDrawListener(io.sentry.android.core.internal.util.FirstDrawDoneListener.this);
                    view2.removeOnAttachStateChangeListener(this);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(android.view.View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                }
            });
        } else {
            view.getViewTreeObserver().addOnDrawListener(firstDrawDoneListener);
        }
    }
}
