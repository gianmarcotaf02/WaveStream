package O2;

/* JADX INFO: loaded from: classes.dex */
public final class v implements java.lang.AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M8.InterfaceC0684l f7949h;

    @Override // java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.f7949h.close();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof O2.v) {
            return kotlin.jvm.internal.m.a(this.f7949h, ((O2.v) obj).f7949h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7949h.hashCode();
    }

    public final java.lang.String toString() {
        return "SourceResponseBody(source=" + this.f7949h + ')';
    }
}
