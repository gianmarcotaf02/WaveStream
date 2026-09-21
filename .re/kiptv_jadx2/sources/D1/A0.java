package D1;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import p076i4.AbstractC2186b0;

public abstract class A0 {
    public static MediaRoute2Info c(Object obj) {
        return (MediaRoute2Info) obj;
    }

    public static MediaRouter2$ControllerCallback d(Object obj) {
        return (MediaRouter2$ControllerCallback) obj;
    }

    public static MediaRouter2$RouteCallback e(Object obj) {
        return (MediaRouter2$RouteCallback) obj;
    }

    public static MediaRouter2 h(Object obj) {
        return (MediaRouter2) obj;
    }

    public static RouteDiscoveryPreference.Builder i(AbstractC2186b0 abstractC2186b0) {
        return new RouteDiscoveryPreference.Builder(abstractC2186b0, false);
    }

    public static void o() {
    }
}
