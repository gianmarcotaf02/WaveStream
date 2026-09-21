package androidx.media3.common.util;

import U.AbstractC0944q;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public final class NotificationUtil {
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Importance {
    }

    private NotificationUtil() {
    }

    public static void createNotificationChannel(Context context, String str, int i3, int i9, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            notificationManager.getClass();
            AbstractC0944q.w();
            NotificationChannel notificationChannelE = AbstractC0944q.e(i10, str, context.getString(i3));
            if (i9 != 0) {
                notificationChannelE.setDescription(context.getString(i9));
            }
            notificationManager.createNotificationChannel(notificationChannelE);
        }
    }

    public static void setNotification(Context context, int i3, Notification notification) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        notificationManager.getClass();
        if (notification != null) {
            notificationManager.notify(i3, notification);
        } else {
            notificationManager.cancel(i3);
        }
    }
}
