package Z3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

public class d extends Handler {

    public final int f12985a;

    public d() {
        this.f12985a = 5;
    }

    @Override
    public void handleMessage(Message message) {
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
                Object obj = dVar.f22763b[0];
                if (aVar.f22755k.get()) {
                    CountDownLatch countDownLatch = aVar.f22757m;
                    try {
                        p166t3.d dVar2 = aVar.f22758n;
                        if (dVar2.f27775h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar2.f27775h = null;
                            dVar2.c();
                        }
                        countDownLatch.countDown();
                    } catch (Throwable th) {
                        countDownLatch.countDown();
                        throw th;
                    }
                    break;
                } else {
                    CountDownLatch countDownLatch2 = aVar.f22757m;
                    try {
                        aVar.f22758n.b(aVar, obj);
                        countDownLatch2.countDown();
                    } catch (Throwable th2) {
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

    public d(Looper looper, int i3, boolean z6) {
        super(looper);
        this.f12985a = i3;
    }

    public d(Looper looper, Handler.Callback callback, int i3) {
        super(looper, callback);
        this.f12985a = i3;
    }

    public d(Looper looper, int i3) {
        super(looper);
        this.f12985a = i3;
        switch (i3) {
            case 1:
                super(looper);
                Looper.getMainLooper();
                break;
            case 2:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
