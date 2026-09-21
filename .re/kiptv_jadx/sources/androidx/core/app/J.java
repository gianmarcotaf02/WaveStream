package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static java.lang.String f15993d;
    public static androidx.core.app.I g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f15996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.app.NotificationManager f15997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f15992c = new java.lang.Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static java.util.HashSet f15994e = new java.util.HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.lang.Object f15995f = new java.lang.Object();

    public J(android.content.Context context) {
        this.f15996a = context;
        this.f15997b = (android.app.NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i3, android.app.Notification notification) {
        android.os.Bundle bundle = notification.extras;
        android.app.NotificationManager notificationManager = this.f15997b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i3, notification);
            return;
        }
        androidx.core.app.F f9 = new androidx.core.app.F(this.f15996a.getPackageName(), i3, notification);
        synchronized (f15995f) {
            try {
                if (g == null) {
                    g = new androidx.core.app.I(this.f15996a.getApplicationContext());
                }
                g.f15990i.obtainMessage(0, f9).sendToTarget();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(null, i3);
    }
}
