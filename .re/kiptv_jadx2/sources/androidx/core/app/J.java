package androidx.core.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

public final class J {

    public static String f15993d;
    public static I g;

    public final Context f15996a;

    public final NotificationManager f15997b;

    public static final Object f15992c = new Object();

    public static HashSet f15994e = new HashSet();

    public static final Object f15995f = new Object();

    public J(Context context) {
        this.f15996a = context;
        this.f15997b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i3, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.f15997b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i3, notification);
            return;
        }
        F f9 = new F(this.f15996a.getPackageName(), i3, notification);
        synchronized (f15995f) {
            try {
                if (g == null) {
                    g = new I(this.f15996a.getApplicationContext());
                }
                g.f15990i.obtainMessage(0, f9).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(null, i3);
    }
}
