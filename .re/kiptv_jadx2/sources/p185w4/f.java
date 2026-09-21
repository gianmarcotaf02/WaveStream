package p185w4;

import A4.r0;
import java.security.GeneralSecurityException;
import p179v4.a;
import p179v4.b;
import p179v4.j;
import p179v4.k;
import p179v4.t;

public abstract class f {

    public static final k f29974a;

    public static final j f29975b;

    public static final b f29976c;

    public static final a f29977d;

    static {
        C4.a aVarB = t.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f29974a = new k(e.class);
        f29975b = new j(aVarB);
        f29976c = new b(a.class);
        f29977d = new a(aVarB, new io.sentry.protocol.a(14));
    }

    public static d a(r0 r0Var) throws GeneralSecurityException {
        int iOrdinal = r0Var.ordinal();
        if (iOrdinal == 1) {
            return d.f29958c;
        }
        if (iOrdinal == 2) {
            return d.f29960e;
        }
        if (iOrdinal == 3) {
            return d.f29961f;
        }
        if (iOrdinal == 4) {
            return d.f29959d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
    }
}
