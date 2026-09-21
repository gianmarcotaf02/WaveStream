package B3;

import D1.U;
import Y1.AbstractComponentCallbacksC1029n;
import Y1.DialogInterfaceOnCancelListenerC1025j;
import Y2.C1033c;
import Y2.C1040j;
import Y2.H;
import Y2.S;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.gms.internal.play_billing.V0;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import p077i5.P;
import p103m.C2570j;
import p103m.C2581o0;
import p105m2.a0;

public final class r implements Runnable {

    public final int f656h;

    public final Object f657i;

    public r(int i3, Object obj) {
        this.f656h = i3;
        this.f657i = obj;
    }

    @Override
    public final void run() {
        C2570j c2570j;
        z8.a aVarC;
        long jNanoTime;
        switch (this.f656h) {
            case 0:
                s sVar = (s) this.f657i;
                synchronized (s.f658i) {
                    try {
                        if (sVar.d()) {
                            sVar.f(15);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
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
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f3845e = jCurrentAnimationTimeMillis;
                        aVar.g = -1L;
                        aVar.f3846f = jCurrentAnimationTimeMillis;
                        aVar.f3847h = 0.5f;
                    }
                    if ((aVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.g + ((long) aVar.f3848i)) || !dVar.e()) {
                        dVar.f3862v = false;
                        return;
                    }
                    boolean z9 = dVar.f3861u;
                    ListView listView = dVar.j;
                    if (z9) {
                        dVar.f3861u = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f3846f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - aVar.f3846f;
                    aVar.f3846f = jCurrentAnimationTimeMillis2;
                    dVar.f3864x.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.f3844d));
                    WeakHashMap weakHashMap = U.f1980a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 5:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.f657i;
                androidComposeView.removeCallbacks(this);
                MotionEvent motionEvent = androidComposeView.f15878B0;
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
                    AndroidComposeView androidComposeView2 = (AndroidComposeView) this.f657i;
                    androidComposeView2.I(motionEvent, i3, androidComposeView2.f15880C0, false);
                    return;
                }
                return;
            case 6:
                DialogInterfaceOnCancelListenerC1025j dialogInterfaceOnCancelListenerC1025j = (DialogInterfaceOnCancelListenerC1025j) this.f657i;
                dialogInterfaceOnCancelListenerC1025j.f11271a0.onDismiss(dialogInterfaceOnCancelListenerC1025j.f11279i0);
                return;
            case 7:
                AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = (AbstractComponentCallbacksC1029n) this.f657i;
                if (abstractComponentCallbacksC1029n.f11307N != null) {
                    abstractComponentCallbacksC1029n.k().getClass();
                    return;
                }
                return;
            case 8:
                ((Y1.D) this.f657i).y(true);
                return;
            case 9:
                H h9 = (H) this.f657i;
                C1033c c1033c = h9.f11380k;
                c1033c.A(0);
                C1040j c1040j = S.f11411k;
                c1033c.z(24, c1040j);
                h9.c(c1040j);
                return;
            case 10:
                try {
                    ((Runnable) this.f657i).run();
                    return;
                } catch (Exception e6) {
                    V0.r(e6, "Executor", "Background execution failure.");
                    return;
                }
            case 11:
                LinkedHashSet linkedHashSet = p092k5.b.f24486a;
                P p2 = (P) this.f657i;
                linkedHashSet.remove(p2);
                p092k5.b.f24487b.remove(p2);
                if (linkedHashSet.isEmpty()) {
                    p092k5.b.a();
                    return;
                }
                return;
            case 12:
                C2581o0 c2581o0 = (C2581o0) this.f657i;
                c2581o0.f25098s = null;
                c2581o0.drawableStateChanged();
                return;
            case 13:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f657i;
                if (searchView$SearchAutoComplete.f15737m) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f15737m = false;
                    return;
                }
                return;
            case 14:
                ActionMenuView actionMenuView = ((Toolbar) this.f657i).f15760h;
                if (actionMenuView == null || (c2570j = actionMenuView.f15716A) == null) {
                    return;
                }
                c2570j.l();
                return;
            case 15:
                ((a0) this.f657i).g();
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
            boolean zIsLoggable = z8.c.j.isLoggable(Level.FINE);
            if (zIsLoggable) {
                y7.m mVar = bVar.f32960a.f32968a;
                jNanoTime = System.nanoTime();
                com.google.common.util.concurrent.D.c(aVarC, bVar, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                z8.c.a(cVar3, aVarC);
                if (zIsLoggable) {
                    y7.m mVar2 = bVar.f32960a.f32968a;
                    com.google.common.util.concurrent.D.c(aVarC, bVar, "finished run in ".concat(com.google.common.util.concurrent.D.s(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th2) {
                try {
                    ((ThreadPoolExecutor) cVar3.f32968a.f32077h).execute(this);
                    throw th2;
                } catch (Throwable th3) {
                    if (zIsLoggable) {
                        y7.m mVar3 = bVar.f32960a.f32968a;
                        com.google.common.util.concurrent.D.c(aVarC, bVar, "failed a run in ".concat(com.google.common.util.concurrent.D.s(System.nanoTime() - jNanoTime)));
                    }
                    throw th3;
                }
            }
        }
    }
}
