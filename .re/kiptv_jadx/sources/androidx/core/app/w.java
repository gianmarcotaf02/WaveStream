package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static android.app.Notification.MessagingStyle a(android.app.Notification.MessagingStyle messagingStyle, android.app.Notification.MessagingStyle.Message message) {
        return messagingStyle.addHistoricMessage(message);
    }
}
