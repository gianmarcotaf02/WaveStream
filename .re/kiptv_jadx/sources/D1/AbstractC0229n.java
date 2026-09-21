package D1;

/* JADX INFO: renamed from: D1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0229n {
    public static android.app.Notification.Builder a(android.content.Context context, java.lang.String str) {
        return new android.app.Notification.Builder(context, str);
    }

    public static void b(android.app.NotificationManager notificationManager, android.app.NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static android.graphics.drawable.Icon c(android.graphics.Bitmap bitmap) {
        return android.graphics.drawable.Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static android.view.autofill.AutofillId d(android.view.View view) {
        return view.getAutofillId();
    }

    public static float e(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static android.app.NotificationChannel f(android.app.NotificationManager notificationManager) {
        return notificationManager.getNotificationChannel("epg_reminders");
    }

    public static float g(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float h(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static float i(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static void j(android.view.MenuItem menuItem, char c9, int i3) {
        menuItem.setAlphabeticShortcut(c9, i3);
    }

    public static void k(android.app.Notification.Builder builder, int i3) {
        builder.setBadgeIconType(i3);
    }

    public static void l(android.app.Notification.Builder builder, boolean z6) {
        builder.setColorized(z6);
    }

    public static void m(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void n(android.app.Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void o(android.view.MenuItem menuItem, android.content.res.ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void p(android.view.MenuItem menuItem, android.graphics.PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void q(android.view.MenuItem menuItem, char c9, int i3) {
        menuItem.setNumericShortcut(c9, i3);
    }

    public static void r(android.app.Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void s(android.app.Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void t(android.app.Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void u(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void v(android.content.Context context, android.content.Intent intent) {
        context.startForegroundService(intent);
    }
}
