package androidx.core.app;

/* JADX INFO: renamed from: androidx.core.app.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1491k {
    public static void a(android.app.Notification.BigPictureStyle bigPictureStyle, android.graphics.drawable.Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    public static void b(android.app.Notification.BigPictureStyle bigPictureStyle, java.lang.CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    public static void c(android.app.Notification.BigPictureStyle bigPictureStyle, boolean z6) {
        bigPictureStyle.showBigPictureWhenCollapsed(z6);
    }
}
