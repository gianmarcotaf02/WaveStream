package p145r0;

import android.app.NotificationChannel;

public abstract class h {
    public static NotificationChannel a(String str) {
        return new NotificationChannel("cast_media_notification", str, 2);
    }
}
