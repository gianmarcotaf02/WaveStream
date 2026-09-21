package androidx.core.app;

import android.app.Notification;
import android.graphics.drawable.Icon;

public abstract class AbstractC1491k {
    public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z6) {
        bigPictureStyle.showBigPictureWhenCollapsed(z6);
    }
}
