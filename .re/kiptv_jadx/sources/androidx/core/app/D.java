package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    public static void a(android.app.Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void b(android.app.Notification.Builder builder, int i3) {
        builder.setForegroundServiceBehavior(i3);
    }
}
