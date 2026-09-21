package S7;

/* JADX INFO: loaded from: classes4.dex */
public final class E0 extends S7.AbstractC0906w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final S7.E0 f9540i = new S7.E0();

    @Override // S7.AbstractC0906w
    public final void V(p100l6.h hVar, java.lang.Runnable runnable) {
        S7.I0 i3 = (S7.I0) hVar.get(S7.I0.f9545i);
        if (i3 == null) {
            throw new java.lang.UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        i3.f9546h = true;
    }

    @Override // S7.AbstractC0906w
    public final S7.AbstractC0906w Y(int i3) {
        throw new java.lang.UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // S7.AbstractC0906w
    public final java.lang.String toString() {
        return "Dispatchers.Unconfined";
    }
}
