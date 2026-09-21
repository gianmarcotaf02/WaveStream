package p090k2;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static android.app.Notification.MediaStyle a(android.app.Notification.MediaStyle mediaStyle, java.lang.CharSequence charSequence, int i3, android.app.PendingIntent pendingIntent, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i3, pendingIntent);
        }
        return mediaStyle;
    }
}
