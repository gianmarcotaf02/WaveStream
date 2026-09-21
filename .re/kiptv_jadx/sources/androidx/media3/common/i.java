package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements p068h4.v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.common.SimpleBasePlayer.State f16416i;
    public final /* synthetic */ int j;

    public /* synthetic */ i(androidx.media3.common.SimpleBasePlayer.State state, int i3, int i9) {
        this.f16415h = i9;
        this.f16416i = state;
        this.j = i3;
    }

    @Override // p068h4.v
    public final java.lang.Object get() {
        switch (this.f16415h) {
            case 0:
                return androidx.media3.common.SimpleBasePlayer.lambda$setDeviceVolume$24(this.f16416i, this.j);
            case 1:
                return androidx.media3.common.SimpleBasePlayer.lambda$setDeviceVolume$25(this.f16416i, this.j);
            default:
                return androidx.media3.common.SimpleBasePlayer.lambda$setRepeatMode$8(this.f16416i, this.j);
        }
    }
}
