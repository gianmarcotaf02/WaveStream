package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationUtil {
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Importance {
    }

    private NotificationUtil() {
    }

    public static void createNotificationChannel(android.content.Context context, java.lang.String str, int i3, int i9, int i10) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService("notification");
            notificationManager.getClass();
            U.AbstractC0944q.w();
            android.app.NotificationChannel notificationChannelE = U.AbstractC0944q.e(i10, str, context.getString(i3));
            if (i9 != 0) {
                notificationChannelE.setDescription(context.getString(i9));
            }
            notificationManager.createNotificationChannel(notificationChannelE);
        }
    }

    public static void setNotification(android.content.Context context, int i3, android.app.Notification notification) {
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService("notification");
        notificationManager.getClass();
        if (notification != null) {
            notificationManager.notify(i3, notification);
        } else {
            notificationManager.cancel(i3);
        }
    }
}
