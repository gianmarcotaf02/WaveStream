package S7;

import java.util.concurrent.locks.LockSupport;

public final class C0886f extends AbstractC0876a {

    public final Thread f9579k;

    public final X f9580l;

    public C0886f(p100l6.h hVar, Thread thread, X x9) {
        super(hVar, true, true);
        this.f9579k = thread;
        this.f9580l = x9;
    }

    @Override
    public final void f(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f9579k;
        if (kotlin.jvm.internal.m.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
