package w8;

/* JADX INFO: loaded from: classes4.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w8.C3021a f30500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.net.Proxy f30501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.net.InetSocketAddress f30502c;

    public E(w8.C3021a c3021a, java.net.Proxy proxy, java.net.InetSocketAddress socketAddress) {
        kotlin.jvm.internal.m.e(socketAddress, "socketAddress");
        this.f30500a = c3021a;
        this.f30501b = proxy;
        this.f30502c = socketAddress;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof w8.E)) {
            return false;
        }
        w8.E e6 = (w8.E) obj;
        return kotlin.jvm.internal.m.a(e6.f30500a, this.f30500a) && kotlin.jvm.internal.m.a(e6.f30501b, this.f30501b) && kotlin.jvm.internal.m.a(e6.f30502c, this.f30502c);
    }

    public final int hashCode() {
        return this.f30502c.hashCode() + ((this.f30501b.hashCode() + ((this.f30500a.hashCode() + 527) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "Route{" + this.f30502c + '}';
    }
}
