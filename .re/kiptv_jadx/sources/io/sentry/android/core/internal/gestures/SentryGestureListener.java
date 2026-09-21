package io.sentry.android.core.internal.gestures;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryGestureListener implements android.view.GestureDetector.OnGestureListener {
    private static final java.lang.String TRACE_ORIGIN = "auto.ui.gesture_listener";
    static final java.lang.String UI_ACTION = "ui.action";
    private final java.lang.ref.WeakReference<android.app.Activity> activityRef;
    private final io.sentry.android.core.SentryAndroidOptions options;
    private final io.sentry.IScopes scopes;
    private io.sentry.internal.gestures.UiElement activeUiElement = null;
    private io.sentry.ITransaction activeTransaction = null;
    private io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType activeEventType = io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType.Unknown;
    private final io.sentry.android.core.internal.gestures.SentryGestureListener.ScrollState scrollState = new io.sentry.android.core.internal.gestures.SentryGestureListener.ScrollState(null);

    /* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.SentryGestureListener$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$android$core$internal$gestures$SentryGestureListener$GestureType;

        static {
            int[] iArr = new int[io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType.values().length];
            $SwitchMap$io$sentry$android$core$internal$gestures$SentryGestureListener$GestureType = iArr;
            try {
                iArr[io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType.Click.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$android$core$internal$gestures$SentryGestureListener$GestureType[io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType.Scroll.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$android$core$internal$gestures$SentryGestureListener$GestureType[io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType.Swipe.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$sentry$android$core$internal$gestures$SentryGestureListener$GestureType[io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType.Unknown.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public enum GestureType {
        Click,
        Scroll,
        Swipe,
        Unknown
    }

    public SentryGestureListener(android.app.Activity activity, io.sentry.IScopes iScopes, io.sentry.android.core.SentryAndroidOptions sentryAndroidOptions) {
        this.activityRef = new java.lang.ref.WeakReference<>(activity);
        this.scopes = iScopes;
        this.options = sentryAndroidOptions;
    }

    private void addBreadcrumb(io.sentry.internal.gestures.UiElement uiElement, io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType gestureType, java.util.Map<java.lang.String, java.lang.Object> map, android.view.MotionEvent motionEvent) {
        if (this.options.isEnableUserInteractionBreadcrumbs()) {
            java.lang.String gestureType2 = getGestureType(gestureType);
            io.sentry.Hint hint = new io.sentry.Hint();
            hint.set(io.sentry.TypeCheckHint.ANDROID_MOTION_EVENT, motionEvent);
            hint.set(io.sentry.TypeCheckHint.ANDROID_VIEW, uiElement.getView());
            this.scopes.addBreadcrumb(io.sentry.Breadcrumb.userInteraction(gestureType2, uiElement.getResourceName(), uiElement.getClassName(), uiElement.getTag(), map), hint);
        }
    }

    private android.view.View ensureWindowDecorView(java.lang.String str) {
        android.app.Activity activity = this.activityRef.get();
        if (activity == null) {
            this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, Y6.f.h("Activity is null in ", str, ". No breadcrumb captured."), new java.lang.Object[0]);
            return null;
        }
        android.view.Window window = activity.getWindow();
        if (window == null) {
            this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, Y6.f.h("Window is null in ", str, ". No breadcrumb captured."), new java.lang.Object[0]);
            return null;
        }
        android.view.View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, Y6.f.h("DecorView is null in ", str, ". No breadcrumb captured."), new java.lang.Object[0]);
        return null;
    }

    private java.lang.String getActivityName(android.app.Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private static java.lang.String getGestureType(io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType gestureType) {
        int i3 = io.sentry.android.core.internal.gestures.SentryGestureListener.AnonymousClass1.$SwitchMap$io$sentry$android$core$internal$gestures$SentryGestureListener$GestureType[gestureType.ordinal()];
        if (i3 == 1) {
            return "click";
        }
        if (i3 != 2) {
            return i3 != 3 ? "unknown" : "swipe";
        }
        return "scroll";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyScope$3(io.sentry.IScope iScope, io.sentry.ITransaction iTransaction, io.sentry.ITransaction iTransaction2) {
        if (iTransaction2 == null) {
            iScope.setTransaction(iTransaction);
        } else {
            this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", iTransaction.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearScope$2(io.sentry.IScope iScope, io.sentry.ITransaction iTransaction) {
        if (iTransaction == this.activeTransaction) {
            iScope.clearTransaction();
        }
    }

    private void startTracing(io.sentry.internal.gestures.UiElement uiElement, io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType gestureType) {
        boolean z6 = gestureType == io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType.Click || !(gestureType == this.activeEventType && uiElement.equals(this.activeUiElement));
        if (!this.options.isTracingEnabled() || !this.options.isEnableUserInteractionTracing()) {
            if (z6) {
                if (this.options.isEnableAutoTraceIdGeneration()) {
                    io.sentry.util.TracingUtils.startNewTrace(this.scopes);
                }
                this.activeUiElement = uiElement;
                this.activeEventType = gestureType;
                return;
            }
            return;
        }
        android.app.Activity activity = this.activityRef.get();
        if (activity == null) {
            this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Activity is null, no transaction captured.", new java.lang.Object[0]);
            return;
        }
        java.lang.String identifier = uiElement.getIdentifier();
        io.sentry.ITransaction iTransaction = this.activeTransaction;
        if (iTransaction != null) {
            if (!z6 && !iTransaction.isFinished()) {
                this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, Y6.f.h("The view with id: ", identifier, " already has an ongoing transaction assigned. Rescheduling finish"), new java.lang.Object[0]);
                if (this.options.getIdleTimeout() != null) {
                    this.activeTransaction.scheduleFinish();
                    return;
                }
                return;
            }
            stopTracing(io.sentry.SpanStatus.OK);
        }
        java.lang.String strO = B2.a.o(new java.lang.StringBuilder(), getActivityName(activity), ".", identifier);
        java.lang.String str = "ui.action." + getGestureType(gestureType);
        io.sentry.TransactionOptions transactionOptions = new io.sentry.TransactionOptions();
        transactionOptions.setWaitForChildren(true);
        transactionOptions.setDeadlineTimeout(30000L);
        transactionOptions.setIdleTimeout(this.options.getIdleTimeout());
        transactionOptions.setTrimEnd(true);
        transactionOptions.setOrigin("auto.ui.gesture_listener." + uiElement.getOrigin());
        io.sentry.ITransaction iTransactionStartTransaction = this.scopes.startTransaction(new io.sentry.TransactionContext(strO, io.sentry.protocol.TransactionNameSource.COMPONENT, str), transactionOptions);
        this.scopes.configureScope(new F.f0(this, iTransactionStartTransaction, 16));
        this.activeTransaction = iTransactionStartTransaction;
        this.activeUiElement = uiElement;
        this.activeEventType = gestureType;
    }

    /* JADX INFO: renamed from: applyScope, reason: merged with bridge method [inline-methods] */
    public void lambda$startTracing$0(io.sentry.IScope iScope, io.sentry.ITransaction iTransaction) {
        iScope.withTransaction(new androidx.media3.exoplayer.source.h(this, iScope, iTransaction, 2));
    }

    /* JADX INFO: renamed from: clearScope, reason: merged with bridge method [inline-methods] */
    public void lambda$stopTracing$1(io.sentry.IScope iScope) {
        iScope.withTransaction(new F.f0(this, iScope, 15));
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.scrollState.reset();
        this.scrollState.startX = motionEvent.getX();
        this.scrollState.startY = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f9, float f10) {
        this.scrollState.type = io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f9, float f10) {
        android.view.View viewEnsureWindowDecorView = ensureWindowDecorView("onScroll");
        if (viewEnsureWindowDecorView != null && motionEvent != null && this.scrollState.type == io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType.Unknown) {
            io.sentry.internal.gestures.UiElement uiElementFindTarget = io.sentry.android.core.internal.gestures.ViewUtils.findTarget(this.options, viewEnsureWindowDecorView, motionEvent.getX(), motionEvent.getY(), io.sentry.internal.gestures.UiElement.Type.SCROLLABLE);
            if (uiElementFindTarget == null) {
                this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new java.lang.Object[0]);
                return false;
            }
            this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Scroll target found: " + uiElementFindTarget.getIdentifier(), new java.lang.Object[0]);
            this.scrollState.setTarget(uiElementFindTarget);
            this.scrollState.type = io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType.Scroll;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        android.view.View viewEnsureWindowDecorView = ensureWindowDecorView("onSingleTapUp");
        if (viewEnsureWindowDecorView != null && motionEvent != null) {
            io.sentry.internal.gestures.UiElement uiElementFindTarget = io.sentry.android.core.internal.gestures.ViewUtils.findTarget(this.options, viewEnsureWindowDecorView, motionEvent.getX(), motionEvent.getY(), io.sentry.internal.gestures.UiElement.Type.CLICKABLE);
            if (uiElementFindTarget == null) {
                this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Unable to find click target. No breadcrumb captured.", new java.lang.Object[0]);
                return false;
            }
            io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType gestureType = io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType.Click;
            addBreadcrumb(uiElementFindTarget, gestureType, java.util.Collections.EMPTY_MAP, motionEvent);
            startTracing(uiElementFindTarget, gestureType);
        }
        return false;
    }

    public void onUp(android.view.MotionEvent motionEvent) {
        android.view.View viewEnsureWindowDecorView = ensureWindowDecorView("onUp");
        io.sentry.internal.gestures.UiElement uiElement = this.scrollState.target;
        if (viewEnsureWindowDecorView == null || uiElement == null) {
            return;
        }
        if (this.scrollState.type == io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType.Unknown) {
            this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new java.lang.Object[0]);
            return;
        }
        addBreadcrumb(uiElement, this.scrollState.type, java.util.Collections.singletonMap("direction", this.scrollState.calculateDirection(motionEvent)), motionEvent);
        startTracing(uiElement, this.scrollState.type);
        this.scrollState.reset();
    }

    public void stopTracing(io.sentry.SpanStatus spanStatus) {
        io.sentry.ITransaction iTransaction = this.activeTransaction;
        if (iTransaction != null) {
            if (iTransaction.getStatus() == null) {
                this.activeTransaction.finish(spanStatus);
            } else {
                this.activeTransaction.finish();
            }
        }
        this.scopes.configureScope(new F1.e(18, this));
        this.activeTransaction = null;
        if (this.activeUiElement != null) {
            this.activeUiElement = null;
        }
        this.activeEventType = io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType.Unknown;
    }

    public static final class ScrollState {
        private float startX;
        private float startY;
        private io.sentry.internal.gestures.UiElement target;
        private io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType type;

        private ScrollState() {
            this.type = io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType.Unknown;
            this.startX = 0.0f;
            this.startY = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.String calculateDirection(android.view.MotionEvent motionEvent) {
            float x9 = motionEvent.getX() - this.startX;
            float y = motionEvent.getY() - this.startY;
            if (java.lang.Math.abs(x9) > java.lang.Math.abs(y)) {
                return x9 > 0.0f ? androidx.media3.extractor.text.ttml.TtmlNode.RIGHT : "left";
            }
            return y > 0.0f ? "down" : "up";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.target = null;
            this.type = io.sentry.android.core.internal.gestures.SentryGestureListener.GestureType.Unknown;
            this.startX = 0.0f;
            this.startY = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTarget(io.sentry.internal.gestures.UiElement uiElement) {
            this.target = uiElement;
        }

        public /* synthetic */ ScrollState(io.sentry.android.core.internal.gestures.SentryGestureListener.AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
