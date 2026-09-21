package p131p4;

import A.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class w extends b {
    public static w b(j jVar, a aVar, Integer num) throws GeneralSecurityException {
        j jVar2 = j.f26211q;
        if (jVar != jVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + jVar + " the value of idRequirement must be non-null");
        }
        if (jVar == jVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        C4.a aVar2 = (C4.a) aVar.f9i;
        if (aVar2.f889a.length != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + aVar2.f889a.length);
        }
        if (jVar == jVar2) {
            C4.a.a(new byte[0]);
        } else if (jVar == j.f26210p) {
            C4.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (jVar != j.f26209o) {
                throw new IllegalStateException("Unknown Variant: " + jVar);
            }
            C4.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new w();
    }
}
