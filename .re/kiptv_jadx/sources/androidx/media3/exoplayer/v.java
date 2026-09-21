package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f16816i;

    public /* synthetic */ v(long j, int i3) {
        this.f16815h = i3;
        this.f16816i = j;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        switch (this.f16815h) {
            case 0:
                ((androidx.media3.common.Player.Listener) obj).onSeekBackIncrementChanged(this.f16816i);
                break;
            case 1:
                ((androidx.media3.common.Player.Listener) obj).onMaxSeekToPreviousPositionChanged(this.f16816i);
                break;
            default:
                ((androidx.media3.common.Player.Listener) obj).onSeekForwardIncrementChanged(this.f16816i);
                break;
        }
    }
}
