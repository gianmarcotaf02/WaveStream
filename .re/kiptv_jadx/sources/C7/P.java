package C7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class P {
    public abstract C7.b0 a();

    public abstract C7.AbstractC0191x b();

    public abstract boolean c();

    public abstract C7.P d(D7.f fVar);

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7.P)) {
            return false;
        }
        C7.P p2 = (C7.P) obj;
        return c() == p2.c() && a() == p2.a() && b().equals(p2.b());
    }

    public final int hashCode() {
        int iHashCode = a().hashCode();
        if (C7.Y.l(b())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (c() ? 17 : b().hashCode());
    }

    public final java.lang.String toString() {
        if (c()) {
            return "*";
        }
        if (a() == C7.b0.j) {
            return b().toString();
        }
        return a() + io.ktor.sse.ServerSentEventKt.SPACE + b();
    }
}
