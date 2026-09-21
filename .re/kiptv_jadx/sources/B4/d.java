package B4;

/* JADX INFO: loaded from: classes.dex */
public final class d implements o4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f690b;

    public d(byte[] bArr, int i3) throws java.security.GeneralSecurityException {
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
                    throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                }
                this.f690b = new p140q4.b(bArr);
                return;
        }
    }

    @Override // o4.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        switch (this.f689a) {
            case 0:
                byte[] bArrA = B4.v.a(12);
                p140q4.b bVar = (p140q4.b) this.f690b;
                bVar.getClass();
                if (bArrA.length != 12) {
                    throw new java.security.GeneralSecurityException("iv is wrong size");
                }
                if (bArr.length > 2147483619) {
                    throw new java.security.GeneralSecurityException("plaintext too long");
                }
                boolean z6 = bVar.f26629b;
                byte[] bArr3 = new byte[z6 ? bArr.length + 28 : bArr.length + 16];
                if (z6) {
                    java.lang.System.arraycopy(bArrA, 0, bArr3, 0, 12);
                }
                java.security.spec.AlgorithmParameterSpec algorithmParameterSpecA = p140q4.b.a(bArrA);
                B4.a aVar = p140q4.b.f26627c;
                ((javax.crypto.Cipher) aVar.get()).init(1, bVar.f26628a, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    ((javax.crypto.Cipher) aVar.get()).updateAAD(bArr2);
                }
                int iDoFinal = ((javax.crypto.Cipher) aVar.get()).doFinal(bArr, 0, bArr.length, bArr3, z6 ? 12 : 0);
                if (iDoFinal == bArr.length + 16) {
                    return bArr3;
                }
                throw new java.security.GeneralSecurityException(Y6.f.f(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
            case 1:
                java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrA2 = B4.v.a(12);
                byteBufferAllocate.put(bArrA2);
                ((p140q4.d) this.f690b).f(byteBufferAllocate, bArrA2, bArr, bArr2);
                return byteBufferAllocate.array();
            default:
                java.nio.ByteBuffer byteBufferAllocate2 = java.nio.ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrA3 = B4.v.a(24);
                byteBufferAllocate2.put(bArrA3);
                ((p140q4.d) this.f690b).f(byteBufferAllocate2, bArrA3, bArr, bArr2);
                return byteBufferAllocate2.array();
        }
    }

    @Override // o4.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        switch (this.f689a) {
            case 0:
                byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, 12);
                p140q4.b bVar = (p140q4.b) this.f690b;
                bVar.getClass();
                if (bArrCopyOf.length != 12) {
                    throw new java.security.GeneralSecurityException("iv is wrong size");
                }
                boolean z6 = bVar.f26629b;
                if (bArr.length < (z6 ? 28 : 16)) {
                    throw new java.security.GeneralSecurityException("ciphertext too short");
                }
                if (z6 && !java.nio.ByteBuffer.wrap(bArrCopyOf).equals(java.nio.ByteBuffer.wrap(bArr, 0, 12))) {
                    throw new java.security.GeneralSecurityException("iv does not match prepended iv");
                }
                java.security.spec.AlgorithmParameterSpec algorithmParameterSpecA = p140q4.b.a(bArrCopyOf);
                B4.a aVar = p140q4.b.f26627c;
                ((javax.crypto.Cipher) aVar.get()).init(2, bVar.f26628a, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    ((javax.crypto.Cipher) aVar.get()).updateAAD(bArr2);
                }
                int i3 = z6 ? 12 : 0;
                int length = bArr.length;
                if (z6) {
                    length -= 12;
                }
                return ((javax.crypto.Cipher) aVar.get()).doFinal(bArr, i3, length);
            case 1:
                if (bArr.length < 28) {
                    throw new java.security.GeneralSecurityException("ciphertext too short");
                }
                return ((p140q4.d) this.f690b).e(java.nio.ByteBuffer.wrap(bArr, 12, bArr.length - 12), java.util.Arrays.copyOf(bArr, 12), bArr2);
            default:
                if (bArr.length < 40) {
                    throw new java.security.GeneralSecurityException("ciphertext too short");
                }
                return ((p140q4.d) this.f690b).e(java.nio.ByteBuffer.wrap(bArr, 24, bArr.length - 24), java.util.Arrays.copyOf(bArr, 24), bArr2);
        }
    }
}
