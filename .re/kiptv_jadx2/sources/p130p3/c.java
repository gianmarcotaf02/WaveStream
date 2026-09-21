package p130p3;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class c extends Thread {

    public final WeakReference f26187h;

    public final long f26188i;
    public final CountDownLatch j = new CountDownLatch(1);

    public boolean f26189k = false;

    public c(a aVar, long j) {
        this.f26187h = new WeakReference(aVar);
        this.f26188i = j;
        start();
    }

    @Override
    public final void run() {
        a aVar;
        WeakReference weakReference = this.f26187h;
        try {
            if (this.j.await(this.f26188i, TimeUnit.MILLISECONDS) || (aVar = (a) weakReference.get()) == null) {
                return;
            }
            aVar.c();
            this.f26189k = true;
        } catch (InterruptedException unused) {
            a aVar2 = (a) weakReference.get();
            if (aVar2 != null) {
                aVar2.c();
                this.f26189k = true;
            }
        }
    }
}
