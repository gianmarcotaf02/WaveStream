package p147r2;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static android.content.pm.PackageInfo a(android.content.pm.PackageManager packageManager, android.content.Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), android.content.pm.PackageManager.PackageInfoFlags.of(0L));
    }
}
