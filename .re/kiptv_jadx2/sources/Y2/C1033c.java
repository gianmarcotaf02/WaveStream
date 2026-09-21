package Y2;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.media3.session.legacy.PlaybackStateCompat;
import com.android.billingclient.api.ProxyBillingActivity;
import com.google.android.gms.internal.play_billing.AbstractC1849j;
import com.google.android.gms.internal.play_billing.AbstractC1872t;
import com.google.android.gms.internal.play_billing.C1822a;
import com.google.android.gms.internal.play_billing.C1826b0;
import com.google.android.gms.internal.play_billing.C1829c0;
import com.google.android.gms.internal.play_billing.C1842g1;
import com.google.android.gms.internal.play_billing.C1845h1;
import com.google.android.gms.internal.play_billing.C1848i1;
import com.google.android.gms.internal.play_billing.C1854k1;
import com.google.android.gms.internal.play_billing.C1857l1;
import com.google.android.gms.internal.play_billing.C1858m;
import com.google.android.gms.internal.play_billing.C1860m1;
import com.google.android.gms.internal.play_billing.C1865p;
import com.google.android.gms.internal.play_billing.C1876v;
import com.google.android.gms.internal.play_billing.E1;
import com.google.android.gms.internal.play_billing.F1;
import com.google.android.gms.internal.play_billing.InterfaceC1828c;
import com.google.android.gms.internal.play_billing.M0;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.q1;
import com.google.android.gms.internal.play_billing.r1;
import com.google.android.gms.internal.play_billing.t1;
import com.google.android.gms.internal.play_billing.u1;
import com.revenuecat.purchases.api.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class C1033c extends AbstractC1032b {

    public boolean f11431A;

    public boolean f11432B;

    public final X2.e f11433C;

    public final boolean f11434D;

    public ExecutorService f11435E;

    public final Long f11436F;

    public final N3.a f11437G;

    public final String f11440c;

    public final String f11441d;

    public volatile F3.u f11443f;
    public final Context g;

    public final S2.a f11444h;

    public volatile InterfaceC1828c f11445i;
    public volatile H j;

    public boolean f11446k;

    public boolean f11447l;

    public boolean f11449n;

    public boolean f11450o;

    public boolean f11451p;

    public boolean f11452q;

    public boolean f11453r;

    public boolean f11454s;

    public boolean f11455t;

    public boolean f11456u;

    public boolean f11457v;

    public boolean f11458w;

    public boolean f11459x;
    public boolean y;

    public boolean f11460z;

    public final Object f11438a = new Object();

    public volatile int f11439b = 0;

    public final Handler f11442e = new Handler(Looper.getMainLooper());

    public int f11448m = 0;

    public C1033c(X2.e eVar, Context context, InterfaceC1049t interfaceC1049t, T1.f fVar) {
        long jNextLong = new Random().nextLong();
        this.f11436F = Long.valueOf(jNextLong);
        this.f11437G = AbstractC1849j.f19338a;
        this.f11440c = BuildConfig.BILLING_CLIENT_VERSION;
        String strM = m();
        this.f11441d = strM;
        this.g = context.getApplicationContext();
        q1 q1VarZ = r1.z();
        q1VarZ.c();
        r1.x((r1) q1VarZ.f19393i);
        if (strM != null) {
            q1VarZ.c();
            r1.y((r1) q1VarZ.f19393i, strM);
        }
        String packageName = this.g.getPackageName();
        q1VarZ.c();
        r1.q((r1) q1VarZ.f19393i, packageName);
        q1VarZ.c();
        r1.D((r1) q1VarZ.f19393i, jNextLong);
        fVar.getClass();
        q1VarZ.c();
        r1.w((r1) q1VarZ.f19393i);
        int i3 = Build.VERSION.SDK_INT;
        q1VarZ.c();
        r1.A((r1) q1VarZ.f19393i, i3);
        q1VarZ.d();
        G(q1VarZ, context);
        try {
            int i9 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            q1VarZ.c();
            r1.B((r1) q1VarZ.f19393i, i9);
        } catch (Throwable th) {
            AbstractC1872t.i("BillingClient", "Error getting app version code.", th);
        }
        this.f11444h = new S2.a(this.g, (r1) q1VarZ.a());
        if (interfaceC1049t == null) {
            AbstractC1872t.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f11443f = new F3.u(this.g, interfaceC1049t, this.f11444h);
        this.f11433C = eVar;
        this.f11434D = false;
        this.g.getPackageName();
    }

    public static final void G(q1 q1Var, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                int i3 = (int) (memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                q1Var.c();
                r1.v((r1) q1Var.f19393i, i3);
                String str = Build.BRAND;
                q1Var.c();
                r1.r((r1) q1Var.f19393i);
                String str2 = Build.MODEL;
                q1Var.c();
                r1.u((r1) q1Var.f19393i);
                String str3 = Build.MANUFACTURER;
                q1Var.c();
                r1.t((r1) q1Var.f19393i);
                String str4 = Build.FINGERPRINT;
                q1Var.c();
                r1.s((r1) q1Var.f19393i);
            }
        } catch (RuntimeException e6) {
            AbstractC1872t.i("BillingClient", "Runtime error while populating device info.", e6);
        }
    }

    public static Future k(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new com.google.common.util.concurrent.C(futureSubmit, runnable, 14), (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e6) {
            AbstractC1872t.i("BillingClient", "Async task throws exception!", e6);
            return null;
        }
    }

    public static String m() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void q(C1033c c1033c, int i3) {
        c1033c.f11448m = i3;
        c1033c.f11432B = i3 >= 26;
        c1033c.f11431A = i3 >= 24;
        c1033c.f11460z = i3 >= 23;
        c1033c.y = i3 >= 21;
        c1033c.f11459x = i3 >= 20;
        c1033c.f11458w = i3 >= 19;
        c1033c.f11457v = i3 >= 18;
        c1033c.f11456u = i3 >= 17;
        c1033c.f11455t = i3 >= 16;
        c1033c.f11454s = i3 >= 15;
        c1033c.f11453r = i3 >= 14;
        c1033c.f11452q = i3 >= 12;
        c1033c.f11451p = i3 >= 9;
        c1033c.f11450o = i3 >= 8;
        c1033c.f11449n = i3 >= 6;
    }

    public static void r(C1033c c1033c, int i3) {
        if (i3 != 0) {
            c1033c.A(0);
            return;
        }
        synchronized (c1033c.f11438a) {
            try {
                if (c1033c.f11439b == 3) {
                    return;
                }
                c1033c.A(2);
                F3.u uVar = c1033c.f11443f != null ? c1033c.f11443f : null;
                if (uVar != null) {
                    boolean z6 = c1033c.y;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    uVar.f3634a = z6;
                    B b9 = (B) uVar.f3639f;
                    Context context = (Context) uVar.f3635b;
                    b9.a(context, intentFilter2);
                    if (!uVar.f3634a) {
                        ((B) uVar.f3638e).a(context, intentFilter);
                        return;
                    }
                    B b10 = (B) uVar.f3638e;
                    synchronized (b10) {
                        try {
                            if (b10.f11361a) {
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(b10, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != b10.f11362b ? 4 : 2);
                            } else {
                                context.registerReceiver(b10, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                            }
                            b10.f11361a = true;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void A(int i3) {
        String str;
        String str2;
        synchronized (this.f11438a) {
            try {
                if (this.f11439b == 3) {
                    return;
                }
                int i9 = this.f11439b;
                if (i9 == 0) {
                    str = "DISCONNECTED";
                } else if (i9 != 1) {
                    str = i9 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str = "CONNECTING";
                }
                if (i3 == 0) {
                    str2 = "DISCONNECTED";
                } else if (i3 != 1) {
                    str2 = i3 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str2 = "CONNECTING";
                }
                AbstractC1872t.g("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.f11439b = i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(InterfaceC1034d interfaceC1034d) {
        int i3;
        C1040j c1040jU;
        synchronized (this.f11438a) {
            try {
                if (F()) {
                    c1040jU = u();
                } else if (this.f11439b == 1) {
                    AbstractC1872t.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    c1040jU = S.f11406d;
                    z(37, c1040jU);
                } else if (this.f11439b == 3) {
                    AbstractC1872t.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    c1040jU = S.j;
                    z(38, c1040jU);
                } else {
                    A(1);
                    C();
                    AbstractC1872t.g("BillingClient", "Starting in-app billing setup.");
                    this.j = new H(this, interfaceC1034d);
                    H h9 = this.j;
                    synchronized (h9.f11380k.f11438a) {
                        C1858m c1858m = h9.f11379i;
                        c1858m.f19357c = 0L;
                        c1858m.f19356b = false;
                        c1858m.a();
                    }
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> listQueryIntentServices = this.g.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        i3 = 41;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        i3 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                AbstractC1872t.h("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f11440c);
                                synchronized (this.f11438a) {
                                    try {
                                        if (this.f11439b == 2) {
                                            c1040jU = u();
                                        } else if (this.f11439b != 1) {
                                            AbstractC1872t.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            c1040jU = S.j;
                                            z(105, c1040jU);
                                        } else {
                                            H h10 = this.j;
                                            if (this.g.bindService(intent2, h10, 1)) {
                                                AbstractC1872t.g("BillingClient", "Service was bonded successfully.");
                                                c1040jU = null;
                                            } else {
                                                AbstractC1872t.h("BillingClient", "Connection to Billing service is blocked.");
                                                i3 = 39;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        } else {
                            AbstractC1872t.h("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    A(0);
                    AbstractC1872t.g("BillingClient", "Billing service unavailable on device.");
                    c1040jU = S.f11404b;
                    z(i3, c1040jU);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c1040jU != null) {
            interfaceC1034d.onBillingSetupFinished(c1040jU);
        }
    }

    public final void C() {
        synchronized (this.f11438a) {
            if (this.j != null) {
                try {
                    this.g.unbindService(this.j);
                    this.f11445i = null;
                    this.j = null;
                } catch (Throwable th) {
                    try {
                        AbstractC1872t.i("BillingClient", "There was an exception while unbinding service!", th);
                        this.f11445i = null;
                        this.j = null;
                    } catch (Throwable th2) {
                        this.f11445i = null;
                        this.j = null;
                        throw th2;
                    }
                }
            }
        }
    }

    public final boolean D() {
        try {
            AbstractC1872t.g("BillingClient", "Already connected or not opted into auto reconnection.");
            C1040j c1040j = S.f11410i;
            TimeUnit.MILLISECONDS.getClass();
            int i3 = c1040j.f11477a;
            if (i3 == 0) {
                AbstractC1872t.g("BillingClient", "Reconnection succeeded with result: " + i3);
            } else {
                AbstractC1872t.h("BillingClient", "Reconnection failed with result: " + i3);
            }
        } catch (Exception e6) {
            if (e6 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            AbstractC1872t.i("BillingClient", "Error during reconnection attempt: ", e6);
        }
        return F();
    }

    public final boolean E() {
        N3.a aVar = this.f11437G;
        if (aVar == null) {
            throw new NullPointerException("ticker");
        }
        long jH = aVar.H();
        long j = 30000;
        int i3 = 1;
        long jConvert = 30000;
        while (i3 <= 3) {
            try {
                if (Math.max(0L, jConvert) <= 0) {
                    AbstractC1872t.h("BillingClient", "No time remaining for reconnection attempt.");
                    return F();
                }
                AbstractC1872t.g("BillingClient", "Already connected or not opted into auto reconnection.");
                C1040j c1040j = S.f11410i;
                TimeUnit.MILLISECONDS.getClass();
                int i9 = c1040j.f11477a;
                if (i9 == 0) {
                    AbstractC1872t.g("BillingClient", "Reconnection succeeded with result: " + i9);
                    return F();
                }
                AbstractC1872t.h("BillingClient", "Reconnection failed with result: " + i9);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long jH2 = (aVar.H() - jH) + 0;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                jConvert = j - timeUnit.convert(jH2, timeUnit2);
                long j9 = j;
                long jPow = ((long) Math.pow(2.0d, i3 - 1)) * 1000;
                if (jConvert < jPow) {
                    AbstractC1872t.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return F();
                }
                if (i3 < 3 && jPow > 0) {
                    try {
                        Thread.sleep(jPow);
                        jConvert = j9 - timeUnit.convert((aVar.H() - jH) + 0, timeUnit2);
                    } catch (InterruptedException e6) {
                        Thread.currentThread().interrupt();
                        AbstractC1872t.i("BillingClient", "Error sleeping during reconnection attempt: ", e6);
                    }
                }
                i3++;
                j = j9;
            } catch (Exception e9) {
                if (e9 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                AbstractC1872t.i("BillingClient", "Error during reconnection attempt: ", e9);
            }
        }
        AbstractC1872t.h("BillingClient", "Max retries reached.");
        return F();
    }

    public final boolean F() {
        boolean z6;
        synchronized (this.f11438a) {
            try {
                z6 = false;
                if (this.f11439b == 2 && this.f11445i != null && this.j != null) {
                    z6 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    public final S2.a H(C1040j c1040j, int i3, String str, Exception exc) {
        L(i3, 9, c1040j, P.a(exc));
        AbstractC1872t.i("BillingClient", str, exc);
        return new S2.a(11, c1040j, null, false);
    }

    public final void I(int i3, int i9, C1040j c1040j) {
        C1854k1 c1854k1 = null;
        C1845h1 c1845h1 = null;
        if (c1040j.f11477a == 0) {
            int i10 = P.f11396a;
            try {
                C1848i1 c1848i1Q = C1854k1.q();
                c1848i1Q.c();
                C1854k1.p((C1854k1) c1848i1Q.f19393i, 5);
                t1 t1VarP = u1.p();
                t1VarP.c();
                u1.q((u1) t1VarP.f19393i, i9);
                u1 u1Var = (u1) t1VarP.a();
                c1848i1Q.c();
                C1854k1.t((C1854k1) c1848i1Q.f19393i, u1Var);
                c1854k1 = (C1854k1) c1848i1Q.a();
            } catch (Exception e6) {
                AbstractC1872t.i("BillingLogger", "Unable to create logging payload", e6);
            }
            y(c1854k1);
            return;
        }
        int i11 = P.f11396a;
        try {
            C1842g1 c1842g1S = C1845h1.s();
            C1857l1 c1857l1Q = C1860m1.q();
            c1857l1Q.e(c1040j.f11477a);
            String str = c1040j.f11479c;
            c1857l1Q.c();
            C1860m1.s((C1860m1) c1857l1Q.f19393i, str);
            c1857l1Q.d(i3);
            c1842g1S.d(c1857l1Q);
            c1842g1S.f(5);
            t1 t1VarP2 = u1.p();
            t1VarP2.c();
            u1.q((u1) t1VarP2.f19393i, i9);
            u1 u1Var2 = (u1) t1VarP2.a();
            c1842g1S.c();
            C1845h1.x((C1845h1) c1842g1S.f19393i, u1Var2);
            c1845h1 = (C1845h1) c1842g1S.a();
        } catch (Exception e9) {
            AbstractC1872t.i("BillingLogger", "Unable to create logging payload", e9);
        }
        x(c1845h1);
    }

    public final void J(int i3, int i9, C1040j c1040j) {
        try {
            int i10 = P.f11396a;
            x(P.b(i3, i9, c1040j, null, o1.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            AbstractC1872t.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void K(int i3, C1040j c1040j, long j) {
        try {
            int i9 = P.f11396a;
            try {
                this.f11444h.V(P.b(i3, 2, c1040j, null, o1.BROADCAST_ACTION_UNSPECIFIED), this.f11448m, j);
            } catch (Throwable th) {
                AbstractC1872t.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            AbstractC1872t.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void L(int i3, int i9, C1040j c1040j, String str) {
        try {
            int i10 = P.f11396a;
            x(P.b(i3, i9, c1040j, str, o1.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            AbstractC1872t.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void M(int i3, C1040j c1040j, long j, boolean z6) {
        try {
            int i9 = P.f11396a;
            try {
                this.f11444h.X(P.b(i3, 2, c1040j, null, o1.BROADCAST_ACTION_UNSPECIFIED), this.f11448m, j, z6);
            } catch (Throwable th) {
                AbstractC1872t.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            AbstractC1872t.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void N(int i3, C1040j c1040j, String str, long j, boolean z6) {
        try {
            int i9 = P.f11396a;
            try {
                this.f11444h.X(P.b(i3, 2, c1040j, str, o1.BROADCAST_ACTION_UNSPECIFIED), this.f11448m, j, z6);
            } catch (Throwable th) {
                AbstractC1872t.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            AbstractC1872t.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void O(C1040j c1040j) {
        if (Thread.interrupted()) {
            return;
        }
        this.f11442e.post(new com.google.common.util.concurrent.C(this, c1040j, 12));
    }

    @Override
    public void a(C1031a c1031a, com.revenuecat.purchases.google.usecase.a aVar) {
        if (k(new V3.a(this, aVar, c1031a, 5), 30000L, new com.google.common.util.concurrent.C(this, aVar, 11), s(), j()) == null) {
            C1040j c1040jV = v();
            J(25, 3, c1040jV);
            aVar.c(c1040jV);
        }
    }

    @Override
    public void b(N6.A a2, com.revenuecat.purchases.google.usecase.a aVar) {
        if (k(new V3.a(this, aVar, a2, 6), 30000L, new A1.n(this, aVar, a2, 2), s(), j()) == null) {
            C1040j c1040jV = v();
            J(25, 4, c1040jV);
            aVar.d(c1040jV, a2.f7359i);
        }
    }

    @Override
    public void c() {
        ExecutorService executorService;
        try {
            int i3 = P.f11396a;
            y(P.c(12, o1.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            AbstractC1872t.i("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f11438a) {
            try {
                if (this.f11443f != null) {
                    F3.u uVar = this.f11443f;
                    B b9 = (B) uVar.f3638e;
                    Context context = (Context) uVar.f3635b;
                    b9.b(context);
                    ((B) uVar.f3639f).b(context);
                    try {
                        AbstractC1872t.g("BillingClient", "Unbinding from service.");
                        C();
                    } catch (Throwable th2) {
                        AbstractC1872t.i("BillingClient", "There was an exception while unbinding from the service while ending connection!", th2);
                    }
                    try {
                        synchronized (this) {
                            executorService = this.f11435E;
                            if (executorService != null) {
                                executorService.shutdownNow();
                                this.f11435E = null;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            AbstractC1872t.i("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th3);
                        } catch (Throwable th4) {
                            A(3);
                            throw th4;
                        }
                    }
                    A(3);
                } else {
                    AbstractC1872t.g("BillingClient", "Unbinding from service.");
                    C();
                    synchronized (this) {
                        executorService = this.f11435E;
                        if (executorService != null) {
                            executorService.shutdownNow();
                            this.f11435E = null;
                        }
                        A(3);
                    }
                }
            } catch (Throwable th5) {
                AbstractC1872t.i("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th5);
            }
            throw th;
        }
    }

    @Override
    public final C1040j d(String str) {
        if (!D()) {
            C1040j c1040j = S.j;
            if (c1040j.f11477a != 0) {
                J(2, 5, c1040j);
                return c1040j;
            }
            try {
                int i3 = P.f11396a;
                y(P.c(5, o1.BROADCAST_ACTION_UNSPECIFIED));
                return c1040j;
            } catch (Throwable th) {
                AbstractC1872t.i("BillingClient", "Unable to log.", th);
                return c1040j;
            }
        }
        C1040j c1040j2 = S.f11403a;
        switch (str) {
            case "subscriptions":
                C1040j c1040j3 = this.f11446k ? S.f11410i : S.f11412l;
                I(9, 2, c1040j3);
                return c1040j3;
            case "subscriptionsUpdate":
                C1040j c1040j4 = this.f11447l ? S.f11410i : S.f11413m;
                I(10, 3, c1040j4);
                return c1040j4;
            case "priceChangeConfirmation":
                C1040j c1040j5 = this.f11450o ? S.f11410i : S.f11414n;
                I(35, 4, c1040j5);
                return c1040j5;
            case "bbb":
                C1040j c1040j6 = this.f11452q ? S.f11410i : S.f11419s;
                I(30, 5, c1040j6);
                return c1040j6;
            case "aaa":
                C1040j c1040j7 = this.f11454s ? S.f11410i : S.f11415o;
                I(31, 6, c1040j7);
                return c1040j7;
            case "ddd":
                C1040j c1040j8 = this.f11453r ? S.f11410i : S.f11417q;
                I(21, 7, c1040j8);
                return c1040j8;
            case "ccc":
                C1040j c1040j9 = this.f11455t ? S.f11410i : S.f11416p;
                I(19, 8, c1040j9);
                return c1040j9;
            case "eee":
                C1040j c1040j10 = this.f11455t ? S.f11410i : S.f11416p;
                I(61, 9, c1040j10);
                return c1040j10;
            case "fff":
                C1040j c1040j11 = this.f11456u ? S.f11410i : S.f11418r;
                I(20, 10, c1040j11);
                return c1040j11;
            case "ggg":
                C1040j c1040j12 = this.f11457v ? S.f11410i : S.y;
                I(32, 11, c1040j12);
                return c1040j12;
            case "hhh":
                C1040j c1040j13 = this.f11457v ? S.f11410i : S.f11425z;
                I(33, 12, c1040j13);
                return c1040j13;
            case "iii":
                C1040j c1040j14 = this.f11459x ? S.f11410i : S.f11399B;
                I(60, 13, c1040j14);
                return c1040j14;
            case "jjj":
                C1040j c1040j15 = this.y ? S.f11410i : S.f11400C;
                I(66, 14, c1040j15);
                return c1040j15;
            case "kkk":
                C1040j c1040j16 = this.f11431A ? S.f11410i : S.f11420t;
                I(83, 18, c1040j16);
                return c1040j16;
            case "lll":
                C1040j c1040j17 = this.f11460z ? S.f11410i : S.f11421u;
                I(104, 19, c1040j17);
                return c1040j17;
            case "mmm":
                C1040j c1040j18 = this.f11431A ? S.f11410i : S.f11422v;
                I(119, 20, c1040j18);
                return c1040j18;
            case "nnn":
                C1040j c1040j19 = this.f11432B ? S.f11410i : S.f11423w;
                I(TsExtractor.TS_STREAM_TYPE_DTS, 21, c1040j19);
                return c1040j19;
            default:
                AbstractC1872t.h("BillingClient", "Unsupported feature: ".concat(str));
                C1040j c1040j20 = S.f11424x;
                I(34, 1, c1040j20);
                return c1040j20;
        }
    }

    @Override
    public C1040j e(Activity activity, final C1039i c1039i) {
        boolean z6;
        String str;
        String str2;
        long j;
        String str3;
        C1040j c1040jA;
        C1044n c1044n;
        C1040j c1040j;
        long j9;
        boolean z9;
        String str4;
        Future futureK;
        String str5;
        ?? r9;
        ?? r10;
        ?? r11;
        ?? r12;
        int iA;
        int i3;
        String string;
        String str6;
        boolean z10;
        long j10;
        String str7;
        ArrayList arrayList;
        boolean z11;
        int i9;
        boolean z12 = true;
        long jNextLong = new Random().nextLong();
        if (this.f11443f == null || ((InterfaceC1049t) this.f11443f.f3636c) == null) {
            C1040j c1040j2 = S.f11401D;
            K(12, c1040j2, jNextLong);
            return c1040j2;
        }
        c1039i.getClass();
        if (!D()) {
            C1040j c1040j3 = S.j;
            K(2, c1040j3, jNextLong);
            O(c1040j3);
            return c1040j3;
        }
        synchronized (this.f11438a) {
            try {
                if (this.j != null) {
                    this.j.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(c1039i.f11475e);
        com.google.android.gms.internal.play_billing.r rVar = c1039i.f11474d;
        Iterator it = arrayList2.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            throw new ClassCastException();
        }
        C1865p c1865p = (C1865p) rVar.iterator();
        C1037g c1037g = (C1037g) (c1865p.hasNext() ? c1865p.next() : null);
        C1047q c1047q = c1037g.f11466a;
        String str8 = c1047q.f11504c;
        String str9 = c1047q.f11505d;
        if (str9.equals("subs") && !this.f11446k) {
            AbstractC1872t.h("BillingClient", "Current client doesn't support subscriptions.");
            C1040j c1040j4 = S.f11412l;
            M(9, c1040j4, jNextLong, false);
            O(c1040j4);
            return c1040j4;
        }
        if (c1039i.f11472b == null) {
            L l2 = c1039i.f11473c;
            l2.getClass();
            if (l2.f11389i == 0 && !c1039i.f11471a && !c1039i.f11476f) {
                com.google.android.gms.internal.play_billing.r rVar2 = c1039i.f11474d;
                if (rVar2 != null) {
                    int size = rVar2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((C1037g) rVar2.get(i10)).getClass();
                    }
                }
            } else if (!this.f11449n) {
                AbstractC1872t.h("BillingClient", "Current client doesn't support extra params for buy intent.");
                C1040j c1040j5 = S.f11408f;
                M(18, c1040j5, jNextLong, false);
                O(c1040j5);
                return c1040j5;
            }
        } else if (!this.f11449n) {
            AbstractC1872t.h("BillingClient", "Current client doesn't support extra params for buy intent.");
            C1040j c1040j6 = S.f11408f;
            M(18, c1040j6, jNextLong, false);
            O(c1040j6);
            return c1040j6;
        }
        if (arrayList2.size() > 1 && !this.f11455t) {
            AbstractC1872t.h("BillingClient", "Current client doesn't support multi-item purchases.");
            C1040j c1040j7 = S.f11416p;
            M(19, c1040j7, jNextLong, false);
            O(c1040j7);
            return c1040j7;
        }
        if (!rVar.isEmpty() && !this.f11456u) {
            AbstractC1872t.h("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            C1040j c1040j8 = S.f11418r;
            M(20, c1040j8, jNextLong, false);
            O(c1040j8);
            return c1040j8;
        }
        if (c1039i.f11474d.isEmpty()) {
            str2 = str8;
            j = jNextLong;
            z6 = true;
            str3 = str9;
            c1040j = S.f11410i;
            str = null;
        } else {
            C1037g c1037g2 = (C1037g) c1039i.f11474d.get(0);
            int i11 = 1;
            while (true) {
                z6 = z12;
                if (i11 >= c1039i.f11474d.size()) {
                    str = null;
                    String strOptString = c1037g2.f11466a.f11503b.optString("packageName");
                    HashMap map = new HashMap();
                    HashSet hashSet = new HashSet();
                    com.google.android.gms.internal.play_billing.r rVar3 = c1039i.f11474d;
                    str2 = str8;
                    int size2 = rVar3.size();
                    j = jNextLong;
                    int i12 = 0;
                    while (true) {
                        str3 = str9;
                        C1047q c1047q2 = c1037g2.f11466a;
                        if (i12 < size2) {
                            com.google.android.gms.internal.play_billing.r rVar4 = rVar3;
                            C1037g c1037g3 = (C1037g) rVar3.get(i12);
                            c1037g3.getClass();
                            int i13 = size2;
                            C1047q c1047q3 = c1037g3.f11466a;
                            int i14 = i12;
                            ArrayList arrayList3 = c1047q3.j;
                            String str10 = c1047q3.f11504c;
                            if (arrayList3 != null && c1037g3.f11467b == null) {
                                c1040jA = S.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str10);
                                break;
                            }
                            if (map.containsKey(str10)) {
                                c1040jA = S.a(5, "ProductId can not be duplicated. Invalid product id: " + str10 + ".");
                                break;
                            }
                            map.put(str10, c1037g3);
                            if (!c1047q2.f11505d.equals("play_pass_subs") && !c1047q3.f11505d.equals("play_pass_subs") && !strOptString.equals(c1047q3.f11503b.optString("packageName"))) {
                                c1040jA = S.a(5, "All products must have the same package name.");
                                break;
                            }
                            i12 = i14 + 1;
                            str9 = str3;
                            size2 = i13;
                            rVar3 = rVar4;
                            hashSet = hashSet;
                        } else {
                            Iterator it2 = hashSet.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    ArrayList arrayList4 = c1047q2.f11510k;
                                    String str11 = c1037g2.f11467b;
                                    if (str11 != null && arrayList4 != null) {
                                        Iterator it3 = arrayList4.iterator();
                                        do {
                                            if (!it3.hasNext()) {
                                                c1044n = null;
                                                break;
                                            }
                                            c1044n = (C1044n) it3.next();
                                        } while (!str11.equals(c1044n.f11487d));
                                        if (c1044n != null && c1044n.g != null) {
                                            c1040jA = S.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                            break;
                                        }
                                        c1040jA = S.f11410i;
                                        break;
                                    }
                                    c1040jA = S.f11410i;
                                    break;
                                }
                                String str12 = (String) it2.next();
                                if (map.containsKey(str12)) {
                                    ((C1037g) map.get(str12)).getClass();
                                    c1040jA = S.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str12 + ".");
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    C1037g c1037g4 = (C1037g) c1039i.f11474d.get(i11);
                    str = null;
                    if (!c1037g4.f11466a.f11505d.equals(c1037g2.f11466a.f11505d) && !c1037g4.f11466a.f11505d.equals("play_pass_subs")) {
                        c1040jA = S.a(5, "All products should have same ProductType.");
                        str2 = str8;
                        j = jNextLong;
                        str3 = str9;
                        break;
                    }
                    i11++;
                    z12 = z6;
                }
            }
            c1040j = c1040jA;
        }
        if (c1040j != S.f11410i) {
            M(108, c1040j, j, false);
            O(c1040j);
            return c1040j;
        }
        Bundle bundle = null;
        long j11 = j;
        if (this.f11449n) {
            boolean z13 = this.f11451p;
            boolean z14 = this.f11458w;
            this.f11433C.getClass();
            boolean z15 = this.f11433C.f10827a;
            boolean z16 = this.f11434D;
            String str13 = this.f11440c;
            String str14 = this.f11441d;
            long jLongValue = this.f11436F.longValue();
            this.g.getPackageName();
            int i15 = AbstractC1872t.f19388a;
            Bundle bundle2 = new Bundle();
            AbstractC1872t.b(bundle2, str13, str14, jLongValue);
            bundle2.putLong("billingClientTransactionId", j11);
            int i16 = c1039i.f11473c.f11389i;
            if (i16 != 0) {
                bundle2.putInt("prorationMode", i16);
            }
            if (!TextUtils.isEmpty(c1039i.f11472b)) {
                bundle2.putString("accountId", c1039i.f11472b);
            }
            if (TextUtils.isEmpty(str)) {
                str6 = str;
            } else {
                str6 = str;
                bundle2.putString("obfuscatedProfileId", str6);
            }
            if (c1039i.f11476f) {
                bundle2.putBoolean("isOfferPersonalizedByDeveloper", z6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle2.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str6)));
            }
            if (!TextUtils.isEmpty((String) c1039i.f11473c.j)) {
                bundle2.putString("oldSkuPurchaseToken", (String) c1039i.f11473c.j);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle2.putString("oldSkuPurchaseId", null);
            }
            c1039i.f11473c.getClass();
            if (!TextUtils.isEmpty(null)) {
                c1039i.f11473c.getClass();
                bundle2.putString("originalExternalTransactionId", null);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle2.putString("paymentsPurchaseParams", null);
            }
            if (z13) {
                z10 = true;
                bundle2.putBoolean("enablePendingPurchases", true);
            } else {
                z10 = true;
            }
            if (z14 && z15) {
                bundle2.putBoolean("enablePendingPurchaseForSubscriptions", z10);
            }
            if (z16) {
                bundle2.putBoolean("enableAlternativeBilling", z10);
            }
            ArrayList arrayList5 = new ArrayList();
            C1865p c1865pListIterator = c1039i.f11474d.listIterator(0);
            while (c1865pListIterator.hasNext()) {
                ((C1037g) c1865pListIterator.next()).getClass();
            }
            if (!arrayList5.isEmpty()) {
                C1826b0 c1826b0P = C1829c0.p();
                c1826b0P.c();
                C1829c0.q((C1829c0) c1826b0P.f19393i, arrayList5);
                bundle2.putByteArray("subscriptionProductReplacementParamsList", ((C1829c0) c1826b0P.a()).b());
            }
            if (arrayList2.isEmpty()) {
                ArrayList<String> arrayList6 = new ArrayList<>(rVar.size() - 1);
                ArrayList<String> arrayList7 = new ArrayList<>(rVar.size() - 1);
                ArrayList<String> arrayList8 = new ArrayList<>();
                ArrayList<String> arrayList9 = new ArrayList<>();
                ArrayList<String> arrayList10 = new ArrayList<>();
                ArrayList<Integer> arrayList11 = new ArrayList<>();
                int i17 = 0;
                while (i17 < rVar.size()) {
                    C1037g c1037g5 = (C1037g) rVar.get(i17);
                    C1047q c1047q4 = c1037g5.f11466a;
                    if (!c1047q4.f11508h.isEmpty()) {
                        arrayList8.add(c1047q4.f11508h);
                    }
                    String str15 = c1037g5.f11467b;
                    arrayList9.add(str15);
                    if (TextUtils.isEmpty(str15) || (arrayList = c1047q4.f11510k) == null || arrayList.isEmpty()) {
                        j10 = j11;
                        str7 = c1047q4.f11509i;
                        break;
                    }
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            j10 = j11;
                            str7 = c1047q4.f11509i;
                            break;
                        }
                        j10 = j11;
                        C1044n c1044n2 = (C1044n) it4.next();
                        if (!TextUtils.isEmpty(c1044n2.f11489f) && Objects.equals(c1044n2.f11487d, str15)) {
                            str7 = c1044n2.f11489f;
                            break;
                        }
                        j11 = j10;
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        arrayList10.add(str7);
                    }
                    if (i17 > 0) {
                        arrayList6.add(((C1037g) rVar.get(i17)).f11466a.f11504c);
                        arrayList7.add(((C1037g) rVar.get(i17)).f11466a.f11505d);
                    }
                    i17++;
                    j11 = j10;
                }
                j9 = j11;
                bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList9);
                if (!arrayList11.isEmpty()) {
                    bundle2.putIntegerArrayList("autoPayBalanceThresholdList", arrayList11);
                }
                if (!arrayList8.isEmpty()) {
                    bundle2.putStringArrayList("skuDetailsTokens", arrayList8);
                }
                if (!arrayList10.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList10);
                }
                if (!arrayList6.isEmpty()) {
                    bundle2.putStringArrayList("additionalSkus", arrayList6);
                    bundle2.putStringArrayList("additionalSkuTypes", arrayList7);
                }
            } else {
                ArrayList<String> arrayList12 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it5 = arrayList2.iterator();
                if (it5.hasNext()) {
                    it5.next().getClass();
                    throw new ClassCastException();
                }
                if (!arrayList12.isEmpty()) {
                    bundle2.putStringArrayList("skuDetailsTokens", arrayList12);
                }
                if (arrayList2.size() > 1) {
                    ArrayList<String> arrayList13 = new ArrayList<>(arrayList2.size() - 1);
                    ArrayList<String> arrayList14 = new ArrayList<>(arrayList2.size() - 1);
                    if (1 < arrayList2.size()) {
                        arrayList2.get(1).getClass();
                        throw new ClassCastException();
                    }
                    bundle2.putStringArrayList("additionalSkus", arrayList13);
                    bundle2.putStringArrayList("additionalSkuTypes", arrayList14);
                }
                j9 = j11;
            }
            if (bundle2.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f11453r) {
                C1040j c1040j9 = S.f11417q;
                M(21, c1040j9, j9, false);
                O(c1040j9);
                return c1040j9;
            }
            z9 = false;
            if (TextUtils.isEmpty(c1037g.f11466a.f11503b.optString("packageName"))) {
                z11 = false;
            } else {
                bundle2.putString("skuPackageName", c1037g.f11466a.f11503b.optString("packageName"));
                z11 = true;
            }
            str4 = null;
            if (!TextUtils.isEmpty(null)) {
                bundle2.putString("accountName", null);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                AbstractC1872t.h("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundle2.putString("proxyPackage", stringExtra);
                try {
                    bundle2.putString("proxyPackageVersion", this.g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle2.putString("proxyPackageVersion", "package not found");
                }
            }
            if (this.f11456u && !rVar.isEmpty()) {
                i9 = 17;
            } else if (this.f11454s && z11) {
                i9 = 15;
            } else {
                i9 = this.f11451p ? 9 : 6;
            }
            final int i18 = i9;
            final Bundle bundle3 = bundle2;
            final String str16 = str2;
            final String str17 = str3;
            futureK = k(new Callable(i18, str16, str17, c1039i, bundle3) {

                public final int f11365b;

                public final String f11366c;

                public final String f11367d;

                public final Bundle f11368e;

                {
                    this.f11368e = bundle3;
                }

                @Override
                public final Object call() {
                    Bundle bundleC;
                    InterfaceC1828c interfaceC1828c;
                    C1033c c1033c = this.f11364a;
                    int i19 = this.f11365b;
                    String str18 = this.f11366c;
                    String str19 = this.f11367d;
                    Bundle bundle4 = this.f11368e;
                    c1033c.getClass();
                    try {
                        synchronized (c1033c.f11438a) {
                            interfaceC1828c = c1033c.f11445i;
                        }
                        if (interfaceC1828c == null) {
                            return AbstractC1872t.c(107, S.j);
                        }
                        return ((C1822a) interfaceC1828c).j0(i19, c1033c.g.getPackageName(), str18, str19, bundle4);
                    } catch (DeadObjectException e6) {
                        C1040j c1040j10 = S.j;
                        String strA = P.a(e6);
                        bundleC = AbstractC1872t.c(5, c1040j10);
                        if (strA != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA);
                        }
                        return bundleC;
                    } catch (Exception e9) {
                        C1040j c1040j11 = S.f11409h;
                        String strA2 = P.a(e9);
                        bundleC = AbstractC1872t.c(5, c1040j11);
                        if (strA2 != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA2);
                        }
                        return bundleC;
                    }
                }
            }, 5000L, null, this.f11442e, j());
            str5 = str17;
            bundle = bundle3;
        } else {
            j9 = j11;
            z9 = false;
            str4 = str;
            String str18 = str3;
            futureK = k(new V3.a(this, str2, str18, 4), 5000L, null, this.f11442e, j());
            str5 = str18;
        }
        try {
            if (futureK == null) {
                try {
                    C1040j c1040j10 = S.f11405c;
                    M(25, c1040j10, j9, z9);
                    O(c1040j10);
                    return c1040j10;
                } catch (CancellationException e6) {
                    e = e6;
                    r11 = z9;
                    r12 = j9;
                    AbstractC1872t.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    C1040j c1040j11 = S.f11411k;
                    N(4, c1040j11, P.a(e), r12, r11);
                    O(c1040j11);
                    return c1040j11;
                } catch (TimeoutException e9) {
                    e = e9;
                    r11 = z9;
                    r12 = j9;
                    AbstractC1872t.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    C1040j c1040j12 = S.f11411k;
                    N(4, c1040j12, P.a(e), r12, r11);
                    O(c1040j12);
                    return c1040j12;
                } catch (Exception e10) {
                    e = e10;
                    r9 = z9;
                    r10 = j9;
                    AbstractC1872t.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    C1040j c1040j13 = S.j;
                    N(5, c1040j13, P.a(e), r10, r9);
                    O(c1040j13);
                    return c1040j13;
                }
            }
            boolean z17 = z9;
            long j12 = j9;
            Bundle bundle4 = (Bundle) futureK.get(5000L, TimeUnit.MILLISECONDS);
            int iA2 = AbstractC1872t.a("BillingClient", bundle4);
            String strF = AbstractC1872t.f("BillingClient", bundle4);
            if (iA2 == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle4.getParcelable("BUY_INTENT"));
                intent2.putExtra("billingClientTransactionId", j12);
                intent2.putExtra("wasServiceAutoReconnected", z17);
                activity.startActivity(intent2);
                return S.f11410i;
            }
            AbstractC1872t.h("BillingClient", "Unable to buy item, Error response code: " + iA2);
            C1040j c1040jA2 = S.a(iA2, strF);
            if (bundle4 == null) {
                i3 = 1;
                iA = 1;
            } else {
                try {
                    Object obj = bundle4.get("LOG_REASON");
                    if (obj != null) {
                        if (obj instanceof Integer) {
                            iA = M0.a(((Integer) obj).intValue());
                            i3 = 1;
                        } else {
                            AbstractC1872t.h("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                        }
                    }
                } catch (Throwable th2) {
                    AbstractC1872t.h("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th2.getMessage())));
                }
                i3 = 1;
                iA = 1;
            }
            if (iA == i3) {
                iA = 23;
            }
            if (bundle4 == null) {
                string = str4;
            } else {
                try {
                    string = bundle4.getString("ADDITIONAL_LOG_DETAILS");
                } catch (Throwable th3) {
                    AbstractC1872t.h("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th3.getMessage())));
                    string = str4;
                }
            }
            try {
                N(iA, c1040jA2, string, j12, z17);
                O(c1040jA2);
                return c1040jA2;
            } catch (CancellationException e11) {
                e = e11;
                r12 = j12;
                r11 = z17;
                AbstractC1872t.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                C1040j c1040j14 = S.f11411k;
                N(4, c1040j14, P.a(e), r12, r11);
                O(c1040j14);
                return c1040j14;
            } catch (TimeoutException e12) {
                e = e12;
                r12 = j12;
                r11 = z17;
                AbstractC1872t.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                C1040j c1040j15 = S.f11411k;
                N(4, c1040j15, P.a(e), r12, r11);
                O(c1040j15);
                return c1040j15;
            } catch (Exception e13) {
                e = e13;
                r10 = j12;
                r9 = z17;
                AbstractC1872t.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                C1040j c1040j16 = S.j;
                N(5, c1040j16, P.a(e), r10, r9);
                O(c1040j16);
                return c1040j16;
            }
        } catch (CancellationException e14) {
            e = e14;
            r12 = str5;
            r11 = bundle;
        } catch (TimeoutException e15) {
            e = e15;
            r12 = str5;
            r11 = bundle;
        } catch (Exception e16) {
            e = e16;
            r10 = str5;
            r9 = bundle;
        }
    }

    @Override
    public void f(w wVar, com.revenuecat.purchases.google.usecase.c cVar) {
        if (k(new V3.a(this, cVar, wVar, 7), 30000L, new com.google.common.util.concurrent.C(this, cVar, 15), s(), j()) == null) {
            C1040j c1040jV = v();
            J(25, 7, c1040jV);
            C1865p c1865p = com.google.android.gms.internal.play_billing.r.f19379i;
            C1876v c1876v = C1876v.f19394l;
            cVar.a(c1040jV, new x(c1876v, c1876v));
        }
    }

    @Override
    public final void g(z zVar, InterfaceC1048s interfaceC1048s) {
        if (k(new V3.a(this, interfaceC1048s, zVar.f11518a), 30000L, new com.google.common.util.concurrent.C(this, interfaceC1048s, 16), s(), j()) == null) {
            C1040j c1040jV = v();
            J(25, 9, c1040jV);
            C1865p c1865p = com.google.android.gms.internal.play_billing.r.f19379i;
            interfaceC1048s.b(c1040jV, C1876v.f19394l);
        }
    }

    @Override
    public final C1040j h(final Activity activity, C1041k c1041k, com.revenuecat.purchases.google.c cVar) {
        if (!D()) {
            AbstractC1872t.h("BillingClient", "Service disconnected.");
            return S.j;
        }
        if (!this.f11452q) {
            AbstractC1872t.h("BillingClient", "Current client doesn't support showing in-app messages.");
            return S.f11419s;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        bundle.putBinder("KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.f11440c);
        String str = this.f11441d;
        if (str != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str);
        }
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", c1041k.f11480a);
        Handler handler = this.f11442e;
        final G g = new G(this, handler, cVar);
        k(new Callable() {
            @Override
            public final Object call() {
                InterfaceC1828c interfaceC1828c;
                C1033c c1033c = this.f11371a;
                Bundle bundle2 = bundle;
                Activity activity2 = activity;
                G g9 = g;
                c1033c.getClass();
                try {
                    synchronized (c1033c.f11438a) {
                        interfaceC1828c = c1033c.f11445i;
                    }
                    if (interfaceC1828c == null) {
                        c1033c.w(-1, 107, null);
                        return null;
                    }
                    ((C1822a) interfaceC1828c).o0(c1033c.g.getPackageName(), bundle2, new J(new WeakReference(activity2), g9));
                    return null;
                } catch (DeadObjectException e6) {
                    c1033c.w(-1, 106, e6);
                    return null;
                } catch (Exception e9) {
                    c1033c.w(6, 106, e9);
                    return null;
                }
            }
        }, 5000L, null, handler, j());
        return S.f11410i;
    }

    @Override
    public void i(InterfaceC1034d interfaceC1034d) {
        B(interfaceC1034d);
    }

    public final synchronized ExecutorService j() {
        try {
            if (this.f11435E == null) {
                this.f11435E = Executors.newFixedThreadPool(AbstractC1872t.f19388a, new F(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11435E;
    }

    public final void l() {
        if (TextUtils.isEmpty(null)) {
            this.g.getPackageName();
        }
    }

    public final void n(com.revenuecat.purchases.google.usecase.a aVar, C1040j c1040j, int i3, Exception exc) {
        AbstractC1872t.i("BillingClient", "Error in acknowledge purchase!", exc);
        L(i3, 3, c1040j, P.a(exc));
        aVar.c(c1040j);
    }

    public final void o(com.revenuecat.purchases.google.usecase.a aVar, String str, C1040j c1040j, int i3, String str2, Exception exc) {
        AbstractC1872t.i("BillingClient", str2, exc);
        L(i3, 4, c1040j, P.a(exc));
        aVar.d(c1040j, str);
    }

    public final void p(com.revenuecat.purchases.google.usecase.b bVar, C1040j c1040j, int i3, Exception exc) {
        AbstractC1872t.i("BillingClient", "getBillingConfig got an exception.", exc);
        L(i3, 13, c1040j, P.a(exc));
        bVar.a(c1040j, null);
    }

    public final Handler s() {
        return Looper.myLooper() == null ? this.f11442e : new Handler(Looper.myLooper());
    }

    public final B4.t t(C1040j c1040j, int i3, String str, Exception exc) {
        AbstractC1872t.i("BillingClient", str, exc);
        L(i3, 7, c1040j, P.a(exc));
        return new B4.t(c1040j.f11477a, c1040j.f11479c, new ArrayList(), new ArrayList());
    }

    public final C1040j u() {
        AbstractC1872t.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        C1848i1 c1848i1Q = C1854k1.q();
        c1848i1Q.c();
        C1854k1.p((C1854k1) c1848i1Q.f19393i, 6);
        E1 e1P = F1.p();
        e1P.c();
        F1.u((F1) e1P.f19393i);
        e1P.d(false);
        e1P.e();
        c1848i1Q.c();
        C1854k1.v((C1854k1) c1848i1Q.f19393i, (F1) e1P.a());
        y((C1854k1) c1848i1Q.a());
        return S.f11410i;
    }

    public final C1040j v() {
        int[] iArr = {0, 3};
        synchronized (this.f11438a) {
            for (int i3 = 0; i3 < 2; i3++) {
                if (this.f11439b == iArr[i3]) {
                    return S.j;
                }
            }
            return S.f11409h;
        }
    }

    public final void w(int i3, int i9, Exception exc) {
        C1845h1 c1845h1;
        AbstractC1872t.i("BillingClient", "showInAppMessages error.", exc);
        S2.a aVar = this.f11444h;
        String strA = P.a(exc);
        try {
            C1857l1 c1857l1Q = C1860m1.q();
            c1857l1Q.e(i3);
            if (i9 != 0) {
                c1857l1Q.d(i9);
            }
            if (strA != null) {
                c1857l1Q.c();
                C1860m1.r((C1860m1) c1857l1Q.f19393i, strA);
            }
            C1842g1 c1842g1S = C1845h1.s();
            c1842g1S.d(c1857l1Q);
            c1842g1S.f(30);
            c1845h1 = (C1845h1) c1842g1S.a();
        } catch (Throwable th) {
            AbstractC1872t.i("BillingLogger", "Unable to create logging payload", th);
            c1845h1 = null;
        }
        aVar.T(c1845h1);
    }

    public final void x(C1845h1 c1845h1) {
        try {
            this.f11444h.U(c1845h1, this.f11448m);
        } catch (Throwable th) {
            AbstractC1872t.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void y(C1854k1 c1854k1) {
        try {
            S2.a aVar = this.f11444h;
            int i3 = this.f11448m;
            aVar.getClass();
            try {
                q1 q1Var = (q1) ((r1) aVar.f9211i).l();
                q1Var.c();
                r1.C((r1) q1Var.f19393i, i3);
                r1 r1Var = (r1) q1Var.a();
                aVar.f9211i = r1Var;
                try {
                    aVar.c0(c1854k1, r1Var);
                } catch (Throwable th) {
                    AbstractC1872t.i("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                AbstractC1872t.i("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            AbstractC1872t.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void z(int i3, C1040j c1040j) {
        try {
            int i9 = P.f11396a;
            C1842g1 c1842g1 = (C1842g1) P.b(i3, 6, c1040j, null, o1.BROADCAST_ACTION_UNSPECIFIED).l();
            E1 e1P = F1.p();
            e1P.d(false);
            e1P.e();
            c1842g1.e(e1P);
            x((C1845h1) c1842g1.a());
        } catch (Throwable th) {
            AbstractC1872t.i("BillingClient", "Unable to log.", th);
        }
    }

    public C1033c(X2.e eVar, Context context, T1.f fVar) {
        long jNextLong = new Random().nextLong();
        this.f11436F = Long.valueOf(jNextLong);
        this.f11437G = AbstractC1849j.f19338a;
        this.f11440c = BuildConfig.BILLING_CLIENT_VERSION;
        String strM = m();
        this.f11441d = strM;
        this.g = context.getApplicationContext();
        q1 q1VarZ = r1.z();
        q1VarZ.c();
        r1.x((r1) q1VarZ.f19393i);
        if (strM != null) {
            q1VarZ.c();
            r1.y((r1) q1VarZ.f19393i, strM);
        }
        String packageName = this.g.getPackageName();
        q1VarZ.c();
        r1.q((r1) q1VarZ.f19393i, packageName);
        q1VarZ.c();
        r1.D((r1) q1VarZ.f19393i, jNextLong);
        fVar.getClass();
        q1VarZ.c();
        r1.w((r1) q1VarZ.f19393i);
        int i3 = Build.VERSION.SDK_INT;
        q1VarZ.c();
        r1.A((r1) q1VarZ.f19393i, i3);
        q1VarZ.d();
        G(q1VarZ, context);
        try {
            int i9 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            q1VarZ.c();
            r1.B((r1) q1VarZ.f19393i, i9);
        } catch (Throwable th) {
            AbstractC1872t.i("BillingClient", "Error getting app version code.", th);
        }
        this.f11444h = new S2.a(this.g, (r1) q1VarZ.a());
        AbstractC1872t.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f11443f = new F3.u(this.g, (InterfaceC1049t) null, this.f11444h);
        this.f11433C = eVar;
        this.g.getPackageName();
    }
}
