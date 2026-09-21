package P4;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P4.c f8138a = new P4.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile P4.b f8139b;

    public static P4.a a() {
        java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory();
        long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
        long j = 1048576;
        return new P4.a((int) (jFreeMemory / j), (int) ((jMaxMemory - jFreeMemory) / j), (int) (jMaxMemory / j));
    }

    public static P4.b c(android.content.Context context) {
        java.lang.Object objT;
        java.lang.Object systemService = context.getApplicationContext().getSystemService("activity");
        android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
        boolean zIsLowRamDevice = activityManager != null ? activityManager.isLowRamDevice() : false;
        int memoryClass = activityManager != null ? activityManager.getMemoryClass() : 0;
        int largeMemoryClass = activityManager != null ? activityManager.getLargeMemoryClass() : 0;
        try {
            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
            }
            objT = java.lang.Long.valueOf(memoryInfo.totalMem);
        } catch (java.lang.Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
        if (objT instanceof p070h6.m) {
            objT = 0L;
        }
        long jLongValue = ((java.lang.Number) objT).longValue();
        return new P4.b(zIsLowRamDevice, memoryClass, largeMemoryClass, jLongValue, zIsLowRamDevice || (1 <= jLongValue && jLongValue < 2147483649L) || (1 <= largeMemoryClass && largeMemoryClass < 192));
    }

    public final P4.b b(android.content.Context context) {
        P4.b bVarC;
        kotlin.jvm.internal.m.e(context, "context");
        P4.b bVar = f8139b;
        if (bVar != null) {
            return bVar;
        }
        synchronized (this) {
            bVarC = f8139b;
            if (bVarC == null) {
                bVarC = c(context);
                f8139b = bVarC;
            }
        }
        return bVarC;
    }
}
