package androidx.media3.common;

import p068h4.v;

public final class d implements v {

    public final int f16404h;

    public final SimpleBasePlayer.State f16405i;

    public d(SimpleBasePlayer.State state, int i3) {
        this.f16404h = i3;
        this.f16405i = state;
    }

    @Override
    public final Object get() {
        switch (this.f16404h) {
            case 0:
                return SimpleBasePlayer.lambda$unmute$18(this.f16405i);
            case 1:
                return SimpleBasePlayer.lambda$mute$17(this.f16405i);
            case 2:
                return SimpleBasePlayer.lambda$setVideoSurface$19(this.f16405i);
            case 3:
                return SimpleBasePlayer.lambda$increaseDeviceVolume$27(this.f16405i);
            case 4:
                return SimpleBasePlayer.lambda$decreaseDeviceVolume$28(this.f16405i);
            case 5:
                return SimpleBasePlayer.lambda$release$13(this.f16405i);
            case 6:
                return SimpleBasePlayer.lambda$clearVideoOutput$23(this.f16405i);
            case 7:
                return SimpleBasePlayer.lambda$increaseDeviceVolume$26(this.f16405i);
            case 8:
                return SimpleBasePlayer.lambda$prepare$7(this.f16405i);
            default:
                return SimpleBasePlayer.lambda$decreaseDeviceVolume$29(this.f16405i);
        }
    }
}
