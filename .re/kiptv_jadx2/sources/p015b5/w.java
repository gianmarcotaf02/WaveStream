package p015b5;

import D1.AbstractC0229n;
import U.AbstractC0944q;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.core.app.J;
import androidx.media3.exoplayer.scheduler.a;
import kotlin.jvm.internal.m;

public final class w {
    public static final v Companion = new v();

    public final Context f18004a;

    public final J f18005b;

    public w(Context context) {
        m.e(context, "context");
        this.f18004a = context;
        this.f18005b = new J(context);
    }

    public final void a() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            return;
        }
        AbstractC0944q.w();
        NotificationChannel notificationChannelD = a.d();
        notificationChannelD.setDescription("Offline download progress and completion");
        AbstractC0944q.w();
        NotificationChannel notificationChannelY = a.y();
        notificationChannelY.setDescription("Media playback controls");
        AbstractC0944q.w();
        NotificationChannel notificationChannelB = a.B();
        notificationChannelB.setDescription("Alerts when a scheduled live program is about to start");
        J j = this.f18005b;
        if (i3 >= 26) {
            AbstractC0229n.b(j.f15997b, notificationChannelD);
        } else {
            j.getClass();
        }
        NotificationManager notificationManager = j.f15997b;
        if (i3 >= 26) {
            AbstractC0229n.b(notificationManager, notificationChannelY);
        }
        if (i3 >= 26) {
            AbstractC0229n.b(notificationManager, notificationChannelB);
        }
    }
}
