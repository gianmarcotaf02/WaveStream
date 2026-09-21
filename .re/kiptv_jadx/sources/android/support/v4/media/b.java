package android.support.v4.media;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static android.net.Uri a(android.media.MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static void b(android.media.MediaDescription.Builder builder, android.net.Uri uri) {
        builder.setMediaUri(uri);
    }
}
