package B3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f657i;

    public /* synthetic */ r(int i3, java.lang.Object obj) {
        this.f656h = i3;
        this.f657i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p103m.C2570j c2570j;
        z8.a aVarC;
        long jNanoTime;
        switch (this.f656h) {
            case 0:
                B3.s sVar = (B3.s) this.f657i;
                synchronized (B3.s.f658i) {
                    try {
                        if (sVar.d()) {
                            sVar.f(15);
                            return;
                        }
                        return;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            case 1:
                ((F3.s) this.f657i).f();
                return;
            case 2:
                E3.c cVar = ((F3.s) ((p166t3.i) this.f657i).f27782i).f3622d;
                cVar.b(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 3:
                ((F3.D) this.f657i).j.b(new D3.b(4, null, null));
                return;
            case 4:
                H1.d dVar = (H1.d) this.f657i;
                if (dVar.f3862v) {
                    boolean z6 = dVar.f3860t;
                    H1.a aVar = dVar.f3849h;
                    if (z6) {
                        dVar.f3860t = false;
                        long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                        aVar.f3845e = jCurrentAnimationTimeMillis;
                        aVar.g = -1L;
                        aVar.f3846f = jCurrentAnimationTimeMillis;
                        aVar.f3847h = 0.5f;
                    }
                    if ((aVar.g > 0 && android.view.animation.AnimationUtils.currentAnimationTimeMillis() > aVar.g + ((long) aVar.f3848i)) || !dVar.e()) {
                        dVar.f3862v = false;
                        return;
                    }
                    boolean z9 = dVar.f3861u;
                    android.widget.ListView listView = dVar.j;
                    if (z9) {
                        dVar.f3861u = false;
                        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f3846f == 0) {
                        throw new java.lang.RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - aVar.f3846f;
                    aVar.f3846f = jCurrentAnimationTimeMillis2;
                    dVar.f3864x.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.f3844d));
                    java.util.WeakHashMap weakHashMap = D1.U.f1980a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 5:
                androidx.compose.ui.platform.AndroidComposeView androidComposeView = (androidx.compose.ui.platform.AndroidComposeView) this.f657i;
                androidComposeView.removeCallbacks(this);
                android.view.MotionEvent motionEvent = androidComposeView.f15878B0;
                if (motionEvent != null) {
                    boolean z10 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z10) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i3 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i3 = 2;
                    }
                    androidx.compose.ui.platform.AndroidComposeView androidComposeView2 = (androidx.compose.ui.platform.AndroidComposeView) this.f657i;
                    androidComposeView2.I(motionEvent, i3, androidComposeView2.f15880C0, false);
                    return;
                }
                return;
            case 6:
                Y1.DialogInterfaceOnCancelListenerC1025j dialogInterfaceOnCancelListenerC1025j = (Y1.DialogInterfaceOnCancelListenerC1025j) this.f657i;
                dialogInterfaceOnCancelListenerC1025j.f11271a0.onDismiss(dialogInterfaceOnCancelListenerC1025j.f11279i0);
                return;
            case 7:
                Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = (Y1.AbstractComponentCallbacksC1029n) this.f657i;
                if (abstractComponentCallbacksC1029n.f11307N != null) {
                    abstractComponentCallbacksC1029n.k().getClass();
                    return;
                }
                return;
            case 8:
                ((Y1.D) this.f657i).y(true);
                return;
            case 9:
                Y2.H h9 = (Y2.H) this.f657i;
                Y2.C1033c c1033c = h9.f11380k;
                c1033c.A(0);
                Y2.C1040j c1040j = Y2.S.f11411k;
                c1033c.z(24, c1040j);
                h9.c(c1040j);
                return;
            case 10:
                try {
                    ((java.lang.Runnable) this.f657i).run();
                    return;
                } catch (java.lang.Exception e6) {
                    com.google.android.gms.internal.play_billing.V0.r(e6, "Executor", "Background execution failure.");
                    return;
                }
            case 11:
                java.util.LinkedHashSet linkedHashSet = p092k5.b.f24486a;
                p077i5.P p2 = (p077i5.P) this.f657i;
                linkedHashSet.remove(p2);
                p092k5.b.f24487b.remove(p2);
                if (linkedHashSet.isEmpty()) {
                    p092k5.b.a();
                    return;
                }
                return;
            case 12:
                p103m.C2581o0 c2581o0 = (p103m.C2581o0) this.f657i;
                c2581o0.f25098s = null;
                c2581o0.drawableStateChanged();
                return;
            case 13:
                androidx.appcompat.widget.SearchView$SearchAutoComplete searchView$SearchAutoComplete = (androidx.appcompat.widget.SearchView$SearchAutoComplete) this.f657i;
                if (searchView$SearchAutoComplete.f15737m) {
                    ((android.view.inputmethod.InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f15737m = false;
                    return;
                }
                return;
            case 14:
                androidx.appcompat.widget.ActionMenuView actionMenuView = ((androidx.appcompat.widget.Toolbar) this.f657i).f15760h;
                if (actionMenuView == null || (c2570j = actionMenuView.f15716A) == null) {
                    return;
                }
                c2570j.l();
                return;
            case 15:
                ((p105m2.a0) this.f657i).g();
                return;
            case 16:
                ((p206z3.i) this.f657i).h(false);
                return;
        }
        while (true) {
            z8.c cVar2 = (z8.c) this.f657i;
            synchronized (cVar2) {
                aVarC = cVar2.c();
            }
            if (aVarC == null) {
                return;
            }
            z8.b bVar = aVarC.f32958c;
            kotlin.jvm.internal.m.b(bVar);
            z8.c cVar3 = (z8.c) this.f657i;
            boolean zIsLoggable = z8.c.j.isLoggable(java.util.logging.Level.FINE);
            if (zIsLoggable) {
                y7.m mVar = bVar.f32960a.f32968a;
                jNanoTime = java.lang.System.nanoTime();
                com.google.common.util.concurrent.D.c(aVarC, bVar, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                z8.c.a(cVar3, aVarC);
                if (zIsLoggable) {
                    y7.m mVar2 = bVar.f32960a.f32968a;
                    com.google.common.util.concurrent.D.c(aVarC, bVar, "finished run in ".concat(com.google.common.util.concurrent.D.s(java.lang.System.nanoTime() - jNanoTime)));
                }
            } catch (java.lang.Throwable th2) {
                try {
                    ((java.util.concurrent.ThreadPoolExecutor) cVar3.f32968a.f32077h).execute(this);
                    throw th2;
                } catch (java.lang.Throwable th3) {
                    if (zIsLoggable) {
                        y7.m mVar3 = bVar.f32960a.f32968a;
                        com.google.common.util.concurrent.D.c(aVarC, bVar, "failed a run in ".concat(com.google.common.util.concurrent.D.s(java.lang.System.nanoTime() - jNanoTime)));
                    }
                    throw th3;
                }
            }
        }
    }
}
