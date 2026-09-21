package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static android.app.Notification.MessagingStyle a(android.app.Notification.MessagingStyle messagingStyle, android.app.Notification.MessagingStyle.Message message) {
        return messagingStyle.addMessage(message);
    }

    public static android.app.Notification.MessagingStyle b(java.lang.CharSequence charSequence) {
        return new android.app.Notification.MessagingStyle(charSequence);
    }

    public static android.app.Notification.MessagingStyle c(android.app.Notification.MessagingStyle messagingStyle, java.lang.CharSequence charSequence) {
        return messagingStyle.setConversationTitle(charSequence);
    }
}
