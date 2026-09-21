package androidx.core.app;

import android.app.Notification;

public abstract class D {
    public static void a(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void b(Notification.Builder builder, int i3) {
        builder.setForegroundServiceBehavior(i3);
    }
}
