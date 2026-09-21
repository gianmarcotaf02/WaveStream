package x8;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.m;

public final class a implements ThreadFactory {

    public final String f31714a;

    public final boolean f31715b;

    public a(String str, boolean z6) {
        this.f31714a = str;
        this.f31715b = z6;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        String name = this.f31714a;
        m.e(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f31715b);
        return thread;
    }
}
