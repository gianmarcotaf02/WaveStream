package p155s1;

import com.google.common.util.concurrent.J;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class k implements J {

    public final WeakReference f27251h;

    public final j f27252i = new j(this);

    public k(h hVar) {
        this.f27251h = new WeakReference(hVar);
    }

    @Override
    public final void addListener(Runnable runnable, Executor executor) {
        this.f27252i.addListener(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z6) {
        h hVar = (h) this.f27251h.get();
        boolean zCancel = this.f27252i.cancel(z6);
        if (zCancel && hVar != null) {
            hVar.f27246a = null;
            hVar.f27247b = null;
            hVar.f27248c.j(null);
        }
        return zCancel;
    }

    @Override
    public final Object get() {
        return this.f27252i.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f27252i.f27244h instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f27252i.isDone();
    }

    public final String toString() {
        return this.f27252i.toString();
    }

    @Override
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f27252i.get(j, timeUnit);
    }
}
