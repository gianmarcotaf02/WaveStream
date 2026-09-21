package androidx.media3.session;

import androidx.media3.common.util.Consumer;

public final class C1572c0 implements Consumer {

    public final int f16996h;

    public final MediaControllerImplLegacy f16997i;
    public final MediaControllerImplLegacy.ControllerInfo j;

    public C1572c0(MediaControllerImplLegacy mediaControllerImplLegacy, MediaControllerImplLegacy.ControllerInfo controllerInfo, int i3) {
        this.f16996h = i3;
        this.f16997i = mediaControllerImplLegacy;
        this.j = controllerInfo;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f16996h) {
            case 0:
                this.f16997i.lambda$updateControllerInfo$26(this.j, (MediaController.Listener) obj);
                break;
            case 1:
                this.f16997i.lambda$updateControllerInfo$27(this.j, (MediaController.Listener) obj);
                break;
            case 2:
                this.f16997i.lambda$updateControllerInfo$28(this.j, (MediaController.Listener) obj);
                break;
            default:
                this.f16997i.lambda$updateControllerInfo$6(this.j, (MediaController.Listener) obj);
                break;
        }
    }
}
