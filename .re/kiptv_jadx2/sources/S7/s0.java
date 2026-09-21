package S7;

import java.util.concurrent.CancellationException;

public final class s0 extends p100l6.a implements InterfaceC0891h0 {

    public static final s0 f9618h = new s0(C0889g0.f9584h);

    @Override
    public final O N(boolean z6, boolean z9, p194x6.j jVar) {
        return t0.f9621h;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final N7.m b() {
        return N7.g.f7442a;
    }

    @Override
    public final boolean isActive() {
        return true;
    }

    @Override
    public final boolean isCancelled() {
        return false;
    }

    @Override
    public final O j(p194x6.j jVar) {
        return t0.f9621h;
    }

    @Override
    public final boolean start() {
        return false;
    }

    @Override
    public final CancellationException t() {
        throw new IllegalStateException("This job is always active");
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override
    public final InterfaceC0898n v(p0 p0Var) {
        return t0.f9621h;
    }

    @Override
    public final Object z(p100l6.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override
    public final void e(CancellationException cancellationException) {
    }
}
