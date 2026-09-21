package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1595o implements androidx.media3.common.util.Consumer, androidx.media3.common.util.ListenerSet.Event, androidx.media3.session.MediaControllerImplBase.RemoteSessionTask, androidx.media3.common.util.ListenerSet.IterationFinishedEvent {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaControllerImplBase f17086i;

    public /* synthetic */ C1595o(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase, int i3) {
        this.f17085h = i3;
        this.f17086i = mediaControllerImplBase;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        switch (this.f17085h) {
            case 0:
                this.f17086i.lambda$onAvailableCommandsChangedFromSession$118((androidx.media3.session.MediaController.Listener) obj);
                break;
            case 1:
                this.f17086i.lambda$onAvailableCommandsChangedFromSession$119((androidx.media3.session.MediaController.Listener) obj);
                break;
            case 2:
            default:
                this.f17086i.lambda$onAvailableCommandsChangedFromPlayer$122((androidx.media3.session.MediaController.Listener) obj);
                break;
            case 3:
                this.f17086i.lambda$onAvailableCommandsChangedFromPlayer$121((androidx.media3.session.MediaController.Listener) obj);
                break;
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        switch (this.f17085h) {
            case 2:
                this.f17086i.lambda$onAvailableCommandsChangedFromPlayer$120((androidx.media3.common.Player.Listener) obj);
                break;
            default:
                this.f17086i.lambda$onAvailableCommandsChangedFromSession$116((androidx.media3.common.Player.Listener) obj);
                break;
        }
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        switch (this.f17085h) {
            case 5:
                this.f17086i.lambda$mute$58(0.0f, iMediaSession, i3);
                break;
            case 6:
                this.f17086i.lambda$seekToNextMediaItem$49(iMediaSession, i3);
                break;
            case 7:
                this.f17086i.lambda$decreaseDeviceVolume$70(iMediaSession, i3);
                break;
            case 8:
                this.f17086i.lambda$seekForward$13(iMediaSession, i3);
                break;
            case 9:
                this.f17086i.lambda$seekToDefaultPosition$8(iMediaSession, i3);
                break;
            case 10:
                this.f17086i.lambda$seekToPreviousMediaItem$48(iMediaSession, i3);
                break;
            case 11:
                this.f17086i.lambda$seekToPrevious$50(iMediaSession, i3);
                break;
            case 12:
                this.f17086i.lambda$seekToNext$51(iMediaSession, i3);
                break;
            case 13:
                this.f17086i.lambda$clearMediaItems$42(iMediaSession, i3);
                break;
            case 14:
                this.f17086i.lambda$seekBack$12(iMediaSession, i3);
                break;
            case 15:
                this.f17086i.lambda$pause$6(iMediaSession, i3);
                break;
            case 16:
                this.f17086i.lambda$increaseDeviceVolume$66(iMediaSession, i3);
                break;
            case 17:
            default:
                this.f17086i.lambda$prepare$7(iMediaSession, i3);
                break;
            case 18:
                this.f17086i.lambda$play$5(iMediaSession, i3);
                break;
            case 19:
                this.f17086i.lambda$stop$2(iMediaSession, i3);
                break;
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(java.lang.Object obj, androidx.media3.common.FlagSet flagSet) {
        this.f17086i.lambda$new$0((androidx.media3.common.Player.Listener) obj, flagSet);
    }
}
