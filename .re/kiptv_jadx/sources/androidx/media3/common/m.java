package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16428i;

    public /* synthetic */ m(int i3, java.lang.Object obj) {
        this.f16427h = i3;
        this.f16428i = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final java.lang.Runnable runnable) {
        switch (this.f16427h) {
            case 0:
                ((androidx.media3.common.SimpleBasePlayer) this.f16428i).postOrRunOnApplicationHandler(runnable);
                break;
            case 1:
                ((android.view.Choreographer) this.f16428i).postFrameCallback(new android.view.Choreographer.FrameCallback() { // from class: g1.B
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        runnable.run();
                    }
                });
                break;
            default:
                ((p105m2.HandlerC2605c) this.f16428i).post(runnable);
                break;
        }
    }
}
