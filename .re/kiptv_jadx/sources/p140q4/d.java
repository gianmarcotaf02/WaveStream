package p140q4;

/* JADX INFO: loaded from: classes.dex */
public final class d extends R0.AbstractC0815c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26631c;

    public d(byte[] bArr, int i3) throws java.security.GeneralSecurityException {
        this.f26631c = i3;
        if (!p121o0.p.a(1)) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f8882a = m(bArr, 1);
        this.f8883b = m(bArr, 0);
    }

    @Override // R0.AbstractC0815c
    public final androidx.datastore.preferences.protobuf.AbstractC1503j m(byte[] bArr, int i3) {
        switch (this.f26631c) {
            case 0:
                return new p140q4.c(bArr, i3, 0);
            default:
                return new p140q4.c(bArr, i3, 1);
        }
    }
}
