package p110m7;

/* JADX INFO: renamed from: m7.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2634g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p110m7.AbstractC2629b f25485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25486b;

    public C2634g(int i3, p110m7.AbstractC2629b abstractC2629b) {
        this.f25485a = abstractC2629b;
        this.f25486b = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p110m7.C2634g)) {
            return false;
        }
        p110m7.C2634g c2634g = (p110m7.C2634g) obj;
        return this.f25485a == c2634g.f25485a && this.f25486b == c2634g.f25486b;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.f25485a) * io.ktor.network.sockets.DatagramKt.MAX_DATAGRAM_SIZE) + this.f25486b;
    }
}
