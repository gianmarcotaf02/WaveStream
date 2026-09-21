package p140q4;

import R0.AbstractC0815c;
import androidx.datastore.preferences.protobuf.AbstractC1503j;
import java.security.GeneralSecurityException;
import p121o0.p;

public final class d extends AbstractC0815c {

    public final int f26631c;

    public d(byte[] bArr, int i3) throws GeneralSecurityException {
        this.f26631c = i3;
        if (!p.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f8882a = m(bArr, 1);
        this.f8883b = m(bArr, 0);
    }

    @Override
    public final AbstractC1503j m(byte[] bArr, int i3) {
        switch (this.f26631c) {
            case 0:
                return new c(bArr, i3, 0);
            default:
                return new c(bArr, i3, 1);
        }
    }
}
