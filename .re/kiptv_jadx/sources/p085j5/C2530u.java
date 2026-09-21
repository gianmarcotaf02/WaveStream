package p085j5;

/* JADX INFO: renamed from: j5.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2530u implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f24218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24219i;

    public /* synthetic */ C2530u(int i3, int i9) {
        this.f24218h = i9;
        this.f24219i = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f24218h) {
            case 0:
                dev.jdtech.mpv.MPVLib.setPropertyInt("sid", java.lang.Integer.valueOf(this.f24219i));
                break;
            default:
                dev.jdtech.mpv.MPVLib.setPropertyInt("aid", java.lang.Integer.valueOf(this.f24219i));
                break;
        }
        return p070h6.A.f22523a;
    }
}
