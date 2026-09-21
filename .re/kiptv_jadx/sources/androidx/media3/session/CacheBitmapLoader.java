package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final class CacheBitmapLoader implements androidx.media3.common.util.BitmapLoader {
    private final androidx.media3.common.util.BitmapLoader bitmapLoader;
    private androidx.media3.session.CacheBitmapLoader.BitmapLoadRequest lastBitmapLoadRequest;

    public static class BitmapLoadRequest {
        private final byte[] data;
        private final com.google.common.util.concurrent.J future;
        private final android.net.Uri uri;

        /* JADX INFO: Access modifiers changed from: private */
        public com.google.common.util.concurrent.J getFuture() {
            com.google.common.util.concurrent.J j = this.future;
            j.getClass();
            return j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean matches(byte[] bArr) {
            byte[] bArr2 = this.data;
            return bArr2 != null && java.util.Arrays.equals(bArr2, bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean matches(android.net.Uri uri) {
            android.net.Uri uri2 = this.uri;
            return uri2 != null && uri2.equals(uri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean matches(androidx.media3.common.MediaMetadata mediaMetadata) {
            android.net.Uri uri = this.uri;
            if (uri != null && uri.equals(mediaMetadata.artworkUri)) {
                return true;
            }
            byte[] bArr = this.data;
            return bArr != null && java.util.Arrays.equals(bArr, mediaMetadata.artworkData);
        }

        private BitmapLoadRequest(byte[] bArr, com.google.common.util.concurrent.J j) {
            this.data = bArr;
            this.uri = null;
            this.future = j;
        }

        private BitmapLoadRequest(android.net.Uri uri, com.google.common.util.concurrent.J j) {
            this.data = null;
            this.uri = uri;
            this.future = j;
        }

        private BitmapLoadRequest(androidx.media3.common.MediaMetadata mediaMetadata, com.google.common.util.concurrent.J j) {
            this.data = mediaMetadata.artworkData;
            this.uri = mediaMetadata.artworkUri;
            this.future = j;
        }
    }

    public CacheBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
        this.bitmapLoader = bitmapLoader;
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public com.google.common.util.concurrent.J decodeBitmap(byte[] bArr) {
        androidx.media3.session.CacheBitmapLoader.BitmapLoadRequest bitmapLoadRequest = this.lastBitmapLoadRequest;
        if (bitmapLoadRequest != null && bitmapLoadRequest.matches(bArr)) {
            return this.lastBitmapLoadRequest.getFuture();
        }
        com.google.common.util.concurrent.J jDecodeBitmap = this.bitmapLoader.decodeBitmap(bArr);
        this.lastBitmapLoadRequest = new androidx.media3.session.CacheBitmapLoader.BitmapLoadRequest(bArr, jDecodeBitmap);
        return jDecodeBitmap;
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public com.google.common.util.concurrent.J loadBitmap(android.net.Uri uri) {
        androidx.media3.session.CacheBitmapLoader.BitmapLoadRequest bitmapLoadRequest = this.lastBitmapLoadRequest;
        if (bitmapLoadRequest != null && bitmapLoadRequest.matches(uri)) {
            return this.lastBitmapLoadRequest.getFuture();
        }
        com.google.common.util.concurrent.J jLoadBitmap = this.bitmapLoader.loadBitmap(uri);
        this.lastBitmapLoadRequest = new androidx.media3.session.CacheBitmapLoader.BitmapLoadRequest(uri, jLoadBitmap);
        return jLoadBitmap;
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public com.google.common.util.concurrent.J loadBitmapFromMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
        androidx.media3.session.CacheBitmapLoader.BitmapLoadRequest bitmapLoadRequest = this.lastBitmapLoadRequest;
        if (bitmapLoadRequest != null && bitmapLoadRequest.matches(mediaMetadata)) {
            return this.lastBitmapLoadRequest.getFuture();
        }
        com.google.common.util.concurrent.J jLoadBitmapFromMetadata = this.bitmapLoader.loadBitmapFromMetadata(mediaMetadata);
        if (jLoadBitmapFromMetadata == null) {
            return null;
        }
        this.lastBitmapLoadRequest = new androidx.media3.session.CacheBitmapLoader.BitmapLoadRequest(mediaMetadata, jLoadBitmapFromMetadata);
        return jLoadBitmapFromMetadata;
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public boolean supportsMimeType(java.lang.String str) {
        return this.bitmapLoader.supportsMimeType(str);
    }
}
