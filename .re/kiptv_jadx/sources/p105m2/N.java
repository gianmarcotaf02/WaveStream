package p105m2;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {
    public static android.view.Display a(android.media.MediaRouter.RouteInfo routeInfo) {
        try {
            return routeInfo.getPresentationDisplay();
        } catch (java.lang.NoSuchMethodError e6) {
            android.util.Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e6);
            return null;
        }
    }

    public static boolean b(android.media.MediaRouter.RouteInfo routeInfo) {
        return routeInfo.isEnabled();
    }
}
