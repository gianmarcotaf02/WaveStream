package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static android.app.Notification.MessagingStyle.Message a(java.lang.CharSequence charSequence, long j, java.lang.CharSequence charSequence2) {
        return new android.app.Notification.MessagingStyle.Message(charSequence, j, charSequence2);
    }

    public static android.app.Notification.MessagingStyle.Message b(android.app.Notification.MessagingStyle.Message message, java.lang.String str, android.net.Uri uri) {
        return message.setData(str, uri);
    }
}
