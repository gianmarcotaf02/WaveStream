package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1605t implements androidx.media3.common.util.ListenerSet.Event, androidx.media3.session.MediaControllerStub.ControllerTask, androidx.media3.session.MediaSessionImpl.RemoteControllerTask, androidx.media3.session.MediaSessionStub.MediaItemsWithStartPositionPlayerTask, androidx.media3.common.util.Consumer, androidx.media3.session.MediaSessionStub.MediaItemPlayerTask, androidx.media3.session.DefaultMediaNotificationProvider.NotificationIdProvider {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17110h;

    public /* synthetic */ C1605t(int i3) {
        this.f17110h = i3;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        androidx.media3.session.PlayerWrapper playerWrapper = (androidx.media3.session.PlayerWrapper) obj;
        switch (this.f17110h) {
            case 6:
                playerWrapper.mute();
                break;
            case 7:
                playerWrapper.pause();
                break;
            case 8:
                playerWrapper.seekToNextMediaItem();
                break;
            case 9:
                playerWrapper.increaseDeviceVolume();
                break;
            case 10:
                playerWrapper.seekBack();
                break;
            case 11:
                playerWrapper.seekToPrevious();
                break;
            case 12:
                playerWrapper.seekToPreviousMediaItem();
                break;
            case 13:
                playerWrapper.seekForward();
                break;
            case 14:
                playerWrapper.decreaseDeviceVolume();
                break;
            case 15:
                playerWrapper.seekToNext();
                break;
            case 16:
            case 18:
            default:
                playerWrapper.clearMediaItems();
                break;
            case 17:
                playerWrapper.seekToDefaultPosition();
                break;
            case 19:
                playerWrapper.stop();
                break;
            case 20:
                playerWrapper.unmute();
                break;
            case 21:
                playerWrapper.prepare();
                break;
        }
    }

    @Override // androidx.media3.session.DefaultMediaNotificationProvider.NotificationIdProvider
    public int getNotificationId(androidx.media3.session.MediaSession mediaSession) {
        switch (this.f17110h) {
            case 23:
                return androidx.media3.session.DefaultMediaNotificationProvider.lambda$new$0(mediaSession);
            default:
                return androidx.media3.session.DefaultMediaNotificationProvider.Builder.lambda$new$0(mediaSession);
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        androidx.media3.common.Player.Listener listener = (androidx.media3.common.Player.Listener) obj;
        switch (this.f17110h) {
            case 0:
                listener.onVolumeChanged(0.0f);
                break;
            default:
                listener.onPlaybackStateChanged(1);
                break;
        }
    }

    @Override // androidx.media3.session.MediaControllerStub.ControllerTask
    public void run(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
        switch (this.f17110h) {
            case 2:
                mediaControllerImplBase.onRenderedFirstFrame();
                break;
            default:
                androidx.media3.session.MediaControllerStub.lambda$onDisconnected$1(mediaControllerImplBase);
                break;
        }
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i3) {
        controllerCb.onRenderedFirstFrame(i3);
    }

    @Override // androidx.media3.session.MediaSessionStub.MediaItemPlayerTask
    public void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List list) {
        switch (this.f17110h) {
            case 16:
                playerWrapper.addMediaItems(list);
                break;
            default:
                playerWrapper.addMediaItems(list);
                break;
        }
    }

    @Override // androidx.media3.session.MediaSessionStub.MediaItemsWithStartPositionPlayerTask
    public void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition) {
        androidx.media3.session.MediaUtils.setMediaItemsWithStartIndexAndPosition(playerWrapper, mediaItemsWithStartPosition);
    }
}
