package G2;

import S7.AbstractC0906w;
import S7.M;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p100l6.h;

public final class e extends AbstractC0906w {

    public static final AtomicIntegerFieldUpdater f3779k = AtomicIntegerFieldUpdater.newUpdater(e.class, "j");

    public final AbstractC0906w f3780i;
    public volatile int j = 1;

    public e(AbstractC0906w abstractC0906w) {
        this.f3780i = abstractC0906w;
    }

    @Override
    public final void V(h hVar, Runnable runnable) {
        Z().V(hVar, runnable);
    }

    @Override
    public final void W(h hVar, Runnable runnable) {
        Z().W(hVar, runnable);
    }

    @Override
    public final boolean X(h hVar) {
        return Z().X(hVar);
    }

    @Override
    public final AbstractC0906w Y(int i3) {
        return Z().Y(i3);
    }

    public final AbstractC0906w Z() {
        return f3779k.get(this) == 1 ? M.f9550b : this.f3780i;
    }

    @Override
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.f3780i + ')';
    }
}
