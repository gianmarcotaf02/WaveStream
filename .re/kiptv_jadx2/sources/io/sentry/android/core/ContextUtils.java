package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.DisplayMetrics;
import io.ktor.sse.ServerSentEventKt;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.util.AndroidLazyEvaluator;
import io.sentry.protocol.App;
import io.sentry.util.LazyEvaluator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class ContextUtils {
    private static final AndroidLazyEvaluator<String> deviceName = new AndroidLazyEvaluator<>(new a(3));
    private static final LazyEvaluator<Boolean> isForegroundImportance = new LazyEvaluator<>(new a(4));
    private static final AndroidLazyEvaluator<PackageInfo> staticPackageInfo33 = new AndroidLazyEvaluator<>(new a(5));
    private static final AndroidLazyEvaluator<PackageInfo> staticPackageInfo = new AndroidLazyEvaluator<>(new a(6));
    private static final AndroidLazyEvaluator<String> applicationName = new AndroidLazyEvaluator<>(new a(7));
    private static final AndroidLazyEvaluator<ApplicationInfo> staticAppInfo33 = new AndroidLazyEvaluator<>(new a(1));
    private static final AndroidLazyEvaluator<ApplicationInfo> staticAppInfo = new AndroidLazyEvaluator<>(new a(2));

    public static class SideLoadedInfo {
        private final String installerStore;
        private final boolean isSideLoaded;

        public SideLoadedInfo(boolean z6, String str) {
            this.isSideLoaded = z6;
            this.installerStore = str;
        }

        public Map<String, String> asTags() {
            HashMap map = new HashMap();
            map.put("isSideLoaded", String.valueOf(this.isSideLoaded));
            String str = this.installerStore;
            if (str != null) {
                map.put("installerStore", str);
            }
            return map;
        }

        public String getInstallerStore() {
            return this.installerStore;
        }

        public boolean isSideLoaded() {
            return this.isSideLoaded;
        }
    }

    public static class SplitApksInfo {
        static final String SPLITS_REQUIRED = "com.android.vending.splits.required";
        private final boolean isSplitApks;
        private final String[] splitNames;

        public SplitApksInfo(boolean z6, String[] strArr) {
            this.isSplitApks = z6;
            this.splitNames = strArr;
        }

        public String[] getSplitNames() {
            return this.splitNames;
        }

        public boolean isSplitApks() {
            return this.isSplitApks;
        }
    }

    private ContextUtils() {
    }

    public static Context getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public static ApplicationInfo getApplicationInfo(Context context, BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 33 ? staticAppInfo33.getValue(context) : staticAppInfo.getValue(context);
    }

    public static String getApplicationName(Context context) {
        return applicationName.getValue(context);
    }

    public static String[] getArchitectures() {
        return Build.SUPPORTED_ABIS;
    }

    public static String getDeviceName(Context context) {
        return deviceName.getValue(context);
    }

    public static DisplayMetrics getDisplayMetrics(Context context, ILogger iLogger) {
        try {
            return context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Error getting DisplayMetrics.", th);
            return null;
        }
    }

    public static String getFamily(ILogger iLogger) {
        try {
            return Build.MODEL.split(ServerSentEventKt.SPACE, -1)[0];
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Error getting device family.", th);
            return null;
        }
    }

    public static String getKernelVersion(ILogger iLogger) {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                return line;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e6) {
            iLogger.log(SentryLevel.ERROR, "Exception while attempting to read kernel information", e6);
            return property;
        }
    }

    public static ActivityManager.MemoryInfo getMemInfo(Context context, ILogger iLogger) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.log(SentryLevel.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    public static PackageInfo getPackageInfo(Context context, BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 33 ? staticPackageInfo33.getValue(context) : staticPackageInfo.getValue(context);
    }

    public static String getVersionCode(PackageInfo packageInfo, BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : getVersionCodeDep(packageInfo);
    }

    private static String getVersionCodeDep(PackageInfo packageInfo) {
        return Integer.toString(packageInfo.versionCode);
    }

    public static String getVersionName(PackageInfo packageInfo) {
        return packageInfo.versionName;
    }

    public static boolean isForegroundImportance() {
        return isForegroundImportance.getValue().booleanValue();
    }

    public static String lambda$static$0(Context context) {
        return Settings.Global.getString(context.getContentResolver(), "device_name");
    }

    public static Boolean lambda$static$1() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return Boolean.valueOf(runningAppProcessInfo.importance == 100);
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
    }

    public static PackageInfo lambda$static$2(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static PackageInfo lambda$static$3(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String lambda$static$4(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i3 = applicationInfo.labelRes;
            if (i3 != 0) {
                return context.getString(i3);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static ApplicationInfo lambda$static$5(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static ApplicationInfo lambda$static$6(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Intent registerReceiver(Context context, SentryOptions sentryOptions, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return registerReceiver(context, new BuildInfoProvider(sentryOptions.getLogger()), broadcastReceiver, intentFilter);
    }

    public static void resetInstance() {
        deviceName.resetValue();
        isForegroundImportance.resetValue();
        staticPackageInfo33.resetValue();
        staticPackageInfo.resetValue();
        applicationName.resetValue();
        staticAppInfo33.resetValue();
        staticAppInfo.resetValue();
    }

    public static SideLoadedInfo retrieveSideLoadedInfo(Context context, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        String str;
        try {
            PackageInfo packageInfo = getPackageInfo(context, buildInfoProvider);
            PackageManager packageManager = context.getPackageManager();
            if (packageInfo != null && packageManager != null) {
                str = packageInfo.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    return new SideLoadedInfo(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    iLogger.log(SentryLevel.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    public static SplitApksInfo retrieveSplitApksInfo(Context context, BuildInfoProvider buildInfoProvider) {
        Bundle bundle;
        ApplicationInfo applicationInfo = getApplicationInfo(context, buildInfoProvider);
        PackageInfo packageInfo = getPackageInfo(context, buildInfoProvider);
        if (packageInfo == null) {
            return null;
        }
        return new SplitApksInfo((applicationInfo == null || (bundle = applicationInfo.metaData) == null) ? false : bundle.getBoolean("com.android.vending.splits.required"), packageInfo.splitNames);
    }

    public static void setAppPackageInfo(PackageInfo packageInfo, BuildInfoProvider buildInfoProvider, DeviceInfoUtil deviceInfoUtil, App app) {
        app.setAppIdentifier(packageInfo.packageName);
        app.setAppVersion(packageInfo.versionName);
        app.setAppBuild(getVersionCode(packageInfo, buildInfoProvider));
        HashMap map = new HashMap();
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
            for (int i3 = 0; i3 < strArr.length; i3++) {
                String str = strArr[i3];
                map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i3] & 2) == 2 ? "granted" : "not_granted");
            }
        }
        app.setPermissions(map);
        if (deviceInfoUtil != null) {
            try {
                SplitApksInfo splitApksInfo = deviceInfoUtil.getSplitApksInfo();
                if (splitApksInfo != null) {
                    app.setSplitApks(Boolean.valueOf(splitApksInfo.isSplitApks()));
                    if (splitApksInfo.getSplitNames() != null) {
                        app.setSplitNames(Arrays.asList(splitApksInfo.getSplitNames()));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static Intent registerReceiver(Context context, BuildInfoProvider buildInfoProvider, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return buildInfoProvider.getSdkInfoVersion() >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, 4) : context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public static PackageInfo getPackageInfo(Context context, int i3, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        try {
            if (buildInfoProvider.getSdkInfoVersion() >= 33) {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(i3));
            }
            return context.getPackageManager().getPackageInfo(context.getPackageName(), i3);
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Error getting package info.", th);
            return null;
        }
    }
}
