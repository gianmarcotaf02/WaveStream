package p075i2;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class b implements ThreadFactory {

    public final int f22759a;

    public final AtomicInteger f22760b;

    public b(int i3) {
        this.f22759a = i3;
        switch (i3) {
            case 1:
                this.f22760b = new AtomicInteger(0);
                break;
            default:
                this.f22760b = new AtomicInteger(1);
                break;
        }
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f22759a) {
            case 0:
                return new Thread(runnable, "ModernAsyncTask #" + this.f22760b.getAndIncrement());
            default:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + this.f22760b.getAndIncrement());
                return thread;
        }
    }
}
