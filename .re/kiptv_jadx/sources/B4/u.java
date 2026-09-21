package B4;

/* JADX INFO: loaded from: classes.dex */
public final class u implements o4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p207z4.a f733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f734b;

    public u(p207z4.a aVar, int i3) throws java.security.InvalidAlgorithmParameterException {
        this.f733a = aVar;
        this.f734b = i3;
        if (i3 < 10) {
            throw new java.security.InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.d(new byte[0], i3);
    }

    @Override // o4.j
    public final void a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (!java.security.MessageDigest.isEqual(b(bArr2), bArr)) {
            throw new java.security.GeneralSecurityException("invalid MAC");
        }
    }

    @Override // o4.j
    public final byte[] b(byte[] bArr) {
        return this.f733a.d(bArr, this.f734b);
    }
}
