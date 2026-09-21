package androidx.media3.session;

import p076i4.AbstractC2186b0;

public final class B0 implements MediaSessionImpl.RemoteControllerTask, MediaSessionStub.SessionTask {

    public final int f16869h;

    public final AbstractC2186b0 f16870i;

    public B0(int i3, AbstractC2186b0 abstractC2186b0) {
        this.f16869h = i3;
        this.f16870i = abstractC2186b0;
    }

    @Override
    public Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i3) {
        switch (this.f16869h) {
            case 4:
                return MediaSessionStub.lambda$replaceMediaItems$56(this.f16870i, mediaSessionImpl, controllerInfo, i3);
            case 5:
                return MediaSessionStub.lambda$addMediaItemsWithIndex$47(this.f16870i, mediaSessionImpl, controllerInfo, i3);
            default:
                return MediaSessionStub.lambda$addMediaItems$44(this.f16870i, mediaSessionImpl, controllerInfo, i3);
        }
    }

    @Override
    public void run(MediaSession.ControllerCb controllerCb, int i3) {
        switch (this.f16869h) {
            case 0:
                controllerCb.setMediaButtonPreferences(i3, this.f16870i);
                break;
            case 1:
                controllerCb.setMediaButtonPreferences(i3, this.f16870i);
                break;
            case 2:
                controllerCb.setCustomLayout(i3, this.f16870i);
                break;
            default:
                controllerCb.setCustomLayout(i3, this.f16870i);
                break;
        }
    }
}
