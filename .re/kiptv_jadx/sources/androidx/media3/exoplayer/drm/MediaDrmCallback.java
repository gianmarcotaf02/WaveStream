package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public interface MediaDrmCallback {

    public static final class Response {
        public final byte[] data;
        public final androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo;

        public static final class Builder {
            private final byte[] data;
            private androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo;

            public Builder(byte[] bArr) {
                this.data = bArr;
            }

            public androidx.media3.exoplayer.drm.MediaDrmCallback.Response build() {
                return new androidx.media3.exoplayer.drm.MediaDrmCallback.Response(this);
            }

            public androidx.media3.exoplayer.drm.MediaDrmCallback.Response.Builder setLoadEventInfo(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo) {
                this.loadEventInfo = loadEventInfo;
                return this;
            }
        }

        public Response(byte[] bArr) {
            this.data = bArr;
            this.loadEventInfo = null;
        }

        private Response(androidx.media3.exoplayer.drm.MediaDrmCallback.Response.Builder builder) {
            this.data = builder.data;
            this.loadEventInfo = builder.loadEventInfo;
        }
    }

    androidx.media3.exoplayer.drm.MediaDrmCallback.Response executeKeyRequest(java.util.UUID uuid, androidx.media3.exoplayer.drm.ExoMediaDrm.KeyRequest keyRequest);

    androidx.media3.exoplayer.drm.MediaDrmCallback.Response executeProvisionRequest(java.util.UUID uuid, androidx.media3.exoplayer.drm.ExoMediaDrm.ProvisionRequest provisionRequest);
}
