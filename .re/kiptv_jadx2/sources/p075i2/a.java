package p075i2;

import V3.b;
import Z3.d;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a implements Runnable {

    public static final ThreadPoolExecutor f22750o;

    public static d f22751p;

    public static volatile ThreadPoolExecutor f22752q;

    public final b f22753h;

    public final c f22754i;
    public volatile int j = 1;

    public final AtomicBoolean f22755k = new AtomicBoolean();

    public final AtomicBoolean f22756l = new AtomicBoolean();

    public final CountDownLatch f22757m;

    public final p166t3.d f22758n;

    static {
        b bVar = new b(0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), bVar);
        f22750o = threadPoolExecutor;
        f22752q = threadPoolExecutor;
    }

    public a(p166t3.d dVar) {
        this.f22758n = dVar;
        b bVar = new b(3, this);
        this.f22753h = bVar;
        this.f22754i = new c(this, bVar);
        this.f22757m = new CountDownLatch(1);
    }

    public final void a(Object obj) {
        d dVar;
        synchronized (a.class) {
            try {
                if (f22751p == null) {
                    f22751p = new d(Looper.getMainLooper(), 4, false);
                }
                dVar = f22751p;
            } catch (Throwable th) {
                throw th;
            }
        }
        dVar.obtainMessage(1, new d(this, obj)).sendToTarget();
    }

    @Override
    public final void run() {
        this.f22758n.c();
    }
}
