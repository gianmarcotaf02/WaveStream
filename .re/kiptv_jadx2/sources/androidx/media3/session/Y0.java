package androidx.media3.session;

import java.util.List;

public final class Y0 implements MediaSessionStub.ControllerPlayerTask, MediaSessionStub.MediaItemPlayerTask {

    public final int f16971h;

    public final MediaSessionStub f16972i;
    public final int j;

    public Y0(MediaSessionStub mediaSessionStub, int i3, int i9) {
        this.f16971h = i9;
        this.f16972i = mediaSessionStub;
        this.j = i3;
    }

    @Override
    public void run(PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo) {
        switch (this.f16971h) {
            case 0:
                this.f16972i.lambda$seekToDefaultPositionWithMediaItemIndex$21(this.j, playerWrapper, controllerInfo);
                break;
            default:
                this.f16972i.lambda$removeMediaItem$49(this.j, playerWrapper, controllerInfo);
                break;
        }
    }

    @Override
    public void run(PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo, List list) {
        switch (this.f16971h) {
            case 1:
                this.f16972i.lambda$addMediaItemWithIndex$42(this.j, playerWrapper, controllerInfo, list);
                break;
            case 2:
                this.f16972i.lambda$replaceMediaItem$54(this.j, playerWrapper, controllerInfo, list);
                break;
            default:
                this.f16972i.lambda$addMediaItemsWithIndex$48(this.j, playerWrapper, controllerInfo, list);
                break;
        }
    }
}
