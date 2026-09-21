package p147r2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26816h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f26817i;

    public /* synthetic */ e(android.content.Context context, int i3) {
        this.f26816h = i3;
        this.f26817i = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26816h) {
            case 0:
                new java.util.concurrent.ThreadPoolExecutor(0, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue()).execute(new p147r2.e(this.f26817i, 1));
                break;
            default:
                p147r2.c.t(this.f26817i, new androidx.media3.exoplayer.dash.offline.a(), p147r2.c.f26806a, false);
                break;
        }
    }
}
