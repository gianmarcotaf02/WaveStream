package androidx.media3.exoplayer.scheduler;

import android.app.NotificationChannel;
import java.nio.file.Path;

public abstract class a {
    public static NotificationChannel B() {
        return new NotificationChannel("epg_reminders", "EPG Reminders", 4);
    }

    public static NotificationChannel d() {
        return new NotificationChannel("downloads", "Downloads", 2);
    }

    public static Path i(Object obj) {
        return (Path) obj;
    }

    public static void l() {
    }

    public static NotificationChannel y() {
        return new NotificationChannel("playback", "Playback", 2);
    }
}
