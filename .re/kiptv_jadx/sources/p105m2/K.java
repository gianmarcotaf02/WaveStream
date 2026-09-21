package p105m2;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {
    public static void a(android.media.MediaRouter mediaRouter, int i3, android.media.MediaRouter.Callback callback) {
        mediaRouter.addCallback(i3, callback);
    }

    public static void b(android.media.MediaRouter mediaRouter, android.media.MediaRouter.UserRouteInfo userRouteInfo) {
        mediaRouter.addUserRoute(userRouteInfo);
    }

    public static android.media.MediaRouter.Callback c(p105m2.E e6) {
        return new p105m2.F(e6);
    }

    public static android.media.MediaRouter.RouteCategory d(android.media.MediaRouter mediaRouter, java.lang.String str, boolean z6) {
        return mediaRouter.createRouteCategory(str, z6);
    }

    public static android.media.MediaRouter.UserRouteInfo e(android.media.MediaRouter mediaRouter, android.media.MediaRouter.RouteCategory routeCategory) {
        return mediaRouter.createUserRoute(routeCategory);
    }

    public static android.media.MediaRouter.VolumeCallback f(p105m2.I i3) {
        return new p105m2.J(i3);
    }

    public static android.media.MediaRouter g(android.content.Context context) {
        return (android.media.MediaRouter) context.getSystemService("media_router");
    }

    public static java.util.List<android.media.MediaRouter.RouteInfo> h(android.media.MediaRouter mediaRouter) {
        int routeCount = mediaRouter.getRouteCount();
        java.util.ArrayList arrayList = new java.util.ArrayList(routeCount);
        for (int i3 = 0; i3 < routeCount; i3++) {
            arrayList.add(mediaRouter.getRouteAt(i3));
        }
        return arrayList;
    }

    public static android.media.MediaRouter.RouteInfo i(android.media.MediaRouter mediaRouter, int i3) {
        return mediaRouter.getSelectedRoute(i3);
    }

    public static void j(android.media.MediaRouter mediaRouter, android.media.MediaRouter.Callback callback) {
        mediaRouter.removeCallback(callback);
    }

    public static void k(android.media.MediaRouter mediaRouter, android.media.MediaRouter.UserRouteInfo userRouteInfo) {
        try {
            mediaRouter.removeUserRoute(userRouteInfo);
        } catch (java.lang.IllegalArgumentException e6) {
            android.util.Log.w("MediaRouterJellybean", "Failed to remove user route", e6);
        }
    }

    public static void l(android.media.MediaRouter mediaRouter, int i3, android.media.MediaRouter.RouteInfo routeInfo) {
        mediaRouter.selectRoute(i3, routeInfo);
    }
}
