package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16842i;

    public /* synthetic */ w(int i3, int i9) {
        this.f16841h = i9;
        this.f16842i = i3;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        switch (this.f16841h) {
            case 0:
                ((androidx.media3.common.Player.Listener) obj).onRepeatModeChanged(this.f16842i);
                break;
            default:
                ((androidx.media3.common.Player.Listener) obj).onAudioSessionIdChanged(this.f16842i);
                break;
        }
    }
}
