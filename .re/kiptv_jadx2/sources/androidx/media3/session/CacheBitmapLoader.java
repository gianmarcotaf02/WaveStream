package androidx.media3.session;

import android.net.Uri;
import androidx.media3.common.MediaMetadata;
import java.util.Arrays;

public final class CacheBitmapLoader implements androidx.media3.common.util.BitmapLoader {
    private final androidx.media3.common.util.BitmapLoader bitmapLoader;
    private BitmapLoadRequest lastBitmapLoadRequest;

    public static class BitmapLoadRequest {
        private final byte[] data;
        private final com.google.common.util.concurrent.J future;
        private final Uri uri;

        public com.google.common.util.concurrent.J getFuture() {
            com.google.common.util.concurrent.J j = this.future;
            j.getClass();
            return j;
        }

        public boolean matches(byte[] bArr) {
            byte[] bArr2 = this.data;
            return bArr2 != null && Arrays.equals(bArr2, bArr);
        }

        public boolean matches(Uri uri) {
            Uri uri2 = this.uri;
            return uri2 != null && uri2.equals(uri);
        }

        public boolean matches(MediaMetadata mediaMetadata) {
            Uri uri = this.uri;
            if (uri != null && uri.equals(mediaMetadata.artworkUri)) {
                return true;
            }
            byte[] bArr = this.data;
            return bArr != null && Arrays.equals(bArr, mediaMetadata.artworkData);
        }

        private BitmapLoadRequest(byte[] bArr, com.google.common.util.concurrent.J j) {
            this.data = bArr;
            this.uri = null;
            this.future = j;
        }

        private BitmapLoadRequest(Uri uri, com.google.common.util.concurrent.J j) {
            this.data = null;
            this.uri = uri;
            this.future = j;
        }

        private BitmapLoadRequest(MediaMetadata mediaMetadata, com.google.common.util.concurrent.J j) {
            this.data = mediaMetadata.artworkData;
            this.uri = mediaMetadata.artworkUri;
            this.future = j;
        }
    }

    public CacheBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
        this.bitmapLoader = bitmapLoader;
    }

    @Override
    public com.google.common.util.concurrent.J decodeBitmap(byte[] bArr) {
        BitmapLoadRequest bitmapLoadRequest = this.lastBitmapLoadRequest;
        if (bitmapLoadRequest != null && bitmapLoadRequest.matches(bArr)) {
            return this.lastBitmapLoadRequest.getFuture();
        }
        com.google.common.util.concurrent.J jDecodeBitmap = this.bitmapLoader.decodeBitmap(bArr);
        this.lastBitmapLoadRequest = new BitmapLoadRequest(bArr, jDecodeBitmap);
        return jDecodeBitmap;
    }

    @Override
    public com.google.common.util.concurrent.J loadBitmap(Uri uri) {
        BitmapLoadRequest bitmapLoadRequest = this.lastBitmapLoadRequest;
        if (bitmapLoadRequest != null && bitmapLoadRequest.matches(uri)) {
            return this.lastBitmapLoadRequest.getFuture();
        }
        com.google.common.util.concurrent.J jLoadBitmap = this.bitmapLoader.loadBitmap(uri);
        this.lastBitmapLoadRequest = new BitmapLoadRequest(uri, jLoadBitmap);
        return jLoadBitmap;
    }

    @Override
    public com.google.common.util.concurrent.J loadBitmapFromMetadata(MediaMetadata mediaMetadata) {
        BitmapLoadRequest bitmapLoadRequest = this.lastBitmapLoadRequest;
        if (bitmapLoadRequest != null && bitmapLoadRequest.matches(mediaMetadata)) {
            return this.lastBitmapLoadRequest.getFuture();
        }
        com.google.common.util.concurrent.J jLoadBitmapFromMetadata = this.bitmapLoader.loadBitmapFromMetadata(mediaMetadata);
        if (jLoadBitmapFromMetadata == null) {
            return null;
        }
        this.lastBitmapLoadRequest = new BitmapLoadRequest(mediaMetadata, jLoadBitmapFromMetadata);
        return jLoadBitmapFromMetadata;
    }

    @Override
    public boolean supportsMimeType(String str) {
        return this.bitmapLoader.supportsMimeType(str);
    }
}
