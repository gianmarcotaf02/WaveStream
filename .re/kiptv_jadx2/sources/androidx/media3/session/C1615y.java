package androidx.media3.session;

import androidx.media3.common.MediaItem;

public final class C1615y implements p068h4.j {

    public final int f17136a;

    public final MediaControllerImplBase f17137b;

    public C1615y(MediaControllerImplBase mediaControllerImplBase, int i3) {
        this.f17136a = i3;
        this.f17137b = mediaControllerImplBase;
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.f17136a) {
            case 0:
                return this.f17137b.lambda$setMediaItems$28((MediaItem) obj);
            case 1:
                return this.f17137b.lambda$addMediaItems$38((MediaItem) obj);
            case 2:
                return this.f17137b.lambda$replaceMediaItems$46((MediaItem) obj);
            case 3:
                return this.f17137b.lambda$setMediaItems$30((MediaItem) obj);
            case 4:
                return this.f17137b.lambda$setMediaItems$26((MediaItem) obj);
            default:
                return this.f17137b.lambda$addMediaItems$36((MediaItem) obj);
        }
    }
}
