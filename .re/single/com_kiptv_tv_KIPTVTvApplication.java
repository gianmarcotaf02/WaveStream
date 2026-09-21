package com.kiptv.tv;

import C5.C0119j;
import D5.C0261o;
import E2.C0276c;
import E2.y;
import E2.z;
import O2.j;
import O7.q;
import S7.C;
import S7.M;
import U4.g;
import X5.f;
import X7.c;
import Y2.L;
import Z5.b;
import Z7.d;
import Z7.e;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.D;
import com.google.common.util.concurrent.P;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesConfiguration;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import io.sentry.ProfilingTraceData;
import io.sentry.Sentry;
import io.sentry.android.core.SentryAndroid;
import io.sentry.protocol.Device;
import io.sentry.protocol.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;
import p005a5.B3;
import p005a5.C1357o0;
import p005a5.C1379q2;
import p005a5.D1;
import p015b5.AbstractC1664a;
import p015b5.k;
import p015b5.w;
import p020c0.C1704s0;
import p116n5.i;
import p116n5.l;
import p116n5.n;
import p121o0.p;
import p132p5.a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/kiptv/tv/KIPTVTvApplication;", "Landroid/app/Application;", "LE2/y;", "<init>", "()V", "Companion", "n5/i", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class KIPTVTvApplication extends Application implements y, b {
    private static final i Companion = new i();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f20990t = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20991h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f20992i = new f(new C1704s0(14, this));
    public a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C1379q2 f20993k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k f20994l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public w f20995m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f20996n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public B3 f20997o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1357o0 f20998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public D1 f20999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile int f21000r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f21001s;

    public KIPTVTvApplication() {
        e eVar = M.f9549a;
        this.f21001s = C.c(d.f13044i.plus(C.e()));
    }

    @Override // E2.y
    public final E2.w a(Context context) {
        m.e(context, "context");
        E2.d dVar = new E2.d(context, 1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new C0276c(new U2.c(), 0));
        arrayList4.add(new C0119j(new j(new C0261o(19, new io.ktor.http.a(16))), B.f24540a.b(E2.C.class), 8));
        dVar.f2773k = new E2.e(P3.e.m0(arrayList), P3.e.m0(arrayList2), P3.e.m0(arrayList3), P3.e.m0(arrayList4), P3.e.m0(arrayList5));
        dVar.j = D.B(new io.ktor.http.a(17));
        return dVar.k();
    }

    @Override // Z5.b
    public final Object b() {
        return this.f20992i.b();
    }

    public final void c() {
        if (!this.f20991h) {
            this.f20991h = true;
            p116n5.e eVar = (p116n5.e) ((n) this.f20992i.b());
            this.j = (a) eVar.f25733h.get();
            this.f20993k = (C1379q2) eVar.y.get();
            this.f20994l = (k) eVar.f25730f.get();
            this.f20995m = (w) eVar.f25724c.get();
            this.f20996n = (g) eVar.f25698A.get();
            this.f20997o = (B3) eVar.f25709M.get();
            this.f20998p = (C1357o0) eVar.f25712P.get();
            this.f20999q = (D1) eVar.f25716T.get();
        }
        super.onCreate();
    }

    public final void d(P4.d dVar, String str) {
        boolean z6 = dVar.f8140a;
        boolean z9 = dVar.f8141b;
        if (z6 || z9 || dVar.f8142c) {
            Runtime runtime = Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
            long j = 1048576;
            P4.a aVar = new P4.a((int) (jFreeMemory / j), (int) ((jMaxMemory - jFreeMemory) / j), (int) (jMaxMemory / j));
            Log.w("KIPTVTvApplication", str + " heap=" + aVar + " uiVisible=" + (this.f21000r > 0) + " — releasing " + dVar);
            if (dVar.f8140a) {
                try {
                    N2.c cVarC = ((E2.w) z.a(this)).c();
                    if (cVarC != null) {
                        synchronized (cVarC.f7306c) {
                            cVarC.f7304a.clear();
                            L l2 = cVarC.f7305b;
                            l2.f11389i = 0;
                            ((LinkedHashMap) l2.j).clear();
                        }
                    }
                } catch (Throwable th) {
                    P.T(th);
                }
            }
            if (z9) {
                try {
                    B3 b9 = this.f20997o;
                    if (b9 == null) {
                        m.k("searchRepository");
                        throw null;
                    }
                    b9.f();
                    try {
                        if (this.f20998p == null) {
                            m.k("homeFeedRepository");
                            throw null;
                        }
                    } catch (Throwable th2) {
                        P.T(th2);
                    }
                } catch (Throwable th3) {
                    P.T(th3);
                }
            }
            C.A(this.f21001s, null, new l(dVar, this, str, aVar, null), 3);
        }
    }

    @Override // android.app.Application
    public final void onCreate() {
        c();
        P4.c cVar = P4.c.f8138a;
        P4.b bVarB = cVar.b(this);
        Set set = AbstractC1664a.f17935a;
        if (this.j == null) {
            m.k("appConfig");
            throw null;
        }
        if (!AbstractC1664a.f17936b) {
            if (q.N0("https://4o2LmyQzL91ppUUVAVVuaMoa@s2357704.eu-fsn-3.betterstackdata.com/2357704")) {
                Log.i("CrashReporting", "Sentry DSN blank — crash reporting disabled");
            } else {
                try {
                    AbstractC1664a.f17938d = getApplicationContext();
                    SentryAndroid.init(this, new F1.e(14, this));
                    AbstractC1664a.f17936b = true;
                    String str = AbstractC1664a.f17937c;
                    if (str != null) {
                        User user = new User();
                        user.setId(str);
                        Sentry.setUser(user);
                        Sentry.setTag("supabase_user_id", str);
                    }
                    Log.i("CrashReporting", "Sentry initialized");
                } catch (Throwable th) {
                    Log.e("CrashReporting", "Sentry init failed: " + th.getMessage(), th);
                }
            }
        }
        Set set2 = AbstractC1664a.f17935a;
        P4.b bVarB2 = cVar.b(this);
        long j = 1048576;
        Map mapN0 = p078i6.C.N0(new p070h6.k(ProfilingTraceData.JsonKeys.DEVICE_MODEL, Build.MODEL), new p070h6.k(ProfilingTraceData.JsonKeys.DEVICE_MANUFACTURER, Build.MANUFACTURER), new p070h6.k("device_name", Build.DEVICE), new p070h6.k("android_api", String.valueOf(Build.VERSION.SDK_INT)), new p070h6.k("low_ram_flag", String.valueOf(bVarB2.f8133a)), new p070h6.k("low_memory_mode", String.valueOf(bVarB2.f8137e)), new p070h6.k("memory_class_mb", String.valueOf(bVarB2.f8134b)), new p070h6.k("large_memory_class_mb", String.valueOf(bVarB2.f8135c)), new p070h6.k("total_ram_mb", String.valueOf((int) (bVarB2.f8136d / j))));
        if (AbstractC1664a.f17936b) {
            try {
                for (Map.Entry entry : mapN0.entrySet()) {
                    Sentry.setTag((String) entry.getKey(), (String) entry.getValue());
                }
            } catch (Throwable th2) {
                B2.a.v("Sentry setDeviceContext failed: ", th2.getMessage(), "CrashReporting");
            }
        }
        int i3 = (int) (bVarB.f8136d / j);
        int i9 = bVarB.f8135c;
        boolean z6 = bVarB.f8133a;
        String strB = P4.e.b();
        StringBuilder sbS = p.s(i3, i9, "Device memory: totalRam=", "MB heapLimit=", "MB lowRamFlag=");
        sbS.append(z6);
        sbS.append(" → policy=");
        sbS.append(strB);
        Log.i("KIPTVTvApplication", sbS.toString());
        final C1379q2 c1379q2 = this.f20993k;
        if (c1379q2 == null) {
            m.k("purchaseRepository");
            throw null;
        }
        if (!c1379q2.f14996v) {
            c1379q2.f14981e.getClass();
            if (q.N0("goog_pwtqqIXOdJMQjIRJqQzTGVewOuN")) {
                Log.i("PurchaseRepo", "RevenueCat API key blank — purchases disabled");
            } else {
                try {
                    Purchases.Companion companion = Purchases.INSTANCE;
                    companion.setLogLevel(LogLevel.WARN);
                    companion.configure(new PurchasesConfiguration.Builder(this, "goog_pwtqqIXOdJMQjIRJqQzTGVewOuN").build());
                    companion.getSharedInstance().setUpdatedCustomerInfoListener(new UpdatedCustomerInfoListener() { // from class: a5.a2
                        @Override // com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener
                        public final void onReceived(CustomerInfo info) {
                            m.e(info, "info");
                            c1379q2.h(info);
                        }
                    });
                    c1379q2.f14996v = true;
                    Log.i("PurchaseRepo", "RevenueCat configured");
                } catch (Throwable th3) {
                    Log.e("PurchaseRepo", "RevenueCat configure failed: " + th3.getMessage(), th3);
                }
            }
        }
        w wVar = this.f20995m;
        if (wVar == null) {
            m.k("notificationService");
            throw null;
        }
        wVar.a();
        registerActivityLifecycleCallbacks(new p116n5.m(this));
        e eVar = M.f9549a;
        C.A(C.c(d.f13044i.plus(C.e())), null, new p116n5.k(this, null), 3);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        boolean z6 = !(this.f21000r > 0);
        d(new P4.d(true, z6, z6), Device.JsonKeys.LOW_MEMORY);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        P4.d dVar;
        super.onTrimMemory(i3);
        boolean z6 = this.f21000r > 0;
        if (i3 < 10) {
            dVar = P4.e.f8143a;
        } else if (z6 || i3 < 20) {
            dVar = i3 >= 15 ? new P4.d(true, false, false) : new P4.d(true, false, false);
        } else {
            dVar = new P4.d(true, true, true);
        }
        d(dVar, "trim_memory level=" + i3);
    }
}
