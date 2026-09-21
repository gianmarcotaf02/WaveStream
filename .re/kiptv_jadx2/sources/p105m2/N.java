package p105m2;

import android.media.MediaRouter;
import android.util.Log;
import android.view.Display;

public abstract class N {
    public static Display a(MediaRouter.RouteInfo routeInfo) {
        try {
            return routeInfo.getPresentationDisplay();
        } catch (NoSuchMethodError e6) {
            Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e6);
            return null;
        }
    }

    public static boolean b(MediaRouter.RouteInfo routeInfo) {
        return routeInfo.isEnabled();
    }
}
