package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final class ContextUtils {
    private static final io.sentry.android.core.util.AndroidLazyEvaluator<java.lang.String> deviceName = new io.sentry.android.core.util.AndroidLazyEvaluator<>(new io.sentry.android.core.a(3));
    private static final io.sentry.util.LazyEvaluator<java.lang.Boolean> isForegroundImportance = new io.sentry.util.LazyEvaluator<>(new io.sentry.android.core.a(4));
    private static final io.sentry.android.core.util.AndroidLazyEvaluator<android.content.pm.PackageInfo> staticPackageInfo33 = new io.sentry.android.core.util.AndroidLazyEvaluator<>(new io.sentry.android.core.a(5));
    private static final io.sentry.android.core.util.AndroidLazyEvaluator<android.content.pm.PackageInfo> staticPackageInfo = new io.sentry.android.core.util.AndroidLazyEvaluator<>(new io.sentry.android.core.a(6));
    private static final io.sentry.android.core.util.AndroidLazyEvaluator<java.lang.String> applicationName = new io.sentry.android.core.util.AndroidLazyEvaluator<>(new io.sentry.android.core.a(7));
    private static final io.sentry.android.core.util.AndroidLazyEvaluator<android.content.pm.ApplicationInfo> staticAppInfo33 = new io.sentry.android.core.util.AndroidLazyEvaluator<>(new io.sentry.android.core.a(1));
    private static final io.sentry.android.core.util.AndroidLazyEvaluator<android.content.pm.ApplicationInfo> staticAppInfo = new io.sentry.android.core.util.AndroidLazyEvaluator<>(new io.sentry.android.core.a(2));

    public static class SideLoadedInfo {
        private final java.lang.String installerStore;
        private final boolean isSideLoaded;

        public SideLoadedInfo(boolean z6, java.lang.String str) {
            this.isSideLoaded = z6;
            this.installerStore = str;
        }

        public java.util.Map<java.lang.String, java.lang.String> asTags() {
            java.util.HashMap map = new java.util.HashMap();
            map.put("isSideLoaded", java.lang.String.valueOf(this.isSideLoaded));
            java.lang.String str = this.installerStore;
            if (str != null) {
                map.put("installerStore", str);
            }
            return map;
        }

        public java.lang.String getInstallerStore() {
            return this.installerStore;
        }

        public boolean isSideLoaded() {
            return this.isSideLoaded;
        }
    }

    public static class SplitApksInfo {
        static final java.lang.String SPLITS_REQUIRED = "com.android.vending.splits.required";
        private final boolean isSplitApks;
        private final java.lang.String[] splitNames;

        public SplitApksInfo(boolean z6, java.lang.String[] strArr) {
            this.isSplitApks = z6;
            this.splitNames = strArr;
        }

        public java.lang.String[] getSplitNames() {
            return this.splitNames;
        }

        public boolean isSplitApks() {
            return this.isSplitApks;
        }
    }

    private ContextUtils() {
    }

    public static android.content.Context getApplicationContext(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public static android.content.pm.ApplicationInfo getApplicationInfo(android.content.Context context, io.sentry.android.core.BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 33 ? staticAppInfo33.getValue(context) : staticAppInfo.getValue(context);
    }

    public static java.lang.String getApplicationName(android.content.Context context) {
        return applicationName.getValue(context);
    }

    public static java.lang.String[] getArchitectures() {
        return android.os.Build.SUPPORTED_ABIS;
    }

    public static java.lang.String getDeviceName(android.content.Context context) {
        return deviceName.getValue(context);
    }

    public static android.util.DisplayMetrics getDisplayMetrics(android.content.Context context, io.sentry.ILogger iLogger) {
        try {
            return context.getResources().getDisplayMetrics();
        } catch (java.lang.Throwable th) {
            iLogger.log(io.sentry.SentryLevel.ERROR, "Error getting DisplayMetrics.", th);
            return null;
        }
    }

    public static java.lang.String getFamily(io.sentry.ILogger iLogger) {
        try {
            return android.os.Build.MODEL.split(io.ktor.sse.ServerSentEventKt.SPACE, -1)[0];
        } catch (java.lang.Throwable th) {
            iLogger.log(io.sentry.SentryLevel.ERROR, "Error getting device family.", th);
            return null;
        }
    }

    public static java.lang.String getKernelVersion(io.sentry.ILogger iLogger) {
        java.lang.String property = java.lang.System.getProperty("os.version");
        java.io.File file = new java.io.File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
            try {
                java.lang.String line = bufferedReader.readLine();
                bufferedReader.close();
                return line;
            } catch (java.lang.Throwable th) {
                try {
                    bufferedReader.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException e6) {
            iLogger.log(io.sentry.SentryLevel.ERROR, "Exception while attempting to read kernel information", e6);
            return property;
        }
    }

    public static android.app.ActivityManager.MemoryInfo getMemInfo(android.content.Context context, io.sentry.ILogger iLogger) {
        try {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.log(io.sentry.SentryLevel.INFO, "Error getting MemoryInfo.", new java.lang.Object[0]);
            return null;
        } catch (java.lang.Throwable th) {
            iLogger.log(io.sentry.SentryLevel.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    public static android.content.pm.PackageInfo getPackageInfo(android.content.Context context, io.sentry.android.core.BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 33 ? staticPackageInfo33.getValue(context) : staticPackageInfo.getValue(context);
    }

    public static java.lang.String getVersionCode(android.content.pm.PackageInfo packageInfo, io.sentry.android.core.BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 28 ? java.lang.Long.toString(packageInfo.getLongVersionCode()) : getVersionCodeDep(packageInfo);
    }

    private static java.lang.String getVersionCodeDep(android.content.pm.PackageInfo packageInfo) {
        return java.lang.Integer.toString(packageInfo.versionCode);
    }

    public static java.lang.String getVersionName(android.content.pm.PackageInfo packageInfo) {
        return packageInfo.versionName;
    }

    public static boolean isForegroundImportance() {
        return isForegroundImportance.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.String lambda$static$0(android.content.Context context) {
        return android.provider.Settings.Global.getString(context.getContentResolver(), "device_name");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Boolean lambda$static$1() {
        try {
            android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
            android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return java.lang.Boolean.valueOf(runningAppProcessInfo.importance == 100);
        } catch (java.lang.Throwable unused) {
            return java.lang.Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ android.content.pm.PackageInfo lambda$static$2(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), android.content.pm.PackageManager.PackageInfoFlags.of(0L));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ android.content.pm.PackageInfo lambda$static$3(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.String lambda$static$4(android.content.Context context) {
        try {
            android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i3 = applicationInfo.labelRes;
            if (i3 != 0) {
                return context.getString(i3);
            }
            java.lang.CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ android.content.pm.ApplicationInfo lambda$static$5(android.content.Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), android.content.pm.PackageManager.ApplicationInfoFlags.of(128L));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ android.content.pm.ApplicationInfo lambda$static$6(android.content.Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static android.content.Intent registerReceiver(android.content.Context context, io.sentry.SentryOptions sentryOptions, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        return registerReceiver(context, new io.sentry.android.core.BuildInfoProvider(sentryOptions.getLogger()), broadcastReceiver, intentFilter);
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

    public static io.sentry.android.core.ContextUtils.SideLoadedInfo retrieveSideLoadedInfo(android.content.Context context, io.sentry.ILogger iLogger, io.sentry.android.core.BuildInfoProvider buildInfoProvider) {
        java.lang.String str;
        try {
            android.content.pm.PackageInfo packageInfo = getPackageInfo(context, buildInfoProvider);
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageInfo != null && packageManager != null) {
                str = packageInfo.packageName;
                try {
                    java.lang.String installerPackageName = packageManager.getInstallerPackageName(str);
                    return new io.sentry.android.core.ContextUtils.SideLoadedInfo(installerPackageName == null, installerPackageName);
                } catch (java.lang.IllegalArgumentException unused) {
                    iLogger.log(io.sentry.SentryLevel.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (java.lang.IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    public static io.sentry.android.core.ContextUtils.SplitApksInfo retrieveSplitApksInfo(android.content.Context context, io.sentry.android.core.BuildInfoProvider buildInfoProvider) {
        android.os.Bundle bundle;
        android.content.pm.ApplicationInfo applicationInfo = getApplicationInfo(context, buildInfoProvider);
        android.content.pm.PackageInfo packageInfo = getPackageInfo(context, buildInfoProvider);
        if (packageInfo == null) {
            return null;
        }
        return new io.sentry.android.core.ContextUtils.SplitApksInfo((applicationInfo == null || (bundle = applicationInfo.metaData) == null) ? false : bundle.getBoolean("com.android.vending.splits.required"), packageInfo.splitNames);
    }

    public static void setAppPackageInfo(android.content.pm.PackageInfo packageInfo, io.sentry.android.core.BuildInfoProvider buildInfoProvider, io.sentry.android.core.DeviceInfoUtil deviceInfoUtil, io.sentry.protocol.App app) {
        app.setAppIdentifier(packageInfo.packageName);
        app.setAppVersion(packageInfo.versionName);
        app.setAppBuild(getVersionCode(packageInfo, buildInfoProvider));
        java.util.HashMap map = new java.util.HashMap();
        java.lang.String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
            for (int i3 = 0; i3 < strArr.length; i3++) {
                java.lang.String str = strArr[i3];
                map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i3] & 2) == 2 ? "granted" : "not_granted");
            }
        }
        app.setPermissions(map);
        if (deviceInfoUtil != null) {
            try {
                io.sentry.android.core.ContextUtils.SplitApksInfo splitApksInfo = deviceInfoUtil.getSplitApksInfo();
                if (splitApksInfo != null) {
                    app.setSplitApks(java.lang.Boolean.valueOf(splitApksInfo.isSplitApks()));
                    if (splitApksInfo.getSplitNames() != null) {
                        app.setSplitNames(java.util.Arrays.asList(splitApksInfo.getSplitNames()));
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static android.content.Intent registerReceiver(android.content.Context context, io.sentry.android.core.BuildInfoProvider buildInfoProvider, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        return buildInfoProvider.getSdkInfoVersion() >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, 4) : context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public static android.content.pm.PackageInfo getPackageInfo(android.content.Context context, int i3, io.sentry.ILogger iLogger, io.sentry.android.core.BuildInfoProvider buildInfoProvider) {
        try {
            if (buildInfoProvider.getSdkInfoVersion() >= 33) {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), android.content.pm.PackageManager.PackageInfoFlags.of(i3));
            }
            return context.getPackageManager().getPackageInfo(context.getPackageName(), i3);
        } catch (java.lang.Throwable th) {
            iLogger.log(io.sentry.SentryLevel.ERROR, "Error getting package info.", th);
            return null;
        }
    }
}
