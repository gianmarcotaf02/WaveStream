package B4;

/* JADX INFO: loaded from: classes.dex */
public final class n implements o4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B4.r f718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o4.j f719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f720c;

    public n(B4.r rVar, o4.j jVar, int i3) {
        this.f718a = rVar;
        this.f719b = jVar;
        this.f720c = i3;
    }

    @Override // o4.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        B4.b bVar = (B4.b) this.f718a;
        bVar.getClass();
        int length = bArr.length;
        int i3 = bVar.f681b;
        int i9 = androidx.media3.common.util.Log.LOG_LEVEL_OFF - i3;
        if (length > i9) {
            throw new java.security.GeneralSecurityException(com.google.android.gms.internal.play_billing.M0.l(i9, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i3];
        byte[] bArrA = B4.v.a(i3);
        java.lang.System.arraycopy(bArrA, 0, bArr3, 0, i3);
        bVar.a(bArr, 0, bArr.length, bArr3, bVar.f681b, bArrA, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return B4.k.c(bArr3, this.f719b.b(B4.k.c(bArr2, bArr3, java.util.Arrays.copyOf(java.nio.ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // o4.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        int i3 = this.f720c;
        if (length < i3) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, 0, bArr.length - i3);
        byte[] bArrCopyOfRange2 = java.util.Arrays.copyOfRange(bArr, bArr.length - i3, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f719b.a(bArrCopyOfRange2, B4.k.c(bArr2, bArrCopyOfRange, java.util.Arrays.copyOf(java.nio.ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        B4.b bVar = (B4.b) this.f718a;
        bVar.getClass();
        int length2 = bArrCopyOfRange.length;
        int i9 = bVar.f681b;
        if (length2 < i9) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr3 = new byte[i9];
        java.lang.System.arraycopy(bArrCopyOfRange, 0, bArr3, 0, i9);
        int length3 = bArrCopyOfRange.length;
        int i10 = bVar.f681b;
        byte[] bArr4 = new byte[length3 - i10];
        bVar.a(bArrCopyOfRange, i10, bArrCopyOfRange.length - i10, bArr4, 0, bArr3, false);
        return bArr4;
    }
}
