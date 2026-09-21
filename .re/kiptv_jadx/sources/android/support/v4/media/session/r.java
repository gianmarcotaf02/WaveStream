package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static void a(android.media.session.PlaybackState.Builder builder, android.media.session.PlaybackState.CustomAction customAction) {
        builder.addCustomAction(customAction);
    }

    public static android.media.session.PlaybackState.CustomAction b(android.media.session.PlaybackState.CustomAction.Builder builder) {
        return builder.build();
    }

    public static android.media.session.PlaybackState c(android.media.session.PlaybackState.Builder builder) {
        return builder.build();
    }

    public static android.media.session.PlaybackState.Builder d() {
        return new android.media.session.PlaybackState.Builder();
    }

    public static android.media.session.PlaybackState.CustomAction.Builder e(java.lang.String str, java.lang.CharSequence charSequence, int i3) {
        return new android.media.session.PlaybackState.CustomAction.Builder(str, charSequence, i3);
    }

    public static java.lang.String f(android.media.session.PlaybackState.CustomAction customAction) {
        return customAction.getAction();
    }

    public static long g(android.media.session.PlaybackState playbackState) {
        return playbackState.getActions();
    }

    public static long h(android.media.session.PlaybackState playbackState) {
        return playbackState.getActiveQueueItemId();
    }

    public static long i(android.media.session.PlaybackState playbackState) {
        return playbackState.getBufferedPosition();
    }

    public static java.util.List<android.media.session.PlaybackState.CustomAction> j(android.media.session.PlaybackState playbackState) {
        return playbackState.getCustomActions();
    }

    public static java.lang.CharSequence k(android.media.session.PlaybackState playbackState) {
        return playbackState.getErrorMessage();
    }

    public static android.os.Bundle l(android.media.session.PlaybackState.CustomAction customAction) {
        return customAction.getExtras();
    }

    public static int m(android.media.session.PlaybackState.CustomAction customAction) {
        return customAction.getIcon();
    }

    public static long n(android.media.session.PlaybackState playbackState) {
        return playbackState.getLastPositionUpdateTime();
    }

    public static java.lang.CharSequence o(android.media.session.PlaybackState.CustomAction customAction) {
        return customAction.getName();
    }

    public static float p(android.media.session.PlaybackState playbackState) {
        return playbackState.getPlaybackSpeed();
    }

    public static long q(android.media.session.PlaybackState playbackState) {
        return playbackState.getPosition();
    }

    public static int r(android.media.session.PlaybackState playbackState) {
        return playbackState.getState();
    }

    public static void s(android.media.session.PlaybackState.Builder builder, long j) {
        builder.setActions(j);
    }

    public static void t(android.media.session.PlaybackState.Builder builder, long j) {
        builder.setActiveQueueItemId(j);
    }

    public static void u(android.media.session.PlaybackState.Builder builder, long j) {
        builder.setBufferedPosition(j);
    }

    public static void v(android.media.session.PlaybackState.Builder builder, java.lang.CharSequence charSequence) {
        builder.setErrorMessage(charSequence);
    }

    public static void w(android.media.session.PlaybackState.CustomAction.Builder builder, android.os.Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static void x(android.media.session.PlaybackState.Builder builder, int i3, long j, float f9, long j9) {
        builder.setState(i3, j, f9, j9);
    }
}
