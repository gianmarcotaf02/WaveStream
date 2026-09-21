package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static android.os.Parcelable a(android.graphics.drawable.Icon icon) {
        return icon;
    }

    public static void b(android.app.Notification.Builder builder, android.graphics.drawable.Icon icon) {
        builder.setLargeIcon(icon);
    }
}
