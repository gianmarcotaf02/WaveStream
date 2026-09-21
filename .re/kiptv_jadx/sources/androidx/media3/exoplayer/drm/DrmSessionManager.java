package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public interface DrmSessionManager {
    public static final androidx.media3.exoplayer.drm.DrmSessionManager DRM_UNSUPPORTED = new androidx.media3.exoplayer.drm.DrmSessionManager() { // from class: androidx.media3.exoplayer.drm.DrmSessionManager.1
        @Override // androidx.media3.exoplayer.drm.DrmSessionManager
        public androidx.media3.exoplayer.drm.DrmSession acquireSession(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.common.Format format) {
            if (format.drmInitData == null) {
                return null;
            }
            return new androidx.media3.exoplayer.drm.ErrorStateDrmSession(new androidx.media3.exoplayer.drm.DrmSession.DrmSessionException(new androidx.media3.exoplayer.drm.UnsupportedDrmException(1), androidx.media3.common.PlaybackException.ERROR_CODE_DRM_SCHEME_UNSUPPORTED));
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionManager
        public int getCryptoType(androidx.media3.common.Format format) {
            return format.drmInitData != null ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionManager
        public void setPlayer(android.os.Looper looper, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        }
    };

    public interface DrmSessionReference {
        public static final androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference EMPTY = new androidx.media3.exoplayer.drm.a(3);

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$static$0() {
        }

        void release();
    }

    androidx.media3.exoplayer.drm.DrmSession acquireSession(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.common.Format format);

    int getCryptoType(androidx.media3.common.Format format);

    default androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference preacquireSession(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.common.Format format) {
        return androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference.EMPTY;
    }

    default void prepare() {
    }

    default void release() {
    }

    void setPlayer(android.os.Looper looper, androidx.media3.exoplayer.analytics.PlayerId playerId);
}
