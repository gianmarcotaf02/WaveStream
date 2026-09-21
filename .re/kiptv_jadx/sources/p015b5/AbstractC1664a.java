package p015b5;

/* JADX INFO: renamed from: b5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1664a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f17936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile java.lang.String f17937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile android.content.Context f17938d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.Set f17935a = p078i6.m.F0(new java.lang.String[]{"com.android.vending", "com.amazon.venezia"});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f17939e = new java.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.List f17940f = p078i6.p.B0("cancelled", "canceled", "timed out", io.sentry.ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, "network is unreachable", "unable to resolve host", "invalid login credentials", "unauthorized", "http 401", "http 403", "all player engines failed");

    public static void a(java.lang.String message, java.lang.String str) {
        kotlin.jvm.internal.m.e(message, "message");
        io.sentry.SentryLevel level = io.sentry.SentryLevel.INFO;
        kotlin.jvm.internal.m.e(level, "level");
        if (f17936b) {
            try {
                io.sentry.Breadcrumb breadcrumb = new io.sentry.Breadcrumb();
                breadcrumb.setMessage(message);
                breadcrumb.setLevel(level);
                breadcrumb.setCategory(str);
                io.sentry.Sentry.addBreadcrumb(breadcrumb);
            } catch (java.lang.Throwable th) {
                B2.a.v("Sentry breadcrumb failed: ", th.getMessage(), "CrashReporting");
            }
        }
    }

    public static void b(java.lang.Throwable throwable, java.util.Map map) {
        kotlin.jvm.internal.m.e(throwable, "throwable");
        if (f17936b) {
            try {
                kotlin.jvm.internal.m.b(io.sentry.Sentry.captureException(throwable, new F1.e(15, map)));
            } catch (java.lang.Throwable th) {
                B2.a.v("Sentry capture failed: ", th.getMessage(), "CrashReporting");
            }
        }
    }

    public static boolean c(java.lang.String message, io.sentry.SentryLevel level, java.util.Map context, java.util.Map extras) {
        kotlin.jvm.internal.m.e(message, "message");
        kotlin.jvm.internal.m.e(level, "level");
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(extras, "extras");
        if (!f17936b) {
            return false;
        }
        try {
            io.sentry.Sentry.captureMessage(message, level, new F.f0(context, extras, 13));
            return true;
        } catch (java.lang.Throwable th) {
            B2.a.v("Sentry message capture failed: ", th.getMessage(), "CrashReporting");
            return false;
        }
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        android.content.Context context;
        java.lang.Object objT;
        if (str2 == null) {
            f17939e.remove(str);
        } else {
            f17939e.put(str, str2);
        }
        if (android.os.Build.VERSION.SDK_INT >= 30 && (context = f17938d) != null) {
            java.util.Set setEntrySet = f17939e.entrySet();
            kotlin.jvm.internal.m.d(setEntrySet, "<get-entries>(...)");
            java.lang.String strP1 = O7.q.p1(127, p078i6.o.o1(p078i6.o.I1(setEntrySet, new C5.O1(28)), ";", null, null, new p011b1.x(10), 30));
            try {
                java.lang.Object systemService = context.getSystemService("activity");
                kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                byte[] bytes = strP1.getBytes(O7.a.f8024b);
                kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
                ((android.app.ActivityManager) systemService).setProcessStateSummary(bytes);
                objT = p070h6.A.f22523a;
            } catch (java.lang.Throwable th) {
                objT = com.google.common.util.concurrent.P.T(th);
            }
            java.lang.Throwable thA = p070h6.n.a(objT);
            if (thA != null) {
                B2.a.v("Process state summary failed: ", thA.getMessage(), "CrashReporting");
            }
        }
    }
}
