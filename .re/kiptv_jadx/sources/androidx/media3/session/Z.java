package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Z implements android.os.Handler.Callback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16974i;

    public /* synthetic */ Z(int i3, java.lang.Object obj) {
        this.f16973h = i3;
        this.f16974i = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        switch (this.f16973h) {
            case 0:
                return ((androidx.media3.session.MediaControllerImplBase.FlushCommandQueueHandler) this.f16974i).handleMessage(message);
            default:
                return ((androidx.media3.session.MediaControllerImplLegacy.ControllerCompatCallback) this.f16974i).lambda$new$0(message);
        }
    }
}
