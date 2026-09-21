package androidx.media3.session;

public final class M0 implements MediaSessionLegacyStub.SessionTask {

    public final int f16917h;

    public final MediaSessionLegacyStub f16918i;

    public M0(MediaSessionLegacyStub mediaSessionLegacyStub, int i3) {
        this.f16917h = i3;
        this.f16918i = mediaSessionLegacyStub;
    }

    @Override
    public final void run(MediaSession.ControllerInfo controllerInfo) {
        switch (this.f16917h) {
            case 0:
                this.f16918i.lambda$onPause$4(controllerInfo);
                break;
            case 1:
                this.f16918i.lambda$handleMediaPlayPauseOnHandler$2(controllerInfo);
                break;
            case 2:
                this.f16918i.lambda$onFastForward$13(controllerInfo);
                break;
            case 3:
                this.f16918i.lambda$onSkipToPrevious$9(controllerInfo);
                break;
            case 4:
                this.f16918i.lambda$onSkipToPrevious$10(controllerInfo);
                break;
            case 5:
                this.f16918i.lambda$onRewind$14(controllerInfo);
                break;
            case 6:
                this.f16918i.lambda$dispatchSessionTaskWithPlayRequest$18(controllerInfo);
                break;
            case 7:
                this.f16918i.lambda$onPrepare$3(controllerInfo);
                break;
            case 8:
                this.f16918i.lambda$onStop$5(controllerInfo);
                break;
            case 9:
                this.f16918i.lambda$onSkipToNext$7(controllerInfo);
                break;
            default:
                this.f16918i.lambda$onSkipToNext$8(controllerInfo);
                break;
        }
    }
}
