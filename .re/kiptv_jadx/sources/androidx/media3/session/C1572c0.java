package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1572c0 implements androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaControllerImplLegacy f16997i;
    public final /* synthetic */ androidx.media3.session.MediaControllerImplLegacy.ControllerInfo j;

    public /* synthetic */ C1572c0(androidx.media3.session.MediaControllerImplLegacy mediaControllerImplLegacy, androidx.media3.session.MediaControllerImplLegacy.ControllerInfo controllerInfo, int i3) {
        this.f16996h = i3;
        this.f16997i = mediaControllerImplLegacy;
        this.j = controllerInfo;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.f16996h) {
            case 0:
                this.f16997i.lambda$updateControllerInfo$26(this.j, (androidx.media3.session.MediaController.Listener) obj);
                break;
            case 1:
                this.f16997i.lambda$updateControllerInfo$27(this.j, (androidx.media3.session.MediaController.Listener) obj);
                break;
            case 2:
                this.f16997i.lambda$updateControllerInfo$28(this.j, (androidx.media3.session.MediaController.Listener) obj);
                break;
            default:
                this.f16997i.lambda$updateControllerInfo$6(this.j, (androidx.media3.session.MediaController.Listener) obj);
                break;
        }
    }
}
