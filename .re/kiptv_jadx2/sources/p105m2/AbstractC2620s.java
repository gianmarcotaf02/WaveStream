package p105m2;

import java.util.ArrayList;
import java.util.concurrent.Executor;

public abstract class AbstractC2620s extends AbstractC2621t {

    public final Object f25358a = new Object();

    public Executor f25359b;

    public C2604b f25360c;

    public C2617o f25361d;

    public ArrayList f25362e;

    public final void j(C2617o c2617o, ArrayList arrayList) {
        if (c2617o == null) {
            throw new NullPointerException("groupRoute must not be null");
        }
        synchronized (this.f25358a) {
            try {
                try {
                    Executor executor = this.f25359b;
                    if (executor != null) {
                        executor.execute(new RunnableC2619q(this, this.f25360c, c2617o, arrayList, 1));
                    } else {
                        this.f25361d = c2617o;
                        this.f25362e = new ArrayList(arrayList);
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
