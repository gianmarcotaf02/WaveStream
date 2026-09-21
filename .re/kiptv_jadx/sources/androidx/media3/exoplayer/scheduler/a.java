package androidx.media3.exoplayer.scheduler;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ android.app.NotificationChannel B() {
        return new android.app.NotificationChannel("epg_reminders", "EPG Reminders", 4);
    }

    public static /* synthetic */ android.app.NotificationChannel d() {
        return new android.app.NotificationChannel("downloads", "Downloads", 2);
    }

    public static /* bridge */ /* synthetic */ java.nio.file.Path i(java.lang.Object obj) {
        return (java.nio.file.Path) obj;
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ android.app.NotificationChannel y() {
        return new android.app.NotificationChannel("playback", "Playback", 2);
    }
}
