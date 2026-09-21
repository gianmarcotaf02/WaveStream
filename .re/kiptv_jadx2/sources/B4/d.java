package B4;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;

public final class d implements o4.a {

    public final int f689a;

    public final Object f690b;

    public d(byte[] bArr, int i3) throws GeneralSecurityException {
        this.f689a = i3;
        switch (i3) {
            case 1:
                this.f690b = new p140q4.d(bArr, 0);
                return;
            case 2:
                this.f690b = new p140q4.d(bArr, 1);
                return;
            default:
                if (!p121o0.p.b(2)) {
                    throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                }
                this.f690b = new p140q4.b(bArr);
                return;
        }
    }

    @Override
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f689a) {
            case 0:
                byte[] bArrA = v.a(12);
                p140q4.b bVar = (p140q4.b) this.f690b;
                bVar.getClass();
                if (bArrA.length != 12) {
                    throw new GeneralSecurityException("iv is wrong size");
                }
                if (bArr.length > 2147483619) {
                    throw new GeneralSecurityException("plaintext too long");
                }
                boolean z6 = bVar.f26629b;
                byte[] bArr3 = new byte[z6 ? bArr.length + 28 : bArr.length + 16];
                if (z6) {
                    System.arraycopy(bArrA, 0, bArr3, 0, 12);
                }
                AlgorithmParameterSpec algorithmParameterSpecA = p140q4.b.a(bArrA);
                a aVar = p140q4.b.f26627c;
                ((Cipher) aVar.get()).init(1, bVar.f26628a, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) aVar.get()).updateAAD(bArr2);
                }
                int iDoFinal = ((Cipher) aVar.get()).doFinal(bArr, 0, bArr.length, bArr3, z6 ? 12 : 0);
                if (iDoFinal == bArr.length + 16) {
                    return bArr3;
                }
                throw new GeneralSecurityException(Y6.f.f(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
            case 1:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrA2 = v.a(12);
                byteBufferAllocate.put(bArrA2);
                ((p140q4.d) this.f690b).f(byteBufferAllocate, bArrA2, bArr, bArr2);
                return byteBufferAllocate.array();
            default:
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrA3 = v.a(24);
                byteBufferAllocate2.put(bArrA3);
                ((p140q4.d) this.f690b).f(byteBufferAllocate2, bArrA3, bArr, bArr2);
                return byteBufferAllocate2.array();
        }
    }

    @Override
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f689a) {
            case 0:
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
                p140q4.b bVar = (p140q4.b) this.f690b;
                bVar.getClass();
                if (bArrCopyOf.length != 12) {
                    throw new GeneralSecurityException("iv is wrong size");
                }
                boolean z6 = bVar.f26629b;
                if (bArr.length < (z6 ? 28 : 16)) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (z6 && !ByteBuffer.wrap(bArrCopyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
                    throw new GeneralSecurityException("iv does not match prepended iv");
                }
                AlgorithmParameterSpec algorithmParameterSpecA = p140q4.b.a(bArrCopyOf);
                a aVar = p140q4.b.f26627c;
                ((Cipher) aVar.get()).init(2, bVar.f26628a, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) aVar.get()).updateAAD(bArr2);
                }
                int i3 = z6 ? 12 : 0;
                int length = bArr.length;
                if (z6) {
                    length -= 12;
                }
                return ((Cipher) aVar.get()).doFinal(bArr, i3, length);
            case 1:
                if (bArr.length < 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return ((p140q4.d) this.f690b).e(ByteBuffer.wrap(bArr, 12, bArr.length - 12), Arrays.copyOf(bArr, 12), bArr2);
            default:
                if (bArr.length < 40) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return ((p140q4.d) this.f690b).e(ByteBuffer.wrap(bArr, 24, bArr.length - 24), Arrays.copyOf(bArr, 24), bArr2);
        }
    }
}
