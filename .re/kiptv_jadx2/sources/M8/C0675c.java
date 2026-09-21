package M8;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

public final class C0675c extends Thread {

    public final int f7240h = 0;

    public C0675c(String str) {
        super(str);
    }

    @Override
    public final void run() {
        switch (this.f7240h) {
            case 0:
                break;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock = C0678f.f7245h;
                ReentrantLock reentrantLock2 = C0678f.f7245h;
                reentrantLock2.lock();
                try {
                    C0678f c0678fG = B3.o.g();
                    if (c0678fG == C0678f.f7248l) {
                        C0678f.f7248l = null;
                        return;
                    } else {
                        reentrantLock2.unlock();
                        if (c0678fG != null) {
                            c0678fG.k();
                        }
                    }
                } finally {
                    reentrantLock2.unlock();
                }
            } catch (InterruptedException unused2) {
            }
        }
    }

    public C0675c(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
