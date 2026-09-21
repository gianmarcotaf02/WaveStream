package S7;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends p100l6.a implements S7.InterfaceC0891h0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final S7.s0 f9618h = new S7.s0(S7.C0889g0.f9584h);

    @Override // S7.InterfaceC0891h0
    public final S7.O N(boolean z6, boolean z9, p194x6.j jVar) {
        return S7.t0.f9621h;
    }

    @Override // S7.InterfaceC0891h0
    public final boolean P() {
        return false;
    }

    @Override // S7.InterfaceC0891h0
    public final N7.m b() {
        return N7.g.f7442a;
    }

    @Override // S7.InterfaceC0891h0
    public final boolean isActive() {
        return true;
    }

    @Override // S7.InterfaceC0891h0
    public final boolean isCancelled() {
        return false;
    }

    @Override // S7.InterfaceC0891h0
    public final S7.O j(p194x6.j jVar) {
        return S7.t0.f9621h;
    }

    @Override // S7.InterfaceC0891h0
    public final boolean start() {
        return false;
    }

    @Override // S7.InterfaceC0891h0
    public final java.util.concurrent.CancellationException t() {
        throw new java.lang.IllegalStateException("This job is always active");
    }

    public final java.lang.String toString() {
        return "NonCancellable";
    }

    @Override // S7.InterfaceC0891h0
    public final S7.InterfaceC0898n v(S7.p0 p0Var) {
        return S7.t0.f9621h;
    }

    @Override // S7.InterfaceC0891h0
    public final java.lang.Object z(p100l6.c cVar) {
        throw new java.lang.UnsupportedOperationException("This job is always active");
    }

    @Override // S7.InterfaceC0891h0
    public final void e(java.util.concurrent.CancellationException cancellationException) {
    }
}
