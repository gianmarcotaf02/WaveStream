package p015b5;

/* JADX INFO: loaded from: classes.dex */
public final class w {
    public static final p015b5.v Companion = new p015b5.v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f18004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.core.app.J f18005b;

    public w(android.content.Context context) {
        kotlin.jvm.internal.m.e(context, "context");
        this.f18004a = context;
        this.f18005b = new androidx.core.app.J(context);
    }

    public final void a() {
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 < 26) {
            return;
        }
        U.AbstractC0944q.w();
        android.app.NotificationChannel notificationChannelD = androidx.media3.exoplayer.scheduler.a.d();
        notificationChannelD.setDescription("Offline download progress and completion");
        U.AbstractC0944q.w();
        android.app.NotificationChannel notificationChannelY = androidx.media3.exoplayer.scheduler.a.y();
        notificationChannelY.setDescription("Media playback controls");
        U.AbstractC0944q.w();
        android.app.NotificationChannel notificationChannelB = androidx.media3.exoplayer.scheduler.a.B();
        notificationChannelB.setDescription("Alerts when a scheduled live program is about to start");
        androidx.core.app.J j = this.f18005b;
        if (i3 >= 26) {
            D1.AbstractC0229n.b(j.f15997b, notificationChannelD);
        } else {
            j.getClass();
        }
        android.app.NotificationManager notificationManager = j.f15997b;
        if (i3 >= 26) {
            D1.AbstractC0229n.b(notificationManager, notificationChannelY);
        }
        if (i3 >= 26) {
            D1.AbstractC0229n.b(notificationManager, notificationChannelB);
        }
    }
}
