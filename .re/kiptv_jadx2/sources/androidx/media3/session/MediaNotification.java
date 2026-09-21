package androidx.media3.session;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.app.C1489i;
import androidx.core.graphics.drawable.IconCompat;
import p076i4.AbstractC2186b0;

public final class MediaNotification {
    public static final String NOTIFICATION_DISMISSED_EVENT_KEY = "androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY";
    public final Notification notification;
    public final int notificationId;

    public interface ActionFactory {
        C1489i createCustomAction(MediaSession mediaSession, IconCompat iconCompat, CharSequence charSequence, String str, Bundle bundle);

        C1489i createCustomActionFromCustomCommandButton(MediaSession mediaSession, CommandButton commandButton);

        C1489i createMediaAction(MediaSession mediaSession, IconCompat iconCompat, CharSequence charSequence, int i3);

        PendingIntent createMediaActionPendingIntent(MediaSession mediaSession, int i3);

        default PendingIntent createNotificationDismissalIntent(MediaSession mediaSession) {
            return createMediaActionPendingIntent(mediaSession, 3);
        }
    }

    public interface Provider {

        public interface Callback {
            void onNotificationChanged(MediaNotification mediaNotification);
        }

        public static class NotificationChannelInfo {
            private final String id;
            private final String name;

            public NotificationChannelInfo(String str, String str2) {
                this.id = str;
                this.name = str2;
            }

            public String getId() {
                return this.id;
            }

            public String getName() {
                return this.name;
            }
        }

        MediaNotification createNotification(MediaSession mediaSession, AbstractC2186b0 abstractC2186b0, ActionFactory actionFactory, Callback callback);

        NotificationChannelInfo getNotificationChannelInfo();

        boolean handleCustomCommand(MediaSession mediaSession, String str, Bundle bundle);
    }

    public MediaNotification(int i3, Notification notification) {
        this.notificationId = i3;
        notification.getClass();
        this.notification = notification;
    }
}
