package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final class MediaNotification {
    public static final java.lang.String NOTIFICATION_DISMISSED_EVENT_KEY = "androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY";
    public final android.app.Notification notification;
    public final int notificationId;

    public interface ActionFactory {
        androidx.core.app.C1489i createCustomAction(androidx.media3.session.MediaSession mediaSession, androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, java.lang.String str, android.os.Bundle bundle);

        androidx.core.app.C1489i createCustomActionFromCustomCommandButton(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.CommandButton commandButton);

        androidx.core.app.C1489i createMediaAction(androidx.media3.session.MediaSession mediaSession, androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, int i3);

        android.app.PendingIntent createMediaActionPendingIntent(androidx.media3.session.MediaSession mediaSession, int i3);

        default android.app.PendingIntent createNotificationDismissalIntent(androidx.media3.session.MediaSession mediaSession) {
            return createMediaActionPendingIntent(mediaSession, 3);
        }
    }

    public interface Provider {

        public interface Callback {
            void onNotificationChanged(androidx.media3.session.MediaNotification mediaNotification);
        }

        public static class NotificationChannelInfo {
            private final java.lang.String id;
            private final java.lang.String name;

            public NotificationChannelInfo(java.lang.String str, java.lang.String str2) {
                this.id = str;
                this.name = str2;
            }

            public java.lang.String getId() {
                return this.id;
            }

            public java.lang.String getName() {
                return this.name;
            }
        }

        androidx.media3.session.MediaNotification createNotification(androidx.media3.session.MediaSession mediaSession, p076i4.AbstractC2186b0 abstractC2186b0, androidx.media3.session.MediaNotification.ActionFactory actionFactory, androidx.media3.session.MediaNotification.Provider.Callback callback);

        androidx.media3.session.MediaNotification.Provider.NotificationChannelInfo getNotificationChannelInfo();

        boolean handleCustomCommand(androidx.media3.session.MediaSession mediaSession, java.lang.String str, android.os.Bundle bundle);
    }

    public MediaNotification(int i3, android.app.Notification notification) {
        this.notificationId = i3;
        notification.getClass();
        this.notification = notification;
    }
}
