package p185w4;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p179v4.k f29985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p179v4.j f29986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p179v4.b f29987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p179v4.a f29988d;

    static {
        C4.a aVarB = p179v4.t.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f29985a = new p179v4.k(p185w4.k.class);
        f29986b = new p179v4.j(aVarB);
        f29987c = new p179v4.b(p185w4.j.class);
        f29988d = new p179v4.a(aVarB, new io.sentry.protocol.a(16));
    }

    public static p185w4.d a(A4.O o8) throws java.security.GeneralSecurityException {
        int iOrdinal = o8.ordinal();
        if (iOrdinal == 1) {
            return p185w4.d.g;
        }
        if (iOrdinal == 2) {
            return p185w4.d.j;
        }
        if (iOrdinal == 3) {
            return p185w4.d.f29963i;
        }
        if (iOrdinal == 4) {
            return p185w4.d.f29964k;
        }
        if (iOrdinal == 5) {
            return p185w4.d.f29962h;
        }
        throw new java.security.GeneralSecurityException("Unable to parse HashType: " + o8.a());
    }

    public static p185w4.d b(A4.r0 r0Var) throws java.security.GeneralSecurityException {
        int iOrdinal = r0Var.ordinal();
        if (iOrdinal == 1) {
            return p185w4.d.f29965l;
        }
        if (iOrdinal == 2) {
            return p185w4.d.f29967n;
        }
        if (iOrdinal == 3) {
            return p185w4.d.f29968o;
        }
        if (iOrdinal == 4) {
            return p185w4.d.f29966m;
        }
        throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
    }
}
