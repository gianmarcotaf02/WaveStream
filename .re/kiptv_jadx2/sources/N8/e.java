package N8;

import M8.C0682j;
import M8.K;
import M8.r;
import java.io.IOException;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class e extends r {

    public final long f7482i;
    public final boolean j;

    public long f7483k;

    public e(K k9, long j, boolean z6) {
        super(k9);
        this.f7482i = j;
        this.j = z6;
    }

    @Override
    public final long m(long j, C0682j sink) throws IOException {
        m.e(sink, "sink");
        long j9 = this.f7483k;
        long j10 = this.f7482i;
        if (j9 > j10) {
            j = 0;
        } else if (this.j) {
            long j11 = j10 - j9;
            if (j11 == 0) {
                return -1L;
            }
            j = Math.min(j, j11);
        }
        long jM = super.m(j, sink);
        if (jM != -1) {
            this.f7483k += jM;
        }
        long j12 = this.f7483k;
        if ((j12 >= j10 || jM != -1) && j12 <= j10) {
            return jM;
        }
        if (jM > 0 && j12 > j10) {
            long j13 = sink.f7260i - (j12 - j10);
            C0682j c0682j = new C0682j();
            c0682j.M(sink);
            sink.J(j13, c0682j);
            c0682j.C(c0682j.f7260i);
        }
        StringBuilder sbU = p.u(j10, "expected ", " bytes but got ");
        sbU.append(this.f7483k);
        throw new IOException(sbU.toString());
    }
}
