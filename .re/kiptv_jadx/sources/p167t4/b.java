package p167t4;

/* JADX INFO: loaded from: classes.dex */
public final class b implements o4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1.l f27784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q2.i f27785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q2.i f27786c;

    public b(j1.l lVar) {
        this.f27784a = lVar;
        boolean zIsEmpty = ((p200y4.a) lVar.f23900k).f31884a.isEmpty();
        q2.i iVar = p179v4.p.f29184a;
        if (zIsEmpty) {
            this.f27785b = iVar;
            this.f27786c = iVar;
            return;
        }
        p179v4.f fVar = (p179v4.f) p179v4.g.f29164b.f29166a.get();
        fVar = fVar == null ? p179v4.g.f29165c : fVar;
        p179v4.p.a(lVar);
        fVar.getClass();
        this.f27785b = iVar;
        this.f27786c = iVar;
    }

    @Override // o4.c
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        q2.i iVar = this.f27785b;
        j1.l lVar = this.f27784a;
        try {
            byte[] bArr3 = ((o4.k) lVar.j).f26125c;
            byte[] bArrC = B4.k.c(bArr3 == null ? null : java.util.Arrays.copyOf(bArr3, bArr3.length), ((o4.c) ((o4.k) lVar.j).f26124b).a(bArr, bArr2));
            int i3 = ((o4.k) lVar.j).f26128f;
            iVar.getClass();
            return bArrC;
        } catch (java.security.GeneralSecurityException e6) {
            iVar.getClass();
            throw e6;
        }
    }

    @Override // o4.c
    public final byte[] b(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        j1.l lVar = this.f27784a;
        q2.i iVar = this.f27786c;
        if (length > 5) {
            byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, 5, bArr.length);
            java.util.Iterator it = lVar.p(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrB = ((o4.c) ((o4.k) it.next()).f26124b).b(bArrCopyOfRange, bArr2);
                    iVar.getClass();
                    return bArrB;
                } catch (java.security.GeneralSecurityException e6) {
                    p167t4.c.f27787a.info("ciphertext prefix matches a key, but cannot decrypt: " + e6);
                }
            }
        }
        java.util.Iterator it2 = lVar.p(o4.b.f26111a).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrB2 = ((o4.c) ((o4.k) it2.next()).f26124b).b(bArr, bArr2);
                iVar.getClass();
                return bArrB2;
            } catch (java.security.GeneralSecurityException unused) {
            }
        }
        iVar.getClass();
        throw new java.security.GeneralSecurityException("decryption failed");
    }
}
