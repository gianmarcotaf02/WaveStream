package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.Consumer;

public final class b implements Consumer {

    public final int f16618h;

    public final Object f16619i;

    public b(int i3, Object obj) {
        this.f16618h = i3;
        this.f16619i = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f16618h) {
            case 0:
                ((DrmSessionEventListener.EventDispatcher) obj).drmKeysLoaded((KeyRequestInfo) this.f16619i);
                break;
            default:
                DefaultDrmSession.lambda$onError$2((Exception) this.f16619i, (DrmSessionEventListener.EventDispatcher) obj);
                break;
        }
    }
}
