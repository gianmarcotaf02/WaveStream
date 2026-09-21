package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static android.app.Notification.CallStyle a(android.app.Person person, android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2) {
        return android.app.Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
    }

    public static android.app.Notification.CallStyle b(android.app.Person person, android.app.PendingIntent pendingIntent) {
        return android.app.Notification.CallStyle.forOngoingCall(person, pendingIntent);
    }

    public static android.app.Notification.CallStyle c(android.app.Person person, android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2) {
        return android.app.Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
    }

    public static android.app.Notification.CallStyle d(android.app.Notification.CallStyle callStyle, int i3) {
        return callStyle.setAnswerButtonColorHint(i3);
    }

    public static android.app.Notification.CallStyle e(android.app.Notification.CallStyle callStyle, int i3) {
        return callStyle.setDeclineButtonColorHint(i3);
    }

    public static android.app.Notification.CallStyle f(android.app.Notification.CallStyle callStyle, boolean z6) {
        return callStyle.setIsVideo(z6);
    }

    public static android.app.Notification.CallStyle g(android.app.Notification.CallStyle callStyle, android.graphics.drawable.Icon icon) {
        return callStyle.setVerificationIcon(icon);
    }

    public static android.app.Notification.CallStyle h(android.app.Notification.CallStyle callStyle, java.lang.CharSequence charSequence) {
        return callStyle.setVerificationText(charSequence);
    }
}
