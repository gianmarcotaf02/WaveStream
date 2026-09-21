package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes4.dex */
public final class RootChecker {
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName("UTF-8");
    private final io.sentry.android.core.BuildInfoProvider buildInfoProvider;
    private final android.content.Context context;
    private final io.sentry.ILogger logger;
    private final java.lang.String[] rootFiles;
    private final java.lang.String[] rootPackages;
    private final java.lang.Runtime runtime;

    public RootChecker(android.content.Context context, io.sentry.android.core.BuildInfoProvider buildInfoProvider, io.sentry.ILogger iLogger) {
        this(context, buildInfoProvider, iLogger, new java.lang.String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new java.lang.String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, java.lang.Runtime.getRuntime());
    }

    private boolean checkRootFiles() {
        for (java.lang.String str : this.rootFiles) {
            try {
                if (new java.io.File(str).exists()) {
                    return true;
                }
            } catch (java.lang.RuntimeException e6) {
                this.logger.log(io.sentry.SentryLevel.ERROR, e6, "Error when trying to check if root file %s exists.", str);
            }
        }
        return false;
    }

    private boolean checkRootPackages(io.sentry.ILogger iLogger) {
        io.sentry.android.core.BuildInfoProvider buildInfoProvider = new io.sentry.android.core.BuildInfoProvider(iLogger);
        android.content.pm.PackageManager packageManager = this.context.getPackageManager();
        if (packageManager != null) {
            for (java.lang.String str : this.rootPackages) {
                try {
                    if (buildInfoProvider.getSdkInfoVersion() >= 33) {
                        packageManager.getPackageInfo(str, android.content.pm.PackageManager.PackageInfoFlags.of(0L));
                        return true;
                    }
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047 A[PHI: r2
  0x0047: PHI (r2v3 java.lang.Process) = (r2v1 java.lang.Process), (r2v4 java.lang.Process) binds: [B:20:0x0045, B:25:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    private boolean checkSUExist() {
        java.lang.Process processExec = null;
        try {
            try {
                processExec = this.runtime.exec(new java.lang.String[]{"/system/xbin/which", androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_STARTUP});
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(processExec.getInputStream(), UTF_8));
                try {
                    boolean z6 = bufferedReader.readLine() != null;
                    bufferedReader.close();
                    processExec.destroy();
                    return z6;
                } catch (java.lang.Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                if (processExec != null) {
                    processExec.destroy();
                }
                throw th3;
            }
        } catch (java.io.IOException unused) {
            this.logger.log(io.sentry.SentryLevel.DEBUG, "SU isn't found on this Device.", new java.lang.Object[0]);
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        } catch (java.lang.Throwable th4) {
            this.logger.log(io.sentry.SentryLevel.DEBUG, "Error when trying to check if SU exists.", th4);
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        }
    }

    private boolean checkTestKeys() {
        java.lang.String buildTags = this.buildInfoProvider.getBuildTags();
        return buildTags != null && buildTags.contains("test-keys");
    }

    public boolean isDeviceRooted() {
        return checkTestKeys() || checkRootFiles() || checkSUExist() || checkRootPackages(this.logger);
    }

    public RootChecker(android.content.Context context, io.sentry.android.core.BuildInfoProvider buildInfoProvider, io.sentry.ILogger iLogger, java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.Runtime runtime) {
        this.context = (android.content.Context) io.sentry.util.Objects.requireNonNull(context, "The application context is required.");
        this.buildInfoProvider = (io.sentry.android.core.BuildInfoProvider) io.sentry.util.Objects.requireNonNull(buildInfoProvider, "The BuildInfoProvider is required.");
        this.logger = (io.sentry.ILogger) io.sentry.util.Objects.requireNonNull(iLogger, "The Logger is required.");
        this.rootFiles = (java.lang.String[]) io.sentry.util.Objects.requireNonNull(strArr, "The root Files are required.");
        this.rootPackages = (java.lang.String[]) io.sentry.util.Objects.requireNonNull(strArr2, "The root packages are required.");
        this.runtime = (java.lang.Runtime) io.sentry.util.Objects.requireNonNull(runtime, "The Runtime is required.");
    }
}
