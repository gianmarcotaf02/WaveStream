package p105m2;

import android.content.Context;
import android.media.MediaRouter;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public abstract class K {
    public static void a(MediaRouter mediaRouter, int i3, MediaRouter.Callback callback) {
        mediaRouter.addCallback(i3, callback);
    }

    public static void b(MediaRouter mediaRouter, MediaRouter.UserRouteInfo userRouteInfo) {
        mediaRouter.addUserRoute(userRouteInfo);
    }

    public static MediaRouter.Callback c(E e6) {
        return new F(e6);
    }

    public static MediaRouter.RouteCategory d(MediaRouter mediaRouter, String str, boolean z6) {
        return mediaRouter.createRouteCategory(str, z6);
    }

    public static MediaRouter.UserRouteInfo e(MediaRouter mediaRouter, MediaRouter.RouteCategory routeCategory) {
        return mediaRouter.createUserRoute(routeCategory);
    }

    public static MediaRouter.VolumeCallback f(I i3) {
        return new J(i3);
    }

    public static MediaRouter g(Context context) {
        return (MediaRouter) context.getSystemService("media_router");
    }

    public static List<MediaRouter.RouteInfo> h(MediaRouter mediaRouter) {
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        for (int i3 = 0; i3 < routeCount; i3++) {
            arrayList.add(mediaRouter.getRouteAt(i3));
        }
        return arrayList;
    }

    public static MediaRouter.RouteInfo i(MediaRouter mediaRouter, int i3) {
        return mediaRouter.getSelectedRoute(i3);
    }

    public static void j(MediaRouter mediaRouter, MediaRouter.Callback callback) {
        mediaRouter.removeCallback(callback);
    }

    public static void k(MediaRouter mediaRouter, MediaRouter.UserRouteInfo userRouteInfo) {
        try {
            mediaRouter.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e6) {
            Log.w("MediaRouterJellybean", "Failed to remove user route", e6);
        }
    }

    public static void l(MediaRouter mediaRouter, int i3, MediaRouter.RouteInfo routeInfo) {
        mediaRouter.selectRoute(i3, routeInfo);
    }
}
