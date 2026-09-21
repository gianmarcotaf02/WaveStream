package androidx.media3.exoplayer.drm;

import androidx.media3.common.C;
import androidx.media3.decoder.CryptoConfig;
import java.util.Map;
import java.util.UUID;

public final class ErrorStateDrmSession implements DrmSession {
    private final DrmSession.DrmSessionException error;

    public ErrorStateDrmSession(DrmSession.DrmSessionException drmSessionException) {
        drmSessionException.getClass();
        this.error = drmSessionException;
    }

    @Override
    public void acquire(DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override
    public CryptoConfig getCryptoConfig() {
        return null;
    }

    @Override
    public DrmSession.DrmSessionException getError() {
        return this.error;
    }

    @Override
    public byte[] getOfflineLicenseKeySetId() {
        return null;
    }

    @Override
    public final UUID getSchemeUuid() {
        return C.UUID_NIL;
    }

    @Override
    public int getState() {
        return 1;
    }

    @Override
    public boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Override
    public Map<String, String> queryKeyStatus() {
        return null;
    }

    @Override
    public void release(DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override
    public boolean requiresSecureDecoder(String str) {
        return false;
    }
}
