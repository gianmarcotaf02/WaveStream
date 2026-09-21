package B4;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

public final class u implements o4.j {

    public final p207z4.a f733a;

    public final int f734b;

    public u(p207z4.a aVar, int i3) throws InvalidAlgorithmParameterException {
        this.f733a = aVar;
        this.f734b = i3;
        if (i3 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.d(new byte[0], i3);
    }

    @Override
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override
    public final byte[] b(byte[] bArr) {
        return this.f733a.d(bArr, this.f734b);
    }
}
