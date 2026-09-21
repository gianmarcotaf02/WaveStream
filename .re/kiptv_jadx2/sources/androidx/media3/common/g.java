package androidx.media3.common;

import p068h4.v;

public final class g implements v {

    public final int f16411h;

    public final SimpleBasePlayer.State f16412i;
    public final boolean j;

    public g(SimpleBasePlayer.State state, boolean z6, int i3) {
        this.f16411h = i3;
        this.f16412i = state;
        this.j = z6;
    }

    @Override
    public final Object get() {
        switch (this.f16411h) {
            case 0:
                return SimpleBasePlayer.lambda$setPlayWhenReady$1(this.f16412i, this.j);
            case 1:
                return SimpleBasePlayer.lambda$setShuffleModeEnabled$9(this.f16412i, this.j);
            case 2:
                return SimpleBasePlayer.lambda$setDeviceMuted$30(this.f16412i, this.j);
            default:
                return SimpleBasePlayer.lambda$setDeviceMuted$31(this.f16412i, this.j);
        }
    }
}
