package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public interface BitmapLoader {
    com.google.common.util.concurrent.J decodeBitmap(byte[] bArr);

    com.google.common.util.concurrent.J loadBitmap(android.net.Uri uri);

    default com.google.common.util.concurrent.J loadBitmapFromMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
        byte[] bArr = mediaMetadata.artworkData;
        if (bArr != null) {
            return decodeBitmap(bArr);
        }
        android.net.Uri uri = mediaMetadata.artworkUri;
        if (uri != null) {
            return loadBitmap(uri);
        }
        return null;
    }

    boolean supportsMimeType(java.lang.String str);
}
