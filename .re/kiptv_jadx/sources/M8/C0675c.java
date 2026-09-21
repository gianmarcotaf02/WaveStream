package M8;

/* JADX INFO: renamed from: M8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0675c extends java.lang.Thread {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7240h = 0;

    public /* synthetic */ C0675c(java.lang.String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f7240h) {
            case 0:
                break;
            default:
                android.os.Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (java.lang.InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                java.util.concurrent.locks.ReentrantLock reentrantLock = M8.C0678f.f7245h;
                java.util.concurrent.locks.ReentrantLock reentrantLock2 = M8.C0678f.f7245h;
                reentrantLock2.lock();
                try {
                    M8.C0678f c0678fG = B3.o.g();
                    if (c0678fG == M8.C0678f.f7248l) {
                        M8.C0678f.f7248l = null;
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
            } catch (java.lang.InterruptedException unused2) {
            }
        }
    }

    public /* synthetic */ C0675c(java.lang.ThreadGroup threadGroup, java.lang.String str) {
        super(threadGroup, str);
    }
}
