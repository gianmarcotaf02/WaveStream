package p105m2;

import android.media.MediaRouter;
import android.media.RemoteControlClient;

public abstract class H {
    public static void a(MediaRouter.UserRouteInfo userRouteInfo, CharSequence charSequence) {
        userRouteInfo.setName(charSequence);
    }

    public static void b(MediaRouter.UserRouteInfo userRouteInfo, int i3) {
        userRouteInfo.setPlaybackStream(i3);
    }

    public static void c(MediaRouter.UserRouteInfo userRouteInfo, int i3) {
        userRouteInfo.setPlaybackType(i3);
    }

    public static void d(MediaRouter.UserRouteInfo userRouteInfo, RemoteControlClient remoteControlClient) {
        userRouteInfo.setRemoteControlClient(remoteControlClient);
    }

    public static void e(MediaRouter.UserRouteInfo userRouteInfo, int i3) {
        userRouteInfo.setVolume(i3);
    }

    public static void f(MediaRouter.UserRouteInfo userRouteInfo, MediaRouter.VolumeCallback volumeCallback) {
        userRouteInfo.setVolumeCallback(volumeCallback);
    }

    public static void g(MediaRouter.UserRouteInfo userRouteInfo, int i3) {
        userRouteInfo.setVolumeHandling(i3);
    }

    public static void h(MediaRouter.UserRouteInfo userRouteInfo, int i3) {
        userRouteInfo.setVolumeMax(i3);
    }
}
