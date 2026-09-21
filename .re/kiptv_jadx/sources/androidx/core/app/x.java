package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static android.app.Notification.MessagingStyle a(android.app.Person person) {
        return new android.app.Notification.MessagingStyle(person);
    }

    public static android.app.Notification.MessagingStyle b(android.app.Notification.MessagingStyle messagingStyle, boolean z6) {
        return messagingStyle.setGroupConversation(z6);
    }
}
