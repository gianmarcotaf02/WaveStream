package S7;

/* JADX INFO: loaded from: classes4.dex */
public final class Q implements S7.InterfaceC0881c0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9554h;

    public Q(boolean z6) {
        this.f9554h = z6;
    }

    @Override // S7.InterfaceC0881c0
    public final S7.r0 a() {
        return null;
    }

    @Override // S7.InterfaceC0881c0
    public final boolean isActive() {
        return this.f9554h;
    }

    public final java.lang.String toString() {
        return Y6.f.l(new java.lang.StringBuilder("Empty{"), this.f9554h ? "Active" : "New", '}');
    }
}
