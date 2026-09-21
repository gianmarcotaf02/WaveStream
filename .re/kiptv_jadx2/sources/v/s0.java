package v;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

public final class s0 {

    public final AtomicReference f29011a = new AtomicReference(null);

    public final p028c8.d f29012b = new p028c8.d();

    public static final void a(s0 s0Var, p0 p0Var) {
        while (true) {
            AtomicReference atomicReference = s0Var.f29011a;
            p0 p0Var2 = (p0) atomicReference.get();
            if (p0Var2 != null && p0Var.f28981a.compareTo(p0Var2.f28981a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(p0Var2, p0Var)) {
                    if (p0Var2 != null) {
                        p0Var2.f28982b.e(new o0("Mutation interrupted", 0));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == p0Var2);
        }
    }
}
