package Y4;

/* JADX INFO: loaded from: classes.dex */
public abstract class N1 extends java.lang.Exception {
    public final java.lang.String a() {
        if (equals(Y4.G1.f11611h)) {
            return "trakt.error.notConfigured";
        }
        if (equals(Y4.L1.f11659h)) {
            return "trakt.error.unauthorized";
        }
        if (equals(Y4.E1.f11580h)) {
            return "trakt.watchlistFull";
        }
        if (this instanceof Y4.J1) {
            return "trakt.error.rateLimited";
        }
        if (equals(Y4.I1.f11627h)) {
            return "trakt.linkWaiting";
        }
        if (equals(Y4.B1.f11544h)) {
            return "trakt.linkExpired";
        }
        if (equals(Y4.A1.f11538h)) {
            return "trakt.linkDenied";
        }
        return this instanceof Y4.F1 ? "trakt.error.network" : "trakt.error.generic";
    }

    public final boolean b() {
        return (this instanceof Y4.F1) || (this instanceof Y4.K1) || (this instanceof Y4.J1);
    }
}
