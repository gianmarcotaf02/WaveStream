package p105m2;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    public static void a(android.media.MediaRoute2Info.Builder builder, p105m2.C2617o c2617o) {
        if (c2617o.f25349a.getBoolean("isVisibilityPublic", true)) {
            builder.setVisibilityPublic();
        } else {
            builder.setVisibilityRestricted(c2617o.a());
        }
    }

    public static java.util.Set<java.lang.String> b(android.media.MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getDeduplicationIds();
    }

    public static int c(android.media.MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getType();
    }

    public static void d(android.media.MediaRoute2Info.Builder builder, java.util.Set<java.lang.String> set) {
        builder.setDeduplicationIds(set);
    }

    public static void e(android.media.MediaRoute2Info.Builder builder, int i3) {
        builder.setType(i3);
    }
}
