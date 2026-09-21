package androidx.media3.session;

import androidx.media3.session.legacy.MediaBrowserServiceCompat;

public final class RunnableC1600q0 implements Runnable {

    public final int f17095h;

    public final com.google.common.util.concurrent.J f17096i;
    public final MediaBrowserServiceCompat.Result j;

    public RunnableC1600q0(com.google.common.util.concurrent.J j, MediaBrowserServiceCompat.Result result, int i3) {
        this.f17095h = i3;
        this.f17096i = j;
        this.j = result;
    }

    @Override
    public final void run() {
        switch (this.f17095h) {
            case 0:
                MediaLibraryServiceLegacyStub.lambda$sendLibraryResultWithMediaItemWhenReady$8(this.f17096i, this.j);
                break;
            case 1:
                MediaLibraryServiceLegacyStub.lambda$sendCustomActionResultWhenReady$7(this.f17096i, this.j);
                break;
            default:
                MediaLibraryServiceLegacyStub.lambda$sendLibraryResultWithMediaItemsWhenReady$9(this.f17096i, this.j);
                break;
        }
    }
}
