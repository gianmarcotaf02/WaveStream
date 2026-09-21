package P4;

import android.app.ActivityManager;
import android.content.Context;
import com.google.common.util.concurrent.P;
import p070h6.m;

public final class c {

    public static final c f8138a = new c();

    public static volatile b f8139b;

    public static a a() {
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory();
        long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
        long j = 1048576;
        return new a((int) (jFreeMemory / j), (int) ((jMaxMemory - jFreeMemory) / j), (int) (jMaxMemory / j));
    }

    public static b c(Context context) {
        Object objT;
        Object systemService = context.getApplicationContext().getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        boolean zIsLowRamDevice = activityManager != null ? activityManager.isLowRamDevice() : false;
        int memoryClass = activityManager != null ? activityManager.getMemoryClass() : 0;
        int largeMemoryClass = activityManager != null ? activityManager.getLargeMemoryClass() : 0;
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
            }
            objT = Long.valueOf(memoryInfo.totalMem);
        } catch (Throwable th) {
            objT = P.T(th);
        }
        if (objT instanceof m) {
            objT = 0L;
        }
        long jLongValue = ((Number) objT).longValue();
        return new b(zIsLowRamDevice, memoryClass, largeMemoryClass, jLongValue, zIsLowRamDevice || (1 <= jLongValue && jLongValue < 2147483649L) || (1 <= largeMemoryClass && largeMemoryClass < 192));
    }

    public final b b(Context context) {
        b bVarC;
        kotlin.jvm.internal.m.e(context, "context");
        b bVar = f8139b;
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
