package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E0 implements androidx.media3.session.MediaSessionImpl.RemoteControllerTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.SessionCommand f16882i;
    public final /* synthetic */ android.os.Bundle j;

    public /* synthetic */ E0(int i3, androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) {
        this.f16881h = i3;
        this.f16882i = sessionCommand;
        this.j = bundle;
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i3) {
        switch (this.f16881h) {
            case 0:
                controllerCb.sendCustomCommand(i3, this.f16882i, this.j);
                break;
            default:
                controllerCb.sendCustomCommand(i3, this.f16882i, this.j);
                break;
        }
    }
}
