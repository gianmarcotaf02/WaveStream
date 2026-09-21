package androidx.media3.session;

import androidx.media3.common.MediaItem;

public final class I implements MediaControllerImplBase.RemoteSessionTask {

    public final int f16897h;

    public final MediaControllerImplBase f16898i;
    public final MediaItem j;

    public I(MediaControllerImplBase mediaControllerImplBase, MediaItem mediaItem, int i3) {
        this.f16897h = i3;
        this.f16898i = mediaControllerImplBase;
        this.j = mediaItem;
    }

    @Override
    public final void run(IMediaSession iMediaSession, int i3) {
        switch (this.f16897h) {
            case 0:
                this.f16898i.lambda$setMediaItem$23(this.j, iMediaSession, i3);
                break;
            default:
                this.f16898i.lambda$addMediaItem$34(this.j, iMediaSession, i3);
                break;
        }
    }
}
