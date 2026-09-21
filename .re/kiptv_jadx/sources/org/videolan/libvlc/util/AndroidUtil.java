package org.videolan.libvlc.util;

/* JADX INFO: loaded from: classes4.dex */
public class AndroidUtil {
    public static final boolean isMarshMallowOrLater;
    public static final boolean isNougatMR1OrLater;
    public static final boolean isNougatOrLater;
    public static final boolean isOOrLater;
    public static final boolean isPOrLater;
    public static final boolean isROrLater;

    static {
        int i3 = android.os.Build.VERSION.SDK_INT;
        isROrLater = i3 >= 30;
        boolean z6 = i3 >= 28;
        isPOrLater = z6;
        boolean z9 = z6 || i3 >= 26;
        isOOrLater = z9;
        isNougatMR1OrLater = z9 || i3 >= 25;
        isNougatOrLater = true;
        isMarshMallowOrLater = true;
    }

    public static android.net.Uri FileToUri(java.io.File file) {
        return android.net.Uri.fromFile(file);
    }

    public static android.net.Uri LocationToUri(java.lang.String str) {
        android.net.Uri uri = android.net.Uri.parse(str);
        if (uri.getScheme() != null) {
            return uri;
        }
        throw new java.lang.IllegalArgumentException("location has no scheme");
    }

    public static android.net.Uri PathToUri(java.lang.String str) {
        return android.net.Uri.fromFile(new java.io.File(str));
    }

    public static java.io.File UriToFile(android.net.Uri uri) {
        return new java.io.File(uri.getPath().replaceFirst("file://", ""));
    }

    public static android.app.Activity resolveActivity(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (context instanceof android.content.ContextWrapper) {
            return resolveActivity(((android.content.ContextWrapper) context).getBaseContext());
        }
        return null;
    }
}
