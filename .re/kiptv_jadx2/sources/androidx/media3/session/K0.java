package androidx.media3.session;

import androidx.media3.common.util.Consumer;

public final class K0 implements MediaSessionImpl.RemoteControllerTask, Consumer {

    public final int f16906h;

    public final boolean f16907i;
    public final int j;

    public K0(int i3, boolean z6) {
        this.f16906h = 0;
        this.j = i3;
        this.f16907i = z6;
    }

    @Override
    public void accept(Object obj) {
        ((PlayerWrapper) obj).setDeviceMuted(this.f16907i, this.j);
    }

    @Override
    public void run(MediaSession.ControllerCb controllerCb, int i3) {
        switch (this.f16906h) {
            case 0:
                controllerCb.onDeviceVolumeChanged(i3, this.j, this.f16907i);
                break;
            default:
                controllerCb.onPlayWhenReadyChanged(i3, this.f16907i, this.j);
                break;
        }
    }

    public K0(boolean z6, int i3, int i9) {
        this.f16906h = i9;
        this.f16907i = z6;
        this.j = i3;
    }
}
