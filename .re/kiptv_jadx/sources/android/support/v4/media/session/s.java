package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static android.os.Bundle a(android.media.session.PlaybackState playbackState) {
        return playbackState.getExtras();
    }

    public static void b(android.media.session.PlaybackState.Builder builder, android.os.Bundle bundle) {
        builder.setExtras(bundle);
    }
}
