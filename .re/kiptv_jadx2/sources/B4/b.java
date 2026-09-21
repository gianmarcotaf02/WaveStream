package B4;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class b implements r {

    public static final a f679d = new a(0);

    public final SecretKeySpec f680a;

    public final int f681b;

    public final int f682c;

    public b(byte[] bArr, int i3) throws GeneralSecurityException {
        if (!p121o0.p.b(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        w.a(bArr.length);
        this.f680a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f679d.get()).getBlockSize();
        this.f682c = blockSize;
        if (i3 < 12 || i3 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f681b = i3;
    }

    public final void a(byte[] bArr, int i3, int i9, byte[] bArr2, int i10, byte[] bArr3, boolean z6) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f679d.get();
        byte[] bArr4 = new byte[this.f682c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f681b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f680a;
        if (z6) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i3, i9, bArr2, i10) != i9) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
