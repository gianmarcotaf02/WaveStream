package p085j5;

/* JADX INFO: renamed from: j5.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2526p implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f24208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f24209i;

    public /* synthetic */ C2526p(long j, int i3) {
        this.f24208h = i3;
        this.f24209i = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f24208h) {
            case 0:
                dev.jdtech.mpv.MPVLib.setPropertyDouble("audio-delay", java.lang.Double.valueOf(this.f24209i / 1000.0d));
                break;
            case 1:
                dev.jdtech.mpv.MPVLib.command(new java.lang.String[]{"seek", java.lang.String.valueOf(this.f24209i / 1000.0d), "absolute+keyframes"});
                break;
            case 2:
                dev.jdtech.mpv.MPVLib.setPropertyDouble("sub-delay", java.lang.Double.valueOf(this.f24209i / 1000.0d));
                break;
            default:
                dev.jdtech.mpv.MPVLib.command(new java.lang.String[]{"seek", java.lang.String.valueOf(this.f24209i / 1000.0d), "absolute"});
                break;
        }
        return p070h6.A.f22523a;
    }
}
