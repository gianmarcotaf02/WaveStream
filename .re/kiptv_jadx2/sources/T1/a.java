package T1;

import java.util.concurrent.ThreadFactory;

public final class a implements ThreadFactory {

    public final String f9675a;

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f9675a);
        thread.setPriority(10);
        return thread;
    }
}
