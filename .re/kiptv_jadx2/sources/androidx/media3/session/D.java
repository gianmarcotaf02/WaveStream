package androidx.media3.session;

import java.util.List;

public final class D implements MediaControllerImplBase.RemoteSessionTask {

    public final int f16875h;

    public final MediaControllerImplBase f16876i;
    public final List j;

    public D(int i3, List list, MediaControllerImplBase mediaControllerImplBase) {
        this.f16875h = i3;
        this.f16876i = mediaControllerImplBase;
        this.j = list;
    }

    @Override
    public final void run(IMediaSession iMediaSession, int i3) {
        switch (this.f16875h) {
            case 0:
                this.f16876i.lambda$addMediaItems$37(this.j, iMediaSession, i3);
                break;
            default:
                this.f16876i.lambda$setMediaItems$27(this.j, iMediaSession, i3);
                break;
        }
    }
}
