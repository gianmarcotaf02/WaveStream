package androidx.media3.common;

import p068h4.v;

public final class i implements v {

    public final int f16415h;

    public final SimpleBasePlayer.State f16416i;
    public final int j;

    public i(SimpleBasePlayer.State state, int i3, int i9) {
        this.f16415h = i9;
        this.f16416i = state;
        this.j = i3;
    }

    @Override
    public final Object get() {
        switch (this.f16415h) {
            case 0:
                return SimpleBasePlayer.lambda$setDeviceVolume$24(this.f16416i, this.j);
            case 1:
                return SimpleBasePlayer.lambda$setDeviceVolume$25(this.f16416i, this.j);
            default:
                return SimpleBasePlayer.lambda$setRepeatMode$8(this.f16416i, this.j);
        }
    }
}
