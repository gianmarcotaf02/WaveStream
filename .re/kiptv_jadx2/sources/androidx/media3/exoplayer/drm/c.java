package androidx.media3.exoplayer.drm;

import androidx.media3.common.Format;
import com.google.common.util.concurrent.Q;

public final class c implements Runnable {

    public final int f16620h;

    public final Object f16621i;
    public final Object j;

    public c(Object obj, Object obj2, int i3) {
        this.f16620h = i3;
        this.f16621i = obj;
        this.j = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16620h) {
            case 0:
                ((DefaultDrmSessionManager.PreacquiredSessionReference) this.f16621i).lambda$acquire$0((Format) this.j);
                break;
            default:
                ((OfflineLicenseHelper) this.f16621i).lambda$releaseManagerOnHandlerThread$4((Q) this.j);
                break;
        }
    }
}
