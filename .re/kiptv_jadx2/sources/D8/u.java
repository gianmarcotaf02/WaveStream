package D8;

import M8.C0678f;
import io.sentry.ProfilingTraceData;
import java.net.SocketTimeoutException;

public final class u extends C0678f {

    public final v f2590m;

    public u(v vVar) {
        this.f2590m = vVar;
    }

    @Override
    public final void k() {
        this.f2590m.e(9);
        n nVar = this.f2590m.f2592b;
        synchronized (nVar) {
            long j = nVar.f2562u;
            long j9 = nVar.f2561t;
            if (j < j9) {
                return;
            }
            nVar.f2561t = j9 + 1;
            nVar.f2563v = System.nanoTime() + ((long) 1000000000);
            nVar.f2556o.c(new A8.p(Y6.f.m(new StringBuilder(), nVar.j, " ping"), 1, nVar), 0L);
        }
    }

    public final void l() {
        if (j()) {
            throw new SocketTimeoutException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
        }
    }
}
