package p131p4;

/* JADX INFO: loaded from: classes.dex */
public final class w extends p131p4.b {
    public static p131p4.w b(p131p4.j jVar, A.a aVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        p131p4.j jVar2 = p131p4.j.f26211q;
        if (jVar != jVar2 && num == null) {
            throw new java.security.GeneralSecurityException("For given Variant " + jVar + " the value of idRequirement must be non-null");
        }
        if (jVar == jVar2 && num != null) {
            throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        C4.a aVar2 = (C4.a) aVar.f9i;
        if (aVar2.f889a.length != 32) {
            throw new java.security.GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + aVar2.f889a.length);
        }
        if (jVar == jVar2) {
            C4.a.a(new byte[0]);
        } else if (jVar == p131p4.j.f26210p) {
            C4.a.a(java.nio.ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (jVar != p131p4.j.f26209o) {
                throw new java.lang.IllegalStateException("Unknown Variant: " + jVar);
            }
            C4.a.a(java.nio.ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new p131p4.w();
    }
}
