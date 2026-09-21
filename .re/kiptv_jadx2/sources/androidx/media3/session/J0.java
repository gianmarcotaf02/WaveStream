package androidx.media3.session;

import androidx.media3.common.util.Consumer;

public final class J0 implements MediaSessionImpl.RemoteControllerTask, Consumer {

    public final int f16902h;

    public final long f16903i;

    public J0(long j, int i3) {
        this.f16902h = i3;
        this.f16903i = j;
    }

    @Override
    public void accept(Object obj) {
        ((PlayerWrapper) obj).seekTo(this.f16903i);
    }

    @Override
    public void run(MediaSession.ControllerCb controllerCb, int i3) {
        switch (this.f16902h) {
            case 0:
                controllerCb.onSeekForwardIncrementChanged(i3, this.f16903i);
                break;
            default:
                controllerCb.onSeekBackIncrementChanged(i3, this.f16903i);
                break;
        }
    }
}
