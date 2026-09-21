package C7;

import io.ktor.sse.ServerSentEventKt;

public abstract class P {
    public abstract b0 a();

    public abstract AbstractC0191x b();

    public abstract boolean c();

    public abstract P d(D7.f fVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p2 = (P) obj;
        return c() == p2.c() && a() == p2.a() && b().equals(p2.b());
    }

    public final int hashCode() {
        int iHashCode = a().hashCode();
        if (Y.l(b())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (c() ? 17 : b().hashCode());
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (a() == b0.j) {
            return b().toString();
        }
        return a() + ServerSentEventKt.SPACE + b();
    }
}
