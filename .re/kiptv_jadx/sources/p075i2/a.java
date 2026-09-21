package p075i2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final java.util.concurrent.ThreadPoolExecutor f22750o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Z3.d f22751p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile java.util.concurrent.ThreadPoolExecutor f22752q;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V3.b f22753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p075i2.c f22754i;
    public volatile int j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f22755k = new java.util.concurrent.atomic.AtomicBoolean();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f22756l = new java.util.concurrent.atomic.AtomicBoolean();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f22757m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p166t3.d f22758n;

    static {
        p075i2.b bVar = new p075i2.b(0);
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(5, 128, 1L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(10), bVar);
        f22750o = threadPoolExecutor;
        f22752q = threadPoolExecutor;
    }

    public a(p166t3.d dVar) {
        this.f22758n = dVar;
        V3.b bVar = new V3.b(3, this);
        this.f22753h = bVar;
        this.f22754i = new p075i2.c(this, bVar);
        this.f22757m = new java.util.concurrent.CountDownLatch(1);
    }

    public final void a(java.lang.Object obj) {
        Z3.d dVar;
        synchronized (p075i2.a.class) {
            try {
                if (f22751p == null) {
                    f22751p = new Z3.d(android.os.Looper.getMainLooper(), 4, false);
                }
                dVar = f22751p;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        dVar.obtainMessage(1, new p075i2.d(this, obj)).sendToTarget();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22758n.c();
    }
}
