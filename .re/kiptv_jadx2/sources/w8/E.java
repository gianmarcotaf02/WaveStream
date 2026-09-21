package w8;

import java.net.InetSocketAddress;
import java.net.Proxy;

public final class E {

    public final C3021a f30500a;

    public final Proxy f30501b;

    public final InetSocketAddress f30502c;

    public E(C3021a c3021a, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.m.e(socketAddress, "socketAddress");
        this.f30500a = c3021a;
        this.f30501b = proxy;
        this.f30502c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof E)) {
            return false;
        }
        E e6 = (E) obj;
        return kotlin.jvm.internal.m.a(e6.f30500a, this.f30500a) && kotlin.jvm.internal.m.a(e6.f30501b, this.f30501b) && kotlin.jvm.internal.m.a(e6.f30502c, this.f30502c);
    }

    public final int hashCode() {
        return this.f30502c.hashCode() + ((this.f30501b.hashCode() + ((this.f30500a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f30502c + '}';
    }
}
