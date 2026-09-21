package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16603h;

    public /* synthetic */ k(int i3) {
        this.f16603h = i3;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        switch (this.f16603h) {
            case 0:
                ((androidx.media3.exoplayer.audio.AudioOutput.Listener) obj).onUnderrun();
                break;
            case 1:
                ((androidx.media3.exoplayer.audio.AudioOutput.Listener) obj).onReleased();
                break;
            case 2:
                ((androidx.media3.exoplayer.audio.AudioOutput.Listener) obj).onOffloadDataRequest();
                break;
            case 3:
                ((androidx.media3.exoplayer.audio.AudioOutput.Listener) obj).onOffloadPresentationEnded();
                break;
            default:
                ((androidx.media3.exoplayer.audio.AudioOutputProvider.Listener) obj).onFormatSupportChanged();
                break;
        }
    }
}
