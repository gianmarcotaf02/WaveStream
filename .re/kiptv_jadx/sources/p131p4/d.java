package p131p4;

/* JADX INFO: loaded from: classes.dex */
public final class d implements o4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1.l f26190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q2.i f26191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q2.i f26192c;

    public d(j1.l lVar) {
        this.f26190a = lVar;
        boolean zIsEmpty = ((p200y4.a) lVar.f23900k).f31884a.isEmpty();
        q2.i iVar = p179v4.p.f29184a;
        if (zIsEmpty) {
            this.f26191b = iVar;
            this.f26192c = iVar;
            return;
        }
        p179v4.f fVar = (p179v4.f) p179v4.g.f29164b.f29166a.get();
        fVar = fVar == null ? p179v4.g.f29165c : fVar;
        p179v4.p.a(lVar);
        fVar.getClass();
        this.f26191b = iVar;
        this.f26192c = iVar;
    }

    @Override // o4.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        q2.i iVar = this.f26191b;
        j1.l lVar = this.f26190a;
        try {
            byte[] bArr3 = ((o4.k) lVar.j).f26125c;
            byte[] bArrC = B4.k.c(bArr3 == null ? null : java.util.Arrays.copyOf(bArr3, bArr3.length), ((o4.a) ((o4.k) lVar.j).f26124b).a(bArr, bArr2));
            int i3 = ((o4.k) lVar.j).f26128f;
            int length = bArr.length;
            iVar.getClass();
            return bArrC;
        } catch (java.security.GeneralSecurityException e6) {
            iVar.getClass();
            throw e6;
        }
    }

    @Override // o4.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        j1.l lVar = this.f26190a;
        q2.i iVar = this.f26192c;
        if (length > 5) {
            byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, 5, bArr.length);
            java.util.Iterator it = lVar.p(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrB = ((o4.a) ((o4.k) it.next()).f26124b).b(bArrCopyOfRange, bArr2);
                    iVar.getClass();
                    return bArrB;
                } catch (java.security.GeneralSecurityException e6) {
                    p131p4.e.f26193a.info("ciphertext prefix matches a key, but cannot decrypt: " + e6);
                }
            }
        }
        java.util.Iterator it2 = lVar.p(o4.b.f26111a).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrB2 = ((o4.a) ((o4.k) it2.next()).f26124b).b(bArr, bArr2);
                iVar.getClass();
                return bArrB2;
            } catch (java.security.GeneralSecurityException unused) {
            }
        }
        iVar.getClass();
        throw new java.security.GeneralSecurityException("decryption failed");
    }
}
