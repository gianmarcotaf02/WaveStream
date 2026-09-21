package p105m2;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {
    public static java.lang.CharSequence a(android.media.MediaRouter.RouteInfo routeInfo, android.content.Context context) {
        return routeInfo.getName(context);
    }

    public static int b(android.media.MediaRouter.RouteInfo routeInfo) {
        return routeInfo.getPlaybackStream();
    }

    public static int c(android.media.MediaRouter.RouteInfo routeInfo) {
        return routeInfo.getPlaybackType();
    }

    public static int d(android.media.MediaRouter.RouteInfo routeInfo) {
        return routeInfo.getSupportedTypes();
    }

    public static java.lang.Object e(android.media.MediaRouter.RouteInfo routeInfo) {
        return routeInfo.getTag();
    }

    public static int f(android.media.MediaRouter.RouteInfo routeInfo) {
        return routeInfo.getVolume();
    }

    public static int g(android.media.MediaRouter.RouteInfo routeInfo) {
        return routeInfo.getVolumeHandling();
    }

    public static int h(android.media.MediaRouter.RouteInfo routeInfo) {
        return routeInfo.getVolumeMax();
    }

    public static void i(android.media.MediaRouter.RouteInfo routeInfo, int i3) {
        routeInfo.requestSetVolume(i3);
    }

    public static void j(android.media.MediaRouter.RouteInfo routeInfo, int i3) {
        routeInfo.requestUpdateVolume(i3);
    }

    public static void k(android.media.MediaRouter.RouteInfo routeInfo, java.lang.Object obj) {
        routeInfo.setTag(obj);
    }
}
