package D1;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;

public abstract class AbstractC0229n {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static void b(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static Icon c(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static AutofillId d(View view) {
        return view.getAutofillId();
    }

    public static float e(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static NotificationChannel f(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannel("epg_reminders");
    }

    public static float g(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float h(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static float i(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static void j(MenuItem menuItem, char c9, int i3) {
        menuItem.setAlphabeticShortcut(c9, i3);
    }

    public static void k(Notification.Builder builder, int i3) {
        builder.setBadgeIconType(i3);
    }

    public static void l(Notification.Builder builder, boolean z6) {
        builder.setColorized(z6);
    }

    public static void m(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void n(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void o(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void p(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void q(MenuItem menuItem, char c9, int i3) {
        menuItem.setNumericShortcut(c9, i3);
    }

    public static void r(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void s(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void t(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void u(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void v(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
