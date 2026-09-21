package android.support.v4.media;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static android.media.MediaDescription a(android.media.MediaDescription.Builder builder) {
        return builder.build();
    }

    public static android.media.MediaDescription.Builder b() {
        return new android.media.MediaDescription.Builder();
    }

    public static java.lang.CharSequence c(android.media.MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    public static android.os.Bundle d(android.media.MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    public static android.graphics.Bitmap e(android.media.MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    public static android.net.Uri f(android.media.MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    public static java.lang.String g(android.media.MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    public static java.lang.CharSequence h(android.media.MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    public static java.lang.CharSequence i(android.media.MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    public static void j(android.media.MediaDescription.Builder builder, java.lang.CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    public static void k(android.media.MediaDescription.Builder builder, android.os.Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static void l(android.media.MediaDescription.Builder builder, android.graphics.Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    public static void m(android.media.MediaDescription.Builder builder, android.net.Uri uri) {
        builder.setIconUri(uri);
    }

    public static void n(android.media.MediaDescription.Builder builder, java.lang.String str) {
        builder.setMediaId(str);
    }

    public static void o(android.media.MediaDescription.Builder builder, java.lang.CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    public static void p(android.media.MediaDescription.Builder builder, java.lang.CharSequence charSequence) {
        builder.setTitle(charSequence);
    }
}
