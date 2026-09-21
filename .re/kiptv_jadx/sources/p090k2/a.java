package p090k2;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static android.app.Notification.MediaStyle a() {
        return new android.app.Notification.MediaStyle();
    }

    public static android.app.Notification.MediaStyle b(android.app.Notification.MediaStyle mediaStyle, int[] iArr, android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (iArr != null) {
            e(mediaStyle, iArr);
        }
        if (mediaSessionCompat$Token != null) {
            c(mediaStyle, (android.media.session.MediaSession.Token) mediaSessionCompat$Token.f15567i);
        }
        return mediaStyle;
    }

    public static void c(android.app.Notification.MediaStyle mediaStyle, android.media.session.MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    public static void d(android.app.Notification.Builder builder, android.app.Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    public static void e(android.app.Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}
