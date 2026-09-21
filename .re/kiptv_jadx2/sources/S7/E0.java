package S7;

public final class E0 extends AbstractC0906w {

    public static final E0 f9540i = new E0();

    @Override
    public final void V(p100l6.h hVar, Runnable runnable) {
        I0 i3 = (I0) hVar.get(I0.f9545i);
        if (i3 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        i3.f9546h = true;
    }

    @Override
    public final AbstractC0906w Y(int i3) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
