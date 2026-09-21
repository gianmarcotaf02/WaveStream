package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements androidx.media3.common.util.ListenerSet.Event, p106m3.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16409i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16410k;

    public /* synthetic */ f(androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i3) {
        this.f16408h = 0;
        this.f16409i = i3;
        this.j = positionInfo;
        this.f16410k = positionInfo2;
    }

    @Override // p106m3.b
    public java.lang.Object c() {
        ((k3.i) this.j).f24462d.a((p041e3.i) this.f16410k, this.f16409i + 1, false);
        return null;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        switch (this.f16408h) {
            case 0:
                androidx.media3.common.SimpleBasePlayer.lambda$updateStateAndInformListeners$35(this.f16409i, (androidx.media3.common.Player.PositionInfo) this.j, (androidx.media3.common.Player.PositionInfo) this.f16410k, (androidx.media3.common.Player.Listener) obj);
                break;
            default:
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onMediaItemTransition((androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime) this.j, (androidx.media3.common.MediaItem) this.f16410k, this.f16409i);
                break;
        }
    }

    public /* synthetic */ f(java.lang.Object obj, java.lang.Object obj2, int i3, int i9) {
        this.f16408h = i9;
        this.j = obj;
        this.f16410k = obj2;
        this.f16409i = i3;
    }
}
