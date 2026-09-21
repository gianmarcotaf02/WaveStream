package L3;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f7056b = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile L3.a f7057c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f7058a = new java.util.concurrent.ConcurrentHashMap();

    public static L3.a a() {
        if (f7057c == null) {
            synchronized (f7056b) {
                try {
                    if (f7057c == null) {
                        f7057c = new L3.a();
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        L3.a aVar = f7057c;
        H3.q.g(aVar);
        return aVar;
    }

    public final void b(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof H3.A)) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f7058a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((android.content.ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.util.NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.util.NoSuchElementException unused2) {
        }
    }

    public final boolean c(android.content.Context context, java.lang.String str, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i3, java.util.concurrent.Executor executor) {
        android.content.ComponentName component = intent.getComponent();
        if (component != null) {
            java.lang.String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((N3.b.a(context).f2115a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    android.util.Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof H3.A) {
            if (executor == null) {
                executor = null;
            }
            return (android.os.Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i3) : context.bindService(intent, i3, executor, serviceConnection);
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f7058a;
        android.content.ServiceConnection serviceConnection2 = (android.content.ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            android.util.Log.w("ConnectionTracker", java.lang.String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = (android.os.Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i3) : context.bindService(intent, i3, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (java.lang.Throwable th) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }
}
