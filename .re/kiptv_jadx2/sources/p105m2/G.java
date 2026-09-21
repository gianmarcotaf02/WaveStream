package p105m2;

import android.content.Context;
import android.media.MediaRouter;

public abstract class G {
    public static CharSequence a(MediaRouter.RouteInfo routeInfo, Context context) {
        return routeInfo.getName(context);
    }

    public static int b(MediaRouter.RouteInfo routeInfo) {
        return routeInfo.getPlaybackStream();
    }

    public static int c(MediaRouter.RouteInfo routeInfo) {
        return routeInfo.getPlaybackType();
    }

    public static int d(MediaRouter.RouteInfo routeInfo) {
        return routeInfo.getSupportedTypes();
    }

    public static Object e(MediaRouter.RouteInfo routeInfo) {
        return routeInfo.getTag();
    }

    public static int f(MediaRouter.RouteInfo routeInfo) {
        return routeInfo.getVolume();
    }

    public static int g(MediaRouter.RouteInfo routeInfo) {
        return routeInfo.getVolumeHandling();
    }

    public static int h(MediaRouter.RouteInfo routeInfo) {
        return routeInfo.getVolumeMax();
    }

    public static void i(MediaRouter.RouteInfo routeInfo, int i3) {
        routeInfo.requestSetVolume(i3);
    }

    public static void j(MediaRouter.RouteInfo routeInfo, int i3) {
        routeInfo.requestUpdateVolume(i3);
    }

    public static void k(MediaRouter.RouteInfo routeInfo, Object obj) {
        routeInfo.setTag(obj);
    }
}
