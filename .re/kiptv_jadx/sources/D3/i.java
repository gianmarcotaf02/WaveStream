package D3;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f2110b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f2111c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f2113e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f2109a = new java.util.concurrent.atomic.AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f2112d = new java.util.concurrent.atomic.AtomicBoolean();

    public static boolean a(android.content.Context context) {
        try {
            java.util.Iterator<android.content.pm.PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.Exception unused) {
            return false;
        }
    }
}
