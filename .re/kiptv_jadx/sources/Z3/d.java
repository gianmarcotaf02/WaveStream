package Z3;

/* JADX INFO: loaded from: classes.dex */
public class d extends android.os.Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12985a;

    public /* synthetic */ d() {
        this.f12985a = 5;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        switch (this.f12985a) {
            case 4:
                p075i2.d dVar = (p075i2.d) message.obj;
                int i3 = message.what;
                if (i3 != 1) {
                    if (i3 != 2) {
                        return;
                    }
                    dVar.f22762a.getClass();
                    return;
                }
                p075i2.a aVar = dVar.f22762a;
                java.lang.Object obj = dVar.f22763b[0];
                if (aVar.f22755k.get()) {
                    java.util.concurrent.CountDownLatch countDownLatch = aVar.f22757m;
                    try {
                        p166t3.d dVar2 = aVar.f22758n;
                        if (dVar2.f27775h == aVar) {
                            android.os.SystemClock.uptimeMillis();
                            dVar2.f27775h = null;
                            dVar2.c();
                        }
                        countDownLatch.countDown();
                    } catch (java.lang.Throwable th) {
                        countDownLatch.countDown();
                        throw th;
                    }
                    break;
                } else {
                    java.util.concurrent.CountDownLatch countDownLatch2 = aVar.f22757m;
                    try {
                        aVar.f22758n.b(aVar, obj);
                        countDownLatch2.countDown();
                    } catch (java.lang.Throwable th2) {
                        countDownLatch2.countDown();
                        throw th2;
                    }
                }
                aVar.j = 3;
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(android.os.Looper looper, int i3, boolean z6) {
        super(looper);
        this.f12985a = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(android.os.Looper looper, android.os.Handler.Callback callback, int i3) {
        super(looper, callback);
        this.f12985a = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.os.Looper looper, int i3) {
        super(looper);
        this.f12985a = i3;
        switch (i3) {
            case 1:
                super(looper);
                android.os.Looper.getMainLooper();
                break;
            case 2:
                super(looper);
                android.os.Looper.getMainLooper();
                break;
            default:
                android.os.Looper.getMainLooper();
                break;
        }
    }
}
