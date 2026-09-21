package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements androidx.media3.common.util.ListenerSet.Event, androidx.media3.common.util.ListenerSet.IterationFinishedEvent, androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdateListener, androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener, androidx.media3.exoplayer.SuitableOutputChecker.Callback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.ExoPlayerImpl f16844i;

    public /* synthetic */ x(androidx.media3.exoplayer.ExoPlayerImpl exoPlayerImpl, int i3) {
        this.f16843h = i3;
        this.f16844i = exoPlayerImpl;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        switch (this.f16843h) {
            case 0:
                this.f16844i.lambda$setPlaylistMetadata$11((androidx.media3.common.Player.Listener) obj);
                break;
            default:
                this.f16844i.lambda$updateAvailableCommands$31((androidx.media3.common.Player.Listener) obj);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdateListener
    public void onPlaybackInfoUpdate(androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        this.f16844i.lambda$new$2(playbackInfoUpdate);
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker.Callback
    public void onSelectedOutputSuitabilityChanged(boolean z6) {
        this.f16844i.onSelectedOutputSuitabilityChanged(z6);
    }

    @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
    public void onStateChanged(java.lang.Object obj, java.lang.Object obj2) {
        this.f16844i.onAudioSessionIdChanged(((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(java.lang.Object obj, androidx.media3.common.FlagSet flagSet) {
        this.f16844i.lambda$new$0((androidx.media3.common.Player.Listener) obj, flagSet);
    }
}
