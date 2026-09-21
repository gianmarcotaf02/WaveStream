package Y4;

public abstract class N1 extends Exception {
    public final String a() {
        if (equals(G1.f11611h)) {
            return "trakt.error.notConfigured";
        }
        if (equals(L1.f11659h)) {
            return "trakt.error.unauthorized";
        }
        if (equals(E1.f11580h)) {
            return "trakt.watchlistFull";
        }
        if (this instanceof J1) {
            return "trakt.error.rateLimited";
        }
        if (equals(I1.f11627h)) {
            return "trakt.linkWaiting";
        }
        if (equals(B1.f11544h)) {
            return "trakt.linkExpired";
        }
        if (equals(A1.f11538h)) {
            return "trakt.linkDenied";
        }
        return this instanceof F1 ? "trakt.error.network" : "trakt.error.generic";
    }

    public final boolean b() {
        return (this instanceof F1) || (this instanceof K1) || (this instanceof J1);
    }
}
