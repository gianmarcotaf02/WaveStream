package p105m2;

import android.media.MediaRoute2Info;
import java.util.Set;

public abstract class B {
    public static void a(MediaRoute2Info.Builder builder, C2617o c2617o) {
        if (c2617o.f25349a.getBoolean("isVisibilityPublic", true)) {
            builder.setVisibilityPublic();
        } else {
            builder.setVisibilityRestricted(c2617o.a());
        }
    }

    public static Set<String> b(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getDeduplicationIds();
    }

    public static int c(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getType();
    }

    public static void d(MediaRoute2Info.Builder builder, Set<String> set) {
        builder.setDeduplicationIds(set);
    }

    public static void e(MediaRoute2Info.Builder builder, int i3) {
        builder.setType(i3);
    }
}
