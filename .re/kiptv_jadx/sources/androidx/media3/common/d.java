package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p068h4.v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.common.SimpleBasePlayer.State f16405i;

    public /* synthetic */ d(androidx.media3.common.SimpleBasePlayer.State state, int i3) {
        this.f16404h = i3;
        this.f16405i = state;
    }

    @Override // p068h4.v
    public final java.lang.Object get() {
        switch (this.f16404h) {
            case 0:
                return androidx.media3.common.SimpleBasePlayer.lambda$unmute$18(this.f16405i);
            case 1:
                return androidx.media3.common.SimpleBasePlayer.lambda$mute$17(this.f16405i);
            case 2:
                return androidx.media3.common.SimpleBasePlayer.lambda$setVideoSurface$19(this.f16405i);
            case 3:
                return androidx.media3.common.SimpleBasePlayer.lambda$increaseDeviceVolume$27(this.f16405i);
            case 4:
                return androidx.media3.common.SimpleBasePlayer.lambda$decreaseDeviceVolume$28(this.f16405i);
            case 5:
                return androidx.media3.common.SimpleBasePlayer.lambda$release$13(this.f16405i);
            case 6:
                return androidx.media3.common.SimpleBasePlayer.lambda$clearVideoOutput$23(this.f16405i);
            case 7:
                return androidx.media3.common.SimpleBasePlayer.lambda$increaseDeviceVolume$26(this.f16405i);
            case 8:
                return androidx.media3.common.SimpleBasePlayer.lambda$prepare$7(this.f16405i);
            default:
                return androidx.media3.common.SimpleBasePlayer.lambda$decreaseDeviceVolume$29(this.f16405i);
        }
    }
}
