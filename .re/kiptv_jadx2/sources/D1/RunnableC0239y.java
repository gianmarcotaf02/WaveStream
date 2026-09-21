package D1;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.app.AbstractC1483c;
import androidx.core.app.C1482b;
import androidx.lifecycle.C1542y;
import androidx.lifecycle.EnumC1532n;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.revenuecat.purchases.amazon.AmazonBilling;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.simulatedstore.SimulatedStoreBillingWrapper;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.RootViewsSpy;
import io.sentry.android.replay.WindowRecorder;
import io.sentry.util.FileUtils;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import org.videolan.libvlc.LibVLC;
import org.videolan.libvlc.MediaPlayer;
import org.videolan.libvlc.VLCObject;
import p105m2.C2608f;
import p105m2.C2611i;
import p105m2.C2626y;

public final class RunnableC0239y implements Runnable {

    public final int f2075h;

    public final Object f2076i;

    public RunnableC0239y(int i3, Object obj) {
        this.f2075h = i3;
        this.f2076i = obj;
    }

    @Override
    public final void run() {
        Object obj;
        ?? r9;
        ?? r10;
        Application application;
        View viewFindFocus;
        Object objT;
        Object objT2;
        int i3 = 18;
        Boolean bool = null;
        Application application2 = null;
        ?? r11 = 1;
        r11 = 1;
        switch (this.f2075h) {
            case 0:
                View view = (View) this.f2076i;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 1:
                Object obj2 = ((kotlin.jvm.internal.A) this.f2076i).f24539h;
                throw null;
            case 2:
                new F6.a(((Exception) this.f2076i).getMessage());
                throw null;
            case 3:
                ActionMode actionMode = ((O.i) this.f2076i).f7539h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 4:
                R0.D d4 = (R0.D) this.f2076i;
                Trace.beginSection("measureAndLayout");
                try {
                    d4.f8763k.t(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        d4.n();
                        Trace.endSection();
                        d4.f8758Q = false;
                        return;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
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
                                throw new RuntimeException("fetchFonts result is not OK. (" + i9 + ")");
                            }
                            try {
                                int i10 = p204z1.d.f32142a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                B3.o oVar = rVar.f9708c;
                                Context context = rVar.f9706a;
                                oVar.getClass();
                                A1.j[] jVarArr = {jVarC};
                                com.google.common.util.concurrent.D d6 = p182w1.d.f29765a;
                                AbstractC1833d1.h("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceK = p182w1.d.f29765a.k(context, jVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferL0 = com.google.common.util.concurrent.P.l0(rVar.f9706a, jVarC.f149a);
                                    if (mappedByteBufferL0 == null || typefaceK == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        A7.m mVar = new A7.m(typefaceK, P3.e.k0(mappedByteBufferL0));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (rVar.f9709d) {
                                            try {
                                                N3.a aVar = rVar.f9712h;
                                                if (aVar != null) {
                                                    aVar.A(mVar);
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                            break;
                                        }
                                        rVar.b();
                                        return;
                                    } catch (Throwable th4) {
                                        int i11 = p204z1.d.f32142a;
                                        Trace.endSection();
                                        throw th4;
                                    }
                                } catch (Throwable th5) {
                                    Trace.endSection();
                                    throw th5;
                                }
                            } catch (Throwable th6) {
                                int i12 = p204z1.d.f32142a;
                                Trace.endSection();
                                throw th6;
                            }
                            break;
                        } catch (Throwable th7) {
                            synchronized (rVar.f9709d) {
                                try {
                                    N3.a aVar2 = rVar.f9712h;
                                    if (aVar2 != null) {
                                        aVar2.z(th7);
                                    }
                                    rVar.b();
                                    return;
                                } catch (Throwable th8) {
                                    throw th8;
                                }
                            }
                        }
                    } catch (Throwable th9) {
                        throw th9;
                    }
                }
            case 6:
                Y.t.setRippleState$lambda$2((Y.t) this.f2076i);
                return;
            case 7:
                Activity activity = (Activity) this.f2076i;
                if (activity.isFinishing()) {
                    return;
                }
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 28) {
                    Class cls = AbstractC1483c.f16016a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC1483c.f16016a;
                C1482b c1482b = 27;
                boolean z6 = i13 == 26 || i13 == 27;
                Method method = AbstractC1483c.f16021f;
                if ((!z6 || method != null) && (AbstractC1483c.f16020e != null || AbstractC1483c.f16019d != null)) {
                    try {
                        Object obj3 = AbstractC1483c.f16018c.get(activity);
                        if (obj3 != null && (obj = AbstractC1483c.f16017b.get(activity)) != null) {
                            application2 = activity.getApplication();
                            c1482b = new C1482b(activity);
                            application2.registerActivityLifecycleCallbacks(c1482b);
                            Handler handler = AbstractC1483c.g;
                            handler.post(new com.google.common.util.concurrent.C(c1482b, obj3, 17));
                            if (i13 != 26 && i13 != 27) {
                                r11 = 0;
                            }
                            try {
                                if (r11 != 0) {
                                    Handler handler2 = handler;
                                    try {
                                        Boolean bool2 = Boolean.FALSE;
                                        method.invoke(obj, obj3, null, null, 0, bool2, null, null, bool2, bool2);
                                        r11 = handler2;
                                    } catch (Throwable th10) {
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
                            } catch (Throwable th11) {
                                th = th11;
                                application = application2;
                                r10 = r11;
                                r9 = c1482b;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 8:
                ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) this.f2076i;
                int i14 = processLifecycleOwner.f16310i;
                C1542y c1542y = processLifecycleOwner.f16313m;
                if (i14 == 0) {
                    processLifecycleOwner.j = true;
                    c1542y.e(EnumC1532n.ON_PAUSE);
                }
                if (processLifecycleOwner.f16309h == 0 && processLifecycleOwner.j) {
                    c1542y.e(EnumC1532n.ON_STOP);
                    processLifecycleOwner.f16311k = true;
                    return;
                }
                return;
            case 9:
                ((DefaultAnalyticsCollector) this.f2076i).releaseInternal();
                return;
            case 10:
                ((AdsMediaSource) this.f2076i).maybeUpdateSourceInfo();
                return;
            case 11:
                ((DefaultTrackSelector) this.f2076i).maybeInvalidateForAudioChannelCountConstraints();
                return;
            case 12:
                p019c.h hVar = (p019c.h) this.f2076i;
                Runnable runnable = hVar.f18038i;
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
                ((AmazonBilling) this.f2076i).performStartConnection();
                return;
            case 16:
                Dispatcher.enqueue$lambda$3$lambda$2$lambda$1((Throwable) this.f2076i);
                return;
            case 17:
                ((SimulatedStoreBillingWrapper) this.f2076i).performStartConnection$purchases_defaultsRelease();
                return;
            case 18:
                g1.A a2 = (g1.A) this.f2076i;
                a2.f21782n = null;
                View view2 = a2.f21771a;
                boolean zIsFocused = view2.isFocused();
                p038e0.e eVar = a2.f21781m;
                if (!zIsFocused && (viewFindFocus = view2.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    eVar.i();
                    return;
                }
                Object[] objArr = eVar.f21324h;
                int i15 = eVar.j;
                Boolean boolValueOf = null;
                for (int i16 = 0; i16 < i15; i16++) {
                    g1.z zVar = (g1.z) objArr[i16];
                    int iOrdinal = zVar.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            bool = Boolean.FALSE;
                        } else {
                            if (iOrdinal != 2 && iOrdinal != 3) {
                                throw new I3.b();
                            }
                            if (!kotlin.jvm.internal.m.a(bool, Boolean.FALSE)) {
                                boolValueOf = Boolean.valueOf(zVar == g1.z.j);
                            }
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    boolValueOf = bool;
                }
                eVar.i();
                boolean zA = kotlin.jvm.internal.m.a(bool, Boolean.TRUE);
                android.support.v4.media.session.q qVar = a2.f21772b;
                if (zA) {
                    ((InputMethodManager) qVar.j.getValue()).restartInput((View) qVar.f15617i);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((A.a) ((p166t3.i) qVar.f15618k).f27782i).M();
                    } else {
                        ((A.a) ((p166t3.i) qVar.f15618k).f27782i).F();
                    }
                }
                if (kotlin.jvm.internal.m.a(bool, Boolean.FALSE)) {
                    ((InputMethodManager) qVar.j.getValue()).restartInput((View) qVar.f15617i);
                    return;
                }
                return;
            case 19:
                ReplayIntegration.finalizePreviousReplay$lambda$10((ReplayIntegration) this.f2076i);
                return;
            case 20:
                RootViewsSpy.Companion.install$lambda$1$lambda$0((RootViewsSpy) this.f2076i);
                return;
            case 21:
                WindowRecorder.start$lambda$1((WindowRecorder) this.f2076i);
                return;
            case 22:
                FileUtils.deleteRecursively((File) this.f2076i);
                return;
            case 23:
                try {
                    ((LibVLC) this.f2076i).release();
                    objT = p070h6.A.f22523a;
                    break;
                } catch (Throwable th12) {
                    objT = com.google.common.util.concurrent.P.T(th12);
                }
                Throwable thA = p070h6.n.a(objT);
                if (thA != null) {
                    B2.a.v("Off-main LibVLC release failed: ", thA.getMessage(), "VLCPlayerEngine");
                    return;
                }
                return;
            case 24:
                MediaPlayer mediaPlayer = (MediaPlayer) this.f2076i;
                Object objT3 = p070h6.A.f22523a;
                try {
                    mediaPlayer.stop();
                    objT2 = objT3;
                } catch (Throwable th13) {
                    objT2 = com.google.common.util.concurrent.P.T(th13);
                }
                Throwable thA2 = p070h6.n.a(objT2);
                if (thA2 != null) {
                    B2.a.v("Off-main stop failed: ", thA2.getMessage(), "VLCPlayerEngine");
                }
                try {
                    mediaPlayer.release();
                    break;
                } catch (Throwable th14) {
                    objT3 = com.google.common.util.concurrent.P.T(th14);
                }
                Throwable thA3 = p070h6.n.a(objT3);
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
                ((C2608f) this.f2076i).k();
                return;
            case 27:
                ((C2611i) this.f2076i).f25329n = -1;
                return;
            case 28:
                ((C2626y) this.f2076i).b();
                return;
            default:
                ((A8.m) this.f2076i).invoke();
                return;
        }
    }

    public RunnableC0239y(p085j5.a0 a0Var, VLCObject vLCObject, int i3) {
        this.f2075h = i3;
        this.f2076i = vLCObject;
    }
}
