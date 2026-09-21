package Z7;

import S7.AbstractC0906w;
import S7.Y;
import X7.s;
import java.util.concurrent.Executor;

public final class d extends Y implements Executor {

    public static final d f13044i = new d();
    public static final AbstractC0906w j;

    static {
        l lVar = l.f13055i;
        int i3 = s.f10935a;
        if (64 >= i3) {
            i3 = 64;
        }
        j = lVar.Y(X7.a.l(i3, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override
    public final void V(p100l6.h hVar, Runnable runnable) {
        j.V(hVar, runnable);
    }

    @Override
    public final void W(p100l6.h hVar, Runnable runnable) {
        j.W(hVar, runnable);
    }

    @Override
    public final AbstractC0906w Y(int i3) {
        return l.f13055i.Y(i3);
    }

    @Override
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override
    public final void execute(Runnable runnable) {
        V(p100l6.i.f24820h, runnable);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}
