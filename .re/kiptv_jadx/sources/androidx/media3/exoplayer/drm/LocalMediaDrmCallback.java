package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final class LocalMediaDrmCallback implements androidx.media3.exoplayer.drm.MediaDrmCallback {
    private final androidx.media3.exoplayer.drm.MediaDrmCallback.Response keyResponse;

    public LocalMediaDrmCallback(byte[] bArr) {
        bArr.getClass();
        this.keyResponse = new androidx.media3.exoplayer.drm.MediaDrmCallback.Response(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.MediaDrmCallback
    public androidx.media3.exoplayer.drm.MediaDrmCallback.Response executeKeyRequest(java.util.UUID uuid, androidx.media3.exoplayer.drm.ExoMediaDrm.KeyRequest keyRequest) {
        return this.keyResponse;
    }

    @Override // androidx.media3.exoplayer.drm.MediaDrmCallback
    public androidx.media3.exoplayer.drm.MediaDrmCallback.Response executeProvisionRequest(java.util.UUID uuid, androidx.media3.exoplayer.drm.ExoMediaDrm.ProvisionRequest provisionRequest) {
        throw new java.lang.UnsupportedOperationException();
    }
}
