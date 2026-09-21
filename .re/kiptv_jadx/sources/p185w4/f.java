package p185w4;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p179v4.k f29974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p179v4.j f29975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p179v4.b f29976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p179v4.a f29977d;

    static {
        C4.a aVarB = p179v4.t.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f29974a = new p179v4.k(p185w4.e.class);
        f29975b = new p179v4.j(aVarB);
        f29976c = new p179v4.b(p185w4.a.class);
        f29977d = new p179v4.a(aVarB, new io.sentry.protocol.a(14));
    }

    public static p185w4.d a(A4.r0 r0Var) throws java.security.GeneralSecurityException {
        int iOrdinal = r0Var.ordinal();
        if (iOrdinal == 1) {
            return p185w4.d.f29958c;
        }
        if (iOrdinal == 2) {
            return p185w4.d.f29960e;
        }
        if (iOrdinal == 3) {
            return p185w4.d.f29961f;
        }
        if (iOrdinal == 4) {
            return p185w4.d.f29959d;
        }
        throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
    }
}
