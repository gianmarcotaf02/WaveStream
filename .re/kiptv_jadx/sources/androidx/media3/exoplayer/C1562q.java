package androidx.media3.exoplayer;

/* JADX INFO: renamed from: androidx.media3.exoplayer.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1562q implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f16712i;

    public /* synthetic */ C1562q(boolean z6, int i3) {
        this.f16711h = i3;
        this.f16712i = z6;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        switch (this.f16711h) {
            case 0:
                ((androidx.media3.common.Player.Listener) obj).onSkipSilenceEnabledChanged(this.f16712i);
                break;
            case 1:
                ((androidx.media3.common.Player.Listener) obj).onShuffleModeEnabledChanged(this.f16712i);
                break;
            default:
                ((androidx.media3.common.Player.Listener) obj).onSkipSilenceEnabledChanged(this.f16712i);
                break;
        }
    }
}
