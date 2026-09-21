package androidx.core.app;

import android.app.Notification;
import android.app.Person;

public abstract class x {
    public static Notification.MessagingStyle a(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z6) {
        return messagingStyle.setGroupConversation(z6);
    }
}
