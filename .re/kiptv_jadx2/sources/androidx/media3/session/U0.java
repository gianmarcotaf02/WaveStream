package androidx.media3.session;

import androidx.media3.common.util.Consumer;
import java.util.List;

public final class U0 implements MediaSessionStub.ControllerPlayerTask, MediaSessionStub.MediaItemPlayerTask, Consumer {

    public final MediaSessionStub f16954h;

    public final int f16955i;
    public final int j;

    public U0(MediaSessionStub mediaSessionStub, int i3, int i9) {
        this.f16954h = mediaSessionStub;
        this.f16955i = i3;
        this.j = i9;
    }

    @Override
    public void accept(Object obj) {
        this.f16954h.lambda$onSurfaceSizeChanged$62(this.f16955i, this.j, (PlayerWrapper) obj);
    }

    @Override
    public void run(PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo) {
        this.f16954h.lambda$removeMediaItems$50(this.f16955i, this.j, playerWrapper, controllerInfo);
    }

    @Override
    public void run(PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo, List list) {
        this.f16954h.lambda$replaceMediaItems$57(this.f16955i, this.j, playerWrapper, controllerInfo, list);
    }
}
