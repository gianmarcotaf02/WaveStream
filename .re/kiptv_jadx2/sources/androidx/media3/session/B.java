package androidx.media3.session;

import androidx.media3.common.MediaItem;

public final class B implements MediaControllerImplBase.RemoteSessionTask {

    public final int f16866h;

    public final MediaControllerImplBase f16867i;
    public final int j;

    public final MediaItem f16868k;

    public B(MediaControllerImplBase mediaControllerImplBase, int i3, MediaItem mediaItem, int i9) {
        this.f16866h = i9;
        this.f16867i = mediaControllerImplBase;
        this.j = i3;
        this.f16868k = mediaItem;
    }

    @Override
    public final void run(IMediaSession iMediaSession, int i3) {
        switch (this.f16866h) {
            case 0:
                this.f16867i.lambda$replaceMediaItem$45(this.j, this.f16868k, iMediaSession, i3);
                break;
            default:
                this.f16867i.lambda$addMediaItem$35(this.j, this.f16868k, iMediaSession, i3);
                break;
        }
    }
}
