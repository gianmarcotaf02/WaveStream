package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1591m implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17074i;

    public /* synthetic */ ExecutorC1591m(int i3, java.lang.Object obj) {
        this.f17073h = i3;
        this.f17074i = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        switch (this.f17073h) {
            case 0:
                ((androidx.media3.session.MediaControllerHolder) this.f17074i).lambda$setController$1(runnable);
                break;
            case 1:
                ((androidx.media3.session.MediaLibrarySessionImpl) this.f17074i).postOrRunOnApplicationHandler(runnable);
                break;
            case 2:
                ((androidx.media3.session.MediaNotificationManager) this.f17074i).lambda$new$0(runnable);
                break;
            default:
                ((androidx.media3.session.MediaSessionImpl) this.f17074i).postOrRunOnApplicationHandler(runnable);
                break;
        }
    }
}
