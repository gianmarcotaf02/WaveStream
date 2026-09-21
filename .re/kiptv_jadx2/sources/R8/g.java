package R8;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public final class g implements P8.a {

    public volatile boolean f9092a = false;

    public final ConcurrentHashMap f9093b = new ConcurrentHashMap();

    public final LinkedBlockingQueue f9094c = new LinkedBlockingQueue();

    @Override
    public final synchronized P8.b a(String str) {
        f fVar;
        fVar = (f) this.f9093b.get(str);
        if (fVar == null) {
            fVar = new f(str, this.f9094c, this.f9092a);
            this.f9093b.put(str, fVar);
        }
        return fVar;
    }
}
