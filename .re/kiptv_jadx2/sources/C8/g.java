package C8;

import M8.C0682j;
import java.io.IOException;
import kotlin.jvm.internal.m;

public final class g extends b {

    public boolean f1632k;

    @Override
    public final void close() {
        if (this.f1620i) {
            return;
        }
        if (!this.f1632k) {
            b();
        }
        this.f1620i = true;
    }

    @Override
    public final long m(long j, C0682j sink) throws IOException {
        m.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(B2.a.j(j, "byteCount < 0: ").toString());
        }
        if (this.f1620i) {
            throw new IllegalStateException("closed");
        }
        if (this.f1632k) {
            return -1L;
        }
        long jM = super.m(j, sink);
        if (jM != -1) {
            return jM;
        }
        this.f1632k = true;
        b();
        return -1L;
    }
}
