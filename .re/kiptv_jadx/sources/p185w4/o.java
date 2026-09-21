package p185w4;

/* JADX INFO: loaded from: classes.dex */
public final class o implements o4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1.l f29989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q2.i f29990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q2.i f29991c;

    public o(j1.l lVar) {
        this.f29989a = lVar;
        boolean zIsEmpty = ((p200y4.a) lVar.f23900k).f31884a.isEmpty();
        q2.i iVar = p179v4.p.f29184a;
        if (zIsEmpty) {
            this.f29990b = iVar;
            this.f29991c = iVar;
            return;
        }
        p179v4.f fVar = (p179v4.f) p179v4.g.f29164b.f29166a.get();
        fVar = fVar == null ? p179v4.g.f29165c : fVar;
        p179v4.p.a(lVar);
        fVar.getClass();
        this.f29990b = iVar;
        this.f29991c = iVar;
    }

    @Override // o4.j
    public final void a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        q2.i iVar = this.f29991c;
        if (length <= 5) {
            iVar.getClass();
            throw new java.security.GeneralSecurityException("tag too short");
        }
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, 5, bArr.length);
        j1.l lVar = this.f29989a;
        for (o4.k kVar : lVar.p(bArrCopyOf)) {
            try {
                ((o4.j) kVar.f26124b).a(bArrCopyOfRange, kVar.f26127e.equals(A4.r0.LEGACY) ? B4.k.c(bArr2, p185w4.p.f29993b) : bArr2);
                iVar.getClass();
                return;
            } catch (java.security.GeneralSecurityException e6) {
                p185w4.p.f29992a.info("tag prefix matches a key, but cannot verify: " + e6);
            }
        }
        java.util.Iterator it = lVar.p(o4.b.f26111a).iterator();
        while (it.hasNext()) {
            try {
                ((o4.j) ((o4.k) it.next()).f26124b).a(bArr, bArr2);
                iVar.getClass();
                return;
            } catch (java.security.GeneralSecurityException unused) {
            }
        }
        iVar.getClass();
        throw new java.security.GeneralSecurityException("invalid MAC");
    }

    @Override // o4.j
    public final byte[] b(byte[] bArr) throws java.security.GeneralSecurityException {
        q2.i iVar = this.f29990b;
        j1.l lVar = this.f29989a;
        if (((o4.k) lVar.j).f26127e.equals(A4.r0.LEGACY)) {
            bArr = B4.k.c(bArr, p185w4.p.f29993b);
        }
        try {
            byte[] bArr2 = ((o4.k) lVar.j).f26125c;
            byte[] bArrC = B4.k.c(bArr2 == null ? null : java.util.Arrays.copyOf(bArr2, bArr2.length), ((o4.j) ((o4.k) lVar.j).f26124b).b(bArr));
            int i3 = ((o4.k) lVar.j).f26128f;
            iVar.getClass();
            return bArrC;
        } catch (java.security.GeneralSecurityException e6) {
            iVar.getClass();
            throw e6;
        }
    }
}
