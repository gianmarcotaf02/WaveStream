package p185w4;

import A4.O;
import A4.r0;
import java.security.GeneralSecurityException;
import p179v4.a;
import p179v4.b;
import p179v4.j;
import p179v4.k;
import p179v4.t;

public abstract class l {

    public static final k f29985a;

    public static final j f29986b;

    public static final b f29987c;

    public static final a f29988d;

    static {
        C4.a aVarB = t.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f29985a = new k(k.class);
        f29986b = new j(aVarB);
        f29987c = new b(j.class);
        f29988d = new a(aVarB, new io.sentry.protocol.a(16));
    }

    public static d a(O o8) throws GeneralSecurityException {
        int iOrdinal = o8.ordinal();
        if (iOrdinal == 1) {
            return d.g;
        }
        if (iOrdinal == 2) {
            return d.j;
        }
        if (iOrdinal == 3) {
            return d.f29963i;
        }
        if (iOrdinal == 4) {
            return d.f29964k;
        }
        if (iOrdinal == 5) {
            return d.f29962h;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + o8.a());
    }

    public static d b(r0 r0Var) throws GeneralSecurityException {
        int iOrdinal = r0Var.ordinal();
        if (iOrdinal == 1) {
            return d.f29965l;
        }
        if (iOrdinal == 2) {
            return d.f29967n;
        }
        if (iOrdinal == 3) {
            return d.f29968o;
        }
        if (iOrdinal == 4) {
            return d.f29966m;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
    }
}
