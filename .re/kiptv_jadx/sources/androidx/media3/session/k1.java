package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17064h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17065i;

    public /* synthetic */ k1(int i3, java.lang.Object obj) {
        this.f17064h = i3;
        this.f17065i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17064h) {
            case 0:
                ((androidx.media3.session.SequencedFutureManager) this.f17065i).release();
                break;
            case 1:
                ((androidx.media3.session.MediaController) this.f17065i).release();
                break;
            case 2:
                ((androidx.media3.session.MediaSessionService) this.f17065i).lambda$onForegroundServiceStartNotAllowedException$5();
                break;
            default:
                ((android.os.HandlerThread) this.f17065i).quit();
                break;
        }
    }
}
