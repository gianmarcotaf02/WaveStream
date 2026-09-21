package Y2;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class F implements ThreadFactory {

    public final ThreadFactory f11375a;

    public final AtomicInteger f11376b;

    public F(C1033c c1033c) {
        Objects.requireNonNull(c1033c);
        this.f11375a = Executors.defaultThreadFactory();
        this.f11376b = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f11376b;
        Thread threadNewThread = this.f11375a.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
