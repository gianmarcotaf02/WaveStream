package S2;

/* JADX INFO: loaded from: classes.dex */
public final class b implements S2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final S7.InterfaceC0891h0 f9212h;

    public /* synthetic */ b(S7.InterfaceC0891h0 interfaceC0891h0) {
        this.f9212h = interfaceC0891h0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof S2.b) {
            return kotlin.jvm.internal.m.a(this.f9212h, ((S2.b) obj).f9212h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9212h.hashCode();
    }

    public final java.lang.String toString() {
        return "BaseRequestDelegate(job=" + this.f9212h + ')';
    }
}
