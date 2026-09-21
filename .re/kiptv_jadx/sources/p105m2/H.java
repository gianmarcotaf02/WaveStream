package p105m2;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {
    public static void a(android.media.MediaRouter.UserRouteInfo userRouteInfo, java.lang.CharSequence charSequence) {
        userRouteInfo.setName(charSequence);
    }

    public static void b(android.media.MediaRouter.UserRouteInfo userRouteInfo, int i3) {
        userRouteInfo.setPlaybackStream(i3);
    }

    public static void c(android.media.MediaRouter.UserRouteInfo userRouteInfo, int i3) {
        userRouteInfo.setPlaybackType(i3);
    }

    public static void d(android.media.MediaRouter.UserRouteInfo userRouteInfo, android.media.RemoteControlClient remoteControlClient) {
        userRouteInfo.setRemoteControlClient(remoteControlClient);
    }

    public static void e(android.media.MediaRouter.UserRouteInfo userRouteInfo, int i3) {
        userRouteInfo.setVolume(i3);
    }

    public static void f(android.media.MediaRouter.UserRouteInfo userRouteInfo, android.media.MediaRouter.VolumeCallback volumeCallback) {
        userRouteInfo.setVolumeCallback(volumeCallback);
    }

    public static void g(android.media.MediaRouter.UserRouteInfo userRouteInfo, int i3) {
        userRouteInfo.setVolumeHandling(i3);
    }

    public static void h(android.media.MediaRouter.UserRouteInfo userRouteInfo, int i3) {
        userRouteInfo.setVolumeMax(i3);
    }
}
