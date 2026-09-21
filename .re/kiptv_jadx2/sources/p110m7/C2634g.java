package p110m7;

import io.ktor.network.sockets.DatagramKt;

public final class C2634g {

    public final AbstractC2629b f25485a;

    public final int f25486b;

    public C2634g(int i3, AbstractC2629b abstractC2629b) {
        this.f25485a = abstractC2629b;
        this.f25486b = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2634g)) {
            return false;
        }
        C2634g c2634g = (C2634g) obj;
        return this.f25485a == c2634g.f25485a && this.f25486b == c2634g.f25486b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f25485a) * DatagramKt.MAX_DATAGRAM_SIZE) + this.f25486b;
    }
}
