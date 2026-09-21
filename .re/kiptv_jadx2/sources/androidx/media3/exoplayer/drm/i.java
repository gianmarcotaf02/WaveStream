package androidx.media3.exoplayer.drm;

import com.google.common.util.concurrent.Q;

public final class i implements Runnable {

    public final int f16632h;

    public final OfflineLicenseHelper f16633i;
    public final DrmSession j;

    public final Q f16634k;

    public i(DrmSession drmSession, OfflineLicenseHelper offlineLicenseHelper, Q q9) {
        this.f16632h = 1;
        this.f16633i = offlineLicenseHelper;
        this.j = drmSession;
        this.f16634k = q9;
    }

    @Override
    public final void run() {
        switch (this.f16632h) {
            case 0:
                this.f16633i.lambda$getLicenseDurationRemainingSec$0(this.f16634k, this.j);
                break;
            case 1:
                this.f16633i.lambda$acquireFirstSessionOnHandlerThread$3(this.j, this.f16634k);
                break;
            default:
                this.f16633i.lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1(this.f16634k, this.j);
                break;
        }
    }

    public i(OfflineLicenseHelper offlineLicenseHelper, Q q9, DrmSession drmSession, int i3) {
        this.f16632h = i3;
        this.f16633i = offlineLicenseHelper;
        this.f16634k = q9;
        this.j = drmSession;
    }
}
