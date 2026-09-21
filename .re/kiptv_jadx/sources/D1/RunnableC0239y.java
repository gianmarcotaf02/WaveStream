package D1;

/* JADX INFO: renamed from: D1.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0239y implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2076i;

    public /* synthetic */ RunnableC0239y(int i3, java.lang.Object obj) {
        this.f2075h = i3;
        this.f2076i = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v64, types: [h6.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [h6.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        ?? r9;
        ?? r10;
        android.app.Application application;
        android.view.View viewFindFocus;
        java.lang.Object objT;
        java.lang.Object objT2;
        int i3 = 18;
        java.lang.Boolean bool = null;
        android.app.Application application2 = null;
        ?? r11 = 1;
        r11 = 1;
        switch (this.f2075h) {
            case 0:
                android.view.View view = (android.view.View) this.f2076i;
                ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 1:
                java.lang.Object obj2 = ((kotlin.jvm.internal.A) this.f2076i).f24539h;
                throw null;
            case 2:
                new F6.a(((java.lang.Exception) this.f2076i).getMessage());
                throw null;
            case 3:
                android.view.ActionMode actionMode = ((O.i) this.f2076i).f7539h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 4:
                R0.D d4 = (R0.D) this.f2076i;
                android.os.Trace.beginSection("measureAndLayout");
                try {
                    d4.f8763k.t(true);
                    android.os.Trace.endSection();
                    android.os.Trace.beginSection("checkForSemanticsChanges");
                    try {
                        d4.n();
                        android.os.Trace.endSection();
                        d4.f8758Q = false;
                        return;
                    } catch (java.lang.Throwable th) {
                        android.os.Trace.endSection();
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    android.os.Trace.endSection();
                    throw th2;
                }
            case 5:
                T1.r rVar = (T1.r) this.f2076i;
                synchronized (rVar.f9709d) {
                    try {
                        if (rVar.f9712h == null) {
                            return;
                        }
                        try {
                            A1.j jVarC = rVar.c();
                            int i9 = jVarC.f153e;
                            if (i9 == 2) {
                                synchronized (rVar.f9709d) {
                                }
                            }
                            if (i9 != 0) {
                                throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + i9 + ")");
                            }
                            try {
                                int i10 = p204z1.d.f32142a;
                                android.os.Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                B3.o oVar = rVar.f9708c;
                                android.content.Context context = rVar.f9706a;
                                oVar.getClass();
                                A1.j[] jVarArr = {jVarC};
                                com.google.common.util.concurrent.D d6 = p182w1.d.f29765a;
                                com.google.android.gms.internal.play_billing.AbstractC1833d1.h("TypefaceCompat.createFromFontInfo");
                                try {
                                    android.graphics.Typeface typefaceK = p182w1.d.f29765a.k(context, jVarArr, 0);
                                    android.os.Trace.endSection();
                                    java.nio.MappedByteBuffer mappedByteBufferL0 = com.google.common.util.concurrent.P.l0(rVar.f9706a, jVarC.f149a);
                                    if (mappedByteBufferL0 == null || typefaceK == null) {
                                        throw new java.lang.RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        android.os.Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        A7.m mVar = new A7.m(typefaceK, P3.e.k0(mappedByteBufferL0));
                                        android.os.Trace.endSection();
                                        android.os.Trace.endSection();
                                        synchronized (rVar.f9709d) {
                                            try {
                                                N3.a aVar = rVar.f9712h;
                                                if (aVar != null) {
                                                    aVar.A(mVar);
                                                }
                                            } catch (java.lang.Throwable th3) {
                                                throw th3;
                                            }
                                            break;
                                        }
                                        rVar.b();
                                        return;
                                    } catch (java.lang.Throwable th4) {
                                        int i11 = p204z1.d.f32142a;
                                        android.os.Trace.endSection();
                                        throw th4;
                                    }
                                } catch (java.lang.Throwable th5) {
                                    android.os.Trace.endSection();
                                    throw th5;
                                }
                            } catch (java.lang.Throwable th6) {
                                int i12 = p204z1.d.f32142a;
                                android.os.Trace.endSection();
                                throw th6;
                            }
                            break;
                        } catch (java.lang.Throwable th7) {
                            synchronized (rVar.f9709d) {
                                try {
                                    N3.a aVar2 = rVar.f9712h;
                                    if (aVar2 != null) {
                                        aVar2.z(th7);
                                    }
                                    rVar.b();
                                    return;
                                } catch (java.lang.Throwable th8) {
                                    throw th8;
                                }
                            }
                        }
                    } catch (java.lang.Throwable th9) {
                        throw th9;
                    }
                }
            case 6:
                Y.t.setRippleState$lambda$2((Y.t) this.f2076i);
                return;
            case 7:
                android.app.Activity activity = (android.app.Activity) this.f2076i;
                if (activity.isFinishing()) {
                    return;
                }
                int i13 = android.os.Build.VERSION.SDK_INT;
                if (i13 >= 28) {
                    java.lang.Class cls = androidx.core.app.AbstractC1483c.f16016a;
                    activity.recreate();
                    return;
                }
                java.lang.Class cls2 = androidx.core.app.AbstractC1483c.f16016a;
                androidx.core.app.C1482b c1482b = 27;
                boolean z6 = i13 == 26 || i13 == 27;
                java.lang.reflect.Method method = androidx.core.app.AbstractC1483c.f16021f;
                if ((!z6 || method != null) && (androidx.core.app.AbstractC1483c.f16020e != null || androidx.core.app.AbstractC1483c.f16019d != null)) {
                    try {
                        java.lang.Object obj3 = androidx.core.app.AbstractC1483c.f16018c.get(activity);
                        if (obj3 != null && (obj = androidx.core.app.AbstractC1483c.f16017b.get(activity)) != null) {
                            application2 = activity.getApplication();
                            c1482b = new androidx.core.app.C1482b(activity);
                            application2.registerActivityLifecycleCallbacks(c1482b);
                            android.os.Handler handler = androidx.core.app.AbstractC1483c.g;
                            handler.post(new com.google.common.util.concurrent.C(c1482b, obj3, 17));
                            if (i13 != 26 && i13 != 27) {
                                r11 = 0;
                            }
                            try {
                                if (r11 != 0) {
                                    android.os.Handler handler2 = handler;
                                    try {
                                        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                                        method.invoke(obj, obj3, null, null, 0, bool2, null, null, bool2, bool2);
                                        r11 = handler2;
                                    } catch (java.lang.Throwable th10) {
                                        th = th10;
                                        application = application2;
                                        r9 = c1482b;
                                        r10 = handler2;
                                        r10.post(new com.google.common.util.concurrent.C(application, r9, i3));
                                        throw th;
                                    }
                                } else {
                                    r11 = handler;
                                    activity.recreate();
                                }
                                r11.post(new com.google.common.util.concurrent.C(application2, c1482b, i3));
                                return;
                            } catch (java.lang.Throwable th11) {
                                th = th11;
                                application = application2;
                                r10 = r11;
                                r9 = c1482b;
                            }
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 8:
                androidx.lifecycle.ProcessLifecycleOwner processLifecycleOwner = (androidx.lifecycle.ProcessLifecycleOwner) this.f2076i;
                int i14 = processLifecycleOwner.f16310i;
                androidx.lifecycle.C1542y c1542y = processLifecycleOwner.f16313m;
                if (i14 == 0) {
                    processLifecycleOwner.j = true;
                    c1542y.e(androidx.lifecycle.EnumC1532n.ON_PAUSE);
                }
                if (processLifecycleOwner.f16309h == 0 && processLifecycleOwner.j) {
                    c1542y.e(androidx.lifecycle.EnumC1532n.ON_STOP);
                    processLifecycleOwner.f16311k = true;
                    return;
                }
                return;
            case 9:
                ((androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector) this.f2076i).releaseInternal();
                return;
            case 10:
                ((androidx.media3.exoplayer.source.ads.AdsMediaSource) this.f2076i).maybeUpdateSourceInfo();
                return;
            case 11:
                ((androidx.media3.exoplayer.trackselection.DefaultTrackSelector) this.f2076i).maybeInvalidateForAudioChannelCountConstraints();
                return;
            case 12:
                p019c.h hVar = (p019c.h) this.f2076i;
                java.lang.Runnable runnable = hVar.f18038i;
                if (runnable != null) {
                    runnable.run();
                    hVar.f18038i = null;
                    return;
                }
                return;
            case 13:
                p019c.l.b((p019c.l) this.f2076i);
                return;
            case 14:
                ((p194x6.j) this.f2076i).invoke(null);
                return;
            case 15:
                ((com.revenuecat.purchases.amazon.AmazonBilling) this.f2076i).performStartConnection();
                return;
            case 16:
                com.revenuecat.purchases.common.Dispatcher.enqueue$lambda$3$lambda$2$lambda$1((java.lang.Throwable) this.f2076i);
                return;
            case 17:
                ((com.revenuecat.purchases.simulatedstore.SimulatedStoreBillingWrapper) this.f2076i).performStartConnection$purchases_defaultsRelease();
                return;
            case 18:
                g1.A a2 = (g1.A) this.f2076i;
                a2.f21782n = null;
                android.view.View view2 = a2.f21771a;
                boolean zIsFocused = view2.isFocused();
                p038e0.e eVar = a2.f21781m;
                if (!zIsFocused && (viewFindFocus = view2.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    eVar.i();
                    return;
                }
                java.lang.Object[] objArr = eVar.f21324h;
                int i15 = eVar.j;
                java.lang.Boolean boolValueOf = null;
                for (int i16 = 0; i16 < i15; i16++) {
                    g1.z zVar = (g1.z) objArr[i16];
                    int iOrdinal = zVar.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            bool = java.lang.Boolean.FALSE;
                        } else {
                            if (iOrdinal != 2 && iOrdinal != 3) {
                                throw new I3.b();
                            }
                            if (!kotlin.jvm.internal.m.a(bool, java.lang.Boolean.FALSE)) {
                                boolValueOf = java.lang.Boolean.valueOf(zVar == g1.z.j);
                            }
                        }
                    } else {
                        bool = java.lang.Boolean.TRUE;
                    }
                    boolValueOf = bool;
                }
                eVar.i();
                boolean zA = kotlin.jvm.internal.m.a(bool, java.lang.Boolean.TRUE);
                android.support.v4.media.session.q qVar = a2.f21772b;
                if (zA) {
                    ((android.view.inputmethod.InputMethodManager) qVar.j.getValue()).restartInput((android.view.View) qVar.f15617i);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((A.a) ((p166t3.i) qVar.f15618k).f27782i).M();
                    } else {
                        ((A.a) ((p166t3.i) qVar.f15618k).f27782i).F();
                    }
                }
                if (kotlin.jvm.internal.m.a(bool, java.lang.Boolean.FALSE)) {
                    ((android.view.inputmethod.InputMethodManager) qVar.j.getValue()).restartInput((android.view.View) qVar.f15617i);
                    return;
                }
                return;
            case 19:
                io.sentry.android.replay.ReplayIntegration.finalizePreviousReplay$lambda$10((io.sentry.android.replay.ReplayIntegration) this.f2076i);
                return;
            case 20:
                io.sentry.android.replay.RootViewsSpy.Companion.install$lambda$1$lambda$0((io.sentry.android.replay.RootViewsSpy) this.f2076i);
                return;
            case 21:
                io.sentry.android.replay.WindowRecorder.start$lambda$1((io.sentry.android.replay.WindowRecorder) this.f2076i);
                return;
            case 22:
                io.sentry.util.FileUtils.deleteRecursively((java.io.File) this.f2076i);
                return;
            case 23:
                try {
                    ((org.videolan.libvlc.LibVLC) this.f2076i).release();
                    objT = p070h6.A.f22523a;
                    break;
                } catch (java.lang.Throwable th12) {
                    objT = com.google.common.util.concurrent.P.T(th12);
                }
                java.lang.Throwable thA = p070h6.n.a(objT);
                if (thA != null) {
                    B2.a.v("Off-main LibVLC release failed: ", thA.getMessage(), "VLCPlayerEngine");
                    return;
                }
                return;
            case 24:
                org.videolan.libvlc.MediaPlayer mediaPlayer = (org.videolan.libvlc.MediaPlayer) this.f2076i;
                java.lang.Object objT3 = p070h6.A.f22523a;
                try {
                    mediaPlayer.stop();
                    objT2 = objT3;
                } catch (java.lang.Throwable th13) {
                    objT2 = com.google.common.util.concurrent.P.T(th13);
                }
                java.lang.Throwable thA2 = p070h6.n.a(objT2);
                if (thA2 != null) {
                    B2.a.v("Off-main stop failed: ", thA2.getMessage(), "VLCPlayerEngine");
                }
                try {
                    mediaPlayer.release();
                    break;
                } catch (java.lang.Throwable th14) {
                    objT3 = com.google.common.util.concurrent.P.T(th14);
                }
                java.lang.Throwable thA3 = p070h6.n.a(objT3);
                if (thA3 != null) {
                    B2.a.v("Off-main release failed: ", thA3.getMessage(), "VLCPlayerEngine");
                    return;
                }
                return;
            case 25:
                k3.k kVar = (k3.k) this.f2076i;
                kVar.getClass();
                ((p098l3.g) kVar.f24476d).u(new k3.h(1 == true ? 1 : 0, kVar));
                return;
            case 26:
                ((p105m2.C2608f) this.f2076i).k();
                return;
            case 27:
                ((p105m2.C2611i) this.f2076i).f25329n = -1;
                return;
            case 28:
                ((p105m2.C2626y) this.f2076i).b();
                return;
            default:
                ((A8.m) this.f2076i).invoke();
                return;
        }
    }

    public /* synthetic */ RunnableC0239y(p085j5.a0 a0Var, org.videolan.libvlc.VLCObject vLCObject, int i3) {
        this.f2075h = i3;
        this.f2076i = vLCObject;
    }
}
