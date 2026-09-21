package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements p068h4.v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.common.SimpleBasePlayer.State f16412i;
    public final /* synthetic */ boolean j;

    public /* synthetic */ g(androidx.media3.common.SimpleBasePlayer.State state, boolean z6, int i3) {
        this.f16411h = i3;
        this.f16412i = state;
        this.j = z6;
    }

    @Override // p068h4.v
    public final java.lang.Object get() {
        switch (this.f16411h) {
            case 0:
                return androidx.media3.common.SimpleBasePlayer.lambda$setPlayWhenReady$1(this.f16412i, this.j);
            case 1:
                return androidx.media3.common.SimpleBasePlayer.lambda$setShuffleModeEnabled$9(this.f16412i, this.j);
            case 2:
                return androidx.media3.common.SimpleBasePlayer.lambda$setDeviceMuted$30(this.f16412i, this.j);
            default:
                return androidx.media3.common.SimpleBasePlayer.lambda$setDeviceMuted$31(this.f16412i, this.j);
        }
    }
}
